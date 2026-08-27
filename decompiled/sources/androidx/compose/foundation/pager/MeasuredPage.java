package androidx.compose.foundation.pager;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import bo.app.af$$ExternalSyntheticOutline1;
import java.util.List;
import o.ComposePausableCompositionExceptionoperationsSequence1;
import o.SelectionHandleIcon;

/* JADX INFO: loaded from: classes.dex */
public final class MeasuredPage implements ComposePausableCompositionExceptionoperationsSequence1 {
    public final int IconCompatParcelizer;
    public final LayoutDirection MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public final int[] MediaMetadataCompat;
    public final List MediaSessionCompatQueueItem;
    public final long MediaSessionCompatToken;
    public final boolean PlaybackStateCompat;
    public final Alignment.Vertical PlaybackStateCompatCustomAction;
    public int RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public final Object read;
    public final Alignment.Horizontal serializer;
    public final boolean write;

    public final void position(int i, int i2, int i3) {
        int width;
        this.RatingCompat = i;
        boolean z = this.write;
        this.MediaDescriptionCompat = z ? i3 : i2;
        List list = this.MediaSessionCompatQueueItem;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            Placeable placeable = (Placeable) list.get(i4);
            int i5 = i4 * 2;
            int[] iArr = this.MediaMetadataCompat;
            if (z) {
                Alignment.Horizontal horizontal = this.serializer;
                if (horizontal == null) {
                    throw af$$ExternalSyntheticOutline1.m("null horizontalAlignment");
                }
                iArr[i5] = horizontal.align(placeable.getWidth(), i2, this.MediaBrowserCompatMediaItem);
                iArr[i5 + 1] = i;
                width = placeable.getHeight();
            } else {
                iArr[i5] = i;
                Alignment.Vertical vertical = this.PlaybackStateCompatCustomAction;
                if (vertical == null) {
                    throw af$$ExternalSyntheticOutline1.m("null verticalAlignment");
                }
                iArr[i5 + 1] = vertical.align(placeable.getHeight(), i3);
                width = placeable.getWidth();
            }
            i += width;
        }
    }

    public MeasuredPage(int i, int i2, List list, long j, Object obj, SelectionHandleIcon selectionHandleIcon, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z) {
        this.RemoteActionCompatParcelizer = i;
        this.MediaSessionCompatQueueItem = list;
        this.MediaSessionCompatToken = j;
        this.read = obj;
        this.serializer = horizontal;
        this.PlaybackStateCompatCustomAction = vertical;
        this.MediaBrowserCompatMediaItem = layoutDirection;
        this.PlaybackStateCompat = z;
        this.write = selectionHandleIcon == SelectionHandleIcon.Vertical;
        int size = list.size();
        int iMax = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Placeable placeable = (Placeable) list.get(i3);
            iMax = Math.max(iMax, !this.write ? placeable.getHeight() : placeable.getWidth());
        }
        this.IconCompatParcelizer = iMax;
        this.MediaMetadataCompat = new int[this.MediaSessionCompatQueueItem.size() * 2];
        this.MediaDescriptionCompat = Integer.MIN_VALUE;
    }

    public final void RemoteActionCompatParcelizer(int i) {
        this.RatingCompat += i;
        int[] iArr = this.MediaMetadataCompat;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            boolean z = this.write;
            if ((z && i2 % 2 == 1) || (!z && i2 % 2 == 0)) {
                iArr[i2] = iArr[i2] + i;
            }
        }
    }
}
