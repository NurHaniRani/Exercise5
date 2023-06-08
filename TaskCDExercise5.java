package my.edu.utem.ftmk.dad.examattendsystem;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class TaskCDExercise5 {
	
	public static void main(String[] args) {

		// Declare output file 
		String sourceFile = "rainfallSimpangAmpat.txt";
		System.out.println("Reading data from " + sourceFile + "\n");

		try {

			// Create stream to read data
			DataInputStream rainfallInStream = new DataInputStream(new FileInputStream(sourceFile));

			// Processing byte-based data
			double rainfalldata = 0;
			double totalrainfalldata = 0;
			int noOfRecords = 0;
			
			// Process data until end-of-file
			while(rainfallInStream.available() > 0) {
				
				// Read data
				rainfalldata = rainfallInStream.readDouble();
				System.out.println(rainfalldata);
				
				// Calculate total rainfall
				totalrainfalldata += rainfalldata;
				noOfRecords ++;
			}
			
			// Close stream
			rainfallInStream.close();
			
			// Calculate average rainfall
			double averageRainfall = totalrainfalldata / noOfRecords;
			String formattedAverage = String.valueOf(averageRainfall);
			System.out.print("\nAverage Rainfall for " + noOfRecords 
					+ " Days In Simpang Ampat: " + formattedAverage);
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}

		// Indicate end of program - Could be successful
		System.out.println("\nEnd of program.");
	
	}
}
