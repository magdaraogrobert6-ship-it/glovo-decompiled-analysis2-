package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class ImageBitmapConfig {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Argb8888 = m949constructorimpl(0);
    private static final int Alpha8 = m949constructorimpl(1);
    private static final int Rgb565 = m949constructorimpl(2);
    private static final int F16 = m949constructorimpl(3);
    private static final int Gpu = m949constructorimpl(4);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m949constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m951equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m952hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m954unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ImageBitmapConfig m948boximpl(int i) {
        return new ImageBitmapConfig(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m953toStringimpl(int i) {
        if (m951equalsimpl0(i, Argb8888)) {
            return "Argb8888";
        }
        if (m951equalsimpl0(i, Alpha8)) {
            return "Alpha8";
        }
        if (m951equalsimpl0(i, Rgb565)) {
            return "Rgb565";
        }
        if (m951equalsimpl0(i, F16)) {
            return "F16";
        }
        return m951equalsimpl0(i, Gpu) ? "Gpu" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m950equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m952hashCodeimpl(this.value);
    }

    public String toString() {
        return m953toStringimpl(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getAlpha8-_sVssgQ, reason: not valid java name */
        public final int m955getAlpha8_sVssgQ() {
            return ImageBitmapConfig.Alpha8;
        }

        /* JADX INFO: renamed from: getArgb8888-_sVssgQ, reason: not valid java name */
        public final int m956getArgb8888_sVssgQ() {
            return ImageBitmapConfig.Argb8888;
        }

        /* JADX INFO: renamed from: getF16-_sVssgQ, reason: not valid java name */
        public final int m957getF16_sVssgQ() {
            return ImageBitmapConfig.F16;
        }

        /* JADX INFO: renamed from: getGpu-_sVssgQ, reason: not valid java name */
        public final int m958getGpu_sVssgQ() {
            return ImageBitmapConfig.Gpu;
        }

        /* JADX INFO: renamed from: getRgb565-_sVssgQ, reason: not valid java name */
        public final int m959getRgb565_sVssgQ() {
            return ImageBitmapConfig.Rgb565;
        }

        private Companion() {
        }
    }

    private /* synthetic */ ImageBitmapConfig(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m950equalsimpl(int i, Object obj) {
        return (obj instanceof ImageBitmapConfig) && i == ((ImageBitmapConfig) obj).m954unboximpl();
    }
}
