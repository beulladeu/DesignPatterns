package main.java.com.verkhonina.basepatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ApartmentFactory {
    private Map<ApartmentType, Flat> apartments = new HashMap<>();

    public Flat getApartmentByType(ApartmentType type) {
        Flat flat = apartments.get(type);

        if (flat == null) {
            switch (type) {
                case FiveRooms:
                    System.out.println("Five Rooms apartment building...");
                    flat = new FiveRoomsApartment();
                    break;
                case Studio:
                    System.out.println("Studio apartment building...");
                    flat = new StudioApartment();
                    break;
                default:
                    break;
            }
        }
        apartments.put(type, flat);
        return flat;
    }
}
