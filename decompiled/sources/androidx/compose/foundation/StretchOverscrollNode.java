package androidx.compose.foundation;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.math.MathKt;
import o.FocusOwner;
import o.LazyLayoutPinnedItemList;
import o.SelectionHandleIcon;
import o.onShowTranslationui;
import o.scrollToItem;

/* JADX INFO: loaded from: classes.dex */
public final class StretchOverscrollNode extends DelegatingNode implements DrawModifierNode {
    public final AndroidEdgeEffectOverscrollEffect IconCompatParcelizer;
    public final LazyLayoutPinnedItemList serializer;
    public RenderNode write;

    public StretchOverscrollNode(SuspendingPointerInputModifierNode suspendingPointerInputModifierNode, AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, LazyLayoutPinnedItemList lazyLayoutPinnedItemList) {
        this.IconCompatParcelizer = androidEdgeEffectOverscrollEffect;
        this.serializer = lazyLayoutPinnedItemList;
        delegate(suspendingPointerInputModifierNode);
    }

    public final RenderNode aW_() {
        RenderNode renderNode = this.write;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeBA_ = FocusOwner.bA_();
        this.write = renderNodeBA_;
        return renderNodeBA_;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(ContentDrawScope contentDrawScope) {
        boolean z;
        boolean zRemoteActionCompatParcelizer;
        float f;
        float fIconCompatParcelizer;
        long jMo1304getSizeNHjbRc = contentDrawScope.mo1304getSizeNHjbRc();
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = this.IconCompatParcelizer;
        androidEdgeEffectOverscrollEffect.m19updateSizeuvyYCjk$foundation(jMo1304getSizeNHjbRc);
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(contentDrawScope.getDrawContext().getCanvas());
        ((onShowTranslationui) androidEdgeEffectOverscrollEffect.MediaMetadataCompat).getValue();
        if (Size.m548isEmptyimpl(contentDrawScope.mo1304getSizeNHjbRc())) {
            contentDrawScope.drawContent();
            return;
        }
        boolean zIsHardwareAccelerated = nativeCanvas.isHardwareAccelerated();
        LazyLayoutPinnedItemList lazyLayoutPinnedItemList = this.serializer;
        if (!zIsHardwareAccelerated) {
            EdgeEffect edgeEffect = lazyLayoutPinnedItemList.MediaSessionCompatQueueItem;
            if (edgeEffect != null) {
                edgeEffect.finish();
            }
            EdgeEffect edgeEffect2 = lazyLayoutPinnedItemList.read;
            if (edgeEffect2 != null) {
                edgeEffect2.finish();
            }
            EdgeEffect edgeEffect3 = lazyLayoutPinnedItemList.write;
            if (edgeEffect3 != null) {
                edgeEffect3.finish();
            }
            EdgeEffect edgeEffect4 = lazyLayoutPinnedItemList.RatingCompat;
            if (edgeEffect4 != null) {
                edgeEffect4.finish();
            }
            EdgeEffect edgeEffect5 = lazyLayoutPinnedItemList.PlaybackStateCompatCustomAction;
            if (edgeEffect5 != null) {
                edgeEffect5.finish();
            }
            EdgeEffect edgeEffect6 = lazyLayoutPinnedItemList.IconCompatParcelizer;
            if (edgeEffect6 != null) {
                edgeEffect6.finish();
            }
            EdgeEffect edgeEffect7 = lazyLayoutPinnedItemList.MediaBrowserCompatMediaItem;
            if (edgeEffect7 != null) {
                edgeEffect7.finish();
            }
            EdgeEffect edgeEffect8 = lazyLayoutPinnedItemList.MediaDescriptionCompat;
            if (edgeEffect8 != null) {
                edgeEffect8.finish();
            }
            contentDrawScope.drawContent();
            return;
        }
        float fMo48toPx0680j_4 = contentDrawScope.mo48toPx0680j_4(ClipScrollableContainerKt.read);
        boolean z2 = LazyLayoutPinnedItemList.IconCompatParcelizer(lazyLayoutPinnedItemList.MediaSessionCompatQueueItem) || LazyLayoutPinnedItemList.write(lazyLayoutPinnedItemList.PlaybackStateCompatCustomAction) || LazyLayoutPinnedItemList.IconCompatParcelizer(lazyLayoutPinnedItemList.read) || LazyLayoutPinnedItemList.write(lazyLayoutPinnedItemList.IconCompatParcelizer);
        boolean z3 = LazyLayoutPinnedItemList.IconCompatParcelizer(lazyLayoutPinnedItemList.write) || LazyLayoutPinnedItemList.write(lazyLayoutPinnedItemList.MediaBrowserCompatMediaItem) || LazyLayoutPinnedItemList.IconCompatParcelizer(lazyLayoutPinnedItemList.RatingCompat) || LazyLayoutPinnedItemList.write(lazyLayoutPinnedItemList.MediaDescriptionCompat);
        if (z2 && z3) {
            aW_().setPosition(0, 0, nativeCanvas.getWidth(), nativeCanvas.getHeight());
        } else if (z2) {
            aW_().setPosition(0, 0, (MathKt.write(fMo48toPx0680j_4) * 2) + nativeCanvas.getWidth(), nativeCanvas.getHeight());
        } else if (z3) {
            aW_().setPosition(0, 0, nativeCanvas.getWidth(), (MathKt.write(fMo48toPx0680j_4) * 2) + nativeCanvas.getHeight());
        } else {
            contentDrawScope.drawContent();
            return;
        }
        RecordingCanvas recordingCanvasBeginRecording = aW_().beginRecording();
        if (LazyLayoutPinnedItemList.write(lazyLayoutPinnedItemList.MediaBrowserCompatMediaItem)) {
            EdgeEffect edgeEffectWrite = lazyLayoutPinnedItemList.MediaBrowserCompatMediaItem;
            if (edgeEffectWrite == null) {
                edgeEffectWrite = lazyLayoutPinnedItemList.write(SelectionHandleIcon.Horizontal);
                lazyLayoutPinnedItemList.MediaBrowserCompatMediaItem = edgeEffectWrite;
            }
            RemoteActionCompatParcelizer(90.0f, edgeEffectWrite, recordingCanvasBeginRecording);
            edgeEffectWrite.finish();
        }
        if (LazyLayoutPinnedItemList.IconCompatParcelizer(lazyLayoutPinnedItemList.write)) {
            EdgeEffect edgeEffectSerializer = lazyLayoutPinnedItemList.serializer();
            zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(270.0f, edgeEffectSerializer, recordingCanvasBeginRecording);
            if (LazyLayoutPinnedItemList.write(lazyLayoutPinnedItemList.write)) {
                z = z3;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (androidEdgeEffectOverscrollEffect.m14displacementF1C5BW0$foundation() & 4294967295L));
                EdgeEffect edgeEffectWrite2 = lazyLayoutPinnedItemList.MediaBrowserCompatMediaItem;
                if (edgeEffectWrite2 == null) {
                    edgeEffectWrite2 = lazyLayoutPinnedItemList.write(SelectionHandleIcon.Horizontal);
                    lazyLayoutPinnedItemList.MediaBrowserCompatMediaItem = edgeEffectWrite2;
                }
                int i = Build.VERSION.SDK_INT;
                float fIconCompatParcelizer2 = i >= 31 ? scrollToItem.IconCompatParcelizer(edgeEffectSerializer) : 0.0f;
                float f2 = 1.0f - fIntBitsToFloat;
                if (i >= 31) {
                    scrollToItem.RemoteActionCompatParcelizer(edgeEffectWrite2, fIconCompatParcelizer2, f2);
                } else {
                    edgeEffectWrite2.onPull(fIconCompatParcelizer2, f2);
                }
            } else {
                z = z3;
            }
        } else {
            z = z3;
            zRemoteActionCompatParcelizer = false;
        }
        if (LazyLayoutPinnedItemList.write(lazyLayoutPinnedItemList.PlaybackStateCompatCustomAction)) {
            EdgeEffect edgeEffectWrite3 = lazyLayoutPinnedItemList.PlaybackStateCompatCustomAction;
            if (edgeEffectWrite3 == null) {
                edgeEffectWrite3 = lazyLayoutPinnedItemList.write(SelectionHandleIcon.Vertical);
                lazyLayoutPinnedItemList.PlaybackStateCompatCustomAction = edgeEffectWrite3;
            }
            RemoteActionCompatParcelizer(180.0f, edgeEffectWrite3, recordingCanvasBeginRecording);
            edgeEffectWrite3.finish();
        }
        if (LazyLayoutPinnedItemList.IconCompatParcelizer(lazyLayoutPinnedItemList.MediaSessionCompatQueueItem)) {
            EdgeEffect edgeEffectRemoteActionCompatParcelizer = lazyLayoutPinnedItemList.RemoteActionCompatParcelizer();
            zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(0.0f, edgeEffectRemoteActionCompatParcelizer, recordingCanvasBeginRecording) || zRemoteActionCompatParcelizer;
            if (LazyLayoutPinnedItemList.write(lazyLayoutPinnedItemList.MediaSessionCompatQueueItem)) {
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (androidEdgeEffectOverscrollEffect.m14displacementF1C5BW0$foundation() >> 32));
                EdgeEffect edgeEffectWrite4 = lazyLayoutPinnedItemList.PlaybackStateCompatCustomAction;
                if (edgeEffectWrite4 == null) {
                    edgeEffectWrite4 = lazyLayoutPinnedItemList.write(SelectionHandleIcon.Vertical);
                    lazyLayoutPinnedItemList.PlaybackStateCompatCustomAction = edgeEffectWrite4;
                }
                int i2 = Build.VERSION.SDK_INT;
                float fIconCompatParcelizer3 = i2 >= 31 ? scrollToItem.IconCompatParcelizer(edgeEffectRemoteActionCompatParcelizer) : 0.0f;
                if (i2 >= 31) {
                    scrollToItem.RemoteActionCompatParcelizer(edgeEffectWrite4, fIconCompatParcelizer3, fIntBitsToFloat2);
                } else {
                    edgeEffectWrite4.onPull(fIconCompatParcelizer3, fIntBitsToFloat2);
                }
            }
        }
        if (LazyLayoutPinnedItemList.write(lazyLayoutPinnedItemList.MediaDescriptionCompat)) {
            EdgeEffect edgeEffectWrite5 = lazyLayoutPinnedItemList.MediaDescriptionCompat;
            if (edgeEffectWrite5 == null) {
                edgeEffectWrite5 = lazyLayoutPinnedItemList.write(SelectionHandleIcon.Horizontal);
                lazyLayoutPinnedItemList.MediaDescriptionCompat = edgeEffectWrite5;
            }
            RemoteActionCompatParcelizer(270.0f, edgeEffectWrite5, recordingCanvasBeginRecording);
            edgeEffectWrite5.finish();
        }
        if (LazyLayoutPinnedItemList.IconCompatParcelizer(lazyLayoutPinnedItemList.RatingCompat)) {
            EdgeEffect edgeEffect9 = lazyLayoutPinnedItemList.read();
            zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(90.0f, edgeEffect9, recordingCanvasBeginRecording) || zRemoteActionCompatParcelizer;
            if (LazyLayoutPinnedItemList.write(lazyLayoutPinnedItemList.RatingCompat)) {
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (androidEdgeEffectOverscrollEffect.m14displacementF1C5BW0$foundation() & 4294967295L));
                EdgeEffect edgeEffectWrite6 = lazyLayoutPinnedItemList.MediaDescriptionCompat;
                if (edgeEffectWrite6 == null) {
                    edgeEffectWrite6 = lazyLayoutPinnedItemList.write(SelectionHandleIcon.Horizontal);
                    lazyLayoutPinnedItemList.MediaDescriptionCompat = edgeEffectWrite6;
                }
                int i3 = Build.VERSION.SDK_INT;
                float fIconCompatParcelizer4 = i3 >= 31 ? scrollToItem.IconCompatParcelizer(edgeEffect9) : 0.0f;
                if (i3 >= 31) {
                    scrollToItem.RemoteActionCompatParcelizer(edgeEffectWrite6, fIconCompatParcelizer4, fIntBitsToFloat3);
                } else {
                    edgeEffectWrite6.onPull(fIconCompatParcelizer4, fIntBitsToFloat3);
                }
            }
        }
        if (LazyLayoutPinnedItemList.write(lazyLayoutPinnedItemList.IconCompatParcelizer)) {
            EdgeEffect edgeEffectWrite7 = lazyLayoutPinnedItemList.IconCompatParcelizer;
            if (edgeEffectWrite7 == null) {
                edgeEffectWrite7 = lazyLayoutPinnedItemList.write(SelectionHandleIcon.Vertical);
                lazyLayoutPinnedItemList.IconCompatParcelizer = edgeEffectWrite7;
            }
            RemoteActionCompatParcelizer(0.0f, edgeEffectWrite7, recordingCanvasBeginRecording);
            edgeEffectWrite7.finish();
        }
        if (LazyLayoutPinnedItemList.IconCompatParcelizer(lazyLayoutPinnedItemList.read)) {
            EdgeEffect edgeEffectWrite8 = lazyLayoutPinnedItemList.write();
            boolean z4 = RemoteActionCompatParcelizer(180.0f, edgeEffectWrite8, recordingCanvasBeginRecording) || zRemoteActionCompatParcelizer;
            if (LazyLayoutPinnedItemList.write(lazyLayoutPinnedItemList.read)) {
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (androidEdgeEffectOverscrollEffect.m14displacementF1C5BW0$foundation() >> 32));
                EdgeEffect edgeEffectWrite9 = lazyLayoutPinnedItemList.IconCompatParcelizer;
                if (edgeEffectWrite9 == null) {
                    edgeEffectWrite9 = lazyLayoutPinnedItemList.write(SelectionHandleIcon.Vertical);
                    lazyLayoutPinnedItemList.IconCompatParcelizer = edgeEffectWrite9;
                }
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 31) {
                    fIconCompatParcelizer = scrollToItem.IconCompatParcelizer(edgeEffectWrite8);
                    f = 1.0f;
                } else {
                    f = 1.0f;
                    fIconCompatParcelizer = 0.0f;
                }
                float f3 = f - fIntBitsToFloat4;
                if (i4 >= 31) {
                    scrollToItem.RemoteActionCompatParcelizer(edgeEffectWrite9, fIconCompatParcelizer, f3);
                } else {
                    edgeEffectWrite9.onPull(fIconCompatParcelizer, f3);
                }
            }
            zRemoteActionCompatParcelizer = z4;
        }
        if (zRemoteActionCompatParcelizer) {
            androidEdgeEffectOverscrollEffect.IconCompatParcelizer();
        }
        float f4 = z ? 0.0f : fMo48toPx0680j_4;
        if (z2) {
            fMo48toPx0680j_4 = 0.0f;
        }
        LayoutDirection layoutDirection = contentDrawScope.getLayoutDirection();
        androidx.compose.ui.graphics.Canvas Canvas = AndroidCanvas_androidKt.Canvas(recordingCanvasBeginRecording);
        long jMo1304getSizeNHjbRc2 = contentDrawScope.mo1304getSizeNHjbRc();
        Density density = contentDrawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = contentDrawScope.getDrawContext().getLayoutDirection();
        androidx.compose.ui.graphics.Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
        long jMo1225getSizeNHjbRc = contentDrawScope.getDrawContext().mo1225getSizeNHjbRc();
        GraphicsLayer graphicsLayer = contentDrawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = contentDrawScope.getDrawContext();
        drawContext.setDensity(contentDrawScope);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(Canvas);
        drawContext.mo1226setSizeuvyYCjk(jMo1304getSizeNHjbRc2);
        drawContext.setGraphicsLayer(null);
        Canvas.save();
        try {
            contentDrawScope.getDrawContext().getTransform().translate(f4, fMo48toPx0680j_4);
            try {
                contentDrawScope.drawContent();
                float f5 = -f4;
                float f6 = -fMo48toPx0680j_4;
                contentDrawScope.getDrawContext().getTransform().translate(f5, f6);
                Canvas.restore();
                DrawContext drawContext2 = contentDrawScope.getDrawContext();
                drawContext2.setDensity(density);
                drawContext2.setLayoutDirection(layoutDirection2);
                drawContext2.setCanvas(canvas);
                drawContext2.mo1226setSizeuvyYCjk(jMo1225getSizeNHjbRc);
                drawContext2.setGraphicsLayer(graphicsLayer);
                aW_().endRecording();
                int iSave = nativeCanvas.save();
                nativeCanvas.translate(f5, f6);
                nativeCanvas.drawRenderNode(aW_());
                nativeCanvas.restoreToCount(iSave);
            } catch (Throwable th) {
                contentDrawScope.getDrawContext().getTransform().translate(-f4, -fMo48toPx0680j_4);
                throw th;
            }
        } catch (Throwable th2) {
            Canvas.restore();
            DrawContext drawContext3 = contentDrawScope.getDrawContext();
            drawContext3.setDensity(density);
            drawContext3.setLayoutDirection(layoutDirection2);
            drawContext3.setCanvas(canvas);
            drawContext3.mo1226setSizeuvyYCjk(jMo1225getSizeNHjbRc);
            drawContext3.setGraphicsLayer(graphicsLayer);
            throw th2;
        }
    }

    public static boolean RemoteActionCompatParcelizer(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }
}
