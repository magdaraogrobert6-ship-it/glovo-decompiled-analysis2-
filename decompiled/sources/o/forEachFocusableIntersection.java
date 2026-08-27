package o;

import com.roadrunner.bubble.presentation.BubbleFloatingItemUiModelImpl$1;
import com.roadrunner.bubble.presentation.GetBubbleUiState;
import io.sentry.CombinedScopeView;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class forEachFocusableIntersection implements getFragment {
    private static int MediaSessionCompatToken = 0;
    private static int PlaybackStateCompat = 1;
    public final getContentViewGroupParentLayout IconCompatParcelizer;
    public final unregisterForContextMenu MediaBrowserCompatMediaItem;
    public final CombinedScopeView MediaDescriptionCompat;
    public final StateFlow MediaMetadataCompat;
    public final OnSessionTrackingFailedListener MediaSessionCompatQueueItem;
    public final StateFlow MediaSessionCompatResultReceiverWrapper;
    public final getQueryContext PlaybackStateCompatCustomAction;
    public final dispatchChildDetached RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final GetBubbleUiState serializer;
    public final EmptyFillMeasurePolicymeasure1 write;

    @Override // o.getFragment
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 37;
        PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.MediaMetadataCompat;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public forEachFocusableIntersection(GetBubbleUiState getBubbleUiState, getQueryContext getquerycontext, getContentViewGroupParentLayout getcontentviewgroupparentlayout, EmptyFillMeasurePolicymeasure1 emptyFillMeasurePolicymeasure1, OnSessionTrackingFailedListener onSessionTrackingFailedListener, unregisterForContextMenu unregisterforcontextmenu, CombinedScopeView combinedScopeView, dispatchChildDetached dispatchchilddetached) {
        getcontentviewgroupparentlayout.getClass();
        this.serializer = getBubbleUiState;
        this.PlaybackStateCompatCustomAction = getquerycontext;
        this.IconCompatParcelizer = getcontentviewgroupparentlayout;
        this.write = emptyFillMeasurePolicymeasure1;
        this.MediaSessionCompatQueueItem = onSessionTrackingFailedListener;
        this.MediaBrowserCompatMediaItem = unregisterforcontextmenu;
        this.MediaDescriptionCompat = combinedScopeView;
        this.RatingCompat = dispatchchilddetached;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.MediaMetadataCompat = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(insertdefault.serializer);
        this.read = mutableStateFlow2;
        this.MediaSessionCompatResultReceiverWrapper = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new BubbleFloatingItemUiModelImpl$1(this, null, 1), 3);
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new BubbleFloatingItemUiModelImpl$1(this, null, 0), 3);
    }
}
