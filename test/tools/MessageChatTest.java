/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RENAUD
 */
public class MessageChatTest {
    
    public MessageChatTest() {
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

    /**
     * Test of lengthMessage method, of class MessageChat.
     */
    @Test
    public void testLengthMessage() {
        System.out.println("lengthMessage");
        String message = "ceci est un azertyuiopqsdfghjklmwxcvbnazertyuiop";
        String expResult = "";
        String result = MessageChat.lengthMessage(message);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
