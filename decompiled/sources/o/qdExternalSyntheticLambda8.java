package o;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import com.roadrunner.rider.state.provider.domain.SaveShiftInfo$invoke$2;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class qdExternalSyntheticLambda8 implements SemanticsInfo {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU IconCompatParcelizer;
    public final getContentViewGroupParentLayout MediaDescriptionCompat;
    public final io.sentry.android.core.internal.util.write RemoteActionCompatParcelizer;
    public final Flow read;
    public final isAdapterPositionOnScreen serializer;
    public final MutableStateFlow write;

    public qdExternalSyntheticLambda8(Application application, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        this.MediaDescriptionCompat = getcontentviewgroupparentlayout;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.TRUE);
        this.write = mutableStateFlow;
        this.read = mutableStateFlow;
        this.serializer = new isAdapterPositionOnScreen(new subscribeToContentCardsUpdateslambda30(application, 9));
        this.RemoteActionCompatParcelizer = new io.sentry.android.core.internal.util.write(2, this);
    }

    public final void write(Network network) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 9;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 % 2 != 0) {
            shortNewsContentCardView.hashCode();
            throw null;
        }
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.IconCompatParcelizer;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
        }
        this.IconCompatParcelizer = BuildersKt.RemoteActionCompatParcelizer(this.MediaDescriptionCompat, null, null, new SaveShiftInfo$invoke$2(this, network, shortNewsContentCardView, 4), 3);
        int i3 = MediaSessionCompatQueueItem + 119;
        MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return;
        }
        shortNewsContentCardView.hashCode();
        throw null;
    }

    @Override // o.SemanticsInfo
    public final Object init(ShortNewsContentCardView shortNewsContentCardView) throws Exception {
        int i = 2 % 2;
        isAdapterPositionOnScreen isadapterpositiononscreen = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        try {
            ((ConnectivityManager) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper()).registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).addCapability(16).build(), this.RemoteActionCompatParcelizer);
            Network activeNetwork = ((ConnectivityManager) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper()).getActiveNetwork();
            if (activeNetwork == null) {
                this.write.IconCompatParcelizer(Boolean.FALSE);
                int i2 = MediaMetadataCompat + 91;
                MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    int i3 = 11 / 0;
                }
                return createfromparcel;
            }
            int i4 = MediaSessionCompatQueueItem + 19;
            MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                write(activeNetwork);
                throw null;
            }
            write(activeNetwork);
            int i5 = MediaMetadataCompat + 39;
            MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return createfromparcel;
        } catch (SecurityException e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Failed to register network callback due to Android platform bug", new Object[0]);
            return createfromparcel;
        } catch (Exception e2) {
            throw e2;
        }
    }
}
