package com.braze;

import bo.app.l5;
import coil3.ExtrasKt;
import com.braze.events.IValueCallback;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ IValueCallback a;
    public final /* synthetic */ Braze b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(IValueCallback iValueCallback, Braze braze, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.a = iValueCallback;
        this.b = braze;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        return new b(this.a, this.b, shortNewsContentCardView);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return new b(this.a, this.b, (ShortNewsContentCardView) obj2).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        boolean zIsSdkDisabledOrDelayed = Braze.Companion.isSdkDisabledOrDelayed();
        IValueCallback iValueCallback = this.a;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (zIsSdkDisabledOrDelayed) {
            iValueCallback.onError();
            return createfromparcel;
        }
        iValueCallback.onSuccess(((l5) this.b.getDeviceIdProvider$android_sdk_base_release()).a());
        return createfromparcel;
    }
}
