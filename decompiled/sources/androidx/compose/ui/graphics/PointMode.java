package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes4.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class PointMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Points = m1038constructorimpl(0);
    private static final int Lines = m1038constructorimpl(1);
    private static final int Polygon = m1038constructorimpl(2);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m1038constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1040equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1041hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1043unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointMode m1037boximpl(int i) {
        return new PointMode(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1042toStringimpl(int i) {
        if (m1040equalsimpl0(i, Points)) {
            return "Points";
        }
        if (m1040equalsimpl0(i, Lines)) {
            return "Lines";
        }
        return m1040equalsimpl0(i, Polygon) ? "Polygon" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m1039equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1041hashCodeimpl(this.value);
    }

    public String toString() {
        return m1042toStringimpl(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getLines-r_lszbg, reason: not valid java name */
        public final int m1044getLinesr_lszbg() {
            return PointMode.Lines;
        }

        /* JADX INFO: renamed from: getPoints-r_lszbg, reason: not valid java name */
        public final int m1045getPointsr_lszbg() {
            return PointMode.Points;
        }

        /* JADX INFO: renamed from: getPolygon-r_lszbg, reason: not valid java name */
        public final int m1046getPolygonr_lszbg() {
            return PointMode.Polygon;
        }

        private Companion() {
        }
    }

    private /* synthetic */ PointMode(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1039equalsimpl(int i, Object obj) {
        return (obj instanceof PointMode) && i == ((PointMode) obj).m1043unboximpl();
    }
}
