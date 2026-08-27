package com.mapbox.navigation.base.internal;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.List;
import o.SweepGradientShader9KIMszodefault;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class CongestionNumericOverride {
    public final int legIndex;
    public final int length;
    public final List originalCongestionNumeric;
    public final int startIndex;

    public final int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(this.length, af$$ExternalSyntheticOutline0.m(this.startIndex, Integer.hashCode(this.legIndex) * 31, 31), 31);
        List list = this.originalCongestionNumeric;
        return iM + (list == null ? 0 : list.hashCode());
    }

    public CongestionNumericOverride(List list, int i, int i2, int i3) {
        this.legIndex = i;
        this.startIndex = i2;
        this.length = i3;
        this.originalCongestionNumeric = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CongestionNumericOverride)) {
            return false;
        }
        CongestionNumericOverride congestionNumericOverride = (CongestionNumericOverride) obj;
        if (this.legIndex != congestionNumericOverride.legIndex || this.startIndex != congestionNumericOverride.startIndex || this.length != congestionNumericOverride.length) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.originalCongestionNumeric, congestionNumericOverride.originalCongestionNumeric}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CongestionNumericOverride(legIndex=");
        sb.append(this.legIndex);
        sb.append(", startIndex=");
        sb.append(this.startIndex);
        sb.append(", length=");
        sb.append(this.length);
        sb.append(", originalCongestionNumeric=");
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(sb, this.originalCongestionNumeric, ')');
    }
}
