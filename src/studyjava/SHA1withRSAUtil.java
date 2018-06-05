package studyjava;

import java.io.*;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.EncodedKeySpec;
import java.security.spec.PKCS8EncodedKeySpec;

public class SHA1withRSAUtil {


    /**
     * 证书签名
     *
     * @param content 需要签名值
     * @param keyfile 签名私钥路径  生成pem  再生成私钥
     * @return
     */
    public static String sign(String content, String keyfile) throws Exception {
        File file = new File(keyfile); //keyfile key文件的地址
        FileInputStream in;
        in = new FileInputStream(file);
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        byte[] tmpbuf = new byte[1024];
        int count = 0;
        while ((count = in.read(tmpbuf)) != -1) {
            bout.write(tmpbuf, 0, count);
            tmpbuf = new byte[1024];
        }
        in.close();
        // bout.flush();
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        EncodedKeySpec privateKeySpec = new PKCS8EncodedKeySpec(bout.toByteArray());
        RSAPrivateKey privateKey = (RSAPrivateKey) keyFactory.generatePrivate(privateKeySpec);

        Signature dsa = Signature.getInstance("SHA1withRSA"); //采用SHA1withRSA加密
        dsa.initSign(privateKey);
        dsa.update(content.getBytes("UTF-8")); //voucher需要加密的String必须变成byte类型的
        byte[] sig = dsa.sign();
        String rtnValue = new String(BASE64New.encode(sig));
        return rtnValue;
    }

    /**
     * 验证签名
     *
     * @param data            需要签名值byte  注意字符编码
     * @param sign            签名值
     * @param certificatePath 签名证书路径
     * @return
     */
    public static boolean verifySign(byte[] data, String sign, String certificatePath) throws Exception {
        X509Certificate x509Certificate = (X509Certificate) getCertificateByCertPath(certificatePath);
        return verifySign(data, sign, x509Certificate);
    }

    private static boolean verifySign(byte[] data, String sign, X509Certificate x509Certificate) throws Exception {
        PublicKey publicKey = x509Certificate.getPublicKey();
        Signature signature = Signature.getInstance("SHA1withRSA");
        signature.initVerify(publicKey);
        signature.update(data);
        return signature.verify(Base64Util.base64Decoder(sign));
    }

    private static X509Certificate getCertificateByCertPath(String path) throws IOException {
        InputStream inputStream = null;
        try {
            // 实例化证书工厂
            CertificateFactory factory = CertificateFactory.getInstance("X.509");
            // 取得证书文件流
            inputStream = new FileInputStream(path);
            // 生成证书
            java.security.cert.Certificate certificate = factory.generateCertificate(inputStream);
            return (X509Certificate) certificate;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (null != inputStream) {
                inputStream.close();
            }
        }
        return null;
    }

}
