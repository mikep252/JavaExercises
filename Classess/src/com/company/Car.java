package com.company;

public class Car {
    private int doors;
    private int wheels;
    public String model;
    private String engine;
    private String colour;
/// inherite - dziedziczyc;
    public void setModel(String model)
    {
        String validModel = model.toLowerCase(); /// smal letters;
        if(validModel.equals("carrera") || validModel.equals("comodore")) {
            this.model = model;
        }else{
            this.model = "Unknow";
        }

    }
    public String getModel(){
        return this.model;
    }
}
