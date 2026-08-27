package androidx.compose.ui.unit;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class TextUnit {
    public static final Companion Companion = new Companion(null);
    private static final TextUnitType[] TextUnitTypes;
    private static final long Unspecified;
    private final long packedValue;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m3859constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3864equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getRawType$annotations() {
    }

    /* JADX INFO: renamed from: getRawType-impl, reason: not valid java name */
    public static final long m3865getRawTypeimpl(long j) {
        return j & 1095216660480L;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3868hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* JADX INFO: renamed from: isEm-impl, reason: not valid java name */
    public static final boolean m3869isEmimpl(long j) {
        return m3865getRawTypeimpl(j) == 8589934592L;
    }

    /* JADX INFO: renamed from: isSp-impl, reason: not valid java name */
    public static final boolean m3870isSpimpl(long j) {
        return m3865getRawTypeimpl(j) == 4294967296L;
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m3876unboximpl() {
        return this.packedValue;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextUnit m3857boximpl(long j) {
        return new TextUnit(j);
    }

    /* JADX INFO: renamed from: getType-UIouoOA, reason: not valid java name */
    public static final long m3866getTypeUIouoOA(long j) {
        return TextUnitTypes[(int) (m3865getRawTypeimpl(j) >>> 32)].m3898unboximpl();
    }

    public boolean equals(Object obj) {
        return m3863equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m3868hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m3874toStringimpl(this.packedValue);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getUnspecified-XSAIIZE$annotations, reason: not valid java name */
        public static /* synthetic */ void m3877getUnspecifiedXSAIIZE$annotations() {
        }

        public final TextUnitType[] getTextUnitTypes$ui_unit() {
            return TextUnit.TextUnitTypes;
        }

        /* JADX INFO: renamed from: getUnspecified-XSAIIZE, reason: not valid java name */
        public final long m3878getUnspecifiedXSAIIZE() {
            return TextUnit.Unspecified;
        }

        private Companion() {
        }
    }

    static {
        TextUnitType.Companion companion = TextUnitType.Companion;
        TextUnitTypes = new TextUnitType[]{TextUnitType.m3892boximpl(companion.m3901getUnspecifiedUIouoOA()), TextUnitType.m3892boximpl(companion.m3900getSpUIouoOA()), TextUnitType.m3892boximpl(companion.m3899getEmUIouoOA())};
        Unspecified = TextUnitKt.pack(0L, Float.NaN);
    }

    private /* synthetic */ TextUnit(long j) {
        this.packedValue = j;
    }

    /* JADX INFO: renamed from: compareTo--R2X_6o, reason: not valid java name */
    public static final int m3858compareToR2X_6o(long j, long j2) {
        TextUnitKt.m3881checkArithmeticNB67dxo(j, j2);
        return Float.compare(m3867getValueimpl(j), m3867getValueimpl(j2));
    }

    /* JADX INFO: renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m3860divkPz2Gy4(long j, double d) {
        TextUnitKt.m3880checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m3865getRawTypeimpl(j), (float) (((double) m3867getValueimpl(j)) / d));
    }

    /* JADX INFO: renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m3871timeskPz2Gy4(long j, double d) {
        TextUnitKt.m3880checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m3865getRawTypeimpl(j), (float) (((double) m3867getValueimpl(j)) * d));
    }

    /* JADX INFO: renamed from: unaryMinus-XSAIIZE, reason: not valid java name */
    public static final long m3875unaryMinusXSAIIZE(long j) {
        TextUnitKt.m3880checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m3865getRawTypeimpl(j), -m3867getValueimpl(j));
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3874toStringimpl(long j) {
        long jM3866getTypeUIouoOA = m3866getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m3895equalsimpl0(jM3866getTypeUIouoOA, companion.m3901getUnspecifiedUIouoOA())) {
            return "Unspecified";
        }
        if (TextUnitType.m3895equalsimpl0(jM3866getTypeUIouoOA, companion.m3900getSpUIouoOA())) {
            return m3867getValueimpl(j) + ".sp";
        }
        if (!TextUnitType.m3895equalsimpl0(jM3866getTypeUIouoOA, companion.m3899getEmUIouoOA())) {
            return "Invalid";
        }
        return m3867getValueimpl(j) + ".em";
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3863equalsimpl(long j, Object obj) {
        return (obj instanceof TextUnit) && j == ((TextUnit) obj).m3876unboximpl();
    }

    /* JADX INFO: renamed from: getValue-impl, reason: not valid java name */
    public static final float m3867getValueimpl(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m3861divkPz2Gy4(long j, float f) {
        TextUnitKt.m3880checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m3865getRawTypeimpl(j), m3867getValueimpl(j) / f);
    }

    /* JADX INFO: renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m3872timeskPz2Gy4(long j, float f) {
        TextUnitKt.m3880checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m3865getRawTypeimpl(j), m3867getValueimpl(j) * f);
    }

    /* JADX INFO: renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m3862divkPz2Gy4(long j, int i) {
        TextUnitKt.m3880checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m3865getRawTypeimpl(j), m3867getValueimpl(j) / i);
    }

    /* JADX INFO: renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m3873timeskPz2Gy4(long j, int i) {
        TextUnitKt.m3880checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m3865getRawTypeimpl(j), m3867getValueimpl(j) * i);
    }
}
