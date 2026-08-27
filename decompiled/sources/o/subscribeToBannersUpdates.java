package o;

import io.grpc.internal.SharedResourcePool;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes3.dex */
public final class subscribeToBannersUpdates implements getColorIntegerOrNulllambda0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int read;

    public /* synthetic */ subscribeToBannersUpdates(int i) {
        this.read = i;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = 11;
        int i3 = 24;
        switch (this.read) {
            case 0:
                setRegisteredPushToken setregisteredpushtoken = new setRegisteredPushToken();
                int i4 = write + 49;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    return setregisteredpushtoken;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            case 1:
                return new getActionViewIntentlambda0();
            case 2:
                return new AndroidUiDispatcherCompanioncurrentThread1(i3);
            case 3:
                return new isMainThread(i3);
            case 4:
                return new ImageHeaderParserImageType();
            case 5:
                return RangesKt.write(logLocationRecordedEventFromLocationUpdatelambda1.write);
            case 6:
                return new logPushStoryPageClickedlambda11(new AndroidUiFrameClock(), new accessisMainThread());
            case 7:
                BrazeExternalSyntheticLambda5 brazeExternalSyntheticLambda5 = new BrazeExternalSyntheticLambda5(10);
                int i5 = write + 89;
                RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 53 / 0;
                }
                return brazeExternalSyntheticLambda5;
            case 8:
                return new retryInAppMessagelambda1();
            case 9:
                return new BrazeExternalSyntheticLambda5(i2);
            case 10:
                return new getSdkEnablementProviderandroid_sdk_base_release(i2);
            case 11:
                return new SharedResourcePool(24);
            default:
                setDefaultNotificationChannelNameandroid_sdk_base_release setdefaultnotificationchannelnameandroid_sdk_base_release = new setDefaultNotificationChannelNameandroid_sdk_base_release(14);
                int i7 = write + 59;
                RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    int i8 = 65 / 0;
                }
                return setdefaultnotificationchannelnameandroid_sdk_base_release;
        }
    }
}
