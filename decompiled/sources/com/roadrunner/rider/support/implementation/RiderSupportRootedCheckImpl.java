package com.roadrunner.rider.support.implementation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.map.container.context.GetMapScope$invoke$$inlined$map$1;
import com.roadrunner.rider.state.status.GetCourierStatusUseCaseImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;
import o.SystemLifecycleSystemLifecycleCallback;
import o.attributionFromJson;
import o.createFromParcel;
import o.getCallbackId;
import o.isTrackingEnabled;

/* JADX INFO: loaded from: classes3.dex */
public final class RiderSupportRootedCheckImpl {
    private static int read = 1;
    private static int write;
    public final GetCourierStatusUseCaseImpl RemoteActionCompatParcelizer;
    public final SystemLifecycleSystemLifecycleCallback serializer;

    public RiderSupportRootedCheckImpl(SystemLifecycleSystemLifecycleCallback systemLifecycleSystemLifecycleCallback, GetCourierStatusUseCaseImpl getCourierStatusUseCaseImpl) {
        systemLifecycleSystemLifecycleCallback.getClass();
        getCourierStatusUseCaseImpl.getClass();
        this.serializer = systemLifecycleSystemLifecycleCallback;
        this.RemoteActionCompatParcelizer = getCourierStatusUseCaseImpl;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public final Object performRootedDeviceCheck(ContinuationImpl continuationImpl) {
        attributionFromJson attributionfromjson;
        isTrackingEnabled istrackingenabled;
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 83;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (continuationImpl instanceof attributionFromJson) {
            int i5 = i2 + 25;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            attributionfromjson = (attributionFromJson) continuationImpl;
            int i7 = attributionfromjson.RemoteActionCompatParcelizer;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                attributionfromjson.RemoteActionCompatParcelizer = i7 - Integer.MIN_VALUE;
                int i8 = read + 113;
                write = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
            } else {
                attributionfromjson = new attributionFromJson(this, continuationImpl);
            }
        } else {
            attributionfromjson = new attributionFromJson(this, continuationImpl);
        }
        Object objFirstOrNull = attributionfromjson.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = attributionfromjson.RemoteActionCompatParcelizer;
        if (i10 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            GetMapScope$invoke$$inlined$map$1 getMapScope$invoke$$inlined$map$1Write = this.RemoteActionCompatParcelizer.write();
            attributionfromjson.RemoteActionCompatParcelizer = 1;
            objFirstOrNull = FlowKt.firstOrNull(getMapScope$invoke$$inlined$map$1Write, attributionfromjson);
            if (objFirstOrNull == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
        }
        getCallbackId getcallbackid = (getCallbackId) objFirstOrNull;
        if (getcallbackid != null && ((istrackingenabled = getcallbackid.IconCompatParcelizer) == isTrackingEnabled.NOT_WORKING || istrackingenabled == isTrackingEnabled.SUSPENDED || istrackingenabled == isTrackingEnabled.AVAILABLE)) {
            this.serializer.MediaBrowserCompatMediaItem();
        }
        return createFromParcel.INSTANCE;
    }
}
