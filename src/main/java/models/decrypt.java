package models;

public class decrypt {
    public static String myDecrypt(String userInput, int eKeyControl){
        StringBuilder decrypted ;
        decrypted =new StringBuilder();
        int eKey = eKeyControl % 26;

        char[] userInputChar;
        userInputChar = userInput.toCharArray();
        char[] nums =new char[userInputChar.length];

        for (char c : userInputChar) {
            int inputAsci = c - eKey;
            char decrypteds = (char) inputAsci;
            decrypted.append(String.valueOf(decrypteds));
        }
        return decrypted.toString();
    }
}
