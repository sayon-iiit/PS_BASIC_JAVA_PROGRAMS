import java.util.*;
public class BinarySearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array N : ");
        int N=sc.nextInt();
        int[] arr=new int[N];
        System.out.println("Enter Array Elements in sorted order : ");
        for(int i=0;i<N;i++)
        {
            int temp=sc.nextInt();
            arr[i]=temp;
        }
        System.out.println("Enter Search element : ");
        int key;
        key= sc.nextInt();
        int low=0;
        int high=N-1;
        int index=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>key)
                high=mid-1;
            else if(arr[mid]<key)
                low=mid+1;
            else
            {
                index=mid;
                break;
            }
        }
        if(index==-1)
            System.out.println("Element Not Found");
        else
            System.out.println("Element found at index : "+index);

    }
}
