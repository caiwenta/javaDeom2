package studyjava;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.security.Key;

public class DESEncrypt {
    private static final String ALGORITHM_DES = "DES/ECB/PKCS5Padding";
    /**
     * 加密数据
     *
     * @param src 注意：这里的数据长度只能为 8 的倍数第 4 页
     * @param key
     * @return
     * @throws Exception
     */
    public static String encryptDES(String src, String key) throws Exception {
        Key sk = toKey(key.getBytes());
        Cipher cip = Cipher.getInstance(ALGORITHM_DES);
        cip.init(Cipher.ENCRYPT_MODE, sk);
        String dest = java.util.Base64.getEncoder().encodeToString(cip.doFinal(src.getBytes("UTF-8")));
        return dest;
    }
    private static Key toKey(byte[] key) throws Exception {
        DESKeySpec dks = new DESKeySpec(key);
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
        SecretKey secretKey = keyFactory.generateSecret(dks);
        return secretKey;
    }
}
