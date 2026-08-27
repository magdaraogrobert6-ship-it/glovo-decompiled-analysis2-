package o;

import com.roadrunner.localPushNotifications.smartPolling.domain.MissingDeliveryIdException;
import com.roadrunner.networking.core.NetworkingCoreModule$$ExternalSyntheticLambda2;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class PrefetchNetworkException {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final setTransactionSuccessful RemoteActionCompatParcelizer;
    public final isAdapterPositionOnScreen serializer = new isAdapterPositionOnScreen(new NetworkingCoreModule$$ExternalSyntheticLambda2(3, this));
    public final ViewPager2SavedState1 write;

    public PrefetchNetworkException(ViewPager2SavedState1 viewPager2SavedState1, setTransactionSuccessful settransactionsuccessful) {
        this.write = viewPager2SavedState1;
        this.RemoteActionCompatParcelizer = settransactionsuccessful;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0035 A[PHI: r13
  0x0035: PHI (r13v8 o.DialogLayout1) = (r13v7 o.DialogLayout1), (r13v14 o.DialogLayout1) binds: [B:12:0x0033, B:9:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    public final checkAdjustAdRevenue serializer(AndroidView_androidKtcreateAndroidViewNodeFactory11 androidView_androidKtcreateAndroidViewNodeFactory11, setFitInsetsSides setfitinsetssides) throws MissingDeliveryIdException {
        DialogLayout1 dialogLayout1;
        String str;
        int i = 2 % 2;
        androidView_androidKtcreateAndroidViewNodeFactory11.getClass();
        if (setfitinsetssides != null) {
            int i2 = IconCompatParcelizer + 113;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            List list = setfitinsetssides.routes;
            if (list != null) {
                int i4 = read + 111;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    dialogLayout1 = (DialogLayout1) onContentCardDismissed.MediaMetadataCompat(list);
                    int i5 = 13 / 0;
                    if (dialogLayout1 != null) {
                        str = dialogLayout1.deliveryId;
                        if (str != null) {
                            int iHashCode = str.hashCode();
                            setTransactionSuccessful settransactionsuccessful = this.RemoteActionCompatParcelizer;
                            deleteGlobalCallbackParameters deleteglobalcallbackparameters = new deleteGlobalCallbackParameters(iHashCode, settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.delivery_accept_new_delivery_notification_title), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.delivery_accept_new_delivery_notification_body), createDeeplinkIntentI.OPEN_APP);
                            isAdapterPositionOnScreen isadapterpositiononscreen = this.serializer;
                            return new checkAdjustAdRevenue(deleteglobalcallbackparameters, new checkEventI(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("com.foodora.courier.", (String) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper()), "High priority local", (String) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper(), 65280, null, checkForPreinstallI.HIGH), new checkForInstallReferrerInfo(str, "0", "0", "route_changed", "delivery_dispatched", true, "{\"category\":\"delivery_dispatched\",\"message_new_id\":\"0\"}", null, null, null), deleteEventMetadata.Local);
                        }
                    }
                } else {
                    dialogLayout1 = (DialogLayout1) onContentCardDismissed.MediaMetadataCompat(list);
                    if (dialogLayout1 != null) {
                        str = dialogLayout1.deliveryId;
                        if (str != null) {
                            int iHashCode2 = str.hashCode();
                            setTransactionSuccessful settransactionsuccessful2 = this.RemoteActionCompatParcelizer;
                            deleteGlobalCallbackParameters deleteglobalcallbackparameters2 = new deleteGlobalCallbackParameters(iHashCode2, settransactionsuccessful2.IconCompatParcelizer(com.logistics.rider.glovo.R.string.delivery_accept_new_delivery_notification_title), settransactionsuccessful2.IconCompatParcelizer(com.logistics.rider.glovo.R.string.delivery_accept_new_delivery_notification_body), createDeeplinkIntentI.OPEN_APP);
                            isAdapterPositionOnScreen isadapterpositiononscreen2 = this.serializer;
                            return new checkAdjustAdRevenue(deleteglobalcallbackparameters2, new checkEventI(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("com.foodora.courier.", (String) isadapterpositiononscreen2.MediaSessionCompatResultReceiverWrapper()), "High priority local", (String) isadapterpositiononscreen2.MediaSessionCompatResultReceiverWrapper(), 65280, null, checkForPreinstallI.HIGH), new checkForInstallReferrerInfo(str, "0", "0", "route_changed", "delivery_dispatched", true, "{\"category\":\"delivery_dispatched\",\"message_new_id\":\"0\"}", null, null, null), deleteEventMetadata.Local);
                        }
                    }
                }
            }
        }
        throw new MissingDeliveryIdException("Accept push notification invoked with empty metadata or empty delivery id");
    }
}
