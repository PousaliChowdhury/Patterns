package Patterns;
import java.util.Scanner;

// only odd no. * lines
public class OddNo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();     
        //outer loop
        for(int i = 1; i <=n; i++){
            //inner loop
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
             }
            for(int j = 1; j <=i; j++){
                System.out.print("*");
            }
            for(int j = 2; j <=i; j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
}
