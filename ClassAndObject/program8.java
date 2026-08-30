package CoreJavaPreparation.ClassAndObject;

class Employee {

    String name;
    double salary;

    static double calculateBonus(double salary) {
        return salary * 0.10;
    }

    public static void main(String[] args) {

        Employee e1 = new Employee();

        e1.name = "Rahul";
        e1.salary = 30000;

        double bonus = Employee.calculateBonus(e1.salary);

        System.out.println("Employee Name: " + e1.name);
        System.out.println("Salary: " + e1.salary);
        System.out.println("Bonus: " + bonus);
    }
}