package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes5.dex */
class BaseCipherSpi$1 extends InvalidKeyException {
    @Override // java.lang.Throwable
    public final Throwable getCause() {
        synchronized (this) {
        }
        return null;
    }
}
