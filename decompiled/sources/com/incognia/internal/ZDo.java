package com.incognia.internal;

import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.getCieXyz;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class ZDo extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ String BGx;

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        AtomicBoolean atomicBoolean = IU.BGx;
        atomicBoolean.get();
        if (this.BGx.length() != 0) {
            udr.BGx(this.BGx, "accountId");
            Hwl hwlBGx = oV.BGx();
            String str = this.BGx;
            Object[] objArr = {(String) hwlBGx.mbG.HQ.get(), str};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                hwlBGx.BGx(SFo.mbG, new ZY(hwlBGx, str));
            }
        } else if (atomicBoolean.get()) {
            Log.w("Incognia", "Invalid account id received: account won't be set. \nTo clear the account id, please call clearAccountId()");
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZDo(String str) {
        super(0);
        this.BGx = str;
    }
}
