package studyjava;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lambdaTests {

    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    public void lambda1() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Before Java8, too much code for too little to do");
            }
        }).start();

        new Thread(() -> System.out.println("In Java8, Lambda expression rocks !!")).start();
    }

    @Test
    public void iterTest() {
        List<String> languages = Arrays.asList("java", "scala", "python");
        //before java8
        for (String each : languages) {
            System.out.println(each);
        }
        //after java8
        languages.forEach(x -> System.out.println(x));
        languages.forEach(System.out::println);
    }

    @Test
    public void FilterTest() {
        List<Persion> Persions = new ArrayList<>();
        Persions.add(new Persion("k1", 17,Gender.FEMALE));
        Persions.add(new Persion("k2", 19,Gender.MALE));
        Persions.add(new Persion("k3", 20,Gender.MALE));
        Persions.add(new Persion("k4", 21,Gender.FEMALE));

    }

}
