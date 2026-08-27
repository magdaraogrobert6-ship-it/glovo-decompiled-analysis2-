package com.incognia.internal;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicReference;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ScN implements yUe {
    public static final long hs = 10000;
    public final UsU BGx;
    public final NvL HQ;
    public final KWh N;
    public final utV mbG;
    public static final String VV3 = (String) W4i.Uwq.MediaSessionCompatResultReceiverWrapper();
    public static final String A1 = (String) W4i.I4.MediaSessionCompatResultReceiverWrapper();
    public JyL x = VPw.BGx;
    public final YPp hIl = new S6n$$ExternalSyntheticLambda3(this, 1);

    @Override // com.incognia.internal.yUe
    public final JyL N() {
        return this.x;
    }

    public static final void BGx(ScN scN, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        AtomicReference atomicReference = Q.mbG;
        Q.HQ(scN.hIl);
        scN.x = c39.BGx;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
    }

    public static final void mbG(ScN scN) {
        KWh kWh = scN.N;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jOptLong = ((JSONObject) scN.HQ.BGx.get()).optLong(VV3, hs);
        mP mPVar = Ay.BGx;
        String str = A1;
        Long lN = mPVar.N(str);
        long jLongValue = lN != null ? lN.longValue() : 0L;
        if (jLongValue <= 0 || jElapsedRealtime < jLongValue || jElapsedRealtime - jLongValue >= jOptLong) {
            mPVar.BGx(str, Long.valueOf(jElapsedRealtime));
            scN.mbG.BGx(new ZmT(ijP.mbG));
        }
    }

    @Override // com.incognia.internal.yUe
    public final void HQ() {
        this.x = Yp.BGx;
        O6.BGx(this, new ScN$$ExternalSyntheticLambda2(this, 1));
    }

    @Override // com.incognia.internal.yUe
    public final void hIl() {
        this.x = pbf.BGx;
    }

    public ScN(UsU usU, utV utv, NvL nvL, KWh kWh) {
        this.BGx = usU;
        this.mbG = utv;
        this.HQ = nvL;
        this.N = kWh;
    }

    public static final void HQ(ScN scN) {
        AtomicReference atomicReference = Q.mbG;
        Q.BGx(scN.hIl);
    }

    public static final void BGx(ScN scN) {
        scN.mbG();
    }

    @Override // com.incognia.internal.yUe
    public final void BGx(vN8 vn8) {
        O6.BGx(this, new N6$$ExternalSyntheticLambda0(this, 11, vn8));
    }

    @Override // com.incognia.internal.yUe
    public final UsU BGx() {
        return this.BGx;
    }

    public final void mbG() {
        O6.BGx(this, new ScN$$ExternalSyntheticLambda2(this, 0));
    }
}
