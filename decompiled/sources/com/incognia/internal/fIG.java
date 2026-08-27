package com.incognia.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class fIG {
    public final boolean BGx;
    public final boolean mbG;

    public fIG(boolean z, boolean z2) {
        this.BGx = z;
        this.mbG = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fIG)) {
            return false;
        }
        fIG fig = (fIG) obj;
        return this.BGx == fig.BGx && this.mbG == fig.mbG;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public final int hashCode() {
        boolean z = this.BGx;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        boolean z2 = this.mbG;
        return (r0 * 31) + (z2 ? 1 : z2);
    }
}
