
//     String name;

//     public int getSalary(){
//         return salary;
//     }
//     public String getName(){
//         return name;
//     }
//     public void  setName(String n){
//          name = n;
//      }
// }
// public class CWH400practice {
//     public static void main(String[] args) {
//         Employee shubham = new Employee();
//         shubham.setName("CodeWithShubham");
//         System.out.println(shubham.getName());
//         shubham.salary = 233;
//         System.out.println(shubham.getSalary());
//     }
// }




// problem 2

// class cellphone{
//     public void ring(){
//         System.out.println("ringing...");
//     }
//     public void vibrate(){
//         System.out.println("vibrating...");
//     }
//     public void callFriend(){
//         System.out.println("calling a subhanshu");
//     }
// }

// public class CWH400practice {
//     public static void main(String[] args) {
//         cellphone cp = new cellphone();
//         cp.ring();
//         cp.vibrate();
//         cp.callFriend();
        
//     }
// }





// problem 3


// class square{
//     int a;

//     public int getArea(){
//         return a * a;
//     }
//     public int getPerimeter(){
//         return 4 * a;
//     }
// }

// public class CWH400practice {
//     public static void main(String[] args) {
//         square sq = new square();
//         sq.a = 2;
//         System.out.println(sq.getArea());
//         System.out.println(sq.getPerimeter());
//     }
// }




// practice 4


// class rectangle{
//     int length;
//     int width;

//     public int getArea(){
//         return  length * width;
//     }
//     public int getPerimeter(){
//         return 2 * (length + width);
//     }
// }


// public class CWH400practice {
//     public static void main(String[] args) {
//         rectangle rec =  new rectangle();
//         rec.length = 2;
//         rec.width = 4;
//         System.out.println(rec.getArea());
//         System.out.println(rec.getPerimeter());
//     }
// }





// problem 6> a.


// public class CWH400practice {
//     public static void main(String[] args) {
//         int n = 4;
//         for(int i = n; i> 0; i--){
//             for(int j =0; j < i; j++){
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//     }
// }



// proble  6> b.


// public class CWH400practice {
//     public static void main(String[] args) {
//         for(int i = 4; i< 0; i++){
//             for(int j=0; j>i;j++){
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//     }
// }





// problem 13

// public class CWH400practice {
//     public static void main(String[] args) {
//         int n = 6;
//         for(int i = 1; i<=10 ; i++){
//             System.out.printf("%d x %d = %d\n", n, i, n*i);
//         }
//     }
// }





//  problem 14

// public class CWH400practice {
//     public static void main(String[] args) {
//         int n = 6;
//         for(int i=10; i>0; i--){
//             System.out.printf("%d x %d = %d\n", n, i, n*i);
//         }
//     }
// }




// problem 15   fiboancii

// class fibonacii {
    
//     public static int fibonacii(int n){
//         if(n <= 1){
//             return n;
//         }
//         else{
//             return fibonacii(n-1) + fibonacii(n-2);
//         }
//     }
//     public static void main(String[] args) {
//         int n = 10;
        
//         for(int i=0; i<n; i++){
//             System.out.println(fibonacii(i) +  " ");
//         }
//     }
// }




//  problem factorial

// class factorial{
//     public static int factorial(int n){
//         if(n  == 0){
//             return 1;
//         }
//         else{
//             return n * factorial(n-1);
//         }
//     }
//     public static void main(String [] args){
//         int num = 5;
//         System.out.println(factorial(num));
//     }
// }





//  problem 16 -  sum of array


// public class CWH400practice{
//     public static void main(String[] args) {
//         float [] arr = {10.5f, 12.5f, 56.5f, 34.5f, 67.5f};
//         float sum = 0;
//         for(int i=0 ;i <arr.length; i++){
//             sum += arr[i];
//         }
//         System.out.println(sum);
//     }
// }


  

//   problem 17 - reverse of an array


// public class CWH400practice{
//     public static void main(String[] args) {
//         int [] arr = {10, 20, 30, 40, 50};
//         for(int i = arr.length-1; i >= 0; i--){
//             System.out.println(arr[i]);
//         }
//     }
// }






//  problem  -  linear search


// public class CWH400practice{
//     public static int linearSearch(int [] arr , int target){
//         for(int i=0; i<arr.length; i++){
//             if(arr[i] == target){
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//        int [] arr = {10, 20, 30, 40, 50};
//        int target = 40;
//        int result = linearSearch(arr, target);
       
//        if(result != -1){
//            System.out.println("Element  found at index : " + result);
//        }
//        else{
//            System.out.println("Element not found at an array");
//        }
//     }
// }







//  problem  -  binary search


// public class CWH400practice {
//     public static int binarySearch(int []arr, int target){
//         int left = 0;
//         int right = arr.length-1;
        
//         while(left <= right){
//             int mid = (left + right)/2;
            
//             if(arr[mid] == target){
//                 return mid;
//             }
//             else if(arr[mid] < target){
//                 return mid + 1;
//             }
//             else{
//                 return mid - 1;
//             }
//         }
//         return -1;

//     }
    
    
//     public static void main(String [] args){
//         int [] arr = {10, 20, 30, 40, 50};
//         int target = 40;
//         int result = binarySearch(arr, target);
        
//         if(result != -1){
//             System.out.println("Element found at index " + result);
//         }
//         else{
//             System.out.println("Element not found");
//         }
//     }
// }





//  Q1

// class person{
//     int age;
//     String name;

//     public void age(int age){
//         return 
//     }
// }

// public class CWH400practice{
//     public static void main(String[] args) {
        
//     }
// }



//  Q1

// class person{
//     int age;
//     String name;

//     public person(int a, String b){
//         this.age = a;
//         this.name = b;
//     }

//     public int getAge(){
//         return age;
//     }

//     public String getName(){
//         return name;
//     }
// }

// public class CWH400practice{
//     public static void main(String[] args) {
//         person p = new person(15, "shubham");
//         System.out.println("Age of person " + p.getAge());
//         System.out.println("Name of person " + p.getName());

//     }
// }




//    q2.    
// class Dog {
//     String name;
//     String breed;

//     public Dog(String n, String b){
//         this.name = n;
//         this.breed = b;
//     }
//     public void SetName(String name){
//         this.name = name;
//     }

//     public String getName(){
//         return name;
//     }
//     public void setBreed(String breed){
//         this.breed = breed;
//     }
//     public String  getBreed(){
//         return breed;
//     }

//     public void printDetails(){
//         System.out.printf("Dog's Name: %s, Breed: %s%n", name, breed);
//     }
// }


// public class CWH400practice{
//     public static void main(String[] args) {
//         Dog d1 = new Dog("priyanshu", "pitbull");
//         Dog d2 = new Dog("Abhinav", "poodle");

//         System.out.println("Initial Details:");
//         d1.printDetails();
//         d2.printDetails();

//         d1.SetName("Abhinav");
//         d1.setBreed("pitbull");

//         d2.SetName("pandey");
//         d2.setBreed("labrador");

//         System.out.println("Updated Details:");
//         d1.printDetails();
//         d2.printDetails();
//     }
// }



//  Q3. Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle.

// class rectangle{
//     int width;
//     int height;

//     public void setWidth(int width){
//         this.width = width;
//     }
//     public void setheight(int height){
//         this.height = height;
//     }

//     public int getArea(){
//         return width * height;
//     }
//     public int getPerimeter(){
//         return 2 * (width + height);
//     }

// }


// public class CWH400practice {
//     public static void main(String[] args) {
//         rectangle rec = new rectangle();
//         rec.setWidth(2);
//         rec.setheight(4);
//         System.out.println("Area of rectangle " + rec.getArea());
//         System.out.println("Perimeter of rectangle " + rec.getPerimeter());

//     }
// }



//  4. Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute. Calculate the area and circumference of the circle.

// class circle{
//     private int radius;

//     public void setRadius(int radius){
//         this.radius = radius;
//     }

//     public double getCircumference(){
//         return  2 * Math.PI * radius;
//     }
//     public double getArea(){
//         return Math.PI * radius * radius;
//     }
// }

// public class CWH400practice {
//     public static void main(String[] args) {
//         circle crc = new circle();
//         crc.setRadius(4);
//         System.out.println("Circumference of circle " + crc.getCircumference());
//         System.out.println("Area of circle " + crc.getArea());
//     }
// }




//  5. Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and remove books from a collection.

// import java.util.ArrayList;

// class Book {
//     private String title;
//     private String author;
//     private String isbn;

//     public Book(String title, String author, String isbn) {
//         this.title = title;
//         this.author = author;
//         this.isbn = isbn;
//     }

//     public String getTitle() {
//         return title;
//     }

//     public void setTitle(String title) {
//         this.title = title;
//     }

//     public String getAuthor() {
//         return author;
//     }

//     public void setAuthor(String author) {
//         this.author = author;
//     }

//     public String getIsbn() {
//         return isbn;
//     }

//     public void setIsbn(String isbn) {
//         this.isbn = isbn;
//     }

//     public void printDetails() {
//         System.out.printf("Title: %s, Author: %s, ISBN: %s%n", title, author, isbn);
//     }
// }

// class BookCollection {
//     private ArrayList<Book> books;

//     public BookCollection() {
//         books = new ArrayList<>();
//     }

//     public void addBook(Book book) {
//         books.add(book);
//         System.out.println("Book added: " + book.getTitle());
//     }

//     public void removeBook(Book book) {
//         if (books.remove(book)) {
//             System.out.println("Book removed: " + book.getTitle());
//         } else {
//             System.out.println("Book not found in the collection.");
//         }
//     }

//     public void listBooks() {
//         System.out.println("Book Collection:");
//         for (Book book : books) {
//             book.printDetails();
//         }
//     }
// }

// public class CWH400practice {
//     public static void main(String[] args) {
//         Book book1 = new Book("1984", "George Orwell", "123456789");
//         Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "987654321");

//         BookCollection collection = new BookCollection();

//         collection.addBook(book1);
//         collection.addBook(book2);

//         collection.listBooks();

//         collection.removeBook(book1);

//         collection.listBooks();
//     }
// }





//  6. Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.


// class Employee{
//     String name;
//     String job_tittle;
//     int salary;

//     public Employee(String name, String job_tittle, int salary){
//         this.name = name;
//         this.job_tittle = job_tittle;
//         this.salary = salary;
//     }
//     public void setName(String name){
//         this.name = name;
//     }
//     public String getName(){
//         return name;
//     }
//     public void setJob_tittle(String job_tittle){
//         this.job_tittle = job_tittle;
//     }
//     public String getJob_tittle(){
//         return job_tittle;
//     }
//     public void setSalary(int salary){
//         this.salary = salary;
//     }
//     public int getSalary(){
//         return salary;
//     }
//     public int getAnnualSalary(){
//         return 12 * salary;
//     }
//     public void printDetails(){
//         System.out.printf("Name: %s, job_tittle: %s, Salary: %d", name, job_tittle, salary);
//     }

// }
// public class CWH400practice {
//     public static void main(String[] args) {
//         Employee e = new Employee("shubham" , "Manager" , 34);
//         e.printDetails();
        
//         System.out.println("\nAfter updated: ");
//         e.setName("golu");
//         e.setJob_tittle("Manager");
//         e.setSalary(32);
//         e.printDetails();

//     }
// }




// Q7. Write a Java program to create a class called "Bank" with a collection of accounts and methods to add and remove accounts, and to deposit and withdraw money. Also define a class called "Account" to maintain account details of a particular customer.


// import java.util.HashMap;
// import java.util.Map;

// class Account {
//     private String accountNumber;
//     private String accountHolderName;
//     private double balance;

//     public Account(String accountNumber, String accountHolderName, double initialBalance) {
//         this.accountNumber = accountNumber;
//         this.accountHolderName = accountHolderName;
//         this.balance = initialBalance;
//     }


//     public String getAccountNumber() {
//         return accountNumber;
//     }

//     public String getAccountHolderName() {
//         return accountHolderName;
//     }

//     public double getBalance() {
//         return balance;
//     }


//     public void deposit(double amount) {
//         if (amount > 0) {
//             balance += amount;
//             System.out.println("Deposited: " + amount + " | New Balance: " + balance);
//         } else {
//             System.out.println("Invalid deposit amount.");
//         }
//     }

//     public void withdraw(double amount) {
//         if (amount > 0 && amount <= balance) {
//             balance -= amount;
//             System.out.println("Withdrew: " + amount + " | New Balance: " + balance);
//         } else {
//             System.out.println("Invalid withdrawal amount.");
//         }
//     }
// }

// class Bank {
//     private Map<String, Account> accounts;

//     // Constructor
//     public Bank() {
//         accounts = new HashMap<>();
//     }

    
//     public void addAccount(Account account) {
//         if (!accounts.containsKey(account.getAccountNumber())) {
//             accounts.put(account.getAccountNumber(), account);
//             System.out.println("Account added: " + account.getAccountHolderName());
//         } else {
//             System.out.println("Account already exists.");
//         }
//     }

    
//     public void removeAccount(String accountNumber) {
//         if (accounts.containsKey(accountNumber)) {
//             accounts.remove(accountNumber);
//             System.out.println("Account removed: " + accountNumber);
//         } else {
//             System.out.println("Account not found.");
//         }
//     }

    
//     public void depositToAccount(String accountNumber, double amount) {
//         Account account = accounts.get(accountNumber);
//         if (account != null) {
//             account.deposit(amount);
//         } else {
//             System.out.println("Account not found.");
//         }
//     }

    
//     public void withdrawFromAccount(String accountNumber, double amount) {
//         Account account = accounts.get(accountNumber);
//         if (account != null) {
//             account.withdraw(amount);
//         } else {
//             System.out.println("Account not found.");
//         }
//     }

//     public void displayAccountDetails(String accountNumber) {
//         Account account = accounts.get(accountNumber);
//         if (account != null) {
//             System.out.println("Account Number: " + account.getAccountNumber());
//             System.out.println("Account Holder: " + account.getAccountHolderName());
//             System.out.println("Balance: " + account.getBalance());
//         } else {
//             System.out.println("Account not found.");
//         }
//     }
// }

// public class CWH400practice {
//     public static void main(String[] args) {
//         Bank bank = new Bank();

//         // Creating accounts
//         Account acc1 = new Account("1001", "sHUBHAM", 5000);
//         Account acc2 = new Account("1002", "SATYAJEET", 3000);

        
//         bank.addAccount(acc1);
//         bank.addAccount(acc2);

        
//         bank.displayAccountDetails("1001");

        
//         bank.depositToAccount("1001", 1500);
//         bank.withdrawFromAccount("1002", 500);

        
//         bank.displayAccountDetails("1001");
//         bank.displayAccountDetails("1002");

        
//         bank.removeAccount("1002");
//     }
// }





//  8. Write a Java program to create class called "TrafficLight" with attributes for color and duration, and methods to change the color and check for red or green.

// class TrafficLight {
//     private String color;
//     private int duration;

//     public TrafficLight(String color, int duration) {
//         this.color = color;
//         this.duration = duration;
//     }

//     public String getColor() {
//         return color;
//     }

//     public int getDuration() {
//         return duration;
//     }

//     public void changeColor(String newColor, int newDuration) {
//         this.color = newColor;
//         this.duration = newDuration;
//     }

//     public boolean isRed() {
//         return "red".equalsIgnoreCase(color);
//     }

//     public boolean isGreen() {
//         return "green".equalsIgnoreCase(color);
//     }
// }

// public class CWH400practice {
//     public static void main(String[] args) {
//         TrafficLight light = new TrafficLight("red", 30);
        
//         System.out.println("Color: " + light.getColor());
//         System.out.println("Duration: " + light.getDuration());
//         System.out.println("Is Red? " + light.isRed());
//         System.out.println("Is Green? " + light.isGreen());

//         light.changeColor("green", 60);

//         System.out.println("Color: " + light.getColor());
//         System.out.println("Duration: " + light.getDuration());
//         System.out.println("Is Red? " + light.isRed());
//         System.out.println("Is Green? " + light.isGreen());
//     }
// }


//  9. Write a Java program to create a class called "Employee" with a name, salary, and hire date attributes, and a method to calculate years of service.



// import java.time.LocalDate;
// import java.time.temporal.ChronoUnit;

// class Employee {
//     private String name;
//     private double salary;
//     private LocalDate hireDate;

//     public Employee(String name, double salary, LocalDate hireDate) {
//         this.name = name;
//         this.salary = salary;
//         this.hireDate = hireDate;
//     }

//     public String getName() {
//         return name;
//     }

//     public double getSalary() {
//         return salary;
//     }

//     public LocalDate getHireDate() {
//         return hireDate;
//     }

//     public long getYearsOfService() {
//         return ChronoUnit.YEARS.between(hireDate, LocalDate.now());
//     }
// }

// public class CWH400practice {
//     public static void main(String[] args) {
//         Employee emp = new Employee("Shubham", 50000, LocalDate.of(2015, 5, 10));

//         System.out.println("Name: " + emp.getName());
//         System.out.println("Salary: " + emp.getSalary());
//         System.out.println("Hire Date: " + emp.getHireDate());
//         System.out.println("Years of Service: " + emp.getYearsOfService());
//     }
// }





//  10

// import java.util.ArrayList;
// import java.util.List;

// class Student {
//     private String name;
//     private String grade;
//     private List<String> courses;

//     public Student(String name, String grade) {
//         this.name = name;
//         this.grade = grade;
//         this.courses = new ArrayList<>();
//     }

//     public String getName() {
//         return name;
//     }

//     public String getGrade() {
//         return grade;
//     }

//     public List<String> getCourses() {
//         return courses;
//     }

//     public void addCourse(String course) {
//         courses.add(course);
//     }

//     public void removeCourse(String course) {
//         courses.remove(course);
//     }
// }

// class CWH400practice {
//     public static void main(String[] args) {
//         Student student = new Student("Alice", "A");

//         student.addCourse("Mathematics");
//         student.addCourse("Physics");
//         student.addCourse("Chemistry");

//         System.out.println("Name: " + student.getName());
//         System.out.println("Grade: " + student.getGrade());
//         System.out.println("Courses: " + student.getCourses());

//         student.removeCourse("Physics");

//         System.out.println("Courses after removal: " + student.getCourses());
//     }
// }





