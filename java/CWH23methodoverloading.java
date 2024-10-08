public class CWH23methodoverloading {
    
    static void  foo(){
        System.out.println("Good Morning bro!");
    }
    static void foo(int a){
        System.out.println("Good Morning " + a + " bro!");
    }
    static void foo(int a, int b){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + a + " bro!");
    }
    public static void main(String[] args) {
        foo();
        foo(3000);
        foo(3000, 4000);
    }
}
