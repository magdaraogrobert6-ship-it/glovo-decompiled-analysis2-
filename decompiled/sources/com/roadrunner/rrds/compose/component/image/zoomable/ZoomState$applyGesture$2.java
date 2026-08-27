package com.roadrunner.rrds.compose.component.image.zoomable;

import androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import coil3.ExtrasKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class ZoomState$applyGesture$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat;
    public final /* synthetic */ long IconCompatParcelizer;
    public final /* synthetic */ ZoomState MediaSessionCompatQueueItem;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ float read;
    public final /* synthetic */ long serializer;
    public final /* synthetic */ long write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomState$applyGesture$2(ZoomState zoomState, float f, long j, long j2, long j3, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.MediaSessionCompatQueueItem = zoomState;
        this.read = f;
        this.write = j;
        this.IconCompatParcelizer = j2;
        this.serializer = j3;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 73;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ZoomState$applyGesture$2 zoomState$applyGesture$2 = (ZoomState$applyGesture$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        zoomState$applyGesture$2.invokeSuspend(createfromparcel);
        int i4 = MediaDescriptionCompat + 17;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return createfromparcel;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        ZoomState$applyGesture$2 zoomState$applyGesture$2 = new ZoomState$applyGesture$2(this.MediaSessionCompatQueueItem, this.read, this.write, this.IconCompatParcelizer, this.serializer, shortNewsContentCardView);
        zoomState$applyGesture$2.RemoteActionCompatParcelizer = obj;
        int i2 = MediaBrowserCompatMediaItem + 69;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return zoomState$applyGesture$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        ZoomState zoomState = this.MediaSessionCompatQueueItem;
        float fRemoteActionCompatParcelizer = zoomState.RemoteActionCompatParcelizer();
        float f = this.read;
        float fWrite = RangesKt.write(fRemoteActionCompatParcelizer * f, 0.9f, 5.0f);
        long jM5040access$calculateNewOffsetDTl3nVk = ZoomState.m5040access$calculateNewOffsetDTl3nVk(this.MediaSessionCompatQueueItem, fWrite, this.write, this.IconCompatParcelizer);
        Rect rectCalculateNewBounds = zoomState.calculateNewBounds(fWrite);
        zoomState.serializer.serializer(new Float(rectCalculateNewBounds.getLeft()), new Float(rectCalculateNewBounds.getRight()));
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new ZoomState$startFling$2$1(zoomState, jM5040access$calculateNewOffsetDTl3nVk, null, 1), 3);
        zoomState.RemoteActionCompatParcelizer.serializer(new Float(rectCalculateNewBounds.getTop()), new Float(rectCalculateNewBounds.getBottom()));
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new ZoomState$startFling$2$1(zoomState, jM5040access$calculateNewOffsetDTl3nVk, null, 2), 3);
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new AnchoredDraggableKt$anchoredDraggable$1.AnonymousClass1(zoomState, fWrite, null, 1), 3);
        VelocityTracker velocityTracker = zoomState.MediaBrowserCompatMediaItem;
        if (f == 1.0f) {
            int i2 = MediaDescriptionCompat + 109;
            MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            velocityTracker.m2179addPositionUv8p0NA(this.serializer, this.write);
        } else {
            velocityTracker.resetTracking();
            int i4 = MediaDescriptionCompat + 19;
            MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        return createFromParcel.INSTANCE;
    }
}
