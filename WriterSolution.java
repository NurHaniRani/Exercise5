package my.edu.utem.ftmk.dad.examattendsystem;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterSolution {
    
    public static void main(String[] args) {
        
        // Declare output file
        String rainfallout = "rainfallSimpangAmpat.txt";
        
        // Data declaration
        double raindata[] = {0.0, 4.0, 1.0, 0.0, 6.0, 19.0};
        
        try {
            
            // Create writer to write data
            Writer rainfallWriter = new FileWriter(rainfallout);
            
            for (int index = 0; index < raindata.length; index++) {
                
                // Write data into writer
                rainfallWriter.write(Double.toString(raindata[index]));
                rainfallWriter.write(System.lineSeparator());
                
                // Flush for each writing
                rainfallWriter.flush();
            }
            
            // Close writer
            rainfallWriter.close();
            
        } catch (IOException ex) {
            
            ex.printStackTrace();
        }
        
        // Indicate end of program - Could be successful
        System.out.println("End of program. Check out " + rainfallout);
    }
}
