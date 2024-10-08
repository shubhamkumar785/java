

//                      problem 1

// class cylinder{
//     private int radius;
//     private int height;

//     public void setRadius(int radius){
//         this.radius = radius;
//     }
//     public int getRadisu(){
//         return radius;
//     }
//     public void setHeight(int height){
//         this.height= height;
//     }
//     public int getHeight(){
//         return height;
//     }

// }

// public class CWH31practice {
//     public static void main(String[] args) {
//         cylinder cyl = new cylinder();
//         cyl.setHeight(4);
//         System.out.println(cyl.getHeight());

//         cyl.setRadius(5);
//         System.out.println(cyl.getRadisu());
//     }
// }




//                         problem 2


// class Cylinder {
//     private int radius;
//     private int height;

//     public void setHeight(int height) {
//         this.height = height;
//     }

//     public void setRadius(int radius) {
//         this.radius = radius;
//     }

//     public double getArea() {
//         // Correct formula for the surface area of the cylinder (2πrh + 2πr²)
//         return 2 * Math.PI * radius * (radius + height);
//     }

//     public double getVolume() {
//         // Volume of the cylinder (πr²h)
//         return Math.PI * radius * radius * height;
//     }
// }

// public class CWH31practice {
//     public static void main(String[] args) {
//         Cylinder cyl = new Cylinder();
//         cyl.setHeight(4);
//         cyl.setRadius(2);
//         System.out.println("Surface area of the cylinder is: " + cyl.getArea());
//         System.out.println("Volume of the cylinder is: " + cyl.getVolume());
//     }
// }






//                             problem 3




// class cylinder{
//     private int radius;
//     private int height;

//     public cylinder(){
//         radius = 5;
//         height = 4;
//     }

//     public void setRadius(int radius){
//         this.radius = radius;
//     }
//     public int getRadisu(){
//         return radius;
//     }
//     public void setHeight(int height){
//         this.height= height;
//     }
//     public int getHeight(){
//         return height;
//     }

// }

// public class CWH31practice {
//     public static void main(String[] args) {
//         cylinder cyl = new cylinder();
//         // cyl.setHeight(4);
//         System.out.println(cyl.getHeight());

//         // cyl.setRadius(5);
//         System.out.println(cyl.getRadisu());
//     }
// }








//                  problem 4



// class rectangle{
//     private int length;
//     private int breadth;

//     public rectangle(){
//         this.length = 4;
//         this.breadth = 5;
//     }

//     public rectangle(int length, int breadth){
//         this.length = length;
//         this.breadth = breadth;
//     }

//     public void setLength(int length){
//         this.length = length;
//     }
//     public void setBreadth(int breadth){
//         this.breadth = breadth;
//     }
//     public int getArea(){
//         return length * breadth;
//     }
//     public int getPerimeter(){
//         return 2*(length+breadth);
//     }
// }


// public class CWH31practice {
//     public static void main(String[] args) {
//         rectangle rec1 = new rectangle();
//         System.out.println("area of rec1 " + rec1.getArea());
//         System.out.println("perimeter of rec1 " + rec1.getPerimeter());


//         rectangle rec2 = new rectangle(10, 20);
//         System.out.println("area of rec2 " + rec2.getArea());
//         System.out.println("perimeter of rec2 " + rec2.getPerimeter());
//     }
// }








//                         problem 5 sphere

class sphere{
    int radius;
    int height;

    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }

}

public class CWH31practice {
    public static void main(String[] args) {
        sphere sp = new sphere();
        sp.setRadius(2);
        sp.setHeight(4);
        System.out.println("radius os sphere is: " + sp.getRadius());
        System.out.println("height of sphere is: " + sp.getHeight());
    }
}
