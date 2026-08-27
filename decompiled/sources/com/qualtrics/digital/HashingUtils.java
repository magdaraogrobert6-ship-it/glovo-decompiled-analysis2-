package com.qualtrics.digital;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class HashingUtils {
    public static final HashingUtils INSTANCE = new HashingUtils();

    private HashingUtils() {
    }

    public static final String getGuid(String str) throws NoSuchAlgorithmException {
        str.getClass();
        String string = UUID.randomUUID().toString();
        string.getClass();
        return str.concat(hashSHA256(string).substring(0, 15));
    }

    public static final String hashSHA256(String str) throws NoSuchAlgorithmException {
        str.getClass();
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        Charset charset = StandardCharsets.UTF_8;
        charset.getClass();
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        StringBuilder sb = new StringBuilder(new BigInteger(1, messageDigest.digest(bytes)).toString(16));
        while (sb.length() < 32) {
            sb.insert(0, '0');
        }
        return sb.toString();
    }
}
