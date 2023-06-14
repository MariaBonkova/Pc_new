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
        System.out.println("Please enter part number(s): ");

        String[] input = new Scanner(System.in).nextLine().split(", ");

        if (input.length == 1) {
            CPU cpuByPartNumber = PcValidator.foundCpuByPartNumber(input[0], store);

            if (cpuByPartNumber != null) {
                existCpu(store, cpuByPartNumber);
            } else {
                PcPrinter.errorConfig();
            }

        } else if (input.length == 2) {
            String cpuByPartNumber = input[0];
            String motherBordByPartNumber = input[1];

            CPU foundCpuByPartNumber = PcValidator.foundCpuByPartNumber(cpuByPartNumber, store);
            Motherboard foundMotherboardByPartNumber = PcValidator.foundMotherBordByPartNumber(motherBordByPartNumber, store);

            if (foundCpuByPartNumber == null || foundMotherboardByPartNumber == null) {
                PcPrinter.errorDiffComponent();
            } else {
                existCpuAndMotherboard(store, motherBordByPartNumber, foundCpuByPartNumber);
            }

        } else if (input.length == 3) {
            String cpuByPartNumber = input[0];
            String motherBordByPartNumber = input[1];
            String memoryByPartNumber = input[2];

            CPU foundCpuByPartNumber = PcValidator.foundCpuByPartNumber(cpuByPartNumber, store);
            Motherboard foundMotherboardByPartNumber = PcValidator.foundMotherBordByPartNumber(motherBordByPartNumber, store);
            Memory foundMemoryByPartNumber = PcValidator.foundMemoryByPartNumber(memoryByPartNumber, store);

            if (foundCpuByPartNumber != null && foundMotherboardByPartNumber != null && foundMemoryByPartNumber != null) {
                existCupAndMotherboardAndMemory(store, motherBordByPartNumber, memoryByPartNumber, foundCpuByPartNumber, foundMemoryByPartNumber);
            } else {
                PcPrinter.errorDiffComponent();
            }

        }


    }

    private static void existCupAndMotherboardAndMemory(Store store, String motherBordByPartNumber, String memoryByPartNumber, CPU foundCpuByPartNumber, Memory foundMemoryByPartNumber) {
        String type = foundMemoryByPartNumber.getType();
        String cpuType = foundCpuByPartNumber.getSupportedMemory();
        String socketToByFound = foundCpuByPartNumber.getSocket();

        List<Motherboard> motherBoardByPartNumber = PcValidator.getMotherBoardByPartNumberAndSocket(socketToByFound, motherBordByPartNumber, store);
        List<Memory> memoryByPartNumberFilterByType = PcValidator.getMemoryByPartNumberFilterByType(type, memoryByPartNumber, store);

        if (!cpuType.equals(type)) {
            PcPrinter.errorConfig();
            PcPrinter.notCompatibleError(type);
        }
        PcPrinter.printConfig(foundCpuByPartNumber, motherBoardByPartNumber, memoryByPartNumberFilterByType);
    }

    private static void existCpuAndMotherboard(Store store, String motherBordByPartNumber, CPU foundCpuByPartNumber) {
        String socketToByFound = foundCpuByPartNumber.getSocket();
        List<Motherboard> motherBoardByPartNumber = PcValidator.getMotherBoardByPartNumberAndSocket(socketToByFound, motherBordByPartNumber, store);
        List<Memory> memoryPartNumber = PcValidator.getMemoryPartNumber(foundCpuByPartNumber.getSupportedMemory(), store);
        PcPrinter.printConfig(foundCpuByPartNumber, motherBoardByPartNumber, memoryPartNumber);
    }

    private static void existCpu(Store store, CPU cpuByPartNumber) {
        String socketToByFound = cpuByPartNumber.getSocket();
        List<Motherboard> motherBoardByPartNumber = PcValidator.getMotherBoardByPartNumber(socketToByFound, store);
        List<Memory> memoryPartNumber = PcValidator.getMemoryPartNumber(cpuByPartNumber.getSupportedMemory(), store);

        PcPrinter.printConfig(cpuByPartNumber, motherBoardByPartNumber, memoryPartNumber);
    }
}