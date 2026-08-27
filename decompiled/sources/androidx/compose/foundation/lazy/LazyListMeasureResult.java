package androidx.compose.foundation.lazy;

import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import bo.app.m1$$ExternalSyntheticOutline0;
import java.util.List;
import java.util.Map;
import o.BasicTooltipKt;
import o.SelectionHandleIcon;
import o.getContentViewGroupParentLayout;
import o.onContentCardDismissed;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class LazyListMeasureResult implements BasicTooltipKt, MeasureResult {
    public final getContentViewGroupParentLayout IconCompatParcelizer;
    public final int MediaBrowserCompatMediaItem;
    public final int MediaDescriptionCompat;
    public final LazyListMeasuredItem MediaMetadataCompat;
    public final MeasureResult MediaSessionCompatQueueItem;
    public final float MediaSessionCompatResultReceiverWrapper;
    public final SelectionHandleIcon MediaSessionCompatToken;
    public final boolean ParcelableVolumeInfo;
    public final int PlaybackStateCompat;
    public final int PlaybackStateCompatCustomAction;
    public final Density RatingCompat;
    public final long RemoteActionCompatParcelizer;
    public final int r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final List r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final float read;
    public final boolean serializer;
    public final int write;

    @Override // androidx.compose.ui.layout.MeasureResult
    public final Map getAlignmentLines() {
        return this.MediaSessionCompatQueueItem.getAlignmentLines();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final int getHeight() {
        return this.MediaSessionCompatQueueItem.getHeight();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getRulers() {
        return this.MediaSessionCompatQueueItem.getRulers();
    }

    /* JADX INFO: renamed from: getViewportSize-YbymL2g, reason: not valid java name */
    public final long m90getViewportSizeYbymL2g() {
        MeasureResult measureResult = this.MediaSessionCompatQueueItem;
        return IntSize.m3839constructorimpl((((long) measureResult.getWidth()) << 32) | (((long) measureResult.getHeight()) & 4294967295L));
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final int getWidth() {
        return this.MediaSessionCompatQueueItem.getWidth();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final void placeChildren() {
        this.MediaSessionCompatQueueItem.placeChildren();
    }

    public LazyListMeasureResult(LazyListMeasuredItem lazyListMeasuredItem, int i, boolean z, float f, MeasureResult measureResult, float f2, boolean z2, getContentViewGroupParentLayout getcontentviewgroupparentlayout, Density density, long j, List list, int i2, int i3, int i4, SelectionHandleIcon selectionHandleIcon, int i5, int i6) {
        this.MediaMetadataCompat = lazyListMeasuredItem;
        this.MediaBrowserCompatMediaItem = i;
        this.serializer = z;
        this.read = f;
        this.MediaSessionCompatQueueItem = measureResult;
        this.MediaSessionCompatResultReceiverWrapper = f2;
        this.ParcelableVolumeInfo = z2;
        this.IconCompatParcelizer = getcontentviewgroupparentlayout;
        this.RatingCompat = density;
        this.RemoteActionCompatParcelizer = j;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = list;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2;
        this.PlaybackStateCompat = i3;
        this.PlaybackStateCompatCustomAction = i4;
        this.MediaSessionCompatToken = selectionHandleIcon;
        this.write = i5;
        this.MediaDescriptionCompat = i6;
    }

    public final LazyListMeasureResult copyWithScrollDeltaWithoutRemeasure(int i, boolean z) {
        LazyListMeasuredItem lazyListMeasuredItem;
        if (this.ParcelableVolumeInfo) {
            return null;
        }
        List list = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (list.isEmpty() || (lazyListMeasuredItem = this.MediaMetadataCompat) == null) {
            return null;
        }
        int i2 = lazyListMeasuredItem.PlaybackStateCompatCustomAction;
        int i3 = this.MediaBrowserCompatMediaItem - i;
        if (i3 < 0 || i3 >= i2) {
            return null;
        }
        LazyListMeasuredItem lazyListMeasuredItem2 = (LazyListMeasuredItem) onContentCardDismissed.read(list);
        LazyListMeasuredItem lazyListMeasuredItem3 = (LazyListMeasuredItem) onContentCardDismissed.MediaDescriptionCompat(list);
        if (lazyListMeasuredItem2.ParcelableVolumeInfo || lazyListMeasuredItem3.ParcelableVolumeInfo) {
            return null;
        }
        int i4 = lazyListMeasuredItem2.PlaybackStateCompat;
        int i5 = this.PlaybackStateCompat;
        int i6 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (i < 0) {
            if (Math.min((i4 + lazyListMeasuredItem2.PlaybackStateCompatCustomAction) - i6, (lazyListMeasuredItem3.PlaybackStateCompat + lazyListMeasuredItem3.PlaybackStateCompatCustomAction) - i5) <= (-i)) {
                return null;
            }
        } else if (Math.min(i6 - i4, i5 - lazyListMeasuredItem3.PlaybackStateCompat) <= i) {
            return null;
        }
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            LazyListMeasuredItem lazyListMeasuredItem4 = (LazyListMeasuredItem) list.get(i7);
            boolean z2 = lazyListMeasuredItem4.MediaSessionCompatQueueItem;
            int[] iArr = lazyListMeasuredItem4.MediaSessionCompatToken;
            if (!lazyListMeasuredItem4.ParcelableVolumeInfo) {
                lazyListMeasuredItem4.PlaybackStateCompat += i;
                int length = iArr.length;
                for (int i8 = 0; i8 < length; i8++) {
                    int i9 = i8 & 1;
                    if ((z2 && i9 != 0) || (!z2 && i9 == 0)) {
                        iArr[i8] = iArr[i8] + i;
                    }
                }
                if (z) {
                    int size2 = lazyListMeasuredItem4.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        m1$$ExternalSyntheticOutline0.m(lazyListMeasuredItem4.write.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem(lazyListMeasuredItem4.MediaDescriptionCompat));
                    }
                }
            }
        }
        return new LazyListMeasureResult(this.MediaMetadataCompat, i3, this.serializer || i > 0, i, this.MediaSessionCompatQueueItem, this.MediaSessionCompatResultReceiverWrapper, this.ParcelableVolumeInfo, this.IconCompatParcelizer, this.RatingCompat, this.RemoteActionCompatParcelizer, list, this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, this.PlaybackStateCompat, this.PlaybackStateCompatCustomAction, this.MediaSessionCompatToken, this.write, this.MediaDescriptionCompat);
    }
}
