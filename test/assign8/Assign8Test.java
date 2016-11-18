/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign8;

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
public class Assign8Test {

    private Fish[] fiveGoldfish = new Fish[5];
    private Fish[] threeGoldfish = new Fish[5];
    private Fish[] allNull = new Fish[5];
    private Fish[] fiveMixed = new Fish[5];
    private Fish newFish;

    @Before
    public void setup() {
        fiveGoldfish[0] = new Fish("Goldy", 100, 10);
        fiveGoldfish[1] = new Fish("Goldy", 100, 10);
        fiveGoldfish[2] = new Fish("Goldy", 100, 10);
        fiveGoldfish[3] = new Fish("Goldy", 100, 10);
        fiveGoldfish[4] = new Fish("Goldy", 100, 10);

        threeGoldfish[0] = new Fish("Goldy", 100, 10);
        threeGoldfish[1] = new Fish("Goldy", 100, 10);
        threeGoldfish[2] = new Fish("Goldy", 100, 10);
        threeGoldfish[3] = null;
        threeGoldfish[4] = null;

        allNull[0] = null;
        allNull[1] = null;
        allNull[2] = null;
        allNull[3] = null;
        allNull[4] = null;

        fiveMixed[0] = new Fish("Goldy", 200, 20);
        fiveMixed[1] = new Fish("Goldy", 180, 18);
        fiveMixed[2] = new Fish("Goldy", 120, 12);
        fiveMixed[3] = new Fish("Goldy", 100, 10);
        fiveMixed[4] = new Fish("Goldy", 150, 15);

        newFish = new Fish("Insert", 250, 25);
    }

    @Test
    public void testGetScoreFiveGoldfish() {
        Fish[] fishes = fiveGoldfish;
        double expResult = 5000;
        double result = Assign8.getScore(fishes, 5);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetScoreThreeGoldfish() {
        Fish[] fishes = threeGoldfish;
        double expResult = 3000;
        double result = Assign8.getScore(fishes, 3);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetScoreAllNull() {
        Fish[] fishes = allNull;
        double expResult = 0;
        double result = Assign8.getScore(fishes, 1);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetScoreFiveMixed() {
        Fish[] fishes = fiveMixed;
        double expResult = 11250;
        double result = Assign8.getScore(fishes, 5);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetTotalWeightFiveGoldfish() {
        Fish[] fishes = fiveGoldfish;
        double expResult = 500;
        double result = Assign8.getTotalWeight(fishes);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetTotalWeightThreeGoldfish() {
        Fish[] fishes = threeGoldfish;
        double expResult = 300;
        double result = Assign8.getTotalWeight(fishes);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetTotalWeightAllNull() {
        Fish[] fishes = allNull;
        double expResult = 0;
        double result = Assign8.getTotalWeight(fishes);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetTotalWeightFiveMixed() {
        Fish[] fishes = fiveMixed;
        double expResult = 750;
        double result = Assign8.getTotalWeight(fishes);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetTotalLengthFiveGoldfish() {
        Fish[] fishes = fiveGoldfish;
        double expResult = 50;
        double result = Assign8.getTotalLength(fishes);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetTotalLengthThreeGoldfish() {
        Fish[] fishes = threeGoldfish;
        double expResult = 30;
        double result = Assign8.getTotalLength(fishes);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetTotalLengthAllNull() {
        Fish[] fishes = allNull;
        double expResult = 0;
        double result = Assign8.getTotalLength(fishes);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetTotalLengthFiveMixed() {
        Fish[] fishes = fiveMixed;
        double expResult = 75;
        double result = Assign8.getTotalLength(fishes);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testDropSmallestFishFiveGoldfishCheckWithScore() {
        Fish[] fishes = fiveGoldfish;
        Fish newFish = this.newFish;
        Assign8.dropSmallestFish(fishes, newFish);
        double expResult = 8450;
        double result = Assign8.getScore(fishes, 5);
        assertEquals(expResult, result, 0.0);
    }

}
