package main.java.com.verkhonina.basepatterns.behavioral.visitor;

public class ReportGeneratorRunner {
    public static void main(String[] args) {
        CompanyElement company = new Company();

        ReportGenerator jsonGenerator = new JsonReportGenerator();
        ReportGenerator csvGenerator = new CsvReportGenerator();

        company.loadToReport(jsonGenerator);

        System.out.println();

        company.loadToReport(csvGenerator);
    }
}
