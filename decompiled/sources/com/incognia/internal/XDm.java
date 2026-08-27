package com.incognia.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class XDm {
    public final int BGx;
    public final int mbG;

    public final int hashCode() {
        return Integer.hashCode(this.mbG) + (Integer.hashCode(this.BGx) * 31);
    }

    public XDm(int i, int i2) {
        this.BGx = i;
        this.mbG = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XDm)) {
            return false;
        }
        XDm xDm = (XDm) obj;
        return this.BGx == xDm.BGx && this.mbG == xDm.mbG;
    }
}
