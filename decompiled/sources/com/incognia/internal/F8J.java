package com.incognia.internal;

import com.incognia.EventLocation;
import com.incognia.EventProperties;
import com.incognia.Incognia;
import com.incognia.PaymentCoupon;
import com.incognia.PaymentValue;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes4.dex */
public final class F8J extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ String A1;
    public final /* synthetic */ String BGx;
    public final /* synthetic */ String HQ;
    public final /* synthetic */ List N;
    public final /* synthetic */ PaymentCoupon VV3;
    public final /* synthetic */ String fZl;
    public final /* synthetic */ List hIl;
    public final /* synthetic */ PaymentValue hs;
    public final /* synthetic */ String mbG;
    public final /* synthetic */ EventProperties q;
    public final /* synthetic */ EventLocation x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F8J(String str, String str2, EventLocation eventLocation, List list, PaymentValue paymentValue, PaymentCoupon paymentCoupon, List list2, String str3, String str4, EventProperties eventProperties, String str5) {
        super(0);
        this.BGx = str;
        this.mbG = str2;
        this.HQ = str3;
        this.N = list;
        this.x = eventLocation;
        this.hIl = list2;
        this.hs = paymentValue;
        this.VV3 = paymentCoupon;
        this.A1 = str4;
        this.q = eventProperties;
        this.fZl = str5;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        Incognia incognia = Incognia.INSTANCE;
        String str = this.BGx;
        String str2 = this.mbG;
        String str3 = this.HQ;
        List list = this.N;
        incognia.runOnIncogniaThreadIfInitialized("sendPaymentEvent", new xBu(str, str2, this.x, list, this.hs, this.VV3, this.hIl, str3, this.A1, this.q, this.fZl));
        return createFromParcel.INSTANCE;
    }
}
