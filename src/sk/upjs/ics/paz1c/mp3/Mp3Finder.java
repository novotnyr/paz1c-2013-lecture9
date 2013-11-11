package sk.upjs.ics.paz1c.mp3;


import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.List;

public class Mp3Finder {

    
    public List<File> najdi(File adresar) {
        FileFilter mp3Filter = new Mp3FileFilter();
        File[] files = adresar.listFiles(mp3Filter);
        return Arrays.asList(files);
    }
    
    public static void main(String[] args) {
        Mp3Finder finder = new Mp3Finder();
        List<File> mp3subory = finder.najdi(new File("d:/MP3/First Aid Kit - Lion's Roar"));
        System.out.println(mp3subory);
        System.out.println(mp3subory.size());
    }
}
