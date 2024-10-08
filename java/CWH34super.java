// class EkClass{
//     int a;

//     public EkClass(int v) {
//         this.a = v;
//     }
//     public int getA(){
//         return a;
//     }

//     public int returnone(){
//         return 1;
//     }
// }

// class DoClass extends EkClass{
//     public DoClass(int c){
//         super(c);
//         System.out.println("Mai Ek Constructor hun");
//     }
// }

// public class CWH34super {
//     public static void main(String[] args) {
//         EkClass e = new EkClass(5);
//         System.out.println(e.getA());
//         DoClass d = new DoClass(4);
//     }
// }





class EkClass {
    int a;

    public EkClass(int a){
        this.a = a;
    }
    public int getA(){
        return a;
    }
    public int returnone(){
        return 1;
    }
}

class DoClass extends EkClass {
    public DoClass(int c){
        super(c);
        System.out.println("I am a constructor");
    }
}

public class CWH34super {
    public static void main(String[] args) {
        EkClass e = new EkClass(5);
        System.out.println(e.getA());

        DoClass d = new DoClass(4);
    }
}