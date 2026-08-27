package androidx.compose.ui.text.style;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class BaselineShift {
    private final float multiplier;
    public static final Companion Companion = new Companion(null);
    private static final float Superscript = m3374constructorimpl(0.5f);
    private static final float Subscript = m3374constructorimpl(-0.5f);
    private static final float None = m3374constructorimpl(0.0f);
    private static final float Unspecified = m3374constructorimpl(Float.NaN);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static float m3374constructorimpl(float f) {
        return f;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3376equalsimpl0(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3377hashCodeimpl(float f) {
        return Float.hashCode(f);
    }

    public final float getMultiplier() {
        return this.multiplier;
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m3379unboximpl() {
        return this.multiplier;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ BaselineShift m3373boximpl(float f) {
        return new BaselineShift(f);
    }

    public boolean equals(Object obj) {
        return m3375equalsimpl(this.multiplier, obj);
    }

    public int hashCode() {
        return m3377hashCodeimpl(this.multiplier);
    }

    public String toString() {
        return m3378toStringimpl(this.multiplier);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getNone-y9eOQZs$annotations, reason: not valid java name */
        public static /* synthetic */ void m3380getNoney9eOQZs$annotations() {
        }

        /* JADX INFO: renamed from: getSubscript-y9eOQZs$annotations, reason: not valid java name */
        public static /* synthetic */ void m3381getSubscripty9eOQZs$annotations() {
        }

        /* JADX INFO: renamed from: getSuperscript-y9eOQZs$annotations, reason: not valid java name */
        public static /* synthetic */ void m3382getSuperscripty9eOQZs$annotations() {
        }

        /* JADX INFO: renamed from: getUnspecified-y9eOQZs$annotations, reason: not valid java name */
        public static /* synthetic */ void m3383getUnspecifiedy9eOQZs$annotations() {
        }

        /* JADX INFO: renamed from: getNone-y9eOQZs, reason: not valid java name */
        public final float m3384getNoney9eOQZs() {
            return BaselineShift.None;
        }

        /* JADX INFO: renamed from: getSubscript-y9eOQZs, reason: not valid java name */
        public final float m3385getSubscripty9eOQZs() {
            return BaselineShift.Subscript;
        }

        /* JADX INFO: renamed from: getSuperscript-y9eOQZs, reason: not valid java name */
        public final float m3386getSuperscripty9eOQZs() {
            return BaselineShift.Superscript;
        }

        /* JADX INFO: renamed from: getUnspecified-y9eOQZs, reason: not valid java name */
        public final float m3387getUnspecifiedy9eOQZs() {
            return BaselineShift.Unspecified;
        }

        private Companion() {
        }
    }

    private /* synthetic */ BaselineShift(float f) {
        this.multiplier = f;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3378toStringimpl(float f) {
        return "BaselineShift(multiplier=" + f + ')';
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3375equalsimpl(float f, Object obj) {
        return (obj instanceof BaselineShift) && Float.compare(f, ((BaselineShift) obj).m3379unboximpl()) == 0;
    }
}
