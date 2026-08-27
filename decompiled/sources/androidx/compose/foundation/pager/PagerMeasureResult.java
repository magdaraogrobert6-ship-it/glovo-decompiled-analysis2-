package androidx.compose.foundation.pager;

import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import java.util.Map;
import o.BottomSheetScaffoldKtBottomSheetScaffoldLayout11;
import o.SelectionHandleIcon;
import o.getContentViewGroupParentLayout;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class PagerMeasureResult implements MeasureResult {
    public final int ComponentActivity;
    public final long IconCompatParcelizer;
    public final List MediaBrowserCompatMediaItem;
    public final MeasuredPage MediaDescriptionCompat;
    public final float MediaMetadataCompat;
    public final Density MediaSessionCompatQueueItem;
    public final MeasuredPage MediaSessionCompatResultReceiverWrapper;
    public final SelectionHandleIcon MediaSessionCompatToken;
    public final int ParcelableVolumeInfo;
    public final MeasureResult PlaybackStateCompat;
    public final int PlaybackStateCompatCustomAction;
    public final List RatingCompat;
    public final boolean RemoteActionCompatParcelizer;
    public final BottomSheetScaffoldKtBottomSheetScaffoldLayout11 ResultReceiver;
    public final boolean r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final List r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public final getContentViewGroupParentLayout read;
    public final int serializer;
    public final int write;

    @Override // androidx.compose.ui.layout.MeasureResult
    public final Map getAlignmentLines() {
        return this.PlaybackStateCompat.getAlignmentLines();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final int getHeight() {
        return this.PlaybackStateCompat.getHeight();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getRulers() {
        return this.PlaybackStateCompat.getRulers();
    }

    /* JADX INFO: renamed from: getViewportSize-YbymL2g, reason: not valid java name */
    public final long m96getViewportSizeYbymL2g() {
        MeasureResult measureResult = this.PlaybackStateCompat;
        return IntSize.m3839constructorimpl((((long) measureResult.getWidth()) << 32) | (((long) measureResult.getHeight()) & 4294967295L));
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final int getWidth() {
        return this.PlaybackStateCompat.getWidth();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final void placeChildren() {
        this.PlaybackStateCompat.placeChildren();
    }

    public PagerMeasureResult(List list, int i, int i2, int i3, SelectionHandleIcon selectionHandleIcon, int i4, int i5, int i6, MeasuredPage measuredPage, MeasuredPage measuredPage2, float f, int i7, boolean z, BottomSheetScaffoldKtBottomSheetScaffoldLayout11 bottomSheetScaffoldKtBottomSheetScaffoldLayout11, MeasureResult measureResult, boolean z2, List list2, List list3, getContentViewGroupParentLayout getcontentviewgroupparentlayout, Density density, long j) {
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = list;
        this.PlaybackStateCompatCustomAction = i;
        this.ComponentActivity = i2;
        this.serializer = i3;
        this.MediaSessionCompatToken = selectionHandleIcon;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i5;
        this.write = i6;
        this.MediaSessionCompatResultReceiverWrapper = measuredPage;
        this.MediaDescriptionCompat = measuredPage2;
        this.MediaMetadataCompat = f;
        this.ParcelableVolumeInfo = i7;
        this.RemoteActionCompatParcelizer = z;
        this.ResultReceiver = bottomSheetScaffoldKtBottomSheetScaffoldLayout11;
        this.PlaybackStateCompat = measureResult;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = z2;
        this.MediaBrowserCompatMediaItem = list2;
        this.RatingCompat = list3;
        this.read = getcontentviewgroupparentlayout;
        this.MediaSessionCompatQueueItem = density;
        this.IconCompatParcelizer = j;
    }

    public final PagerMeasureResult copyWithScrollDeltaWithoutRemeasure(int i) {
        int i2;
        int i3 = this.PlaybackStateCompatCustomAction + this.ComponentActivity;
        if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
            return null;
        }
        List list = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        if (list.isEmpty() || this.MediaSessionCompatResultReceiverWrapper == null || (i2 = this.ParcelableVolumeInfo - i) < 0 || i2 >= i3) {
            return null;
        }
        float f = this.MediaMetadataCompat - (i3 != 0 ? i / i3 : 0.0f);
        if (this.MediaDescriptionCompat == null || f >= 0.5f || f <= -0.5f) {
            return null;
        }
        MeasuredPage measuredPage = (MeasuredPage) onContentCardDismissed.read(list);
        MeasuredPage measuredPage2 = (MeasuredPage) onContentCardDismissed.MediaDescriptionCompat(list);
        int i4 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        int i5 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (i < 0) {
            if (Math.min((measuredPage.RatingCompat + i3) - i5, (measuredPage2.RatingCompat + i3) - i4) <= (-i)) {
                return null;
            }
        } else if (Math.min(i5 - measuredPage.RatingCompat, i4 - measuredPage2.RatingCompat) <= i) {
            return null;
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((MeasuredPage) list.get(i6)).RemoteActionCompatParcelizer(i);
        }
        List list2 = this.MediaBrowserCompatMediaItem;
        int size2 = list2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            ((MeasuredPage) list2.get(i7)).RemoteActionCompatParcelizer(i);
        }
        List list3 = this.RatingCompat;
        int size3 = list3.size();
        for (int i8 = 0; i8 < size3; i8++) {
            ((MeasuredPage) list3.get(i8)).RemoteActionCompatParcelizer(i);
        }
        return new PagerMeasureResult(this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, this.PlaybackStateCompatCustomAction, this.ComponentActivity, this.serializer, this.MediaSessionCompatToken, this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, this.write, this.MediaSessionCompatResultReceiverWrapper, this.MediaDescriptionCompat, f, i2, this.RemoteActionCompatParcelizer || i > 0, this.ResultReceiver, this.PlaybackStateCompat, this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, this.MediaBrowserCompatMediaItem, this.RatingCompat, this.read, this.MediaSessionCompatQueueItem, this.IconCompatParcelizer);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PagerMeasureResult(int i, int i2, int i3, SelectionHandleIcon selectionHandleIcon, int i4, int i5, int i6, BottomSheetScaffoldKtBottomSheetScaffoldLayout11 bottomSheetScaffoldKtBottomSheetScaffoldLayout11, MeasureResult measureResult, getContentViewGroupParentLayout getcontentviewgroupparentlayout, Density density, long j) {
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        this(instance_delegatelambda0Var, i, i2, i3, selectionHandleIcon, i4, i5, i6, null, null, 0.0f, 0, false, bottomSheetScaffoldKtBottomSheetScaffoldLayout11, measureResult, false, instance_delegatelambda0Var, instance_delegatelambda0Var, getcontentviewgroupparentlayout, density, j);
    }
}
