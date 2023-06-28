package main.java.com.verkhonina.basepatterns.structural.decorator;

public class DiligentStudent extends StudentDecorator{
    public DiligentStudent(Student student) {
        super(student);
    }

    public String writeScientificArticles() {
        return "Writes a scientific articles; ";
    }

    @Override
    public String study() {
        return super.study() + writeScientificArticles();
    }
}
