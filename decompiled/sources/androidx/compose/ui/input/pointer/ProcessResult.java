package androidx.compose.ui.input.pointer;

import bo.app.m1$$ExternalSyntheticOutline0;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class ProcessResult {
    private final int value;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m2158constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2160equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: getAnyChangeConsumed-impl, reason: not valid java name */
    public static final boolean m2161getAnyChangeConsumedimpl(int i) {
        return (i & 4) != 0;
    }

    /* JADX INFO: renamed from: getAnyMovementConsumed-impl, reason: not valid java name */
    public static final boolean m2162getAnyMovementConsumedimpl(int i) {
        return (i & 2) != 0;
    }

    /* JADX INFO: renamed from: getDispatchedToAPointerInputModifier-impl, reason: not valid java name */
    public static final boolean m2163getDispatchedToAPointerInputModifierimpl(int i) {
        return (i & 1) != 0;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2164hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2166unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ProcessResult m2157boximpl(int i) {
        return new ProcessResult(i);
    }

    public boolean equals(Object obj) {
        return m2159equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2164hashCodeimpl(this.value);
    }

    public String toString() {
        return m2165toStringimpl(this.value);
    }

    private /* synthetic */ ProcessResult(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2165toStringimpl(int i) {
        return m1$$ExternalSyntheticOutline0.m("ProcessResult(value=", i, ')');
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2159equalsimpl(int i, Object obj) {
        return (obj instanceof ProcessResult) && i == ((ProcessResult) obj).m2166unboximpl();
    }
}
