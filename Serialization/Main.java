/*
This program uses serialization. The program synthesizes the presenter's program. It uses and collects certain information.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    static int option;

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner userAnswer = new Scanner(System.in);

        boolean homework = true;
        while (homework) {
            homework = menuOptions();
        }
    }

    public static boolean  menuOptions() throws FileNotFoundException, IOException {
        Scanner userAnswer = new Scanner(System.in);
        System.out.println("Pick from the following menu options:  \n " +
                "1. Add information into a file. \n " +
                "2. Retrieve information from a file and display them. \n " +
                "3. Delete information. \n" +
                " 4. Update information \n " +
                "5. Exit. ");
        option = userAnswer.nextInt();
        menu();

        return false;
    }

    public static void menu() throws FileNotFoundException, IOException {
        Scanner userAnswer = new Scanner(System.in);
        switch(option)
        {
            case 1:
                Person adrianna = new Person("Adrianna Regulski");
                PhoneNum number = new PhoneNum("630-000-1234");
                DOB birthday = new DOB("08/23/1997");
                Email email = new Email("adriannaregulski@outlook.com");

                try {
                    writeToFile(adrianna, number, birthday, email);
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
                looping();
                break;
            case 2:
                try {
                    readFile();
                } catch (ClassNotFoundException | IOException e) {
                    System.out.println(e.getMessage());
                }
                looping();
                break;
            case 3:
                new FileOutputStream("Information.bin").close();
                looping();
                break;
            case 4:
                new FileOutputStream("Information.bin").close();
                System.out.println("Please select from the following: \n " +
                        "1. Jackie \n " +
                        "2. James \n " +
                        "3. Natalie \n " +
                        "4. Bailey \n " +
                        "5. Lukas");
                option = userAnswer.nextInt();
                switch(option) {
                    case 1:
                        Person jackie = new Person("Jackie Sim");
                        PhoneNum number2 = new PhoneNum("630-123-1234");
                        DOB birthday2 = new DOB("09/21/2000");
                        Email email2 = new Email("JackieSim@outlook.com");
                        try {
                            writeToFile(jackie, number2, birthday2, email2);
                        } catch (IOException e) {
                            System.out.println(e.getMessage());
                        }
                    case 2:
                        Person james = new Person("James Bond");
                        PhoneNum number3 = new PhoneNum("630-123-0987");
                        DOB birthday3 = new DOB("02/22/1997");
                        Email email3 = new Email("JamesBond@outlook.com");
                        try {
                            writeToFile(james, number3, birthday3, email3);
                        } catch (IOException e) {
                            System.out.println(e.getMessage());
                        }
                    case 3:
                        Person natalie = new Person("Natalie Jackson");
                        PhoneNum number4 = new PhoneNum("630-112-0900");
                        DOB birthday4 = new DOB("09/23/1998");
                        Email email4 = new Email("NatalieJackson@outlook.com");
                        try {
                            writeToFile(natalie, number4, birthday4, email4);
                        } catch (IOException e) {
                            System.out.println(e.getMessage());
                        }
                    case 4:
                        Person bailey = new Person("Bailey Young");
                        PhoneNum number5 = new PhoneNum("630-009-0092");
                        DOB birthday5 = new DOB("07/21/1970");
                        Email email5 = new Email("BaileyYoung@outlook.com");
                        try {
                            writeToFile(bailey, number5, birthday5, email5);
                        } catch (IOException e) {
                            System.out.println(e.getMessage());
                        }
                    case 5:
                        Person lukas = new Person("Lukas Szpala");
                        PhoneNum number6 = new PhoneNum("630-843-2012");
                        DOB birthday6 = new DOB("04/27/1992");
                        Email email6 = new Email("LukasSzpala@outlook.com");
                        try {
                            writeToFile(lukas, number6, birthday6, email6);
                        } catch (IOException e) {
                            System.out.println(e.getMessage());
                        }

                }
                looping();
            case 6:
                break;
        }
    }
    public static void looping() throws FileNotFoundException, IOException {
        Scanner userAnswer = new Scanner(System.in);
        int exit;
        System.out.println("1. Menu \n2. Exit");
        exit = userAnswer.nextInt();
        switch(exit)
        {
            case 1:
                menuOptions();
                break;
            case 2:
                break;
        }
    }

    public static void writeToFile (Person personName, PhoneNum telephoneNumber, DOB dateOfBirth, Email emailAddress) throws IOException {
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Information.bin"));

        output.writeObject(personName);
        output.writeObject(telephoneNumber);
        output.writeObject(dateOfBirth);
        output.writeObject(emailAddress);
    }

    public static void readFile() throws IOException, ClassNotFoundException {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("Information.bin"));

        Person personsName = (Person) input.readObject();
        PhoneNum telephone = (PhoneNum) input.readObject();
        DOB birthDate = (DOB) input.readObject();
        Email email = (Email) input.readObject();
        System.out.println(personsName);
        System.out.println(telephone);
        System.out.println(birthDate);
        System.out.println(email);
    }
}
