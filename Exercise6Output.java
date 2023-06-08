package my.edu.utem.ftmk.dad.examattendsystem;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Exercise6Output {

    public static void main(String[] args) {
        writeRainfallData();
    }

    private static void writeRainfallData() {
        String outFile = "rainfallMelaka.txt";

        // Data declaration
        String[] stationIds = {"2322006", "2321006", "2324033", "2225044", "2222006", "2222033"};
        String[] stationNames = {"Melaka Pindah", "Ladang Lendu", "Hospital Jasin", "Chohong", "Cheng", "Batu Hampar"};
        String[] districts = {"Alor Gajah", "Alor Gajah", "Jasin", "Chohong", "Cheng", "Batu Hampar"};
        double[][] rainfallData = {
                {0.0, 0.0, 0.0, 0.0, 2.0, 18.5},
                {0.0, 2.0, 0.0, 0.0, 3.0, 4.0},
                {0.0, 0.0, 0.0, 0.0, 2.0, 18.5},
                {0.0, 0.0, 21.5, 0.0, 39.0, 14.5},
                {0.0, 0.0, 3.5, 0.0, 42.5, 10.0},
                {0.0, 0.0, 2.5, 0.0, 30.0, 11.5}
        };

        try {
            DataOutputStream rainfallOutStream = new DataOutputStream(new FileOutputStream(outFile));

            for (int i = 0; i < stationIds.length; i++) 
            {
                String id = stationIds[i];
                String name = stationNames[i];
                String district = districts[i];
                double[] data = rainfallData[i];
            rainfallOutStream.writeUTF(id);
            rainfallOutStream.writeUTF(name);
            rainfallOutStream.writeUTF(district);
            for (double value : data) {
                    rainfallOutStream.writeDouble(value);
                    }

                // Flush after each station
                rainfallOutStream.flush();
            }

            rainfallOutStream.close();

            System.out.println("End of program. Check out " + outFile);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
