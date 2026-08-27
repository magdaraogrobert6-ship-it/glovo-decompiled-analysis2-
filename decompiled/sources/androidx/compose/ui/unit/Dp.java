package androidx.compose.ui.unit;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class Dp implements Comparable<Dp> {
    public static final Companion Companion = new Companion(null);
    private static final float Hairline = m3673constructorimpl(0.0f);
    private static final float Infinity = m3673constructorimpl(Float.POSITIVE_INFINITY);
    private static final float Unspecified = m3673constructorimpl(Float.NaN);
    private final float value;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static float m3673constructorimpl(float f) {
        return f;
    }

    /* JADX INFO: renamed from: div-0680j_4, reason: not valid java name */
    public static final float m3674div0680j_4(float f, float f2) {
        return f / f2;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3678equalsimpl0(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3679hashCodeimpl(float f) {
        return Float.hashCode(f);
    }

    /* JADX INFO: renamed from: minus-5rwHm24, reason: not valid java name */
    public static final float m3680minus5rwHm24(float f, float f2) {
        return m3673constructorimpl(f - f2);
    }

    /* JADX INFO: renamed from: plus-5rwHm24, reason: not valid java name */
    public static final float m3681plus5rwHm24(float f, float f2) {
        return m3673constructorimpl(f + f2);
    }

    /* JADX INFO: renamed from: unaryMinus-D9Ej5fM, reason: not valid java name */
    public static final float m3685unaryMinusD9Ej5fM(float f) {
        return m3673constructorimpl(-f);
    }

    public final float getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m3687unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Dp m3671boximpl(float f) {
        return new Dp(f);
    }

    /* JADX INFO: renamed from: div-u2uoSUM, reason: not valid java name */
    public static final float m3676divu2uoSUM(float f, int i) {
        return m3673constructorimpl(f / i);
    }

    /* JADX INFO: renamed from: times-u2uoSUM, reason: not valid java name */
    public static final float m3683timesu2uoSUM(float f, int i) {
        return m3673constructorimpl(f * i);
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Dp dp) {
        return m3686compareTo0680j_4(dp.m3687unboximpl());
    }

    public boolean equals(Object obj) {
        return m3677equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3679hashCodeimpl(this.value);
    }

    public String toString() {
        return m3684toStringimpl(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getHairline-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m3688getHairlineD9Ej5fM$annotations() {
        }

        /* JADX INFO: renamed from: getInfinity-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m3689getInfinityD9Ej5fM$annotations() {
        }

        /* JADX INFO: renamed from: getUnspecified-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m3690getUnspecifiedD9Ej5fM$annotations() {
        }

        /* JADX INFO: renamed from: getHairline-D9Ej5fM, reason: not valid java name */
        public final float m3691getHairlineD9Ej5fM() {
            return Dp.Hairline;
        }

        /* JADX INFO: renamed from: getInfinity-D9Ej5fM, reason: not valid java name */
        public final float m3692getInfinityD9Ej5fM() {
            return Dp.Infinity;
        }

        /* JADX INFO: renamed from: getUnspecified-D9Ej5fM, reason: not valid java name */
        public final float m3693getUnspecifiedD9Ej5fM() {
            return Dp.Unspecified;
        }

        private Companion() {
        }
    }

    private /* synthetic */ Dp(float f) {
        this.value = f;
    }

    /* JADX INFO: renamed from: compareTo-0680j_4, reason: not valid java name */
    public static int m3672compareTo0680j_4(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return 0;
        }
        return Float.compare(f, f2);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3677equalsimpl(float f, Object obj) {
        return (obj instanceof Dp) && Float.compare(f, ((Dp) obj).m3687unboximpl()) == 0;
    }

    /* JADX INFO: renamed from: div-u2uoSUM, reason: not valid java name */
    public static final float m3675divu2uoSUM(float f, float f2) {
        return m3673constructorimpl(f / f2);
    }

    /* JADX INFO: renamed from: times-u2uoSUM, reason: not valid java name */
    public static final float m3682timesu2uoSUM(float f, float f2) {
        return m3673constructorimpl(f * f2);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3684toStringimpl(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    /* JADX INFO: renamed from: compareTo-0680j_4, reason: not valid java name */
    public int m3686compareTo0680j_4(float f) {
        return m3672compareTo0680j_4(this.value, f);
    }
}
