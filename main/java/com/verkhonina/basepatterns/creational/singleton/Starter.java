package main.java.com.verkhonina.basepatterns.creational.singleton;

public class Starter {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("Start..");
        ProgramLogger.getProgramLogger().addLogInfo("1");
        ProgramLogger.getProgramLogger().addLogInfo("2");
        ProgramLogger.getProgramLogger().addLogInfo("3");

        ProgramLogger.getProgramLogger().showLogInfo();
    }
}
