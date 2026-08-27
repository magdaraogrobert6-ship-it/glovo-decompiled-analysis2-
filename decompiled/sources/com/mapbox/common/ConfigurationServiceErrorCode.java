package com.mapbox.common;

/* JADX INFO: loaded from: classes5.dex */
public enum ConfigurationServiceErrorCode {
    NO_TOKEN("NoToken"),
    NO_CONFIGURATION("NoConfiguration"),
    HTTP_ERROR("HttpError"),
    MALFORMED_CONFIGURATION("MalformedConfiguration"),
    IOERROR("IOError"),
    UPDATE_IN_PROGRESS("UpdateInProgress"),
    UNEXPECTED_HTTPRESPONSE_CODE("UnexpectedHTTPResponseCode"),
    EXPIRED_CONFIGURATION("ExpiredConfiguration"),
    TOKEN_CHANGED("TokenChanged");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    ConfigurationServiceErrorCode(String str) {
        this.str = str;
    }
}
