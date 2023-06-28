package main.java.com.verkhonina.basepatterns.behavioral.visitor;

public interface ReportGenerator {
    void generateReport(Department department);

    void generateReport(Team team);

    void generateReport(Employer employer);
}
