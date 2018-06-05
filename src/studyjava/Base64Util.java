package studyjava;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;

public class Base64Util {
    /**
     * 解码
     * @param requestString
     * @return
     * @throws IOException
     */
    public static byte[] base64Decoder(String requestString) throws IOException{
        return new BASE64Decoder().decodeBuffer(requestString);
    }

    /*
     * 编码
     */
    public static String base64encoder(byte[] bytes) throws IOException{
        BASE64Encoder enc = new BASE64Encoder();
        String encStr =enc.encode(bytes);
        return encStr;
    }
}
