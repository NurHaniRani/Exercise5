package my.edu.utem.ftmk.dad.examattendsystem;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Exercise6Input {

    public static void main(String[] args) {
        readRainfallData();
    }

    private static void readRainfallData() {
        String sourceFile = "rainfallMelaka.txt";
        System.out.println("Reading data from " + sourceFile + "\n");

        try {
            DataInputStream rainfallInStream = new DataInputStream(new FileInputStream(sourceFile));

            while (rainfallInStream.available() > 0) {
                String id = rainfallInStream.readUTF();
                String name = rainfallInStream.readUTF();
                String district = rainfallInStream.readUTF();

                System.out.println("Station id: " + id);
                System.out.println("Station Name: " + name);
                System.out.println("District Name: " + district);

                System.out.println("Rainfall Data");

                int numOfDays = 0;
                double totalRainfall = 0;

                while (rainfallInStream.available() > 0) {
                    double rainfall = rainfallInStream.readDouble();
                    System.out.println(rainfall);

                    totalRainfall += rainfall;
                    numOfDays++;
                }

                double averageRainfall = totalRainfall / numOfDays;
                String formattedAverage = String.format("%.2f", averageRainfall);
                System.out.println("Average Rainfall for " + numOfDays + " Days: " + formattedAverage);
                System.out.println();
            }

            rainfallInStream.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println("End of program.");
    }
}
