package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSVReader
{
    public static void main (String[] args)
    {
        //.csv comma sepaqrated values file
        String fileName = "test.csv";
        File file = new File(fileName);
        try
        {
            Scanner inputStream = new Scanner(file);
            while(inputStream.hasNext())
            {
                String data = inputStream.next();
                System.out.println(data);
            }
            inputStream.close();
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
