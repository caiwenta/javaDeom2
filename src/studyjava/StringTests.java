package studyjava;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
字符串
String：适用于少量的字符串操作的情况
StringBuilder：适用于单线程下在字符缓冲区进行大量操作的情况,StringBuilder是线程不安全的
StringBuffer：适用多线程下在字符缓冲区进行大量操作的情况,StringBuffer是线程安全的
运行速度快慢为：StringBuilder > StringBuffer > String
* */
public class StringTests {

    private static int time = 50000;

    @BeforeEach
    void setUp() throws Exception {

    }

    @AfterEach
    void tearDown() throws Exception {
    }


    @Test
    public void StringTest() {
        String str1 = "hello world";
        String str2 = new String("hello world");
        String str3 = "hello world";
        String str4 = new String("hello world");

        assertEquals(str1, str2);
        assertEquals(str1, str3);
        assertEquals(str2, str4);

        //通过new关键字来生成对象是在堆区进行的，而在堆区进行对象生成的过程是不会去检测该对象是否已经存在的。因此通过new来创建对象，创建出的一定是不同的对象，即使字符串的内容是相同的。
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str2 == str4);


        String s = "";
        long begin = System.currentTimeMillis();
        for (int i = 0; i < time; i++) {
            s += "java";
        }
        long over = System.currentTimeMillis();
        System.out.println("操作" + s.getClass().getName() + "类型使用的时间为：" + (over - begin) + "毫秒");


        String a = "hello2";
        String b = "hello";
        String c = b + 2;
        System.out.println((a == c));
    }

    @Test
    public void StringBufferTest() {
        StringBuffer MyStringBuffer = new StringBuffer("111");
        MyStringBuffer.append(1);
        assertEquals(MyStringBuffer.length(), 4);

        StringBuffer sb = new StringBuffer();
        long begin = System.currentTimeMillis();
        for (int i = 0; i < time; i++) {
            sb.append("java");
        }
        long over = System.currentTimeMillis();
        System.out.println("操作" + sb.getClass().getName() + "类型使用的时间为：" + (over - begin) + "毫秒");
    }

    @Test
    public void StringBuilderTest() {

        StringBuilder sb = new StringBuilder();
        long begin = System.currentTimeMillis();
        for (int i = 0; i < time; i++) {
            sb.append("java");
        }
        long over = System.currentTimeMillis();
        System.out.println("操作" + sb.getClass().getName() + "类型使用的时间为：" + (over - begin) + "毫秒");
    }

}
