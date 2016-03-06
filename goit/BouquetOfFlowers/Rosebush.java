package com.goit.BouquetOfFlowers;

import java.util.List;

/**
 * Created by Daniel Solo on 06.03.2016.
 */
public class Rosebush {
   private List<Rose> Roses;

    public List<Rose> getRoses() {
        return Roses;
    }

    public void setRoses(List<Rose> roses) {
        Roses = roses;
    }

    public static void main (String [] args) {
        System.out.println("A beautiful bush, covered in many red roses.");
    }
}

