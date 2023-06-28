package main.java.com.verkhonina.basepatterns.creational.singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logFile = "Test log file\n";

    public static synchronized ProgramLogger getProgramLogger() {
        if (programLogger == null) {
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

    public void addLogInfo(String logInfo) {
        logFile += logInfo + "\n";
    }

    public void showLogInfo() {
        System.out.println(logFile);
    }
}
