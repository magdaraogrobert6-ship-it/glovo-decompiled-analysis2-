package com.roadrunner.rrds.compose.component.image.zoomable;

import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Fields;
import androidx.navigation.compose.NavHostKt$NavHost$29$1$1$1;
import coil3.ExtrasKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.width;

/* JADX INFO: loaded from: classes3.dex */
public final class ZoomState$changeScale$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaSessionCompatQueueItem;
    public final /* synthetic */ long IconCompatParcelizer;
    public final /* synthetic */ width RemoteActionCompatParcelizer;
    public final /* synthetic */ ZoomState read;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ float write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomState$changeScale$2(float f, ZoomState zoomState, long j, width widthVar, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.write = f;
        this.read = zoomState;
        this.IconCompatParcelizer = j;
        this.RemoteActionCompatParcelizer = widthVar;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 93;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ZoomState$changeScale$2 zoomState$changeScale$2 = (ZoomState$changeScale$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        zoomState$changeScale$2.invokeSuspend(createfromparcel);
        int i4 = MediaSessionCompatQueueItem + 1;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 61 / 0;
        }
        return createfromparcel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        ZoomState$changeScale$2 zoomState$changeScale$2 = new ZoomState$changeScale$2(this.write, this.read, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, shortNewsContentCardView);
        zoomState$changeScale$2.serializer = obj;
        int i2 = MediaSessionCompatQueueItem + 27;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 51 / 0;
        }
        return zoomState$changeScale$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        float fWrite = RangesKt.write(this.write, 1.0f, 5.0f);
        long jM493getZeroF1C5BW0 = Offset.Companion.m493getZeroF1C5BW0();
        ZoomState zoomState = this.read;
        long jM5040access$calculateNewOffsetDTl3nVk = ZoomState.m5040access$calculateNewOffsetDTl3nVk(zoomState, fWrite, this.IconCompatParcelizer, jM493getZeroF1C5BW0);
        Rect rectCalculateNewBounds = zoomState.calculateNewBounds(fWrite);
        float fWrite2 = RangesKt.write(Float.intBitsToFloat((int) (jM5040access$calculateNewOffsetDTl3nVk >> 32)), rectCalculateNewBounds.getLeft(), rectCalculateNewBounds.getRight());
        width widthVar = this.RemoteActionCompatParcelizer;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new ScrollExtensionsKt.AnonymousClass2(zoomState, fWrite2, widthVar, rectCalculateNewBounds, null, 1), 3);
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new ScrollExtensionsKt.AnonymousClass2(zoomState, RangesKt.write(Float.intBitsToFloat((int) (jM5040access$calculateNewOffsetDTl3nVk & 4294967295L)), rectCalculateNewBounds.getTop(), rectCalculateNewBounds.getBottom()), widthVar, rectCalculateNewBounds, null, 2), 3);
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new NavHostKt$NavHost$29$1$1$1(zoomState, fWrite, widthVar, null, 2), 3);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i2 = MediaSessionCompatQueueItem + 27;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 1 / 0;
        }
        return createfromparcel;
    }
}
