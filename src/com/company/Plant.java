package com.company;

public class Plant {
    private double ph;
    private double soil_temperature;
    private double soil_moisture;
    private double illu;
    private double env_temp;
    private double env_humid;
    private String label;

    public Plant(double ph, double soil_temperature, double soil_moisture, double illu,
                 double env_temp, double env_humid, String label) {
        this.ph = ph;
        this.soil_temperature = soil_temperature;
        this.soil_moisture = soil_moisture;
        this.illu = illu;
        this.env_temp = env_temp;
        this.env_humid = env_humid;
        this.label = label;
    }

    public double getPh() {
        return ph;
    }

    public void setPh(double ph) {
        this.ph = ph;
    }

    public double getSoil_temperature() {
        return soil_temperature;
    }

    public void setSoil_temperature(double soil_temperature) {
        this.soil_temperature = soil_temperature;
    }

    public double getSoil_moisture() {
        return soil_moisture;
    }

    public void setSoil_moisture(double soil_moisture) {
        this.soil_moisture = soil_moisture;
    }

    public double getIllu() {
        return illu;
    }

    public void setIllu(double illu) {
        this.illu = illu;
    }

    public double getEnv_temp() {
        return env_temp;
    }

    public void setEnv_temp(double env_temp) {
        this.env_temp = env_temp;
    }

    public double getEnv_humid() {
        return env_humid;
    }

    public void setEnv_humid(double env_humid) {
        this.env_humid = env_humid;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "ph=" + ph +
                ", soil_temperature=" + soil_temperature +
                ", soil_moisture=" + soil_moisture +
                ", illu=" + illu +
                ", env_temp=" + env_temp +
                ", env_humid=" + env_humid +
                ", label='" + label + '\'' +
                '}';
    }
}
