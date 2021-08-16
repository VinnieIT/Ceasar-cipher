package models;

import java.security.Key;
import java.util.Locale;
import java.util.Scanner;

public class cipherImplementation {
    public static int eKey ;

    public static void main(String[] args) {

        Scanner encryptOrDecrypt = new Scanner(System.in);

        System.out.println("Enter E for Encrypt and D for Decrypt:");

        String userChoice = encryptOrDecrypt.nextLine();

        if (userChoice.toUpperCase().equals("E"))
            myEncrypt();
        else if(userChoice.toUpperCase().equals("D"))
            myDecrypt();
        else {
            System.out.println("****Select a valid choice!! E or D *****");
            encryptOrDecrypt.nextLine();

        }
        //encryptOrDecrypt.close();


    }

    static void myEncrypt(){
        Scanner encryptInput = new Scanner(System.in);
        System.out.println("Enter the text you want to encrypt");
        String userInput= encryptInput.nextLine();


        char[] userInputChar;
        userInputChar = userInput.toCharArray();
        char[] nums =new char[userInputChar.length];

        for (char c : userInputChar) {
            int inputAsci = c + eKey;
            char inputChar = (char) inputAsci;
            System.out.print(inputChar);
        }

    }
    static void myDecrypt(){
        Scanner decryptInput = new Scanner(System.in);
        System.out.println("Enter the text you want to decrypt");
        String userInput= decryptInput.nextLine();

        char[] userInputChar;
        userInputChar = userInput.toCharArray();
        char[] nums =new char[userInputChar.length];

        for (int i=0; i<userInputChar.length; i++){
            int inputAsci = userInputChar[i]- eKey;
            char inputChar = (char)inputAsci;
            System.out.print(inputChar);
        }
    }

}
