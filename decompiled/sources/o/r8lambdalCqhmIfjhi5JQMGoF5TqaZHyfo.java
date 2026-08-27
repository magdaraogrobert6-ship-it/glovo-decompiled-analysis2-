package o;

import java.util.Iterator;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdalCqhmIfjhi5JQMGoF5TqaZHyfo extends TimerTask {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;

    public /* synthetic */ r8lambdalCqhmIfjhi5JQMGoF5TqaZHyfo(int i, Object obj) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        int i = this.IconCompatParcelizer;
        Object obj = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            formatQueryBundleForLoglambda0 formatquerybundleforloglambda0 = (formatQueryBundleForLoglambda0) obj;
            defaultCardHandlinglambda0 defaultcardhandlinglambda0MediaSessionCompatQueueItem = formatquerybundleforloglambda0.MediaSessionCompatQueueItem();
            if (defaultcardhandlinglambda0MediaSessionCompatQueueItem == null) {
                defaultcardhandlinglambda0MediaSessionCompatQueueItem = defaultCardHandlinglambda0.OK;
            }
            formatquerybundleforloglambda0.write(defaultcardhandlinglambda0MediaSessionCompatQueueItem, (createBannerWebViewClientListenerandroid_sdk_ui_release) null);
            formatquerybundleforloglambda0.MediaMetadataCompat.set(false);
            return;
        }
        if (i != 1) {
            Iterator it = ((getWebViewActivityIntent) obj).MediaSessionCompatQueueItem.iterator();
            while (it.hasNext()) {
                ((containsAnyPushPermissionBrazeActions) it.next()).read();
            }
        } else {
            formatQueryBundleForLoglambda0 formatquerybundleforloglambda1 = (formatQueryBundleForLoglambda0) obj;
            defaultCardHandlinglambda0 defaultcardhandlinglambda0MediaSessionCompatQueueItem2 = formatquerybundleforloglambda1.MediaSessionCompatQueueItem();
            if (defaultcardhandlinglambda0MediaSessionCompatQueueItem2 == null) {
                defaultcardhandlinglambda0MediaSessionCompatQueueItem2 = defaultCardHandlinglambda0.DEADLINE_EXCEEDED;
            }
            formatquerybundleforloglambda1.IconCompatParcelizer(defaultcardhandlinglambda0MediaSessionCompatQueueItem2, formatquerybundleforloglambda1.ComponentActivity.MediaDescriptionCompat != null, null);
            formatquerybundleforloglambda1.MediaBrowserCompatMediaItem.set(false);
        }
    }
}
