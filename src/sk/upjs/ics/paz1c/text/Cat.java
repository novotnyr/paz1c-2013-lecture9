package sk.upjs.ics.paz1c.text;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Cat {
    public List<String> process(File file) throws FileNotFoundException {
        List<String> riadky = new LinkedList<String>();
        
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()) {
            String riadok = scanner.nextLine();
            riadky.add(riadok);
        }
        return riadky;
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Cat cat = new Cat();
        List<String> riadkov = cat.process(new File("c:\\Users\\rn\\Documents\\markdown-demo-all.text"));
        for (String riadok : riadkov) {
            System.out.println(riadok);
        }
    }
}
