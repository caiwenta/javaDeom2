/*
学习来源
https://www.cnblogs.com/leeplogs/p/5891861.html
* */

package studyjava.CollectionClassTests;

import com.sun.org.apache.xml.internal.security.Init;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
实现类：HashMap、Hashtable、LinkedHashMap和TreeMap
*/
public class MapTests {
    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    /*
    Map中我们通过对象来对对象进行索引，用来索引的对象叫做key，其对应的对象叫做value
    */
    @Test
    public void MapTest() {
        Map map = new HashMap();
        map.put("A", "AAA");
        map.put(1, 11);


        //遍历
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            if (key instanceof String) {
                assertEquals(key, "A");
            }
            if (key instanceof Integer) {
                assertEquals(key, 1);
            }
        }

        assertEquals(map.get(1), 11);
        assertEquals(map.get("A"), "AAA");

        //泛型
        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("aa", "11");

        //遍历
        Collection collection = map1.values();
        Iterator iterator2 = collection.iterator();


        Map<String, String> map3 = new LinkedHashMap<String, String>();
        map3.put("justin", "justin的讯息");
        map3.put("momor", "momor的讯息");
        map3.put("caterpillar", "caterpillar的讯息");
        for (String value : map3.values()) {
            System.out.println(value);
        }
    }

    /*
    HashMap是最常用的Map，它根据键的HashCode值存储数据，根据键可以直接获取它的值，具有很快的访问速度，遍历时，取得数据的顺序是完全随机的。
    因为键对象不可以重复，所以HashMap最多只允许一条记录的键为Null，允许多条记录的值为Null，是非同步的
    */
    @Test
    public void HashMapTest() {


    }

    /*
    Hashtable与HashMap类似，是HashMap的线程安全版，它支持线程的同步，即任一时刻只有一个线程能写Hashtable，因此也导致了Hashtale在写入时会比较慢，它继承自Dictionary类，
    不同的是它不允许记录的键或者值为null，同时效率较低。
    */
    @Test
    public void HashtableTest() {
    }

    /*
    线程安全，并且锁分离。ConcurrentHashMap内部使用段(Segment)来表示这些不同的部分，每个段其实就是一个小的hash table，它们有自己的锁。
    只要多个修改操作发生在不同的段上，它们就可以并发进行。
    * */
    @Test
    public void ConcurrentHashMapTest() {


    }

    /*
    LinkedHashMap保存了记录的插入顺序，在用Iteraor遍历LinkedHashMap时，先得到的记录肯定是先插入的，在遍历的时候会比HashMap慢，有HashMap的全部
    特性。
    * */
    @Test
    public void LinkedHashMapTest() {

    }

    /*
    TreeMap实现SortMap接口，能够把它保存的记录根据键排序，默认是按键值的升序排序（自然顺序），也可以指定排序的比较器，当用Iterator遍历TreeMap时，得到的记录是排过序的。
    不允许key值为空，非同步的；
    * */
    @Test
    public void TreeMapTest() {

    }


}
