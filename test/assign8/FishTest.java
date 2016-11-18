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
public class FishTest {
    
    /**
     * Test of getWeight method, of class Fish.
     */
    @Test
    public void testGetWeight() {
        Fish instance = new Fish("Bob", 10, 10);
        double expResult = 10;
        double result = instance.getWeight();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setWeight method, of class Fish.
     */
    @Test
    public void testSetWeight() {
        double weight = 0.0;
        Fish instance = new Fish();
        instance.setWeight(weight);
        double expResult = 0.0;
        double result = instance.getWeight();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getLength method, of class Fish.
     */
    @Test
    public void testGetLength() {
        Fish instance = new Fish("Bob", 10, 10);
        double expResult = 10;
        double result = instance.getLength();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setLength method, of class Fish.
     */
    @Test
    public void testSetLength() {
        double length = 0.0;
        Fish instance = new Fish();
        instance.setLength(length);
        double expResult = 0.0;
        double result = instance.getLength();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getSpecies method, of class Fish.
     */
    @Test
    public void testGetSpecies() {
        Fish instance = new Fish();
        String expResult = "Carp";
        String result = instance.getSpecies();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSpecies method, of class Fish.
     */
    @Test
    public void testSetSpecies() {
        String species = "Bob";
        Fish instance = new Fish();
        instance.setSpecies(species);
        String expResult = "Bob";
        String result = instance.getSpecies();
        assertEquals(expResult, result);
    }
    
}
