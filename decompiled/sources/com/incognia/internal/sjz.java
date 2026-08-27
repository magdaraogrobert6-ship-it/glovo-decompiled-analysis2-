package com.incognia.internal;

import android.content.Context;
import android.telephony.CellInfo;
import android.telephony.TelephonyManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class sjz implements yUe {
    public final Executor A1;
    public final UsU BGx;
    public final BvF HQ;
    public final Ymx N;
    public final PA VV3;
    public boolean fZl;
    public final TelephonyManager hs;
    public final aYh iaH;
    public final X6a mbG;
    public final iLf x;
    public JyL hIl = VPw.BGx;
    public final LinkedHashSet q = new LinkedHashSet();
    public final byr S = new byr(this);

    @Override // com.incognia.internal.yUe
    public final JyL N() {
        return this.hIl;
    }

    public final Boolean hs() {
        try {
            if (XUh.BGx(XUh.BGx, 29, 0, 2)) {
                return Boolean.valueOf(this.hs.isDataRoamingEnabled());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final void BGx(int i, sjz sjzVar) {
        int i2 = ItP.mbG;
        ItP itPBGx = DF.BGx(i);
        Iterator it = sjzVar.q.iterator();
        while (it.hasNext()) {
            ((CJX) it.next()).BGx(itPBGx);
        }
    }

    @Override // com.incognia.internal.yUe
    public final void HQ() {
        this.hIl = Yp.BGx;
        O6.BGx(this, new Q$$ExternalSyntheticLambda1(17, this));
    }

    @Override // com.incognia.internal.yUe
    public final void hIl() {
        this.hIl = pbf.BGx;
    }

    public final ArrayList mbG() {
        if (this.N.mbG() && this.HQ.VV3()) {
            try {
                List<CellInfo> allCellInfo = this.hs.getAllCellInfo();
                if (allCellInfo == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = allCellInfo.iterator();
                while (it.hasNext()) {
                    phu phuVarMbG = this.VV3.mbG((CellInfo) it.next());
                    if (phuVarMbG != null) {
                        arrayList.add(phuVarMbG);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (((phu) obj).BGx()) {
                        arrayList2.add(obj);
                    }
                }
                return arrayList2;
            } catch (Throwable th) {
                this.mbG.BGx(th, false);
            }
        }
        return null;
    }

    public sjz(Context context, UsU usU, X6a x6a, BvF bvF, Ymx ymx, iLf ilf, KWh kWh) {
        this.BGx = usU;
        this.mbG = x6a;
        this.HQ = bvF;
        this.N = ymx;
        this.x = ilf;
        this.hs = (TelephonyManager) context.getSystemService("phone");
        this.VV3 = new PA(kWh);
        this.A1 = fFk.BGx(usU);
        this.iaH = XUh.BGx(XUh.BGx, 31, 0, 2) ? new aYh(new FYw(this)) : null;
    }

    public final void A1() {
        if (this.x.BGx("android.permission.READ_PHONE_STATE") && this.fZl) {
            if (XUh.BGx(XUh.BGx, 31, 0, 2)) {
                aYh ayh = this.iaH;
                if (ayh != null) {
                    this.hs.unregisterTelephonyCallback(ayh);
                }
            } else {
                this.hs.listen(this.S, 0);
            }
            this.fZl = false;
        }
    }

    public final void VV3() {
        if (this.x.BGx("android.permission.READ_PHONE_STATE") && !this.fZl) {
            if (XUh.BGx(XUh.BGx, 31, 0, 2)) {
                aYh ayh = this.iaH;
                if (ayh != null) {
                    this.hs.registerTelephonyCallback(this.A1, ayh);
                }
            } else {
                this.hs.listen(this.S, 32);
            }
            this.fZl = true;
        }
    }

    public final Integer x() {
        if (!this.x.BGx("android.permission.READ_PHONE_STATE")) {
            iLf ilf = this.x;
            ilf.getClass();
            if (!XUh.BGx(XUh.BGx, 33, 0, 2) || !ilf.BGx("android.permission.READ_BASIC_PHONE_STATE")) {
                return null;
            }
        }
        try {
            XUh xUh = XUh.BGx;
            if (XUh.BGx(xUh, 30, 0, 2)) {
                return Integer.valueOf(this.hs.getDataNetworkType());
            }
            if (XUh.BGx(xUh, 24, 0, 2)) {
                return Integer.valueOf(this.hs.getNetworkType());
            }
            return null;
        } catch (Throwable th) {
            this.mbG.BGx(th, false);
            return null;
        }
    }

    public static final void BGx(sjz sjzVar) {
        if (sjzVar.q.isEmpty()) {
            return;
        }
        sjzVar.VV3();
    }

    @Override // com.incognia.internal.yUe
    public final void BGx(vN8 vn8) {
        O6.BGx(this, new N6$$ExternalSyntheticLambda0(this, 25, vn8));
    }

    public static final void BGx(sjz sjzVar, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        sjzVar.q.clear();
        sjzVar.A1();
        sjzVar.fZl = false;
        sjzVar.hIl = c39.BGx;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
    }

    public final void BGx(CJX cjx) {
        O6.BGx(this, new Dd$$ExternalSyntheticLambda0(this, 14, cjx));
    }

    public static final void BGx(sjz sjzVar, CJX cjx) {
        if (sjzVar.q.isEmpty() || !sjzVar.fZl) {
            sjzVar.VV3();
        }
        sjzVar.q.add(cjx);
    }

    public final void BGx(final int i) {
        O6.BGx(this, new y9X() { // from class: com.incognia.internal.sjz$$ExternalSyntheticLambda4
            @Override // com.incognia.internal.y9X
            public final void run() {
                sjz.BGx(i, this);
            }
        });
    }

    @Override // com.incognia.internal.yUe
    public final UsU BGx() {
        return this.BGx;
    }

    public static final void mbG(sjz sjzVar, CJX cjx) {
        sjzVar.q.remove(cjx);
        if (sjzVar.q.isEmpty() && sjzVar.fZl) {
            sjzVar.A1();
        }
    }

    public final void mbG(CJX cjx) {
        O6.BGx(this, new N6$$ExternalSyntheticLambda0(this, 24, cjx));
    }
}
