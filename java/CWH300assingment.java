
// public class CWH300assingment {
    // problem 1 - Write a Java program to check if a number is even or odd using an
    // if-else statement.

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter a number");
    // int num = sc.nextInt();
    // if(num % 2 == 0){
    // System.out.println(num + " is even number");
    // }
    // else{
    // System.out.println(num + " is a odd number");
    // }
    // }

    // problem 2 - Create a Java program that prints "Pass" if a student’s score is
    // 50 or more, otherwise prints "Fail".

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter a marks obtained");
    // int marks = sc.nextInt();
    // if(marks >= 50){
    // System.out.println("congratulations!, you have pass");
    // }
    // else{
    // System.out.println("Sorry!, you have fail");
    // }
    // }

    // problem 3 - Write a Java program that takes a character input and checks if
    // it is a vowel or consonant using a switch statement.

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter a character");
    // char c = sc.next().charAt(0);

    // switch(c){
    // case 'a':
    // case 'e':
    // case 'i':
    // case 'o':
    // case 'u':
    // System.out.println(c + " is a vowel");
    // break;
    // default:
    // System.out.println(c + " is a constant");
    // }

    // }

    // problem 4 - Develop a Java program to find the maximum of three numbers using
    // nested if-else statements.

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter a number 1");
    // int num1 = sc.nextInt();

    // System.out.println("Enter a number 2");
    // int num2 = sc.nextInt();

    // System.out.println("Enter a number 3");
    // int num3 = sc.nextInt();

    // int max;

    // if(num1 > num2){
    // if(num1 > num3){
    // max = num1;
    // }
    // else{
    // max = num3;
    // }
    // }
    // else{
    // if(num2 > num3){
    // max = num2;
    // }
    // else{
    // max = num3;
    // }
    // }
    // System.out.println("The maximun number of the three number is " + max);

    // }

    // problem 5 - Write a Java program to print all numbers from 1 to 100 that are
    // divisible by 5 using a for loop.

    // public static void main(String[] args) {
    // System.out.println("number from 1 to 100 that are divisible by 5");

    // for(int i=0; i<= 100; i++){
    // if(i % 5 == 0){
    // System.out.println(i);
    // }
    // }

    // }

    // problem 6 - Create a Java program that uses a while loop to sum the digits of
    // an integer.

    // problem 8 - Develop a Java program to print the first 10 Fibonacci numbers
    // using a for loop.

    // public static void main(String[] args) {
    // int n = 10;
    // int first = 0, second = 1;

    // System.out.println("the first 10 fibonacci series are");

    // for(int i=1; i<=n; i++){
    // System.out.println(first);

    // int next = first + second;
    // first = second;
    // second = next;
    // }
    // }

    // problem 9 -
    // }

// class Circle {
//     int radius;

//     public double getArea() {
//             return Math.PI * radius * radius;
//         }

//     public double getPerimeter() {
//         return 2 * Math.PI * radius;
//     }
// }


// public class CWH300assingment {
//     public static void main(String[] args) {
//         System.out.println("Try programiz.pro");

//         Circle circ = new Circle();
//         circ.radius = 2;

//         System.out.println(circ.getArea());
//         System.out.println(circ.getPerimeter());
//     }
// }












//  11

//  11. 

// import java.util.ArrayList;
// import java.util.List;

// class Book {
//     private String title;
//     private String author;

//     public Book(String title, String author) {
//         this.title = title;
//         this.author = author;
//     }

//     public String getTitle() {
//         return title;
//     }

//     public String getAuthor() {
//         return author;
//     }
// }

// class Library {
//     private List<Book> books;

//     public Library() {
//         books = new ArrayList<>();
//     }

//     public void addBook(Book book) {
//         books.add(book);
//     }

//     public void removeBook(String title) {
//         books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
//     }

//     public List<Book> getBooks() {
//         return books;
//     }
// }

// public class CWH300assingment {
//     public static void main(String[] args) {
//         Library library = new Library();

//         Book book1 = new Book("To Kill a Mockingbird", "Harper Lee");
//         Book book2 = new Book("1984", "George Orwell");

//         library.addBook(book1);
//         library.addBook(book2);

//         library.removeBook("1984");

//         for (Book book : library.getBooks()) {
//             System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
//         }
//     }
// }




//  12

// class Airplane {
//     private String flightNumber;
//     private String destination;
//     private String departureTime;
//     private boolean delayed;

//     public Airplane(String flightNumber, String destination, String departureTime) {
//         this.flightNumber = flightNumber;
//         this.destination = destination;
//         this.departureTime = departureTime;
//         this.delayed = false;
//     }

//     public String getFlightNumber() {
//         return flightNumber;
//     }

//     public String getDestination() {
//         return destination;
//     }

//     public String getDepartureTime() {
//         return departureTime;
//     }

//     public void delayFlight(String newDepartureTime) {
//         this.departureTime = newDepartureTime;
//         this.delayed = true;
//     }

//     public String checkFlightStatus() {
//         return delayed ? "Delayed" : "On Time";
//     }
// }

// public class CWH300assingment {
//     public static void main(String[] args) {
//         Airplane flight = new Airplane("AI123", "New York", "10:00 AM");

//         System.out.println("Flight Number: " + flight.getFlightNumber());
//         System.out.println("Destination: " + flight.getDestination());
//         System.out.println("Departure Time: " + flight.getDepartureTime());
//         System.out.println("Status: " + flight.checkFlightStatus());

//         flight.delayFlight("12:00 PM");

//         System.out.println("New Departure Time: " + flight.getDepartureTime());
//         System.out.println("Status: " + flight.checkFlightStatus());
//     }
// }




//  13
// import java.util.HashMap;
// import java.util.Map;

// class Product {
//     private String name;
//     private int quantity;

//     public Product(String name, int quantity) {
//         this.name = name;
//         this.quantity = quantity;
//     }

//     public String getName() {
//         return name;
//     }

//     public int getQuantity() {
//         return quantity;
//     }

//     public void setQuantity(int quantity) {
//         this.quantity = quantity;
//     }
// }

// class Inventory {
//     private Map<String, Product> products;

//     public Inventory() {
//         products = new HashMap<>();
//     }

//     public void addProduct(String name, int quantity) {
//         if (products.containsKey(name)) {
//             Product product = products.get(name);
//             product.setQuantity(product.getQuantity() + quantity);
//         } else {
//             products.put(name, new Product(name, quantity));
//         }
//     }

//     public void removeProduct(String name) {
//         products.remove(name);
//     }

//     public boolean checkLowInventory(String name, int threshold) {
//         if (products.containsKey(name)) {
//             return products.get(name).getQuantity() < threshold;
//         }
//         return false;
//     }

//     public void displayInventory() {
//         for (Product product : products.values()) {
//             System.out.println("Product: " + product.getName() + ", Quantity: " + product.getQuantity());
//         }
//     }
// }

// public class CWH300assingment {
//     public static void main(String[] args) {
//         Inventory inventory = new Inventory();

//         inventory.addProduct("Laptop", 10);
//         inventory.addProduct("Mouse", 50);
//         inventory.addProduct("Keyboard", 30);

//         System.out.println("Low inventory for 'Mouse': " + inventory.checkLowInventory("Mouse", 20));

//         inventory.removeProduct("Keyboard");

//         inventory.displayInventory();
//     }
// }



//  14 

// import java.util.ArrayList;
// import java.util.List;

// class School {
//     private List<String> students;
//     private List<String> teachers;
//     private List<String> classes;

//     public School() {
//         students = new ArrayList<>();
//         teachers = new ArrayList<>();
//         classes = new ArrayList<>();
//     }

//     public void addStudent(String student) {
//         students.add(student);
//     }

//     public void removeStudent(String student) {
//         students.remove(student);
//     }

//     public void addTeacher(String teacher) {
//         teachers.add(teacher);
//     }

//     public void removeTeacher(String teacher) {
//         teachers.remove(teacher);
//     }

//     public void createClass(String className) {
//         classes.add(className);
//     }

//     public void displaySchoolInfo() {
//         System.out.println("Students: " + students);
//         System.out.println("Teachers: " + teachers);
//         System.out.println("Classes: " + classes);
//     }
// }

// public class CWH300assingment {
//     public static void main(String[] args) {
//         School school = new School();

//         school.addStudent("Alice");
//         school.addStudent("Bob");
//         school.addTeacher("Mr. Smith");
//         school.addTeacher("Ms. Johnson");
//         school.createClass("Math 101");
//         school.createClass("History 202");

//         school.displaySchoolInfo();

//         school.removeStudent("Bob");
//         school.removeTeacher("Ms. Johnson");

//         school.displaySchoolInfo();
//     }
// }




//  15
// import java.util.ArrayList;
// import java.util.List;
// import java.util.Random;

// class Song {
//     private String title;
//     private String artist;

//     public Song(String title, String artist) {
//         this.title = title;
//         this.artist = artist;
//     }

//     public String getTitle() {
//         return title;
//     }

//     public String getArtist() {
//         return artist;
//     }

//     @Override
//     public String toString() {
//         return title + " by " + artist;
//     }
// }

// class MusicLibrary {
//     private List<Song> songs;

//     public MusicLibrary() {
//         songs = new ArrayList<>();
//     }

//     public void addSong(Song song) {
//         songs.add(song);
//     }

//     public void removeSong(String title) {
//         songs.removeIf(song -> song.getTitle().equalsIgnoreCase(title));
//     }

//     public void playRandomSong() {
//         if (!songs.isEmpty()) {
//             Random random = new Random();
//             int index = random.nextInt(songs.size());
//             Song song = songs.get(index);
//             System.out.println("Playing: " + song);
//         } else {
//             System.out.println("No songs in the library.");
//         }
//     }
// }

// public class CWH300assingment {
//     public static void main(String[] args) {
//         MusicLibrary library = new MusicLibrary();

//         library.addSong(new Song("Imagine", "John Lennon"));
//         library.addSong(new Song("Bohemian Rhapsody", "Queen"));
//         library.addSong(new Song("Hotel California", "Eagles"));

//         library.playRandomSong();

//         library.removeSong("Imagine");

//         library.playRandomSong();
//     }
// }











//   14. Write a Java program to create a class called "School" with attributes for students, teachers, and classes, and methods to add and remove students and teachers, and to create classes.

// import java.util.ArrayList;

// class student {
//     String name;
//     int id;

//     public student(String name, int id){
//         this.name = name;
//         this.id = id;
//     }
//     public String getName(){
//         return name;
//     }
//     public int getId(){
//         return id;
//     }
// }

// class teacher{
//     private String name;
//     private String subject;

//     public teacher(String name, String subject){
//         this.name = name;
//         this.subject = subject;
//     }
//     public String getName(){
//         return name;
//     }
//     public String getSubject(){
//         return subject;
//     }
// }

// class SchoolClass {
//     private String name;
//     private Teacher teacher;
//     private List<Student> students;

//     public SchoolClass(String name, Teacher teacher) {
//         this.name = name;
//         this.teacher = teacher;
//         this.students = new ArrayList<>();
//     }


// public class CWH300assingment{
//     public static void main(String[] args) {
        
//     }
// }
