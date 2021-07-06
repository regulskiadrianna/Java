public class Car implements CarbonFootprint {
    private double yearlyMiles;
    private double mpg;
    private final int carbon = 10;

    public Car(double totMiles, double gallonMiles)
    {
        mpg = gallonMiles;
        yearlyMiles = totMiles;
    }

    public void setMPG(double gallonMiles)
    {
        mpg = gallonMiles;
    }
    public double getMPG()
    {
        return mpg;
    }
    public void setYearlyMiles(double totMiles)
    {
        yearlyMiles = totMiles;
    }
    public double getYearlyMiles()
    {
        return yearlyMiles;
    }

    public void information()
    {
        System.out.print("Class: Car \n");
        System.out.print("Carbon Footprint information: \n");
        System.out.print("The distance in miles per year comes to about: " + this.getYearlyMiles() + "\n");
        System.out.print("The distance in miles per gallon comes to about: " + this.getMPG() + "\n");
    }

    public double getCarbonFootprint()
    {
        return((getYearlyMiles() *
                getMPG()) * carbon);

    }

}
