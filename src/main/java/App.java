import models.decrypt;
import models.encrypt;
import java.util.Scanner;


public class App {
        public static int eKey ;

        public static void main(String[] args) {

            System.out.println("********************************");
            System.out.println("*********  Welcome to Cryptography 101   *******");

            Scanner encryptOrDecrypt = new Scanner(System.in);

            System.out.println("Enter E for Encrypt and D for Decrypt:");

            String userChoice = encryptOrDecrypt.nextLine();

            if (userChoice.toUpperCase().equals("E")) {
                e
                Scanner eKeyInput = new Scanner(System.in);
                System.out.println("Enter the Key you want to encrypt with");
                String eKeyString = eKeyInput.nextLine();
                int eKeyControl = Integer.parseInt(eKeyString);
                System.out.println(newEncryption.myEncrypt(userInput, eKeyControl));

            } else if (userChoice.toUpperCase().equals("D")) {
                decrypt newEncryption = new decrypt();
                Scanner encryptInput = new Scanner(System.in);
                System.out.println("Enter the text you want to encrypt");
                String userInput = encryptInput.nextLine();
                Scanner eKeyInput = new Scanner(System.in);
                System.out.println("Enter the Key you want to encrypt with");
                String eKeyString = eKeyInput.nextLine();
                int eKeyControl = Integer.parseInt(eKeyString);
                System.out.println(newEncryption.myDecrypt(userInput, eKeyControl));
            } else {
                System.out.println("****You did not Select a valid choice!! E or D *****");


            }
        }
}
