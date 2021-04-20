package Lab4.Ex2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 *
 * @author Andrian
 */
public class CustomMathTest {

    public CustomMathTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }
    /**
     * Test of sum method, of class CustomMath.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        int x = 0;
        int y = 0;
        int expResult = 0;
        int result = CustomMath.sum(x, y);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    /**
     * Test of division method, of class CustomMath.
     */
    @Test
    public void testDivisionByZero() {
        int x = 0;
        int y = 0;   // test for y == 0 && y !== 0
        int expResult = 0;
        try {
            int result=CustomMath.division(x, y);
            assertEquals(expResult, result);
            if(y==0) fail("Деление на ноли не создает исключителънои ситуации");
        }
        catch(IllegalArgumentException e){
            if(y!=0) fail("Генерация исключения при ненулевом знаменателе");
        }
    }
    /**
     * Test of main method, of class CustomMath.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CustomMath.main(args);
        fail("The test case is a prototype.");
    }}

