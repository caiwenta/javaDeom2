package studyjava;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static studyjava.Gender.FEMALE;
import static studyjava.Gender.MALE;

public class SerializableTests {

    public List<Persion> Persions = new ArrayList<>();

    @BeforeEach
    void setUp() throws Exception {
        Persions.add(new Persion("k9", 17, FEMALE));
        Persions.add(new Persion("k6", 19, MALE));
        Persions.add(new Persion("k7", 20, MALE));
        Persions.add(new Persion("k8", 21, FEMALE));
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    public void DeserializeObjectTest() throws IOException, ClassNotFoundException {
        //反序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("jason.se"));
        oos.writeObject(Persions);
        oos.close();

    }

    @Test
    public void SerializeObjectTest() throws IOException, ClassNotFoundException {

        //序列化

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("jason.se"));
        List<Persion> tempPersions = (List<Persion>) ois.readObject();
        ois.close();

    }


}
