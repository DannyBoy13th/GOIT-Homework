package com.goit.musicstore;


/**
 * Created by Daniel Solo on 09.03.2016.
 */
public class Main {
    public static void main(String [] args){;
        MusicStore Jamz=new MusicStore();
        MusicInstrument OrdinaryInstrument=new MusicInstrument();
        Guitar Rocker=new Guitar();
        Piano Mozart=new Piano();
        Trumpet Horn=new Trumpet();

        Jamz.Inventory();
        System.out.println();

        System.out.println("ROCKER2016");
        Rocker.Price();
        Rocker.Play();
        System.out.println();

        System.out.println("MOZART 1778");
        Mozart.Price();
        Mozart.Play();
        System.out.println();

        System.out.println("Golden Horn");
        Horn.Price();
        Horn.Play();
    }
}
