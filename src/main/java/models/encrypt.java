package models;
public class encrypt {
    public static String myEncrypt(String userInput, int eKeyControl){
        StringBuilder encrypted;
        encrypted = new StringBuilder();

        int eKey = eKeyControl % 26;

        char[] userInputChar;
        userInputChar = userInput.toCharArray();
        char[] nums =new char[userInputChar.length];

        for (char c : userInputChar) {
            int inputAsci = c + eKey;
            char inputChars = (char) inputAsci;
            encrypted.append(String.valueOf(inputChars));

        }
        return encrypted.toString();

    }

}
