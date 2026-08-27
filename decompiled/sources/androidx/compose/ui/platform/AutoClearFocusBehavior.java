package androidx.compose.ui.platform;

import bo.app.m1$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class AutoClearFocusBehavior {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = m2696constructorimpl(0);
    private static final int CursorBased = m2696constructorimpl(1);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m2696constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2698equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2699hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2701unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AutoClearFocusBehavior m2695boximpl(int i) {
        return new AutoClearFocusBehavior(i);
    }

    public boolean equals(Object obj) {
        return m2697equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2699hashCodeimpl(this.value);
    }

    public String toString() {
        return m2700toStringimpl(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getCursorBased-4UtRPd4, reason: not valid java name */
        public final int m2702getCursorBased4UtRPd4() {
            return AutoClearFocusBehavior.CursorBased;
        }

        /* JADX INFO: renamed from: getDefault-4UtRPd4, reason: not valid java name */
        public final int m2703getDefault4UtRPd4() {
            return m2702getCursorBased4UtRPd4();
        }

        /* JADX INFO: renamed from: getNone-4UtRPd4, reason: not valid java name */
        public final int m2704getNone4UtRPd4() {
            return AutoClearFocusBehavior.None;
        }

        private Companion() {
        }
    }

    private /* synthetic */ AutoClearFocusBehavior(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2700toStringimpl(int i) {
        return m1$$ExternalSyntheticOutline0.m("AutoClearFocusBehavior(value=", i, ')');
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2697equalsimpl(int i, Object obj) {
        return (obj instanceof AutoClearFocusBehavior) && i == ((AutoClearFocusBehavior) obj).m2701unboximpl();
    }
}
