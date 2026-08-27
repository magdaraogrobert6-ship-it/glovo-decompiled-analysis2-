package com.incognia.internal;

import com.incognia.RequestTokenWithStatus;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class Dlm extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ AtomicReference BGx;
    public final /* synthetic */ Lambda mbG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Dlm(AtomicReference atomicReference, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        super(1);
        this.BGx = atomicReference;
        this.mbG = (Lambda) r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.internal.Lambda, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM] */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        RequestTokenWithStatus requestTokenWithStatus = (RequestTokenWithStatus) obj;
        B74 b74 = (B74) this.BGx.get();
        if (b74 == null || b74.mbG.compareAndSet(0, 3)) {
            this.mbG.invoke(requestTokenWithStatus);
        }
        return createFromParcel.INSTANCE;
    }
}
