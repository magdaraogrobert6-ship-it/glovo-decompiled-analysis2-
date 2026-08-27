package androidx.compose.foundation.pager;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import com.sentiance.okhttp3.internal.http2.e$h;
import java.util.concurrent.CancellationException;
import kotlin.ranges.RangesKt;
import o.SelectionHandleIcon;
import o.ShortNewsContentCardView;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultPagerNestedScrollConnection implements NestedScrollConnection {
    public final PagerState RemoteActionCompatParcelizer;
    public final SelectionHandleIcon write;

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public final Object mo54onPostFlingRZ2iAVY(long j, long j2, ShortNewsContentCardView shortNewsContentCardView) {
        return Velocity.m3902boximpl(this.write == SelectionHandleIcon.Vertical ? Velocity.m3907copyOhffZ5M$default(j2, 0.0f, 0.0f, 2, null) : Velocity.m3907copyOhffZ5M$default(j2, 0.0f, 0.0f, 1, null));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public final long mo55onPostScrollDzOQY0M(long j, long j2, int i) {
        if (NestedScrollSource.m1926equalsimpl0(i, NestedScrollSource.Companion.m1937getSideEffectWNlRxjI())) {
            if (Float.intBitsToFloat((int) (this.write == SelectionHandleIcon.Horizontal ? j2 >> 32 : 4294967295L & j2)) != 0.0f) {
                throw new CancellationException("Scroll cancelled");
            }
        }
        return Offset.Companion.m493getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
    public final long mo93onPreScrollOzD1aCk(long j, int i) {
        if (NestedScrollSource.m1926equalsimpl0(i, NestedScrollSource.Companion.m1938getUserInputWNlRxjI())) {
            PagerState pagerState = this.RemoteActionCompatParcelizer;
            e$h e_h = pagerState.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
            e$h e_h2 = pagerState.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
            if (Math.abs(e_h.IconCompatParcelizer()) > 1.0E-6d) {
                SelectionHandleIcon selectionHandleIcon = SelectionHandleIcon.Horizontal;
                SelectionHandleIcon selectionHandleIcon2 = this.write;
                if (Math.abs(Float.intBitsToFloat((int) (selectionHandleIcon2 == selectionHandleIcon ? j >> 32 : j & 4294967295L))) > 0.0f) {
                    PagerMeasureResult pagerMeasureResultMediaSessionCompatQueueItem = pagerState.MediaSessionCompatQueueItem();
                    float fIconCompatParcelizer = e_h2.IconCompatParcelizer() * pagerState.MediaMetadataCompat();
                    float f = ((pagerMeasureResultMediaSessionCompatQueueItem.PlaybackStateCompatCustomAction + pagerMeasureResultMediaSessionCompatQueueItem.ComponentActivity) * (-Math.signum(e_h2.IconCompatParcelizer()))) + fIconCompatParcelizer;
                    if (e_h2.IconCompatParcelizer() > 0.0f) {
                        fIconCompatParcelizer = f;
                        f = fIconCompatParcelizer;
                    }
                    float fIntBitsToFloat = -pagerState._init_lambda2.write(-RangesKt.write(Float.intBitsToFloat((int) (selectionHandleIcon2 == selectionHandleIcon ? j >> 32 : j & 4294967295L)), fIconCompatParcelizer, f));
                    float fIntBitsToFloat2 = selectionHandleIcon2 == selectionHandleIcon ? fIntBitsToFloat : Float.intBitsToFloat((int) (j >> 32));
                    if (selectionHandleIcon2 != SelectionHandleIcon.Vertical) {
                        fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
                    }
                    return Offset.m470copydBAh8RU(j, fIntBitsToFloat2, fIntBitsToFloat);
                }
            }
        }
        return Offset.Companion.m493getZeroF1C5BW0();
    }

    public DefaultPagerNestedScrollConnection(PagerState pagerState, SelectionHandleIcon selectionHandleIcon) {
        this.RemoteActionCompatParcelizer = pagerState;
        this.write = selectionHandleIcon;
    }
}
