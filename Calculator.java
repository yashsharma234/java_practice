
import java.util.Scanner;

public class Calculator {
    public static int CalucateOfSum(int a,int b){
        int sum=a+b;
        int mul=a*b;
        int div=a/b;
        int sub=a-b;

        return mul;
        
    
        

    

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=CalucateOfSum(a, b);
        System.out.println(sum);
    }
}
