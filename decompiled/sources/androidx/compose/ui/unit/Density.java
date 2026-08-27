package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;

/* JADX INFO: loaded from: classes.dex */
public interface Density extends FontScaling {
    float getDensity();

    /* JADX INFO: renamed from: toDp-u2uoSUM */
    default float mo45toDpu2uoSUM(int i) {
        return Dp.m3673constructorimpl(i / getDensity());
    }

    /* JADX INFO: renamed from: toPx-0680j_4 */
    default float mo48toPx0680j_4(float f) {
        return getDensity() * f;
    }

    default Rect toRect(DpRect dpRect) {
        return new Rect(mo48toPx0680j_4(dpRect.m3756getLeftD9Ej5fM()), mo48toPx0680j_4(dpRect.m3758getTopD9Ej5fM()), mo48toPx0680j_4(dpRect.m3757getRightD9Ej5fM()), mo48toPx0680j_4(dpRect.m3755getBottomD9Ej5fM()));
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void getDensity$annotations() {
        }

        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m3659roundToPxR2X_6o(Density density, long j) {
            return Density.super.mo41roundToPxR2X_6o(j);
        }

        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m3660roundToPx0680j_4(Density density, float f) {
            return Density.super.mo42roundToPx0680j_4(f);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m3661toDpGaN1DYA(Density density, long j) {
            return Density.super.mo43toDpGaN1DYA(j);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3663toDpu2uoSUM(Density density, int i) {
            return Density.super.mo45toDpu2uoSUM(i);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m3664toDpSizekrfVVM(Density density, long j) {
            return Density.super.mo46toDpSizekrfVVM(j);
        }

        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m3665toPxR2X_6o(Density density, long j) {
            return Density.super.mo47toPxR2X_6o(j);
        }

        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m3666toPx0680j_4(Density density, float f) {
            return Density.super.mo48toPx0680j_4(f);
        }

        @Deprecated
        public static Rect toRect(Density density, DpRect dpRect) {
            return Density.super.toRect(dpRect);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m3667toSizeXkaWNTQ(Density density, long j) {
            return Density.super.mo49toSizeXkaWNTQ(j);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m3668toSp0xMU5do(Density density, float f) {
            return Density.super.mo50toSp0xMU5do(f);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3670toSpkPz2Gy4(Density density, int i) {
            return Density.super.mo52toSpkPz2Gy4(i);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3662toDpu2uoSUM(Density density, float f) {
            return Density.super.mo44toDpu2uoSUM(f);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3669toSpkPz2Gy4(Density density, float f) {
            return Density.super.mo51toSpkPz2Gy4(f);
        }
    }

    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    default int mo41roundToPxR2X_6o(long j) {
        return Math.round(mo47toPxR2X_6o(j));
    }

    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    default int mo42roundToPx0680j_4(float f) {
        float fMo48toPx0680j_4 = mo48toPx0680j_4(f);
        if (Float.isInfinite(fMo48toPx0680j_4)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fMo48toPx0680j_4);
    }

    /* JADX INFO: renamed from: toPx--R2X_6o */
    default float mo47toPxR2X_6o(long j) {
        if (!TextUnitType.m3895equalsimpl0(TextUnit.m3866getTypeUIouoOA(j), TextUnitType.Companion.m3900getSpUIouoOA())) {
            InlineClassHelperKt.throwIllegalStateException("Only Sp can convert to Px");
        }
        return mo48toPx0680j_4(mo43toDpGaN1DYA(j));
    }

    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    default long mo52toSpkPz2Gy4(int i) {
        return mo50toSp0xMU5do(mo45toDpu2uoSUM(i));
    }

    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    default long mo49toSizeXkaWNTQ(long j) {
        if (j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            float fMo48toPx0680j_4 = mo48toPx0680j_4(DpSize.m3771getWidthD9Ej5fM(j));
            return Size.m537constructorimpl((((long) Float.floatToRawIntBits(mo48toPx0680j_4(DpSize.m3769getHeightD9Ej5fM(j)))) & 4294967295L) | (Float.floatToRawIntBits(fMo48toPx0680j_4) << 32));
        }
        return Size.Companion.m554getUnspecifiedNHjbRc();
    }

    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    default long mo51toSpkPz2Gy4(float f) {
        return mo50toSp0xMU5do(mo44toDpu2uoSUM(f));
    }

    /* JADX INFO: renamed from: toDp-u2uoSUM */
    default float mo44toDpu2uoSUM(float f) {
        return Dp.m3673constructorimpl(f / getDensity());
    }

    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    default long mo46toDpSizekrfVVM(long j) {
        if (j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            return DpKt.m3695DpSizeYgX7TsA(mo44toDpu2uoSUM(Float.intBitsToFloat((int) (j >> 32))), mo44toDpu2uoSUM(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return DpSize.Companion.m3780getUnspecifiedMYxV2XQ();
    }
}
