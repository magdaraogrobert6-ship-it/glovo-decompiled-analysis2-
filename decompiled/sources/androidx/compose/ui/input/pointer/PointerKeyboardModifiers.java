package androidx.compose.ui.input.pointer;

import bo.app.m1$$ExternalSyntheticOutline0;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class PointerKeyboardModifiers {
    private final int packedValue;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m2137constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2139equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2140hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2142unboximpl() {
        return this.packedValue;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerKeyboardModifiers m2136boximpl(int i) {
        return new PointerKeyboardModifiers(i);
    }

    public boolean equals(Object obj) {
        return m2138equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m2140hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m2141toStringimpl(this.packedValue);
    }

    private /* synthetic */ PointerKeyboardModifiers(int i) {
        this.packedValue = i;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2141toStringimpl(int i) {
        return m1$$ExternalSyntheticOutline0.m("PointerKeyboardModifiers(packedValue=", i, ')');
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2138equalsimpl(int i, Object obj) {
        return (obj instanceof PointerKeyboardModifiers) && i == ((PointerKeyboardModifiers) obj).m2142unboximpl();
    }
}
