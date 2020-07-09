package org.com.ebru;

import org.junit.Test;

import static org.junit.Assert.*;

public class PermutationTest {

    @Test
    public void should_return_true(){
        assertTrue(Permutation.checkIfOneStringContainsAllOfOthers("baba","abab"));
        assertTrue(Permutation.checkIfOneStringContainsAllOfOthers("lds","loodos"));
        assertTrue(Permutation.checkIfOneStringContainsAllOfOthers("98eb","ebru89"));
    }
    @Test
    public void should_return_false(){
        assertFalse(Permutation.checkIfOneStringContainsAllOfOthers("baba","abc"));
        assertFalse(Permutation.checkIfOneStringContainsAllOfOthers("ldse","loodos"));
        assertFalse(Permutation.checkIfOneStringContainsAllOfOthers(null,null));
        assertFalse(Permutation.checkIfOneStringContainsAllOfOthers(null,"asd"));
    }
}