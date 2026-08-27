package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import o.SelectionHandleIcon;

/* JADX INFO: loaded from: classes.dex */
public final class TouchSlopDetector {
    public long RemoteActionCompatParcelizer;
    public SelectionHandleIcon serializer;

    public /* synthetic */ TouchSlopDetector(SelectionHandleIcon selectionHandleIcon) {
        this(Offset.Companion.m493getZeroF1C5BW0(), selectionHandleIcon);
    }

    public static void RemoteActionCompatParcelizer(TouchSlopDetector touchSlopDetector) {
        touchSlopDetector.RemoteActionCompatParcelizer = Offset.Companion.m493getZeroF1C5BW0();
    }

    /* JADX INFO: renamed from: mainAxis-k-4lQ0M, reason: not valid java name */
    public final float m62mainAxisk4lQ0M(long j) {
        return Float.intBitsToFloat((int) (this.serializer == SelectionHandleIcon.Horizontal ? j >> 32 : j & 4294967295L));
    }

    /* JADX INFO: renamed from: getPostSlopOffset-qto3Fdw, reason: not valid java name */
    public final long m61getPostSlopOffsetqto3Fdw(float f, long j, boolean z) {
        long jM482plusMKHz9U;
        long j2 = this.RemoteActionCompatParcelizer;
        if (z) {
            jM482plusMKHz9U = Offset.m482plusMKHz9U(j2, j);
            this.RemoteActionCompatParcelizer = jM482plusMKHz9U;
        } else {
            jM482plusMKHz9U = Offset.m482plusMKHz9U(j2, j);
        }
        if ((this.serializer == null ? Offset.m475getDistanceimpl(jM482plusMKHz9U) : Math.abs(m62mainAxisk4lQ0M(jM482plusMKHz9U))) < f) {
            return Offset.Companion.m492getUnspecifiedF1C5BW0();
        }
        SelectionHandleIcon selectionHandleIcon = this.serializer;
        long j3 = this.RemoteActionCompatParcelizer;
        if (selectionHandleIcon == null) {
            return Offset.m481minusMKHz9U(this.RemoteActionCompatParcelizer, Offset.m484timestuRUvjQ(Offset.m472divtuRUvjQ(j3, Offset.m475getDistanceimpl(j3)), f));
        }
        float fM62mainAxisk4lQ0M = m62mainAxisk4lQ0M(j3) - (Math.signum(m62mainAxisk4lQ0M(this.RemoteActionCompatParcelizer)) * f);
        long j4 = this.RemoteActionCompatParcelizer;
        SelectionHandleIcon selectionHandleIcon2 = this.serializer;
        SelectionHandleIcon selectionHandleIcon3 = SelectionHandleIcon.Horizontal;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (selectionHandleIcon2 == selectionHandleIcon3 ? j4 & 4294967295L : j4 >> 32));
        if (this.serializer == selectionHandleIcon3) {
            return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(fM62mainAxisk4lQ0M)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L));
        }
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(fM62mainAxisk4lQ0M)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32));
    }

    public TouchSlopDetector(long j, SelectionHandleIcon selectionHandleIcon) {
        this.serializer = selectionHandleIcon;
        this.RemoteActionCompatParcelizer = j;
    }
}
