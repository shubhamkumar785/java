class MyEmployee{
    private int id;
    private String name;

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


public class CWH29modifier {
    public static void main(String[] args) {
        MyEmployee shubham = new MyEmployee();

        // ---> throws an error due to private access modifier
        // shubham.id = 45;
        // shubham.name = "CodeWithShubham";
        // System.out.println(shubham.id);
        // System.out.println(shubham.name);


        shubham.setId(45);
        System.out.println(shubham.getId());

        shubham.setName("CodeWithShubham");
        System.out.println(shubham.getName());

    }

}