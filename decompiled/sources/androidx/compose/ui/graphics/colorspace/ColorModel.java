package androidx.compose.ui.graphics.colorspace;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class ColorModel {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Rgb = m1153constructorimpl(12884901888L);
    private static final long Xyz = m1153constructorimpl(12884901889L);
    private static final long Lab = m1153constructorimpl(12884901890L);
    private static final long Cmyk = m1153constructorimpl(17179869187L);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m1153constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1155equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getComponentCount$annotations() {
    }

    /* JADX INFO: renamed from: getComponentCount-impl, reason: not valid java name */
    public static final int m1156getComponentCountimpl(long j) {
        return (int) (j >> 32);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1157hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m1159unboximpl() {
        return this.packedValue;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ColorModel m1152boximpl(long j) {
        return new ColorModel(j);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1158toStringimpl(long j) {
        if (m1155equalsimpl0(j, Rgb)) {
            return "Rgb";
        }
        if (m1155equalsimpl0(j, Xyz)) {
            return "Xyz";
        }
        if (m1155equalsimpl0(j, Lab)) {
            return "Lab";
        }
        return m1155equalsimpl0(j, Cmyk) ? "Cmyk" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m1154equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m1157hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m1158toStringimpl(this.packedValue);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getCmyk-xdoWZVw, reason: not valid java name */
        public final long m1160getCmykxdoWZVw() {
            return ColorModel.Cmyk;
        }

        /* JADX INFO: renamed from: getLab-xdoWZVw, reason: not valid java name */
        public final long m1161getLabxdoWZVw() {
            return ColorModel.Lab;
        }

        /* JADX INFO: renamed from: getRgb-xdoWZVw, reason: not valid java name */
        public final long m1162getRgbxdoWZVw() {
            return ColorModel.Rgb;
        }

        /* JADX INFO: renamed from: getXyz-xdoWZVw, reason: not valid java name */
        public final long m1163getXyzxdoWZVw() {
            return ColorModel.Xyz;
        }

        private Companion() {
        }
    }

    private /* synthetic */ ColorModel(long j) {
        this.packedValue = j;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1154equalsimpl(long j, Object obj) {
        return (obj instanceof ColorModel) && j == ((ColorModel) obj).m1159unboximpl();
    }
}
