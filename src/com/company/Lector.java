package com.company;

import java.util.Scanner;
import java.io.*;
public class Lector {
    public LinkedList list;

    public static void main() throws FileNotFoundException{

    }

    public Lector(LinkedList list) {
        this.list = list;
    }

    public Lector() {

    }


    public void leer() throws FileNotFoundException{
        try{
            File file=new File("data_set.csv");
            Scanner input=new Scanner(file);
            input.nextLine();

            while(input.hasNextLine()){
                try{
                    String str=input.nextLine();
                    Scanner lineScan =new Scanner(str).useDelimiter(",");
                    String ph;
                    String soil_temperature;
                    String soil_moisture;
                    String illu;
                    String env_temp;
                    String env_humid;
                    String label;

                    ph = lineScan.next();
                    soil_temperature=lineScan.next();
                    soil_moisture=lineScan.next();
                    illu=lineScan.next();
                    env_temp=lineScan.next();
                    env_humid=lineScan.next();
                    label=lineScan.nextLine();

                    list.insertBefore(0,Double.parseDouble(ph),Double.parseDouble(soil_temperature),
                            Double.parseDouble(soil_moisture),Double.parseDouble(illu),Double.parseDouble(env_temp),
                            Double.parseDouble(env_humid),label);

                }catch(Exception e){
                    System.out.println("Error in the conversion of data");
                }
            }

        }catch(Exception e){
            System.err.println("File not found exception!");
        }
    }


}