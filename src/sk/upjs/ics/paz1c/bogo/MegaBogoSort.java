package sk.upjs.ics.paz1c.bogo;

import java.util.Random;
import sk.upjs.ics.paz1c.bogo.BogoSort;

public class MegaBogoSort extends BogoSort {

    private Random random = new Random();

    /**
     * Shuffles an array with Fisher-Yates algorithm
     *
     * @see http://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle
     */
    @Override
    protected double[] pomiesaj(double[] array) {
        if (array.length < 2) {
            return array;
        }

        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            double element = array[index];
            array[index] = array[i];
            array[i] = element;
        }

        return array;
    }

}
