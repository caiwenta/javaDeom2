/*
学习来源
https://www.cnblogs.com/leeplogs/p/5891861.html
* */
package studyjava.CollectionClassTests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


/*
List（有序、可重复）
List里存放的对象是有序的，同时也是可以重复的，List关注的是索引，拥有一系列和索引相关的方法，查询速度快。因为往list集合里插入或删除数据时，会伴随着后面数据的移动，所有插入删除数据速度慢。
实现类：
ArrayList和LinkedList在用法上没有区别，但是在功能上还是有区别的。
LinkedList：经常用在增删操作较多而查询操作很少的情况下，
ArrayList：则相反。
*/
public class ListTests {
    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    public void ListTest() {

        List<String> list1 = new ArrayList<String>();
        //添加
        list1.add("A");
        list1.add("B");
        list1.add("C");
        assertEquals(list1.size(), 3);
        assertEquals(list1.get(1), "B");
        //插入
        list1.add(1, "B1");
        assertEquals(list1.get(1), "B1");
        //删除
        list1.remove(1);
        assertEquals(list1.get(1), "B");
        //清空
        list1.clear();
        assertEquals(list1.size(), 0);

        //批量插入
        List<String> list2 = new ArrayList<String>();
        list2.add("D");
        list2.add("E");
        list2.add("F");
        assertEquals(list2.size(), 3);
        list1.addAll(list2);
        assertEquals(list1.size(), 3);

        //批量删除
        list1.removeAll(list2);
        assertEquals(list1.size(), 0);

        //包含
        list1.add("g");
        assertTrue(list1.contains("g"));

        //修改
        int index = list1.lastIndexOf("g");
        assertNotEquals(index, -1);
        list1.set(index, "G");
        assertTrue(list1.contains("G"));

        //对比两个list中的所有元素
        assertNotEquals(list1.hashCode(), list2.hashCode());

        //判断list是否为空；
        assertFalse(list1.isEmpty());

        //返回Iterator集合对象
        //list1.iterator();

        //"将集合转换为数组
        // list1.toArray()
    }

    @Test
    public void ArraryListTest() {

        ArrayList<String> list1 = new ArrayList<String>();
        //添加
        list1.add("A");
        list1.add("B");
        list1.add("C");
        assertEquals(list1.size(), 3);
        assertEquals(list1.get(1), "B");
        //插入
        list1.add(1, "B1");
        assertEquals(list1.get(1), "B1");
        //删除
        list1.remove(1);
        assertEquals(list1.get(1), "B");
        //清空
        list1.clear();
        assertEquals(list1.size(), 0);

        //批量插入
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("D");
        list2.add("E");
        list2.add("F");
        assertEquals(list2.size(), 3);
        list1.addAll(list2);
        assertEquals(list1.size(), 3);

        //批量删除
        list1.removeAll(list2);
        assertEquals(list1.size(), 0);

        //包含
        list1.add("g");
        assertTrue(list1.contains("g"));

        //修改
        int index = list1.lastIndexOf("g");
        assertNotEquals(index, -1);
        list1.set(index, "G");
        assertTrue(list1.contains("G"));


    }

    @Test
    public void LinkedListTest() {

        LinkedList<String> list1 = new LinkedList<String>();
        //添加
        list1.add("A");
        list1.add("B");
        list1.add("C");
        assertEquals(list1.size(), 3);
        assertEquals(list1.get(1), "B");
        //插入
        list1.add(1, "B1");
        assertEquals(list1.get(1), "B1");
        //删除
        list1.remove(1);
        assertEquals(list1.get(1), "B");
        //清空
        list1.clear();
        assertEquals(list1.size(), 0);

        //批量插入
        LinkedList<String> list2 = new LinkedList<String>();
        list2.add("D");
        list2.add("E");
        list2.add("F");
        assertEquals(list2.size(), 3);
        list1.addAll(list2);
        assertEquals(list1.size(), 3);

        //批量删除
        list1.removeAll(list2);
        assertEquals(list1.size(), 0);

        //包含
        list1.add("g");
        assertTrue(list1.contains("g"));

        //修改
        int index = list1.lastIndexOf("g");
        assertNotEquals(index, -1);
        list1.set(index, "G");
        assertTrue(list1.contains("G"));


    }

}
