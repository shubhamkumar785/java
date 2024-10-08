

// 1. create a class circle and use inheritance to create another class cylinder from it.

// class circle{
//     public int radius;

//     public circle(){
//         System.out.println("I am non parameterized of circle");
//     }

//     public circle(int r){
//         System.out.println("I am circle parameterized circle constructor");
//          this.radius = r;
//     }

//     public double area(){
//         return Math.PI * radius * radius;
//     }
// }

// class cylinder extends circle{
//     public int height;

//     public cylinder(int r, int h){
//         super(r);
//         System.out.println("I am cylinder parameterized constructor");
//         this.height = h;
//     }

//     public double volume(){
//         return Math.PI * radius * radius * height;
//     }
// }



// public class CWH38practice {
//     public static void main(String[] args) {
//         // circle objc = new circle(12);
//          cylinder obj = new cylinder(12, 4);
//     }
// }









// 2. create a class rectangle and use inheritance to create another class cuboid. try keep it as close to real world senario as possible.

// class rectangle{
//     public int  length;
//     public int width;

//     public rectangle(){
//         System.out.println("I am a non parameterized constructor");
//     }
//     public rectangle(int length, int width){
//         System.out.println("I am rectangle parametrized constructor");
//         this.length = length;
//         this.width = width;
//     }
//     public int getArea(){
//         return length * width;
//     }
//     public int getPerimetr(){
//         return 2 * (length + width);
//     }
// }

// class cuboid extends rectangle{
//     public int height;

//     public cuboid(int length, int width, int height){
//         super(length,width);
//         System.out.println("I am cuboid parametrized constructor");
//         this.length = length;
//     }
//     public int getVolume(){
//         return length * width * height;
//     }
// }


// public class CWH38practice {
//     public static void main(String[] args) {
//         rectangle rec = new rectangle(2,4);
//         System.out.println("Area of rectangle: " + rec.getArea());
//         System.out.println("Perimeter of rectangle: " + rec.getPerimetr());
//         cuboid cub = new cuboid(2, 4, 6);
//         System.out.println("Volume of cuboid: " + cub.getVolume());

//     }
// }









// 3.  create method for area and volume in 1.


// class circle {   
//     int radius;

//     public circle(){
//         System.out.println("I am non parameterized constructor");
//     }
//     public circle(int radius){
//         System.out.println("I am parameterized constructor of circle");
//         this.radius = radius;
//     }
//     public double getArea(){
//         return Math.PI*radius*radius;
//     }
//     public double getVolume(){
//         System.out.println("Volume is not applicable for a circle");
//         return 0;
//     }
// }

// class cylinder extends circle {
//     int height;
//     public cylinder (){
//         System.out.println("I am a non parameterized constructor of cylinder");
//     }
//     public cylinder (int radius, int height){
//         super(radius);
//         this.height = height;
//     }
//     @Override
//     public double getArea(){
//         return 2 * Math.PI * radius * (radius + height);
//     }
//     @Override
//     public double getVolume(){
//         return Math.PI * radius * radius * height;
//     }
// }

// public class CWH38practice {
//     public static void main(String[] args) {
//         circle crc = new circle(5);
//         System.out.println("Area of circle : " + crc.getArea());
//         crc.getVolume();

//         cylinder cyl = new cylinder(5,10);
//         System.out.println("Area of cylinder: " + cyl.getArea());
//         System.out.println("Volume of cylinder: " + cyl.getVolume());
//     }
// }







//  4. create method for area & volume in 2. also create getters and setters.



// class Rectangle {
//     public int length;
//     public int width;

//     public Rectangle() {
//         System.out.println("I am the non-parameterized constructor of Rectangle");
//     }

//     public Rectangle(int length, int width) {
//         System.out.println("I am the parameterized constructor of Rectangle");
//         this.length = length;
//         this.width = width;
//     }

//     public void setDimensions(int length, int width) {
//         this.length = length;
//         this.width = width;
//     }

//     public int getArea() {
//         return length * width;
//     }

//     public int getPerimeter() {
//         return 2 * (length + width);
//     }
// }

// class Cuboid extends Rectangle {
//     public int height;

//     public Cuboid() {
//         System.out.println("I am the non-parameterized constructor of Cuboid");
//     }

//     public Cuboid(int length, int width, int height) {
//         super(length, width);
//         System.out.println("I am the parameterized constructor of Cuboid");
//         this.height = height;
//     }

//     public void setDimensions(int length, int width, int height) {
//         super.setDimensions(length, width);
//         this.height = height;
//     }

//     public int getVolume() {
//         return length * width * height;
//     }
// }

// public class CWH38practice {
//     public static void main(String[] args) {
//         Rectangle rec = new Rectangle(2, 5);
//         System.out.println("Area of Rectangle: " + rec.getArea());
//         System.out.println("Perimeter of Rectangle: " + rec.getPerimeter());

//         Cuboid cub = new Cuboid(4, 5, 6);
//         System.out.println("Cuboid Volume: " + cub.getVolume());
//     }
// }




















//  problem 1 - create a class circle and use inheritance to create another class cylinder from it.


// class circle{
//     public int radius;

//     public circle(){
//         System.out.println("I am a non - parameterized constructor");
//     }
//     public circle(int radius){
//         System.out.println("I am a parametrized constructor ");
//         this.radius = radius;
//     }

//     public double area(){
//         return Math.PI*radius*radius;
//     }

// }

// class cylinder extends circle{
//     public int height;

//     public cylinder(int radius, int height){
//         super(radius);
//         System.out.println("I am a parametrized constructor");
//         this.radius = radius;
//         this.height = height;
//     }
//     public double area(){
//         return Math.PI*radius*radius*height;
//     }
// }

// public class CWH38practice {
//     public static void main(String[] args) {
//         // circle c = new circle(2);

//         cylinder cy = new cylinder(2, 4);
//     }
// }








//  problem 2 -

// class rectangle {
//     public int length;
//     public int width;

//     public rectangle(){
//         System.out.println("I am non-parameterized constructor");
//     }
//     public rectangle(int length, int width){
//         System.out.println("I am a parameterized constructor");
//         this.length = length;
//         this.width = width;
//     }
//     public int getArea(){
//         return length * width;
//     }
//     public int getPerimeter(){
//         return 2 * (length + width);
//     }
// }

// class cuboid extends rectangle{
//     public int height;

//     public cuboid(){
//         System.out.println("I am non-parameterized constructor");
//     }
//     public cuboid(int length, int width, int height){
//         super(length, width);
//         System.out.println("I am an parameterized constructor");
//         this.height = height;
//     }
    
//     public int getVolume(){
//         return length * width * height;
//     }
// }

// public class CWH38practice {
//     public static void main(String[] args) {
//         rectangle rec = new rectangle(2,4);
//         System.out.println("Area of rectangle " + rec.getArea());
//         System.out.println("Perimeter of rectangle " + rec.getPerimeter());

//         cuboid cu = new cuboid(2,4,6);
//         System.out.println("Volume of cuboid " + cu.getVolume());


//     }
// }




// public class CWH38practice {
//     public static void main(String[] args) {
        
//     }
// }