/*
The following program provides accurate and efficient simple menu-based system that performs
core functions that are essential to the daily operations of the Luxury Vacation Cruise company.
The program consists of ships, cruises, and passengers. The company does not own ships however, it creates
cruises using available ships. When a ship is places in service, it is available for cruises.
Passengers can be added to cruises. A menu is displayed to show different options a user can select from.

Author: Adrianna Regulski
Task: Final project
*/

import java.util.ArrayList;
import java.util.Scanner;

public class LuxuryVacationCruise {
    static String optionPicked;
    private static ArrayList<Passengers> passengers = new ArrayList<>();
    private static ArrayList<Cruises> cruises = new ArrayList<>();
    private static ArrayList<Ships> ships = new ArrayList<>();

    public static void main(String[] args) {
        //Methods used to add passengers, cruises, ships
        addInformationAboutPassengers();
        addInformationAboutCruises();
        addInformationAboutShips();

        boolean luxuryVacationCruise = true;
        while (luxuryVacationCruise) {
            luxuryVacationCruise = goToMenu();
        }
    }

    public static void addInformationAboutPassengers() {
        Passengers first = new Passengers("Adrianna Regulski", "Dreamland Vacation", "Balcony");
        passengers.add(first);
        Passengers second = new Passengers("Sarina Brown", "Dreamland Vacation", "Ocean");
        passengers.add(second);
        Passengers third = new Passengers("James Bond", "Daily Escape", "Suite");
        passengers.add(third);
    }

    public static void addInformationAboutCruises() {
        Cruises first = new Cruises("Dreamland Vacation", "Chicago Ship", "Chicago", "Cancun", "Texas");
        cruises.add(first);
        Cruises second = new Cruises("Daily Escape", "In the Water", "Texas", "United Kingdom", "Spain");
        cruises.add(second);
        Cruises third = new Cruises("New World", "Pirate Ship", "California", "Riviera Maya", " Chicago");
        cruises.add(third);
    }

    public static void addInformationAboutShips() {
        Ships first = new Ships("Chicago Ship", 100, 100, true, 50, 20);
        ships.add(first);
        Ships second = new Ships("In the Water", 102, 300, true, 30, 300);
        ships.add(second);
        Ships third = new Ships("Pirate Ship", 200, 30, false, 399, 30);
        ships.add(third);
    }

    public static void startOver() {
        goToMenu();
    }

    public static boolean goToMenu() {
        Scanner answer = new Scanner(System.in);
        System.out.println("\n\n--------- Luxury Vacation Cruise Menu ------------------- ");
        System.out.println("|                                                       | ");
        System.out.println("|  [1] Add Ship		    [A] Print Ship Names            |"
                + " \n|  [2] Edit Ship        [B] Print Ship in Service List  |"
                + "\n|  [3] Add Cruise       [C] Print Ship Full List        |\n|  [4] Edit Cruise      [D] Print Cruise List           |"
                + "\n|  [5] Add Passenger	[E] Print Cruise Details        |\n|  [6] Edit Passenger	[F] Print Passenger List        |"
                + "\n|  [x] Exit System                                      |");
        System.out.println("---------------------------------------------------------");
        optionPicked = answer.nextLine();
        menu();

        return false;
    }

    public static void menu() {
        switch (optionPicked) {
            case "1":
                Scanner addShipByUser = new Scanner(System.in);
                boolean readyToUse = false;

                System.out.print("Please enter if the ship is available using (Yes/No): ");
                String ifAvailable = addShipByUser.nextLine();
                if (ifAvailable.equalsIgnoreCase("Yes")) {
                    readyToUse = true;
                } else {
                    readyToUse = false;
                }

                System.out.print("Please enter the name of the ship: ");
                String nameOfShip = addShipByUser.nextLine();
                System.out.print("Please enter the number of Ocean rooms: ");
                int oceanView = addShipByUser.nextInt();
                System.out.print("Please enter the number of Balcony rooms: ");
                int balconyView = addShipByUser.nextInt();
                System.out.print("Please enter the number of Interior rooms: ");
                int interiorRoom = addShipByUser.nextInt();
                System.out.print("Please enter the number of Suite rooms: ");
                int suiteRoom = addShipByUser.nextInt();

                Ships addingNew = new Ships(nameOfShip, balconyView, oceanView, readyToUse, suiteRoom, interiorRoom);
                ships.add(addingNew);
                startOver();
                break;

            case "A":
                String printShipName = "shipName";
                if (printShipName == "shipName") {
                    System.out.println("Ships");
                    for (int i = 0; i < ships.size(); i++) {
                        System.out.println(ships.get(i));
                    }
                }
                startOver();
                break;

            case "2":
                Scanner editShipByUser = new Scanner(System.in);
                for(int i = 0; i < ships.size(); i++){
                    System.out.println((i+1) +": " + ships.get(i).getNameOfShip());
                }
                System.out.println("Please enter the ship to edit: ");
                int editShip = editShipByUser.nextInt();
                ships.remove(editShip-1);

                System.out.print("Please enter the name of the ship: ");
                nameOfShip = editShipByUser.nextLine();
                System.out.print("Please enter the number of Ocean rooms: ");
                oceanView = editShipByUser.nextInt();
                System.out.print("Please enter the number of Balcony rooms: ");
                balconyView = editShipByUser.nextInt();
                System.out.print("Please enter the number of Interior rooms: ");
                interiorRoom = editShipByUser.nextInt();
                System.out.print("Please enter the number of Suite rooms: ");
                suiteRoom = editShipByUser.nextInt();

                addingNew = new Ships(nameOfShip, balconyView, oceanView, true, suiteRoom, interiorRoom);
                ships.add(addingNew);
                startOver();
                break;
            case "B":
                String shipInService = "service";
                if (shipInService == "service") {
                    int available = 0;
                    System.out.println("Ships in service");
                    for (int i = 0; i < ships.size(); i++) {
                        if (ships.get(i).isInService()) {
                            System.out.println(ships.get(i).toString());
                            available++;
                        }
                    }
                }
                startOver();
                break;
            case "3":
                Scanner userInputCruise = new Scanner(System.in);
                System.out.print("Please enter the name of the cruise: ");
                String nameOfTheCruise = userInputCruise.nextLine();
                System.out.print("Please enter the name of the ship: ");
                String nameOfTheShip = userInputCruise.nextLine();
                System.out.print("Please enter the departing location: ");
                String leavingLocation = userInputCruise.nextLine();
                System.out.print("Please enter the arriving destination: ");
                String arrivingLocation = userInputCruise.nextLine();
                System.out.print("Please enter the returning destination: ");
                String returningLocation = userInputCruise.nextLine();

                Cruises addCruise = new Cruises(nameOfTheCruise, nameOfTheShip, leavingLocation, arrivingLocation, returningLocation);
                cruises.add(addCruise);

                startOver();
                break;

            case "C":
                String printingShip = "List";
                if (printingShip == "List") {
                    System.out.println("                    Our Ship Details                      \n"
                            + "Ships   Balcony Ocean  Suite Interior Service ");
                    for (Ships shipInfo : ships)
                        shipInfo.printShip();
                }
                startOver();
                break;

            case "4":
                Scanner userInputEditCruise = new Scanner(System.in);

                System.out.println(cruises);
                System.out.println("Select from cruises to remove \n1. Dreamland Vacation \n2. Daily Escape \n3. New World");
                String editingCruise = userInputEditCruise.nextLine();
                if (editingCruise == "1") {
                    cruises.remove(1);
                } else if (editingCruise == "2") {
                    cruises.remove(0);
                } else if (editingCruise == "3") {
                    cruises.remove(2);
                }
                startOver();
                break;

            case "D":
                String listOfC = "listOfCruises";
                if (listOfC == "listOfCruises") {
                    System.out.println("    List of Cruises    ");
                    for (int i = 0; i < cruises.size(); i++) {
                        System.out.println(cruises.get(i));
                    }
                }
                startOver();
                break;

            case "5":
                Scanner userInputPassenger = new Scanner(System.in);
                System.out.println("Please enter the full name of a passenger: ");
                String fullName = userInputPassenger.nextLine();
                System.out.println("Please enter the cruise name the passenger is taking: ");
                String cruiseTakenByPassenger = userInputPassenger.nextLine();
                System.out.println("Please enter the room type the passenger will have \nOcean \nBalcony \nInterior \nSuite");
                String roomOrderedByPassenger = userInputPassenger.nextLine();

                Passengers addPassenger = new Passengers(fullName, cruiseTakenByPassenger, roomOrderedByPassenger);
                passengers.add(addPassenger);
                startOver();
                break;

            case "E":
                String cruiseDetails = "cruiseInfo";
                if (cruiseDetails == "cruiseInfo") {
                    System.out.println("                        Cruise Information           ");
                    System.out.println("Cruise  Ship  Leaving Location  Arrival location  Returning Location");
                    for (Cruises detailOfCruise : cruises)
                        detailOfCruise.printCruise();
                }
                startOver();
                break;

            case "6":
                Scanner userInputEditPassenger = new Scanner(System.in);
                System.out.println(passengers);
                System.out.println("Please enter which passenger would you like removed: ");
                String editPassenger = userInputEditPassenger.nextLine();
                if (editPassenger == "Adrianna Regulski") {
                    passengers.remove(1);
                } else if (editPassenger == "Sarina Brown") {
                    passengers.remove(0);
                } else if (editPassenger == "James Bond") {
                    passengers.remove(2);
                }
                startOver();
                break;

            case "F":
                System.out.println("            List Of Passengers           ");
                System.out.println("Name                Trip Name           Room");
                for (Passengers listOfP : passengers)
                    listOfP.printPassengerInformation();
                startOver();
                break;
            default:
                System.out.println("Thank you for choosing us!");
                break;
        }
    }
}

















