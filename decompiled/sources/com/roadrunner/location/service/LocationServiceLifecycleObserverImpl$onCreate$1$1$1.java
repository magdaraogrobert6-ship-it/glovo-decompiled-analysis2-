package com.roadrunner.location.service;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class LocationServiceLifecycleObserverImpl$onCreate$1$1$1 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public /* synthetic */ boolean RemoteActionCompatParcelizer;
    public /* synthetic */ boolean serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LocationServiceLifecycleObserverImpl$onCreate$1$1$1(int i, int i2, ShortNewsContentCardView shortNewsContentCardView) {
        super(i, shortNewsContentCardView);
        this.IconCompatParcelizer = i2;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = read + 59;
        write = i3 % Fields.SpotShadowColor;
        Object obj4 = null;
        if (i3 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            obj4.hashCode();
            throw null;
        }
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        Boolean bool = (Boolean) obj;
        int i5 = 3;
        if (i4 == 0) {
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
            LocationServiceLifecycleObserverImpl$onCreate$1$1$1 locationServiceLifecycleObserverImpl$onCreate$1$1$1 = new LocationServiceLifecycleObserverImpl$onCreate$1$1$1(i5, 0, (ShortNewsContentCardView) obj3);
            locationServiceLifecycleObserverImpl$onCreate$1$1$1.RemoteActionCompatParcelizer = zBooleanValue;
            locationServiceLifecycleObserverImpl$onCreate$1$1$1.serializer = zBooleanValue2;
            return locationServiceLifecycleObserverImpl$onCreate$1$1$1.invokeSuspend(createfromparcel2);
        }
        int i6 = 1;
        if (i4 == 1) {
            boolean zBooleanValue3 = bool.booleanValue();
            boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
            LocationServiceLifecycleObserverImpl$onCreate$1$1$1 locationServiceLifecycleObserverImpl$onCreate$1$1$2 = new LocationServiceLifecycleObserverImpl$onCreate$1$1$1(i5, i6, (ShortNewsContentCardView) obj3);
            locationServiceLifecycleObserverImpl$onCreate$1$1$2.RemoteActionCompatParcelizer = zBooleanValue3;
            locationServiceLifecycleObserverImpl$onCreate$1$1$2.serializer = zBooleanValue4;
            return locationServiceLifecycleObserverImpl$onCreate$1$1$2.invokeSuspend(createfromparcel2);
        }
        boolean zBooleanValue5 = bool.booleanValue();
        boolean zBooleanValue6 = ((Boolean) obj2).booleanValue();
        LocationServiceLifecycleObserverImpl$onCreate$1$1$1 locationServiceLifecycleObserverImpl$onCreate$1$1$3 = new LocationServiceLifecycleObserverImpl$onCreate$1$1$1(i5, i, (ShortNewsContentCardView) obj3);
        locationServiceLifecycleObserverImpl$onCreate$1$1$3.RemoteActionCompatParcelizer = zBooleanValue5;
        locationServiceLifecycleObserverImpl$onCreate$1$1$3.serializer = zBooleanValue6;
        Object objInvokeSuspend = locationServiceLifecycleObserverImpl$onCreate$1$1$3.invokeSuspend(createfromparcel2);
        int i7 = write + 125;
        read = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 95;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        boolean z = false;
        if (i4 == 0) {
            boolean z2 = this.RemoteActionCompatParcelizer;
            boolean z3 = this.serializer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("LocationServiceLifecycleObserver: isLocationPermissionGranted " + z3 + " , isRider in workingState " + z2, new Object[0]);
            if (!(!z3) && z2) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (i4 != 1) {
            boolean z4 = this.RemoteActionCompatParcelizer;
            boolean z5 = this.serializer;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (z4) {
                z = true;
            } else {
                int i5 = write + 39;
                read = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 74 / 0;
                    if (z5) {
                        z = true;
                    }
                } else if (z5) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
        boolean z6 = this.RemoteActionCompatParcelizer;
        boolean z7 = this.serializer;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        if (z6) {
            int i7 = read;
            int i8 = i7 + 51;
            write = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            if (z7) {
                int i10 = i7 + 93;
                write = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
