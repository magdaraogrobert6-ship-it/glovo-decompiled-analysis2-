package org.bouncycastle.util.encoders;

/* JADX INFO: loaded from: classes4.dex */
public class EncoderException extends IllegalStateException {
    public Exception write;

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.write;
    }

    public EncoderException(String str) {
        super(str);
    }
}
