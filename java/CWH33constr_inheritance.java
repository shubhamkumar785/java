


//     public Base(){
//         System.out.println("I am a Base class constructor");
//     }
//     public Base(int a){
//         System.out.println("I am a Base class constructor " + a);
//     }
//     public void setX(int x){
//         this.x = x;
//     }
//     public int getX(){
//         return x;
//     }
// }

// class Derived extends Base{
//     private int y;

//     public Derived(){
//         // super(0);
//         System.out.println("I am a derived class constructor");
//     }
//     public Derived(int x, int y){
//         super(1);
//         System.out.println("I am a overloaded constructor of derived with value of y as: " + y);
//     }

//     public void setY(int y){
//         this.y = y; 
//     }
//     public int getY(){
//         return y;
//     }
// }

// class childOfDerived extends Derived{

//     public childOfDerived() {
//         System.out.println("I am a child of derived constructor");
//     }
//     public childOfDerived(int x, int y, int z) {
//         super(x, y);
//         System.out.println("I am a overloaded constructor of derived with value of z as: " + z);
//     }

    
// }

// public class CWH33constr_inheritance {

//     public static void main(String[] args) {
//         Base b = new Base();
//         // Derived d = new Derived();
//         Derived d = new Derived(4, 9);
//         childOfDerived cd  = new childOfDerived(2, 3, 4);

//     }
    
// }






class Base{
    public int x;

    public Base(){
        System.out.println("I am Base Constructor");
    }
    public Base(int a){
        System.out.println("I am a overloaded constructor with value of a as: " + a);
    }
    public Base(int a, int b){
        System.out.println("I am a overloaded constructor with value of a and  b is: " + (" a "+ " b "));
    }
}

class Derived extends Base {
    public int y;

    public Derived(){
        // super(0);
        super(0, 4);
        System.out.println("I am a Dervie Constructor");
    }
    public Derived(int a, int b){
        // super(a);
        // super(2, 4);
        System.out.println("I am a overloaded constructor of Derived with value of a and  b is: " + (a+b));
    }
}


class childOfDerived extends Derived {
    public childOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    public childOfDerived(int a, int b, int c){
        super(3,5);
        System.out.println("I am a overloaded constructor of derived with value of z as: " + ("z"));
    }
}





public class CWH33constr_inheritance {
    public static void main(String[] args){
        // Base b = new Base();

        // Derived d = new Derived();
        // Derived d = new Derived(14, 9);

        childOfDerived cd = new childOfDerived();

    }
}