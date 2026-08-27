package androidx.compose.ui.spatial;

import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.sqlite.SQLite;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.BaseContentCardViewExternalSyntheticLambda0;
import o.getCieXyz;
import o.getQueryParameterslambda2;
import o.instance_delegatelambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class RelativeLayoutBounds {
    public static final int $stable = 8;
    private final long bottomRight;
    private final DelegatableNode node;
    private final long screenOffset;
    private final long topLeft;
    private final float[] viewToWindowMatrix;
    private final long windowOffset;
    private final long windowSize;

    public final List<IntRect> calculateOcclusions() {
        int i;
        int i2;
        RectManager rectManager = DelegatableNodeKt.requireOwner(this.node).getRectManager();
        int semanticsId = DelegatableNodeKt.requireLayoutNode(this.node).getSemanticsId();
        RectList rects = rectManager.getRects();
        int iIndexOf = rects.indexOf(semanticsId);
        if (iIndexOf < 0) {
            return instance_delegatelambda0.write;
        }
        int i3 = 0;
        int iSerializer = getQueryParameterslambda2.serializer();
        BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0 = (BaseContentCardViewExternalSyntheticLambda0) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -1169780863, new Object[0], getQueryParameterslambda2.serializer(), 1169780871, iSerializer);
        long[] jArr = rects.items;
        int i4 = rects.itemsSize;
        long j = jArr[iIndexOf];
        long j2 = jArr[iIndexOf + 1];
        while (i3 < jArr.length - 2 && i3 < i4) {
            if (i3 == iIndexOf) {
                i3 += 3;
            } else {
                long j3 = jArr[i3];
                long j4 = jArr[i3 + 1];
                if (((((j2 - j3) - InlineClassHelperKt.Uint64Low32) | ((j4 - j) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                    i = i4;
                    i2 = iIndexOf;
                    int i5 = (int) (j3 >> 32);
                    int i6 = (int) j3;
                    int i7 = (int) (j4 >> 32);
                    int i8 = (int) j4;
                    if (rectManager.isTargetDrawnFirst$ui(semanticsId, ((int) jArr[i3 + 2]) & 33554431)) {
                        baseContentCardViewExternalSyntheticLambda0.add(new IntRect(i5, i6, i7, i8));
                    }
                } else {
                    i = i4;
                    i2 = iIndexOf;
                }
                i3 += 3;
                iIndexOf = i2;
                i4 = i;
            }
        }
        return SQLite.serializer((List) baseContentCardViewExternalSyntheticLambda0);
    }

    public final float fractionVisibleIn(RelativeLayoutBounds relativeLayoutBounds) {
        long j = relativeLayoutBounds.topLeft;
        long j2 = relativeLayoutBounds.bottomRight;
        return fractionVisibleInRect((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2);
    }

    /* JADX INFO: renamed from: fractionVisibleInWindowWithInsets-E1MhUcY, reason: not valid java name */
    public final float m2845fractionVisibleInWindowWithInsetsE1MhUcY(long j, long j2) {
        long j3 = this.windowSize;
        int iM3801getXimpl = IntOffset.m3801getXimpl(this.windowOffset);
        int iM3802getYimpl = IntOffset.m3802getYimpl(this.windowOffset);
        int i = (int) (j3 >> 32);
        return fractionVisibleInRect(IntOffset.m3801getXimpl(j) + iM3801getXimpl, IntOffset.m3802getYimpl(j) + iM3802getYimpl, (iM3801getXimpl + i) - IntOffset.m3801getXimpl(j2), (iM3802getYimpl + ((int) j3)) - IntOffset.m3802getYimpl(j2));
    }

    /* JADX INFO: renamed from: getPositionInRoot-nOcc-ac, reason: not valid java name */
    public final long m2846getPositionInRootnOccac() {
        return IntOffset.m3795constructorimpl(this.topLeft);
    }

    /* JADX INFO: renamed from: getPositionInScreen-nOcc-ac, reason: not valid java name */
    public final long m2847getPositionInScreennOccac() {
        int iM3801getXimpl = IntOffset.m3801getXimpl(this.screenOffset);
        int iM3802getYimpl = IntOffset.m3802getYimpl(this.screenOffset);
        long j = this.topLeft;
        return IntOffset.m3795constructorimpl((((long) (((int) j) + iM3802getYimpl)) & 4294967295L) | ((((int) (j >> 32)) + iM3801getXimpl) << 32));
    }

    /* JADX INFO: renamed from: getPositionInWindow-nOcc-ac, reason: not valid java name */
    public final long m2848getPositionInWindownOccac() {
        int iM3801getXimpl = IntOffset.m3801getXimpl(this.screenOffset);
        int iM3801getXimpl2 = IntOffset.m3801getXimpl(this.windowOffset);
        int iM3802getYimpl = IntOffset.m3802getYimpl(this.screenOffset);
        int iM3802getYimpl2 = IntOffset.m3802getYimpl(this.windowOffset);
        long j = this.topLeft;
        return IntOffset.m3795constructorimpl((((long) (((int) (j >> 32)) + (iM3801getXimpl - iM3801getXimpl2))) << 32) | (((long) (((int) j) + (iM3802getYimpl - iM3802getYimpl2))) & 4294967295L));
    }

    public int hashCode() {
        int iM = d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(Long.hashCode(this.topLeft) * 31, 31, this.bottomRight), 31, this.windowSize);
        int iM3803hashCodeimpl = IntOffset.m3803hashCodeimpl(this.windowOffset);
        int iM3803hashCodeimpl2 = IntOffset.m3803hashCodeimpl(this.screenOffset);
        float[] fArr = this.viewToWindowMatrix;
        return this.node.hashCode() + ((((iM3803hashCodeimpl2 + ((iM3803hashCodeimpl + iM) * 31)) * 31) + (fArr != null ? Matrix.m973hashCodeimpl(fArr) : 0)) * 31);
    }

    private RelativeLayoutBounds(long j, long j2, long j3, long j4, long j5, float[] fArr, DelegatableNode delegatableNode) {
        this.topLeft = j;
        this.bottomRight = j2;
        this.windowOffset = j3;
        this.screenOffset = j4;
        this.windowSize = j5;
        this.viewToWindowMatrix = fArr;
        this.node = delegatableNode;
    }

    public final int getHeight() {
        return ((int) this.bottomRight) - ((int) this.topLeft);
    }

    public final IntRect getBoundsInScreen() {
        if (this.viewToWindowMatrix == null) {
            long j = this.topLeft;
            int i = (int) (j >> 32);
            long j2 = this.bottomRight;
            int i2 = (int) (j2 >> 32);
            int i3 = (int) j2;
            int iM3801getXimpl = IntOffset.m3801getXimpl(this.screenOffset);
            int iM3802getYimpl = IntOffset.m3802getYimpl(this.screenOffset);
            return new IntRect(i + iM3801getXimpl, ((int) j) + iM3802getYimpl, i2 + iM3801getXimpl, i3 + iM3802getYimpl);
        }
        IntRect boundsInWindow = getBoundsInWindow();
        long j3 = this.windowOffset;
        int left = boundsInWindow.getLeft();
        int iM3801getXimpl2 = IntOffset.m3801getXimpl(j3);
        int top = boundsInWindow.getTop();
        int iM3802getYimpl2 = IntOffset.m3802getYimpl(j3);
        int right = boundsInWindow.getRight();
        return new IntRect(iM3801getXimpl2 + left, iM3802getYimpl2 + top, IntOffset.m3801getXimpl(j3) + right, IntOffset.m3802getYimpl(j3) + boundsInWindow.getBottom());
    }

    public final float fractionVisibleInRect(int i, int i2, int i3, int i4) {
        int i5 = (int) (this.topLeft >> 32);
        int iMin = Math.min(Math.max(i5, i), i3);
        int i6 = (int) this.topLeft;
        int iMin2 = Math.min(Math.max(i6, i2), i4);
        int i7 = (int) (this.bottomRight >> 32);
        int iMax = Math.max(Math.min(i7, i3), i);
        int i8 = (int) this.bottomRight;
        return Math.max((Math.max(Math.min(i8, i4), i2) - iMin2) * (iMax - iMin), 0) / Math.min((i4 - i2) * (i3 - i), (i8 - i6) * (i7 - i5));
    }

    public final int getWidth() {
        return ((int) (this.bottomRight >> 32)) - ((int) (this.topLeft >> 32));
    }

    public final IntRect getBoundsInRoot() {
        long j = this.topLeft;
        long j2 = this.bottomRight;
        return new IntRect((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2);
    }

    public final IntRect getBoundsInWindow() {
        long j = this.topLeft;
        int i = (int) (j >> 32);
        int i2 = (int) j;
        long j2 = this.bottomRight;
        int i3 = (int) (j2 >> 32);
        int i4 = (int) j2;
        float[] fArr = this.viewToWindowMatrix;
        if (fArr != null) {
            return IntRectKt.roundToIntRect(Matrix.m976mapimpl(fArr, new Rect(i, i2, i3, i4)));
        }
        int iM3801getXimpl = IntOffset.m3801getXimpl(this.screenOffset) - IntOffset.m3801getXimpl(this.windowOffset);
        int iM3802getYimpl = IntOffset.m3802getYimpl(this.screenOffset) - IntOffset.m3802getYimpl(this.windowOffset);
        return new IntRect(i + iM3801getXimpl, i2 + iM3802getYimpl, i3 + iM3801getXimpl, i4 + iM3802getYimpl);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RelativeLayoutBounds.class != obj.getClass()) {
            return false;
        }
        RelativeLayoutBounds relativeLayoutBounds = (RelativeLayoutBounds) obj;
        if (this.topLeft != relativeLayoutBounds.topLeft || this.bottomRight != relativeLayoutBounds.bottomRight || this.windowSize != relativeLayoutBounds.windowSize || !IntOffset.m3800equalsimpl0(this.windowOffset, relativeLayoutBounds.windowOffset) || !IntOffset.m3800equalsimpl0(this.screenOffset, relativeLayoutBounds.screenOffset)) {
            return false;
        }
        float[] fArr = this.viewToWindowMatrix;
        float[] fArr2 = relativeLayoutBounds.viewToWindowMatrix;
        if (fArr != null ? !(fArr2 != null && Matrix.m971equalsimpl0(fArr, fArr2)) : fArr2 != null) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.node, relativeLayoutBounds.node}, getCieXyz.write())).booleanValue();
    }

    public final float fractionVisibleInWindow() {
        long j = this.windowSize;
        return fractionVisibleInRect(0, 0, (int) (j >> 32), (int) j);
    }

    public /* synthetic */ RelativeLayoutBounds(long j, long j2, long j3, long j4, long j5, float[] fArr, DelegatableNode delegatableNode, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, fArr, delegatableNode);
    }
}
