package com.incognia.internal;

import java.util.List;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class QMF {
    public final String BGx;
    public final List mbG;

    public final int hashCode() {
        int iHashCode = this.BGx.hashCode();
        List list = this.mbG;
        return (iHashCode * 31) + (list == null ? 0 : list.hashCode());
    }

    public QMF(String str, List list) {
        this.BGx = str;
        this.mbG = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QMF)) {
            return false;
        }
        QMF qmf = (QMF) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, qmf.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, qmf.mbG}, getCieXyz.write())).booleanValue();
    }
}
