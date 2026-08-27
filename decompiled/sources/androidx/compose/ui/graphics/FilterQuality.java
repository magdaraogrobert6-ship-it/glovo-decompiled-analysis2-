package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class FilterQuality {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = m818constructorimpl(0);
    private static final int Low = m818constructorimpl(1);
    private static final int Medium = m818constructorimpl(2);
    private static final int High = m818constructorimpl(3);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m818constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m820equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m821hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m823unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FilterQuality m817boximpl(int i) {
        return new FilterQuality(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m822toStringimpl(int i) {
        if (m820equalsimpl0(i, None)) {
            return "None";
        }
        if (m820equalsimpl0(i, Low)) {
            return "Low";
        }
        if (m820equalsimpl0(i, Medium)) {
            return "Medium";
        }
        return m820equalsimpl0(i, High) ? "High" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m819equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m821hashCodeimpl(this.value);
    }

    public String toString() {
        return m822toStringimpl(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getHigh-f-v9h1I, reason: not valid java name */
        public final int m824getHighfv9h1I() {
            return FilterQuality.High;
        }

        /* JADX INFO: renamed from: getLow-f-v9h1I, reason: not valid java name */
        public final int m825getLowfv9h1I() {
            return FilterQuality.Low;
        }

        /* JADX INFO: renamed from: getMedium-f-v9h1I, reason: not valid java name */
        public final int m826getMediumfv9h1I() {
            return FilterQuality.Medium;
        }

        /* JADX INFO: renamed from: getNone-f-v9h1I, reason: not valid java name */
        public final int m827getNonefv9h1I() {
            return FilterQuality.None;
        }

        private Companion() {
        }
    }

    private /* synthetic */ FilterQuality(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m819equalsimpl(int i, Object obj) {
        return (obj instanceof FilterQuality) && i == ((FilterQuality) obj).m823unboximpl();
    }
}
