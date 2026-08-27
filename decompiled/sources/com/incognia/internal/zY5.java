package com.incognia.internal;

import java.util.LinkedHashMap;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class zY5 {
    public final String BGx;
    public final LinkedHashMap HQ;
    public final String N;
    public final String mbG;
    public final String x;

    public zY5(String str, String str2, LinkedHashMap linkedHashMap, String str3, String str4) {
        this.BGx = str;
        this.mbG = str2;
        this.HQ = linkedHashMap;
        this.N = str3;
        this.x = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zY5)) {
            return false;
        }
        zY5 zy5 = (zY5) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, zy5.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, zy5.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, zy5.HQ}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.N, zy5.N}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.x, zy5.x}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        String str = this.BGx;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.mbG;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        LinkedHashMap linkedHashMap = this.HQ;
        int iHashCode3 = linkedHashMap == null ? 0 : linkedHashMap.hashCode();
        String str3 = this.N;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.x;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
    }
}
