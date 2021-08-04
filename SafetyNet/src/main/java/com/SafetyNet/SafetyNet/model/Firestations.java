package com.SafetyNet.SafetyNet.model;

public class Firestations {

    private String address;
    private int station;

    public Firestations(String address, int station) {
        this.address = address;
        this.station = station;
    }

    public Firestations() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStation() {
        return station;
    }

    public void setStation(int station) {
        this.station = station;
    }

    @Override
    public String toString() {
        return "Firestations{" +
                "address='" + address + '\'' +
                ", station='" + station + '\'' +
                '}';
    }}