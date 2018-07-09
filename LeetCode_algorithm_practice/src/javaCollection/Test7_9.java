package javaCollection;

import java.util.*;

public class Test7_9 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        Iterator iterable = list.iterator();
        while (iterable.hasNext()) {
            System.out.println(iterable.next());
        }

        List list1 = new ArrayList();
        list1.add("Hello");
        list1.add("World");
        list1.add("Hello");
        list1.add("Learn");
//        list1.remove("Hello");
//        list1.remove(0);
        for(int i = 0; i<list1.size(); i++){
            System.out.println(list1.get(i));
        }
        Set set=new HashSet();
        set.addAll(list1);
        System.out.println(set.size());
    }
}