/*
This program implements GUI features from homework 9. It calculates the car, bicycle, and building
carbon footprint information.
Adrianna Regulski
Homework 10
 */

import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Homework10 start = new Homework10();
    }
}

class Homework10 extends JFrame {
    JRadioButton car;
    JRadioButton bicycle;
    JRadioButton building;
    JButton total;
    JTextArea display;
    ArrayList<CarbonFootprint> carbonFootPrint = new ArrayList<CarbonFootprint>();

    public Homework10()
    {

        final JFrame gui = new JFrame("CarbonFootprint Calculator");

        car = new JRadioButton();
        bicycle = new JRadioButton();
        building = new JRadioButton();

        total = new JButton("Press to calculate");

        car.setText("Car");
        bicycle.setText("Bicycle");
        building.setText("Building");


        ButtonGroup bGroup = new ButtonGroup();
        bGroup.add(car);
        bGroup.add(bicycle);
        bGroup.add(building);


        display = new JTextArea(20, 40);

        PrintStream displayText = new PrintStream(new CustomOutputStream(display));
        System.setOut(displayText);
        System.setErr(displayText);

        gui.setLayout(new FlowLayout());
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(500, 200);

        gui.getContentPane().add(car);
        gui.getContentPane().add(bicycle);
        gui.getContentPane().add(building);
        gui.getContentPane().add(total);
        gui.getContentPane().add(display);

        gui.setVisible(true);

        total.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (car.isSelected()) {
                    carbonFootPrint.clear();
                    display.setText(null);
                    carbonFootPrint.add(new Car(100, 5));
                    for(CarbonFootprint showFootPrint : carbonFootPrint)
                    {
                        System.out.print("Carbon Footprint of Car: " + showFootPrint.getCarbonFootprint() + "\n" );
                        showFootPrint.information();
                    }
                }
                if (bicycle.isSelected()) {
                    carbonFootPrint.clear();
                    display.setText(null);
                    carbonFootPrint.add(new Bicycle(900));
                    for(CarbonFootprint showFootPrint : carbonFootPrint)
                    {
                        System.out.print("Carbon Footprint of Bicycle: " + showFootPrint.getCarbonFootprint()+ "\n" );
                        showFootPrint.information();
                    }
                }
                if (building.isSelected()) {
                    carbonFootPrint.clear();
                    display.setText(null);
                    carbonFootPrint.add(new Building(1800));
                    for(CarbonFootprint showFootPrint : carbonFootPrint)
                    {
                        System.out.print("Carbon Footprint of Building: " + showFootPrint.getCarbonFootprint() + "\n" );
                        showFootPrint.information();
                    }
                }

            }
        });
    }

    public class CustomOutputStream extends OutputStream {
        private JTextArea textArea;

        public CustomOutputStream(JTextArea textArea) {
            this.textArea = textArea;
        }

        @Override
        public void write(int a) throws IOException {
            textArea.append(String.valueOf((char)a));
            textArea.setCaretPosition(textArea.getDocument().getLength());
            textArea.update(textArea.getGraphics());
        }
    }
}




