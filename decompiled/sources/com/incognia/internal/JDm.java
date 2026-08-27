package com.incognia.internal;

import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.getCieXyz;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class JDm extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public static final JDm BGx = new JDm();

    public JDm() {
        super(0);
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        IU.BGx.get();
        Hwl hwlBGx = oV.BGx();
        Object[] objArr = {(String) hwlBGx.mbG.HQ.get(), null};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            hwlBGx.BGx(SFo.mbG, new ZY(hwlBGx, null));
        }
        return createFromParcel.INSTANCE;
    }
}
