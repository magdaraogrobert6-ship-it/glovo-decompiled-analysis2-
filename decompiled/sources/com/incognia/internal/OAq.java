package com.incognia.internal;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class OAq extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ yI3 BGx;

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        ArrayList arrayListMbG = this.BGx.mbG();
        Iterator it = this.BGx.e.iterator();
        while (it.hasNext()) {
            ((QGs) it.next()).BGx(arrayListMbG);
        }
        Iterator it2 = this.BGx.iaH.iterator();
        while (it2.hasNext()) {
            ((QGs) it2.next()).BGx(arrayListMbG);
        }
        this.BGx.e.clear();
        if (this.BGx.iaH.isEmpty()) {
            yI3 yi3 = this.BGx;
            if (yi3.VLD) {
                yi3.BGx.unregisterReceiver(yi3.TfN);
                yi3.VLD = false;
            }
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OAq(yI3 yi3) {
        super(0);
        this.BGx = yi3;
    }
}
