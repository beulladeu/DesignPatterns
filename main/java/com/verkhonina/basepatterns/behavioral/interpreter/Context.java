package main.java.com.verkhonina.basepatterns.behavioral.interpreter;

public class Context {

    public Expression evaluate(String expression) {
        int position = expression.length() - 1;
        while (position > 0) {
            if (Character.isDigit(expression.charAt(position))) {
                position--;
            } else {
                String currentNumber = expression.substring(position + 1);
                Expression left = evaluate(expression.substring(0, position));
                Expression right = new NumberExpression(Integer.parseInt(currentNumber));
                char operator = expression.charAt(position);
                if (operator == '-') return new MinusExpression(left, right);
                else if (operator == '+') return new PlusExpression(left, right);
            }
        }
        return new NumberExpression(Integer.parseInt(expression));
    }
}
