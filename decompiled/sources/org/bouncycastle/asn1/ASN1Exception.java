package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class ASN1Exception extends IOException {
    public final RuntimeException IconCompatParcelizer;

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.IconCompatParcelizer;
    }

    public ASN1Exception(RuntimeException runtimeException, String str) {
        super(str);
        this.IconCompatParcelizer = runtimeException;
    }

    public ASN1Exception(String str) {
        super(str);
    }
}
