package androidx.compose.ui.input.indirect;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class IndirectPointerEventType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unknown = m1563constructorimpl(0);
    private static final int Press = m1563constructorimpl(1);
    private static final int Release = m1563constructorimpl(2);
    private static final int Move = m1563constructorimpl(3);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m1563constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1565equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1566hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1568unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IndirectPointerEventType m1562boximpl(int i) {
        return new IndirectPointerEventType(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1567toStringimpl(int i) {
        if (m1565equalsimpl0(i, Press)) {
            return "Press";
        }
        if (m1565equalsimpl0(i, Release)) {
            return "Release";
        }
        return m1565equalsimpl0(i, Move) ? "Move" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m1564equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1566hashCodeimpl(this.value);
    }

    public String toString() {
        return m1567toStringimpl(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getMove-4ZHQPSE, reason: not valid java name */
        public final int m1569getMove4ZHQPSE() {
            return IndirectPointerEventType.Move;
        }

        /* JADX INFO: renamed from: getPress-4ZHQPSE, reason: not valid java name */
        public final int m1570getPress4ZHQPSE() {
            return IndirectPointerEventType.Press;
        }

        /* JADX INFO: renamed from: getRelease-4ZHQPSE, reason: not valid java name */
        public final int m1571getRelease4ZHQPSE() {
            return IndirectPointerEventType.Release;
        }

        /* JADX INFO: renamed from: getUnknown-4ZHQPSE, reason: not valid java name */
        public final int m1572getUnknown4ZHQPSE() {
            return IndirectPointerEventType.Unknown;
        }

        private Companion() {
        }
    }

    private /* synthetic */ IndirectPointerEventType(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1564equalsimpl(int i, Object obj) {
        return (obj instanceof IndirectPointerEventType) && i == ((IndirectPointerEventType) obj).m1568unboximpl();
    }
}
