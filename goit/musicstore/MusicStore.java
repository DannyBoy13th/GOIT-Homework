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
}
