package androidx.compose.ui.semantics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class LiveRegionMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Polite = m2799constructorimpl(0);
    private static final int Assertive = m2799constructorimpl(1);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m2799constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2801equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2802hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2804unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ LiveRegionMode m2798boximpl(int i) {
        return new LiveRegionMode(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2803toStringimpl(int i) {
        if (m2801equalsimpl0(i, Polite)) {
            return "Polite";
        }
        return m2801equalsimpl0(i, Assertive) ? "Assertive" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m2800equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2802hashCodeimpl(this.value);
    }

    public String toString() {
        return m2803toStringimpl(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getAssertive-0phEisY, reason: not valid java name */
        public final int m2805getAssertive0phEisY() {
            return LiveRegionMode.Assertive;
        }

        /* JADX INFO: renamed from: getPolite-0phEisY, reason: not valid java name */
        public final int m2806getPolite0phEisY() {
            return LiveRegionMode.Polite;
        }

        private Companion() {
        }
    }

    private /* synthetic */ LiveRegionMode(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2800equalsimpl(int i, Object obj) {
        return (obj instanceof LiveRegionMode) && i == ((LiveRegionMode) obj).m2804unboximpl();
    }
}
