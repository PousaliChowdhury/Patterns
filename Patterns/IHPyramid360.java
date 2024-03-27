package Patterns;
import java.util.Scanner;   

// inverted Half pyramid(rotation 360 degree)

public class IHPyramid360 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //outer loop
        for(int i = n; i >= 1; i--){
            //inner loop
             for(int j = 1; j <=n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <=i; j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
}
