package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class cipherImplementationTest {
    @Test
    public void shouldTakeInput(){
        cipherImplementation inputStream = new cipherImplementation();
        inputStream.myEncrypt();
    }

}