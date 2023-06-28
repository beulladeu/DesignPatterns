package main.java.com.verkhonina.basepatterns.behavioral.interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {
        Context context = new Context();
        Expression result = context.evaluate("1-8+7");
        System.out.println(result.interpret());
    }
}
