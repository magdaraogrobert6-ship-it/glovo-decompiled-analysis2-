package androidx.compose.ui.input.pointer;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class PointerType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unknown = m2144constructorimpl(0);
    private static final int Touch = m2144constructorimpl(1);
    private static final int Mouse = m2144constructorimpl(2);
    private static final int Stylus = m2144constructorimpl(3);
    private static final int Eraser = m2144constructorimpl(4);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m2144constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2146equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2147hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2149unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerType m2143boximpl(int i) {
        return new PointerType(i);
    }

    public boolean equals(Object obj) {
        return m2145equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2147hashCodeimpl(this.value);
    }

    public String toString() {
        return m2148toStringimpl(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getEraser-T8wyACA, reason: not valid java name */
        public final int m2150getEraserT8wyACA() {
            return PointerType.Eraser;
        }

        /* JADX INFO: renamed from: getMouse-T8wyACA, reason: not valid java name */
        public final int m2151getMouseT8wyACA() {
            return PointerType.Mouse;
        }

        /* JADX INFO: renamed from: getStylus-T8wyACA, reason: not valid java name */
        public final int m2152getStylusT8wyACA() {
            return PointerType.Stylus;
        }

        /* JADX INFO: renamed from: getTouch-T8wyACA, reason: not valid java name */
        public final int m2153getTouchT8wyACA() {
            return PointerType.Touch;
        }

        /* JADX INFO: renamed from: getUnknown-T8wyACA, reason: not valid java name */
        public final int m2154getUnknownT8wyACA() {
            return PointerType.Unknown;
        }

        private Companion() {
        }
    }

    private /* synthetic */ PointerType(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2145equalsimpl(int i, Object obj) {
        return (obj instanceof PointerType) && i == ((PointerType) obj).m2149unboximpl();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2148toStringimpl(int i) {
        if (i == 1) {
            return "Touch";
        }
        if (i == 2) {
            return "Mouse";
        }
        if (i == 3) {
            return "Stylus";
        }
        if (i != 4) {
            return "Unknown";
        }
        return "Eraser";
    }
}
