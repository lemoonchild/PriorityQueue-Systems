package Controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadFile {

    public ArrayList<String> readUserTxt(String userPath){

        ArrayList<String> arrayUserProcess = new ArrayList<String>();

        try {
            FileReader file = new FileReader(userPath);
            BufferedReader reader = new BufferedReader(file);
            String line = reader.readLine();

            while (line != null) {

                String[] userProcess = line.split(",");
                arrayUserProcess.addAll(Arrays.asList(userProcess));
                line = reader.readLine();
            }

            reader.close();
            file.close();

        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + userPath);
            e.printStackTrace();
        }

        return arrayUserProcess;
    }

}