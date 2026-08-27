package com.incognia.internal;

import com.incognia.Callback;
import com.incognia.Incognia;
import com.incognia.RequestTokenWithStatus;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes5.dex */
public final class uXq extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int BGx;
    public final /* synthetic */ Callback HQ;
    public final /* synthetic */ int mbG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uXq(int i, int i2, Callback callback) {
        super(1);
        this.BGx = i;
        this.mbG = i2;
        this.HQ = callback;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        UsU usU = E79.BGx;
        E79.HQ(this.BGx);
        Incognia.INSTANCE.runOnMainThread(new VDh(this.mbG, this.HQ, (RequestTokenWithStatus) obj));
        return createFromParcel.INSTANCE;
    }
}
