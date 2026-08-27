package com.google.i18n.phonenumbers;

/* JADX INFO: loaded from: classes2.dex */
public class NumberParseException extends Exception {
    public final RemoteActionCompatParcelizer IconCompatParcelizer;
    public final String read;

    public enum RemoteActionCompatParcelizer {
        INVALID_COUNTRY_CODE,
        NOT_A_NUMBER,
        TOO_SHORT_AFTER_IDD,
        TOO_SHORT_NSN,
        TOO_LONG
    }

    public NumberParseException(RemoteActionCompatParcelizer remoteActionCompatParcelizer, String str) {
        super(str);
        this.read = str;
        this.IconCompatParcelizer = remoteActionCompatParcelizer;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "Error type: " + this.IconCompatParcelizer + ". " + this.read;
    }
}
