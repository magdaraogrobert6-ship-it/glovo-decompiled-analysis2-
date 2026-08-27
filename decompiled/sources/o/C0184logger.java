package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: o.logger, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0184logger {
    public int IconCompatParcelizer;
    public int write;

    public final int hashCode() {
        return this.write;
    }

    public final boolean write(int i) {
        int i2 = this.IconCompatParcelizer;
        if (i2 == 31) {
            return i >= 0;
        }
        return i >= 0 && i < (1 << i2);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0184logger)) {
            return false;
        }
        C0184logger c0184logger = (C0184logger) obj;
        return this.IconCompatParcelizer == c0184logger.IconCompatParcelizer && this.write == c0184logger.write;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Finite Field GF(2^");
        sb.append(this.IconCompatParcelizer);
        sb.append(") = GF(2)[X]/<");
        int i = this.write;
        if (i == 0) {
            str2 = "0";
        } else {
            if (((byte) (i & 1)) == 1) {
                str = "1";
            } else {
                str = "";
            }
            int i2 = i >>> 1;
            int i3 = 1;
            while (i2 != 0) {
                if (((byte) (i2 & 1)) == 1) {
                    str = str + "+x^" + i3;
                }
                i2 >>>= 1;
                i3++;
            }
            str2 = str;
        }
        return ff$$ExternalSyntheticOutline0.m(sb, str2, "> ");
    }

    public final int RemoteActionCompatParcelizer(int i) {
        int i2 = (1 << this.IconCompatParcelizer) - 2;
        int i3 = this.write;
        if (i2 != 0) {
            if (i == 0) {
                return 0;
            }
            if (i != 1) {
                if (i2 < 0) {
                    i = RemoteActionCompatParcelizer(i);
                    i2 = -i2;
                }
                int i4 = 1;
                while (i2 != 0) {
                    if ((i2 & 1) == 1) {
                        i4 = setPlacementApproachInProgress.read(i4, i, i3);
                    }
                    i = setPlacementApproachInProgress.read(i, i, i3);
                    i2 >>>= 1;
                }
                return i4;
            }
        }
        return 1;
    }
}
