package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.entity.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Gson gson = new GsonBuilder().create();
        FileReader reader = new FileReader("src/main/resources/pc-store-inventory.json");
        Store store = gson.fromJson(reader, Store.class);

        String[] input = new Scanner(System.in).nextLine().split(", ");
        if (input.length==1){


            CPU cpuByPartNumber = PcValidator.getCpuByPartNumber(input[0],store);
            if (cpuByPartNumber!=null){
                String socketToByFound = cpuByPartNumber.getSocket();

                List<Motherboard> motherBoardByPartNumber = PcValidator.getMotherBoardByPartNumber(socketToByFound, store);
                List<Memory> memoryPartNumber = PcValidator.getMemoryPartNumber(cpuByPartNumber.getSupportedMemory(), store);

                PcPrinter.printConfig(cpuByPartNumber,motherBoardByPartNumber,memoryPartNumber);
            }else {
                PcPrinter.errorConfig();
            }


        }else  if (input.length==2){
            System.out.println("2");
        }



    }
}