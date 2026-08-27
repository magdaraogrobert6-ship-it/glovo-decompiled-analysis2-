package androidx.compose.ui.input.key;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class KeyEventType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unknown = m1892constructorimpl(0);
    private static final int KeyUp = m1892constructorimpl(1);
    private static final int KeyDown = m1892constructorimpl(2);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m1892constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1894equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1895hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1897unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyEventType m1891boximpl(int i) {
        return new KeyEventType(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1896toStringimpl(int i) {
        if (m1894equalsimpl0(i, KeyUp)) {
            return "KeyUp";
        }
        if (m1894equalsimpl0(i, KeyDown)) {
            return "KeyDown";
        }
        return m1894equalsimpl0(i, Unknown) ? "Unknown" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m1893equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1895hashCodeimpl(this.value);
    }

    public String toString() {
        return m1896toStringimpl(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getKeyDown-CS__XNY, reason: not valid java name */
        public final int m1898getKeyDownCS__XNY() {
            return KeyEventType.KeyDown;
        }

        /* JADX INFO: renamed from: getKeyUp-CS__XNY, reason: not valid java name */
        public final int m1899getKeyUpCS__XNY() {
            return KeyEventType.KeyUp;
        }

        /* JADX INFO: renamed from: getUnknown-CS__XNY, reason: not valid java name */
        public final int m1900getUnknownCS__XNY() {
            return KeyEventType.Unknown;
        }

        private Companion() {
        }
    }

    private /* synthetic */ KeyEventType(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1893equalsimpl(int i, Object obj) {
        return (obj instanceof KeyEventType) && i == ((KeyEventType) obj).m1897unboximpl();
    }
}
