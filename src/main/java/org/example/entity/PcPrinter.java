package org.example.entity;

import java.util.List;

public class PcPrinter {

    public static void printConfig(CPU cpu, List<Motherboard> motherboards, List<Memory> memories) {
        int count=0;

        for (Motherboard motherboard : motherboards) {
            for (Memory memory : memories) {
                count++;
                System.out.printf("Combination %d\n",count);
                System.out.println(cpu);
                System.out.println(motherboard);
                System.out.println(memory);
                double totalPrice = Double.parseDouble(cpu.getPrice()) + Double.parseDouble(memory.getPrice()) + Double.parseDouble(motherboard.getPrice());
                System.out.println("Price: " + totalPrice);
                System.out.println();

            }
        }
        System.out.printf("There are %d possible combinations:\n",count);

    }
    public static void errorConfig(){
        System.out.println("ERROR: The selected configuration is not valid.");
    }
    public static void errorDiffComponent(){
        System.out.println("ERROR: Please choose different component types.");
    }
    public static void notCompatibleError(String type) {
        System.out.printf("Memory of type %s is not compatible with the CPU\n",type);
    }
}
