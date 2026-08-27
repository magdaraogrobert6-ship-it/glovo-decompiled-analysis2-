package androidx.compose.ui.unit;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import o.DrawableTransformation;

/* JADX INFO: loaded from: classes.dex */
public final class ConstraintsKt {
    private static final long FocusMask = 3;
    private static final int Infinity = Integer.MAX_VALUE;
    private static final int MaxAllowedForMaxFocusBits = 8190;
    private static final int MaxAllowedForMaxNonFocusBits = 262142;
    private static final int MaxAllowedForMinFocusBits = 32766;
    private static final int MaxAllowedForMinNonFocusBits = 65534;
    public static final long MaxDimensionsAndFocusMask = -8589934589L;
    private static final int MaxFocusBits = 18;
    private static final int MaxFocusMask = 262143;
    private static final int MaxNonFocusBits = 13;
    private static final int MaxNonFocusMask = 8191;
    private static final int MinFocusBits = 16;
    private static final int MinFocusMask = 65535;
    private static final int MinNonFocusBits = 15;
    private static final int MinNonFocusMask = 32767;

    private static final int addMaxWithMinimum(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        int i3 = i + i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    private static final int bitOffsetToIndex(int i) {
        return (i >> 1) + (i & 1);
    }

    public static final int bitsNeedForSizeUnchecked(int i) {
        if (i < MaxNonFocusMask) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < MinFocusMask) {
            return 16;
        }
        return i < MaxFocusMask ? 18 : 255;
    }

    public static /* synthetic */ void getMaxDimensionsAndFocusMask$annotations() {
    }

    private static final int heightMask(int i) {
        return (1 << (18 - i)) - 1;
    }

    private static final int indexToBitOffset(int i) {
        return (((i & 2) >> 1) * 3) + ((i & 1) << 1);
    }

    private static final int minHeightOffsets(int i) {
        return i + 15;
    }

    private static final int widthMask(int i) {
        return (1 << (i + 13)) - 1;
    }

    /* JADX INFO: renamed from: constrain-N9IONVI, reason: not valid java name */
    public static final long m3641constrainN9IONVI(long j, long j2) {
        int iM3628getMinWidthimpl = Constraints.m3628getMinWidthimpl(j);
        int iM3626getMaxWidthimpl = Constraints.m3626getMaxWidthimpl(j);
        int iM3627getMinHeightimpl = Constraints.m3627getMinHeightimpl(j);
        int iM3625getMaxHeightimpl = Constraints.m3625getMaxHeightimpl(j);
        int iM3628getMinWidthimpl2 = Constraints.m3628getMinWidthimpl(j2);
        if (iM3628getMinWidthimpl2 < iM3628getMinWidthimpl) {
            iM3628getMinWidthimpl2 = iM3628getMinWidthimpl;
        }
        if (iM3628getMinWidthimpl2 > iM3626getMaxWidthimpl) {
            iM3628getMinWidthimpl2 = iM3626getMaxWidthimpl;
        }
        int iM3626getMaxWidthimpl2 = Constraints.m3626getMaxWidthimpl(j2);
        if (iM3626getMaxWidthimpl2 >= iM3628getMinWidthimpl) {
            iM3628getMinWidthimpl = iM3626getMaxWidthimpl2;
        }
        if (iM3628getMinWidthimpl <= iM3626getMaxWidthimpl) {
            iM3626getMaxWidthimpl = iM3628getMinWidthimpl;
        }
        int iM3627getMinHeightimpl2 = Constraints.m3627getMinHeightimpl(j2);
        if (iM3627getMinHeightimpl2 < iM3627getMinHeightimpl) {
            iM3627getMinHeightimpl2 = iM3627getMinHeightimpl;
        }
        if (iM3627getMinHeightimpl2 > iM3625getMaxHeightimpl) {
            iM3627getMinHeightimpl2 = iM3625getMaxHeightimpl;
        }
        int iM3625getMaxHeightimpl2 = Constraints.m3625getMaxHeightimpl(j2);
        if (iM3625getMaxHeightimpl2 >= iM3627getMinHeightimpl) {
            iM3627getMinHeightimpl = iM3625getMaxHeightimpl2;
        }
        if (iM3627getMinHeightimpl <= iM3625getMaxHeightimpl) {
            iM3625getMaxHeightimpl = iM3627getMinHeightimpl;
        }
        return Constraints(iM3628getMinWidthimpl2, iM3626getMaxWidthimpl, iM3627getMinHeightimpl2, iM3625getMaxHeightimpl);
    }

    /* JADX INFO: renamed from: constrainHeight-K40F9xA, reason: not valid java name */
    public static final int m3642constrainHeightK40F9xA(long j, int i) {
        int iM3627getMinHeightimpl = Constraints.m3627getMinHeightimpl(j);
        int iM3625getMaxHeightimpl = Constraints.m3625getMaxHeightimpl(j);
        if (i < iM3627getMinHeightimpl) {
            i = iM3627getMinHeightimpl;
        }
        return i > iM3625getMaxHeightimpl ? iM3625getMaxHeightimpl : i;
    }

    /* JADX INFO: renamed from: constrainWidth-K40F9xA, reason: not valid java name */
    public static final int m3643constrainWidthK40F9xA(long j, int i) {
        int iM3628getMinWidthimpl = Constraints.m3628getMinWidthimpl(j);
        int iM3626getMaxWidthimpl = Constraints.m3626getMaxWidthimpl(j);
        if (i < iM3628getMinWidthimpl) {
            i = iM3628getMinWidthimpl;
        }
        return i > iM3626getMaxWidthimpl ? iM3626getMaxWidthimpl : i;
    }

    /* JADX INFO: renamed from: isSatisfiedBy-4WqzIAM, reason: not valid java name */
    public static final boolean m3644isSatisfiedBy4WqzIAM(long j, long j2) {
        int iM3628getMinWidthimpl = Constraints.m3628getMinWidthimpl(j);
        int iM3626getMaxWidthimpl = Constraints.m3626getMaxWidthimpl(j);
        int i = (int) (j2 >> 32);
        if (iM3628getMinWidthimpl > i || i > iM3626getMaxWidthimpl) {
            return false;
        }
        int i2 = (int) (j2 & 4294967295L);
        return Constraints.m3627getMinHeightimpl(j) <= i2 && i2 <= Constraints.m3625getMaxHeightimpl(j);
    }

    /* JADX INFO: renamed from: constrain-4WqzIAM, reason: not valid java name */
    public static final long m3640constrain4WqzIAM(long j, long j2) {
        int i = (int) (j2 >> 32);
        int iM3628getMinWidthimpl = Constraints.m3628getMinWidthimpl(j);
        int iM3626getMaxWidthimpl = Constraints.m3626getMaxWidthimpl(j);
        if (i < iM3628getMinWidthimpl) {
            i = iM3628getMinWidthimpl;
        }
        if (i <= iM3626getMaxWidthimpl) {
            iM3626getMaxWidthimpl = i;
        }
        int i2 = (int) (j2 & 4294967295L);
        int iM3627getMinHeightimpl = Constraints.m3627getMinHeightimpl(j);
        int iM3625getMaxHeightimpl = Constraints.m3625getMaxHeightimpl(j);
        if (i2 < iM3627getMinHeightimpl) {
            i2 = iM3627getMinHeightimpl;
        }
        if (i2 <= iM3625getMaxHeightimpl) {
            iM3625getMaxHeightimpl = i2;
        }
        return IntSize.m3839constructorimpl((((long) iM3626getMaxWidthimpl) << 32) | (((long) iM3625getMaxHeightimpl) & 4294967295L));
    }

    public static final Void throwInvalidConstraintsSizeException(int i) {
        throw new IllegalArgumentException(d$$ExternalSyntheticOutline0.m(i, "Can't represent a size of ", " in Constraints"));
    }

    public static final long createConstraints(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int iBitsNeedForSizeUnchecked = bitsNeedForSizeUnchecked(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int iBitsNeedForSizeUnchecked2 = bitsNeedForSizeUnchecked(i6);
        if (iBitsNeedForSizeUnchecked + iBitsNeedForSizeUnchecked2 > 31) {
            throwInvalidConstraintException(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = iBitsNeedForSizeUnchecked2 - 13;
        return Constraints.m3614constructorimpl((((long) ((~(i7 >> 31)) & i7)) << 33) | ((long) ((i9 >> 1) + (i9 & 1))) | (((long) i) << 2) | (((long) i3) << (iBitsNeedForSizeUnchecked2 + 2)) | (((long) ((~(i8 >> 31)) & i8)) << (iBitsNeedForSizeUnchecked2 + 33)));
    }

    public static final void throwInvalidConstraintException(int i, int i2) {
        throw new IllegalArgumentException(af$$ExternalSyntheticOutline0.m(i, i2, "Can't represent a width of ", " and height of ", " in Constraints"));
    }

    /* JADX INFO: renamed from: offset-NN6Ew-U, reason: not valid java name */
    public static final long m3645offsetNN6EwU(long j, int i, int i2) {
        int iM3628getMinWidthimpl = Constraints.m3628getMinWidthimpl(j) + i;
        if (iM3628getMinWidthimpl < 0) {
            iM3628getMinWidthimpl = 0;
        }
        int iM3626getMaxWidthimpl = Constraints.m3626getMaxWidthimpl(j);
        if (iM3626getMaxWidthimpl != Integer.MAX_VALUE && (iM3626getMaxWidthimpl = iM3626getMaxWidthimpl + i) < 0) {
            iM3626getMaxWidthimpl = 0;
        }
        int iM3627getMinHeightimpl = Constraints.m3627getMinHeightimpl(j) + i2;
        if (iM3627getMinHeightimpl < 0) {
            iM3627getMinHeightimpl = 0;
        }
        int iM3625getMaxHeightimpl = Constraints.m3625getMaxHeightimpl(j);
        return Constraints(iM3628getMinWidthimpl, iM3626getMaxWidthimpl, iM3627getMinHeightimpl, (iM3625getMaxHeightimpl == Integer.MAX_VALUE || (iM3625getMaxHeightimpl = iM3625getMaxHeightimpl + i2) >= 0) ? iM3625getMaxHeightimpl : 0);
    }

    /* JADX INFO: renamed from: offset-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ long m3646offsetNN6EwU$default(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m3645offsetNN6EwU(j, i, i2);
    }

    public static /* synthetic */ long Constraints$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return Constraints(i, i2, i3, i4);
    }

    public static final long Constraints(int i, int i2, int i3, int i4) {
        boolean z = i2 >= i;
        boolean z2 = i4 >= i3;
        if (!((i3 >= 0) & z & z2 & (i >= 0))) {
            InlineClassHelperKt.throwIllegalArgumentException("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return createConstraints(i, i2, i3, i4);
    }

    private static final int maxAllowedForSize(int i) {
        if (i < MaxNonFocusMask) {
            return MaxAllowedForMaxNonFocusBits;
        }
        if (i < 32767) {
            return MaxAllowedForMinNonFocusBits;
        }
        if (i < MinFocusMask) {
            return MaxAllowedForMinFocusBits;
        }
        if (i < MaxFocusMask) {
            return MaxAllowedForMaxFocusBits;
        }
        throwInvalidConstraintsSizeException(i);
        DrawableTransformation.read();
        return 0;
    }
}
