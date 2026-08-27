package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.login.presentation.otp.OtpNavigationKt$$ExternalSyntheticLambda4;
import com.roadrunner.overlay.bubble.permission.presentation.OverlayPermissionViewModel$onDialogOpened$1;
import io.sentry.util.network.NetworkBody;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class accessexecute extends androidx.lifecycle.ViewModel {
    private static int MediaDescriptionCompat = 1;
    private static int MediaMetadataCompat;
    public final NetworkBody IconCompatParcelizer;
    public final StateFlow MediaBrowserCompatMediaItem;
    public final isAdapterPositionOnScreen MediaSessionCompatQueueItem;
    public final getBitmapui_graphics RemoteActionCompatParcelizer;
    public final getQueryContext read;
    public final CrossfadePainter serializer;
    public final MutableStateFlow write;

    public accessexecute(NetworkBody networkBody, getBitmapui_graphics getbitmapui_graphics, HttpException httpException, getQueryContext getquerycontext, CrossfadePainter crossfadePainter) {
        networkBody.getClass();
        getbitmapui_graphics.getClass();
        httpException.getClass();
        getquerycontext.getClass();
        crossfadePainter.getClass();
        this.IconCompatParcelizer = networkBody;
        this.RemoteActionCompatParcelizer = getbitmapui_graphics;
        this.read = getquerycontext;
        this.serializer = crossfadePainter;
        this.MediaSessionCompatQueueItem = new isAdapterPositionOnScreen(new OtpNavigationKt$$ExternalSyntheticLambda4(httpException, 16, this));
        MutableStateFlow mutableStateFlow = StateFlowKt.read(null);
        this.write = mutableStateFlow;
        this.MediaBrowserCompatMediaItem = mutableStateFlow;
    }

    public final void IconCompatParcelizer() {
        int i = 2 % 2;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new OverlayPermissionViewModel$onDialogOpened$1(this, null, 0), 3);
        int i2 = MediaDescriptionCompat + 101;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 88 / 0;
        }
    }

    public final void read() {
        Object networkFetcherfetch2;
        int i = 2 % 2;
        Boolean bool = (Boolean) ((MemoryCacheService) this.MediaSessionCompatQueueItem.MediaSessionCompatResultReceiverWrapper()).read.write("DRAW_OVER_OTHER_APPS_REQUESTED_KEY");
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        NetworkBody networkBody = this.IconCompatParcelizer;
        boolean z = ((DiskLruCacheEditor) networkBody.RemoteActionCompatParcelizer).read();
        if (z) {
            int i2 = MediaMetadataCompat + 53;
            MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                accesstoImageSource accesstoimagesource = accesstoImageSource.RemoteActionCompatParcelizer;
                throw null;
            }
            networkFetcherfetch2 = accesstoImageSource.RemoteActionCompatParcelizer;
            int i3 = MediaMetadataCompat + 51;
            MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        } else if (z || !zBooleanValue) {
            setTransactionSuccessful settransactionsuccessful = ((BrazeExternalSyntheticLambda28) networkBody.IconCompatParcelizer).read;
            networkFetcherfetch2 = new NetworkFetcherfetch2(settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.overlay_permission_dialog_title), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.overlay_permission_dialog_description), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.overlay_permission_dialog_main_action_button_title), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.overlay_permission_dialog_skip_action_button_title));
        } else {
            networkFetcherfetch2 = NetworkFetcherdoFetchfetchResult1.RemoteActionCompatParcelizer;
        }
        boolean z2 = networkFetcherfetch2 instanceof accesstoImageSource;
        proceed proceedVar = proceed.write;
        getQueryContext getquerycontext = this.read;
        if (z2) {
            getquerycontext.serializer(proceedVar);
            return;
        }
        if (networkFetcherfetch2 instanceof NetworkFetcherdoFetchfetchResult1) {
            getquerycontext.serializer(proceedVar);
            return;
        }
        if (!(networkFetcherfetch2 instanceof NetworkFetcherfetch2)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return;
        }
        MutableStateFlow mutableStateFlow = this.write;
        if (!networkFetcherfetch2.equals(mutableStateFlow.read())) {
            int i5 = MediaMetadataCompat + 75;
            MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            mutableStateFlow.IconCompatParcelizer(networkFetcherfetch2);
        }
        int i7 = MediaMetadataCompat + 97;
        MediaDescriptionCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            throw null;
        }
    }
}
