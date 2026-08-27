package com.incognia.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class iO {
    public final boolean BGx;
    public final boolean HQ;
    public final boolean mbG;

    public iO(boolean z, boolean z2, boolean z3) {
        this.BGx = z;
        this.mbG = z2;
        this.HQ = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iO)) {
            return false;
        }
        iO iOVar = (iO) obj;
        return this.BGx == iOVar.BGx && this.mbG == iOVar.mbG && this.HQ == iOVar.HQ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    public final int hashCode() {
        boolean z = this.BGx;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        boolean z2 = this.mbG;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        boolean z3 = this.HQ;
        return (((r0 * 31) + r2) * 31) + (z3 ? 1 : z3);
    }
}
