package com.mycompany.encryptiondecryption;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/*  -------------------- ENCRYPTION & HASHING --------------------
 * Basically, encryption is the process of scrambling plaintext into unreadable ciphertext, which you can decrypt with a relevant key, 
 * while hashing turns plain text into a unique code, which can’t be reverted into a readable form.
 */

/*
 * Hashing is usually used to ensure the integrity of data, primarily when we’re storing large amounts of it, 
 * while encryption is aimed at protecting the privacy of small amounts of data while in transit.
 */

/* -------------------- SHA-256 --------------------
 * SHA-2 (Secure Hash Algorithm 2), of which SHA-256 is a part, is one of the most popular hash algorithms around. 
 * A cryptographic hash, also often referred to as a “digest”, “fingerprint” or “signature”, is an almost perfectly unique string of characters that is generated from a separate piece of input text. 
 * SHA-256 generates a 256-bit (32-byte) signature.
 * Get more explanation here: https://blog.boot.dev/cryptography/how-sha-2-works-step-by-step-sha-256/
 */

public class AdvancedEncryptionStandard {
    private static SecretKeySpec secretKeySpec;
    private static byte[] key;
    static MessageDigest messageDigest = null;

    public static void createKey(final String myKey) {

        try {

            key = myKey.getBytes("UTF-8");
            messageDigest = MessageDigest.getInstance("SHA-256");
            key = messageDigest.digest(key);
            key = Arrays.copyOf(key, 16);
            secretKeySpec = new SecretKeySpec(key, "AES");

        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
    
    public static String encrypt(final String strToEncrypt, final String key) {

        try {

            createKey(key);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);

            return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes()));

        } catch (Exception e) {
            System.out.println("Error while encrypting: " + e.toString());
        }

        return null;
    }

    public static String decrypt(final String strToDecrypt, final String key) {
    
        try {

            createKey(key);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);

            return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));

        } catch (Exception e) {
            System.out.println("Error while decrypting: " + e.toString());
        }

        return null;
    
    }
}
