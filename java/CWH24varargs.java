public class CWH24varargs {
    static int sum(int a, int b){
        return a + b;
    }
    static int sum(int a, int b, int c){
        return a + b + c;
    }
    static int sum(int a, int b, int c, int d){
        return a + b + c + d;
    }
    public static int sum(int x, int ...arr){
        int result = x;
        for(int element : arr){
         result += element;   
        }
        return result;
    }
    public static void main(String[] args) {
        // System.out.println("the sum of nothing is: "+ sum());
        System.out.println("welcome to varargs tutorial");
        System.out.println("the sum of 4 and 5 is: " + sum(4, 5));
        System.out.println("the sum of 4, 3 and 5 is: "+ sum(4,3,5));
        System.out.println("the sum of 2, 4, 3 and 5 is : "+ sum(2, 4, 3, 5));
    }
}
