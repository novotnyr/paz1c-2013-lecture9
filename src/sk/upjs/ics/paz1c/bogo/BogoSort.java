package sk.upjs.ics.paz1c.bogo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BogoSort {

    public double[] utried(double[] data) {
        while(! jeZotriedene(data)) {
            data = pomiesaj(data);
        }
        return data;
    }

    private boolean jeZotriedene(double[] data) {
        for(int i = 0; i < data.length - 1; i++) {
            if(data[i] > data[i + 1]) {
                return false;
            }
        }
        return true;
    }

    protected double[] pomiesaj(double[] data) {
        List<Double> list = toList(data);
        
        Collections.shuffle(list);
 
        System.out.println(list);
        
        return toArray(list);
    }

    private List<Double> toList(double[] array) {
        //autoboxing
        List<Double> list = new ArrayList<Double>();
        for (double d : array) {
            list.add(d);
        }
        return list;
    }

    private double[] toArray(List<Double> list) {
        double[] array = new double[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
    

}
