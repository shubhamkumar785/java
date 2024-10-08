class Employee {
    int id;
    String name;
    int salary;

    public void printDetails() {
        System.out.println("My id is " + id);
        System.out.println("and my name is " + name);
    }

    public int getSalary() {
        return salary;
    }
}

public class CWH27customclass {

    public static void main(String[] args) {
        System.out.println("This is our custom class");

        Employee shubham = new Employee();  // Instantiating a new employee object
        Employee john = new Employee();

        // Setting attributes
        shubham.id = 12;
        shubham.name = "CodeWithShubham";
        shubham.salary = 14;

        john.id = 13;
        john.name = "CodeWithJohn";
        john.salary = 34;

        // Printing the attributes using the printDetails method
        shubham.printDetails();
        john.printDetails();

        // Getting and printing the salary
        int shubhamSalary = shubham.getSalary();
        System.out.println("Shubham's salary is: " + shubhamSalary);

        int johnSalary = john.getSalary();
        System.out.println("John's salary is: " + johnSalary);
    }
}
