package com.incognia.internal;

import com.incognia.EventAddress;
import com.incognia.EventProperties;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class W0 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ Hwl BGx;
    public final /* synthetic */ EventAddress HQ;
    public final /* synthetic */ String N;
    public final /* synthetic */ String hIl;
    public final /* synthetic */ String hs;
    public final /* synthetic */ String mbG;
    public final /* synthetic */ EventProperties x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W0(Hwl hwl, String str, EventAddress eventAddress, String str2, EventProperties eventProperties, String str3, String str4) {
        super(0);
        this.BGx = hwl;
        this.mbG = str;
        this.HQ = eventAddress;
        this.N = str2;
        this.x = eventProperties;
        this.hIl = str3;
        this.hs = str4;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        Hwl hwl = this.BGx;
        String str = this.mbG;
        EventAddress eventAddress = this.HQ;
        zY5 zy5BGx = hwl.A1.BGx(str, this.N, this.x, this.hIl, this.hs);
        hwl.q.getClass();
        this.BGx.N.mbG.set(new Lzq(zy5BGx, yo.BGx(eventAddress)));
        return createFromParcel.INSTANCE;
    }
}
