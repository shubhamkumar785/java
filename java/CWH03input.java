
import java.util.Scanner;

public class CWH03input {
    public static void main(String[] args) {
        System.out.println("Taking Inout From The User");
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("enter number 2");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("the sum of these number is");
        System.out.println(sum);
    }
}
