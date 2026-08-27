package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class KqT extends Exception {
    public final String BGx;
    public final String mbG;

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.BGx;
    }

    public KqT() {
        super("Failed to generate request token.");
        this.BGx = "Failed to generate request token.";
        this.mbG = "Failed to generate request token.";
    }

    public final int hashCode() {
        return this.mbG.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KqT)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, ((KqT) obj).mbG}, getCieXyz.write())).booleanValue();
    }
}
