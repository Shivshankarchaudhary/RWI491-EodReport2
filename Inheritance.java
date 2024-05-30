
class Employee{
    private
    int age=30;

    public
    int salary=40000;
    int id=301;
    
    void walk(){
        System.out.println("Walking");
    }
}

class Inheritance extends Employee{
    public static void main(String[] args) {
        Inheritance obj=new Inheritance();
        System.out.println(obj.salary);
        System.out.println(obj.id);
        System.out.println(obj.age);  // error: age has private access in Employee
        obj.walk();
    }
}