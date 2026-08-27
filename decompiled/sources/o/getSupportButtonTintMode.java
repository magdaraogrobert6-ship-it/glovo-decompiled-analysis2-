package o;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class getSupportButtonTintMode implements View.OnClickListener {
    public final /* synthetic */ setFilters RemoteActionCompatParcelizer;
    public final accessgetKeyToRcp serializer;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        setFilters setfilters = this.RemoteActionCompatParcelizer;
        Window.Callback callback = setfilters.PlaybackStateCompatCustomAction;
        if (callback == null || !setfilters.MediaSessionCompatQueueItem) {
            return;
        }
        callback.onMenuItemSelected(0, this.serializer);
    }

    public getSupportButtonTintMode(setFilters setfilters) {
        this.RemoteActionCompatParcelizer = setfilters;
        Context context = setfilters.PlaybackStateCompat.getContext();
        CharSequence charSequence = setfilters.ParcelableVolumeInfo;
        accessgetKeyToRcp accessgetkeytorcp = new accessgetKeyToRcp();
        accessgetkeytorcp.PlaybackStateCompatCustomAction = androidx.compose.ui.graphics.Fields.TransformOrigin;
        accessgetkeytorcp.MediaSessionCompatResultReceiverWrapper = androidx.compose.ui.graphics.Fields.TransformOrigin;
        accessgetkeytorcp.MediaMetadataCompat = null;
        accessgetkeytorcp.RatingCompat = null;
        accessgetkeytorcp.write = false;
        accessgetkeytorcp.serializer = false;
        accessgetkeytorcp.RemoteActionCompatParcelizer = 16;
        accessgetkeytorcp.read = context;
        accessgetkeytorcp.ParcelableVolumeInfo = charSequence;
        this.serializer = accessgetkeytorcp;
    }
}
