package test1;

public class BinarySearch {
    public static int binarySearch1(Comparable[] arr,int n,Comparable target ){

        int l=0,r=n-1;  //[l...r]
        while (l<=r){   //l==r  [l...r]有效
            int mid=(r-l)/2+l;
            if(arr[mid].compareTo(target)==0) {
                return mid;
            }

            if (target.compareTo(arr[mid])>0) //[mid+1 ....l]
            {
                l = mid + 1;
            } else {
                r = mid - 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        //测试的数组必须有序
        Comparable[] n={1,2,3,4,5,6,7,8,9,9};

        System.out.println(binarySearch(n,n.length,5));

//        Comparable[] n1= print(n,n.length,4);
//        for (int i=0;i<n1.length;i++){
//            System.out.print(n1[i]+"  ");
//        }
    }

    public static int binarySearch(Comparable[] arr,int n,Comparable target){
        int left=0,right=n-1;
//        for (int i=0;i<n;i++){
//            System.out.print(arr[i]+"  ");
//        }
        while (left<=right){
            int mid=(right-left)/2+left;
           // System.out.print(arr[mid]+" ----- ");
            if (arr[mid].equals(target)) {
                return mid;
            }

            if (arr[mid].compareTo(target)<0){

                left=mid+1;
            }else {
                right = mid - 1;
            }

        }

        return -1;
    }

    public static Comparable[] print(Comparable[] arr,int n,Comparable target){

        for (int i=0;i<n;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println("------------------");
        return arr;
    }
}
