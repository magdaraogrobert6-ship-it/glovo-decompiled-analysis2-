package com.incognia.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class F87 {
    public final int BGx;
    public final long mbG;

    public final int hashCode() {
        return Long.hashCode(this.mbG) + (Integer.hashCode(this.BGx) * 31);
    }

    public F87(int i, long j) {
        this.BGx = i;
        this.mbG = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F87)) {
            return false;
        }
        F87 f87 = (F87) obj;
        return this.BGx == f87.BGx && this.mbG == f87.mbG;
    }
}
