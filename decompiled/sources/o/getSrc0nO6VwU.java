package o;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class getSrc0nO6VwU {
    public int IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public boolean MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public int MediaSessionCompatResultReceiverWrapper;
    public List PlaybackStateCompatCustomAction;
    public int RatingCompat;
    public int RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public boolean write;

    public final void RemoteActionCompatParcelizer(View view) {
        int size = this.PlaybackStateCompatCustomAction.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((androidx.recyclerview.widget.RecyclerView.ViewHolder) this.PlaybackStateCompatCustomAction.get(i2)).MediaSessionCompatQueueItem;
            BlockGraphicsLayerElement blockGraphicsLayerElement = (BlockGraphicsLayerElement) view3.getLayoutParams();
            if (view3 != view && !blockGraphicsLayerElement.MediaMetadataCompat.isRemoved()) {
                int layoutPosition = (blockGraphicsLayerElement.MediaMetadataCompat.getLayoutPosition() - this.serializer) * this.read;
                if (layoutPosition >= 0 && layoutPosition < i) {
                    if (layoutPosition == 0) {
                        view2 = view3;
                        break;
                    } else {
                        view2 = view3;
                        i = layoutPosition;
                    }
                }
            }
        }
        if (view2 == null) {
            this.serializer = -1;
        } else {
            this.serializer = ((BlockGraphicsLayerElement) view2.getLayoutParams()).MediaMetadataCompat.getLayoutPosition();
        }
    }

    public final View read(androidx.recyclerview.widget.RecyclerView.Recycler recycler) {
        List list = this.PlaybackStateCompatCustomAction;
        if (list == null) {
            View view = recycler.tryGetViewHolderForPositionByDeadline(this.serializer, Long.MAX_VALUE).MediaSessionCompatQueueItem;
            this.serializer += this.read;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((androidx.recyclerview.widget.RecyclerView.ViewHolder) this.PlaybackStateCompatCustomAction.get(i)).MediaSessionCompatQueueItem;
            BlockGraphicsLayerElement blockGraphicsLayerElement = (BlockGraphicsLayerElement) view2.getLayoutParams();
            if (!blockGraphicsLayerElement.MediaMetadataCompat.isRemoved() && this.serializer == blockGraphicsLayerElement.MediaMetadataCompat.getLayoutPosition()) {
                RemoteActionCompatParcelizer(view2);
                return view2;
            }
        }
        return null;
    }
}
