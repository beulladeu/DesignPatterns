package main.java.com.verkhonina.basepatterns.behavioral.template;

public class TemplateMethodRunner {
    public static void main(String[] args) {
        GameTemplate strategy = new StrategyGame();
        GameTemplate adventure = new AdventureGame();

        strategy.run();
        System.out.println("===========");
        adventure.run();
    }
}
