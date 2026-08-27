package org.bouncycastle.asn1;

/* JADX INFO: loaded from: classes4.dex */
public class ASN1ParsingException extends IllegalStateException {
    public final Exception serializer;

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.serializer;
    }

    public ASN1ParsingException(String str, Exception exc) {
        super(str);
        this.serializer = exc;
    }

    public ASN1ParsingException(String str) {
        super(str);
    }
}
