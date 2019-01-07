package sample;

import java.io.FileWriter;
import java.io.IOException;

public class CSVWriter {
    public static void main(String[] args)
    {
        generateCsvFile("test.csv");
    }

    private static void generateCsvFile(String sFileName)
    {
        try
        {
            //creates CSV FILE
            FileWriter writer = new FileWriter(sFileName);

            //Appends to CSV FILE
            writer.append("Name");
            writer.append(",");
            writer.append("Age");
            writer.append("\n");

            writer.append("Ahmad");
            writer.append(",");
            writer.append("26");
            writer.append("\n");

            writer.append("Marian");
            writer.append(",");
            writer.append("29");

            //can still generate any data u want
            writer.flush();
            writer.close();

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
