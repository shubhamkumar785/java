import java.util.Scanner;

public class CWH13switchcase {
    public static void main(String[] args) {
        int age;
        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch(age){
            case 18:
                System.out.println("you are going to become an adult");
                break;
            case 21:
                System.out.println("you are going to join a job");
                break;  
            case 60:
                System.out.println("you are going to get retired job!");
                break;    
            default:
                System.out.println("enjoy your life!");      
        }
        // if(age > 56){
        //     System.out.println("you are experienced");
        // }
        // else if(age > 46){
        //     System.out.println("you are semi experienxed");
        // }
        // else if(age > 36){
        //     System.out.println("you are semi semi experienced");

    }
}
