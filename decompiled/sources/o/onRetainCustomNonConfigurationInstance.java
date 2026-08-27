package o;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class onRetainCustomNonConfigurationInstance {
    public boolean MediaBrowserCompatMediaItem;
    public final LayoutInflater MediaDescriptionCompat;
    public Drawable MediaMetadataCompat;
    public DialogInterface.OnClickListener MediaSessionCompatQueueItem;
    public AppCompatActivity MediaSessionCompatResultReceiverWrapper;
    public DialogInterface.OnClickListener MediaSessionCompatToken;
    public CharSequence ParcelableVolumeInfo;
    public CharSequence PlaybackStateCompat;
    public DialogInterface.OnClickListener PlaybackStateCompatCustomAction;
    public CharSequence RatingCompat;
    public View RemoteActionCompatParcelizer;
    public CharSequence ResultReceiver;
    public CharSequence r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public DialogInterface.OnClickListener r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public ListAdapter read;
    public final ContextThemeWrapper write;
    public int IconCompatParcelizer = -1;
    public boolean serializer = true;

    public onRetainCustomNonConfigurationInstance(ContextThemeWrapper contextThemeWrapper) {
        this.write = contextThemeWrapper;
        this.MediaDescriptionCompat = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
    }
}
