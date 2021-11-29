package net.prachit.dsa.hash;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;

public class CharacterHashing {

    public String MD5Hash(String stringToHash) throws NoSuchAlgorithmException {

        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] digest = messageDigest.digest(stringToHash.getBytes(StandardCharsets.UTF_8));

        return convertToHex(digest);
    }

    private String convertToHex(byte[] digest) {

        BigInteger integer = new BigInteger(1,digest);
        String hexText = integer.toString(16);

        while(hexText.length()<32){
            hexText = hexText.concat("0");
        }

        return hexText;
    }

    public String sha1(String stringToHash) throws NoSuchAlgorithmException {

        MessageDigest messageDigest = MessageDigest.getInstance("SHA3-224");
        byte[] digest = messageDigest.digest(stringToHash.getBytes(StandardCharsets.UTF_8));
        return convertToHex(digest);
    }


    public String sha1WithSalt(String stringToHash) throws NoSuchAlgorithmException, NoSuchProviderException {
        byte[] salt = getSalt();
        MessageDigest md = MessageDigest.getInstance("SHA3-256");
        md.update(salt);
        byte[] digest = md.digest(stringToHash.getBytes(StandardCharsets.UTF_8));

        return convertToHex(digest);
    }

    private byte[] getSalt() throws NoSuchAlgorithmException, NoSuchProviderException {
        SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG","SUN");
        byte[] sr = new byte[16];
        secureRandom.nextBytes(sr);
        return sr;
    }

    public String sha1WithSalt(String stringToHash, String salt) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA3-256");
        md.update(salt.getBytes(StandardCharsets.UTF_8));
        byte[] digest = md.digest(stringToHash.getBytes(StandardCharsets.UTF_8));

        return convertToHex(digest);
    }

    public long polynomialRollingHash(String stringToHash){
        int p = 31;
        int m = (int) (1e9+9);

        long powerOfp = 1;
        long hashVal = 0;

        for (int i = 0; i < stringToHash.length(); i++) {
            hashVal = hashVal + (((stringToHash.charAt(i) - 'a'+ 1 )) * powerOfp ) % m;
            powerOfp = (p * powerOfp) % m ;
        }

        return hashVal;
    }
}
