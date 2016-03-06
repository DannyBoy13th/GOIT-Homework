package com.goit.BouquetOfFlowers;

import java.util.List;

/**
 * Created by Daniel Solo on 06.03.2016.
 */
public class BouquetOfFlowers {
   private List<Flower> Flowers;

    public List<Flower> getFlowers() {
        return Flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        Flowers = flowers;
    }

    public static void main (String [] args) {
        String Content = "Content:";
        String Rose = "6 Red Roses";
        String Chamomile = "13 Yellow Chamomiles";
        String Aster = "7 White Asters";
        String Tulip = "10 Orange Tulips";
        System.out.println(Content);
        System.out.println(Rose);
        System.out.println(Chamomile);
        System.out.println(Aster);
        System.out.println(Tulip);
    }
}
