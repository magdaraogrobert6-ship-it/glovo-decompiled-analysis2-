package o;

import com.huawei.hms.location.LocationRequest;
import com.roadrunner.auth.domain.logout.ClearDataUseCaseImpl$invoke$2;
import com.roadrunner.delivery.accept.laststop.domain.LastStopSelectionCoordinator;
import com.roadrunner.delivery.accept.laststop.presentation.lastStopMapLayer.LastStopMapLayerUiModelImpl$1;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class TextLayout_androidKt implements ec {
    private static int MediaSessionCompatQueueItem = 0;
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    private static int PlaybackStateCompatCustomAction = 0;
    private static int RatingCompat = 1;
    public static final long RemoteActionCompatParcelizer;
    public static final /* synthetic */ int read = 0;
    public final MutableStateFlow IconCompatParcelizer;
    public final List MediaBrowserCompatMediaItem;
    public boolean MediaDescriptionCompat;
    public final StateFlow MediaMetadataCompat;
    public final getContentViewGroupParentLayout serializer;
    public final LastStopSelectionCoordinator write;

    @Override // o.ec
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 51;
        MediaSessionCompatResultReceiverWrapper = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.MediaMetadataCompat;
        }
        throw null;
    }

    public TextLayout_androidKt(LastStopSelectionCoordinator lastStopSelectionCoordinator, f2ExternalSyntheticLambda4 f2externalsyntheticlambda4, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        getcontentviewgroupparentlayout.getClass();
        this.write = lastStopSelectionCoordinator;
        this.serializer = getcontentviewgroupparentlayout;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new f9(instance_delegatelambda0.write));
        this.IconCompatParcelizer = mutableStateFlow;
        this.MediaMetadataCompat = mutableStateFlow;
        Object[] objArr = {new g0ExternalSyntheticLambda1(g5.ALWAYS)};
        int iSerializer = getQueryParameterslambda2.serializer();
        this.MediaBrowserCompatMediaItem = (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
        ShortNewsContentCardView shortNewsContentCardView = null;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new LastStopMapLayerUiModelImpl$1(f2externalsyntheticlambda4, this, shortNewsContentCardView, 0), 3);
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new LastStopMapLayerUiModelImpl$1(f2externalsyntheticlambda4, this, shortNewsContentCardView, 1), 3);
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new ClearDataUseCaseImpl$invoke$2(this, shortNewsContentCardView, 25), 3);
    }

    static {
        unregisterInAppMessageManager unregisterinappmessagemanager = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
        RemoteActionCompatParcelizer = coil3.UriKt.RemoteActionCompatParcelizer(LocationRequest.PRIORITY_INDOOR, setUnregisteredInAppMessage.MILLISECONDS);
        int i = RatingCompat + 15;
        MediaSessionCompatQueueItem = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 66 / 0;
        }
    }
}
