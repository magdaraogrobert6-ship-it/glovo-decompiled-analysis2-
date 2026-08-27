package o;

import android.media.AudioAttributes;
import java.lang.annotation.Annotation;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class subscribeToFeatureFlagsUpdateslambda1 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ subscribeToFeatureFlagsUpdateslambda1(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = serializer + 47;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        switch (this.RemoteActionCompatParcelizer) {
            case 0:
                return new AudioAttributes.Builder().setUsage(10).setContentType(4).build();
            case 1:
                beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
                return new beforeOpened(beforeinappmessageviewclosed, beforeinappmessageviewclosed);
            case 2:
                return new setWasCloseMessageCalled(getContentCardCountlambda0.Companion.serializer(), 0);
            case 3:
                return new setWasCloseMessageCalled(getContentCardCountlambda0.Companion.serializer(), 0);
            case 4:
                return new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0);
            case 5:
                return new DefaultInAppMessageHtmlFullViewFactory("com.roadrunner.startworking.data.startworking.oneclick.StartWorkingComponent", displayInAppMessagelambda1.serializer(getContentCardCountlambda0.class), new getUnregisteredInAppMessageannotations[]{displayInAppMessagelambda1.serializer(getConfigurationProviderSafelambda0.class), displayInAppMessagelambda1.serializer(getContentCardUnviewedCountlambda0.class), displayInAppMessagelambda1.serializer(getCustomBrazeNotificationFactory.class), displayInAppMessagelambda1.serializer(getDeviceIdAsynclambda0.class), displayInAppMessagelambda1.serializer(getCurrentUserlambda0.class), displayInAppMessagelambda1.serializer(getFeatureFlaglambda0.class), displayInAppMessagelambda1.serializer(getDeviceIdProviderandroid_sdk_base_releaseannotations.class)}, new setGraphicModalMaxWidthDp[]{getConfiguredApiKey.IconCompatParcelizer, getConfigurationProviderandroid_sdk_base_releaseannotations.write, getContentCardsLastUpdatedInSecondsFromEpochlambda0.write, getDeviceDataProvider.serializer, getOutboundNetworkRequestsOffline.write, getPushDeliveryManagerandroid_sdk_base_releaseannotations.serializer, getExternalIEventMessengerandroid_sdk_base_releaseannotations.IconCompatParcelizer}, new Annotation[0]);
            case 6:
                return new setWasCloseMessageCalled(getBannerlambda0.RemoteActionCompatParcelizer, 0);
            case 7:
                return DelayKt.serializer(new BrazeInAppMessageManagerExternalSyntheticLambda45(15));
            case 8:
                return new AudioAttributes.Builder().setUsage(10).setContentType(4).build();
            case 9:
                return new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0);
            case 10:
                return new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0);
            case 11:
                return new setWasCloseMessageCalled(getAllFeatureFlags.IconCompatParcelizer, 0);
            default:
                setWasCloseMessageCalled setwasclosemessagecalled = new setWasCloseMessageCalled(dismissBanner.write, 0);
                int i4 = serializer + 119;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return setwasclosemessagecalled;
        }
    }
}
