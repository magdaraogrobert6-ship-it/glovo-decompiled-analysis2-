package o;

import com.roadrunner.startworking.api.navigation.StartWorkingNavAction;
import com.roadrunner.startworking.equipment.navigation.EquipmentBottomSheetParams;
import com.roadrunner.startworking.oneclick.OneClickStartWorkingViewModel;
import com.roadrunner.twofa.presentation.TwoFaViewModel;
import com.roadrunner.vendor.review.presentation.option.VendorReviewOptionUiModelImpl;
import com.roadrunner.vendor.review.presentation.option.VendorReviewOptionUiModelImpl$onPositiveClick$1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class subscribeToBannersUpdateslambda1 extends FunctionReferenceImpl implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ subscribeToBannersUpdateslambda1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.RemoteActionCompatParcelizer = i3;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = write + 15;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i4 == 0) {
            ((TwoFaViewModel) this.MediaMetadataCompat).read();
            return createfromparcel;
        }
        int i5 = 0;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i4 == 1) {
            OneClickStartWorkingViewModel oneClickStartWorkingViewModel = (OneClickStartWorkingViewModel) this.MediaMetadataCompat;
            ((decode) oneClickStartWorkingViewModel.PlaybackStateCompatCustomAction.IconCompatParcelizer).logEvent("equipment_change", null);
            oneClickStartWorkingViewModel.PlaybackStateCompat.serializer(new logCustomEventlambda10(new EquipmentBottomSheetParams(false, (StartWorkingNavAction) oneClickStartWorkingViewModel.ResultReceiver.MediaSessionCompatResultReceiverWrapper())));
            int i6 = read + 51;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return createfromparcel;
        }
        if (i4 == 2) {
            OneClickStartWorkingViewModel oneClickStartWorkingViewModel2 = (OneClickStartWorkingViewModel) this.MediaMetadataCompat;
            ((decode) oneClickStartWorkingViewModel2.PlaybackStateCompatCustomAction.IconCompatParcelizer).logEvent("start_working_modal_closed", null);
            oneClickStartWorkingViewModel2.PlaybackStateCompat.serializer(logBannerClicklambda1.write);
            return createfromparcel;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                ((handleInAppMessageTestPushandroid_sdk_base_release) this.MediaMetadataCompat).write.serializer(logPushNotificationOpened.write);
                return createfromparcel;
            }
            handleInAppMessageTestPushandroid_sdk_base_release handleinappmessagetestpushandroid_sdk_base_release = (handleInAppMessageTestPushandroid_sdk_base_release) this.MediaMetadataCompat;
            Object obj = handleinappmessagetestpushandroid_sdk_base_release.MediaBrowserCompatMediaItem.read();
            obj.getClass();
            logPushDeliveryandroid_sdk_base_release logpushdeliveryandroid_sdk_base_release = (logPushDeliveryandroid_sdk_base_release) obj;
            handleinappmessagetestpushandroid_sdk_base_release.serializer.IconCompatParcelizer(logPushDeliveryandroid_sdk_base_release.RemoteActionCompatParcelizer(logpushdeliveryandroid_sdk_base_release, logpushdeliveryandroid_sdk_base_release.IconCompatParcelizer, null, null, 30));
            return createfromparcel;
        }
        VendorReviewOptionUiModelImpl vendorReviewOptionUiModelImpl = (VendorReviewOptionUiModelImpl) this.MediaMetadataCompat;
        vendorReviewOptionUiModelImpl.write.IconCompatParcelizer(new verifyProperSdkSetuplambda0(subscribeToNoMatchingTriggerForEventlambda0.POSITIVE));
        subscribeToNewInAppMessageslambda1 subscribetonewinappmessageslambda1 = vendorReviewOptionUiModelImpl.MediaDescriptionCompat;
        subscribeToPushNotificationEventslambda0 subscribetopushnotificationeventslambda0 = vendorReviewOptionUiModelImpl.MediaSessionCompatQueueItem;
        long j = vendorReviewOptionUiModelImpl.read;
        subscribetonewinappmessageslambda1.getClass();
        subscribetopushnotificationeventslambda0.getClass();
        subscribetonewinappmessageslambda1.write.logEvent("rider_vendor_review_success_positive", onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("screenName", subscribetopushnotificationeventslambda0.getValue()), new onViewAttachedToWindowlambda0("currentDeliveryId", String.valueOf(j))));
        BuildersKt.RemoteActionCompatParcelizer(vendorReviewOptionUiModelImpl.serializer, null, null, new VendorReviewOptionUiModelImpl$onPositiveClick$1(vendorReviewOptionUiModelImpl, shortNewsContentCardView, i5), 3);
        return createfromparcel;
    }
}
