package o;

import java.util.Map;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class invokecomroadrunnerdeliverypickupdropoffblockinguipresentationdialogTimeChangedBlockingDialogFragmentExternalSyntheticLambda0 implements getStringId9Hzcbyc {
    public final androidx.compose.foundation.pager.PagerState RemoteActionCompatParcelizer;
    public final androidx.compose.ui.unit.LayoutDirection read;
    public final getStringId9Hzcbyc serializer;

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    @Override // o.getStringId9Hzcbyc
    public final float serializer(float f, float f2, float f3) {
        boolean z;
        int iMediaBrowserCompatMediaItem;
        int iMediaBrowserCompatMediaItem2;
        int iMediaBrowserCompatMediaItem3;
        float fSerializer = this.serializer.serializer(f, f2, f3);
        if (f <= 0.0f) {
            Map map = WindowInsetsAnimationCancelledException.serializer;
            if (f + f2 <= 1.0f) {
                z = true;
            } else {
                z = false;
            }
        } else if (f + f2 > f3) {
            z = true;
        } else {
            z = false;
        }
        float fAbs = Math.abs(fSerializer);
        androidx.compose.ui.unit.LayoutDirection layoutDirection = this.read;
        androidx.compose.foundation.pager.PagerState pagerState = this.RemoteActionCompatParcelizer;
        if (fAbs != 0.0f && z) {
            if (layoutDirection == androidx.compose.ui.unit.LayoutDirection.Rtl && pagerState.MediaSessionCompatQueueItem().MediaSessionCompatToken == SelectionHandleIcon.Horizontal) {
                iMediaBrowserCompatMediaItem3 = pagerState.MediaBrowserCompatMediaItem() + (-pagerState.PlaybackStateCompat);
            } else {
                iMediaBrowserCompatMediaItem3 = pagerState.PlaybackStateCompat;
            }
            float fMediaBrowserCompatMediaItem = iMediaBrowserCompatMediaItem3 * (-1.0f);
            while (fSerializer > 0.0f && fMediaBrowserCompatMediaItem < fSerializer) {
                fMediaBrowserCompatMediaItem += pagerState.MediaBrowserCompatMediaItem();
            }
            while (fSerializer < 0.0f && fMediaBrowserCompatMediaItem > fSerializer) {
                fMediaBrowserCompatMediaItem -= pagerState.MediaBrowserCompatMediaItem();
            }
            return fMediaBrowserCompatMediaItem;
        }
        if (Math.abs(pagerState.PlaybackStateCompat) < 1.0E-6d) {
            return 0.0f;
        }
        androidx.compose.ui.unit.LayoutDirection layoutDirection2 = androidx.compose.ui.unit.LayoutDirection.Rtl;
        if (layoutDirection == layoutDirection2 && pagerState.MediaSessionCompatQueueItem().MediaSessionCompatToken == SelectionHandleIcon.Horizontal) {
            iMediaBrowserCompatMediaItem = pagerState.MediaBrowserCompatMediaItem() + (-pagerState.PlaybackStateCompat);
        } else {
            iMediaBrowserCompatMediaItem = pagerState.PlaybackStateCompat;
        }
        float f4 = iMediaBrowserCompatMediaItem * (-1.0f);
        if (layoutDirection == layoutDirection2 && pagerState.MediaSessionCompatQueueItem().MediaSessionCompatToken == SelectionHandleIcon.Horizontal) {
            if (!pagerState.serializer()) {
                iMediaBrowserCompatMediaItem2 = pagerState.MediaBrowserCompatMediaItem();
                f4 += iMediaBrowserCompatMediaItem2;
            }
        } else if (pagerState.serializer()) {
            iMediaBrowserCompatMediaItem2 = pagerState.MediaBrowserCompatMediaItem();
            f4 += iMediaBrowserCompatMediaItem2;
        }
        return RangesKt.write(f4, -f3, f3);
    }

    public invokecomroadrunnerdeliverypickupdropoffblockinguipresentationdialogTimeChangedBlockingDialogFragmentExternalSyntheticLambda0(androidx.compose.foundation.pager.PagerState pagerState, getStringId9Hzcbyc getstringid9hzcbyc, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        this.RemoteActionCompatParcelizer = pagerState;
        this.serializer = getstringid9hzcbyc;
        this.read = layoutDirection;
    }
}
