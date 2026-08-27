package androidx.compose.ui.input.pointer;

import bo.app.m1$$ExternalSyntheticOutline0;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class PointerButtons {
    private final int packedValue;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m1995constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1997equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1998hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2000unboximpl() {
        return this.packedValue;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerButtons m1994boximpl(int i) {
        return new PointerButtons(i);
    }

    public boolean equals(Object obj) {
        return m1996equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m1998hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m1999toStringimpl(this.packedValue);
    }

    private /* synthetic */ PointerButtons(int i) {
        this.packedValue = i;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1999toStringimpl(int i) {
        return m1$$ExternalSyntheticOutline0.m("PointerButtons(packedValue=", i, ')');
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1996equalsimpl(int i, Object obj) {
        return (obj instanceof PointerButtons) && i == ((PointerButtons) obj).m2000unboximpl();
    }
}
