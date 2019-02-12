package com.stackroute.unittest;

import org.junit.Test;

import static org.junit.Assert.*;

public class reverseStringTest {

    @Test
    public void reverse() {
        reverseString r1 = new reverseString();
        assertEquals("Allo",r1.reverse("ollA"));
        assertEquals("adioD",r1.reverse("Doida"));
    }
}