package com.incognia.internal;

import o.getCieXyz;
import o.isAdapterPositionOnScreen;
import o.onViewDetachedFromWindowlambda1;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class jg {
    public static final String N = (String) W4i.ww.MediaSessionCompatResultReceiverWrapper();
    public final String BGx;
    public final onViewDetachedFromWindowlambda1 HQ = new isAdapterPositionOnScreen(new g5x(this));
    public final String mbG;

    public final int hashCode() {
        return this.mbG.hashCode() + (this.BGx.hashCode() * 31);
    }

    public jg(String str, String str2) {
        this.BGx = str;
        this.mbG = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jg)) {
            return false;
        }
        jg jgVar = (jg) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, jgVar.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, jgVar.mbG}, getCieXyz.write())).booleanValue();
    }
}
