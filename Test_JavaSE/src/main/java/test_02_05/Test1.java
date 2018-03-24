package test_02_05;


import java.util.*;
import java.util.Map;
import java.util.Map.Entry;
public class Test1 {


   public static void test(StringBuffer stringBuffer,Integer integer,int i){
       stringBuffer.append("666");
       integer=10;
       i=1;
   }

    public static void main(String[] args) {
        int i=0;
        Integer integer=-1;
        StringBuffer stringBuffer=new StringBuffer("hi:");
        test(stringBuffer,integer,i);
      //  System.out.println(stringBuffer+"---"+"integer:"+integer+"---  i:"+i);

      //  init();

    //    setInit();

        mapInit();
    }

    public static void init(){
        List<String> list=new ArrayList<String>();
        list.add("first");
        list.add("first11");
        list.add("first222");
        list.add("first333");

        Iterator i1=list.iterator();
        while (i1.hasNext()){
            System.out.println(i1.next());
        }
//输出列表中元素的个数
        System.out.println("列表中元素的个数为："+list.size());


        System.out.println("**************************************");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+",");
        }

        //移除列表中的C++
        System.out.println();
        //list.remove(2);
        list.remove("first11");
        System.out.println("**************************************");
        System.out.println("移除first11以后的列表元素为：");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+",");
        }
    }


    public static void setInit(){
        // 将英文单词添加到HashSet中
        Set<String> set = new HashSet();
        // 向集合中添加元素
        set.add("blue");
        set.add("red");
        set.add("black");
        set.add("yellow");
        set.add("white");
        // 显示集合的内容
        System.out.println("集合中的元素为：");
        Iterator it = set.iterator();
        // 遍历迭代器并输出元素
        while (it.hasNext()) {
            System.out.print(it.next() + "   ");
        }
        System.out.println();
        // 在集合中插入一个新的单词
        // set.add("green");
        set.add("white");
        it = set.iterator();
        // 遍历迭代器并输出元素
        System.out.println("**************************");
        System.out.println("插入重复元素后的输出结果为：");
        while (it.hasNext()) {
            System.out.print(it.next() + "   ");
        }
        //插入失败，但是不会报错

    }


    public static void mapInit(){
        Map<String,String> animal=new HashMap<String,String>();
    //    System.out.println("请输入三组单词对应的注释，并存放到HashMap中");
        animal.put("1","a");
        animal.put("2","b");
        animal.put("3","c");

        //Scanner console=new Scanner(System.in);
        //添加数据
//        int i=0;
//        while(i<3){
//            System.out.println("请输入key值（单词）：");
//            String key=console.next();
//            System.out.println("请输入value值（注释）：");
//            String value=console.next();
//            animal.put(key, value);
//            i++;
//        }
        //打印输出value的值（直接使用迭代器）
        System.out.println("*****************************************");
        System.out.println("使用迭代器输出所有的value：");
        Iterator<String> it=animal.values().iterator();
        while(it.hasNext()){
            System.out.print(it.next()+"    ");
        }
        System.out.println();
        System.out.println("*****************************************");
        //打印输出key和value的值
        //通过entrySet方法
        System.out.println("通过entrySet方法得到key－value：");
        Set<Entry<String, String>> entrySet=animal.entrySet();
        for(Entry<String, String> entry:entrySet){
            System.out.print(entry.getKey()+"-");;
            System.out.println(entry.getValue());
        }
        System.out.println();
        System.out.println("*****************************************");

        //通过单词找到注释并输出
        //使用keySet方法
//        System.out.println("请输入要查找的单词：");
//        String strSearch=console.next();
        //1.取得keySet
//        Set<String> keySet=animal.keySet();
//        //2.遍历keySet
//        for(String key:keySet){
//            if(strSearch.equals(key)){
//                System.out.println("找到了！"+"键值对为："+key+"-"+animal.get(key));
//                break;
//            }
//        }
    }
}
