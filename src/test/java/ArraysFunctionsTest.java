/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author prudvi
 */
public class ArraysFunctionsTest {
    
    public ArraysFunctionsTest() {
    }

  

    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        int[] x ={2,4,6,8,10,12,14,16,18,20};
        int expResult = 110;
        int result = ArraysFunctions.getTotal(x);
        assertEquals(expResult, result);
      
    }

    @Test
    public void testGetAverage() {
        System.out.println("getAverage");
        int[] y = {2,4,6,8,10,12,14,16,18,20};
        int expResult = 11;
        int result = ArraysFunctions.getAverage(y);
        assertEquals(expResult, result);
       
    }

    @Test
    public void testGetHighest() {
        System.out.println("getHighest");
        int[] highnumber ={2,4,6,8,10,12,14,16,18,20};
        int expResult = 20;
        int result = ArraysFunctions.getHighest(highnumber);
        assertEquals(expResult, result);
       
    }

    @Test
    public void testGetLowest() {
        System.out.println("getLowest");
        int[] lowestnumber = {2,4,6,8,10,12,14,16,18,20};
        int expResult = 2;
        int result = ArraysFunctions.getLowest(lowestnumber);
        assertEquals(expResult, result);
      
    }
    
}
