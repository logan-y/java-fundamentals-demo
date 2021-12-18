package com.loganyoung.javaFundamentalsDemo;

public class Droid {
    private String serialNum;
    private String modelType;
    private String purpose;

    //constructor
    public Droid() {
    }

    //toString
    @Override
    public String toString() {
        return "Droid{" +
                "serialNum='" + serialNum + '\'' +
                ", modelType='" + modelType + '\'' +
                ", purpose='" + purpose + '\'' +
                '}';
    }
    //Getters
    public String getSerialNum() {
        return serialNum;
    }
    public String getModelType() {
        return modelType;
    }
    public String getPurpose() {
        return purpose;
    }

    public void setSerialNum(final String serialNum) {
        this.serialNum = serialNum;
    }
    public void setModelType(final String modelType) {
        this.modelType = modelType;
    }
    public void setPurpose(final String purpose) {
        this.purpose = purpose;
    }
    public String speak() {
        return "wHiStLeBeEpWhIsTlEbEePBeEPBEEEEEEEP";
    }




}
