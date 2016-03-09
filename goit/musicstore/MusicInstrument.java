package com.goit.musicstore;

/**
 * Created by Daniel Solo on 06.03.2016.
 */
public class MusicInstrument {
    private String Name;
    private String Type;
    private String Price;

    public void Play(){
        System.out.println("Playing something");
    }
    public void Stop(){
        System.out.println("Music Stopped");
    }
    public void Price(){
        System.out.println("Display price");
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }
}
