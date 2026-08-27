package o;

import com.sentiance.sdk.SdkStatus;
import com.sentiance.sdk.Sentiance;
import com.sentiance.sdk.trip.StartTripCallback;
import com.sentiance.sdk.trip.StartTripError;
import com.sentiance.sdk.trip.StartTripFailureReason;
import com.sentiance.sdk.trip.StartTripResult;

/* JADX INFO: loaded from: classes4.dex */
public final class getInAppMessageBitmapFromUrl implements StartTripCallback {
    final /* synthetic */ Sentiance IconCompatParcelizer;
    final /* synthetic */ BrazeNotificationUtilsExternalSyntheticLambda14 serializer;

    @Override // com.sentiance.sdk.trip.StartTripCallback
    public final void onFailure(SdkStatus sdkStatus) {
        Sentiance sentiance = this.IconCompatParcelizer;
        SdkStatus sdkStatus2 = sentiance.getSdkStatus();
        if (sdkStatus == null) {
            sdkStatus = sdkStatus2;
        }
        StartTripFailureReason tripStartFailureReason = sentiance.toTripStartFailureReason(sdkStatus);
        StartTripFailureReason startTripFailureReason = StartTripFailureReason.DETECTIONS_DISABLED;
        if (tripStartFailureReason == null) {
            tripStartFailureReason = startTripFailureReason;
        }
        this.serializer.serializer(new StartTripError(tripStartFailureReason, sdkStatus));
    }

    @Override // com.sentiance.sdk.trip.StartTripCallback
    public final void onSuccess() {
        this.serializer.write(new StartTripResult());
    }

    public getInAppMessageBitmapFromUrl(Sentiance sentiance, BrazeNotificationUtilsExternalSyntheticLambda14 brazeNotificationUtilsExternalSyntheticLambda14) {
        this.IconCompatParcelizer = sentiance;
        this.serializer = brazeNotificationUtilsExternalSyntheticLambda14;
    }
}
