package o;

/* JADX INFO: loaded from: classes4.dex */
public final class performDismissTeardownlambda0 implements getOnDismissCallback {
    public final getOnDismissCallback RemoteActionCompatParcelizer;

    @Override // o.getOnDismissCallback
    public final createBannerWebViewClientListenerandroid_sdk_ui_release RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }

    public performDismissTeardownlambda0() {
        if (io.sentry.util.PlaybackStateCompatCustomAction.serializer || !io.sentry.util.PlaybackStateCompatCustomAction.read) {
            this.RemoteActionCompatParcelizer = new requestPushPermission();
        } else {
            this.RemoteActionCompatParcelizer = new onCloseAction();
        }
    }
}
