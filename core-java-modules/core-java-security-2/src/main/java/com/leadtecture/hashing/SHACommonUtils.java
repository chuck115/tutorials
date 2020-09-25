package com.leadtecture.hashing;

/**
 * @author shaynegao
 */
public class SHACommonUtils {

    public static String bytesToHex(byte[] hash) {

        StringBuilder sb = new StringBuilder();
        for (byte h : hash) {
            String hex = Integer.toHexString(0xff & h);
            if (hex.length() == 1)
                sb.append('0');
            sb.append(hex);
        }

        return sb.toString();
    }


//    public static void main(String[] args) {
//
//        byte[] hash = {1,2,4,19};
//        String a = bytesToHex(hash);
//        System.out.println(a);
//    }
}
