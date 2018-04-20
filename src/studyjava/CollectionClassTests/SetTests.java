/*
学习来源
https://www.cnblogs.com/leeplogs/p/5891861.html
* */
package studyjava.CollectionClassTests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


/*
Set（无序、不能重复）
Set里存放的对象是无序，不能重复的，集合中的对象不按特定的方式排序，只是简单地把对象加入集合中。
实现类：
HashSet：是哈希表实现的,HashSet中的数据是无序的，可以放入null，但只能放入一个null，两者中的值都不能重复，就如数据库中唯一约束。
TreeSet：是二差树实现的,Treeset中的数据是自动排好序的，不允许放入null值。
* */
public class SetTests {
    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }


    @Test
    public void SetTest() {
        Set<Integer> test = new TreeSet<Integer>();
        test.add(1);
        test.add(8);
        test.add(3);

        //遍历集合test   利用foreach遍历          //输出结果：1   3   8
        for (Integer value : test) {
            System.out.print(value + " ");
        }

        //利用Iterator实现遍历
        Iterator<Integer> value = test.iterator();
        while (value.hasNext()) {
            int s = value.next();
            System.out.print(s + " ");
        }                                //输出结果：1   3   8
    }

}
