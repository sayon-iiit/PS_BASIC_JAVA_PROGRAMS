import java.util.*;
public class Fibonacci {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of fibonacci numbers you want : ");
        int N=sc.nextInt();
        int [] dp = new int[N];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<N;i++)
            dp[i]=dp[i-1]+dp[i-2];

        System.out.println("Fibonacci series is :");
        for(int i=0;i<N;i++)
            System.out.println(dp[i]);

    }
}
