package com.leadtecture.hashing;

import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


import static com.leadtecture.hashing.SHACommonUtils.bytesToHex;

/**
 * @author shaynegao
 */
public class SHA256Hashing {


    public static String hashWithJavaMessageDigest(final String originalString) throws NoSuchAlgorithmException {
        final MessageDigest digest = MessageDigest.getInstance("SHA-256");
        final byte[] encodedhash = digest.digest(originalString.getBytes(StandardCharsets.UTF_8));

        String s = bytesToHex(encodedhash); // Hex 长度64   byte的长度为32， 因为1个byte会变成2个Hex
        System.out.println(s);

        return s;
    }

    public static String hashWithGuava(final String originalString) {
        String s = Hashing.sha256().hashString(originalString, StandardCharsets.UTF_8).toString();
        System.out.println(s);

        return s;
    }


    public static void main(String[] args)  {
        try {
            hashWithJavaMessageDigest("abcd");
            hashWithGuava("abcd");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
