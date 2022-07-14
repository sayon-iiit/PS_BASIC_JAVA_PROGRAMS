import java.util.*;
public class FACTORIAL {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number N : ");
        int N= sc.nextInt();
        int fact=1;
        while(N>0)
        {
            fact*=N;
            N--;
        }
        System.out.println("Ans : "+fact);
    }
}
