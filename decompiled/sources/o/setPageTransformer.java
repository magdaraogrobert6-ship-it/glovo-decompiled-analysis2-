package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.localPushNotifications.smartPolling.domain.MissingDeliveryIdException;
import com.roadrunner.networking.core.NetworkingCoreModule$$ExternalSyntheticLambda2;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class setPageTransformer {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat;
    private static int RemoteActionCompatParcelizer;
    public static final String serializer;
    public static final String write;
    public final isAdapterPositionOnScreen IconCompatParcelizer = new isAdapterPositionOnScreen(new NetworkingCoreModule$$ExternalSyntheticLambda2(2, this));
    public final ViewPager2SavedState1 read;

    static {
        String value = foregroundTimerFiredI.BACK_TO_BACK_DELIVERY_DISPATCHED.getValue();
        write = value;
        serializer = ff$$ExternalSyntheticOutline0.m("{\"category\":\"", value, "\",\"message_new_id\":\"0\"}");
        int i = MediaBrowserCompatMediaItem + 35;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 99 / 0;
        }
    }

    public setPageTransformer(ViewPager2SavedState1 viewPager2SavedState1) {
        this.read = viewPager2SavedState1;
    }

    public final checkAdjustAdRevenue RemoteActionCompatParcelizer(r8lambdafHcIMtqslO5nN2ofGE631aElY r8lambdafhcimtqslo5nn2ofge631aely, setFitInsetsSides setfitinsetssides) throws MissingDeliveryIdException {
        int i = 2 % 2;
        r8lambdafhcimtqslo5nn2ofge631aely.getClass();
        if (setfitinsetssides != null) {
            int i2 = MediaDescriptionCompat + 117;
            RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                List list = setfitinsetssides.routes;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            List list2 = setfitinsetssides.routes;
            if (list2 != null) {
                int i3 = MediaDescriptionCompat + 25;
                RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                DialogLayout1 dialogLayout1 = (DialogLayout1) onContentCardDismissed.MediaMetadataCompat(list2);
                if (dialogLayout1 != null) {
                    int i5 = RatingCompat + 25;
                    MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    String str = dialogLayout1.deliveryId;
                    if (str != null) {
                        deleteGlobalCallbackParameters deleteglobalcallbackparameters = new deleteGlobalCallbackParameters(str.hashCode(), r8lambdafhcimtqslo5nn2ofge631aely.IconCompatParcelizer, r8lambdafhcimtqslo5nn2ofge631aely.serializer, createDeeplinkIntentI.OPEN_APP);
                        isAdapterPositionOnScreen isadapterpositiononscreen = this.IconCompatParcelizer;
                        return new checkAdjustAdRevenue(deleteglobalcallbackparameters, new checkEventI(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("com.foodora.courier.", (String) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper()), "High priority back to back local", (String) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper(), 65280, null, checkForPreinstallI.HIGH), new checkForInstallReferrerInfo(str, "0", "0", "route_changed", write, true, serializer, null, null, null), deleteEventMetadata.Local);
                    }
                }
            }
        }
        throw new MissingDeliveryIdException("Back to back orders push notification invoked with empty metadata or empty delivery id");
    }
}
