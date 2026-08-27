package o;

import android.content.Context;
import com.roadrunner.networking.core.NetworkingCoreModule$$ExternalSyntheticLambda2;
import com.roadrunner.push.messages.display.backgroud.services.SendPushReceiptWorker;
import java.time.Clock;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdaisEnabled9 implements getViewWidget {
    private static int MediaDescriptionCompat = 0;
    private static int PlaybackStateCompat = 1;
    public final handleThirdPartySharingCallbackI IconCompatParcelizer;
    public final transferSessionPackageI MediaBrowserCompatMediaItem;
    public final lambdaaddGlobalCallbackParameter20 MediaMetadataCompat;
    public final isEnabledI MediaSessionCompatQueueItem;
    public final getPivotOffsetF1C5BW0 RatingCompat;
    public final getToggleableState RemoteActionCompatParcelizer;
    public final gotOptOutResponseI read;
    public final EnumColumnAdapter serializer;
    public final Clock write;

    public lambdaisEnabled9(handleThirdPartySharingCallbackI handlethirdpartysharingcallbacki, isEnabledI isenabledi, getPivotOffsetF1C5BW0 getpivotoffsetf1c5bw0, gotOptOutResponseI gotoptoutresponsei, transferSessionPackageI transfersessionpackagei, EnumColumnAdapter enumColumnAdapter, getToggleableState gettoggleablestate, lambdaaddGlobalCallbackParameter20 lambdaaddglobalcallbackparameter20, Clock clock) {
        this.IconCompatParcelizer = handlethirdpartysharingcallbacki;
        this.MediaSessionCompatQueueItem = isenabledi;
        this.RatingCompat = getpivotoffsetf1c5bw0;
        this.read = gotoptoutresponsei;
        this.MediaBrowserCompatMediaItem = transfersessionpackagei;
        this.serializer = enumColumnAdapter;
        this.RemoteActionCompatParcelizer = gettoggleablestate;
        this.MediaMetadataCompat = lambdaaddglobalcallbackparameter20;
        this.write = clock;
    }

    @Override // o.getViewWidget
    public final accesssetSpotShadowColor8_81llAjd read(Context context, androidx.work.WorkerParameters workerParameters) {
        int i = 2 % 2;
        context.getClass();
        SendPushReceiptWorker sendPushReceiptWorker = new SendPushReceiptWorker(context, workerParameters, this.IconCompatParcelizer, this.MediaSessionCompatQueueItem, this.RatingCompat, this.read, this.MediaBrowserCompatMediaItem, this.serializer, this.RemoteActionCompatParcelizer, new NetworkingCoreModule$$ExternalSyntheticLambda2(23, this), this.MediaMetadataCompat);
        int i2 = MediaDescriptionCompat + 41;
        PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return sendPushReceiptWorker;
    }
}
