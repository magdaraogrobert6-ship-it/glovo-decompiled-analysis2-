package o;

import android.content.Context;
import android.view.View;
import androidx.camera.core.ImageCapture$1;

/* JADX INFO: loaded from: classes.dex */
public final class openOptionsMenu extends getMenuInflater {
    public final /* synthetic */ onSupportActionModeStarted ParcelableVolumeInfo;
    public final /* synthetic */ int PlaybackStateCompat = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public openOptionsMenu(onSupportActionModeStarted onsupportactionmodestarted, Context context, onNightModeChanged onnightmodechanged, View view) {
        super(context, onnightmodechanged, view, false, com.logistics.rider.glovo.R.attr.actionOverflowMenuStyle, 0);
        this.ParcelableVolumeInfo = onsupportactionmodestarted;
        if ((onnightmodechanged.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.RatingCompat & 32) != 32) {
            View view2 = onsupportactionmodestarted.MediaSessionCompatResultReceiverWrapper;
            this.serializer = view2 == null ? (View) onsupportactionmodestarted.PlaybackStateCompatCustomAction : view2;
        }
        ImageCapture$1 imageCapture$1 = onsupportactionmodestarted.ComponentActivity;
        this.MediaSessionCompatToken = imageCapture$1;
        findViewById findviewbyid = this.MediaMetadataCompat;
        if (findviewbyid != null) {
            findviewbyid.read(imageCapture$1);
        }
    }

    @Override // o.getMenuInflater
    public final void write() {
        int i = this.PlaybackStateCompat;
        onSupportActionModeStarted onsupportactionmodestarted = this.ParcelableVolumeInfo;
        if (i != 0) {
            onsupportactionmodestarted.serializer = null;
            super.write();
            return;
        }
        AlertControllerButtonHandler alertControllerButtonHandler = onsupportactionmodestarted.MediaBrowserCompatMediaItem;
        if (alertControllerButtonHandler != null) {
            alertControllerButtonHandler.RemoteActionCompatParcelizer(true);
        }
        onsupportactionmodestarted.MediaSessionCompatToken = null;
        super.write();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public openOptionsMenu(onSupportActionModeStarted onsupportactionmodestarted, Context context, AlertControllerButtonHandler alertControllerButtonHandler, View view) {
        super(context, alertControllerButtonHandler, view, true, com.logistics.rider.glovo.R.attr.actionOverflowMenuStyle, 0);
        this.ParcelableVolumeInfo = onsupportactionmodestarted;
        this.RemoteActionCompatParcelizer = 8388613;
        ImageCapture$1 imageCapture$1 = onsupportactionmodestarted.ComponentActivity;
        this.MediaSessionCompatToken = imageCapture$1;
        findViewById findviewbyid = this.MediaMetadataCompat;
        if (findviewbyid != null) {
            findviewbyid.read(imageCapture$1);
        }
    }
}
