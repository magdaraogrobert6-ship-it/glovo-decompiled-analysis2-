package com.incognia.internal;

import kotlin.jvm.internal.Lambda;
import o.isAdapterPositionOnScreen;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class JWV implements ETe {
    public final String BGx;
    public final Lambda HQ;
    public final Object mbG;

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.Lambda, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM] */
    @Override // com.incognia.internal.ETe
    public final void BGx(nn nnVar) {
        this.HQ.invoke(nnVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JWV(String str, Object obj, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.BGx = str;
        this.mbG = obj;
        this.HQ = (Lambda) r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        new isAdapterPositionOnScreen(new NoX(this));
    }

    @Override // com.incognia.internal.ETe
    public final String BGx() {
        return this.BGx;
    }
}
