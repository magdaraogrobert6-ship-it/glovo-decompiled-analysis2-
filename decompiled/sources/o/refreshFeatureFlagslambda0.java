package o;

import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.tnc.TncUiModelImpl$observeTncStatus$1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class refreshFeatureFlagslambda0 implements getFragment {
    private static int MediaSessionCompatResultReceiverWrapper = 0;
    private static int PlaybackStateCompatCustomAction = 1;
    public final requestBannersRefreshlambda120 IconCompatParcelizer;
    public final removeSingleSubscriptionlambda101 MediaBrowserCompatMediaItem;
    public final dispatchChildDetached MediaDescriptionCompat;
    public final StateFlow MediaMetadataCompat;
    public final r8lambda52ctlEduwkfz3l8UwwWKdau6wdM MediaSessionCompatQueueItem;
    public final setRegisteredPushToken MediaSessionCompatToken;
    public final requestBannersRefreshlambda1unsubscribeLocalListeners RatingCompat;
    public final ContextScope RemoteActionCompatParcelizer;
    public final getQueryContext read;
    public String serializer;
    public final MutableStateFlow write;

    @Override // o.getFragment
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 57;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaSessionCompatResultReceiverWrapper = i3;
        int i4 = i2 % 2;
        StateFlow stateFlow = this.MediaMetadataCompat;
        int i5 = i3 + 105;
        PlaybackStateCompatCustomAction = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 73 / 0;
        }
        return stateFlow;
    }

    public refreshFeatureFlagslambda0(getQueryContext getquerycontext, requestBannersRefreshlambda1unsubscribeLocalListeners requestbannersrefreshlambda1unsubscribelocallisteners, requestBannersRefreshlambda120 requestbannersrefreshlambda120, transferSessionPackageI transfersessionpackagei, r8lambda52ctlEduwkfz3l8UwwWKdau6wdM r8lambda52ctleduwkfz3l8uwwwkdau6wdm, setRegisteredPushToken setregisteredpushtoken, removeSingleSubscriptionlambda101 removesinglesubscriptionlambda101, dispatchChildDetached dispatchchilddetached, ContextScope contextScope) {
        this.read = getquerycontext;
        this.RatingCompat = requestbannersrefreshlambda1unsubscribelocallisteners;
        this.IconCompatParcelizer = requestbannersrefreshlambda120;
        this.MediaSessionCompatQueueItem = r8lambda52ctleduwkfz3l8uwwwkdau6wdm;
        this.MediaSessionCompatToken = setregisteredpushtoken;
        this.MediaBrowserCompatMediaItem = removesinglesubscriptionlambda101;
        this.MediaDescriptionCompat = dispatchchilddetached;
        this.RemoteActionCompatParcelizer = contextScope;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.write = mutableStateFlow;
        this.MediaMetadataCompat = mutableStateFlow;
        int i = 2;
        if (((FirebaseRemoteConfigImpl) transfersessionpackagei).IconCompatParcelizer(updateAdidI.WEB_VIEW_TNC_CONSENT_FLOW_ENABLED)) {
            ShortNewsContentCardView shortNewsContentCardView = null;
            BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new TncUiModelImpl$observeTncStatus$1(this, shortNewsContentCardView, 1), 3);
            BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new TncUiModelImpl$observeTncStatus$1(this, shortNewsContentCardView, i), 3);
            int i2 = MediaSessionCompatResultReceiverWrapper + 51;
            PlaybackStateCompatCustomAction = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        }
        int i4 = MediaSessionCompatResultReceiverWrapper + 91;
        PlaybackStateCompatCustomAction = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}
