package CoreJavaPreparation.ClassAndObject;

class Employee {

    String name;
    int id;
    double salary;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Monthly Salary: " + salary);
        System.out.println("Annual Salary: " + (salary * 12));
    }

    public static void main(String[] args) {

        Employee e1 = new Employee();

        e1.name = "Rahul";
        e1.id = 101;
        e1.salary = 30000;

        e1.display();
    }
}
