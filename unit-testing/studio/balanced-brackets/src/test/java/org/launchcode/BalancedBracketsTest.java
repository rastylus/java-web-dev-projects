package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        String msg = "Returns true if only balanced brackets";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"), msg);
    }
    @Test
    public void emptyStringReturnsTrue() {
        String msg = "Returns true if an empty string is returned";
        assertTrue(BalancedBrackets.hasBalancedBrackets(""), msg);

    }
    @Test
    public void bracketsAroundStringReturnsTrue() {
        String msg = "Returns true if a bracketed string is returned";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launchcode]"), msg);

    }
    @Test
    public void bracketsAroundSubstringReturnsTrue() {
        String msg = "Returns true if a bracketed string is returned";
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"), msg);

    }
    @Test
    public void startsWithBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));

    }
    @Test
    public void endsWithBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode[]"));

    }
    @Test
    public void onlyOpeningBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launchcode"));
    }
    @Test
    public void onlyClosingBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launchcode]"));
    }
        @Test
    public void unbalancedBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
        @Test
    public void misplacedBrackets() {
//        String indexOf(String "[");
//            String str = "[";
//            int open = String indexOf("[");
//            int close;
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));

    }
            @Test
    public void misplacedSubstringBrackets() {
//        String str = "Launch]Code[";
//        int open = str.indexOf("[");
//        int close = str.indexOf("]")
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }


    @Test
    public void tooManyBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }

//    @Test
//    public void () {
//
//    }


}