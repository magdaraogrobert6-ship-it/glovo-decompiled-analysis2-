package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class TileMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Clamp = m1114constructorimpl(0);
    private static final int Repeated = m1114constructorimpl(1);
    private static final int Mirror = m1114constructorimpl(2);
    private static final int Decal = m1114constructorimpl(3);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m1114constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1116equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1117hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1119unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TileMode m1113boximpl(int i) {
        return new TileMode(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1118toStringimpl(int i) {
        if (m1116equalsimpl0(i, Clamp)) {
            return "Clamp";
        }
        if (m1116equalsimpl0(i, Repeated)) {
            return "Repeated";
        }
        if (m1116equalsimpl0(i, Mirror)) {
            return "Mirror";
        }
        return m1116equalsimpl0(i, Decal) ? "Decal" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m1115equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1117hashCodeimpl(this.value);
    }

    public String toString() {
        return m1118toStringimpl(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getClamp-3opZhB0, reason: not valid java name */
        public final int m1120getClamp3opZhB0() {
            return TileMode.Clamp;
        }

        /* JADX INFO: renamed from: getDecal-3opZhB0, reason: not valid java name */
        public final int m1121getDecal3opZhB0() {
            return TileMode.Decal;
        }

        /* JADX INFO: renamed from: getMirror-3opZhB0, reason: not valid java name */
        public final int m1122getMirror3opZhB0() {
            return TileMode.Mirror;
        }

        /* JADX INFO: renamed from: getRepeated-3opZhB0, reason: not valid java name */
        public final int m1123getRepeated3opZhB0() {
            return TileMode.Repeated;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TileMode(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1115equalsimpl(int i, Object obj) {
        return (obj instanceof TileMode) && i == ((TileMode) obj).m1119unboximpl();
    }
}
