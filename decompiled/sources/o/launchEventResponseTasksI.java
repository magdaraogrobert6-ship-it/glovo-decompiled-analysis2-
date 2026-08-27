package o;

import com.roadrunner.realtime.data.SocketIoGuard;
import com.roadrunner.realtime.domain.RealtimeConnectionManagerImpl$observeMessages$1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class launchEventResponseTasksI {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final MutableStateFlow IconCompatParcelizer;
    public final launchDeeplinkMain MediaBrowserCompatMediaItem;
    public final SharedFlowImpl MediaDescriptionCompat;
    public final SocketIoGuard RatingCompat;
    public final lambdatrackThirdPartySharing37 RemoteActionCompatParcelizer;
    public final SharedFlowImpl read;
    public final getContentViewGroupParentLayout serializer;
    public final StateFlow write;

    public launchEventResponseTasksI(SocketIoGuard socketIoGuard, lambdatrackThirdPartySharing37 lambdatrackthirdpartysharing37, launchDeeplinkMain launchdeeplinkmain, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        this.RatingCompat = socketIoGuard;
        this.RemoteActionCompatParcelizer = lambdatrackthirdpartysharing37;
        this.MediaBrowserCompatMediaItem = launchdeeplinkmain;
        this.serializer = getcontentviewgroupparentlayout;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.IconCompatParcelizer = mutableStateFlow;
        this.write = mutableStateFlow;
        SharedFlowImpl sharedFlowImplRemoteActionCompatParcelizer = SharedFlowKt.RemoteActionCompatParcelizer(0, 16, IInAppMessageViewWrapper.DROP_OLDEST);
        this.read = sharedFlowImplRemoteActionCompatParcelizer;
        this.MediaDescriptionCompat = sharedFlowImplRemoteActionCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("RealtimeConnectionManager initialized", new Object[0]);
        ShortNewsContentCardView shortNewsContentCardView = null;
        RealtimeConnectionManagerImpl$observeMessages$1 realtimeConnectionManagerImpl$observeMessages$1 = new RealtimeConnectionManagerImpl$observeMessages$1(this, shortNewsContentCardView, 1);
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = this.serializer;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, realtimeConnectionManagerImpl$observeMessages$1, 3);
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new RealtimeConnectionManagerImpl$observeMessages$1(this, shortNewsContentCardView, 2), 3);
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new RealtimeConnectionManagerImpl$observeMessages$1(this, shortNewsContentCardView, 0), 3);
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new RealtimeConnectionManagerImpl$observeMessages$1(this, shortNewsContentCardView, 3), 3);
        int i2 = MediaSessionCompatQueueItem + 87;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return;
        }
        shortNewsContentCardView.hashCode();
        throw null;
    }
}
