package androidx.compose.ui.graphics.colorspace;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class RenderIntent {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Perceptual = m1176constructorimpl(0);
    private static final int Relative = m1176constructorimpl(1);
    private static final int Saturation = m1176constructorimpl(2);
    private static final int Absolute = m1176constructorimpl(3);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m1176constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1178equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1179hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1181unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ RenderIntent m1175boximpl(int i) {
        return new RenderIntent(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1180toStringimpl(int i) {
        if (m1178equalsimpl0(i, Perceptual)) {
            return "Perceptual";
        }
        if (m1178equalsimpl0(i, Relative)) {
            return "Relative";
        }
        if (m1178equalsimpl0(i, Saturation)) {
            return "Saturation";
        }
        return m1178equalsimpl0(i, Absolute) ? "Absolute" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m1177equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1179hashCodeimpl(this.value);
    }

    public String toString() {
        return m1180toStringimpl(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getAbsolute-uksYyKA, reason: not valid java name */
        public final int m1182getAbsoluteuksYyKA() {
            return RenderIntent.Absolute;
        }

        /* JADX INFO: renamed from: getPerceptual-uksYyKA, reason: not valid java name */
        public final int m1183getPerceptualuksYyKA() {
            return RenderIntent.Perceptual;
        }

        /* JADX INFO: renamed from: getRelative-uksYyKA, reason: not valid java name */
        public final int m1184getRelativeuksYyKA() {
            return RenderIntent.Relative;
        }

        /* JADX INFO: renamed from: getSaturation-uksYyKA, reason: not valid java name */
        public final int m1185getSaturationuksYyKA() {
            return RenderIntent.Saturation;
        }

        private Companion() {
        }
    }

    private /* synthetic */ RenderIntent(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1177equalsimpl(int i, Object obj) {
        return (obj instanceof RenderIntent) && i == ((RenderIntent) obj).m1181unboximpl();
    }
}
