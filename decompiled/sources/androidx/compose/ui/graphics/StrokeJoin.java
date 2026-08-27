package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class StrokeJoin {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Miter = m1103constructorimpl(0);
    private static final int Round = m1103constructorimpl(1);
    private static final int Bevel = m1103constructorimpl(2);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m1103constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1105equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1106hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1108unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StrokeJoin m1102boximpl(int i) {
        return new StrokeJoin(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1107toStringimpl(int i) {
        if (m1105equalsimpl0(i, Miter)) {
            return "Miter";
        }
        if (m1105equalsimpl0(i, Round)) {
            return "Round";
        }
        return m1105equalsimpl0(i, Bevel) ? "Bevel" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m1104equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1106hashCodeimpl(this.value);
    }

    public String toString() {
        return m1107toStringimpl(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getBevel-LxFBmk8, reason: not valid java name */
        public final int m1109getBevelLxFBmk8() {
            return StrokeJoin.Bevel;
        }

        /* JADX INFO: renamed from: getMiter-LxFBmk8, reason: not valid java name */
        public final int m1110getMiterLxFBmk8() {
            return StrokeJoin.Miter;
        }

        /* JADX INFO: renamed from: getRound-LxFBmk8, reason: not valid java name */
        public final int m1111getRoundLxFBmk8() {
            return StrokeJoin.Round;
        }

        private Companion() {
        }
    }

    private /* synthetic */ StrokeJoin(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1104equalsimpl(int i, Object obj) {
        return (obj instanceof StrokeJoin) && i == ((StrokeJoin) obj).m1108unboximpl();
    }
}
