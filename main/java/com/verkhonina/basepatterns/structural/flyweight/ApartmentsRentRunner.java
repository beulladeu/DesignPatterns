package main.java.com.verkhonina.basepatterns.structural.flyweight;

import java.util.LinkedList;
import java.util.List;

public class ApartmentsRentRunner {
    public static void main(String[] args) {

        ApartmentFactory apartmentFactory = new ApartmentFactory();
        List<Flat> apartments = new LinkedList<>();

        apartments.add(apartmentFactory.getApartmentByType(ApartmentType.Studio));
        apartments.add(apartmentFactory.getApartmentByType(ApartmentType.Studio));
        apartments.add(apartmentFactory.getApartmentByType(ApartmentType.Studio));

        apartments.add(apartmentFactory.getApartmentByType(ApartmentType.FiveRooms));
        apartments.add(apartmentFactory.getApartmentByType(ApartmentType.FiveRooms));
        apartments.add(apartmentFactory.getApartmentByType(ApartmentType.FiveRooms));

        for (Flat flat: apartments) {
            flat.busy();
            flat.free();
        }
    }
}
