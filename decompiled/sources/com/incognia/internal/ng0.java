package com.incognia.internal;

import java.util.ArrayList;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class ng0 {
    public final Integer A1;
    public final String BGx;
    public final String HQ;
    public final int N;
    public final ArrayList VV3;
    public final Integer hIl;
    public final Integer hs;
    public final String mbG;
    public final int x;

    public ng0(String str, String str2, String str3, int i, int i2, Integer num, Integer num2, ArrayList arrayList, Integer num3) {
        this.BGx = str;
        this.mbG = str2;
        this.HQ = str3;
        this.N = i;
        this.x = i2;
        this.hIl = num;
        this.hs = num2;
        this.VV3 = arrayList;
        this.A1 = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng0)) {
            return false;
        }
        ng0 ng0Var = (ng0) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, ng0Var.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, ng0Var.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, ng0Var.HQ}, getCieXyz.write())).booleanValue() || this.N != ng0Var.N || this.x != ng0Var.x) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hIl, ng0Var.hIl}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hs, ng0Var.hs}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.VV3, ng0Var.VV3}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.A1, ng0Var.A1}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        String str = this.BGx;
        int iBGx = Fo.BGx(this.mbG, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.HQ;
        int iBGx2 = wZ.BGx(this.x, wZ.BGx(this.N, (iBGx + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
        Integer num = this.hIl;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.hs;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        ArrayList arrayList = this.VV3;
        int iHashCode3 = arrayList == null ? 0 : arrayList.hashCode();
        Integer num3 = this.A1;
        return ((((((iBGx2 + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num3 != null ? num3.hashCode() : 0);
    }
}
