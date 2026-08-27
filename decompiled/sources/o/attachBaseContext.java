package o;

import android.view.ActionProvider;
import androidx.camera.core.ImageCapture$1;

/* JADX INFO: loaded from: classes.dex */
public final class attachBaseContext implements ActionProvider.VisibilityListener {
    public final ActionProvider RemoteActionCompatParcelizer;
    public ImageCapture$1 read;

    public attachBaseContext(closeOptionsMenu closeoptionsmenu, ActionProvider actionProvider) {
        this.RemoteActionCompatParcelizer = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        ImageCapture$1 imageCapture$1 = this.read;
        if (imageCapture$1 != null) {
            AlertControllerButtonHandler alertControllerButtonHandler = ((Keep) imageCapture$1.MediaSessionCompatQueueItem).ResultReceiver;
            alertControllerButtonHandler.PlaybackStateCompatCustomAction = true;
            alertControllerButtonHandler.write(true);
        }
    }
}
