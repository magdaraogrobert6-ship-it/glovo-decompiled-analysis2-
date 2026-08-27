package androidx.compose.ui.text.font;

import bo.app.m1$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class FontLoadingStrategy {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Blocking = m3175constructorimpl(0);
    private static final int OptionalLocal = m3175constructorimpl(1);
    private static final int Async = m3175constructorimpl(2);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m3175constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3177equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3178hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3180unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FontLoadingStrategy m3174boximpl(int i) {
        return new FontLoadingStrategy(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3179toStringimpl(int i) {
        if (m3177equalsimpl0(i, Blocking)) {
            return "Blocking";
        }
        if (m3177equalsimpl0(i, OptionalLocal)) {
            return "Optional";
        }
        return m3177equalsimpl0(i, Async) ? "Async" : m1$$ExternalSyntheticOutline0.m("Invalid(value=", i, ')');
    }

    public boolean equals(Object obj) {
        return m3176equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3178hashCodeimpl(this.value);
    }

    public String toString() {
        return m3179toStringimpl(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getAsync-PKNRLFQ, reason: not valid java name */
        public final int m3181getAsyncPKNRLFQ() {
            return FontLoadingStrategy.Async;
        }

        /* JADX INFO: renamed from: getBlocking-PKNRLFQ, reason: not valid java name */
        public final int m3182getBlockingPKNRLFQ() {
            return FontLoadingStrategy.Blocking;
        }

        /* JADX INFO: renamed from: getOptionalLocal-PKNRLFQ, reason: not valid java name */
        public final int m3183getOptionalLocalPKNRLFQ() {
            return FontLoadingStrategy.OptionalLocal;
        }

        private Companion() {
        }
    }

    private /* synthetic */ FontLoadingStrategy(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3176equalsimpl(int i, Object obj) {
        return (obj instanceof FontLoadingStrategy) && i == ((FontLoadingStrategy) obj).m3180unboximpl();
    }
}
