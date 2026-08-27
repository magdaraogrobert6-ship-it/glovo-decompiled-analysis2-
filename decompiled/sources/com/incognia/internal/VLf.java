package com.incognia.internal;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.TimeZone;
import o.isItemDismissable;
import o.onItemDismiss;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class VLf implements yUe {
    public Wea A1;
    public final UsU BGx;
    public final Mqj HQ;
    public final KWh N;
    public JyL VV3 = VPw.BGx;
    public final SVJ fZl;
    public final String hIl;
    public final jgb hs;
    public final utV mbG;
    public final SVJ q;
    public final cY x;
    public static final String S = (String) W4i.aQ.MediaSessionCompatResultReceiverWrapper();
    public static final String iaH = (String) W4i.BRJ.MediaSessionCompatResultReceiverWrapper();
    public static final String e = (String) W4i.i.MediaSessionCompatResultReceiverWrapper();
    public static final String VLD = (String) W4i.FcC.MediaSessionCompatResultReceiverWrapper();
    public static final String TfN = (String) W4i.JbU.MediaSessionCompatResultReceiverWrapper();
    public static final String OV7 = (String) W4i.BL.MediaSessionCompatResultReceiverWrapper();

    @Override // com.incognia.internal.yUe
    public final JyL N() {
        return this.VV3;
    }

    @Override // com.incognia.internal.yUe
    public final void HQ() {
        this.VV3 = Yp.BGx;
    }

    @Override // com.incognia.internal.yUe
    public final void hIl() {
        this.VV3 = pbf.BGx;
        this.mbG.BGx(aZK.class, this.fZl);
        this.mbG.BGx(A2B.class, this.q);
    }

    public VLf(UsU usU, utV utv, Mqj mqj, KWh kWh, cY cYVar, String str, jgb jgbVar) {
        this.BGx = usU;
        this.mbG = utv;
        this.HQ = mqj;
        this.N = kWh;
        this.x = cYVar;
        this.hIl = str;
        this.hs = jgbVar;
        this.q = new SVJ(iaH, usU, new xli(this));
        this.fZl = new SVJ(S, usU, new Dd(this));
    }

    public static final void BGx(VLf vLf, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (!vLf.x.BGx()) {
            af$$ExternalSyntheticOutline0.m(new isItemDismissable(new Z9T(e)), r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            return;
        }
        Wea wea = vLf.A1;
        if (wea == null) {
            String str = vLf.hIl;
            String strBGx = AUn.BGx();
            mP mPVar = Ay.HQ;
            String str2 = VLD;
            Long lN = mPVar.N(str2);
            long jLongValue = lN != null ? lN.longValue() : 0L;
            Wea wea2 = new Wea(null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, strBGx, null, null, null, null, null, null, null, null, null, null, XUh.e, String.valueOf(XUh.S), null, null, null, null, null, 71002, null, null, null, null, null, null, null, null, null, TimeZone.getDefault().getID(), Long.valueOf(jLongValue), Long.valueOf(System.currentTimeMillis()), null);
            Long lN2 = mPVar.N(str2);
            mPVar.BGx(str2, Long.valueOf((lN2 != null ? lN2.longValue() : 0L) + 1));
            vLf.A1 = wea2;
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new onItemDismiss(wea2));
            return;
        }
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new onItemDismiss(wea));
    }

    public static final void BGx(VLf vLf, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        vLf.VV3 = c39.BGx;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
    }

    public final void BGx(dN dNVar) {
        if (O6.BGx(this, new Dd$$ExternalSyntheticLambda0(this, 12, dNVar))) {
            return;
        }
        dNVar.invoke(new onItemDismiss(new isItemDismissable(new vqX(e))));
    }

    @Override // com.incognia.internal.yUe
    public final UsU BGx() {
        return this.BGx;
    }

    @Override // com.incognia.internal.yUe
    public final void BGx(vN8 vn8) {
        this.mbG.mbG(aZK.class, this.fZl);
        this.mbG.mbG(A2B.class, this.q);
        O6.BGx(this, new N6$$ExternalSyntheticLambda0(this, 14, vn8));
    }
}
