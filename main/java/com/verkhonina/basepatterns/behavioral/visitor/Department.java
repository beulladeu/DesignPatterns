package main.java.com.verkhonina.basepatterns.behavioral.visitor;

public class Department implements CompanyElement{
    @Override
    public void loadToReport(ReportGenerator generator) {
        generator.generateReport(this);
    }
}
