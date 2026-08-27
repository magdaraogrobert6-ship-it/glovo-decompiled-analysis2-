package com.incognia.internal;

import android.os.SystemClock;
import androidx.sqlite.SQLite;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.UUID;
import o.accessgetInstancedelegatecp;
import o.getCieXyz;
import o.getQueryParameterslambda2;
import o.onContentCardDismissed;
import o.onItemDismiss;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class CBQ implements yUe {
    public static final long D;
    public static final List Io;
    public static final List OhM;
    public final ByN A1;
    public JyL B;
    public final utV BGx;
    public final UsU HQ;
    public int JR;
    public final TkX N;
    public int OV7;
    public boolean S;
    public String TfN;
    public boolean VLD;
    public final NvL VV3;
    public boolean e;
    public final KNe fZl;
    public final KWh hIl;
    public final cY hs;
    public boolean iaH;
    public int j;
    public final ArrayList l5;
    public final ArrayList mbG;
    public Long n;
    public final OF6 q;
    public final SVJ ss;
    public final ArrayList vM;
    public final eQD x;
    public static final String YO = (String) W4i.MT.MediaSessionCompatResultReceiverWrapper();
    public static final String N6D = (String) W4i.IQQ.MediaSessionCompatResultReceiverWrapper();
    public static final String v = (String) W4i.eI3.MediaSessionCompatResultReceiverWrapper();
    public static final String Y = (String) W4i.vrl.MediaSessionCompatResultReceiverWrapper();
    public static final String Ft = (String) W4i.STR.MediaSessionCompatResultReceiverWrapper();
    public static final String RIs = (String) W4i.WhZ.MediaSessionCompatResultReceiverWrapper();
    public static final String X4 = (String) W4i.JP.MediaSessionCompatResultReceiverWrapper();
    public static final String kCN = (String) W4i.znK.MediaSessionCompatResultReceiverWrapper();
    public static final String Yo = (String) W4i.q6.MediaSessionCompatResultReceiverWrapper();
    public static final String aly = (String) W4i.zdt.MediaSessionCompatResultReceiverWrapper();
    public static final String mQ = (String) W4i.KHL.MediaSessionCompatResultReceiverWrapper();
    public static final long h = 40000;
    public static final String Pm = (String) W4i.XaX.MediaSessionCompatResultReceiverWrapper();
    public static final String PD = (String) W4i.J.MediaSessionCompatResultReceiverWrapper();

    @Override // com.incognia.internal.yUe
    public final JyL N() {
        return this.B;
    }

    static {
        yU yUVar = yU.mbG;
        OhM = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{yUVar.mbG()}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
        Io = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{yUVar.mbG()}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
        D = 28800000L;
    }

    public CBQ(utV utv, ArrayList arrayList, UsU usU, eQD eqd, KWh kWh, cY cYVar, NvL nvL, ByN byN, Zav zav) {
        TkX tkX = new TkX();
        OF6 of6 = new OF6(nvL);
        this.BGx = utv;
        this.mbG = arrayList;
        this.HQ = usU;
        this.N = tkX;
        this.x = eqd;
        this.hIl = kWh;
        this.hs = cYVar;
        this.VV3 = nvL;
        this.A1 = byN;
        this.q = of6;
        this.fZl = new KNe(zav.BGx, usU, new MJf(this));
        this.OV7 = -1;
        this.JR = -1;
        this.j = -1;
        this.vM = new ArrayList();
        this.l5 = new ArrayList();
        this.ss = new SVJ(YO, usU, new CEN(this));
        this.B = VPw.BGx;
    }

    public final void BGx(aF aFVar, List list) {
        Long l = this.n;
        if (l != null) {
            long jLongValue = l.longValue();
            this.hIl.getClass();
            if (SystemClock.elapsedRealtime() - jLongValue > h) {
                return;
            }
        }
        if (this.hs.BGx() && !this.N.BGx.isEmpty()) {
            TkX tkX = this.N;
            nn nnVar = new nn();
            for (ar arVar : tkX.BGx.values()) {
                iO iOVar = arVar.mbG;
                if (iOVar.mbG || iOVar.BGx || iOVar.HQ) {
                    Xj xj = arVar.N;
                    xj.getClass();
                    xj.BGx.BGx(nnVar);
                    arVar.HQ.invoke();
                }
            }
            cZ cZVar = new cZ(nnVar.BGx, nnVar.mbG, nnVar.HQ, nnVar.N, nnVar.x, nnVar.hIl, nnVar.hs, nnVar.VV3, nnVar.A1, nnVar.q, nnVar.fZl, nnVar.S, nnVar.iaH, nnVar.e, nnVar.VLD, nnVar.TfN, nnVar.OV7, nnVar.JR, nnVar.j, nnVar.n, nnVar.vM, nnVar.l5, nnVar.ss, nnVar.B, nnVar.YO, nnVar.N6D, nnVar.v, nnVar.Y, nnVar.Ft, nnVar.RIs, nnVar.X4, nnVar.kCN, nnVar.Yo, nnVar.aly, nnVar.mQ, nnVar.h, nnVar.Pm, nnVar.PD, nnVar.OhM, nnVar.Io, nnVar.D, nnVar.YG3, nnVar.ISd, nnVar.NKG, nnVar.JA, nnVar.Ui, nnVar.p, nnVar.ILy, nnVar.sg, nnVar.U, nnVar.tFd, nnVar.OQ, nnVar.h0W, nnVar.CTv, nnVar.D9p, nnVar.L, nnVar.Ap, nnVar.Iye, nnVar.gdW, nnVar.bt, nnVar.oH, nnVar.Nd, nnVar.g, nnVar.F8P, nnVar.Xu, nnVar.X, nnVar.pA0, nnVar.Zj, nnVar.lb, nnVar.FM, nnVar.BmG, nnVar.zbX, nnVar.dGU, nnVar.Uvi, nnVar.Fi, nnVar.HTV, nnVar.DS, nnVar.A3, nnVar.w, nnVar.Oo, nnVar.u, nnVar.G5, nnVar.M, nnVar.C, nnVar.H, nnVar.PKr, nnVar.Op, nnVar.cT, nnVar.Z7, nnVar.Qv, nnVar.kv, nnVar.mO, nnVar.PZt, nnVar.KeX, nnVar.T7p, nnVar.wUg, nnVar.ISI, nnVar.EpB, nnVar.d, nnVar.BWg, nnVar.YD, nnVar.zS, nnVar.pP, nnVar.y, nnVar.sh, nnVar.QX, nnVar.ck, nnVar.Ys, nnVar.CyN, nnVar.lB, nnVar.a);
            if (this.TfN == null) {
                this.TfN = UUID.randomUUID().toString();
            }
            List listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(this.l5);
            mP mPVar = Ay.HQ;
            Long lN = mPVar.N(v);
            long jLongValue2 = lN != null ? lN.longValue() : 0L;
            Long lN2 = mPVar.N(Y);
            long jLongValue3 = lN2 != null ? lN2.longValue() : 0L;
            String strBGx = aFVar.BGx();
            Long lMbG = mbG();
            Long lN3 = Ay.BGx.N(RIs);
            QE qe = new QE(jLongValue2, jLongValue3, strBGx, lMbG, Long.valueOf(lN3 != null ? lN3.longValue() : 0L), list);
            String str = this.TfN;
            String str2 = N6D;
            Long lN4 = mPVar.N(str2);
            aZK azk = new aZK(str, cZVar, listPlaybackStateCompat, lN4 != null ? lN4.longValue() : 0L, qe);
            JSONObject jSONObjectBGx = azk.BGx();
            if (jSONObjectBGx == null) {
                return;
            }
            Long lN5 = mPVar.N(str2);
            mPVar.BGx(str2, Long.valueOf((lN5 != null ? lN5.longValue() : 0L) + 1));
            eQD eqd = this.x;
            String str3 = Pm;
            this.hIl.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.hIl.getClass();
            X1 x1 = new X1(str3, jSONObjectBGx, jCurrentTimeMillis, TimeZone.getDefault().getID());
            MGq mGq = new MGq(this, listPlaybackStateCompat, azk, qe);
            eqd.getClass();
            int iSerializer = getQueryParameterslambda2.serializer();
            eqd.BGx((List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{x1}, getQueryParameterslambda2.serializer(), -516583649, iSerializer), fM.BGx, mGq, true);
            this.BGx.BGx(azk);
        }
    }

    @Override // com.incognia.internal.yUe
    public final void HQ() {
        this.B = Yp.BGx;
        O6.BGx(this, new Q$$ExternalSyntheticLambda1(3, this));
    }

    @Override // com.incognia.internal.yUe
    public final void hIl() {
        this.B = pbf.BGx;
        this.BGx.BGx(ZmT.class, this.ss);
    }

    public final Long mbG() {
        Long lN = Ay.HQ.N(Ft);
        long jLongValue = lN != null ? lN.longValue() : 0L;
        this.hIl.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - jLongValue;
        if (jElapsedRealtime <= 0 || jLongValue == 0) {
            return null;
        }
        return Long.valueOf(jElapsedRealtime);
    }

    @Override // com.incognia.internal.yUe
    public final UsU BGx() {
        return this.HQ;
    }

    public static final void BGx(CBQ cbq) {
        cbq.BGx(yU.mbG);
    }

    @Override // com.incognia.internal.yUe
    public final void BGx(vN8 vn8) {
        this.BGx.mbG(ZmT.class, this.ss);
        O6.BGx(this, new N6$$ExternalSyntheticLambda0(this, 4, vn8));
    }

    public static final void BGx(CBQ cbq, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        R1 r1 = cbq.fZl.N;
        if (r1 != null) {
            r1.hIl.compareAndSet(false, true);
        }
        cbq.N.BGx.clear();
        cbq.S = false;
        cbq.TfN = null;
        cbq.iaH = false;
        cbq.e = false;
        cbq.VLD = false;
        cbq.l5.clear();
        cbq.vM.clear();
        cbq.B = c39.BGx;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
    }

    public final void BGx(MLu mLu) throws JSONException {
        ArrayList arrayList;
        boolean z;
        y9X y9x;
        Long lMbG;
        if (this.hs.BGx()) {
            if (mLu != null) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.A1.BGx(), tr.BGx}, getCieXyz.write())).booleanValue()) {
                    List listBGx = this.VV3.BGx(X4, Io);
                    long jOptLong = ((JSONObject) this.VV3.BGx.get()).optLong(kCN, D);
                    if (!listBGx.isEmpty()) {
                        if (jOptLong > 0 && listBGx.contains(mLu.mbG()) && (lMbG = mbG()) != null && lMbG.longValue() < jOptLong) {
                            mP mPVar = Ay.BGx;
                            String str = RIs;
                            Long lN = mPVar.N(str);
                            mPVar.BGx(str, Long.valueOf((lN != null ? lN.longValue() : 0L) + 1));
                            return;
                        }
                    }
                }
            }
            if (!this.S) {
                this.S = true;
                if (mLu != null) {
                    this.l5.add(mLu);
                }
                this.TfN = UUID.randomUUID().toString();
                List listBGx2 = this.VV3.BGx(PD, OhM);
                onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1 = MLu.BGx;
                if (listBGx2 == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    Iterator it = listBGx2.iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList.add(tn.BGx((String) it.next()));
                        } catch (Throwable unused) {
                        }
                    }
                }
                int i = 0;
                if (arrayList != null && !arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            z = false;
                            break;
                        }
                        Object obj = arrayList.get(i2);
                        i2++;
                        if (this.l5.contains((MLu) obj)) {
                            z = true;
                            break;
                        }
                    }
                } else {
                    z = false;
                    break;
                }
                this.VLD = z;
                ArrayList arrayList2 = this.l5;
                ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(arrayList2, 10));
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    arrayList3.add(((MLu) obj2).mbG());
                }
                this.hIl.getClass();
                this.n = Long.valueOf(SystemClock.elapsedRealtime());
                UsU usU = E79.BGx;
                this.OV7 = E79.BGx(Yo, null);
                this.j = E79.BGx(mQ, null);
                if (this.VLD) {
                    this.JR = E79.BGx(aly, null);
                }
                ArrayList arrayList4 = this.mbG;
                ArrayList arrayList5 = new ArrayList();
                int size3 = arrayList4.size();
                int i4 = 0;
                while (i4 < size3) {
                    Object obj3 = arrayList4.get(i4);
                    i4++;
                    if (!((hb) ((sk) obj3)).N) {
                        arrayList5.add(obj3);
                    }
                }
                ArrayList arrayList6 = new ArrayList();
                int size4 = arrayList5.size();
                int i5 = 0;
                while (i5 < size4) {
                    Object obj4 = arrayList5.get(i5);
                    i5++;
                    if (((hb) ((sk) obj4)).mbG) {
                        arrayList6.add(obj4);
                    }
                }
                int size5 = arrayList6.size();
                int i6 = 0;
                while (i6 < size5) {
                    Object obj5 = arrayList6.get(i6);
                    i6++;
                    ((hb) ((sk) obj5)).BGx(this.HQ, new R4(this), new i0N(this), this.l5);
                }
                KNe kNe = this.fZl;
                R1 r1 = kNe.N;
                if (r1 != null) {
                    r1.hIl.compareAndSet(false, true);
                }
                UsU usU2 = kNe.BGx;
                ArrayList arrayList7 = kNe.HQ;
                R1 r2 = new R1(usU2, arrayList7, new ri(kNe));
                kNe.N = r2;
                if (!r2.hIl.get() && !r2.hs.get() && (y9x = r2.x) != null) {
                    usU2.BGx(((Number) onContentCardDismissed.read((List) arrayList7)).longValue(), y9x);
                }
                ArrayList arrayList8 = new ArrayList();
                int size6 = arrayList5.size();
                int i7 = 0;
                while (i7 < size6) {
                    Object obj6 = arrayList5.get(i7);
                    i7++;
                    if (!((hb) ((sk) obj6)).mbG) {
                        arrayList8.add(obj6);
                    }
                }
                int size7 = arrayList8.size();
                while (i < size7) {
                    Object obj7 = arrayList8.get(i);
                    i++;
                    ((hb) ((sk) obj7)).BGx(this.HQ, new jQK(this), new cgs(this), this.l5);
                }
                return;
            }
            this.iaH = true;
            if (mLu != null) {
                this.vM.add(mLu);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0055  */
    public final void BGx(aF aFVar, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        Object[] objArr = {aFVar, rl.BGx};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            UsU usU = E79.BGx;
            E79.HQ(this.OV7);
            E79.BGx(this.JR);
            E79.BGx(this.j);
        } else {
            Object[] objArr2 = {aFVar, hX.BGx};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                UsU usU2 = E79.BGx;
                E79.HQ(this.OV7);
                E79.BGx(this.JR);
                E79.BGx(this.j);
            } else {
                Object[] objArr3 = {aFVar, rK.BGx};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                    UsU usU3 = E79.BGx;
                    E79.HQ(this.JR);
                } else {
                    Object[] objArr4 = {aFVar, Z0.BGx};
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
                        UsU usU4 = E79.BGx;
                        E79.HQ(this.j);
                    }
                }
            }
        }
        UsU usU5 = E79.BGx;
        E79.BGx(new D3(this, aFVar, r8lambdardpfsr94j4iebcwx_kpqzpm8k0));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    public static final void BGx(CBQ cbq, Object obj) {
        cbq.getClass();
        if (onItemDismiss.serializer(obj) == null) {
            ar arVar = (ar) obj;
            if (cbq.S) {
                cbq.N.BGx.put(arVar.BGx, arVar);
            }
        }
        ArrayList arrayList = cbq.mbG;
        int i = 0;
        if (arrayList == null || !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    if (((hb) ((sk) obj2)).N) {
                    }
                } else if (cbq.S) {
                    cbq.BGx(rl.BGx, new UfY(cbq));
                    return;
                }
            }
        } else if (cbq.S) {
            cbq.BGx(rl.BGx, new UfY(cbq));
            return;
        }
        if (cbq.VLD) {
            ArrayList arrayList2 = cbq.mbG;
            if (arrayList2 == null || !arrayList2.isEmpty()) {
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj3 = arrayList2.get(i);
                    i++;
                    hb hbVar = (hb) ((sk) obj3);
                    if (hbVar.N && !hbVar.x) {
                        return;
                    }
                }
            }
            if (cbq.e) {
                return;
            }
            cbq.e = true;
            cbq.BGx(rK.BGx, fbl.BGx);
        }
    }
}
