import javax.swing.JTextField;

public class Bicycle implements CarbonFootprint{
    private double distance;
    private final int emission = 40;

    public Bicycle(double miles)
    {
        distance = miles;
    }

    public void setDistance(double yearTotal)
    {
        distance = yearTotal;
    }

    public double getTotalMiles()
    {
        return distance;
    }


    public void information()
    {
        System.out.print("Class: Bicycle \n");
        System.out.print("Carbon Footprint information: \n");
        System.out.print("The distance in miles per year comes to about: " + this.getTotalMiles() + "\n");
    }

    public double getCarbonFootprint()
    {
        return distance * emission;
    }

}