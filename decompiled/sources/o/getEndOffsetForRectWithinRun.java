package o;

import androidx.work.CoroutineWorker$startWork$1;
import com.roadrunner.delivery.accept.laststop.domain.LastStopSelectionCoordinator;
import com.roadrunner.map.container.safearea.SafeAreaPublisherImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class getEndOffsetForRectWithinRun implements findNestedRecyclerView {
    private static int MediaSessionCompatToken = 1;
    private static int RatingCompat;
    public final LastStopSelectionCoordinator IconCompatParcelizer;
    public final SafeAreaPublisherImpl MediaBrowserCompatMediaItem;
    public final StateFlow MediaDescriptionCompat;
    public final f2ExternalSyntheticLambda4 MediaMetadataCompat;
    public final StateFlow MediaSessionCompatQueueItem;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final getContentViewGroupParentLayout read;
    public final getRangeForRect serializer;
    public final MutableStateFlow write;

    @Override // o.findNestedRecyclerView
    public final StateFlow serializer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken;
        int i3 = i2 + 65;
        RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        StateFlow stateFlow = this.MediaSessionCompatQueueItem;
        int i5 = i2 + 81;
        RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public getEndOffsetForRectWithinRun(getRangeForRect getrangeforrect, LastStopSelectionCoordinator lastStopSelectionCoordinator, f2ExternalSyntheticLambda4 f2externalsyntheticlambda4, SafeAreaPublisherImpl safeAreaPublisherImpl, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        getcontentviewgroupparentlayout.getClass();
        this.serializer = getrangeforrect;
        this.IconCompatParcelizer = lastStopSelectionCoordinator;
        this.MediaMetadataCompat = f2externalsyntheticlambda4;
        this.MediaBrowserCompatMediaItem = safeAreaPublisherImpl;
        this.read = getcontentviewgroupparentlayout;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(null);
        this.write = mutableStateFlow;
        this.MediaDescriptionCompat = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.FALSE);
        this.RemoteActionCompatParcelizer = mutableStateFlow2;
        this.MediaSessionCompatQueueItem = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new CoroutineWorker$startWork$1(this, null, 24), 3);
    }
}
