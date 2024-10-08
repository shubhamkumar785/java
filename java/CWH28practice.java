
// import javax.sound.sampled.SourceDataLine;

// // problem 1

// class Employee{
//     int salary;
//     String name;

//     public int getSalary(){
//         return salary;
//     }
//     public String getName(){
//         return name;
//     }
//     public void  setName(String n){
//         name = n;
//     }
// }
// public class CWH28practice{
//     public static void main(String[] args) {
//         Employee shubham = new Employee();
//         shubham.setName("CodeWithShubham");
//         System.out.println(shubham.getName());
//         shubham.salary = 233;
//         System.out.println(shubham.getSalary());
        
//     }
// }



// problem 2


// class cellPhone {
//     public void ring(){
//         System.out.println("Ringing...");
//     }
//     public void vibrate(){
//         System.out.println("Vibrating...");
//     }
//     public void callFriend(){
//         System.out.println("calling subhanshu...");
//     }
// }

// public class CWH28practice{
//     public static void main(String[] args) {
//         cellPhone redmi = new cellPhone();
//         redmi.ring();
//         redmi.vibrate();
//         redmi.callFriend();
//     }
// }




// problem 3


// class square{
//     int side;
//     public int area(){
//         return side*side;
//     }
//     public int parameter(){
//         return 4*side;
//     }
// }


// public class CWH28practice{
//     public static void main(String[] args) {
//         square sq = new square();
//         sq.side = 4;
//         System.out.println(sq.area());
//         System.out.println(sq.parameter());
//     }
// }




// problem 4

// class rectangle {
//     int length;
//     int breadth;

//     public int area(){
//         return length*breadth;
//     }
//     public int parameter(){
//         return 2*(length + breadth);
//     }
// }


// public class CWH28practice{
//     public static void main(String[] args) {
//         rectangle rec = new rectangle();
//         rec.length = 2;
//         rec.breadth = 4;
//         System.out.println(rec.area());
//         System.out.println(rec.parameter());
        
//     }
// }






// problem 5


// class Tommy {
//     public void hit(){
//         System.out.println("Hitting the enemy");
//     }
//     public void run(){
//         System.out.println("Running from the enemy");
//     }
//     public void fire(){
//         System.out.println("Firing on the enemy");
//     }
// }


// public class CWH28practice{
//     public static void main(String[] args) {
//         Tommy tom = new Tommy();
//         tom.hit();
//         tom.run();
//         tom.fire();
//     }
// }







// problem 6


class circle {
    int radius;

    public double area(){
        return Math.PI * radius * radius;
    }
    public double parameter(){
        return 2 * Math.PI * radius;
    }
}


public class CWH28practice{
    public static void main(String[] args) {
        circle crc = new circle();
        crc.radius = 7;
        System.out.println(crc.area());
        System.out.println(crc.parameter());
    }
}
