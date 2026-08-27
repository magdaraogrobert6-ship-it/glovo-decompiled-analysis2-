package com.incognia.internal;

import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.getCieXyz;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class xli extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ VLf BGx;

    public static final void BGx(A2B a2b, VLf vLf) {
        Object[] objArr = {a2b.BGx, L5i.HQ};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            KWh kWh = vLf.N;
            Ay.HQ.BGx(VLf.TfN, Long.valueOf(System.currentTimeMillis()));
        }
        int i = a2b.BGx.BGx;
        vLf.getClass();
        Ay.HQ.BGx(VLf.OV7, Integer.valueOf(i));
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final /* synthetic */ Object invoke(Object obj) {
        BGx((A2B) obj);
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xli(VLf vLf) {
        super(1);
        this.BGx = vLf;
    }

    public final void BGx(A2B a2b) {
        VLf vLf = this.BGx;
        O6.BGx(vLf, new Dd$$ExternalSyntheticLambda0(a2b, vLf));
    }
}
