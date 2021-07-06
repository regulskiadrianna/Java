public class Cruises {
    private String nameOfCruise;
    private String nameOfShip;
    private String departureDestination;
    private String arrivalDestination;
    private String returningDestination;

    Cruises(){

    }
    public Cruises(String nameOfCruise, String nameOfShip, String departureDestination, String arrivalDestination, String returningDestination) {
        this.nameOfCruise = nameOfCruise;
        this.nameOfShip = nameOfShip;
        this.departureDestination = departureDestination;
        this.arrivalDestination = arrivalDestination;
        this.returningDestination = returningDestination;
    }

    public String getNameOfCruise() {
        return nameOfCruise;
    }

    public void setNameOfCruise(String nameOfCruise) {
        this.nameOfCruise = nameOfCruise;
    }

    public String getNameOfShip() {
        return nameOfShip;
    }

    public void setNameOfShip(String nameOfShip) {
        this.nameOfShip = nameOfShip;
    }

    public String getDepartureDestination() {
        return departureDestination;
    }

    public void setDepartureDestination(String departureDestination) {
        this.departureDestination = departureDestination;
    }

    public String getArrivalDestination() {
        return arrivalDestination;
    }

    public void setArrivalDestination(String arrivalDestination) {
        this.arrivalDestination = arrivalDestination;
    }

    public String getReturningDestination() {
        return returningDestination;
    }

    public void setReturningDestination(String returningDestination) {
        this.returningDestination = returningDestination;
    }

    @Override
    public String toString() {
        return nameOfCruise;
    }

    public void printCruise(){
        String spacing = "";
        String[] extraSpaceArray = {"","","","",""};
        int[] spacingArray = new int[5];

        spacingArray[0] = 20 - nameOfCruise.length(); spacingArray[1] = 20 - nameOfShip.length();
        spacingArray[2] = 20 - departureDestination.length(); spacingArray[3] = 20 - arrivalDestination.length();
        spacingArray[4] = 20 - returningDestination.length();

        for (int i = 0; i < spacingArray.length; ++i){
            for (int j = 0; j < spacingArray[i]; j++){
                extraSpaceArray[i] += " ";
            }
        }
        System.out.println(nameOfCruise + spacingArray[0] + nameOfShip + spacingArray[1] + departureDestination + spacingArray[2] +
                arrivalDestination + spacingArray[3] + returningDestination) ;




    }
}
