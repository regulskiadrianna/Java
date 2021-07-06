public class Building implements CarbonFootprint{
    private double kwh;
    private final int time = 12;

    public Building(double totalEnergy)
    {
        setKWH(totalEnergy);
    }

    public void setKWH(double powerPerMonth)
    {
        kwh = powerPerMonth;
    }

    public double getEnergyUse()
    {
        return kwh;
    }

    public void information()
    {
        System.out.print("Class: Building \n");
        System.out.print("Carbon Footprint information: \n");
        System.out.print("Energy consumption per month: " + this.getEnergyUse() + "\n");
    }

    public double getCarbonFootprint()
    {
        return this.getEnergyUse() * time;
    }
}
