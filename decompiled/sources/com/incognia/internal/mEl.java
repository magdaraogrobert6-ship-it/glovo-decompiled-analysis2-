package com.incognia.internal;

import com.incognia.EventAddress;
import com.incognia.EventProperties;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class mEl extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ String BGx;
    public final /* synthetic */ EventAddress HQ;
    public final /* synthetic */ String N;
    public final /* synthetic */ String hIl;
    public final /* synthetic */ String mbG;
    public final /* synthetic */ EventProperties x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mEl(String str, String str2, EventAddress eventAddress, String str3, EventProperties eventProperties, String str4) {
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
        udr.BGx(this.BGx, "accountId");
        udr.BGx(this.mbG, "externalId");
        Hwl hwlBGx = oV.BGx();
        String str = this.BGx;
        String str2 = this.mbG;
        EventAddress eventAddress = this.HQ;
        String str3 = this.N;
        EventProperties eventProperties = this.x;
        String str4 = this.hIl;
        hwlBGx.getClass();
        hwlBGx.BGx(kp8.mbG, new W0(hwlBGx, str2, eventAddress, str3, eventProperties, str4, str));
        return createFromParcel.INSTANCE;
    }
}
