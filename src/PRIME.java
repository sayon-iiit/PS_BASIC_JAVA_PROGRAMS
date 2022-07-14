import java.util.*;
public class PRIME {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit N : ");
        int N=sc.nextInt();
        System.out.println(("ALL PRIME TILL N :"));
        boolean check;
        for(int i=2;i<=N;i++)
        {
            check=true;
            for(int j=2;j*j<=i;j++)
            {
                if(i%j==0)
                {
                    check=false;
                    break;
                }
            }
            if(check)
                System.out.println(i);
        }
    }
}