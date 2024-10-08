// q1.

// public class  CWH26practice {
//     static void multiplication(int n){
//         for(int i=1; i<=10; i++){
//             System.out.format("%d x %d = %d\n", n, i, n*i);
//         }
//     }
//     public static void main (String [] args){
//         multiplication(7)

//     }
// }

// q.2

// public class  CWH26practice {
//     static void patern1(int n){
//         for(int i=0; i<n; i++){
//             for(int j=0; j<i+1; j++){
//                 System.out.println("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main (String [] args){
//         patern1(4);

//     }
// }

// q3.

// public class  CWH26practice{
//     static int calculateSum(int n){
//         if(n == 1){
//             return 1;
//         }
//         return n + calculateSum(n-1);
//     }
//     public static void main( String[] args){
//         calculateSum(3)
//     }
// }

// q4.

// public class  CWH26practice {
//     static void patern2(int n){
//         for(int i=0; i<n; i++){
//             for(int j=)
//         }
//     }
//     public static void main(String args){

//     }
// }

// q5.

// public class  CWH26practice {
//     static int fibonacci(int n){
//         if(n == 1){
//             return 0;
//         }
//         else if(n == 2){
//             return 1;
//         }
//         else{
//             return fibonacci(n-1) + fibonacci(n-2);
//         }
//     }
//     public static void main (String [] args){
//         fiboancci(10);

//     }
// }

// q9.

public class CWH26practice {

    static void convert(float n) {
        float fahrenheit = (n * 9 / 5) + 32;
        System.out.println("converted fahrenheit values are " + fahrenheit);
    }

    public static void main(String[] args) {
        convert(8);
    }
}
