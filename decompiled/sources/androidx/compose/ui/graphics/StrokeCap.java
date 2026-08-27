package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class StrokeCap {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Butt = m1093constructorimpl(0);
    private static final int Round = m1093constructorimpl(1);
    private static final int Square = m1093constructorimpl(2);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m1093constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1095equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1096hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1098unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StrokeCap m1092boximpl(int i) {
        return new StrokeCap(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1097toStringimpl(int i) {
        if (m1095equalsimpl0(i, Butt)) {
            return "Butt";
        }
        if (m1095equalsimpl0(i, Round)) {
            return "Round";
        }
        return m1095equalsimpl0(i, Square) ? "Square" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m1094equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1096hashCodeimpl(this.value);
    }

    public String toString() {
        return m1097toStringimpl(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getButt-KaPHkGw, reason: not valid java name */
        public final int m1099getButtKaPHkGw() {
            return StrokeCap.Butt;
        }

        /* JADX INFO: renamed from: getRound-KaPHkGw, reason: not valid java name */
        public final int m1100getRoundKaPHkGw() {
            return StrokeCap.Round;
        }

        /* JADX INFO: renamed from: getSquare-KaPHkGw, reason: not valid java name */
        public final int m1101getSquareKaPHkGw() {
            return StrokeCap.Square;
        }

        private Companion() {
        }
    }

    private /* synthetic */ StrokeCap(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1094equalsimpl(int i, Object obj) {
        return (obj instanceof StrokeCap) && i == ((StrokeCap) obj).m1098unboximpl();
    }
}
