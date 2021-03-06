package practice;

/**
 * \Date: 2018/3/24
 * \
 * \Description:
 * \
 */
public class BinarySearch {
    public static int binarySearch(Comparable[] arr,int n,Comparable target ){
        int left=0,right=n-1;//[0  n-1]

        while (left<=right) {     //[l  r]

            int mid=(right-left)/2+left;
            if(target.compareTo(arr[mid])==0)
                return mid;

            if (target.compareTo(arr[mid])>0){ //[mid+1, r]
                left=mid+1;
            }else
                right=mid-1;

        }
        return -1;
    }

    public static int binarySearch1(Comparable[] arr,int n,Comparable target ){
        int l=0,r=n;  //[l,  r)zhao

        while (l<r) {    //l=r

            int mid=(r+l)/2;
            if (arr[mid].compareTo(target)==0){
                return mid;
            }else if(target.compareTo(arr[mid])>0){ //[mid+1,  r)
                l=mid+1;
            }else {
                r=mid;   //[l,mid)
            }
        }

        return  -1;
    }
    public static void main(String[] args) {
        Comparable[] n={0,1,2,4,5,8,9,235};
        System.out.println(binarySearch1(n,n.length,4));

    }


}
