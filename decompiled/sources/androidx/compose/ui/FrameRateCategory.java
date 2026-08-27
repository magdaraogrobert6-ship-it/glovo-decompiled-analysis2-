package androidx.compose.ui;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class FrameRateCategory {
    private final float value;
    public static final Companion Companion = new Companion(null);
    private static final float Default = m141constructorimpl(Float.NaN);
    private static final float Normal = m141constructorimpl(-3.0f);
    private static final float High = m141constructorimpl(-4.0f);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static float m141constructorimpl(float f) {
        return f;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m143equalsimpl0(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m144hashCodeimpl(float f) {
        return Float.hashCode(f);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m146unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FrameRateCategory m140boximpl(float f) {
        return new FrameRateCategory(f);
    }

    public boolean equals(Object obj) {
        return m142equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m144hashCodeimpl(this.value);
    }

    public String toString() {
        return m145toStringimpl(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getDefault-NSsRyOo, reason: not valid java name */
        public final float m147getDefaultNSsRyOo() {
            return FrameRateCategory.Default;
        }

        /* JADX INFO: renamed from: getHigh-NSsRyOo, reason: not valid java name */
        public final float m148getHighNSsRyOo() {
            return FrameRateCategory.High;
        }

        /* JADX INFO: renamed from: getNormal-NSsRyOo, reason: not valid java name */
        public final float m149getNormalNSsRyOo() {
            return FrameRateCategory.Normal;
        }

        private Companion() {
        }
    }

    private /* synthetic */ FrameRateCategory(float f) {
        this.value = f;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m142equalsimpl(float f, Object obj) {
        return (obj instanceof FrameRateCategory) && Float.compare(f, ((FrameRateCategory) obj).m146unboximpl()) == 0;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m145toStringimpl(float f) {
        if (f == -3.0f) {
            return "Normal";
        }
        if (f == -4.0f) {
            return "High";
        }
        return "Default";
    }
}
