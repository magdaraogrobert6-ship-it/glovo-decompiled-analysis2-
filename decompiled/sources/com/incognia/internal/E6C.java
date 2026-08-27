package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class E6C {
    public final String BGx;
    public final U9 mbG;

    public final int hashCode() {
        return this.mbG.hashCode() + (this.BGx.hashCode() * 31);
    }

    public E6C(String str, U9 u9) {
        this.BGx = str;
        this.mbG = u9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E6C)) {
            return false;
        }
        E6C e6c = (E6C) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, e6c.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, e6c.mbG}, getCieXyz.write())).booleanValue();
    }
}
