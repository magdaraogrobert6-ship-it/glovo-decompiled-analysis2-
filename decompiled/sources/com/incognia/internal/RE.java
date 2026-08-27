package com.incognia.internal;

import com.incognia.EventLocation;
import com.incognia.EventProperties;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes5.dex */
public final class RE extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ String BGx;
    public final /* synthetic */ EventLocation HQ;
    public final /* synthetic */ String N;
    public final /* synthetic */ EventProperties hIl;
    public final /* synthetic */ String mbG;
    public final /* synthetic */ String x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RE(String str, String str2, EventLocation eventLocation, String str3, String str4, EventProperties eventProperties) {
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
        udr.BGx(this.BGx, "accountId");
        udr.BGx(this.mbG, "externalId");
        Hwl hwlBGx = oV.BGx();
        String str = this.BGx;
        String str2 = this.mbG;
        EventLocation eventLocation = this.HQ;
        String str3 = this.N;
        String str4 = this.x;
        EventProperties eventProperties = this.hIl;
        hwlBGx.getClass();
        hwlBGx.BGx(HET.mbG, new ag(hwlBGx, str2, eventLocation, str3, str4, eventProperties, str));
        return createFromParcel.INSTANCE;
    }
}
