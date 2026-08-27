package com.roadrunner.rrds.compose.component.image.zoomable;

import androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda1;
import o.FutureScheduler;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class ZoomableNode extends DelegatingNode implements PointerInputModifierNode, LayoutModifierNode {
    private static int MediaMetadataCompat = 0;
    private static int RatingCompat = 1;
    public final SuspendingPointerInputModifierNode IconCompatParcelizer;
    public FutureScheduler MediaBrowserCompatMediaItem;
    public ZoomState MediaDescriptionCompat;
    public boolean MediaSessionCompatQueueItem;
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM RemoteActionCompatParcelizer;
    public r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 read;
    public Boolean serializer;
    public long write;

    public ZoomableNode(ZoomState zoomState, boolean z, FutureScheduler futureScheduler, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ZoomableKt$zoomable$1 zoomableKt$zoomable$1) {
        zoomState.getClass();
        futureScheduler.getClass();
        this.MediaDescriptionCompat = zoomState;
        this.MediaSessionCompatQueueItem = z;
        this.MediaBrowserCompatMediaItem = futureScheduler;
        this.RemoteActionCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.read = zoomableKt$zoomable$1;
        this.write = Size.Companion.m555getZeroNHjbRc();
        this.IconCompatParcelizer = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new LazyLayoutPagerKt$dragDirectionDetector$1(11, this)));
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void onCancelPointerInput() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 25;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer.onCancelPointerInput();
        int i4 = RatingCompat + 97;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public final void mo11onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        int i = 2 % 2;
        int i2 = RatingCompat + 119;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        pointerEvent.getClass();
        pointerEventPass.getClass();
        this.IconCompatParcelizer.mo11onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j);
        int i4 = MediaMetadataCompat + 7;
        RatingCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo7measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        int i = 2 % 2;
        measureScope.getClass();
        measurable.getClass();
        Placeable placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(j);
        long jM3856toSizeozmzZPI = IntSizeKt.m3856toSizeozmzZPI(IntSize.m3839constructorimpl((((long) placeableMo2209measureBRTryo0.getMeasuredHeight()) & 4294967295L) | (((long) placeableMo2209measureBRTryo0.getMeasuredWidth()) << 32)));
        this.write = jM3856toSizeozmzZPI;
        this.MediaDescriptionCompat.m5041setLayoutSizeuvyYCjk(jM3856toSizeozmzZPI);
        MeasureResult measureResultLayout$default = MeasureScope.layout$default(measureScope, placeableMo2209measureBRTryo0.getWidth(), placeableMo2209measureBRTryo0.getHeight(), null, new TncContentKt$$ExternalSyntheticLambda1(placeableMo2209measureBRTryo0, 13, this), 4, null);
        int i2 = MediaMetadataCompat + 43;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return measureResultLayout$default;
    }
}
