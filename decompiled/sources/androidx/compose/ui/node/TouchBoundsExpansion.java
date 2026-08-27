package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class TouchBoundsExpansion {
    private static final long IS_LAYOUT_DIRECTION_AWARE = Long.MIN_VALUE;
    private static final int MASK = 32767;
    public static final int MAX_VALUE = 32767;
    private static final int SHIFT = 15;
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long None = TouchBoundsExpansionKt.TouchBoundsExpansion$default(0, 0, 0, 0, 14, null);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m2639constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2641equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2646hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* JADX INFO: renamed from: isLayoutDirectionAware-impl, reason: not valid java name */
    public static final boolean m2647isLayoutDirectionAwareimpl(long j) {
        return (j & IS_LAYOUT_DIRECTION_AWARE) != 0;
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m2649unboximpl() {
        return this.packedValue;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TouchBoundsExpansion m2636boximpl(long j) {
        return new TouchBoundsExpansion(j);
    }

    public boolean equals(Object obj) {
        return m2640equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m2646hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m2648toStringimpl(this.packedValue);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final long trimAndShift(int i, int i2) {
            return ((long) (i & 32767)) << (i2 * 15);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int unpack(long j, int i) {
            return ((int) (j >> (i * 15))) & 32767;
        }

        /* JADX INFO: renamed from: getNone-RZrCHBk, reason: not valid java name */
        public final long m2652getNoneRZrCHBk() {
            return TouchBoundsExpansion.None;
        }

        public final long pack$ui(int i, int i2, int i3, int i4, boolean z) {
            long jTrimAndShift = trimAndShift(i, 0);
            long jTrimAndShift2 = trimAndShift(i2, 1);
            long jTrimAndShift3 = trimAndShift(i3, 2);
            return jTrimAndShift2 | jTrimAndShift | jTrimAndShift3 | trimAndShift(i4, 3) | (z ? TouchBoundsExpansion.IS_LAYOUT_DIRECTION_AWARE : 0L);
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: Absolute-vsh68fg, reason: not valid java name */
        public final long m2651Absolutevsh68fg(int i, int i2, int i3, int i4) {
            if (i < 0 || i >= 32768) {
                InlineClassHelperKt.throwIllegalArgumentException("Start must be in the range of 0 .. 32767");
            }
            if (i2 < 0 || i2 >= 32768) {
                InlineClassHelperKt.throwIllegalArgumentException("Top must be in the range of 0 .. 32767");
            }
            if (i3 < 0 || i3 >= 32768) {
                InlineClassHelperKt.throwIllegalArgumentException("End must be in the range of 0 .. 32767");
            }
            if (i4 < 0 || i4 >= 32768) {
                InlineClassHelperKt.throwIllegalArgumentException("Bottom must be in the range of 0 .. 32767");
            }
            return TouchBoundsExpansion.m2639constructorimpl(pack$ui(i, i2, i3, i4, false));
        }

        /* JADX INFO: renamed from: Absolute-vsh68fg$default, reason: not valid java name */
        public static /* synthetic */ long m2650Absolutevsh68fg$default(Companion companion, int i, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i = 0;
            }
            if ((i5 & 2) != 0) {
                i2 = 0;
            }
            if ((i5 & 4) != 0) {
                i3 = 0;
            }
            if ((i5 & 8) != 0) {
                i4 = 0;
            }
            return companion.m2651Absolutevsh68fg(i, i2, i3, i4);
        }
    }

    private /* synthetic */ TouchBoundsExpansion(long j) {
        this.packedValue = j;
    }

    /* JADX INFO: renamed from: getBottom-impl, reason: not valid java name */
    public static final int m2642getBottomimpl(long j) {
        return Companion.unpack(j, 3);
    }

    /* JADX INFO: renamed from: getEnd-impl, reason: not valid java name */
    public static final int m2643getEndimpl(long j) {
        return Companion.unpack(j, 2);
    }

    /* JADX INFO: renamed from: getStart-impl, reason: not valid java name */
    public static final int m2644getStartimpl(long j) {
        return Companion.unpack(j, 0);
    }

    /* JADX INFO: renamed from: getTop-impl, reason: not valid java name */
    public static final int m2645getTopimpl(long j) {
        return Companion.unpack(j, 1);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2648toStringimpl(long j) {
        return "TouchBoundsExpansion(packedValue=" + j + ')';
    }

    /* JADX INFO: renamed from: computeLeft-impl$ui, reason: not valid java name */
    public static final int m2637computeLeftimpl$ui(long j, LayoutDirection layoutDirection) {
        return (!m2647isLayoutDirectionAwareimpl(j) || layoutDirection == LayoutDirection.Ltr) ? m2644getStartimpl(j) : m2643getEndimpl(j);
    }

    /* JADX INFO: renamed from: computeRight-impl$ui, reason: not valid java name */
    public static final int m2638computeRightimpl$ui(long j, LayoutDirection layoutDirection) {
        return (!m2647isLayoutDirectionAwareimpl(j) || layoutDirection == LayoutDirection.Ltr) ? m2643getEndimpl(j) : m2644getStartimpl(j);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2640equalsimpl(long j, Object obj) {
        return (obj instanceof TouchBoundsExpansion) && j == ((TouchBoundsExpansion) obj).m2649unboximpl();
    }
}
