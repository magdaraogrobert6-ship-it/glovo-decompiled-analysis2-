package com.incognia.internal;

import android.util.Log;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class VOk {
    public final String BGx;
    public final boolean HQ;
    public final boolean N;
    public final int hIl;
    public final boolean mbG;
    public final boolean x;

    public VOk(String str, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        this.BGx = str;
        this.mbG = z;
        this.HQ = z2;
        this.N = z3;
        this.x = z4;
        this.hIl = i;
        if (i < 900) {
            String str2 = z4 ? " loaded from file" : "";
            if (IU.BGx.get()) {
                Log.w("Incognia", "Invalid requestTokenMaxLength" + str2 + ": Must be set to an integer no smaller than 900. Setting it to the minimum instead.");
            }
            i = 900;
        }
        this.hIl = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VOk)) {
            return false;
        }
        VOk vOk = (VOk) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, vOk.BGx}, getCieXyz.write())).booleanValue() && this.mbG == vOk.mbG && this.HQ == vOk.HQ && this.N == vOk.N && this.x == vOk.x && this.hIl == vOk.hIl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    public final int hashCode() {
        String str = this.BGx;
        int iHashCode = str == null ? 0 : str.hashCode();
        boolean z = this.mbG;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        boolean z2 = this.HQ;
        ?? r3 = z2;
        if (z2) {
            r3 = 1;
        }
        boolean z3 = this.N;
        ?? r4 = z3;
        if (z3) {
            r4 = 1;
        }
        boolean z4 = this.x;
        return Integer.hashCode(this.hIl) + (((((((((iHashCode * 31) + r1) * 31) + r3) * 31) + r4) * 31) + (z4 ? 1 : z4)) * 31);
    }

    public /* synthetic */ VOk(String str, boolean z, boolean z2, boolean z3, int i, int i2) {
        this(str, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? true : z2, (i2 & 8) != 0 ? false : z3, false, (i2 & 32) != 0 ? JosStatusCodes.RTN_CODE_COMMON_ERROR : i);
    }
}
