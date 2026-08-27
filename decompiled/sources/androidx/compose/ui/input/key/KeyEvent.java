package androidx.compose.ui.input.key;

import o.getCieXyz;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class KeyEvent {
    private final android.view.KeyEvent nativeKeyEvent;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static android.view.KeyEvent m1885constructorimpl(android.view.KeyEvent keyEvent) {
        return keyEvent;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1887equalsimpl0(android.view.KeyEvent keyEvent, android.view.KeyEvent keyEvent2) {
        int iWrite = getCieXyz.write();
        int iWrite2 = getCieXyz.write();
        int iWrite3 = getCieXyz.write();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{keyEvent, keyEvent2}, iWrite3)).booleanValue();
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1888hashCodeimpl(android.view.KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    public final android.view.KeyEvent getNativeKeyEvent() {
        return this.nativeKeyEvent;
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ android.view.KeyEvent m1890unboximpl() {
        return this.nativeKeyEvent;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyEvent m1884boximpl(android.view.KeyEvent keyEvent) {
        return new KeyEvent(keyEvent);
    }

    public boolean equals(Object obj) {
        return m1886equalsimpl(this.nativeKeyEvent, obj);
    }

    public int hashCode() {
        return m1888hashCodeimpl(this.nativeKeyEvent);
    }

    public String toString() {
        return m1889toStringimpl(this.nativeKeyEvent);
    }

    private /* synthetic */ KeyEvent(android.view.KeyEvent keyEvent) {
        this.nativeKeyEvent = keyEvent;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1889toStringimpl(android.view.KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1886equalsimpl(android.view.KeyEvent keyEvent, Object obj) {
        if (!(obj instanceof KeyEvent)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{keyEvent, ((KeyEvent) obj).m1890unboximpl()}, getCieXyz.write())).booleanValue();
    }
}
