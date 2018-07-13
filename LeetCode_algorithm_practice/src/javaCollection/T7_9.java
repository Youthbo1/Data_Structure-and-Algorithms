package javaCollection;

import java.util.*;

public class T7_9 {
    public static void main(String[] args) {
        User user = new User("fyb", "1q");
        List<User> list = new ArrayList();
        list.add(user);
        list.add(new User("zmy", "2w"));
        System.out.println(list.get(1).getName());


        Set<User> set = new HashSet();
        set.add(user);
        set.add(new User("zmy", "2w"));

        for (User u:set
             ) {
            System.out.println(u);
        }
        Iterator<User> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
       Comparable[] a = {1,2};
        String s="1s";

        System.out.println(a[1].compareTo(1));
        System.out.println("----------------------------");

        Set set1=new TreeSet();
        set1.add("10");
        set1.add("8");
        set1.add("-10");
        Iterator iterator1=set1.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
