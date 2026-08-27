package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes4.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class VertexMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Triangles = m1141constructorimpl(0);
    private static final int TriangleStrip = m1141constructorimpl(1);
    private static final int TriangleFan = m1141constructorimpl(2);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m1141constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1143equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1144hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1146unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ VertexMode m1140boximpl(int i) {
        return new VertexMode(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1145toStringimpl(int i) {
        if (m1143equalsimpl0(i, Triangles)) {
            return "Triangles";
        }
        if (m1143equalsimpl0(i, TriangleStrip)) {
            return "TriangleStrip";
        }
        return m1143equalsimpl0(i, TriangleFan) ? "TriangleFan" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m1142equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1144hashCodeimpl(this.value);
    }

    public String toString() {
        return m1145toStringimpl(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getTriangleFan-c2xauaI, reason: not valid java name */
        public final int m1147getTriangleFanc2xauaI() {
            return VertexMode.TriangleFan;
        }

        /* JADX INFO: renamed from: getTriangleStrip-c2xauaI, reason: not valid java name */
        public final int m1148getTriangleStripc2xauaI() {
            return VertexMode.TriangleStrip;
        }

        /* JADX INFO: renamed from: getTriangles-c2xauaI, reason: not valid java name */
        public final int m1149getTrianglesc2xauaI() {
            return VertexMode.Triangles;
        }

        private Companion() {
        }
    }

    private /* synthetic */ VertexMode(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1142equalsimpl(int i, Object obj) {
        return (obj instanceof VertexMode) && i == ((VertexMode) obj).m1146unboximpl();
    }
}
