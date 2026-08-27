package com.roadrunner.delivery.pickupdropoff.bluetoothscanning;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class BleScanningLifecycleObserverImpl$onCreate$1$1$2$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ BleScanningLifecycleObserverImpl serializer;
    public /* synthetic */ boolean write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BleScanningLifecycleObserverImpl$onCreate$1$1$2$1(BleScanningLifecycleObserverImpl bleScanningLifecycleObserverImpl, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.serializer = bleScanningLifecycleObserverImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 93;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.read;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        BleScanningLifecycleObserverImpl bleScanningLifecycleObserverImpl = this.serializer;
        boolean z = this.write;
        if (i3 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            bleScanningLifecycleObserverImpl.MediaMetadataCompat = z;
            return createfromparcel2;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        bleScanningLifecycleObserverImpl.MediaSessionCompatQueueItem = z;
        int i4 = RemoteActionCompatParcelizer + 3;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 90 / 0;
        }
        return createfromparcel2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i2 != 0) {
            ((BleScanningLifecycleObserverImpl$onCreate$1$1$2$1) create(bool, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            int i3 = IconCompatParcelizer + 89;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return createfromparcel;
        }
        ((BleScanningLifecycleObserverImpl$onCreate$1$1$2$1) create(bool, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = IconCompatParcelizer + 27;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 103;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.read;
        BleScanningLifecycleObserverImpl bleScanningLifecycleObserverImpl = this.serializer;
        if (i3 != 0) {
            BleScanningLifecycleObserverImpl$onCreate$1$1$2$1 bleScanningLifecycleObserverImpl$onCreate$1$1$2$1 = new BleScanningLifecycleObserverImpl$onCreate$1$1$2$1(bleScanningLifecycleObserverImpl, shortNewsContentCardView, 1);
            bleScanningLifecycleObserverImpl$onCreate$1$1$2$1.write = ((Boolean) obj).booleanValue();
            return bleScanningLifecycleObserverImpl$onCreate$1$1$2$1;
        }
        BleScanningLifecycleObserverImpl$onCreate$1$1$2$1 bleScanningLifecycleObserverImpl$onCreate$1$1$2$2 = new BleScanningLifecycleObserverImpl$onCreate$1$1$2$1(bleScanningLifecycleObserverImpl, shortNewsContentCardView, 0);
        bleScanningLifecycleObserverImpl$onCreate$1$1$2$2.write = ((Boolean) obj).booleanValue();
        int i4 = IconCompatParcelizer + 57;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return bleScanningLifecycleObserverImpl$onCreate$1$1$2$2;
        }
        throw null;
    }
}
