package o;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager$copy$1;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.roadrunner.rider.safety.report.presentation.RiderSafetyReportViewModel$1;
import com.sentiance.core.model.thrift.k$c;
import io.grpc.internal.SharedResourcePool;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class getProcessName extends androidx.lifecycle.ViewModel {
    public final MutableStateFlow IconCompatParcelizer;
    public boolean MediaBrowserCompatMediaItem;
    public final OtpLogger MediaDescriptionCompat;
    public final GetAppStateImpl MediaMetadataCompat;
    public final switchToOfflineMode MediaSessionCompatQueueItem;
    public final MutableStateFlow MediaSessionCompatToken;
    public final SharedResourcePool RatingCompat;
    public final k$c RemoteActionCompatParcelizer;
    public final GetAppStateImpl read;
    public final AdjustConfig serializer;
    public final AdjustConfig write;

    public getProcessName(k$c k_c, AdjustConfig adjustConfig, GetAppStateImpl getAppStateImpl, AdjustConfig adjustConfig2, OtpLogger otpLogger, GetAppStateImpl getAppStateImpl2, switchToOfflineMode switchtoofflinemode, SharedResourcePool sharedResourcePool) {
        k_c.getClass();
        adjustConfig.getClass();
        getAppStateImpl.getClass();
        adjustConfig2.getClass();
        otpLogger.getClass();
        getAppStateImpl2.getClass();
        switchtoofflinemode.getClass();
        sharedResourcePool.getClass();
        this.RemoteActionCompatParcelizer = k_c;
        this.write = adjustConfig;
        this.read = getAppStateImpl;
        this.serializer = adjustConfig2;
        this.MediaDescriptionCompat = otpLogger;
        this.MediaMetadataCompat = getAppStateImpl2;
        this.MediaSessionCompatQueueItem = switchtoofflinemode;
        this.RatingCompat = sharedResourcePool;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(getOnThirdPartySharingSettingsChangedListener.read);
        this.IconCompatParcelizer = mutableStateFlow;
        this.MediaSessionCompatToken = mutableStateFlow;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new TextFieldSelectionManager$copy$1(true, this, null), 3);
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new RiderSafetyReportViewModel$1(this, null, 0), 3);
    }
}
