package com.incognia.internal;

import android.content.Context;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class tVM {
    public final Context BGx;
    public final UsU mbG;
    public static final String HQ = (String) W4i.wm.MediaSessionCompatResultReceiverWrapper();
    public static final String N = (String) W4i.NaG.MediaSessionCompatResultReceiverWrapper();
    public static final String x = (String) W4i.cxS.MediaSessionCompatResultReceiverWrapper();
    public static final String hIl = (String) W4i.mdb.MediaSessionCompatResultReceiverWrapper();
    public static final String hs = (String) W4i.h7.MediaSessionCompatResultReceiverWrapper();
    public static final String VV3 = (String) W4i.YS8.MediaSessionCompatResultReceiverWrapper();
    public static final String A1 = (String) W4i.KXE.MediaSessionCompatResultReceiverWrapper();
    public static final String q = (String) W4i.mQG.MediaSessionCompatResultReceiverWrapper();
    public static final String fZl = (String) W4i.FV.MediaSessionCompatResultReceiverWrapper();
    public static final String S = (String) W4i.GW6.MediaSessionCompatResultReceiverWrapper();
    public static final String iaH = (String) W4i.jG.MediaSessionCompatResultReceiverWrapper();

    public final RU BGx() {
        String str;
        Long lValueOf;
        Integer numValueOf;
        a9 a9Var = new a9(this.BGx, q);
        a9 a9Var2 = new a9(this.BGx, fZl);
        a9 a9Var3 = new a9(this.BGx, S);
        CaO caOBGx = new GUp(a9Var2, a9Var3, a9Var).BGx();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{caOBGx, H67.mbG}, getCieXyz.write())).booleanValue()) {
            str = hIl;
        } else {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{caOBGx, k1.mbG}, getCieXyz.write())).booleanValue()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{caOBGx, Sth.mbG}, getCieXyz.write())).booleanValue()) {
                    return null;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            str = x;
            a9Var2 = a9Var3;
        }
        try {
            Object objBGx = a9Var2.BGx(str, hs);
            if (objBGx != null) {
                lValueOf = Long.valueOf(objBGx instanceof String ? Long.parseLong((String) objBGx) : ((Long) objBGx).longValue());
            } else {
                lValueOf = null;
            }
        } catch (Throwable unused) {
        }
        try {
            Object objBGx2 = a9Var2.BGx(A1, VV3);
            if (objBGx2 != null) {
                numValueOf = Integer.valueOf(objBGx2 instanceof String ? Integer.parseInt((String) objBGx2) : ((Integer) objBGx2).intValue());
            } else {
                numValueOf = null;
            }
        } catch (Throwable unused2) {
        }
        if (lValueOf == null) {
            return null;
        }
        return new RU(numValueOf != null ? numValueOf.intValue() : 0, lValueOf.longValue());
    }

    public tVM(Context context, UsU usU) {
        this.BGx = context;
        this.mbG = usU;
    }

    public static final void BGx(tVM tvm, long j, Integer num, List list) {
        int iIntValue;
        tvm.getClass();
        mP mPVar = Ay.BGx;
        String str = HQ;
        RU ru = (RU) mPVar.BGx(Kje.BGx, str);
        Integer numValueOf = null;
        List list2 = ru != null ? ru.HQ : null;
        Integer numValueOf2 = ru != null ? Integer.valueOf(ru.mbG) : null;
        if (numValueOf2 == null) {
            RU ruBGx = tvm.BGx();
            if (ruBGx != null) {
                numValueOf = Integer.valueOf(ruBGx.mbG);
            }
        } else {
            numValueOf = numValueOf2;
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        }
        if (list == null) {
            list = list2;
        }
        mPVar.BGx(str, new RU(j, iIntValue, list), lIW.BGx);
    }

    public final void BGx(final long j, final Integer num, final List list) {
        this.mbG.BGx(new y9X() { // from class: com.incognia.internal.tVM$$ExternalSyntheticLambda0
            @Override // com.incognia.internal.y9X
            public final void run() {
                tVM.BGx(this.f$0, j, num, list);
            }
        });
    }
}
