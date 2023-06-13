package org.example.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Memory {
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
    @SerializedName("Type")
    private String type;
    @Expose
    @SerializedName("Price")
    private String price;

    public Memory(String componentType, String partNumber, String name, String type, String price) {
        this.componentType = componentType;
        this.partNumber = partNumber;
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getComponentType() {
        return componentType;
    }

    @Override
    public String toString() {
        return String.format("%s - %s – %s",
                getComponentType(), getName(), getType());

    }

    public Memory setComponentType(String componentType) {
        this.componentType = componentType;
        return this;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public Memory setPartNumber(String partNumber) {
        this.partNumber = partNumber;
        return this;
    }

    public String getName() {
        return name;
    }

    public Memory setName(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public Memory setType(String type) {
        this.type = type;
        return this;
    }

    public String getPrice() {
        return price;
    }

    public Memory setPrice(String price) {
        this.price = price;
        return this;
    }
}
