
import java.util.Scanner;

public class linearSearch{
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int array[]=new int[size];

        //input
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();

        }//output
        int x=sc.nextInt();
        for(int i=0;i<array.length;i++){    //linear search
            if(array[i]==x){
              System.out.println("X FOUND AT INDEX;"+i); 

            }

        }

    }
}
