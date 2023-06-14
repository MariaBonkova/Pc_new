package org.example.entity;

import java.util.List;
import java.util.stream.Collectors;

public class PcValidator  {

    public static CPU foundCpuByPartNumber(String partNum, Store store) {
        return store.getCpus().stream().filter(cpu -> cpu.getPartNumber().equals(partNum)).findFirst().orElse(null);
    }

    public static Motherboard foundMotherBordByPartNumber(String partNum, Store store) {
        return store.getMotherboards().stream().filter(motherboard -> motherboard.getPartNumber().equals(partNum)).findFirst().orElse(null);
    }

    public static List<Motherboard> getMotherBoardByPartNumber(String socket, Store store) {
        return store.getMotherboards()
                .stream()
                .filter(motherboard -> motherboard.getSocket().equals(socket))
                .collect(Collectors.toList());

    }

    public static List<Motherboard> getMotherBoardByPartNumberAndSocket(String socket, String partNumMotherBoard, Store store) {
        return store.getMotherboards()
                .stream()
                .filter(motherboard -> motherboard.getPartNumber().equals(partNumMotherBoard))
                .filter(motherboard -> motherboard.getSocket().equals(socket))
                .collect(Collectors.toList());

    }

    public static Memory foundMemoryByPartNumber(String partNum, Store store) {
        return store.getMemories().stream().filter(memory -> memory.getPartNumber().equals(partNum)).findFirst().orElse(null);
    }

    public static List<Memory> getMemoryPartNumber(String supportedMemory, Store store) {
        return store.getMemories().stream().filter(memory -> memory.getType().equals(supportedMemory)).collect(Collectors.toList());

    }

    public static List<Memory> getMemoryByPartNumberFilterByType(String type, String partNumMemory, Store store) {
        return store.getMemories()
                .stream()
                .filter(memory -> memory.getPartNumber().equals(partNumMemory))
                .filter(memory -> memory.getType().equals(type))
                .collect(Collectors.toList());

    }


}
