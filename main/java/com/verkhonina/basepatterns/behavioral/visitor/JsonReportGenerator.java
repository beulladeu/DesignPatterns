package main.java.com.verkhonina.basepatterns.behavioral.visitor;

public class JsonReportGenerator implements ReportGenerator{
    @Override
    public void generateReport(Department department) {
        System.out.println("Department information is loading to json report...");
    }

    @Override
    public void generateReport(Team team) {
        System.out.println("Team information is loading to json report...");
    }

    @Override
    public void generateReport(Employer employer) {
        System.out.println("Employer information is loading to json report...");
    }
}
