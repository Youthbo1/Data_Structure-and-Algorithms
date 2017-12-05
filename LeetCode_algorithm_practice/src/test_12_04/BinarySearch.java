package test_12_04;

public class BinarySearch {
    public static int binarySearch(Comparable[] arr,int n,Comparable target ){

        int l=0,r=n-1;  //[l...r]
        while (l<=r){   //l==r  [l...r]有效
            int mid=(r-l)/2+l;
            if(arr[mid].compareTo(target)==0)
                return mid;

            if (target.compareTo(arr[mid])>0) //[mid+1 ....l]
                l=mid+1;
            else
                r=mid-1;

        }

        return -1;
    }

    public static void main(String[] args) {
        Comparable[] n={0,1,2,4,5,8,2,9,235,48,2,45};
        System.out.println(binarySearch(n,n.length,4));
    }
}
