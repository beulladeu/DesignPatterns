package main.java.com.verkhonina.basepatterns.structural.decorator;

public class DecoratorRunner {
    public static void main(String[] args) {
        System.out.print("Student: ");
        Student student = new SimpleStudent();
        System.out.println(student.study());

        System.out.print("Diligent student: ");
        Student student1 = new DiligentStudent(new SimpleStudent());
        System.out.println(student1.study());

        System.out.print("Senior student: ");
        Student student2 = new SeniorStudent(new DiligentStudent(new SimpleStudent()));
        System.out.println(student2.study());
    }
}
