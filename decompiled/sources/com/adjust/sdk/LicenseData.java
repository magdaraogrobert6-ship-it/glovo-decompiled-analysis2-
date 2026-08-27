package com.adjust.sdk;

/* JADX INFO: loaded from: classes.dex */
public class LicenseData {
    private final int responseCode;
    private final String signature;
    private final String signedData;

    public int getResponseCode() {
        return this.responseCode;
    }

    public String getSignature() {
        return this.signature;
    }

    public String getSignedData() {
        return this.signedData;
    }

    public LicenseData(String str, String str2, int i) {
        this.signedData = str;
        this.signature = str2;
        this.responseCode = i;
    }

    public boolean isValid() {
        String str = this.signedData;
        return (str == null || this.signature == null || str.isEmpty() || this.signature.isEmpty()) ? false : true;
    }
}
