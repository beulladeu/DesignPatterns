package main.java.com.verkhonina.basepatterns.structural.decorator;

public class StudentDecorator implements Student{
    private Student student;

    public StudentDecorator(Student student) {
        this.student = student;
    }

    @Override
    public String study() {
        return student.study();
    }
}
