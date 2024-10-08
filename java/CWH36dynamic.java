// class Phone{
//     public void showTime(){
//         System.out.println("Time is 8 am....");
//     }
//     public void on(){
//         System.out.println("Turning on Phone....");
//     }
// }

// class SmartPhone extends Phone{
//     public void music(){
//         System.out.println("Playing Music....");
//     }
//     public void on(){
//         System.out.println("Turning on SmartPhone....");
//     }
// }

// public class CWH36dynamic {
//     public static void main(String[] args) {
//         // Phone obj = new Phone();
//         // SmartPhone smobj = new SmartPhone();
//         // obj.name();


//         Phone obj = new SmartPhone(); //yes it is allowed
//         // SmartPhone obj2 = new Phone();  ----> Not allowed
//         obj.showTime();
//         obj.on();
        
//     }
// }



class phone{
    public void showTime(){
        System.out.println("Time is 8 am...");
    }
    public void on(){
        System.out.println("turning on phone...");
    }
}

class SmartPhone extends phone {
    public void music(){
        System.out.println("playing Music...");
    }
    @Override
    public void on(){
        System.out.println("Turning on smartphone...");
    }
}
public class CWH36dynamic {
    public static void main(String[] args) {
        // phone p = new phone();
        // p.showTime();
        // p.on();

        // SmartPhone s = new SmartPhone();
        // s.music();
        // s.on();

        phone obj = new SmartPhone(); // yes it is allowed
        obj.showTime();
        obj.on();
    }
}