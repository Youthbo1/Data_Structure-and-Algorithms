package javaCollection.List;

import java.util.ArrayList;
import java.util.Date;

/**
 * \Date: 2017/12/25
 * \
 * \Description:
 * \arrayList :add  remove clear set
 */
public class NoticeTest {

    public static void main(String[] args) {
        // 创建Notice类的对象，生成三条公告
        Notice notice1 = new Notice(1, "欢迎来到慕课网！", "管理员", new Date());
        Notice notice2 = new Notice(2, "请同学们按时提交作业！", "老师", new Date());
        Notice notice3 = new Notice(3, "考勤通知！", "老师", new Date());

        ArrayList<Notice> arrayList=new ArrayList<>();
        arrayList.add(notice1);
        arrayList.add(notice2);
        arrayList.add(notice3);


//        for (int i = 0; i < arrayList.size(); i++) {
//
//        }
        for (Notice n :
                arrayList) {
//            Notice notice=arrayList.get(i);
            System.out.println(1+":"+n.getTitle());

        }

        System.out.println("**************************************");
        // 在第一条公告后面添加一条新公告
        Notice notice4 = new Notice(4, "在线编辑器可以使用啦！", "管理员", new Date());

        arrayList.add(1,notice1);

        for (int i = 0; i < arrayList.size(); i++) {
            Notice notice=arrayList.get(i);
            System.out.println(i+1+":"+notice.getTitle());

        }

        arrayList.remove(2);
        // 显示公告
        System.out.println("公告的内容为：");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(i + 1 + ":" + ((Notice) (arrayList.get(i))).getTitle());
        }

        System.out.println("**************************************");


        //修改第二条公告中title的值
        notice4.setTitle("Java在线编辑器可以使用啦！");
        arrayList.set(1, notice4);
        System.out.println("修改后公告的内容为：");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(i + 1 + ":" + ((Notice) (arrayList.get(i))).getTitle());
        }
        System.out.println("***************clear***********************");
        arrayList.clear();
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(i + 1 + ":" + ((Notice) (arrayList.get(i))).getTitle());
        }


    }

    }


