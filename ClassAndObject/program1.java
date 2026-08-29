package CoreJavaPreparation.ClassAndObject;

class Student{

    String name;
    int rollNo;
    float marks;

    void display(){
        System.out.println("Student name : " + name);
        System.out.println("Student Roll Number : " + rollNo);
        System.out.println("Student marks : " + marks);
    }

    public static void main(String[] args){
        Student s1 = new Student();

        s1.name = "Nishant";
        s1.rollNo = 231;
        s1.marks = 78;
        s1.display();
    }
}