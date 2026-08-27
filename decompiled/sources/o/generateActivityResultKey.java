package o;

import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.home.state.data.RiderStateRepositoryImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class generateActivityResultKey implements getFragment {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final getContentViewGroupParentLayout IconCompatParcelizer;
    public final StateFlow MediaBrowserCompatMediaItem;
    public final getFocusedView MediaDescriptionCompat;
    public final StateFlow RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final getEnterTransitionCallback read;
    public final MutableStateFlow serializer;
    public final SaveHeatmapUrlImpl write;

    @Override // o.getFragment
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 35;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaMetadataCompat = i3;
        int i4 = i2 % 2;
        StateFlow stateFlow = this.MediaBrowserCompatMediaItem;
        int i5 = i3 + 1;
        MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public generateActivityResultKey(getEnterTransitionCallback getentertransitioncallback, getFocusedView getfocusedview, SaveHeatmapUrlImpl saveHeatmapUrlImpl, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        getentertransitioncallback.getClass();
        getfocusedview.getClass();
        saveHeatmapUrlImpl.getClass();
        getcontentviewgroupparentlayout.getClass();
        this.read = getentertransitioncallback;
        this.MediaDescriptionCompat = getfocusedview;
        this.write = saveHeatmapUrlImpl;
        this.IconCompatParcelizer = getcontentviewgroupparentlayout;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.TRUE);
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.MediaBrowserCompatMediaItem = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(new SingleProcessDataStorefile2(0));
        this.serializer = mutableStateFlow2;
        this.RatingCompat = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new RiderStateRepositoryImpl.AnonymousClass1(this, null, 18), 3);
    }
}
