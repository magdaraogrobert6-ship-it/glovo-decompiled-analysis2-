package androidx.compose.ui.unit;

import androidx.compose.ui.util.MathHelpersKt;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class TextUnitKt {
    private static final long UNIT_MASK = 1095216660480L;
    private static final long UNIT_TYPE_EM = 8589934592L;
    private static final long UNIT_TYPE_SP = 4294967296L;
    private static final long UNIT_TYPE_UNSPECIFIED = 0;

    /* JADX INFO: renamed from: TextUnit-anM5pPY, reason: not valid java name */
    public static final long m3879TextUnitanM5pPY(float f, long j) {
        return pack(j, f);
    }

    public static /* synthetic */ void getEm$annotations(double d) {
    }

    public static /* synthetic */ void getEm$annotations(float f) {
    }

    public static /* synthetic */ void getEm$annotations(int i) {
    }

    public static /* synthetic */ void getSp$annotations(double d) {
    }

    public static /* synthetic */ void getSp$annotations(float f) {
    }

    public static /* synthetic */ void getSp$annotations(int i) {
    }

    /* JADX INFO: renamed from: isSpecified--R2X_6o, reason: not valid java name */
    public static final boolean m3883isSpecifiedR2X_6o(long j) {
        return !(TextUnit.m3865getRawTypeimpl(j) == 0);
    }

    /* JADX INFO: renamed from: isSpecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m3884isSpecifiedR2X_6o$annotations(long j) {
    }

    /* JADX INFO: renamed from: isUnspecified--R2X_6o, reason: not valid java name */
    public static final boolean m3885isUnspecifiedR2X_6o(long j) {
        return TextUnit.m3865getRawTypeimpl(j) == 0;
    }

    /* JADX INFO: renamed from: isUnspecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m3886isUnspecifiedR2X_6o$annotations(long j) {
    }

    /* JADX INFO: renamed from: lerp-C3pnCVY, reason: not valid java name */
    public static final long m3887lerpC3pnCVY(long j, long j2, float f) {
        m3881checkArithmeticNB67dxo(j, j2);
        return pack(TextUnit.m3865getRawTypeimpl(j), MathHelpersKt.lerp(TextUnit.m3867getValueimpl(j), TextUnit.m3867getValueimpl(j2), f));
    }

    /* JADX INFO: renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m3889timesmpE4wyQ(double d, long j) {
        m3880checkArithmeticR2X_6o(j);
        return pack(TextUnit.m3865getRawTypeimpl(j), TextUnit.m3867getValueimpl(j) * ((float) d));
    }

    public static final long getEm(double d) {
        return pack(UNIT_TYPE_EM, (float) d);
    }

    public static final long getSp(double d) {
        return pack(UNIT_TYPE_SP, (float) d);
    }

    /* JADX INFO: renamed from: checkArithmetic-NB67dxo, reason: not valid java name */
    public static final void m3881checkArithmeticNB67dxo(long j, long j2) {
        if (TextUnit.m3865getRawTypeimpl(j) == 0 || TextUnit.m3865getRawTypeimpl(j2) == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (TextUnitType.m3895equalsimpl0(TextUnit.m3866getTypeUIouoOA(j), TextUnit.m3866getTypeUIouoOA(j2))) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for " + ((Object) TextUnitType.m3897toStringimpl(TextUnit.m3866getTypeUIouoOA(j))) + " and " + ((Object) TextUnitType.m3897toStringimpl(TextUnit.m3866getTypeUIouoOA(j2))));
    }

    public static final long getEm(float f) {
        return pack(UNIT_TYPE_EM, f);
    }

    public static final long getSp(float f) {
        return pack(UNIT_TYPE_SP, f);
    }

    public static final long getEm(int i) {
        return pack(UNIT_TYPE_EM, i);
    }

    public static final long getSp(int i) {
        return pack(UNIT_TYPE_SP, i);
    }

    public static final long pack(long j, float f) {
        return TextUnit.m3859constructorimpl(j | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
    }

    /* JADX INFO: renamed from: checkArithmetic-vU-0ePk, reason: not valid java name */
    public static final void m3882checkArithmeticvU0ePk(long j, long j2, long j3) {
        if (TextUnit.m3865getRawTypeimpl(j) == 0 || TextUnit.m3865getRawTypeimpl(j2) == 0 || TextUnit.m3865getRawTypeimpl(j3) == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (TextUnitType.m3895equalsimpl0(TextUnit.m3866getTypeUIouoOA(j), TextUnit.m3866getTypeUIouoOA(j2)) && TextUnitType.m3895equalsimpl0(TextUnit.m3866getTypeUIouoOA(j2), TextUnit.m3866getTypeUIouoOA(j3))) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for " + ((Object) TextUnitType.m3897toStringimpl(TextUnit.m3866getTypeUIouoOA(j))) + " and " + ((Object) TextUnitType.m3897toStringimpl(TextUnit.m3866getTypeUIouoOA(j2))));
    }

    /* JADX INFO: renamed from: takeOrElse-eAf_CNQ, reason: not valid java name */
    public static final long m3888takeOrElseeAf_CNQ(long j, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        return TextUnit.m3865getRawTypeimpl(j) == 0 ? ((TextUnit) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke()).m3876unboximpl() : j;
    }

    /* JADX INFO: renamed from: checkArithmetic--R2X_6o, reason: not valid java name */
    public static final void m3880checkArithmeticR2X_6o(long j) {
        if (TextUnit.m3865getRawTypeimpl(j) == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
    }

    /* JADX INFO: renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m3890timesmpE4wyQ(float f, long j) {
        m3880checkArithmeticR2X_6o(j);
        return pack(TextUnit.m3865getRawTypeimpl(j), TextUnit.m3867getValueimpl(j) * f);
    }

    /* JADX INFO: renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m3891timesmpE4wyQ(int i, long j) {
        m3880checkArithmeticR2X_6o(j);
        return pack(TextUnit.m3865getRawTypeimpl(j), TextUnit.m3867getValueimpl(j) * i);
    }
}
