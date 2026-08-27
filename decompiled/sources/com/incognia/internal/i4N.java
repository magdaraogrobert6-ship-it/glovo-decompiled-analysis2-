package com.incognia.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class i4N {
    public final double BGx;
    public final double mbG;

    public final int hashCode() {
        return Double.hashCode(this.mbG) + (Double.hashCode(this.BGx) * 31);
    }

    public i4N(double d, double d2) {
        this.BGx = d;
        this.mbG = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4N)) {
            return false;
        }
        i4N i4n = (i4N) obj;
        return Double.compare(this.BGx, i4n.BGx) == 0 && Double.compare(this.mbG, i4n.mbG) == 0;
    }
}
