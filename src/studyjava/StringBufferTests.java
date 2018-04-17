package studyjava;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringBufferTests {

    @BeforeEach
    void setUp() throws Exception {

    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    void AppendTest() {
        StringBuffer MyStringBuffer = new StringBuffer("111");
        MyStringBuffer.append(1);
        assertEquals(MyStringBuffer.length(), 4);

    }
}
