package models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class decryptTest {
    @Test
    public void myDecrypt_Method_Encrypts(){
        decrypt newDecrypt = new decrypt();
        String encryption = newDecrypt.myDecrypt("Kviex", 4);
        assertEquals("Great",encryption );
    }
    @Test
    public void myDecrypt_Method_Encrypts0_Encrypts(){
        decrypt newDecrypt = new decrypt();
        String encryption = newDecrypt.myDecrypt("]h`", 25);
        assertEquals("DOG",encryption );
    }
    @Test
    public void myDecrypt_Method_Encrypts1_Encrypts(){
        decrypt newDecrypt = new decrypt();
        String encryption = newDecrypt.myDecrypt("J!mpwf!nz!mjgf", 27);
        assertEquals("I love my life",encryption );
    } @Test
    public void myDecrypt_Method_Encrypts2_Encrypts(){
        decrypt newDecrypt = new decrypt();
        String encryption = newDecrypt.myDecrypt("Ruzu\u007Ft", 1000);
        assertEquals("Finish",encryption );
    }
}





