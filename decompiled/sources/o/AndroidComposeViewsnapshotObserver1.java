package o;

import com.google.firebase.sessions.settings.SessionsSettings;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidComposeViewsnapshotObserver1 implements accessgetFocusedVirtualViewIdp {
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;
    public final accessgetCurrentlyFocusedANIp write;

    public /* synthetic */ AndroidComposeViewsnapshotObserver1(accessgetCurrentlyFocusedANIp accessgetcurrentlyfocusedanip, accessgetCurrentlyFocusedANIp accessgetcurrentlyfocusedanip2, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = accessgetcurrentlyfocusedanip;
        this.write = accessgetcurrentlyfocusedanip2;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = this.serializer;
        accessgetCurrentlyFocusedANIp accessgetcurrentlyfocusedanip = this.write;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.RemoteActionCompatParcelizer;
        return i != 0 ? new SessionsSettings((boundsInScreen) r8lambdaktwlyipskq3tfa9ey3gatonixfq.write(), (boundsInScreen) accessgetcurrentlyfocusedanip.write()) : new AndroidComposeViewrequestFocusViewFocusFixfocusSearchResult1((AndroidComposeViewAccessibilityDelegateCompat) r8lambdaktwlyipskq3tfa9ey3gatonixfq.write(), (accessboundsInScreen) accessgetcurrentlyfocusedanip.write());
    }
}
