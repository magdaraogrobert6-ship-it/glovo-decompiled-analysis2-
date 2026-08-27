package com.incognia.internal;

import android.util.Log;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.onContentCardClicked;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes5.dex */
public final class SV extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ String BGx;

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        AtomicBoolean atomicBoolean = IU.BGx;
        atomicBoolean.get();
        if (this.BGx.length() != 0) {
            udr.BGx(this.BGx, "businessUnitId");
            String str = this.BGx;
            if (!onContentCardClicked.IconCompatParcelizer(udr.BGx, str) && atomicBoolean.get()) {
                Log.w("Incognia", "Unexpected business unit id received: " + str + ". Please make sure this value has been properly aligned with Incognia's team.");
            }
            Hwl hwlBGx = oV.BGx();
            String str2 = this.BGx;
            Map map = (Map) hwlBGx.hs.N.get();
            if (map == null || !map.containsKey(str2)) {
                hwlBGx.BGx(PG9.mbG, new MA(hwlBGx, str2));
            } else {
                hwlBGx.hs.BGx(str2);
            }
        } else if (atomicBoolean.get()) {
            Log.w("Incognia", "Invalid businessUnitId received: businessUnitId won't be reported.");
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SV(String str) {
        super(0);
        this.BGx = str;
    }
}
