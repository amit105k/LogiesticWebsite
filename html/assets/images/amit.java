import java.util.Scanner;
import java.util.random.*;;

public class amit{
    // public static void print(int a){
    //     System.out.println("this is priyn"+a);
    // }
    public static void main(String args[]){
        System.out.println("Enter the number which is you want to guess");
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int rand=(int)(Math.random()+50);
        
        System.out.println(rand);


    }
}