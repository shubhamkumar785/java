class Employee{
    private int id;
    private String name;

    //  use constructor 
    public Employee(){  
        id = 45;
        name = "Your Name Here";
    }

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }

    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
}


public class CWH30constructor {
    public static void main(String[] args) {
        Employee shubham = new Employee();
        // shubham.setName("CodeWithShubham");
        // shubham.setId(23);
        System.out.println(shubham.getName());
        System.out.println(shubham.getId());
    }
}






// overload the employee constructor to initialize the salary to rs 10,000.


// class Employee{
//     private String name;
//     private int salary;

//     public Employee(String name){
//         this.name = name;
//         this.salary = 10000;
//     }
//     public Employee(String name, int salary){
//         this.name = name;
//         this.salary = salary;
//     }

//     public void setName(String name){
//         this.name = name;
//     }
//     public String getName(){
//         return name;
//     }
//     public void setSalary(int salary){
//         this.salary = salary;
//     }
//     public int getSalary(){
//         return salary;
//     }

// }

// public class CWH30constructor {
//     public static void main(String[] args) {
//         Employee shubham = new Employee("Harry");
//         System.out.println(shubham.getName());
//         System.out.println(shubham.getSalary());

//         Employee golu = new Employee("harry", 15000);
//         System.out.println(golu.getName());
//         System.out.println(golu.getSalary());
//     }

// }