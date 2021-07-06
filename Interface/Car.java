public class Car implements CarbonFootprint {
    int kilometers;
    float amountOfFuelUsed;

    Car(int km, float fuel)
    {
        kilometers = km;
        amountOfFuelUsed = fuel;
    }

    public void getCarbonFootprint()
    {
        float carbon_footprint = kilometers*amountOfFuelUsed;
        System.out.println("Carbon FootPrint of Car: " + carbon_footprint);
    }

}
