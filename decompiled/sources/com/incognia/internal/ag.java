package com.incognia.internal;

import com.incognia.EventLocation;
import com.incognia.EventProperties;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes5.dex */
public final class ag extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ Hwl BGx;
    public final /* synthetic */ EventLocation HQ;
    public final /* synthetic */ String N;
    public final /* synthetic */ EventProperties hIl;
    public final /* synthetic */ String hs;
    public final /* synthetic */ String mbG;
    public final /* synthetic */ String x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(Hwl hwl, String str, EventLocation eventLocation, String str2, String str3, EventProperties eventProperties, String str4) {
        super(0);
        this.BGx = hwl;
        this.mbG = str;
        this.HQ = eventLocation;
        this.N = str2;
        this.x = str3;
        this.hIl = eventProperties;
        this.hs = str4;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        Hwl hwl = this.BGx;
        String str = this.mbG;
        EventLocation eventLocation = this.HQ;
        zY5 zy5BGx = hwl.A1.BGx(str, this.x, this.hIl, this.N, this.hs);
        hwl.fZl.getClass();
        this.BGx.HQ.mbG.set(new BRm(zy5BGx, eventLocation == null ? null : new LAd(eventLocation.getLatitude(), eventLocation.getLongitude(), eventLocation.getTimestamp())));
        return createFromParcel.INSTANCE;
    }
}
