package CoreJavaPreparation.ClassAndObject;

class Student {

    String name;
    int age;

    static void displayStudent(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Nishant";
        s1.age = 22;

        Student.displayStudent(s1.name, s1.age);
    }
}
