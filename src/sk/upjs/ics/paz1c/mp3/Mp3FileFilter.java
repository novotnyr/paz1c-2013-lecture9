package sk.upjs.ics.paz1c.mp3;


import java.io.File;
import java.io.FileFilter;

public class Mp3FileFilter implements FileFilter {

    @Override
    public boolean accept(File pathname) {
        return pathname.getName().endsWith(".mp3");
    }

}