package com.incognia.internal;

import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import com.mapbox.navigation.core.arrival.ArrivalProgressObserver$$ExternalSyntheticLambda0;
import com.roadrunner.logger.logger.perseus.PerseusInitializerImpl$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import o.accessgetInstancedelegatecp;
import o.getQueryParameterslambda2;
import o.markOnScreenCardsAsReadlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;

/* JADX INFO: loaded from: classes2.dex */
public final class X6a implements yUe {
    public final UsU BGx;
    public final YZr HQ;
    public final ICj N;
    public ZBu VV3;
    public final bBO hIl;
    public JyL hs = VPw.BGx;
    public final jx mbG;
    public final cY x;

    @Override // com.incognia.internal.yUe
    public final JyL N() {
        return this.hs;
    }

    public static final void BGx(X6a x6a, List list) {
        String str;
        if (list.isEmpty()) {
            return;
        }
        N4A n4aBGx = x6a.N.BGx();
        dCe dceMbG = x6a.HQ.mbG();
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ZBu zBu = (ZBu) it.next();
            if (!zBu.hs) {
                long j = zBu.BGx;
                String str2 = zBu.mbG;
                int i = zBu.HQ;
                String str3 = zBu.N;
                String str4 = zBu.x;
                boolean z = zBu.hIl;
                String str5 = zBu.VV3;
                if (str5 == null) {
                    str5 = n4aBGx.BGx;
                }
                String str6 = str5;
                String str7 = zBu.A1;
                if (str7 == null) {
                    str7 = n4aBGx.HQ;
                }
                String str8 = str7;
                String str9 = zBu.q;
                if (str9 == null) {
                    str9 = n4aBGx.N;
                }
                String str10 = str9;
                String str11 = zBu.fZl;
                if (str11 == null) {
                    str11 = n4aBGx.x;
                }
                String str12 = str11;
                String str13 = zBu.S;
                if (str13 == null) {
                    str13 = n4aBGx.hIl;
                }
                String str14 = str13;
                String strValueOf = zBu.iaH;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(n4aBGx.hs);
                }
                String str15 = strValueOf;
                String str16 = zBu.e;
                if (str16 != null) {
                    str = str16;
                } else if (dceMbG != null) {
                    str16 = dceMbG.q;
                    str = str16;
                } else {
                    str = null;
                }
                Long lValueOf = zBu.VLD;
                if (lValueOf == null) {
                    lValueOf = dceMbG != null ? Long.valueOf(dceMbG.BGx) : null;
                }
                String str17 = zBu.TfN;
                if (str17 == null) {
                    str17 = dceMbG != null ? dceMbG.fZl : null;
                }
                zBu = new ZBu(j, str2, i, str3, str4, z, false, str6, str8, str10, str12, str14, str15, str, lValueOf, str17, zBu.OV7, zBu.JR, zBu.j);
            }
            arrayList.add(zBu);
        }
        x6a.mbG.BGx(arrayList, u5l.BGx, new r8lambdayUqGVEpC1kg8ua3jc9a113shNIE(8));
    }

    public static final void mbG() {
        AtomicReference atomicReference = JY.BGx;
        JY.BGx(l8.BGx);
    }

    @Override // com.incognia.internal.yUe
    public final void HQ() {
        this.hs = Yp.BGx;
        O6.BGx(this, new Q$$ExternalSyntheticLambda1(10, this));
    }

    @Override // com.incognia.internal.yUe
    public final void hIl() {
        this.hs = pbf.BGx;
    }

    public X6a(UsU usU, jx jxVar, YZr yZr, ICj iCj, KWh kWh, cY cYVar, bBO bbo) {
        this.BGx = usU;
        this.mbG = jxVar;
        this.HQ = yZr;
        this.N = iCj;
        this.x = cYVar;
        this.hIl = bbo;
    }

    public final void x() {
        pNP.BGx(new PerseusInitializerImpl$$ExternalSyntheticLambda0(5, this));
    }

    public static final void BGx(X6a x6a) {
        x6a.getClass();
        try {
            ArrayList arrayListBGx = x6a.hIl.BGx();
            if (!arrayListBGx.isEmpty()) {
                pNP.BGx(arrayListBGx);
            }
        } catch (Throwable unused) {
        }
        if (x6a.x.BGx()) {
            x6a.x();
        }
    }

    @Override // com.incognia.internal.yUe
    public final void BGx(vN8 vn8) {
        O6.BGx(this, new N6$$ExternalSyntheticLambda0(this, 15, vn8));
    }

    public static final void BGx(X6a x6a, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        ZBu zBu = x6a.VV3;
        if (zBu != null) {
            pNP.BGx(zBu);
        }
        x6a.VV3 = null;
        x6a.hs = c39.BGx;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
    }

    public final void BGx(Throwable th, boolean z) {
        O6.BGx(this, new EGf$$ExternalSyntheticLambda0(this, th, z, 1));
    }

    public static final void BGx(X6a x6a, Throwable th, boolean z) {
        if (x6a.x.BGx()) {
            N4A n4aBGx = x6a.N.BGx();
            dCe dceMbG = x6a.HQ.mbG();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String id = TimeZone.getDefault().getID();
            String message = th.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            String str = message;
            String strRemoteActionCompatParcelizer = markOnScreenCardsAsReadlambda1.RemoteActionCompatParcelizer(th);
            String str2 = n4aBGx.BGx;
            String str3 = n4aBGx.HQ;
            String str4 = n4aBGx.N;
            String str5 = n4aBGx.x;
            String str6 = n4aBGx.hIl;
            int i = n4aBGx.hs;
            String str7 = dceMbG != null ? dceMbG.q : null;
            Long lValueOf = dceMbG != null ? Long.valueOf(dceMbG.BGx) : null;
            String str8 = dceMbG != null ? dceMbG.fZl : null;
            CWL cwl = CWL.BGx;
            ZBu zBu = new ZBu(jCurrentTimeMillis, id, str, strRemoteActionCompatParcelizer, z, true, str2, str3, str4, str5, str6, String.valueOf(i), str7, lValueOf, str8, (String) W4i.dnx.MediaSessionCompatResultReceiverWrapper(), Fields.ColorFilter);
            if (z) {
                x6a.BGx(zBu);
            } else {
                pNP.BGx(zBu);
            }
        }
    }

    @Override // com.incognia.internal.yUe
    public final UsU BGx() {
        return this.BGx;
    }

    public static final void BGx(boolean z) {
        if (z) {
            pNP.BGx();
        }
    }

    public final void BGx(ZBu zBu) {
        this.VV3 = zBu;
        jx jxVar = this.mbG;
        int iSerializer = getQueryParameterslambda2.serializer();
        int iSerializer2 = getQueryParameterslambda2.serializer();
        jxVar.BGx((List) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, 516583654, new Object[]{zBu}, getQueryParameterslambda2.serializer(), -516583649, iSerializer), fM.BGx, new ArrivalProgressObserver$$ExternalSyntheticLambda0(this, 6, zBu));
    }

    public static final void BGx(X6a x6a, ZBu zBu, boolean z) {
        O6.BGx(x6a, new EGf$$ExternalSyntheticLambda0(z, zBu, x6a));
    }

    public static final void BGx(boolean z, ZBu zBu, X6a x6a) {
        if (!z) {
            pNP.BGx(zBu);
        }
        x6a.VV3 = null;
        new UsU(G7.BGx, true).BGx(new y9X() { // from class: com.incognia.internal.X6a$$ExternalSyntheticLambda1
            @Override // com.incognia.internal.y9X
            public final void run() {
                X6a.mbG();
            }
        });
    }
}
