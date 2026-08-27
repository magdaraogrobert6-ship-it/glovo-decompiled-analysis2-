package com.incognia.internal;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class T4 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ qQ BGx;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        xUW xuw = (xUW) obj;
        JyL jyL = this.BGx.N;
        jyL.getClass();
        if (jyL instanceof c39) {
            String str = qQ.S;
            if (xuw.BGx(str)) {
                xuw.mbG.getClass();
                mO.BGx(str);
            }
            String str2 = qQ.iaH;
            if (xuw.BGx(str2)) {
                xuw.mbG.getClass();
                mO.BGx(str2);
            }
        } else {
            String str3 = qQ.S;
            if (xuw.BGx(str3)) {
                this.BGx.HQ.BGx(new ZmT(TeZ.mbG));
                List list = (List) this.BGx.x.get(str3);
                if (list != null) {
                    list.add(xuw.mbG);
                }
            }
            String str4 = qQ.iaH;
            if (xuw.BGx(str4)) {
                this.BGx.HQ.BGx(new ZmT(xY.mbG));
                List list2 = (List) this.BGx.x.get(str4);
                if (list2 != null) {
                    list2.add(xuw.mbG);
                }
            }
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T4(qQ qQVar) {
        super(1);
        this.BGx = qQVar;
    }
}
