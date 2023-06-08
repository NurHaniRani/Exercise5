package my.edu.utem.ftmk.dad.examattendsystem;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TaskABExercise5 {
	
	public static void main(String[] args) {
		
		// Declare output file 
		String rainfallout = "rainfallSimpangAmpat.txt";
		
		// Data declaration
	    double raindata[] = {0.0, 4.0, 1.0, 0.0, 6.0, 19.0};
	    
	    try {
	    	
	    	// Create stream to read data
		    DataOutputStream rainfallOutStream = new DataOutputStream(new FileOutputStream(rainfallout));
		    
		    for (int index = 0; index < raindata.length; index++) {
				
				// Write data into data stream
				rainfallOutStream.writeDouble(raindata[index]);
				
				// Flush for each writing
				rainfallOutStream.flush();
			}
			
			// Close stream
		    rainfallOutStream.close();
            
	    }
	    catch (Exception ex) {
			
			ex.printStackTrace();
		}
		
		// Indicate end of program - Could be successful
		System.out.println("End of program. Check out " + rainfallout); 
	}
	

}