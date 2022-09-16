package com.dmitrii.elagin;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MorseCodeDecoderTest {
    MorseCodeDecoder decoder;

    @BeforeEach
    void init() {
        decoder = new MorseCodeDecoder();
    }

    @Test
    void decode() {
        assertEquals("SOS", decoder.decode("... --- ..."));
    }

    @Test
    void getCharByCode() {
        assertEquals('S', decoder.getCharByCode("..."));
        assertEquals('\0', decoder.getCharByCode("***"));
    }
}