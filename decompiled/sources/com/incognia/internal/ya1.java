package com.incognia.internal;

import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.isItemDismissable;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class ya1 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public static final ya1 BGx = new ya1();

    public ya1() {
        super(0);
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        Object isitemdismissable;
        boolean z = false;
        if (XUh.BGx(XUh.BGx, 23, 0, 2)) {
            onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1 = OY8.BGx;
            try {
                System.loadLibrary((String) W4i.iHz.MediaSessionCompatResultReceiverWrapper());
                isitemdismissable = createFromParcel.INSTANCE;
            } catch (Throwable th) {
                isitemdismissable = new isItemDismissable(th);
            }
            z = !(isitemdismissable instanceof isItemDismissable);
        }
        return Boolean.valueOf(z);
    }
}
