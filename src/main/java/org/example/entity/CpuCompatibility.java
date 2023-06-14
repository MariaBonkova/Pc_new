package org.example.entity;

public interface CpuCompatibility {

    CPU foundCpuByPartNumber(String partNum, Store store);
    Motherboard foundMotherBordByPartNumber(String partNum, Store store);
    Memory foundMemoryByPartNumber(String partNum, Store store);



}
