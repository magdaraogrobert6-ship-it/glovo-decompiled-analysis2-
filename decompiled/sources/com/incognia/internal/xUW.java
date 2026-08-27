package com.incognia.internal;

import java.util.ArrayList;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class xUW implements LmG {
    public final ArrayList BGx;
    public final mO mbG;

    public final boolean BGx(String str) {
        ArrayList arrayList = this.BGx;
        if (arrayList.isEmpty()) {
            return false;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((FsT) obj).BGx, str}, getCieXyz.write())).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.mbG.hashCode() + (this.BGx.hashCode() * 31);
    }

    public xUW(ArrayList arrayList, mO mOVar) {
        this.BGx = arrayList;
        this.mbG = mOVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xUW)) {
            return false;
        }
        xUW xuw = (xUW) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, xuw.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, xuw.mbG}, getCieXyz.write())).booleanValue();
    }
}
