package javaCollection;

import java.util.*;

public class T7_9 {
    public static void main(String[] args) {
        User user=new User("fyb","1q");
        List<User> list=new ArrayList();
        list.add(user);
        list.add(new User("zmy","2w"));
        System.out.println(list.get(1).getName());


        Set<User> set=new HashSet();
        set.add(user);
        set.add(new User("zmy","2w"));

        Iterator<User> iterator=set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getName());
        }

    }
}
