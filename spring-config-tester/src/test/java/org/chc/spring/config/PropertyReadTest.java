package org.chc.spring.config;

import static org.junit.Assert.*;

import org.junit.Test;


public class PropertyReadTest {

    @Test
    public void test() {
        PropertyConfig consumer = new PropertyConfig();
        assertEquals("value loaded","localhost",consumer.getHost());
    }

}
