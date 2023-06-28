package main.java.com.verkhonina.basepatterns.creational.prototype;

public class BodyCellFactory {

    private BodyCell cell;


    public BodyCellFactory(BodyCell cell) {
        this.cell = cell;
    }


    public void setCell(BodyCell cell) {
        this.cell = cell;
    }

    public BodyCell copyBodyCell() {
        return (BodyCell) cell.copy();
    }
}
