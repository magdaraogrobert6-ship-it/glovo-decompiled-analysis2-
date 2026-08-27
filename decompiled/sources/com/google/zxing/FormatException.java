package com.google.zxing;

/* JADX INFO: loaded from: classes4.dex */
public final class FormatException extends ReaderException {
    public static final FormatException IconCompatParcelizer;

    static {
        FormatException formatException = new FormatException();
        IconCompatParcelizer = formatException;
        formatException.setStackTrace(ReaderException.write);
    }
}
