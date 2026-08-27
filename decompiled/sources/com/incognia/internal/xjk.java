package com.incognia.internal;

import android.app.Application;
import com.incognia.IncogniaOptions;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class xjk extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ Application BGx;
    public final /* synthetic */ IncogniaOptions mbG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xjk(Application application, IncogniaOptions incogniaOptions) {
        super(0);
        this.BGx = application;
        this.mbG = incogniaOptions;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        UsU usU = JuE.BGx;
        JuE.BGx(this.BGx, this.mbG);
        return createFromParcel.INSTANCE;
    }
}
