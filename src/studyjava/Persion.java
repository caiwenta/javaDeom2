package studyjava;

import java.io.Serializable;

public class Persion implements Serializable {




    public Persion(String name, int age, Gender gender) {
        System.out.println("带参的构造函数11");
        this.name = name;


        this.age = age;
        this.gender = gender;
    }

    public Persion() {
        System.out.println("空的构造函数");
    }

    private Gender gender = null;

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return Sex;
    }

    public void setSex(boolean sex) {
        Sex = sex;
    }

    public boolean Sex;

    @Override
    public String toString() {
        return "[" + name + ", " + age + ", " + gender + "]";  
    }
}
