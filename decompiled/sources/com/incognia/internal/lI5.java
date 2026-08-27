package com.incognia.internal;

import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.List;
import o.getCieXyz;
import o.instance_delegatelambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class lI5 {
    public final List BGx;
    public final List HQ;
    public final List mbG;

    public final int hashCode() {
        return this.HQ.hashCode() + c8$$ExternalSyntheticOutline0.m(this.mbG, this.BGx.hashCode() * 31, 31);
    }

    public lI5() {
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        this.BGx = instance_delegatelambda0Var;
        this.mbG = instance_delegatelambda0Var;
        this.HQ = instance_delegatelambda0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lI5)) {
            return false;
        }
        lI5 li5 = (lI5) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, li5.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, li5.mbG}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.HQ, li5.HQ}, getCieXyz.write())).booleanValue();
    }

    public lI5(List list, List list2, List list3) {
        this.BGx = list;
        this.mbG = list2;
        this.HQ = list3;
    }
}
