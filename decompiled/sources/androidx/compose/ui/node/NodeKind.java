package androidx.compose.ui.node;

import bo.app.m1$$ExternalSyntheticOutline0;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class NodeKind<T> {
    private final int mask;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <T> int m2551constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2553equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2554hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: or-H91voCI, reason: not valid java name */
    public static final int m2555orH91voCI(int i, int i2) {
        return i | i2;
    }

    /* JADX INFO: renamed from: or-impl, reason: not valid java name */
    public static final int m2556orimpl(int i, int i2) {
        return i | i2;
    }

    public final int getMask() {
        return this.mask;
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2558unboximpl() {
        return this.mask;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ NodeKind m2550boximpl(int i) {
        return new NodeKind(i);
    }

    public boolean equals(Object obj) {
        return m2552equalsimpl(this.mask, obj);
    }

    public int hashCode() {
        return m2554hashCodeimpl(this.mask);
    }

    public String toString() {
        return m2557toStringimpl(this.mask);
    }

    private /* synthetic */ NodeKind(int i) {
        this.mask = i;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2557toStringimpl(int i) {
        return m1$$ExternalSyntheticOutline0.m("NodeKind(mask=", i, ')');
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2552equalsimpl(int i, Object obj) {
        return (obj instanceof NodeKind) && i == ((NodeKind) obj).m2558unboximpl();
    }
}
