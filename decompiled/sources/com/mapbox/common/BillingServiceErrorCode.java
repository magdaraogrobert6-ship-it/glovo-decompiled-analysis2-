package com.mapbox.common;

/* JADX INFO: loaded from: classes4.dex */
public enum BillingServiceErrorCode {
    TOKEN_VALIDATION_FAILED("TokenValidationFailed"),
    RESUME_FAILED("ResumeFailed");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    BillingServiceErrorCode(String str) {
        this.str = str;
    }
}
