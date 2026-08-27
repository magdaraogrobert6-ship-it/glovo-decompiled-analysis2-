package com.deliveryhero.selfServiceChat.domain.exceptions;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class RetryExhaustedException extends Exception {
    public final Throwable IconCompatParcelizer;
    public final int serializer;

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.IconCompatParcelizer;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.serializer);
        Throwable th = this.IconCompatParcelizer;
        return (iHashCode * 31) + (th == null ? 0 : th.hashCode());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RetryExhaustedException)) {
            return false;
        }
        RetryExhaustedException retryExhaustedException = (RetryExhaustedException) obj;
        if (this.serializer != retryExhaustedException.serializer) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, retryExhaustedException.IconCompatParcelizer}, getCieXyz.write())).booleanValue();
    }

    public RetryExhaustedException(Throwable th) {
        StringBuilder sb = new StringBuilder("Request failed after 3 retries. Latest fail cause: ");
        sb.append(th != null ? th.getMessage() : null);
        super(sb.toString());
        this.serializer = 3;
        this.IconCompatParcelizer = th;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "RetryExhaustedException(retries=" + this.serializer + ", cause=" + this.IconCompatParcelizer + ')';
    }
}
