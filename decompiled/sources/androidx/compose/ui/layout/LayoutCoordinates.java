package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface LayoutCoordinates {

    /* JADX INFO: loaded from: classes4.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean getIntroducesMotionFrameOfReference(LayoutCoordinates layoutCoordinates) {
            return LayoutCoordinates.super.getIntroducesMotionFrameOfReference();
        }

        public static /* synthetic */ void getIntroducesMotionFrameOfReference$annotations() {
        }

        @Deprecated
        /* JADX INFO: renamed from: localPositionOf-S_NoaFU, reason: not valid java name */
        public static long m2227localPositionOfS_NoaFU(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, long j, boolean z) {
            return LayoutCoordinates.super.mo2219localPositionOfS_NoaFU(layoutCoordinates2, j, z);
        }

        @Deprecated
        /* JADX INFO: renamed from: localToScreen-MK-Hz9U, reason: not valid java name */
        public static long m2229localToScreenMKHz9U(LayoutCoordinates layoutCoordinates, long j) {
            return LayoutCoordinates.super.mo2221localToScreenMKHz9U(j);
        }

        @Deprecated
        /* JADX INFO: renamed from: screenToLocal-MK-Hz9U, reason: not valid java name */
        public static long m2230screenToLocalMKHz9U(LayoutCoordinates layoutCoordinates, long j) {
            return LayoutCoordinates.super.mo2223screenToLocalMKHz9U(j);
        }

        @Deprecated
        /* JADX INFO: renamed from: transformFrom-EL8BTi8, reason: not valid java name */
        public static void m2231transformFromEL8BTi8(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, float[] fArr) {
            LayoutCoordinates.super.mo2224transformFromEL8BTi8(layoutCoordinates2, fArr);
        }

        @Deprecated
        /* JADX INFO: renamed from: transformToScreen-58bKbWc, reason: not valid java name */
        public static void m2232transformToScreen58bKbWc(LayoutCoordinates layoutCoordinates, float[] fArr) {
            LayoutCoordinates.super.mo2225transformToScreen58bKbWc(fArr);
        }
    }

    int get(AlignmentLine alignmentLine);

    default boolean getIntroducesMotionFrameOfReference() {
        return false;
    }

    LayoutCoordinates getParentCoordinates();

    LayoutCoordinates getParentLayoutCoordinates();

    Set<AlignmentLine> getProvidedAlignmentLines();

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    long mo2217getSizeYbymL2g();

    boolean isAttached();

    Rect localBoundingBoxOf(LayoutCoordinates layoutCoordinates, boolean z);

    /* JADX INFO: renamed from: localPositionOf-R5De75A, reason: not valid java name */
    long mo2218localPositionOfR5De75A(LayoutCoordinates layoutCoordinates, long j);

    /* JADX INFO: renamed from: localToRoot-MK-Hz9U, reason: not valid java name */
    long mo2220localToRootMKHz9U(long j);

    /* JADX INFO: renamed from: localToWindow-MK-Hz9U, reason: not valid java name */
    long mo2222localToWindowMKHz9U(long j);

    /* JADX INFO: renamed from: windowToLocal-MK-Hz9U, reason: not valid java name */
    long mo2226windowToLocalMKHz9U(long j);

    /* JADX INFO: renamed from: localToScreen-MK-Hz9U, reason: not valid java name */
    default long mo2221localToScreenMKHz9U(long j) {
        return Offset.Companion.m492getUnspecifiedF1C5BW0();
    }

    /* JADX INFO: renamed from: screenToLocal-MK-Hz9U, reason: not valid java name */
    default long mo2223screenToLocalMKHz9U(long j) {
        return Offset.Companion.m492getUnspecifiedF1C5BW0();
    }

    /* JADX INFO: renamed from: transformFrom-EL8BTi8, reason: not valid java name */
    default void mo2224transformFromEL8BTi8(LayoutCoordinates layoutCoordinates, float[] fArr) {
        InlineClassHelperKt.throwUnsupportedOperationException("transformFrom is not implemented on this LayoutCoordinates");
    }

    /* JADX INFO: renamed from: localPositionOf-S_NoaFU, reason: not valid java name */
    default long mo2219localPositionOfS_NoaFU(LayoutCoordinates layoutCoordinates, long j, boolean z) {
        throw new UnsupportedOperationException("localPositionOf is not implemented on this LayoutCoordinates");
    }

    /* JADX INFO: renamed from: transformToScreen-58bKbWc, reason: not valid java name */
    default void mo2225transformToScreen58bKbWc(float[] fArr) {
        throw new UnsupportedOperationException("transformToScreen is not implemented on this LayoutCoordinates");
    }

    /* JADX INFO: renamed from: localPositionOf-S_NoaFU$default, reason: not valid java name */
    static /* synthetic */ long m2216localPositionOfS_NoaFU$default(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, long j, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                j = Offset.Companion.m493getZeroF1C5BW0();
            }
            if ((i & 4) != 0) {
                z = true;
            }
            return layoutCoordinates.mo2219localPositionOfS_NoaFU(layoutCoordinates2, j, z);
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: localPositionOf-S_NoaFU");
        return 0L;
    }

    static /* synthetic */ Rect localBoundingBoxOf$default(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            return layoutCoordinates.localBoundingBoxOf(layoutCoordinates2, z);
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
        return null;
    }
}
