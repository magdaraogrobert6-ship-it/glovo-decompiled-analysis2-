package com.incognia.internal;

import bo.app.ff$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class MTG extends lL {
    public final String mbG;

    public final int hashCode() {
        return this.mbG.hashCode();
    }

    public MTG(String str) {
        super(ff$$ExternalSyntheticOutline0.m("Data Exception: producer for ", str, " is busy"));
        this.mbG = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MTG)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, ((MTG) obj).mbG}, getCieXyz.write())).booleanValue();
    }
}
