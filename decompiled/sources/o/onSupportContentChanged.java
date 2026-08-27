package o;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class onSupportContentChanged implements Runnable {
    public final openOptionsMenu IconCompatParcelizer;
    public final /* synthetic */ onSupportActionModeStarted RemoteActionCompatParcelizer;

    @Override // java.lang.Runnable
    public final void run() {
        IntentSenderRequest intentSenderRequest;
        onSupportActionModeStarted onsupportactionmodestarted = this.RemoteActionCompatParcelizer;
        AlertControllerButtonHandler alertControllerButtonHandler = onsupportactionmodestarted.MediaBrowserCompatMediaItem;
        if (alertControllerButtonHandler != null && (intentSenderRequest = alertControllerButtonHandler.RemoteActionCompatParcelizer) != null) {
            intentSenderRequest.write(alertControllerButtonHandler);
        }
        View view = (View) onsupportactionmodestarted.PlaybackStateCompatCustomAction;
        if (view != null && view.getWindowToken() != null) {
            openOptionsMenu openoptionsmenu = this.IconCompatParcelizer;
            if (openoptionsmenu.serializer()) {
                onsupportactionmodestarted.MediaSessionCompatToken = openoptionsmenu;
            } else if (openoptionsmenu.serializer != null) {
                openoptionsmenu.write(0, 0, false, false);
                onsupportactionmodestarted.MediaSessionCompatToken = openoptionsmenu;
            }
        }
        onsupportactionmodestarted.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = null;
    }

    public onSupportContentChanged(onSupportActionModeStarted onsupportactionmodestarted, openOptionsMenu openoptionsmenu) {
        this.RemoteActionCompatParcelizer = onsupportactionmodestarted;
        this.IconCompatParcelizer = openoptionsmenu;
    }
}
