package com.incognia.internal;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class g8M extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ ZE BGx;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        ((Boolean) obj).getClass();
        JyL jyL = this.BGx.fZl;
        jyL.getClass();
        if (!(jyL instanceof c39)) {
            Iterator it = this.BGx.x.iterator();
            if (it.hasNext()) {
                throw ff$$ExternalSyntheticOutline0.m(it);
            }
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8M(ZE ze) {
        super(1);
        this.BGx = ze;
    }
}
