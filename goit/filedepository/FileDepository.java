package com.goit.filedepository;

import java.util.List;

/**
 * Created by Daniel Solo on 06.03.2016.
 */
public class FileDepository {

    private List<File> Files;

    public List<File> getFiles() {
        return Files;
    }

    public void setFiles(List<File> files) {
        Files = files;
    }

    public static void main (String [] args) {
        String Content = "Content:";
        String Jpg = "Yaremche.jpg";
        String Mp3 = "Spanish Sahara.mp3";
        String Doc = "About Me.doc";
        System.out.println(Content);
        System.out.println(Jpg);
        System.out.println(Mp3);
        System.out.println(Doc);
    }

}
