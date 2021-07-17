/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enroutesystems;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 *
 * @author omarm
 */
@Slf4j
public class EjemploAssert {
    int value = 234;
    
    @Test
    public void testValue(){
        log.info("Test if value equals 234.");
        assert value == 234 : "Value is not equals to 234";
    }
}
