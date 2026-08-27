package com.incognia.internal;

import o.ensureSubscribedToInAppMessageEventslambda7;
import o.getCieXyz;
import o.removeNodeAtDepth;
import o.setCarryoverInAppMessage;

/* JADX INFO: loaded from: classes2.dex */
public final class phu {
    public final vrg BGx;
    public final int HQ;
    public final int N;
    public final String hIl;
    public final String hs;
    public final int mbG;
    public final long x;

    public final int hashCode() {
        int iBGx = NS.BGx(this.x, wZ.BGx(this.N, wZ.BGx(this.HQ, wZ.BGx(this.mbG, this.BGx.hashCode() * 31, 31), 31), 31), 31);
        String str = this.hIl;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.hs;
        return ((iBGx + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public phu(vrg vrgVar, int i, int i2, int i3, long j, String str, String str2) {
        this.BGx = vrgVar;
        this.mbG = i;
        this.HQ = i2;
        this.N = i3;
        this.x = j;
        this.hIl = str;
        this.hs = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof phu)) {
            return false;
        }
        phu phuVar = (phu) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, phuVar.BGx}, getCieXyz.write())).booleanValue() || this.mbG != phuVar.mbG || this.HQ != phuVar.HQ || this.N != phuVar.N || this.x != phuVar.x) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hIl, phuVar.hIl}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hs, phuVar.hs}, getCieXyz.write())).booleanValue();
    }

    public final boolean BGx() {
        int i;
        int i2;
        String str = this.hIl;
        Integer numMediaSessionCompatQueueItem = str != null ? setCarryoverInAppMessage.MediaSessionCompatQueueItem(10, str) : null;
        String str2 = this.hs;
        Integer numMediaSessionCompatQueueItem2 = str2 != null ? setCarryoverInAppMessage.MediaSessionCompatQueueItem(10, str2) : null;
        int i3 = this.mbG;
        if (i3 == Integer.MAX_VALUE || i3 == 0 || (i = this.HQ) == Integer.MAX_VALUE || i == 0 || -150 > (i2 = this.N) || i2 >= 0 || this.hIl == null) {
            return false;
        }
        if ((numMediaSessionCompatQueueItem == null || new ensureSubscribedToInAppMessageEventslambda7(1, 999, 1).serializer(numMediaSessionCompatQueueItem.intValue())) && this.hs != null) {
            return numMediaSessionCompatQueueItem2 == null || new ensureSubscribedToInAppMessageEventslambda7(1, 999, 1).serializer(numMediaSessionCompatQueueItem2.intValue());
        }
        return false;
    }
}
