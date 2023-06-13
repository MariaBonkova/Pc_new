package org.example.entity;

import java.util.List;

public class PcPrinter {
    public static void printConfig(CPU cpu, List<Motherboard> motherboards, List<Memory> memories) {
        System.out.printf("There are %d possible combinations:\n",1+ motherboards.size()+ memories.size());
        for (Motherboard motherboard : motherboards) {
            for (Memory memory : memories) {
                System.out.println(cpu);
                System.out.println(motherboard);
                System.out.println(memory);
                double totalPrice = Double.parseDouble(cpu.getPrice()) + Double.parseDouble(memory.getPrice()) + Double.parseDouble(motherboard.getPrice());
                System.out.println("Price: " + totalPrice);
                System.out.println();

            }
        }
    }
    public static void errorConfig(){
        System.out.println("ERROR: The selected configuration is not valid.");
    }
}
