package main.java.com.verkhonina.basepatterns.creational.builder;

public class Home {
    String homeName;
    int roomsNumber;
    boolean hasBasement;
    String roofType;
    String wallsColor;
    boolean hasSwimmingPool;
    boolean hasBackyard;

    public void setRoomsNumber(int roomsNumber) {
        this.roomsNumber = roomsNumber;
    }

    public void setHasBasement(boolean hasBasement) {
        this.hasBasement = hasBasement;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    public void setWallsColor(String wallsColor) {
        this.wallsColor = wallsColor;
    }

    public void setHasSwimmingPool(boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
    }

    public void setHasBackyard(boolean hasBackyard) {
        this.hasBackyard = hasBackyard;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }

    @Override
    public String toString() {
        return "Home {" +
                "homeName='" + homeName + '\'' +
                ", roomsNumber=" + roomsNumber +
                ", hasBasement=" + hasBasement +
                ", roofType='" + roofType + '\'' +
                ", wallsColor='" + wallsColor + '\'' +
                ", hasSwimmingPool=" + hasSwimmingPool +
                ", hasBackyard=" + hasBackyard +
                '}';
    }
}
