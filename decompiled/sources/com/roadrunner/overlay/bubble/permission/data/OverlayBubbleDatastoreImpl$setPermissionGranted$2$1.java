package com.roadrunner.overlay.bubble.permission.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.StaticImageDecoder;
import o.backwardFocusSearch;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class OverlayBubbleDatastoreImpl$setPermissionGranted$2$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ boolean IconCompatParcelizer;
    public final /* synthetic */ StaticImageDecoder RemoteActionCompatParcelizer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayBubbleDatastoreImpl$setPermissionGranted$2$1(StaticImageDecoder staticImageDecoder, boolean z, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = staticImageDecoder;
        this.IconCompatParcelizer = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        OverlayBubbleDatastoreImpl$setPermissionGranted$2$1 overlayBubbleDatastoreImpl$setPermissionGranted$2$1 = new OverlayBubbleDatastoreImpl$setPermissionGranted$2$1(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, shortNewsContentCardView);
        overlayBubbleDatastoreImpl$setPermissionGranted$2$1.write = obj;
        int i2 = serializer + 123;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return overlayBubbleDatastoreImpl$setPermissionGranted$2$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = read + 117;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        OverlayBubbleDatastoreImpl$setPermissionGranted$2$1 overlayBubbleDatastoreImpl$setPermissionGranted$2$1 = (OverlayBubbleDatastoreImpl$setPermissionGranted$2$1) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        overlayBubbleDatastoreImpl$setPermissionGranted$2$1.invokeSuspend(createfromparcel);
        int i4 = serializer + 49;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 85;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        backwardFocusSearch backwardfocussearch = (backwardFocusSearch) this.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        backwardfocussearch.write(this.RemoteActionCompatParcelizer.write, Boolean.valueOf(this.IconCompatParcelizer));
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = read + 25;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }
}
