package main.java.com.verkhonina.basepatterns.structural.decorator;

public class SeniorStudent extends StudentDecorator{

    public SeniorStudent(Student student) {
        super(student);
    }

    public String writeDiploma() {
        return "Writes a diploma; ";
    }

    @Override
    public String study() {
        return super.study() + writeDiploma();
    }
}
