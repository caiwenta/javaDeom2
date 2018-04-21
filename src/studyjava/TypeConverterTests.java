package studyjava;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TypeConverterTests {
    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }


    @Test
    public void TypeConverterTest() throws ParseException {

        //时间转换
        //String -> Date
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String s = "2018-04-21";
        Date date = formatter.parse(s);

        //Date->String
        SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd");
        String date1 = formatter.format(new Date());//格式化数据
        assertEquals(s, date1);

        //BigDecimal<-->String
        String StrBd="1048576.1024";
        BigDecimal bd=new BigDecimal(StrBd);        // 转换为bigdecimal
        bd=bd.setScale(2, BigDecimal.ROUND_HALF_UP);    //设置小数位数，第一个变量是小数位数，第二个变量是取舍方法(四舍五入)
        String OutString=bd.toString();      //转化为字符串

    }


}
