package models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class encryptTest {
    @Test
    public void createencrypt_instanceOfEncrypt(){
        encrypt newEncrypt = new encrypt();
        assertTrue(newEncrypt instanceof encrypt);

}
    @Test
    public void myEcrypt_Method_Encrypts(){
        encrypt newEncrypt = new encrypt();
        String encryption = newEncrypt.myEncrypt("Great", 4);
        assertEquals("Kviex",encryption );
    }
    @Test
    public void myEcrypt_Method0_Encrypts(){
        encrypt newEncrypt = new encrypt();
        String encryption = newEncrypt.myEncrypt("DOG", 25);
        assertEquals("]h`",encryption );
    }
    @Test
    public void myEcrypt_Method1_Encrypts(){
        encrypt newEncrypt = new encrypt();
        String encryption = newEncrypt.myEncrypt("I love my life", 27);
        assertEquals("J!mpwf!nz!mjgf",encryption );
    } @Test
    public void myEcrypt_Method2_Encrypts(){
        encrypt newEncrypt = new encrypt();
        String encryption = newEncrypt.myEncrypt("Finish", 1000);
        assertEquals("Ruzu\u007Ft",encryption );
    }
}