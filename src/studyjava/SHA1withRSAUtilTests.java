package studyjava;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SHA1withRSAUtilTests {
    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }


    @Test
    public void verifySignTest() throws Exception {
        String cerPath = "C:\\Users\\CWT\\Desktop\\微信对接1.2.4(1)\\微信对接1.2.4\\20160512.cer";
        String sign = "BBVbg3lLOKUKHoUvne0G2H4wQ7s5cS0pxk1gSm01VdH/8SY7SH/KHvEDw3F8FrJtZPgKig9eHcqeb12bu+k5Hb7Ve5WbwMwC6K1NFdY2XnSUxTXQffm6Zb3TzzDhNd+Ya6pM//9RAsvfFDZh3EDNpNUqwfbyzt/+5wVIviXZOYkMQ3ev1WdfJnkUA6xJtXyb5hYGxb6JFmt9FtokHEidOCWuRsjK6/AM1sSRvrVObvIzO8pyFkB7XmpsrfOJJVeWk/pPmaoDT/R4RGIQQ1N2jPOVvEKUUYYmwxhf3vWas62FAt2HjhY1FWm6MerDwWQME6U80pvmbB/aEZIPXad7FA==";

        String orc2 = "serviceNo=13456&merchantNo=12345678912&terminalNo=111111&shopNo=13456&operNo=12321&orderNo=1980141&systemNo=13456&tradeDate=20160407111111&tradeAmt=12.00&nsrsbh=110109500321654;fptAccount=18025470992;openId=o7I34joFqedCtrBiPMYtOD4WndVc;phone=13049877065;email=272545858@qq.com;project=ce;head=测试";
        boolean flag = SHA1withRSAUtil.verifySign(orc2.getBytes("utf-8"), sign, cerPath);
        System.out.println(flag);
    }
}
