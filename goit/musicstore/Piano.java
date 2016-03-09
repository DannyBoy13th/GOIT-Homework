package com.goit.musicstore;

/**
 * Created by Daniel Solo on 06.03.2016.
 */
public class Piano extends MusicInstrument {

    public void Play(){
        System.out.println("Playing some classic, sad tune");
    }
    public void Stop(){
        System.out.println("Music stopped");
    }
    public void Price(){
        System.out.println("$15999");
    }
}
