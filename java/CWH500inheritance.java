
// Print the details of the car.




// class vehicle {
//     public String brand;

//     public vehicle(String brand){
//         this.brand = brand;
//     }

// }
// class car extends vehicle{
//     public String model;

//     public car(String brand, String model){
//         super(brand);
//         this.model = model;
//     }

//     public void display(){
//         System.out.println("Brand : " + brand);
//         System.out.println("Model : " + model);
//     }
// }

// public class CWH500inheritance {
//     public static void main(String[] args) {
//         car c = new car("BMW", "B7");
//         c.display();

//     }
// }


// Create a base class Shape with a calculateArea() method. Then, 
// create subclasses Circle and Rectangle that override the calculateArea() method to calculate the area of a circle and a rectangle, respectively.
//  Demonstrate polymorphism by calling the method through a Shape reference.



class shape {

    public void calculateArea(){
        System.out.println("Calculating area of a shape");
    }
}

class circle extends shape {
    public double radius;

    public circle(double radius){
        this.radius = radius;
    }
    public void calculateArea(){
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle is : " + area);
    }
}

class rectangle extends shape {
    public int length;
    public int breadth;

    public rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public void calculateArea(){
        int area = length * breadth;
        System.out.println("Area of a rectangle is : " + area);
    }
}


public class CWH500inheritance {
    public static void main(String[] args) {
        shape shape1 = new circle(4.0);
        shape1.calculateArea();

        shape shape2 = new rectangle(2, 4);
        shape2.calculateArea();
    }
}