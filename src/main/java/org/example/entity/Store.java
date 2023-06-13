package org.example.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Store {
    @SerializedName("CPUs")
    private List<CPU> cpus;
    @SerializedName("Memory")
    private List<Memory> memories;
    @SerializedName("Motherboards")
    private List<Motherboard> motherboards;

    public List<CPU> getCpus() {
        return cpus;
    }

    public Store setCpus(List<CPU> cpus) {
        this.cpus = cpus;
        return this;
    }

    public List<Memory> getMemories() {
        return memories;
    }

    public Store setMemories(List<Memory> memories) {
        this.memories = memories;
        return this;
    }

    public List<Motherboard> getMotherboards() {
        return motherboards;
    }

    public Store setMotherboards(List<Motherboard> motherboards) {
        this.motherboards = motherboards;
        return this;
    }


}
