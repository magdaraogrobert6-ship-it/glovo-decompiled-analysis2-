package com.braze.events;

import bo.app.l2;
import bo.app.yd;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class BrazeSdkAuthenticationErrorEvent {
    private final yd sdkAuthError;

    private final yd component1() {
        return this.sdkAuthError;
    }

    public final int getErrorCode() {
        return this.sdkAuthError.b;
    }

    public final String getErrorReason() {
        return this.sdkAuthError.c;
    }

    public final Long getRequestInitiationTime() {
        return ((l2) this.sdkAuthError.a).e;
    }

    public final String getSignature() {
        return ((l2) this.sdkAuthError.a).k;
    }

    public final String getUserId() {
        return ((l2) this.sdkAuthError.a).b;
    }

    public int hashCode() {
        return this.sdkAuthError.hashCode();
    }

    public String toString() {
        return this.sdkAuthError.toString();
    }

    public BrazeSdkAuthenticationErrorEvent(yd ydVar) {
        ydVar.getClass();
        this.sdkAuthError = ydVar;
    }

    public static /* synthetic */ BrazeSdkAuthenticationErrorEvent copy$default(BrazeSdkAuthenticationErrorEvent brazeSdkAuthenticationErrorEvent, yd ydVar, int i, Object obj) {
        if ((i & 1) != 0) {
            ydVar = brazeSdkAuthenticationErrorEvent.sdkAuthError;
        }
        return brazeSdkAuthenticationErrorEvent.copy(ydVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrazeSdkAuthenticationErrorEvent)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sdkAuthError, ((BrazeSdkAuthenticationErrorEvent) obj).sdkAuthError}, getCieXyz.write())).booleanValue();
    }

    public final BrazeSdkAuthenticationErrorEvent copy(yd ydVar) {
        ydVar.getClass();
        return new BrazeSdkAuthenticationErrorEvent(ydVar);
    }
}
