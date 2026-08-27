package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class zdS {
    public final Integer BGx;

    public zdS(Integer num) {
        this.BGx = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdS)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, ((zdS) obj).BGx}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "GooglePlayServicesInfo(googlePlayServicesVersion=" + this.BGx + ')';
    }

    public final int hashCode() {
        Integer num = this.BGx;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }
}
