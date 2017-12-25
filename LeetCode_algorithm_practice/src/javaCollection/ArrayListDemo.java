package javaCollection;

import java.util.*;


/**
 * \Date: 2017/12/25
 * \
 * \Description:
 * \动态数组
 */
public class ArrayListDemo
{
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("0");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("面朝大海 春暖花开");

        System.out.println(list.size());

        System.out.println("************");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.remove(2);
        list.remove("1");
        System.out.println(".remove(2)************");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
