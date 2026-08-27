package com.incognia.internal;

import com.incognia.EventLocation;
import com.incognia.EventProperties;
import com.incognia.Incognia;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes4.dex */
public final class wVO extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ String BGx;
    public final /* synthetic */ EventLocation HQ;
    public final /* synthetic */ String N;
    public final /* synthetic */ EventProperties hIl;
    public final /* synthetic */ String mbG;
    public final /* synthetic */ String x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wVO(String str, String str2, EventLocation eventLocation, String str3, String str4, EventProperties eventProperties) {
        super(0);
        this.BGx = str;
        this.mbG = str2;
        this.HQ = eventLocation;
        this.N = str3;
        this.x = str4;
        this.hIl = eventProperties;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        Incognia.INSTANCE.runOnIncogniaThreadIfInitialized("sendLoginEvent", new RE(this.BGx, this.mbG, this.HQ, this.N, this.x, this.hIl));
        return createFromParcel.INSTANCE;
    }
}
