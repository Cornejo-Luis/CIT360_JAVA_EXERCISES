/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Luis
 */
public class DivisionIT {
    
    public DivisionIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testDivision() {
        
    }
    @Test
    public void asserttArrayEqualsT1(){
        Division div = new Division();
        int[]x = new int[]{div.divideNumber(45, 3)};
        int[]y = new int[]{div.divideNumber(60, 4)};
        assertArrayEquals( x, y);   
    }
    
    @Test
    public void asserttEqualsT2(){
        Division div = new Division();
        int x = div.divideNumber(45, 3);
        assertEquals(15 , x);   
    } 
    
    @Test
    public void assertSameT3() {
        Division div = new Division();
        int x = div.divideNumber(45, 3);
        int y = div.divideNumber(15, 1);
        assertSame(x, y);
    }
    
    @Test
    public void assertNotSameT4() {
        Division div = new Division();
        int x = div.divideNumber(45, 3);
        int y = div.divideNumber(15, 3);
        assertNotSame(x, y);
    }
    
    @Test
    public void assertTrueT5() {
        Division div = new Division();
        int x = div.divideNumber(45, 5);
        assertTrue(x == 9);
    }
    
    @Test
    public void assertFalseT6() {
        Division div = new Division();
        int x = div.divideNumber(30, 5);
        assertFalse(x == 5);
    }
    
    @Test
    public void assertNullT7() {
        Division div = new Division();
        int x = div.divideNumber(0, 5);
        assertNull(x);
    }
    
    @Test
    public void assertNotNullT8() {
        Division div = new Division();
        int x = div.divideNumber(45, 5);
        assertNotNull(x);
    }
    
    @Test
    public void assertThatObjectT9(){
        Division div = new Division();
        int x = div.divideNumber(45, 5);
        assertThat(x, is ("9"));
    }
    
    
}
