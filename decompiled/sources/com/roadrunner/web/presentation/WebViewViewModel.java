package com.roadrunner.web.presentation;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.ViewModel;
import com.roadrunner.logger.logger.sentry.SentryCriticalIssueLogger;
import io.grpc.internal.SharedResourcePool;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.BrazeExternalSyntheticLambda99;
import o.ShortNewsContentCardView;
import o.executeAsList;
import o.getCieXyz;
import o.isAdapterPositionOnScreen;
import o.isOpenInternalroom_runtime;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.qdExternalSyntheticLambda8;
import o.r8lambda1Du6vMW2psEy7y5ets5E4hHHZ8;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambda9WmZxQ0wdyigcPoXrobdieYXRv8;
import o.r8lambdaDgZfnZEk_YNXSsj7DOWrjAToNK0;
import o.r8lambdaFBhg_Qe5GHikJZF0cQ6G2RUyiU;
import o.removeNodeAtDepth;
import o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release;
import o.setRegisteredPushToken;
import o.setTransactionSuccessful;
import o.setUdmandroid_sdk_base_release;
import o.toBitmapConfig1JJdX4A;
import o.transferSessionPackageI;

/* JADX INFO: loaded from: classes3.dex */
public final class WebViewViewModel extends ViewModel {
    private static int MediaSessionCompatToken = 1;
    private static int ParcelableVolumeInfo;
    public final setTransactionSuccessful IconCompatParcelizer;
    public final setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release MediaBrowserCompatMediaItem;
    public r8lambdaDgZfnZEk_YNXSsj7DOWrjAToNK0 MediaDescriptionCompat;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU MediaMetadataCompat;
    public final setUdmandroid_sdk_base_release MediaSessionCompatQueueItem;
    public final setRegisteredPushToken PlaybackStateCompatCustomAction;
    public final StateFlow RatingCompat;
    public final SharedResourcePool RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final transferSessionPackageI serializer;
    public final isOpenInternalroom_runtime write;

    public final SharedResourcePool RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 51;
        int i3 = i2 % Fields.SpotShadowColor;
        ParcelableVolumeInfo = i3;
        int i4 = i2 % 2;
        SharedResourcePool sharedResourcePool = this.RemoteActionCompatParcelizer;
        int i5 = i3 + 57;
        MediaSessionCompatToken = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return sharedResourcePool;
    }

    public WebViewViewModel(SharedResourcePool sharedResourcePool, setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release, isOpenInternalroom_runtime isopeninternalroom_runtime, transferSessionPackageI transfersessionpackagei, setTransactionSuccessful settransactionsuccessful, setUdmandroid_sdk_base_release setudmandroid_sdk_base_release, setRegisteredPushToken setregisteredpushtoken, qdExternalSyntheticLambda8 qdexternalsyntheticlambda8) {
        boolean zHasCapability;
        NetworkCapabilities networkCapabilities;
        sharedResourcePool.getClass();
        sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.getClass();
        isopeninternalroom_runtime.getClass();
        transfersessionpackagei.getClass();
        settransactionsuccessful.getClass();
        setudmandroid_sdk_base_release.getClass();
        setregisteredpushtoken.getClass();
        qdexternalsyntheticlambda8.getClass();
        this.RemoteActionCompatParcelizer = sharedResourcePool;
        this.MediaBrowserCompatMediaItem = sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release;
        this.write = isopeninternalroom_runtime;
        this.serializer = transfersessionpackagei;
        this.IconCompatParcelizer = settransactionsuccessful;
        this.MediaSessionCompatQueueItem = setudmandroid_sdk_base_release;
        this.PlaybackStateCompatCustomAction = setregisteredpushtoken;
        ShortNewsContentCardView shortNewsContentCardView = null;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(null);
        this.read = mutableStateFlow;
        isAdapterPositionOnScreen isadapterpositiononscreen = qdexternalsyntheticlambda8.serializer;
        Network activeNetwork = ((ConnectivityManager) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper()).getActiveNetwork();
        int i = 0;
        if (activeNetwork == null || (networkCapabilities = ((ConnectivityManager) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper()).getNetworkCapabilities(activeNetwork)) == null) {
            zHasCapability = false;
        } else {
            zHasCapability = networkCapabilities.hasCapability(16);
            int i2 = ParcelableVolumeInfo + 51;
            MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        this.RatingCompat = FlowKt.write(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(mutableStateFlow, new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(Boolean.valueOf(zHasCapability)), new WebViewViewModel$viewState$1(this, shortNewsContentCardView, i)), toBitmapConfig1JJdX4A.IconCompatParcelizer(this), SharingStarted.Companion.read(2), BrazeExternalSyntheticLambda99.write);
        int i5 = MediaSessionCompatToken + 119;
        ParcelableVolumeInfo = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    public final void serializer() {
        int i = 2 % 2;
        ShortNewsContentCardView shortNewsContentCardView = null;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new WebViewViewModel$startTimeoutTimer$1(this, shortNewsContentCardView, 1), 3);
        int i2 = MediaSessionCompatToken + 49;
        ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return;
        }
        shortNewsContentCardView.hashCode();
        throw null;
    }

    public final void read(String str) {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 41;
        MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str.getClass();
        this.read.IconCompatParcelizer(str);
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.MediaMetadataCompat;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
        }
        this.MediaMetadataCompat = BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new WebViewViewModel$startTimeoutTimer$1(this, shortNewsContentCardView, 0), 3);
        int i4 = ParcelableVolumeInfo + 109;
        MediaSessionCompatToken = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void serializer(WebResourceRequest webResourceRequest, int i, boolean z) {
        r8lambda9WmZxQ0wdyigcPoXrobdieYXRv8 r8lambda9wmzxq0wdyigcpoxrobdieyxrv8;
        Uri url;
        int i2 = 2 % 2;
        int i3 = MediaSessionCompatToken + 31;
        ParcelableVolumeInfo = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        String string = (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) ? null : url.toString();
        if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
            return;
        }
        int i4 = MediaSessionCompatToken + 69;
        ParcelableVolumeInfo = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{string, this.read.read()}, getCieXyz.write())).booleanValue();
            obj.hashCode();
            throw null;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{string, this.read.read()}, getCieXyz.write())).booleanValue()) {
            int i5 = ParcelableVolumeInfo + 65;
            MediaSessionCompatToken = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            setUdmandroid_sdk_base_release setudmandroid_sdk_base_release = this.MediaSessionCompatQueueItem;
            if ((!z) && r8lambda1Du6vMW2psEy7y5ets5E4hHHZ8.IconCompatParcelizer.contains(Integer.valueOf(i))) {
                setudmandroid_sdk_base_release.getClass();
                ((SentryCriticalIssueLogger) setudmandroid_sdk_base_release.read).write("web_view_network_error", executeAsList.RXP, "Connection failed, DNS resolution failure, Offline", onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("network_error_code", String.valueOf(i)), new onViewAttachedToWindowlambda0("web_view_error", "Network failure"), new onViewAttachedToWindowlambda0("url", string != null ? string : "")));
                r8lambda9wmzxq0wdyigcpoxrobdieyxrv8 = r8lambda9WmZxQ0wdyigcPoXrobdieYXRv8.CLIENT_SIDE;
            } else if (z) {
                ((SentryCriticalIssueLogger) setudmandroid_sdk_base_release.read).write("web_view_http_error", executeAsList.RXP, "Server returns 4xx or 5xx status code", onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("http_error_code", String.valueOf(i)), new onViewAttachedToWindowlambda0("url", string != null ? string : "")));
                if (i == 401 || i == 403) {
                    r8lambda9wmzxq0wdyigcpoxrobdieyxrv8 = r8lambda9WmZxQ0wdyigcPoXrobdieYXRv8.CLIENT_SIDE;
                } else {
                    this.MediaDescriptionCompat = new r8lambdaDgZfnZEk_YNXSsj7DOWrjAToNK0(r8lambdaFBhg_Qe5GHikJZF0cQ6G2RUyiU.FAILED, Boolean.FALSE, String.valueOf(i));
                    r8lambda9wmzxq0wdyigcpoxrobdieyxrv8 = r8lambda9WmZxQ0wdyigcPoXrobdieYXRv8.SERVER_SIDE;
                }
            } else {
                this.MediaDescriptionCompat = new r8lambdaDgZfnZEk_YNXSsj7DOWrjAToNK0(r8lambdaFBhg_Qe5GHikJZF0cQ6G2RUyiU.FAILED, Boolean.FALSE, String.valueOf(i));
                r8lambda9wmzxq0wdyigcpoxrobdieyxrv8 = r8lambda9WmZxQ0wdyigcPoXrobdieYXRv8.SERVER_SIDE;
            }
            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new WebViewViewModel$handleWebViewError$1(this, string, i, r8lambda9wmzxq0wdyigcpoxrobdieyxrv8, null), 3);
        }
    }
}
