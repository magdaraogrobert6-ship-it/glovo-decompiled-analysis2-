package com.mapbox.maps;

import com.mapbox.common.Cancelable;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class UtilsKt$suspendMapboxCancellableCoroutine$2$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    final /* synthetic */ Cancelable $cancelable;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilsKt$suspendMapboxCancellableCoroutine$2$1(Cancelable cancelable) {
        super(1);
        this.$cancelable = cancelable;
    }

    public final void invoke(Throwable th) {
        this.$cancelable.cancel();
    }
}
