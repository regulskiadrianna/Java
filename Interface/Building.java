public class Building implements CarbonFootprint {
    int numberOfStoreys;
    float amountOfFuelUsed;

    Building(int storeys, float fuel)
    {
        numberOfStoreys = storeys;
        amountOfFuelUsed = fuel;
    }

    public void getCarbonFootprint()
    {
        float carbon_footprint = numberOfStoreys*amountOfFuelUsed;
        System.out.println("Building Carbon Foot Print : " + carbon_footprint);
    }

}