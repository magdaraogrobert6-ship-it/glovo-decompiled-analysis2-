package o;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes.dex */
public final class LazyLayoutPinnedItemList {
    public EdgeEffect IconCompatParcelizer;
    public EdgeEffect MediaBrowserCompatMediaItem;
    public EdgeEffect MediaDescriptionCompat;
    public long MediaMetadataCompat = androidx.compose.ui.unit.IntSize.Companion.m3849getZeroYbymL2g();
    public EdgeEffect MediaSessionCompatQueueItem;
    public EdgeEffect PlaybackStateCompatCustomAction;
    public EdgeEffect RatingCompat;
    public final Context RemoteActionCompatParcelizer;
    public EdgeEffect read;
    public final int serializer;
    public EdgeEffect write;

    public LazyLayoutPinnedItemList(Context context, int i) {
        this.RemoteActionCompatParcelizer = context;
        this.serializer = i;
    }

    public static boolean IconCompatParcelizer(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean write(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? scrollToItem.IconCompatParcelizer(edgeEffect) : 0.0f) == 0.0f);
    }

    public final EdgeEffect RemoteActionCompatParcelizer() {
        EdgeEffect edgeEffect = this.MediaSessionCompatQueueItem;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectWrite = write(SelectionHandleIcon.Vertical);
        this.MediaSessionCompatQueueItem = edgeEffectWrite;
        return edgeEffectWrite;
    }

    public final EdgeEffect read() {
        EdgeEffect edgeEffect = this.RatingCompat;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectWrite = write(SelectionHandleIcon.Horizontal);
        this.RatingCompat = edgeEffectWrite;
        return edgeEffectWrite;
    }

    public final EdgeEffect serializer() {
        EdgeEffect edgeEffect = this.write;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectWrite = write(SelectionHandleIcon.Horizontal);
        this.write = edgeEffectWrite;
        return edgeEffectWrite;
    }

    public final EdgeEffect write() {
        EdgeEffect edgeEffect = this.read;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectWrite = write(SelectionHandleIcon.Vertical);
        this.read = edgeEffectWrite;
        return edgeEffectWrite;
    }

    public final EdgeEffect write(SelectionHandleIcon selectionHandleIcon) {
        int i = Build.VERSION.SDK_INT;
        Context context = this.RemoteActionCompatParcelizer;
        EdgeEffect edgeEffectIconCompatParcelizer = i >= 31 ? scrollToItem.IconCompatParcelizer(context) : new androidx.compose.foundation.GlowEdgeEffectCompat(context);
        edgeEffectIconCompatParcelizer.setColor(this.serializer);
        if (!androidx.compose.ui.unit.IntSize.m3842equalsimpl0(this.MediaMetadataCompat, androidx.compose.ui.unit.IntSize.Companion.m3849getZeroYbymL2g())) {
            SelectionHandleIcon selectionHandleIcon2 = SelectionHandleIcon.Vertical;
            long j = this.MediaMetadataCompat;
            if (selectionHandleIcon == selectionHandleIcon2) {
                edgeEffectIconCompatParcelizer.setSize((int) (j >> 32), (int) (j & 4294967295L));
                return edgeEffectIconCompatParcelizer;
            }
            edgeEffectIconCompatParcelizer.setSize((int) (4294967295L & j), (int) (j >> 32));
        }
        return edgeEffectIconCompatParcelizer;
    }
}
