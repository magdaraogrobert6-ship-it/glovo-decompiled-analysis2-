package com.incognia.internal;

import java.util.concurrent.atomic.AtomicReference;
import o.getCieXyz;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class rpN implements yUe {
    public static final String hIl = (String) W4i.Fgd.MediaSessionCompatResultReceiverWrapper();
    public final UsU BGx;
    public final Ymx HQ;
    public final utV mbG;
    public JyL N = VPw.BGx;
    public final r x = new Tm7$$ExternalSyntheticLambda3(this, 1);

    @Override // com.incognia.internal.yUe
    public final JyL N() {
        return this.N;
    }

    public static final void BGx(rpN rpn) {
        boolean zBGx = rpn.HQ.BGx();
        mP mPVar = Ay.BGx;
        String str = hIl;
        Object[] objArr = {mPVar.mbG(str), Boolean.valueOf(zBGx)};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return;
        }
        mPVar.BGx(str, Boolean.valueOf(zBGx));
        rpn.mbG.BGx(new ZmT(Bv3.mbG));
    }

    @Override // com.incognia.internal.yUe
    public final void HQ() {
        this.N = Yp.BGx;
        O6.BGx(this, new rpN$$ExternalSyntheticLambda0(this, 1));
    }

    @Override // com.incognia.internal.yUe
    public final void hIl() {
        this.N = pbf.BGx;
    }

    public rpN(UsU usU, utV utv, Ymx ymx) {
        this.BGx = usU;
        this.mbG = utv;
        this.HQ = ymx;
    }

    public final void mbG() {
        O6.mbG(this, new rpN$$ExternalSyntheticLambda0(this, 0));
    }

    public static final void mbG(rpN rpn) {
        rpn.mbG();
    }

    public static final void HQ(rpN rpn) {
        AtomicReference atomicReference = Q.mbG;
        Q.BGx(rpn.x);
    }

    @Override // com.incognia.internal.yUe
    public final void BGx(vN8 vn8) {
        O6.BGx(this, new N6$$ExternalSyntheticLambda0(this, 23, vn8));
    }

    public static final void BGx(rpN rpn, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        AtomicReference atomicReference = Q.mbG;
        Q.HQ(rpn.x);
        rpn.N = c39.BGx;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
    }

    @Override // com.incognia.internal.yUe
    public final UsU BGx() {
        return this.BGx;
    }
}
