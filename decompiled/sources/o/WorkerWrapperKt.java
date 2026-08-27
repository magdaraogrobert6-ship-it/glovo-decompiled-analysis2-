package o;

import com.roadrunner.home.nest.divider.DividerUiModelImpl$1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class WorkerWrapperKt implements getFragment {
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    private static int PlaybackStateCompatCustomAction;
    public final WorkManagerInitializer IconCompatParcelizer;
    public final StateFlow MediaBrowserCompatMediaItem;
    public final StateFlow MediaDescriptionCompat;
    public final r8lambda_DFitVNGGDuLNvZ_AZfzdRTp1Ik MediaMetadataCompat;
    public final WorkManagerImpl MediaSessionCompatQueueItem;
    public final accessrunWorker RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final StateFlow read;
    public final WorkerWrapperBuilder serializer;
    public final MutableStateFlow write;

    @Override // o.getFragment
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper;
        int i3 = i2 + 35;
        PlaybackStateCompatCustomAction = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        StateFlow stateFlow = this.read;
        int i5 = i2 + 45;
        PlaybackStateCompatCustomAction = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return stateFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public WorkerWrapperKt(WorkManagerImpl workManagerImpl, accessrunWorker accessrunworker, WorkerWrapperBuilder workerWrapperBuilder, r8lambda_DFitVNGGDuLNvZ_AZfzdRTp1Ik r8lambda_dfitvnggdulnvz_azfzdrtp1ik, transferSessionPackageI transfersessionpackagei, WorkManagerInitializer workManagerInitializer, ContextScope contextScope) {
        this.MediaSessionCompatQueueItem = workManagerImpl;
        this.RatingCompat = accessrunworker;
        this.serializer = workerWrapperBuilder;
        this.MediaMetadataCompat = r8lambda_dfitvnggdulnvz_azfzdrtp1ik;
        this.IconCompatParcelizer = workManagerInitializer;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.read = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(WorkDatabase.write);
        this.write = mutableStateFlow2;
        this.MediaBrowserCompatMediaItem = mutableStateFlow2;
        this.MediaDescriptionCompat = accessrunworker.write;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (((FirebaseRemoteConfigImpl) transfersessionpackagei).IconCompatParcelizer(updateAdidI.IS_LOCATION_PERMISSION_TOGGLE_ENABLED)) {
            BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new DividerUiModelImpl$1(this, shortNewsContentCardView, 21), 3);
            int i = PlaybackStateCompatCustomAction + 53;
            MediaSessionCompatResultReceiverWrapper = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        }
        int i3 = MediaSessionCompatResultReceiverWrapper + 3;
        PlaybackStateCompatCustomAction = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
    }
}
