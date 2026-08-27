package com.incognia.internal;

import java.util.concurrent.atomic.AtomicReference;
import o.getCieXyz;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Tm7 implements yUe, BR {
    public final UsU BGx;
    public final NvL HQ;
    public final ByN N;
    public final iLf hIl;
    public final V9 hs;
    public final utV mbG;
    public final sjz x;
    public static final String S = (String) W4i.P.MediaSessionCompatResultReceiverWrapper();
    public static final String iaH = (String) W4i.AO.MediaSessionCompatResultReceiverWrapper();
    public static final String e = (String) W4i.KlJ.MediaSessionCompatResultReceiverWrapper();
    public static final String VLD = (String) W4i.axc.MediaSessionCompatResultReceiverWrapper();
    public static final String TfN = (String) W4i.bBV.MediaSessionCompatResultReceiverWrapper();
    public static final String OV7 = (String) W4i.B.MediaSessionCompatResultReceiverWrapper();
    public static final String JR = (String) W4i.YO.MediaSessionCompatResultReceiverWrapper();
    public JyL VV3 = VPw.BGx;
    public boolean A1 = mbG();
    public final CJX q = new Tm7$$ExternalSyntheticLambda2(0, this);
    public final r fZl = new Tm7$$ExternalSyntheticLambda3(this, 0);

    public static final void N(Tm7 tm7) {
        tm7.fZl();
    }

    public static ItP q() {
        try {
            Integer numHQ = Ay.BGx.HQ(S);
            if (numHQ == null) {
                return null;
            }
            int i = ItP.mbG;
            return DF.BGx(numHQ.intValue());
        } catch (Throwable unused) {
            Ay.BGx.BGx(S);
            return null;
        }
    }

    @Override // com.incognia.internal.BR
    public final void VV3() {
        kV.BGx(this);
    }

    @Override // com.incognia.internal.yUe
    public final void hIl() {
        this.VV3 = pbf.BGx;
    }

    @Override // com.incognia.internal.BR
    public final boolean mbG() {
        return this.hs.mbG(OV7) || this.hs.mbG(JR);
    }

    public Tm7(UsU usU, utV utv, NvL nvL, ByN byN, sjz sjzVar, iLf ilf, V9 v9) {
        this.BGx = usU;
        this.mbG = utv;
        this.HQ = nvL;
        this.N = byN;
        this.x = sjzVar;
        this.hIl = ilf;
        this.hs = v9;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0063  */
    /* JADX WARN: Code duplicated, block: B:15:0x0076  */
    /* JADX WARN: Code duplicated, block: B:18:0x008b  */
    /* JADX WARN: Code duplicated, block: B:20:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:22:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public static final void BGx(ItP itP, Tm7 tm7) {
        Object[] objArr;
        NvL nvL;
        ItP itPQ;
        NvL nvL2;
        Rb rb;
        int iWrite;
        int iWrite2;
        int iWrite3;
        tm7.getClass();
        ItP itPQ2 = q();
        itP.getClass();
        if (itPQ2 == null) {
            NvL nvL3 = tm7.HQ;
            boolean zOptBoolean = ((JSONObject) nvL3.BGx.get()).optBoolean(e, true);
            objArr = new Object[]{tm7.N.BGx(), qf.BGx};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() || !zOptBoolean) {
                nvL = tm7.HQ;
                if (((JSONObject) nvL.BGx.get()).optBoolean(VLD, false) || !itP.equals(Rb.HQ)) {
                    itPQ = q();
                    nvL2 = tm7.HQ;
                    if (((JSONObject) nvL2.BGx.get()).optBoolean(TfN, false)) {
                        rb = Rb.HQ;
                        iWrite = getCieXyz.write();
                        iWrite2 = getCieXyz.write();
                        iWrite3 = getCieXyz.write();
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{itPQ, rb}, iWrite3)).booleanValue() && !itP.equals(rb)) {
                            tm7.mbG.BGx(new ZmT(E7h.mbG));
                        }
                    }
                } else {
                    tm7.mbG.BGx(new ZmT(VQr.mbG));
                }
            }
        } else {
            Rb rb2 = Rb.HQ;
            if (itPQ2.equals(rb2) || itP.equals(rb2)) {
                NvL nvL4 = tm7.HQ;
                boolean zOptBoolean2 = ((JSONObject) nvL4.BGx.get()).optBoolean(e, true);
                objArr = new Object[]{tm7.N.BGx(), qf.BGx};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    nvL = tm7.HQ;
                    if (((JSONObject) nvL.BGx.get()).optBoolean(VLD, false)) {
                        itPQ = q();
                        nvL2 = tm7.HQ;
                        if (((JSONObject) nvL2.BGx.get()).optBoolean(TfN, false)) {
                            rb = Rb.HQ;
                            iWrite = getCieXyz.write();
                            iWrite2 = getCieXyz.write();
                            iWrite3 = getCieXyz.write();
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{itPQ, rb}, iWrite3)).booleanValue()) {
                                tm7.mbG.BGx(new ZmT(E7h.mbG));
                            }
                        }
                    } else {
                        itPQ = q();
                        nvL2 = tm7.HQ;
                        if (((JSONObject) nvL2.BGx.get()).optBoolean(TfN, false)) {
                            rb = Rb.HQ;
                            iWrite = getCieXyz.write();
                            iWrite2 = getCieXyz.write();
                            iWrite3 = getCieXyz.write();
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{itPQ, rb}, iWrite3)).booleanValue()) {
                                tm7.mbG.BGx(new ZmT(E7h.mbG));
                            }
                        }
                    }
                } else {
                    nvL = tm7.HQ;
                    if (((JSONObject) nvL.BGx.get()).optBoolean(VLD, false)) {
                        itPQ = q();
                        nvL2 = tm7.HQ;
                        if (((JSONObject) nvL2.BGx.get()).optBoolean(TfN, false)) {
                            rb = Rb.HQ;
                            iWrite = getCieXyz.write();
                            iWrite2 = getCieXyz.write();
                            iWrite3 = getCieXyz.write();
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{itPQ, rb}, iWrite3)).booleanValue()) {
                                tm7.mbG.BGx(new ZmT(E7h.mbG));
                            }
                        }
                    } else {
                        itPQ = q();
                        nvL2 = tm7.HQ;
                        if (((JSONObject) nvL2.BGx.get()).optBoolean(TfN, false)) {
                            rb = Rb.HQ;
                            iWrite = getCieXyz.write();
                            iWrite2 = getCieXyz.write();
                            iWrite3 = getCieXyz.write();
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{itPQ, rb}, iWrite3)).booleanValue()) {
                                tm7.mbG.BGx(new ZmT(E7h.mbG));
                            }
                        }
                    }
                }
            }
        }
        Ay.BGx.BGx(S, Integer.valueOf(itP.BGx));
    }

    @Override // com.incognia.internal.BR
    public final void A1() {
        O6.BGx(this, new Tm7$$ExternalSyntheticLambda0(this, 1));
    }

    public final void fZl() {
        O6.mbG(this, new Tm7$$ExternalSyntheticLambda1(this, 0));
    }

    @Override // com.incognia.internal.BR
    public final void hs() {
        O6.BGx(this, new Tm7$$ExternalSyntheticLambda0(this, 0));
    }

    public static final void HQ(Tm7 tm7) {
        boolean zBGx = tm7.hIl.BGx("android.permission.READ_PHONE_STATE");
        mP mPVar = Ay.BGx;
        String str = iaH;
        Object[] objArr = {mPVar.mbG(str), Boolean.valueOf(zBGx)};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return;
        }
        mPVar.BGx(str, Boolean.valueOf(zBGx));
        if (zBGx && tm7.A1) {
            tm7.x.BGx(tm7.q);
        } else {
            if (zBGx || !tm7.A1) {
                return;
            }
            tm7.x.mbG(tm7.q);
        }
    }

    public static final void x(Tm7 tm7) {
        if (tm7.A1) {
            tm7.x.BGx(tm7.q);
        }
        AtomicReference atomicReference = Q.mbG;
        Q.BGx(tm7.fZl);
    }

    @Override // com.incognia.internal.yUe
    public final JyL N() {
        return this.VV3;
    }

    @Override // com.incognia.internal.BR
    public final boolean x() {
        return this.A1;
    }

    public static final void mbG(Tm7 tm7) {
        tm7.x.BGx(tm7.q);
    }

    @Override // com.incognia.internal.yUe
    public final void HQ() {
        this.VV3 = Yp.BGx;
        O6.BGx(this, new Tm7$$ExternalSyntheticLambda1(this, 1));
    }

    @Override // com.incognia.internal.yUe
    public final UsU BGx() {
        return this.BGx;
    }

    @Override // com.incognia.internal.BR
    public final void BGx(boolean z) {
        this.A1 = z;
    }

    public static final void BGx(Tm7 tm7, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        if (tm7.A1) {
            tm7.x.mbG(tm7.q);
        }
        AtomicReference atomicReference = Q.mbG;
        Q.HQ(tm7.fZl);
        tm7.VV3 = c39.BGx;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
    }

    public static final void BGx(Tm7 tm7, ItP itP) {
        tm7.BGx(itP);
    }

    @Override // com.incognia.internal.yUe
    public final void BGx(vN8 vn8) {
        O6.BGx(this, new N6$$ExternalSyntheticLambda0(this, 13, vn8));
    }

    public static final void BGx(Tm7 tm7) {
        tm7.x.mbG(tm7.q);
    }

    public final void BGx(ItP itP) {
        O6.BGx(this, new N6$$ExternalSyntheticLambda0(itP, 12, this));
    }

    @Override // com.incognia.internal.MtT
    public final void BGx(NvL nvL) {
        kV.mbG(this);
    }
}
