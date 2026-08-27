package com.incognia.internal;

import android.util.Log;
import com.incognia.EventLocation;
import com.incognia.EventProperties;
import com.incognia.PaymentCoupon;
import com.incognia.PaymentMethod;
import com.incognia.PaymentValue;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes5.dex */
public final class xBu extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
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
    public xBu(String str, String str2, EventLocation eventLocation, List list, PaymentValue paymentValue, PaymentCoupon paymentCoupon, List list2, String str3, String str4, EventProperties eventProperties, String str5) {
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
        udr.BGx(this.BGx, "accountId");
        udr.BGx(this.mbG, "externalId");
        udr.BGx(this.HQ, "storeId");
        List<PaymentMethod> list = this.N;
        if (list != null) {
            for (PaymentMethod paymentMethod : list) {
                String str = Ea.BGx;
                if (!Ea.BGx(paymentMethod.getCreditCardInfo()) || !Ea.BGx(paymentMethod.getDebitCardInfo())) {
                    if (!IU.BGx.get()) {
                        break;
                    }
                    Log.e("Incognia", "Invalid payment method information received: \n                    make sure that the card information is valid.");
                    break;
                }
            }
        }
        Hwl hwlBGx = oV.BGx();
        String str2 = this.BGx;
        String str3 = this.mbG;
        EventLocation eventLocation = this.x;
        List list2 = this.hIl;
        PaymentValue paymentValue = this.hs;
        PaymentCoupon paymentCoupon = this.VV3;
        List list3 = this.N;
        String str4 = this.HQ;
        String str5 = this.A1;
        EventProperties eventProperties = this.q;
        String str6 = this.fZl;
        hwlBGx.getClass();
        hwlBGx.BGx(EqO.mbG, new GpO(hwlBGx, str3, eventLocation, list2, paymentValue, paymentCoupon, list3, str4, str5, eventProperties, str6, str2));
        return createFromParcel.INSTANCE;
    }
}
