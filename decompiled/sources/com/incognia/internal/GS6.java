package com.incognia.internal;

import com.incognia.Incognia$$ExternalSyntheticLambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class GS6 implements yUe {
    public final UsU BGx;
    public final yZI HQ;
    public final utV mbG;
    public JyL N = VPw.BGx;
    public final g6v x = new bV$$ExternalSyntheticLambda0(this, 1);

    @Override // com.incognia.internal.yUe
    public final JyL N() {
        return this.N;
    }

    public static final void BGx(GS6 gs6, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        yZI yzi = gs6.HQ;
        yzi.HQ.remove(gs6.x);
        gs6.N = c39.BGx;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
    }

    public static final void mbG(GS6 gs6) {
        yZI yzi = gs6.HQ;
        yzi.HQ.add(gs6.x);
    }

    @Override // com.incognia.internal.yUe
    public final void HQ() {
        this.N = Yp.BGx;
        O6.BGx(this, new Q$$ExternalSyntheticLambda1(5, this));
    }

    @Override // com.incognia.internal.yUe
    public final void hIl() {
        this.N = pbf.BGx;
    }

    public GS6(UsU usU, utV utv, yZI yzi) {
        this.BGx = usU;
        this.mbG = utv;
        this.HQ = yzi;
    }

    public final void mbG() {
        O6.BGx(this, new Incognia$$ExternalSyntheticLambda0(3, this));
    }

    public static final void BGx(GS6 gs6, boolean z) {
        gs6.mbG();
    }

    @Override // com.incognia.internal.yUe
    public final void BGx(vN8 vn8) {
        O6.BGx(this, new N6$$ExternalSyntheticLambda0(this, 5, vn8));
    }

    @Override // com.incognia.internal.yUe
    public final UsU BGx() {
        return this.BGx;
    }

    public static final void BGx(GS6 gs6) {
        gs6.mbG.BGx(new ZmT(TE9.mbG));
    }
}
