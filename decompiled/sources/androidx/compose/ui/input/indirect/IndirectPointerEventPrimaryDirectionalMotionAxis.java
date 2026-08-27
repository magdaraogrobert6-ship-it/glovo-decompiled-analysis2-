package androidx.compose.ui.input.indirect;

import bo.app.m1$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class IndirectPointerEventPrimaryDirectionalMotionAxis {
    public static final Companion Companion = new Companion(null);
    private static final int None = m1553constructorimpl(0);
    private static final int X = m1553constructorimpl(1);
    private static final int Y = m1553constructorimpl(2);
    private final int value;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m1553constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1555equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1556hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1558unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IndirectPointerEventPrimaryDirectionalMotionAxis m1552boximpl(int i) {
        return new IndirectPointerEventPrimaryDirectionalMotionAxis(i);
    }

    public boolean equals(Object obj) {
        return m1554equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1556hashCodeimpl(this.value);
    }

    public String toString() {
        return m1557toStringimpl(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getNone-nZO2Niw, reason: not valid java name */
        public final int m1559getNonenZO2Niw() {
            return IndirectPointerEventPrimaryDirectionalMotionAxis.None;
        }

        /* JADX INFO: renamed from: getX-nZO2Niw, reason: not valid java name */
        public final int m1560getXnZO2Niw() {
            return IndirectPointerEventPrimaryDirectionalMotionAxis.X;
        }

        /* JADX INFO: renamed from: getY-nZO2Niw, reason: not valid java name */
        public final int m1561getYnZO2Niw() {
            return IndirectPointerEventPrimaryDirectionalMotionAxis.Y;
        }

        private Companion() {
        }
    }

    private /* synthetic */ IndirectPointerEventPrimaryDirectionalMotionAxis(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1557toStringimpl(int i) {
        return m1$$ExternalSyntheticOutline0.m("IndirectPointerEventPrimaryDirectionalMotionAxis(value=", i, ')');
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1554equalsimpl(int i, Object obj) {
        return (obj instanceof IndirectPointerEventPrimaryDirectionalMotionAxis) && i == ((IndirectPointerEventPrimaryDirectionalMotionAxis) obj).m1558unboximpl();
    }
}
