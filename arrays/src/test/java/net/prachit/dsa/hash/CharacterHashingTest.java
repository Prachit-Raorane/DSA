package net.prachit.dsa.hash;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

import static org.junit.jupiter.api.Assertions.*;

class CharacterHashingTest {

    private CharacterHashing hashing = new CharacterHashing();
    @Test
    void MD5Hash() throws NoSuchAlgorithmException {
        Assertions.assertEquals("d920b5fb48790cf16fb49cb3f0ba1227",hashing.MD5Hash("prachit"));
    }

    @Test
    void Sha1Test() throws NoSuchAlgorithmException {
        Assertions.assertEquals("d76707768d6b214cda308dd499868345116d2290a047ffe96709339f",hashing.sha1("prachit"));;
    }

    @Test
    void Sha1WithSaltTest() throws NoSuchAlgorithmException, NoSuchProviderException {
        Assertions.assertEquals("65f5d6eff149e7f5d994ae6bb334c5523d779b592b3dd58e352e11f072bf7fd7",hashing.sha1WithSalt("prachit"));
    }

    @Test
    void Sha1WithConstantSaltTest() throws NoSuchAlgorithmException {
        Assertions.assertEquals("3298f099f719621dcc658bbcfba456d7a97bac65ff2225a35bd883c1808d783c",hashing.sha1WithSalt("prachit","salt"));
    }

    @Test
    void polynomialHashTest() {
        System.out.println('b'-'a');
        Assertions.assertEquals(1015214902,hashing.polynomialRollingHash("prachit"));
    }
}