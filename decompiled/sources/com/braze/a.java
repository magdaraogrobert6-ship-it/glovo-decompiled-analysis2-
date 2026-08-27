package com.braze;

import coil3.ExtrasKt;
import com.braze.events.IValueCallback;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class a extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ IValueCallback a;
    public final /* synthetic */ Braze b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(IValueCallback iValueCallback, Braze braze, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.a = iValueCallback;
        this.b = braze;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        return new a(this.a, this.b, shortNewsContentCardView);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return new a(this.a, this.b, (ShortNewsContentCardView) obj2).invokeSuspend(createFromParcel.INSTANCE);
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
        BrazeUser brazeUser = this.b.brazeUser;
        if (brazeUser != null) {
            iValueCallback.onSuccess(brazeUser);
            return createfromparcel;
        }
        removeNodeAtDepth.serializer("brazeUser");
        throw null;
    }
}
