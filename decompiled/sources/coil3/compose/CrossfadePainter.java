package coil3.compose;

import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ScaleFactorKt;
import kotlin.ranges.RangesKt;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.BrazeInAppMessageManagerhideCurrentlyDisplayingInAppMessage1;
import o.DefaultInAppMessageViewWrapper;
import o.getPlatformAndroidManager;
import o.onHideTranslationui;
import o.unregisterInAppMessageManager;

/* JADX INFO: loaded from: classes.dex */
public final class CrossfadePainter extends Painter {
    public ColorFilter IconCompatParcelizer;
    public boolean MediaDescriptionCompat;
    public final long MediaMetadataCompat;
    public DefaultInAppMessageViewWrapper PlaybackStateCompat;
    public Painter RatingCompat;
    public final boolean RemoteActionCompatParcelizer;
    public final long read;
    public final Painter serializer;
    public final ContentScale write;
    public final BrazeInAppMessageManagerhideCurrentlyDisplayingInAppMessage1 PlaybackStateCompatCustomAction = unregisterInAppMessageManager.IconCompatParcelizer;
    public final getPlatformAndroidManager MediaBrowserCompatMediaItem = CompositionKt.read(0);
    public float MediaSessionCompatQueueItem = 1.0f;

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyAlpha(float f) {
        this.MediaSessionCompatQueueItem = f;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyColorFilter(ColorFilter colorFilter) {
        this.IconCompatParcelizer = colorFilter;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo1424getIntrinsicSizeNHjbRc() {
        return this.MediaMetadataCompat;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void onDraw(DrawScope drawScope) {
        boolean z = this.MediaDescriptionCompat;
        Painter painter = this.serializer;
        if (z) {
            drawPainter(drawScope, painter, this.MediaSessionCompatQueueItem);
            return;
        }
        DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapperIconCompatParcelizer = this.PlaybackStateCompat;
        if (defaultInAppMessageViewWrapperIconCompatParcelizer == null) {
            defaultInAppMessageViewWrapperIconCompatParcelizer = this.PlaybackStateCompatCustomAction.IconCompatParcelizer();
            this.PlaybackStateCompat = defaultInAppMessageViewWrapperIconCompatParcelizer;
        }
        float fWrite = BrazeInAppMessageManagerExternalSyntheticLambda2.write(DefaultInAppMessageViewWrapper.serializer(defaultInAppMessageViewWrapperIconCompatParcelizer.RemoteActionCompatParcelizer)) / BrazeInAppMessageManagerExternalSyntheticLambda2.write(this.read);
        float fWrite2 = RangesKt.write(fWrite, 0.0f, 1.0f);
        float f = this.MediaSessionCompatQueueItem;
        float f2 = fWrite2 * f;
        if (this.RemoteActionCompatParcelizer) {
            f -= f2;
        }
        this.MediaDescriptionCompat = fWrite >= 1.0f;
        drawPainter(drawScope, this.RatingCompat, f);
        drawPainter(drawScope, painter, f2);
        if (this.MediaDescriptionCompat) {
            this.RatingCompat = null;
        } else {
            onHideTranslationui onhidetranslationui = (onHideTranslationui) this.MediaBrowserCompatMediaItem;
            onhidetranslationui.serializer(onhidetranslationui.serializer() + 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    /* JADX WARN: Code duplicated, block: B:24:0x0091  */
    public CrossfadePainter(Painter painter, Painter painter2, ContentScale contentScale, long j, boolean z, boolean z2) {
        this.serializer = painter2;
        this.write = contentScale;
        this.read = j;
        this.RemoteActionCompatParcelizer = z;
        this.RatingCompat = painter;
        long jMo1424getIntrinsicSizeNHjbRc = painter != null ? painter.mo1424getIntrinsicSizeNHjbRc() : Size.Companion.m555getZeroNHjbRc();
        long jMo1424getIntrinsicSizeNHjbRc2 = painter2 != null ? painter2.mo1424getIntrinsicSizeNHjbRc() : Size.Companion.m555getZeroNHjbRc();
        boolean z3 = jMo1424getIntrinsicSizeNHjbRc != InlineClassHelperKt.UnspecifiedPackedFloats;
        boolean z4 = jMo1424getIntrinsicSizeNHjbRc2 != InlineClassHelperKt.UnspecifiedPackedFloats;
        if (z2) {
            if (z4) {
                jMo1424getIntrinsicSizeNHjbRc = jMo1424getIntrinsicSizeNHjbRc2;
            } else if (!z3) {
                if (z3) {
                    jMo1424getIntrinsicSizeNHjbRc = Size.Companion.m554getUnspecifiedNHjbRc();
                } else {
                    jMo1424getIntrinsicSizeNHjbRc = Size.Companion.m554getUnspecifiedNHjbRc();
                }
            }
        } else if (z3 || !z4) {
            jMo1424getIntrinsicSizeNHjbRc = Size.Companion.m554getUnspecifiedNHjbRc();
        } else {
            jMo1424getIntrinsicSizeNHjbRc = Size.m537constructorimpl((((long) Float.floatToRawIntBits(Math.max(Float.intBitsToFloat((int) (jMo1424getIntrinsicSizeNHjbRc & 4294967295L)), Float.intBitsToFloat((int) (jMo1424getIntrinsicSizeNHjbRc2 & 4294967295L))))) & 4294967295L) | (((long) Float.floatToRawIntBits(Math.max(Float.intBitsToFloat((int) (jMo1424getIntrinsicSizeNHjbRc >> 32)), Float.intBitsToFloat((int) (jMo1424getIntrinsicSizeNHjbRc2 >> 32))))) << 32));
        }
        this.MediaMetadataCompat = jMo1424getIntrinsicSizeNHjbRc;
    }

    public final void drawPainter(DrawScope drawScope, Painter painter, float f) {
        if (painter == null || f <= 0.0f) {
            return;
        }
        long jMo1304getSizeNHjbRc = drawScope.mo1304getSizeNHjbRc();
        long jMo1424getIntrinsicSizeNHjbRc = painter.mo1424getIntrinsicSizeNHjbRc();
        long jM2345timesUQTWf7w = (jMo1424getIntrinsicSizeNHjbRc == InlineClassHelperKt.UnspecifiedPackedFloats || Size.m548isEmptyimpl(jMo1424getIntrinsicSizeNHjbRc) || jMo1304getSizeNHjbRc == InlineClassHelperKt.UnspecifiedPackedFloats || Size.m548isEmptyimpl(jMo1304getSizeNHjbRc)) ? jMo1304getSizeNHjbRc : ScaleFactorKt.m2345timesUQTWf7w(jMo1424getIntrinsicSizeNHjbRc, this.write.mo2202computeScaleFactorH7hwNQA(jMo1424getIntrinsicSizeNHjbRc, jMo1304getSizeNHjbRc));
        if (jMo1304getSizeNHjbRc == InlineClassHelperKt.UnspecifiedPackedFloats || Size.m548isEmptyimpl(jMo1304getSizeNHjbRc)) {
            painter.m1430drawx_KDEd0(drawScope, jM2345timesUQTWf7w, f, this.IconCompatParcelizer);
            return;
        }
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (jMo1304getSizeNHjbRc >> 32)) - Float.intBitsToFloat((int) (jM2345timesUQTWf7w >> 32))) / 2.0f;
        float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (jMo1304getSizeNHjbRc & 4294967295L)) - Float.intBitsToFloat((int) (4294967295L & jM2345timesUQTWf7w))) / 2.0f;
        drawScope.getDrawContext().getTransform().inset(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat, fIntBitsToFloat2);
        try {
            painter.m1430drawx_KDEd0(drawScope, jM2345timesUQTWf7w, f, this.IconCompatParcelizer);
        } finally {
            float f2 = -fIntBitsToFloat;
            float f3 = -fIntBitsToFloat2;
            drawScope.getDrawContext().getTransform().inset(f2, f3, f2, f3);
        }
    }
}
