package com.roadrunner.delivery.ontheway.observer;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.roadrunner.delivery.repository.api.DeliveryInformation$ScreenDataType;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getStrictnessusljTpc;
import o.getWordBreakjp8hJ3c;
import o.onPrimaryNavigationFragmentChanged;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.timesmpE4wyQ;

/* JADX INFO: loaded from: classes3.dex */
public final class KeepScreenOnDuringDeliveriesLifeCycleObserverImpl$onCreate$1$1$1 extends SuspendLambda implements r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public /* synthetic */ onPrimaryNavigationFragmentChanged IconCompatParcelizer;
    public /* synthetic */ getStrictnessusljTpc serializer;
    public /* synthetic */ timesmpE4wyQ write;

    @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 2 % 2;
        KeepScreenOnDuringDeliveriesLifeCycleObserverImpl$onCreate$1$1$1 keepScreenOnDuringDeliveriesLifeCycleObserverImpl$onCreate$1$1$1 = new KeepScreenOnDuringDeliveriesLifeCycleObserverImpl$onCreate$1$1$1(4, (ShortNewsContentCardView) obj4);
        keepScreenOnDuringDeliveriesLifeCycleObserverImpl$onCreate$1$1$1.write = (timesmpE4wyQ) obj;
        keepScreenOnDuringDeliveriesLifeCycleObserverImpl$onCreate$1$1$1.IconCompatParcelizer = (onPrimaryNavigationFragmentChanged) obj2;
        keepScreenOnDuringDeliveriesLifeCycleObserverImpl$onCreate$1$1$1.serializer = (getStrictnessusljTpc) obj3;
        Object objInvokeSuspend = keepScreenOnDuringDeliveriesLifeCycleObserverImpl$onCreate$1$1$1.invokeSuspend(createFromParcel.INSTANCE);
        int i2 = RemoteActionCompatParcelizer + 39;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        int i = 2 % 2;
        timesmpE4wyQ timesmpe4wyq = this.write;
        onPrimaryNavigationFragmentChanged onprimarynavigationfragmentchanged = this.IconCompatParcelizer;
        getStrictnessusljTpc getstrictnessusljtpc = this.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        boolean z3 = getstrictnessusljtpc instanceof getWordBreakjp8hJ3c;
        DeliveryInformation$ScreenDataType deliveryInformation$ScreenDataType = timesmpe4wyq.MediaMetadataCompat;
        boolean z4 = false;
        if (deliveryInformation$ScreenDataType == DeliveryInformation$ScreenDataType.DELIVERY_DETAILS || deliveryInformation$ScreenDataType == DeliveryInformation$ScreenDataType.ON_THE_WAY) {
            z = true;
        } else {
            int i2 = read + 121;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            z = false;
        }
        if (onprimarynavigationfragmentchanged == onPrimaryNavigationFragmentChanged.COLLAPSED || onprimarynavigationfragmentchanged == onPrimaryNavigationFragmentChanged.HALF_EXPANDED) {
            int i4 = RemoteActionCompatParcelizer + 21;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (z3 && z && z2) {
            z4 = true;
        }
        return Boolean.valueOf(z4);
    }

    public KeepScreenOnDuringDeliveriesLifeCycleObserverImpl$onCreate$1$1$1(int i, ShortNewsContentCardView shortNewsContentCardView) {
        super(i, shortNewsContentCardView);
    }
}
