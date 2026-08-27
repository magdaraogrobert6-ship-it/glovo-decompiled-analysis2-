package o;

import androidx.camera.core.Preview$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class AuthPromptErrorException implements getTitleMarginEnd {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ AuthPromptErrorException(int i, Object obj) {
        this.serializer = i;
        this.IconCompatParcelizer = obj;
    }

    @Override // o.getTitleMarginEnd
    public final void serializer(getTitleTextView gettitletextview) {
        getTitleMarginEnd gettitlemarginend;
        int i = this.serializer;
        Object obj = this.IconCompatParcelizer;
        if (i != 0) {
            setNavigationIcon setnavigationicon = (setNavigationIcon) ((java.lang.ref.WeakReference) ((getCameraXConfig) obj).RemoteActionCompatParcelizer).get();
            if (setnavigationicon != null) {
                setnavigationicon.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.execute(new Preview$$ExternalSyntheticLambda0(12, setnavigationicon));
                return;
            }
            return;
        }
        AuthPromptFailureException authPromptFailureException = (AuthPromptFailureException) obj;
        synchronized (authPromptFailureException.read) {
            int i2 = authPromptFailureException.MediaBrowserCompatMediaItem - 1;
            authPromptFailureException.MediaBrowserCompatMediaItem = i2;
            if (authPromptFailureException.write && i2 == 0) {
                authPromptFailureException.serializer();
            }
            gettitlemarginend = authPromptFailureException.IconCompatParcelizer;
        }
        if (gettitlemarginend != null) {
            gettitlemarginend.serializer(gettitletextview);
        }
    }
}
