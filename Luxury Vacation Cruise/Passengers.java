public class Passengers {
    private String passengerName;
    private String cruiseTakenByPassenger;
    private String roomReserved;

    Passengers(){

    }

    public Passengers(String passengerName, String cruiseTakenByPassenger, String roomReserved) {
        this.passengerName = passengerName;
        this.cruiseTakenByPassenger = cruiseTakenByPassenger;
        this.roomReserved = roomReserved;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getCruiseTakenByPassenger() {
        return cruiseTakenByPassenger;
    }

    public void setCruiseTakenByPassenger(String cruiseTakenByPassenger) {
        this.cruiseTakenByPassenger = cruiseTakenByPassenger;
    }

    public String getRoomReserved() {
        return roomReserved;
    }

    public void setRoomReserved(String roomReserved) {
        this.roomReserved = roomReserved;
    }

    public void printPassengerInformation(){
        int spacing;
        String spacing1 = "";
        String spacing2 = "";
        spacing = 20 - passengerName.length();
        for (int i = 1; i <= spacing; i++){
            spacing1 = spacing1 + " ";
        }
        spacing = 20 - cruiseTakenByPassenger.length();
        for (int i = 1; i <= spacing; i++){
            spacing2 = spacing2 + " ";
        }

        System.out.println(passengerName + spacing1 + cruiseTakenByPassenger + spacing2 + roomReserved);
    }

    @Override
    public String toString() {
        return passengerName;
    }
}
