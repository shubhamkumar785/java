
// abstract class Parent {
//     public Parent(){
//         System.out.println("I am a constructor of Base");
//     }
//     public void sayHello(){
//         System.out.println("Hello");
//     }
//     abstract public void greet();
// }
// class child extends Parent{
//     @Override
//     public void greet(){
//         System.out.println("Good Morning");
//     }
// }

// abstract class child2 extends Parent{
//     public void th(){
//         System.out.println("I am good");
//     }
// }
// public class CWH39abstract {
//     public static void main(String[] args) {
        
//     }
// }






abstract class Parent{
    public Parent(){
        System.out.println("I am a constructor of Parent");
    }
    public void sayhello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}
class child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
}

abstract class child2 extends Parent{
    public void th(){
        System.out.println("I am a good");
    }
}
public class CWH39abstract {
    public static void main(String[] args) {
        // Parent p = new Parent(); ---> not allowed 
        child c = new child();
        // child2 c2 = new child2(); ---> not allowed
    }
}