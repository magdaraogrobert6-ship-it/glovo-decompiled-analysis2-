package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.m1$$ExternalSyntheticOutline0;
import java.util.List;
import o.AnchoredDraggableKtrestartable212;
import o.FabBaselineTokens;
import o.TriStateCheckbox;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class LazyListMeasuredItem implements AnchoredDraggableKtrestartable212, FabBaselineTokens {
    public final int ComponentActivity;
    public final int IconCompatParcelizer;
    public final Alignment.Horizontal MediaBrowserCompatMediaItem;
    public final Object MediaDescriptionCompat;
    public final int MediaMetadataCompat;
    public final boolean MediaSessionCompatQueueItem;
    public int MediaSessionCompatResultReceiverWrapper = Integer.MIN_VALUE;
    public final int[] MediaSessionCompatToken;
    public boolean ParcelableVolumeInfo;
    public int PlaybackStateCompat;
    public final int PlaybackStateCompatCustomAction;
    public final LayoutDirection RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public final long ResultReceiver;
    public final int r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final List r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final Alignment.Vertical r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final Object read;
    public final int serializer;
    public final LazyLayoutItemAnimator write;

    public final void position(int i, int i2, int i3) {
        int width;
        this.PlaybackStateCompat = i;
        boolean z = this.MediaSessionCompatQueueItem;
        this.MediaSessionCompatResultReceiverWrapper = z ? i3 : i2;
        List list = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            Placeable placeable = (Placeable) list.get(i4);
            int i5 = i4 * 2;
            int[] iArr = this.MediaSessionCompatToken;
            if (z) {
                Alignment.Horizontal horizontal = this.MediaBrowserCompatMediaItem;
                if (horizontal == null) {
                    throw af$$ExternalSyntheticOutline1.m("null horizontalAlignment when isVertical == true");
                }
                iArr[i5] = horizontal.align(placeable.getWidth(), i2, this.RatingCompat);
                iArr[i5 + 1] = i;
                width = placeable.getHeight();
            } else {
                iArr[i5] = i;
                Alignment.Vertical vertical = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                if (vertical == null) {
                    throw af$$ExternalSyntheticOutline1.m("null verticalAlignment when isVertical == false");
                }
                iArr[i5 + 1] = vertical.align(placeable.getHeight(), i3);
                width = placeable.getWidth();
            }
            i += width;
        }
    }

    public LazyListMeasuredItem(int i, List list, boolean z, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, int i2, int i3, int i4, long j, Object obj, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j2) {
        this.MediaMetadataCompat = i;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = list;
        this.MediaSessionCompatQueueItem = z;
        this.MediaBrowserCompatMediaItem = horizontal;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = vertical;
        this.RatingCompat = layoutDirection;
        this.RemoteActionCompatParcelizer = i2;
        this.serializer = i3;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i4;
        this.ResultReceiver = j;
        this.MediaDescriptionCompat = obj;
        this.read = obj2;
        this.write = lazyLayoutItemAnimator;
        int size = list.size();
        int height = 0;
        int iMax = 0;
        for (int i5 = 0; i5 < size; i5++) {
            Placeable placeable = (Placeable) list.get(i5);
            height += this.MediaSessionCompatQueueItem ? placeable.getHeight() : placeable.getWidth();
            iMax = Math.max(iMax, !this.MediaSessionCompatQueueItem ? placeable.getHeight() : placeable.getWidth());
        }
        this.ComponentActivity = height;
        int i6 = height + this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        this.PlaybackStateCompatCustomAction = i6 >= 0 ? i6 : 0;
        this.IconCompatParcelizer = iMax;
        this.MediaSessionCompatToken = new int[this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.size() * 2];
    }

    /* JADX INFO: renamed from: getOffset-Bjo55l4, reason: not valid java name */
    public final long m91getOffsetBjo55l4(int i) {
        if (i == 0 && this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.size() == 0) {
            int i2 = this.PlaybackStateCompat;
            if (this.MediaSessionCompatQueueItem) {
                return IntOffset.m3795constructorimpl(((long) i2) & 4294967295L);
            }
            return IntOffset.m3795constructorimpl(((long) i2) << 32);
        }
        int i3 = i * 2;
        int[] iArr = this.MediaSessionCompatToken;
        int i4 = iArr[i3];
        return IntOffset.m3795constructorimpl((4294967295L & ((long) iArr[i3 + 1])) | (((long) i4) << 32));
    }

    public final void serializer(Placeable.PlacementScope placementScope, boolean z) {
        if (this.MediaSessionCompatResultReceiverWrapper == Integer.MIN_VALUE) {
            TriStateCheckbox.read("position() should be called first");
        }
        List list = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Placeable placeable = (Placeable) list.get(i);
            boolean z2 = this.MediaSessionCompatQueueItem;
            if (z2) {
                placeable.getHeight();
            } else {
                placeable.getWidth();
            }
            long jM91getOffsetBjo55l4 = m91getOffsetBjo55l4(i);
            m1$$ExternalSyntheticOutline0.m(this.write.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem(this.MediaDescriptionCompat));
            long jM3805plusqkQi6aY = IntOffset.m3805plusqkQi6aY(jM91getOffsetBjo55l4, this.ResultReceiver);
            if (z2) {
                Placeable.PlacementScope.m2284placeWithLayeraW9wM$default(placementScope, placeable, jM3805plusqkQi6aY, 0.0f, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) null, 6, (Object) null);
            } else {
                Placeable.PlacementScope.m2282placeRelativeWithLayeraW9wM$default(placementScope, placeable, jM3805plusqkQi6aY, 0.0f, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) null, 6, (Object) null);
            }
        }
    }
}
