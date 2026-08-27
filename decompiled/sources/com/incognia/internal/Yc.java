package com.incognia.internal;

import o.ensureSubscribedToInAppMessageEvents;

/* JADX INFO: loaded from: classes2.dex */
public final class Yc {
    public final int BGx;
    public final byte[] mbG;

    public final long BGx() {
        return nQ.mbG(this.mbG).longValue();
    }

    public final String mbG() {
        return new String(this.mbG, ensureSubscribedToInAppMessageEvents.write).intern();
    }

    public Yc(int i, byte[] bArr) {
        this.BGx = i;
        this.mbG = bArr;
    }
}
