package com.incognia.internal;

import android.os.SystemClock;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class CvW extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ B5 BGx;

    /* JADX WARN: Code duplicated, block: B:17:0x005a  */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        xUW xuw = (xUW) obj;
        JyL jyL = this.BGx.hs;
        jyL.getClass();
        if ((jyL instanceof c39) || !xuw.BGx(B5.S)) {
            mO mOVar = xuw.mbG;
            String str = B5.S;
            mOVar.getClass();
            mO.BGx(str);
        } else {
            this.BGx.BGx.getClass();
            wf wfVarBGx = jgb.BGx();
            if (wfVarBGx != null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = wfVarBGx.mbG;
                if (jElapsedRealtime - j < B5.q && jElapsedRealtime >= j) {
                    mO mOVar2 = xuw.mbG;
                    String str2 = B5.S;
                    mOVar2.getClass();
                    mO.BGx(str2);
                }
            }
            B5 b5 = this.BGx;
            mO mOVar3 = xuw.mbG;
            if (!b5.A1) {
                b5.A1 = true;
                mn mnVar = b5.mbG;
                b5.BGx.getClass();
                mnVar.BGx(jgb.BGx(), new nKs(b5, mOVar3), new SVT(b5, mOVar3));
            }
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CvW(B5 b5) {
        super(1);
        this.BGx = b5;
    }
}
