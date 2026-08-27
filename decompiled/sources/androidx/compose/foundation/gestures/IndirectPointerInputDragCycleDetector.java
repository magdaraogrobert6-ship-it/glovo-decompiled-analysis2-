package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis;
import androidx.compose.ui.input.indirect.IndirectPointerInputChange;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.DrawableTransformation;
import o.MultiParagraphLayoutCache;
import o.ParagraphLayoutCache;
import o.SelectionHandleIcon;
import o.coerceMinLinesOh53vG4foundation;
import o.endStream;
import o.layoutWithConstraintsK40F9xA;
import o.markDirty;
import o.showTextContextMenu;
import o.textLayoutResultVKLhPVY;
import o.updateMenuItems;
import org.tukaani.xz.delta.DeltaDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class IndirectPointerInputDragCycleDetector {
    public endStream IconCompatParcelizer;
    public long MediaBrowserCompatMediaItem;
    public long MediaDescriptionCompat;
    public final DeltaDecoder MediaMetadataCompat;
    public TouchSlopDetector MediaSessionCompatQueueItem;
    public final DeltaDecoder ParcelableVolumeInfo;
    public VelocityTracker PlaybackStateCompat;
    public final DragGestureNode RatingCompat;
    public textLayoutResultVKLhPVY RemoteActionCompatParcelizer;
    public ParagraphLayoutCache read;
    public MultiParagraphLayoutCache serializer;
    public markDirty write;

    public IndirectPointerInputDragCycleDetector(DragGestureNode dragGestureNode) {
        this.RatingCompat = dragGestureNode;
        Offset.Companion companion = Offset.Companion;
        this.MediaDescriptionCompat = companion.m492getUnspecifiedF1C5BW0();
        DeltaDecoder deltaDecoder = new DeltaDecoder(2, (char) 0);
        deltaDecoder.serializer = new o.ContentInViewNode();
        this.ParcelableVolumeInfo = deltaDecoder;
        DeltaDecoder deltaDecoder2 = new DeltaDecoder(3, (char) 0);
        deltaDecoder2.serializer = new o.AnchoredDraggableNode();
        this.MediaMetadataCompat = deltaDecoder2;
        this.MediaBrowserCompatMediaItem = companion.m493getZeroF1C5BW0();
    }

    public static void serializer(IndirectPointerInputDragCycleDetector indirectPointerInputDragCycleDetector, IndirectPointerInputChange indirectPointerInputChange, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = Offset.Companion.m493getZeroF1C5BW0();
        }
        DragGestureNode dragGestureNode = indirectPointerInputDragCycleDetector.RatingCompat;
        ParagraphLayoutCache paragraphLayoutCache = indirectPointerInputDragCycleDetector.read;
        if (paragraphLayoutCache == null) {
            long jM2048constructorimpl = PointerId.m2048constructorimpl(Long.MAX_VALUE);
            paragraphLayoutCache = new ParagraphLayoutCache();
            paragraphLayoutCache.read = null;
            paragraphLayoutCache.RemoteActionCompatParcelizer = jM2048constructorimpl;
            paragraphLayoutCache.IconCompatParcelizer = false;
            indirectPointerInputDragCycleDetector.read = paragraphLayoutCache;
        }
        paragraphLayoutCache.read = indirectPointerInputChange;
        paragraphLayoutCache.RemoteActionCompatParcelizer = j;
        TouchSlopDetector touchSlopDetector = indirectPointerInputDragCycleDetector.MediaSessionCompatQueueItem;
        SelectionHandleIcon selectionHandleIcon = dragGestureNode.ResultReceiver;
        if (touchSlopDetector == null) {
            indirectPointerInputDragCycleDetector.MediaSessionCompatQueueItem = new TouchSlopDetector(selectionHandleIcon);
        } else {
            touchSlopDetector.serializer = selectionHandleIcon;
            touchSlopDetector.RemoteActionCompatParcelizer = j2;
        }
        paragraphLayoutCache.IconCompatParcelizer = false;
        indirectPointerInputDragCycleDetector.IconCompatParcelizer = paragraphLayoutCache;
    }

    /* JADX INFO: renamed from: sendDragEvent-Eu1f8Dk, reason: not valid java name */
    public final void m37sendDragEventEu1f8Dk(IndirectPointerInputChange indirectPointerInputChange, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis, long j) {
        DragGestureNode dragGestureNode = this.RatingCompat;
        long jPositionOnScreen = LayoutCoordinatesKt.positionOnScreen(DelegatableNodeKt.requireLayoutCoordinates(dragGestureNode));
        if (!Offset.m474equalsimpl0(this.MediaDescriptionCompat, Offset.Companion.m492getUnspecifiedF1C5BW0()) && !Offset.m474equalsimpl0(jPositionOnScreen, this.MediaDescriptionCompat)) {
            this.MediaBrowserCompatMediaItem = Offset.m482plusMKHz9U(this.MediaBrowserCompatMediaItem, Offset.m481minusMKHz9U(jPositionOnScreen, this.MediaDescriptionCompat));
        }
        this.MediaDescriptionCompat = jPositionOnScreen;
        SelectionHandleIcon selectionHandleIcon = dragGestureNode.ResultReceiver;
        selectionHandleIcon.getClass();
        DraggableKt$NoOpOnDragStarted$1 draggableKt$NoOpOnDragStarted$1 = coerceMinLinesOh53vG4foundation.IconCompatParcelizer;
        if (Math.abs(Float.intBitsToFloat((int) (selectionHandleIcon == SelectionHandleIcon.Vertical ? j & 4294967295L : j >> 32))) > 2.0f) {
            IndirectPointerInputDragCycleDetectorKt.m38access$addIndirectPointerInputChangeQf4Zb88(write(), indirectPointerInputChange, dragGestureNode.ResultReceiver, indirectPointerEventPrimaryDirectionalMotionAxis, this.ParcelableVolumeInfo, this.MediaBrowserCompatMediaItem);
            DeltaDecoder deltaDecoder = this.MediaMetadataCompat;
            o.AnchoredDraggableNode anchoredDraggableNode = (o.AnchoredDraggableNode) deltaDecoder.serializer;
            int i = anchoredDraggableNode.RemoteActionCompatParcelizer;
            if (i == 3) {
                int i2 = deltaDecoder.write;
                deltaDecoder.write = i2 + 1;
                if (i2 >= 0 && i2 < i) {
                    long[] jArr = anchoredDraggableNode.serializer;
                    long j2 = jArr[i2];
                    jArr[i2] = j;
                } else {
                    DrawableTransformation.read("Index must be between 0 and size");
                    return;
                }
            } else {
                anchoredDraggableNode.RemoteActionCompatParcelizer(j);
            }
            if (deltaDecoder.write == 3) {
                deltaDecoder.write = 0;
            }
            long[] jArr2 = anchoredDraggableNode.serializer;
            int i3 = anchoredDraggableNode.RemoteActionCompatParcelizer;
            float fIntBitsToFloat = 0.0f;
            float fIntBitsToFloat2 = 0.0f;
            for (int i4 = 0; i4 < i3; i4++) {
                fIntBitsToFloat2 += Float.intBitsToFloat((int) (Offset.m469constructorimpl(jArr2[i4]) >> 32));
            }
            int i5 = anchoredDraggableNode.RemoteActionCompatParcelizer;
            float f = fIntBitsToFloat2 / i5;
            long[] jArr3 = anchoredDraggableNode.serializer;
            for (int i6 = 0; i6 < i5; i6++) {
                fIntBitsToFloat += Float.intBitsToFloat((int) (Offset.m469constructorimpl(jArr3[i6]) & 4294967295L));
            }
            dragGestureNode.serializer(new showTextContextMenu(Offset.m469constructorimpl((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat / anchoredDraggableNode.RemoteActionCompatParcelizer)) & 4294967295L)), true));
        }
    }

    public final void IconCompatParcelizer(IndirectPointerInputChange indirectPointerInputChange, IndirectPointerInputChange indirectPointerInputChange2, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis, long j) {
        if (this.PlaybackStateCompat == null) {
            this.PlaybackStateCompat = new VelocityTracker();
        }
        this.MediaBrowserCompatMediaItem = Offset.Companion.m493getZeroF1C5BW0();
        VelocityTracker velocityTrackerWrite = write();
        DragGestureNode dragGestureNode = this.RatingCompat;
        IndirectPointerInputDragCycleDetectorKt.m38access$addIndirectPointerInputChangeQf4Zb88(velocityTrackerWrite, indirectPointerInputChange, dragGestureNode.ResultReceiver, indirectPointerEventPrimaryDirectionalMotionAxis, this.ParcelableVolumeInfo, this.MediaBrowserCompatMediaItem);
        long jM481minusMKHz9U = Offset.m481minusMKHz9U(IndirectPointerInputDragCycleDetectorKt.m40primaryAxisPosition_bfSUIo(indirectPointerInputChange2, dragGestureNode.ResultReceiver, indirectPointerEventPrimaryDirectionalMotionAxis), j);
        if (((Boolean) dragGestureNode.MediaMetadataCompat.invoke(PointerType.m2143boximpl(PointerType.Companion.m2153getTouchT8wyACA()))).booleanValue()) {
            this.MediaDescriptionCompat = LayoutCoordinatesKt.positionOnScreen(DelegatableNodeKt.requireLayoutCoordinates(dragGestureNode));
            dragGestureNode.serializer(new updateMenuItems(jM481minusMKHz9U));
        }
        DeltaDecoder deltaDecoder = this.MediaMetadataCompat;
        deltaDecoder.write = 0;
        ((o.AnchoredDraggableNode) deltaDecoder.serializer).RemoteActionCompatParcelizer = 0;
    }

    public final void serializer() {
        textLayoutResultVKLhPVY textlayoutresultvklhpvy = this.RemoteActionCompatParcelizer;
        if (textlayoutresultvklhpvy == null) {
            layoutWithConstraintsK40F9xA layoutwithconstraintsk40f9xa = layoutWithConstraintsK40F9xA.NotInitialized;
            textLayoutResultVKLhPVY textlayoutresultvklhpvy2 = new textLayoutResultVKLhPVY();
            textlayoutresultvklhpvy2.read = layoutwithconstraintsk40f9xa;
            textlayoutresultvklhpvy2.IconCompatParcelizer = false;
            this.RemoteActionCompatParcelizer = textlayoutresultvklhpvy2;
            textlayoutresultvklhpvy = textlayoutresultvklhpvy2;
        }
        textlayoutresultvklhpvy.read = layoutWithConstraintsK40F9xA.NotInitialized;
        textlayoutresultvklhpvy.IconCompatParcelizer = false;
        this.IconCompatParcelizer = textlayoutresultvklhpvy;
    }

    public final VelocityTracker write() {
        VelocityTracker velocityTracker = this.PlaybackStateCompat;
        if (velocityTracker != null) {
            return velocityTracker;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Velocity Tracker not initialized.");
        return null;
    }

    public final void write(IndirectPointerInputChange indirectPointerInputChange, long j, TouchSlopDetector touchSlopDetector) {
        markDirty markdirty = this.write;
        if (markdirty == null) {
            long jM2048constructorimpl = PointerId.m2048constructorimpl(Long.MAX_VALUE);
            markDirty markdirty2 = new markDirty();
            markdirty2.read = null;
            markdirty2.write = jM2048constructorimpl;
            this.write = markdirty2;
            markdirty = markdirty2;
        }
        markdirty.read = indirectPointerInputChange;
        markdirty.write = j;
        TouchSlopDetector.RemoteActionCompatParcelizer(touchSlopDetector);
        this.IconCompatParcelizer = markdirty;
    }
}
