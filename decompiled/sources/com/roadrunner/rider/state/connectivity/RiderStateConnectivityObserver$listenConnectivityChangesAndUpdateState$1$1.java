package com.roadrunner.rider.state.connectivity;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class RiderStateConnectivityObserver$listenConnectivityChangesAndUpdateState$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public /* synthetic */ boolean read;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 69;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            boolean z = this.read;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Boolean.valueOf(z);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        boolean z2 = this.read;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Boolean boolValueOf = Boolean.valueOf(z2);
        int i3 = serializer + 113;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return boolValueOf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        RiderStateConnectivityObserver$listenConnectivityChangesAndUpdateState$1$1 riderStateConnectivityObserver$listenConnectivityChangesAndUpdateState$1$1 = new RiderStateConnectivityObserver$listenConnectivityChangesAndUpdateState$1$1(2, shortNewsContentCardView);
        riderStateConnectivityObserver$listenConnectivityChangesAndUpdateState$1$1.read = ((Boolean) obj).booleanValue();
        int i2 = IconCompatParcelizer + 43;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 10 / 0;
        }
        return riderStateConnectivityObserver$listenConnectivityChangesAndUpdateState$1$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        Object objInvokeSuspend;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 115;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            objInvokeSuspend = ((RiderStateConnectivityObserver$listenConnectivityChangesAndUpdateState$1$1) create(bool, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
            int i3 = 97 / 0;
        } else {
            Boolean bool2 = (Boolean) obj;
            bool2.booleanValue();
            objInvokeSuspend = ((RiderStateConnectivityObserver$listenConnectivityChangesAndUpdateState$1$1) create(bool2, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        }
        int i4 = IconCompatParcelizer + 107;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objInvokeSuspend;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    public RiderStateConnectivityObserver$listenConnectivityChangesAndUpdateState$1$1(int i, ShortNewsContentCardView shortNewsContentCardView) {
        super(i, shortNewsContentCardView);
    }
}
