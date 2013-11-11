package sk.upjs.ics.paz1c.text;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Grep {
    public List<String> process(File file, GrepPodmienka podmienka) throws FileNotFoundException {
                List<String> riadky = new LinkedList<String>();
        
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()) {
            String riadok = scanner.nextLine();
            //==================
            if(!podmienka.vyhovujePre(riadok)) {
                continue;
            }
//            if(!riadok.contains(text)) {
//                continue;
//            }
            //==================
            riadky.add(riadok);
        }
        return riadky;
    }
    
    public static class ObsahujeDokumentPodmienka implements GrepPodmienka {
        @Override
        public boolean vyhovujePre(String riadok) {
            return riadok.contains("document");
        }
    }
    
    public static class VzdyTruePodmienka implements GrepPodmienka {
        @Override
        public boolean vyhovujePre(String riadok) {
            return true;
        }
    }
    

}
