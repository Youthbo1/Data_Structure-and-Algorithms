package test;

class weichengquan {//设有ｎ个人依围成一圈，从第１个人开始报数，数到第ｍ个人出

    //列，然后从出列的下一个人开始报数；输出出列的顺序来
    public void play(int num, int step) {
        int[] numS = new int[num];
        int tep = 0;//记录步数；1<=tep<=step
        int sd = 0; //只有当sd等于数组长度-1时，说明都出列完毕了，每次有出列的都会置零；
        ff:
        //本题目的要点；在遍历完一边数组后，tep是不置零的；
        while (true) {
            if (sd == numS.length - 1)//如果相等，说明出列完毕，跳出循环
                break ff;
            for (int i = 0; i < numS.length; i++) {
                if (numS[i] != 1 && tep != step) {
                    tep++;
                } else if (numS[i] == 0 && tep == step) {
                    System.out.println(i);
                    numS[i] = 1;
                    tep = 0;
                    sd = 0;
                } else
                    sd++;
            }

        }
    }

    public static void main(String[] args) {
        weichengquan fd = new weichengquan();
        fd.play(20, 3);
    }
}