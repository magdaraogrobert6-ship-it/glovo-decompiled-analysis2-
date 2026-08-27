package com.incognia.internal;

import com.incognia.CardInfo;
import com.incognia.EventLocation;
import com.incognia.EventProperties;
import com.incognia.PaymentAddress;
import com.incognia.PaymentCoupon;
import com.incognia.PaymentMethod;
import com.incognia.PaymentValue;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.accessgetInstancedelegatecp;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes5.dex */
public final class GpO extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ String A1;
    public final /* synthetic */ Hwl BGx;
    public final /* synthetic */ EventLocation HQ;
    public final /* synthetic */ List N;
    public final /* synthetic */ String S;
    public final /* synthetic */ String VV3;
    public final /* synthetic */ String fZl;
    public final /* synthetic */ PaymentCoupon hIl;
    public final /* synthetic */ List hs;
    public final /* synthetic */ String mbG;
    public final /* synthetic */ EventProperties q;
    public final /* synthetic */ PaymentValue x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GpO(Hwl hwl, String str, EventLocation eventLocation, List list, PaymentValue paymentValue, PaymentCoupon paymentCoupon, List list2, String str2, String str3, EventProperties eventProperties, String str4, String str5) {
        super(0);
        this.BGx = hwl;
        this.mbG = str;
        this.HQ = eventLocation;
        this.N = list;
        this.x = paymentValue;
        this.hIl = paymentCoupon;
        this.hs = list2;
        this.VV3 = str2;
        this.A1 = str3;
        this.q = eventProperties;
        this.fZl = str4;
        this.S = str5;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        ArrayList arrayList;
        ArrayList arrayList2;
        Hwl hwl = this.BGx;
        String str = this.mbG;
        EventLocation eventLocation = this.HQ;
        List<PaymentAddress> list = this.N;
        PaymentValue paymentValue = this.x;
        PaymentCoupon paymentCoupon = this.hIl;
        List<PaymentMethod> list2 = this.hs;
        String str2 = this.VV3;
        zY5 zy5BGx = hwl.A1.BGx(str, this.A1, this.q, this.fZl, this.S);
        if (list != null) {
            ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
            for (PaymentAddress paymentAddress : list) {
                hwl.S.getClass();
                arrayList3.add(new E6C(paymentAddress.getType(), yo.BGx(paymentAddress.getAddress())));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        if (list2 != null) {
            ArrayList arrayList4 = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
            for (PaymentMethod paymentMethod : list2) {
                hwl.iaH.getClass();
                String type = paymentMethod.getType();
                String identifier = paymentMethod.getIdentifier();
                String brand = paymentMethod.getBrand();
                CardInfo creditCardInfo = paymentMethod.getCreditCardInfo();
                PRp pRp = creditCardInfo == null ? null : new PRp(creditCardInfo.getBin(), creditCardInfo.getLastFourDigits(), creditCardInfo.getExpiryYear(), creditCardInfo.getExpiryMonth());
                CardInfo debitCardInfo = paymentMethod.getDebitCardInfo();
                arrayList4.add(new tY(type, pRp, debitCardInfo == null ? null : new PRp(debitCardInfo.getBin(), debitCardInfo.getLastFourDigits(), debitCardInfo.getExpiryYear(), debitCardInfo.getExpiryMonth()), identifier, brand));
            }
            arrayList2 = arrayList4;
        } else {
            arrayList2 = null;
        }
        hwl.fZl.getClass();
        LAd lAd = eventLocation == null ? null : new LAd(eventLocation.getLatitude(), eventLocation.getLongitude(), eventLocation.getTimestamp());
        hwl.VLD.getClass();
        GnB gnB = paymentValue == null ? null : new GnB(paymentValue.getAmount(), paymentValue.getCurrency(), paymentValue.getInstallments(), paymentValue.getDiscountAmount());
        hwl.e.getClass();
        this.BGx.hIl.mbG.set(new wVC(zy5BGx, lAd, arrayList, gnB, arrayList2, paymentCoupon == null ? null : new BB(paymentCoupon.getType(), paymentCoupon.getValue(), paymentCoupon.getMaxDiscount(), paymentCoupon.getId(), paymentCoupon.getName()), str2));
        return createFromParcel.INSTANCE;
    }
}
