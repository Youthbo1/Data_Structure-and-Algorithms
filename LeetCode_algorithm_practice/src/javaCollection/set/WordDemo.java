package javaCollection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * \Date: 2017/12/25
 * \
 * \Description:
 * \无序
 */
public class WordDemo {
    public static void main(String[] args) {
        Set set = new HashSet();

        // 向集合中添加元素
        set.add("blue");
        set.add("red");
        set.add("black");
        set.add("yellow");
        set.add("white");
        // 显示集合的内容
        System.out.println("集合中的元素为：");
        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println("**************************");
        set.add("green");
        set.add("white");
        it = set.iterator();
//插入失败，但是不会报错
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

    }
}

