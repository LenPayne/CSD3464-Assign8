/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign8;

import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0587637
 */
public class RandomUtilsTest {

    @Test
    public void testGetRandomRangeOnce() {
        double min = 10;
        double max = 20;
        double result = RandomUtils.getRandomRange(min, max);
        assertTrue(result >= min && result <= max);
    }

    @Test
    public void testGetRandomRange10000() {
        double min = new Random().nextInt(100);
        double max = new Random().nextInt(100000) + 101;
        for (int i = 0; i < 10000; i++) {
            double result = RandomUtils.getRandomRange(min, max);
            assertTrue(result >= min && result <= max);
        }
    }

}
