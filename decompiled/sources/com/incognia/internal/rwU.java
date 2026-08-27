package com.incognia.internal;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class rwU {
    public final String BGx;
    public final Integer mbG;

    public rwU(String str, Integer num) {
        this.BGx = str;
        this.mbG = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rwU)) {
            return false;
        }
        rwU rwu = (rwU) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, rwu.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, rwu.mbG}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        String str = this.BGx;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.mbG;
        return (iHashCode * 31) + (num != null ? num.hashCode() : 0);
    }
}
