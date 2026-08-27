package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class PaintingStyle {
    public static final Companion Companion = new Companion(null);
    private static final int Fill = m1000constructorimpl(0);
    private static final int Stroke = m1000constructorimpl(1);
    private final int value;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m1000constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1002equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1003hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1005unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PaintingStyle m999boximpl(int i) {
        return new PaintingStyle(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1004toStringimpl(int i) {
        if (m1002equalsimpl0(i, Fill)) {
            return "Fill";
        }
        return m1002equalsimpl0(i, Stroke) ? "Stroke" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m1001equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1003hashCodeimpl(this.value);
    }

    public String toString() {
        return m1004toStringimpl(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getFill-TiuSbCo, reason: not valid java name */
        public final int m1006getFillTiuSbCo() {
            return PaintingStyle.Fill;
        }

        /* JADX INFO: renamed from: getStroke-TiuSbCo, reason: not valid java name */
        public final int m1007getStrokeTiuSbCo() {
            return PaintingStyle.Stroke;
        }

        private Companion() {
        }
    }

    private /* synthetic */ PaintingStyle(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1001equalsimpl(int i, Object obj) {
        return (obj instanceof PaintingStyle) && i == ((PaintingStyle) obj).m1005unboximpl();
    }
}
