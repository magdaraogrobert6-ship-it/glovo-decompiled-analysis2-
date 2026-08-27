package com.incognia.internal;

import com.incognia.EventAddress;
import com.incognia.EventProperties;
import com.incognia.Incognia;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes4.dex */
public final class d6 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ String BGx;
    public final /* synthetic */ EventAddress HQ;
    public final /* synthetic */ String N;
    public final /* synthetic */ String hIl;
    public final /* synthetic */ String mbG;
    public final /* synthetic */ EventProperties x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(String str, String str2, EventAddress eventAddress, String str3, EventProperties eventProperties, String str4) {
        super(0);
        this.BGx = str;
        this.mbG = str2;
        this.HQ = eventAddress;
        this.N = str3;
        this.x = eventProperties;
        this.hIl = str4;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        Incognia.INSTANCE.runOnIncogniaThreadIfInitialized("sendOnboardingEvent", new a8N(this.BGx, this.mbG, this.HQ, this.N, this.x, this.hIl));
        return createFromParcel.INSTANCE;
    }
}
