package androidx.compose.foundation;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import kotlin.math.MathKt;
import o.LazyLayoutPinnedItemList;
import o.SwitchKt;
import o.onShowTranslationui;

/* JADX INFO: loaded from: classes.dex */
public final class GlowOverscrollNode extends DelegatingNode implements DrawModifierNode {
    public final SwitchKt IconCompatParcelizer;
    public final LazyLayoutPinnedItemList read;
    public final AndroidEdgeEffectOverscrollEffect write;

    public GlowOverscrollNode(SuspendingPointerInputModifierNode suspendingPointerInputModifierNode, AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, LazyLayoutPinnedItemList lazyLayoutPinnedItemList, SwitchKt switchKt) {
        this.write = androidEdgeEffectOverscrollEffect;
        this.read = lazyLayoutPinnedItemList;
        this.IconCompatParcelizer = switchKt;
        delegate(suspendingPointerInputModifierNode);
    }

    /* JADX INFO: renamed from: drawWithRotationAndOffset-ubNVwUQ, reason: not valid java name */
    public static boolean m23drawWithRotationAndOffsetubNVwUQ(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(ContentDrawScope contentDrawScope) {
        boolean zM23drawWithRotationAndOffsetubNVwUQ;
        long jMo1304getSizeNHjbRc = contentDrawScope.mo1304getSizeNHjbRc();
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = this.write;
        androidEdgeEffectOverscrollEffect.m19updateSizeuvyYCjk$foundation(jMo1304getSizeNHjbRc);
        if (Size.m548isEmptyimpl(contentDrawScope.mo1304getSizeNHjbRc())) {
            contentDrawScope.drawContent();
            return;
        }
        contentDrawScope.drawContent();
        ((onShowTranslationui) androidEdgeEffectOverscrollEffect.MediaMetadataCompat).getValue();
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(contentDrawScope.getDrawContext().getCanvas());
        LazyLayoutPinnedItemList lazyLayoutPinnedItemList = this.read;
        boolean zIconCompatParcelizer = LazyLayoutPinnedItemList.IconCompatParcelizer(lazyLayoutPinnedItemList.write);
        SwitchKt switchKt = this.IconCompatParcelizer;
        boolean z = false;
        if (zIconCompatParcelizer) {
            zM23drawWithRotationAndOffsetubNVwUQ = m23drawWithRotationAndOffsetubNVwUQ(270.0f, Offset.m469constructorimpl((((long) Float.floatToRawIntBits(contentDrawScope.mo48toPx0680j_4(switchKt.read(contentDrawScope.getLayoutDirection())))) & 4294967295L) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (contentDrawScope.mo1304getSizeNHjbRc() & 4294967295L)))) << 32)), lazyLayoutPinnedItemList.serializer(), nativeCanvas);
        } else {
            zM23drawWithRotationAndOffsetubNVwUQ = false;
        }
        if (LazyLayoutPinnedItemList.IconCompatParcelizer(lazyLayoutPinnedItemList.MediaSessionCompatQueueItem)) {
            zM23drawWithRotationAndOffsetubNVwUQ = m23drawWithRotationAndOffsetubNVwUQ(0.0f, Offset.m469constructorimpl((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(contentDrawScope.mo48toPx0680j_4(switchKt.IconCompatParcelizer()))) & 4294967295L)), lazyLayoutPinnedItemList.RemoteActionCompatParcelizer(), nativeCanvas) || zM23drawWithRotationAndOffsetubNVwUQ;
        }
        if (LazyLayoutPinnedItemList.IconCompatParcelizer(lazyLayoutPinnedItemList.RatingCompat)) {
            if (m23drawWithRotationAndOffsetubNVwUQ(90.0f, Offset.m469constructorimpl((((long) Float.floatToRawIntBits(contentDrawScope.mo48toPx0680j_4(switchKt.write(contentDrawScope.getLayoutDirection())) + (-MathKt.write(Float.intBitsToFloat((int) (contentDrawScope.mo1304getSizeNHjbRc() >> 32)))))) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32)), lazyLayoutPinnedItemList.read(), nativeCanvas) || zM23drawWithRotationAndOffsetubNVwUQ) {
                z = true;
            }
        } else {
            z = zM23drawWithRotationAndOffsetubNVwUQ;
        }
        if (LazyLayoutPinnedItemList.IconCompatParcelizer(lazyLayoutPinnedItemList.read)) {
            if (!m23drawWithRotationAndOffsetubNVwUQ(180.0f, Offset.m469constructorimpl((((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (contentDrawScope.mo1304getSizeNHjbRc() & 4294967295L))) + contentDrawScope.mo48toPx0680j_4(switchKt.RemoteActionCompatParcelizer()))) & 4294967295L) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (contentDrawScope.mo1304getSizeNHjbRc() >> 32)))) << 32)), lazyLayoutPinnedItemList.write(), nativeCanvas) && !z) {
                return;
            }
        } else if (!z) {
            return;
        }
        androidEdgeEffectOverscrollEffect.IconCompatParcelizer();
    }
}
