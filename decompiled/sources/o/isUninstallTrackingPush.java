package o;

import com.sentiance.sdk.events.ControlMessage;

/* JADX INFO: loaded from: classes3.dex */
final class isUninstallTrackingPush implements Runnable {
    final /* synthetic */ getUseWebView read;
    final /* synthetic */ ControlMessage serializer;

    @Override // java.lang.Runnable
    public final void run() {
        getUseWebView getusewebview = this.read;
        getusewebview.ResultReceiver.IconCompatParcelizer(this.serializer, (Object) null);
        getusewebview.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.IconCompatParcelizer("Control msg published", new Object[0]);
        getusewebview.serializer.IconCompatParcelizer();
    }

    public isUninstallTrackingPush(getUseWebView getusewebview, ControlMessage controlMessage) {
        this.read = getusewebview;
        this.serializer = controlMessage;
    }
}
