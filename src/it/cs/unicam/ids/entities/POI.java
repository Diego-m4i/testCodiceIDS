package it.cs.unicam.ids.entities;

import java.util.HashMap;

public class POI {

    private int identifier;

    private String name;

    private double latitude;

    private double longitude;

    private boolean controlled;

    private HashMap tags;

    public POI(String name, double latitude, double longitude, boolean controlled) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.controlled = controlled;
        this.identifier = this.hashCode();
        this.tags = new HashMap();
        //this.initializeTagMap();
    }

    // UTILITIES

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public boolean isControlled() {
        return controlled;
    }

    public void setControlled(boolean controlled) {
        this.controlled = controlled;
    }

    public int hashCode(){ return this.name.hashCode(); }

    /**
    public void initializeTagMap(){
        this.tags = new HashMap();
        this.tags.put("Name", this.name);
        this.tags.put("Latitude", this.latitude);
        this.tags.put("Longitude", this.longitude);
    }
     */

}
