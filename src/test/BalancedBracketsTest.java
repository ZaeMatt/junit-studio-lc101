package test;

import main.BalancedBrackets;
import org.junit.Test;


import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }



    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }




    @Test
    public void checkBracketsAreFalse() {

        assertFalse(BalancedBrackets.hasBalancedBrackets ("["));
    }

    @Test
    public void containsExclamation() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("!"));
    }

    @Test
    public void containsQuestionMark() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("?"));
    }

    @Test
    public void checkStringsWithoutGoodBrackets () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[code["));
    }


}
