package main.java.com.verkhonina.basepatterns.creational.prototype;

public class BodyCellDivisionRunner {

    public static void main(String[] args) {
        BodyCell cell = new BodyCell(10, 5);
        System.out.println(cell);

        BodyCellFactory cellFactory = new BodyCellFactory(cell);
        BodyCell copyCell = cellFactory.copyBodyCell();
        System.out.println(copyCell);
    }
}
