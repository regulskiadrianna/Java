/*
This program uses a CarbonFootprint interface. This program calculates appropriate carbon
footprint for each class.
*/

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<CarbonFootprint> carbon_footprint = new ArrayList<CarbonFootprint>();
        Bicycle bicycle= new Bicycle();
        Building building = new Building(5,5.125f);
        Car car = new Car(500,2.78f);
        carbon_footprint.add(bicycle);
        carbon_footprint.add(building);
        carbon_footprint.add(car);

        Iterator<CarbonFootprint> iterator = carbon_footprint.iterator();
        while(iterator.hasNext()){
            iterator.next().getCarbonFootprint();
        }
    }
}
