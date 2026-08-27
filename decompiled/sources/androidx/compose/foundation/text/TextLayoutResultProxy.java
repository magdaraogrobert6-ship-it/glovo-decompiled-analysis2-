package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;

/* JADX INFO: loaded from: classes.dex */
public final class TextLayoutResultProxy {
    public final TextLayoutResult RemoteActionCompatParcelizer;
    public LayoutCoordinates serializer = null;
    public LayoutCoordinates write;

    public final int IconCompatParcelizer(long j, boolean z) {
        if (z) {
            j = m101coercedInVisibleBoundsOfInputTextMKHz9U(j);
        }
        return this.RemoteActionCompatParcelizer.m3046getOffsetForPositionk4lQ0M(IconCompatParcelizer(j));
    }

    public TextLayoutResultProxy(TextLayoutResult textLayoutResult, LayoutCoordinates layoutCoordinates) {
        this.RemoteActionCompatParcelizer = textLayoutResult;
        this.write = layoutCoordinates;
    }

    public final long IconCompatParcelizer(long j) {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2 = this.serializer;
        if (layoutCoordinates2 == null) {
            return j;
        }
        if (!layoutCoordinates2.isAttached()) {
            layoutCoordinates2 = null;
        }
        if (layoutCoordinates2 == null || (layoutCoordinates = this.write) == null) {
            return j;
        }
        LayoutCoordinates layoutCoordinates3 = layoutCoordinates.isAttached() ? layoutCoordinates : null;
        return layoutCoordinates3 == null ? j : layoutCoordinates2.mo2218localPositionOfR5De75A(layoutCoordinates3, j);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    /* JADX INFO: renamed from: coercedInVisibleBoundsOfInputText-MK-Hz9U, reason: not valid java name */
    public final long m101coercedInVisibleBoundsOfInputTextMKHz9U(long j) {
        Rect zero;
        float right;
        float bottom;
        LayoutCoordinates layoutCoordinates = this.serializer;
        if (layoutCoordinates == null) {
            zero = Rect.Companion.getZero();
        } else {
            if (layoutCoordinates.isAttached()) {
                LayoutCoordinates layoutCoordinates2 = this.write;
                zero = null;
                if (layoutCoordinates2 != null) {
                    zero = LayoutCoordinates.localBoundingBoxOf$default(layoutCoordinates2, layoutCoordinates, false, 2, null);
                }
            } else {
                zero = Rect.Companion.getZero();
            }
            if (zero == null) {
                zero = Rect.Companion.getZero();
            }
        }
        int i = (int) (j >> 32);
        if (Float.intBitsToFloat(i) < zero.getLeft()) {
            right = zero.getLeft();
        } else {
            right = Float.intBitsToFloat(i) > zero.getRight() ? zero.getRight() : Float.intBitsToFloat(i);
        }
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i2) < zero.getTop()) {
            bottom = zero.getTop();
        } else {
            bottom = Float.intBitsToFloat(i2) > zero.getBottom() ? zero.getBottom() : Float.intBitsToFloat(i2);
        }
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(bottom)) & 4294967295L) | (((long) Float.floatToRawIntBits(right)) << 32));
    }

    /* JADX INFO: renamed from: isPositionOnText-k-4lQ0M, reason: not valid java name */
    public final boolean m102isPositionOnTextk4lQ0M(long j) {
        long jIconCompatParcelizer = IconCompatParcelizer(m101coercedInVisibleBoundsOfInputTextMKHz9U(j));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jIconCompatParcelizer));
        TextLayoutResult textLayoutResult = this.RemoteActionCompatParcelizer;
        int lineForVerticalPosition = textLayoutResult.getLineForVerticalPosition(fIntBitsToFloat);
        int i = (int) (jIconCompatParcelizer >> 32);
        return Float.intBitsToFloat(i) >= textLayoutResult.getLineLeft(lineForVerticalPosition) && Float.intBitsToFloat(i) <= textLayoutResult.getLineRight(lineForVerticalPosition);
    }

    public final long read(long j) {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2 = this.serializer;
        if (layoutCoordinates2 == null) {
            return j;
        }
        if (!layoutCoordinates2.isAttached()) {
            layoutCoordinates2 = null;
        }
        if (layoutCoordinates2 == null || (layoutCoordinates = this.write) == null) {
            return j;
        }
        LayoutCoordinates layoutCoordinates3 = layoutCoordinates.isAttached() ? layoutCoordinates : null;
        return layoutCoordinates3 == null ? j : layoutCoordinates3.mo2218localPositionOfR5De75A(layoutCoordinates2, j);
    }
}
