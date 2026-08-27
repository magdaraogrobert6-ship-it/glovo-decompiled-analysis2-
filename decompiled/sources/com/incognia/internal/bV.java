package com.incognia.internal;

import android.location.Location;
import bo.app.af$$ExternalSyntheticOutline0;
import com.google.android.gms.location.DeviceOrientationRequest;
import o.isItemDismissable;
import o.onItemDismiss;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class bV implements yUe, BR {
    public final V9 A1;
    public final NvL BGx;
    public final utV HQ;
    public final X6a N;
    public final KWh VV3;
    public int e;
    public final PAZ hIl;
    public final BvF hs;
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM iaH;
    public final UsU mbG;
    public final yZI q;
    public final C2w x;
    public static final String JR = (String) W4i.ISd.MediaSessionCompatResultReceiverWrapper();
    public static final long j = DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM;
    public static final long n = 180000;
    public static final long vM = DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM;
    public static final float l5 = 200.0f;
    public static final String ss = (String) W4i.k.MediaSessionCompatResultReceiverWrapper();
    public static final String B = (String) W4i.hSP.MediaSessionCompatResultReceiverWrapper();
    public static final String YO = (String) W4i.hG.MediaSessionCompatResultReceiverWrapper();
    public static final String N6D = (String) W4i.V.MediaSessionCompatResultReceiverWrapper();
    public static final String v = (String) W4i.r1.MediaSessionCompatResultReceiverWrapper();
    public static final String Y = (String) W4i.KN6.MediaSessionCompatResultReceiverWrapper();
    public static final String Ft = (String) W4i.Ppr.MediaSessionCompatResultReceiverWrapper();
    public static final String RIs = (String) W4i.Pxe.MediaSessionCompatResultReceiverWrapper();
    public JyL fZl = VPw.BGx;
    public boolean S = mbG();
    public final g6v VLD = new bV$$ExternalSyntheticLambda0(this, 0);
    public final EGf TfN = new EGf(this);
    public final huJ OV7 = new huJ(this);

    @Override // com.incognia.internal.BR
    public final void VV3() {
        kV.BGx(this);
    }

    @Override // com.incognia.internal.BR
    public final boolean x() {
        return this.S;
    }

    public static final void N(bV bVVar) {
        yZI yzi = bVVar.q;
        yzi.HQ.add(bVVar.VLD);
        if (bVVar.S) {
            bVVar.fZl();
            try {
                bVVar.hs.BGx(bVVar.TfN);
            } catch (Throwable th) {
                bVVar.N.BGx(th, false);
            }
        }
    }

    public static Gbn q() {
        return (Gbn) Ay.BGx.BGx(jsc.BGx, JR);
    }

    public final onViewAttachedToWindowlambda0 BGx(Gbn gbn, Gbn gbn2) {
        boolean z = true;
        boolean zOptBoolean = ((JSONObject) this.BGx.BGx.get()).optBoolean(Ft, true);
        long jOptLong = ((JSONObject) this.BGx.BGx.get()).optLong(RIs, vM);
        long j2 = gbn.N;
        long j3 = gbn2 != null ? gbn2.N : 0L;
        boolean z2 = (gbn2 == null || gbn.x == gbn2.x) ? false : true;
        if (zOptBoolean && z2 && j2 - j3 >= jOptLong) {
            return new onViewAttachedToWindowlambda0(Boolean.TRUE, iDO.mbG);
        }
        if (!((JSONObject) this.BGx.BGx.get()).optBoolean(N6D, true)) {
            return new onViewAttachedToWindowlambda0(Boolean.FALSE, null);
        }
        hvS hvs = gbn2 != null ? new hvS(gbn2) : null;
        if (hvs != null) {
            Gbn gbn3 = hvs.BGx;
            if (gbn3.x == gbn.x) {
                float[] fArr = new float[3];
                Location.distanceBetween(gbn.BGx, gbn.mbG, gbn3.BGx, gbn3.mbG, fArr);
                if (fArr[0] <= 100.0f) {
                    z = false;
                }
            }
        }
        return new onViewAttachedToWindowlambda0(Boolean.valueOf(z), GQY.mbG);
    }

    @Override // com.incognia.internal.yUe
    public final void hIl() {
        this.fZl = pbf.BGx;
    }

    @Override // com.incognia.internal.BR
    public final boolean mbG() {
        return this.A1.mbG(JR) && this.q.BGx();
    }

    public bV(NvL nvL, UsU usU, utV utv, X6a x6a, C2w c2w, PAZ paz, BvF bvF, KWh kWh, s5 s5Var, V9 v9, yZI yzi) {
        this.BGx = nvL;
        this.mbG = usU;
        this.HQ = utv;
        this.N = x6a;
        this.x = c2w;
        this.hIl = paz;
        this.hs = bvF;
        this.VV3 = kWh;
        this.A1 = v9;
        this.q = yzi;
    }

    public static final void HQ(bV bVVar) {
        bVVar.fZl();
        try {
            bVVar.hs.BGx(bVVar.TfN);
        } catch (Throwable th) {
            bVVar.N.BGx(th, false);
        }
    }

    @Override // com.incognia.internal.BR
    public final void A1() {
        O6.BGx(this, new bV$$ExternalSyntheticLambda1(this, 1));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    public final boolean fZl() {
        Gbn gbnBGx;
        try {
            gbnBGx = this.hs.BGx("gps");
            Gbn gbnBGx2 = this.hs.BGx("network");
            Ms msBGx = BGx(false, true);
            boolean zBGx = gbnBGx != null ? IET.BGx(gbnBGx, msBGx) : false;
            boolean zBGx2 = gbnBGx2 != null ? IET.BGx(gbnBGx2, msBGx) : false;
            if (zBGx && zBGx2) {
                if (gbnBGx.HQ >= gbnBGx2.HQ) {
                    gbnBGx = gbnBGx2;
                }
            } else if (!zBGx) {
                if (zBGx2) {
                    gbnBGx = gbnBGx2;
                } else {
                    gbnBGx = null;
                }
            }
        } catch (Throwable th) {
            this.N.BGx(th, false);
        }
        if (gbnBGx == null) {
            return false;
        }
        Ay.BGx.BGx(JR, gbnBGx, hn.BGx);
        return true;
    }

    @Override // com.incognia.internal.BR
    public final void hs() {
        O6.BGx(this, new bV$$ExternalSyntheticLambda1(this, 0));
    }

    @Override // com.incognia.internal.yUe
    public final void HQ() {
        this.fZl = Yp.BGx;
        O6.BGx(this, new Q$$ExternalSyntheticLambda1(12, this));
    }

    public static final void mbG(bV bVVar) {
        bVVar.getClass();
        try {
            bVVar.hs.mbG(bVVar.TfN);
        } catch (Throwable th) {
            bVVar.N.BGx(th, false);
        }
    }

    @Override // com.incognia.internal.yUe
    public final JyL N() {
        return this.fZl;
    }

    @Override // com.incognia.internal.yUe
    public final UsU BGx() {
        return this.mbG;
    }

    @Override // com.incognia.internal.BR
    public final void BGx(boolean z) {
        this.S = z;
    }

    public static final void BGx(bV bVVar, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        if (bVVar.S) {
            try {
                bVVar.hs.mbG(bVVar.TfN);
            } catch (Throwable th) {
                bVVar.N.BGx(th, false);
            }
        }
        yZI yzi = bVVar.q;
        yzi.HQ.remove(bVVar.VLD);
        bVVar.fZl = c39.BGx;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
    }

    public static final void BGx(bV bVVar, boolean z) {
        O6.BGx(bVVar, new bV$$ExternalSyntheticLambda1(bVVar, 2));
    }

    public static final void BGx(bV bVVar) {
        bVVar.getClass();
        kV.BGx(bVVar);
    }

    public final void BGx(OHI ohi) {
        if (O6.BGx(this, new N6$$ExternalSyntheticLambda0(this, ohi, 19))) {
            return;
        }
        ohi.BGx(new isItemDismissable(new vqX(JR)));
    }

    public static final void BGx(bV bVVar, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        Ms msBGx = bVVar.BGx(false, false);
        if (q() != null && IET.BGx(q(), msBGx)) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new onItemDismiss(q()));
            return;
        }
        bVVar.iaH = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        bVVar.e = 0;
        try {
            if (bVVar.x.BGx(bVVar.OV7)) {
                bVVar.e++;
                return;
            }
        } catch (Throwable th) {
            bVVar.N.BGx(th, false);
        }
        boolean zOptBoolean = ((JSONObject) bVVar.BGx.BGx.get()).optBoolean(ss, false);
        boolean zOptBoolean2 = ((JSONObject) bVVar.BGx.BGx.get()).optBoolean(B, true);
        boolean zBGx = zOptBoolean ? bVVar.BGx("gps") : false;
        boolean zBGx2 = zOptBoolean2 ? bVVar.BGx("network") : false;
        if (zBGx || zBGx2) {
            return;
        }
        af$$ExternalSyntheticOutline0.m(new isItemDismissable(new FXp(JR)), r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        bVVar.iaH = null;
        bVVar.e = 0;
    }

    @Override // com.incognia.internal.yUe
    public final void BGx(vN8 vn8) {
        O6.BGx(this, new N6$$ExternalSyntheticLambda0(this, 18, vn8));
    }

    public final boolean BGx(String str) {
        try {
            boolean zBGx = this.hs.BGx(str, this.OV7);
            if (zBGx) {
                this.e++;
            }
            return zBGx;
        } catch (Throwable th) {
            this.N.BGx(th, false);
            return false;
        }
    }

    public final Ms BGx(boolean z, boolean z2) {
        long jOptLong;
        long jOptLong2;
        NvL nvL = this.BGx;
        if (((JSONObject) nvL.BGx.get()).optBoolean(YO, false)) {
            NvL nvL2 = this.BGx;
            if (z) {
                jOptLong2 = ((JSONObject) nvL2.BGx.get()).optLong(Y, n);
            } else {
                jOptLong2 = ((JSONObject) nvL2.BGx.get()).optLong(v, j);
            }
            return new Ms(new cqI(this, jOptLong2), new JI3(this, z2), new fEp(this));
        }
        NvL nvL3 = this.BGx;
        if (z) {
            jOptLong = ((JSONObject) nvL3.BGx.get()).optLong(Y, n);
        } else {
            jOptLong = ((JSONObject) nvL3.BGx.get()).optLong(v, j);
        }
        return new Ms(new cqI(this, jOptLong), new JI3(this, z2));
    }

    @Override // com.incognia.internal.MtT
    public final void BGx(NvL nvL) {
        kV.mbG(this);
    }
}
