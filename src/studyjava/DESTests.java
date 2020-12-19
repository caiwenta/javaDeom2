package studyjava;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class DESTests {
    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    public void EncryptDESTest()  throws Exception{
        String des = DESEncrypt.encryptDES("shopNo01,orderNo01,100.00,20170706, 91310000631494692T", "12345678");
        System.out.print(des + " ");

        int  dd=11;
    }
}
