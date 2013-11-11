package sk.upjs.ics.paz1c.bogo;

import org.junit.Test;
import static org.junit.Assert.*;

public class BogoSortTest {

    @Test
    public void testSort() {
        double[] data = { 4.5, -1.5, 3.14, -2.71};
        
        BogoSort bogoSort = new BogoSort();
        double[] zotriedene = bogoSort.utried(data);
        
        double[] ocakavane = { -2.71, -1.5, 3.14, 4.5} ;
        assertArrayEquals(ocakavane, zotriedene);
    }
    
     @Test
    public void testMegaBogoSort() {
        double[] data = { 4.5, -1.5, 3.14, -2.71};
        
        BogoSort bogoSort = new MegaBogoSort();
        double[] zotriedene = bogoSort.utried(data);
        
        double[] ocakavane = { -2.71, -1.5, 3.14, 4.5} ;
        assertArrayEquals(ocakavane, zotriedene);
    }
    
    private void assertArrayEquals(double[] ocakavane, double[] data) {
        for(int i = 0; i < ocakavane.length; i++) {
            if(ocakavane[i] != data[i]) {
                fail();
            }
        }
    }
}
