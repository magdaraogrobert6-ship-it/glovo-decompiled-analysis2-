package androidx.compose.ui.unit;

import bo.app.ff$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.DrawableTransformation;
import o.onItemDismisslambda0;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class Constraints {
    public static final Companion Companion = new Companion(null);
    public static final int Infinity = Integer.MAX_VALUE;
    private final long value;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @onItemDismisslambda0
        /* JADX INFO: renamed from: restrictConstraints-xF2OJ5Q, reason: not valid java name */
        public final long m3639restrictConstraintsxF2OJ5Q(int i, int i2, int i3, int i4, boolean z) {
            return z ? m3635fitPrioritizingWidthZbe2FdA(i, i2, i3, i4) : m3634fitPrioritizingHeightZbe2FdA(i, i2, i3, i4);
        }

        /* JADX INFO: renamed from: fitPrioritizingHeight-Zbe2FdA, reason: not valid java name */
        public final long m3634fitPrioritizingHeightZbe2FdA(int i, int i2, int i3, int i4) {
            int i5 = 262142;
            int iMin = Math.min(i3, 262142);
            int iMin2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
            int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
            if (i6 >= 8191) {
                if (i6 < 32767) {
                    i5 = 65534;
                } else if (i6 < 65535) {
                    i5 = 32766;
                } else {
                    if (i6 >= 262143) {
                        ConstraintsKt.throwInvalidConstraintsSizeException(i6);
                        DrawableTransformation.read();
                        return 0L;
                    }
                    i5 = 8190;
                }
            }
            return ConstraintsKt.Constraints(Math.min(i5, i), i2 != Integer.MAX_VALUE ? Math.min(i5, i2) : Integer.MAX_VALUE, iMin, iMin2);
        }

        /* JADX INFO: renamed from: fitPrioritizingWidth-Zbe2FdA, reason: not valid java name */
        public final long m3635fitPrioritizingWidthZbe2FdA(int i, int i2, int i3, int i4) {
            int i5 = 262142;
            int iMin = Math.min(i, 262142);
            int iMin2 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, 262142);
            int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
            if (i6 >= 8191) {
                if (i6 < 32767) {
                    i5 = 65534;
                } else if (i6 < 65535) {
                    i5 = 32766;
                } else {
                    if (i6 >= 262143) {
                        ConstraintsKt.throwInvalidConstraintsSizeException(i6);
                        DrawableTransformation.read();
                        return 0L;
                    }
                    i5 = 8190;
                }
            }
            return ConstraintsKt.Constraints(iMin, iMin2, Math.min(i5, i3), i4 != Integer.MAX_VALUE ? Math.min(i5, i4) : Integer.MAX_VALUE);
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: fixedHeight-OenEA2s, reason: not valid java name */
        public final long m3637fixedHeightOenEA2s(int i) {
            if (i < 0) {
                InlineClassHelperKt.throwIllegalArgumentException("height must be >= 0");
            }
            return ConstraintsKt.createConstraints(0, Integer.MAX_VALUE, i, i);
        }

        /* JADX INFO: renamed from: restrictConstraints-xF2OJ5Q$default, reason: not valid java name */
        public static /* synthetic */ long m3633restrictConstraintsxF2OJ5Q$default(Companion companion, int i, int i2, int i3, int i4, boolean z, int i5, Object obj) {
            if ((i5 & 16) != 0) {
                z = true;
            }
            return companion.m3639restrictConstraintsxF2OJ5Q(i, i2, i3, i4, z);
        }

        /* JADX INFO: renamed from: fixedWidth-OenEA2s, reason: not valid java name */
        public final long m3638fixedWidthOenEA2s(int i) {
            if (i < 0) {
                InlineClassHelperKt.throwIllegalArgumentException("width must be >= 0");
            }
            return ConstraintsKt.createConstraints(i, i, 0, Integer.MAX_VALUE);
        }

        /* JADX INFO: renamed from: fixed-JhjzzOo, reason: not valid java name */
        public final long m3636fixedJhjzzOo(int i, int i2) {
            if (!((i2 >= 0) & (i >= 0))) {
                InlineClassHelperKt.throwIllegalArgumentException("width and height must be >= 0");
            }
            return ConstraintsKt.createConstraints(i, i, i2, i2);
        }
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m3614constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3619equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: getFocusIndex-impl, reason: not valid java name */
    private static final int m3620getFocusIndeximpl(long j) {
        return (int) (j & 3);
    }

    /* JADX INFO: renamed from: getHasBoundedHeight-impl, reason: not valid java name */
    public static final boolean m3621getHasBoundedHeightimpl(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return (((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) != 0;
    }

    /* JADX INFO: renamed from: getHasBoundedWidth-impl, reason: not valid java name */
    public static final boolean m3622getHasBoundedWidthimpl(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1)) != 0;
    }

    public static /* synthetic */ void getHasFixedHeight$annotations() {
    }

    /* JADX INFO: renamed from: getHasFixedHeight-impl, reason: not valid java name */
    public static final boolean m3623getHasFixedHeightimpl(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = (1 << (18 - i2)) - 1;
        int i4 = (int) (j >> (i2 + 15));
        int i5 = ((int) (j >> (i2 + 46))) & i3;
        return (i4 & i3) == (i5 == 0 ? Integer.MAX_VALUE : i5 + (-1));
    }

    public static /* synthetic */ void getHasFixedWidth$annotations() {
    }

    /* JADX INFO: renamed from: getHasFixedWidth-impl, reason: not valid java name */
    public static final boolean m3624getHasFixedWidthimpl(long j) {
        int i = (int) (3 & j);
        int i2 = (1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1;
        int i3 = (int) (j >> 2);
        int i4 = ((int) (j >> 33)) & i2;
        return (i3 & i2) == (i4 == 0 ? Integer.MAX_VALUE : i4 + (-1));
    }

    /* JADX INFO: renamed from: getMaxHeight-impl, reason: not valid java name */
    public static final int m3625getMaxHeightimpl(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = ((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    /* JADX INFO: renamed from: getMaxWidth-impl, reason: not valid java name */
    public static final int m3626getMaxWidthimpl(long j) {
        int i = (int) (3 & j);
        int i2 = ((int) (j >> 33)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
        if (i2 == 0) {
            return Integer.MAX_VALUE;
        }
        return i2 - 1;
    }

    /* JADX INFO: renamed from: getMinHeight-impl, reason: not valid java name */
    public static final int m3627getMinHeightimpl(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((int) (j >> (i2 + 15))) & ((1 << (18 - i2)) - 1);
    }

    /* JADX INFO: renamed from: getMinWidth-impl, reason: not valid java name */
    public static final int m3628getMinWidthimpl(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3629hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public static /* synthetic */ void isZero$annotations() {
    }

    /* JADX INFO: renamed from: isZero-impl, reason: not valid java name */
    public static final boolean m3630isZeroimpl(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((((1 << (i2 + 13)) - 1) & ((int) (j >> 33))) - 1 == 0) | ((((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) - 1 == 0);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m3632unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Constraints m3613boximpl(long j) {
        return new Constraints(j);
    }

    public boolean equals(Object obj) {
        return m3618equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3629hashCodeimpl(this.value);
    }

    public String toString() {
        return m3631toStringimpl(this.value);
    }

    private /* synthetic */ Constraints(long j) {
        this.value = j;
    }

    /* JADX INFO: renamed from: copy-Zbe2FdA$default, reason: not valid java name */
    public static /* synthetic */ long m3616copyZbe2FdA$default(long j, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = m3628getMinWidthimpl(j);
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            i2 = m3626getMaxWidthimpl(j);
        }
        int i7 = i2;
        if ((i5 & 4) != 0) {
            i3 = m3627getMinHeightimpl(j);
        }
        int i8 = i3;
        if ((i5 & 8) != 0) {
            i4 = m3625getMaxHeightimpl(j);
        }
        return m3615copyZbe2FdA(j, i6, i7, i8, i4);
    }

    /* JADX INFO: renamed from: copyMaxDimensions-msEJaDk, reason: not valid java name */
    public static final long m3617copyMaxDimensionsmsEJaDk(long j) {
        return m3614constructorimpl(j & ConstraintsKt.MaxDimensionsAndFocusMask);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3618equalsimpl(long j, Object obj) {
        return (obj instanceof Constraints) && j == ((Constraints) obj).m3632unboximpl();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3631toStringimpl(long j) {
        int iM3626getMaxWidthimpl = m3626getMaxWidthimpl(j);
        String strValueOf = iM3626getMaxWidthimpl == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iM3626getMaxWidthimpl);
        int iM3625getMaxHeightimpl = m3625getMaxHeightimpl(j);
        String strValueOf2 = iM3625getMaxHeightimpl != Integer.MAX_VALUE ? String.valueOf(iM3625getMaxHeightimpl) : "Infinity";
        StringBuilder sb = new StringBuilder("Constraints(minWidth = ");
        sb.append(m3628getMinWidthimpl(j));
        sb.append(", maxWidth = ");
        sb.append(strValueOf);
        sb.append(", minHeight = ");
        sb.append(m3627getMinHeightimpl(j));
        sb.append(", maxHeight = ");
        return ff$$ExternalSyntheticOutline0.m(sb, strValueOf2, ')');
    }

    /* JADX INFO: renamed from: copy-Zbe2FdA, reason: not valid java name */
    public static final long m3615copyZbe2FdA(long j, int i, int i2, int i3, int i4) {
        if (i2 < i || i4 < i3 || i < 0 || i3 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return ConstraintsKt.createConstraints(i, i2, i3, i4);
    }
}
