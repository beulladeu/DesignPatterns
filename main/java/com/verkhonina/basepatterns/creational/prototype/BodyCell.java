package main.java.com.verkhonina.basepatterns.creational.prototype;

public class BodyCell implements Copyable {

    private int nucleusDiameter;
    private int wallThickness;

    public BodyCell(int nucleusDiameter, int wallThickness) {
        this.nucleusDiameter = nucleusDiameter;
        this.wallThickness = wallThickness;
    }

    public int getNucleusDiameter() {
        return nucleusDiameter;
    }

    public void setNucleusDiameter(int nucleusDiameter) {
        this.nucleusDiameter = nucleusDiameter;
    }

    public int getWallThickness() {
        return wallThickness;
    }

    public void setWallThickness(int wallThickness) {
        this.wallThickness = wallThickness;
    }

    @Override
    public Object copy() {
        return new BodyCell(nucleusDiameter, wallThickness);
    }

    @Override
    public String toString() {
        return "BodyCell{" +
                "nucleusDiameter=" + nucleusDiameter +
                ", wallThickness=" + wallThickness +
                '}';
    }
}
