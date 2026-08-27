package com.incognia.internal;

import android.util.Log;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class MGq extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ CBQ BGx;
    public final /* synthetic */ aZK HQ;
    public final /* synthetic */ QE N;
    public final /* synthetic */ List mbG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MGq(CBQ cbq, List list, aZK azk, QE qe) {
        super(1);
        this.BGx = cbq;
        this.mbG = list;
        this.HQ = azk;
        this.N = qe;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final /* synthetic */ Object invoke(Object obj) {
        BGx(((Boolean) obj).booleanValue());
        return createFromParcel.INSTANCE;
    }

    public static final void BGx(boolean z, List list, CBQ cbq, aZK azk, QE qe) {
        if (z) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MLu mLu = (MLu) it.next();
                String str = CBQ.YO;
                cbq.getClass();
                mLu.getClass();
                if ((mLu instanceof SFo) || (mLu instanceof kp8) || (mLu instanceof HET) || (mLu instanceof J6x) || (mLu instanceof EqO)) {
                    if (IU.BGx.get()) {
                        mLu.BGx();
                    }
                }
            }
            cbq.BGx.BGx(new A2B(L5i.HQ));
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            MLu mLu2 = (MLu) it2.next();
            String str2 = CBQ.YO;
            cbq.getClass();
            mLu2.getClass();
            if ((mLu2 instanceof SFo) || (mLu2 instanceof kp8) || (mLu2 instanceof HET) || (mLu2 instanceof J6x) || (mLu2 instanceof EqO)) {
                if (IU.BGx.get()) {
                    Log.w("Incognia", "Failed to send " + mLu2.BGx());
                }
            }
        }
        cbq.getClass();
        mP mPVar = Ay.HQ;
        String str3 = CBQ.v;
        Long lN = mPVar.N(str3);
        mPVar.BGx(str3, Long.valueOf((lN != null ? lN.longValue() : 0L) + 1));
        cbq.BGx.BGx(new A2B(yWN.HQ));
        cbq.BGx.BGx(new aZK(azk.BGx, azk.mbG, azk.HQ, azk.N, new QE(qe.BGx + 1, qe.mbG, qe.HQ, qe.N, qe.x, qe.hIl)));
    }

    public final void BGx(boolean z) {
        CBQ cbq = this.BGx;
        O6.BGx(cbq, new MGq$$ExternalSyntheticLambda0(z, this.mbG, cbq, this.HQ, this.N));
    }
}
