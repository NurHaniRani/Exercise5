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
		    
	    	
	    	// Process data
	    	rainfallOutStream.writeInt(raindata.length);

            for (double rainfall : raindata) {
            	rainfallOutStream.writeDouble(rainfall);
            	}
            
            // Flush the data
            rainfallOutStream.flush();
            
            // Close Stream
            rainfallOutStream.close();
            
            // Program Ending Indication
            System.out.println("End of program. Check out " + rainfallout);
            
	    }
	    catch (IOException e) {
            e.printStackTrace();
        }
	}
	

}