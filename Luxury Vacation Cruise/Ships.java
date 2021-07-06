public class Ships {
    private String nameOfShip;
    private int balconyView;
    private int oceanView;
    private boolean inService;
    private int suiteRoom;
    private int interiorRoom;

    public Ships(String nameOfShip, int balconyView, int oceanView, boolean inService, int suiteRoom, int interiorRoom) {
        this.nameOfShip = nameOfShip;
        this.balconyView = balconyView;
        this.oceanView = oceanView;
        this.inService = inService;
        this.suiteRoom = suiteRoom;
        this.interiorRoom = interiorRoom;
    }

    public String getNameOfShip() {
        return nameOfShip;
    }

    public void setNameOfShip(String nameOfShip) {
        this.nameOfShip = nameOfShip;
    }

    public int getBalconyView() {
        return balconyView;
    }

    public void setBalconyView(int balconyView) {
        this.balconyView = balconyView;
    }

    public int getOceanView() {
        return oceanView;
    }

    public void setOceanView(int oceanView) {
        this.oceanView = oceanView;
    }

    public boolean isInService() {
        return inService;
    }

    public void setInService(boolean inService) {
        this.inService = inService;
    }

    public int getSuiteRoom() {
        return suiteRoom;
    }

    public void setSuiteRoom(int suiteRoom) {
        this.suiteRoom = suiteRoom;
    }

    public int getInteriorRoom() {
        return interiorRoom;
    }

    public void setInteriorRoom(int interiorRoom) {
        this.interiorRoom = interiorRoom;
    }

    public void printShip(){
        int spacing;
        String space = "";
        spacing = 20 - nameOfShip.length();

        for(int i = 1; i <= spacing; i++){
            space = space + " ";
        }
        System.out.println(nameOfShip + spacing + balconyView + "\t" + oceanView + "\t" + suiteRoom + "\t" + interiorRoom
        + "\t\t" + inService);
    }

    @Override
    public String toString() {
        return nameOfShip;
    }
}

