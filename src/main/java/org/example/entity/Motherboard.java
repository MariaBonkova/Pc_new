package org.example.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Motherboard {
    @Expose
    @SerializedName("ComponentType")
    private String componentType;
    @Expose
    @SerializedName("PartNumber")
    private String partNumber;
    @Expose
    @SerializedName("Name")
    private String name;
    @Expose
    @SerializedName("Socket")
    private String socket;
    @Expose
    @SerializedName("Price")
    private String price;

    public Motherboard(String componentType, String partNumber, String name, String socket, String price) {
        this.componentType = componentType;
        this.partNumber = partNumber;
        this.name = name;
        this.socket = socket;
        this.price = price;
    }

    public String getComponentType() {
        return componentType;
    }

    public Motherboard setComponentType(String componentType) {
        this.componentType = componentType;
        return this;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public Motherboard setPartNumber(String partNumber) {
        this.partNumber = partNumber;
        return this;
    }

    public String getName() {
        return name;
    }

    public Motherboard setName(String name) {
        this.name = name;
        return this;
    }

    public String getSocket() {
        return socket;
    }

    public Motherboard setSocket(String socket) {
        this.socket = socket;
        return this;
    }

    public String getPrice() {
        return price;
    }

    public Motherboard setPrice(String price) {
        this.price = price;
        return this;
    }
    @Override
    public String toString() {
        return String.format("%s - %s - %s",
                getComponentType(), getName(), getSocket());

    }
}
