package com.goit.musicstore;

import java.util.List;

/**
 * Created by Daniel Solo on 06.03.2016.
 */
public class MusicStore {
    private List<MusicInstrument> MusicInstruments;

    public List<MusicInstrument> getMusicInstruments() {
        return MusicInstruments;
    }

    public void setMusicInstruments(List<MusicInstrument> musicInstruments) {
        MusicInstruments = musicInstruments;
    }

    public static void main (String [] args) {
        String Inventory = "Inventory:";
        String Guitar = "Rocker 2016";
        String Piano = "Mozart 1669";
        String Trumpet = "Golden Horn";
        System.out.println(Inventory);
        System.out.println(Guitar);
        System.out.println(Piano);
        System.out.println(Trumpet);
    }
}
