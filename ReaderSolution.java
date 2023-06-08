package my.edu.utem.ftmk.dad.examattendsystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderSolution {
    
    public static void main(String[] args) {
        
        // Declare input file
        String sourceFile = "rainfallSimpangAmpat.txt";
        System.out.println("Reading data from " + sourceFile + "\n");
        
        try {
            
            // Create reader to read data
            Reader rainfallReader = new FileReader(sourceFile);
            BufferedReader bufferedReader = new BufferedReader(rainfallReader);
            
            // Processing line-based data
            double rainfalldata = 0;
            double totalrainfalldata = 0;
            int noOfRecords = 0;
            
            // Read data line by line
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                
                // Parse data
                rainfalldata = Double.parseDouble(line);
                System.out.println(rainfalldata);
                
                // Calculate total rainfall
                totalrainfalldata += rainfalldata;
                noOfRecords++;
            }
            
            // Close reader
            bufferedReader.close();
            
            // Calculate average rainfall
            double averageRainfall = totalrainfalldata / noOfRecords;
            String formattedAverage = String.valueOf(averageRainfall);
            System.out.print("\nAverage Rainfall for " + noOfRecords
                    + " Days In Simpang Ampat: " + formattedAverage);
            
        } catch (IOException ex) {
            
            ex.printStackTrace();
        }
        
        // Indicate end of program - Could be successful
        System.out.println("\nEnd of program.");
    }
}
