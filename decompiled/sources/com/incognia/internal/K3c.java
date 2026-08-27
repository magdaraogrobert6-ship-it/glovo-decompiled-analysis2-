package com.incognia.internal;

import android.util.Log;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.getCieXyz;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class K3c extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ vKG BGx;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final /* synthetic */ Object invoke(Object obj) {
        BGx((A2B) obj);
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K3c(vKG vkg) {
        super(1);
        this.BGx = vkg;
    }

    public static final void BGx(vKG vkg, A2B a2b) {
        int iIntValue;
        vkg.getClass();
        mP mPVar = Ay.BGx;
        String str = vKG.q;
        Integer numHQ = mPVar.HQ(str);
        if (numHQ != null) {
            iIntValue = numHQ.intValue();
        } else {
            X9 x9 = X9.HQ;
            iIntValue = 0;
        }
        L5i l5i = L5i.HQ;
        if (iIntValue != 1) {
            mPVar.BGx(str, Integer.valueOf(a2b.BGx.BGx));
        }
        Object[] objArr = {a2b.BGx, l5i};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            IU.BGx.get();
        } else if (IU.BGx.get()) {
            Log.w("Incognia", "Failed to send data.");
        }
    }

    public final void BGx(A2B a2b) {
        vKG vkg = this.BGx;
        O6.BGx(vkg, new Dd$$ExternalSyntheticLambda0(vkg, 5, a2b));
    }
}
