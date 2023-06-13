package org.example.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CPU {
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
    @SerializedName("SupportedMemory")
    private String supportedMemory;
    @Expose
    @SerializedName("Socket")
    private String socket;
    @Expose
    @SerializedName("Price")
    private String price;

    public CPU(String componentType, String partNumber, String name, String supportedMemory, String socket, String price) {
        this.componentType = componentType;
        this.partNumber = partNumber;
        this.name = name;
        this.supportedMemory = supportedMemory;
        this.socket = socket;
        this.price = price;
    }

    public String getComponentType() {
        return componentType;
    }

    public CPU setComponentType(String componentType) {
        this.componentType = componentType;
        return this;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public CPU setPartNumber(String partNumber) {
        this.partNumber = partNumber;
        return this;
    }

    public String getName() {
        return name;
    }

    public CPU setName(String name) {
        this.name = name;
        return this;
    }

    public String getSupportedMemory() {
        return supportedMemory;
    }

    public CPU setSupportedMemory(String supportedMemory) {
        this.supportedMemory = supportedMemory;
        return this;
    }

    public String getSocket() {
        return socket;
    }

    public CPU setSocket(String socket) {
        this.socket = socket;
        return this;
    }

    public String getPrice() {
        return price;
    }

    public CPU setPrice(String price) {
        this.price = price;
        return this;
    }

    @Override
    public String toString() {
        return String.format("%s - %s – %s, %s",
                getComponentType(), getName(), getSocket(), getSupportedMemory());

    }

}
