package main.java.com.verkhonina.basepatterns.behavioral.visitor;

public class Employer implements CompanyElement{
    @Override
    public void loadToReport(ReportGenerator generator) {
        generator.generateReport(this);
    }
}
