package com.galvanize;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EchoTest {

    @Test
    public void testShoutReturnsUppercase(){
        Echo echo = new Echo();

        String result = echo.shout("hello");

        assertEquals("HELLO", result);
    }


}
