package com.incognia.internal;

import bo.app.c8$$ExternalSyntheticOutline0;
import java.net.SocketTimeoutException;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class aud extends E3 {
    public final String HQ;
    public final SocketTimeoutException N;

    @Override // com.incognia.internal.E3, java.lang.Throwable
    public final Throwable getCause() {
        return this.N;
    }

    public final int hashCode() {
        int iHashCode = this.HQ.hashCode();
        SocketTimeoutException socketTimeoutException = this.N;
        return (iHashCode * 31) + (socketTimeoutException == null ? 0 : socketTimeoutException.hashCode());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public aud(String str, SocketTimeoutException socketTimeoutException) {
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Network Exception: Network timeout URL: ", str, " Cause: ");
        sbM.append(socketTimeoutException.getMessage());
        super(sbM.toString(), socketTimeoutException, 1);
        this.HQ = str;
        this.N = socketTimeoutException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aud)) {
            return false;
        }
        aud audVar = (aud) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, audVar.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, audVar.N}, getCieXyz.write())).booleanValue();
    }
}
