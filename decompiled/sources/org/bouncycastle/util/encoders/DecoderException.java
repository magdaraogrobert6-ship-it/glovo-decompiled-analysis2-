package org.bouncycastle.util.encoders;

/* JADX INFO: loaded from: classes4.dex */
public class DecoderException extends IllegalStateException {
    public Exception write;

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.write;
    }

    public DecoderException(String str) {
        super(str);
    }
}
