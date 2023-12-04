package com.mycompany.encryptiondecryption;

import java.io.File;
// import java.io.FileReader;

// import java.io.FileReader;
// *TRY USING:
import org.apache.commons.io.FileUtils;

public class EncryptionDecryption {
    public static void main(String[] args) {
        
        String filename = "charter-poem.txt";

        try {
            String myFile = "C:\\Users\\cyxkr\\Documents\\Programming\\Java\\" + filename;
            String fileString = FileUtils.readFileToString(new File(myFile), "UTF-8");
            // FileReader fileReader = new FileReader(myFile);

            // String dataToEncrypt = "Cyx";
            String encryptionKey = "hello world";

            String encryptedData = AdvancedEncryptionStandard.encrypt(fileString, encryptionKey);

            System.out.println("Encrypted data: ");
            System.out.println(encryptedData);

            String decryptedData = AdvancedEncryptionStandard.decrypt(encryptedData, encryptionKey);

            System.out.println("\nDecrypted data: ");
            System.out.println(decryptedData);

            // fileReader.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}

/*
 * Use scanner to supply the data
 * Build a GUI for the application
 * Make the algorithms dynamic in the GUI
 * learn about the algorithms
 * perhaps connect it to a database
 */
