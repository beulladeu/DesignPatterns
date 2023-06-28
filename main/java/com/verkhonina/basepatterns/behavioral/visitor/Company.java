package main.java.com.verkhonina.basepatterns.behavioral.visitor;

import java.util.ArrayList;

public class Company implements CompanyElement {
    private CompanyElement[] companyElements;

    public Company() {
        this.companyElements = new CompanyElement[] {
                new Department(),
                new Team(),
                new Employer()
        };
    }

    @Override
    public void loadToReport(ReportGenerator generator) {
        for (CompanyElement companyElement: companyElements) {
            companyElement.loadToReport(generator);
        }
    }
}
