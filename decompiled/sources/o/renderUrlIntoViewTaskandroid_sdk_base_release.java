package o;

import com.sentiance.sdk.SdkStatus;
import com.sentiance.sdk.Sentiance;
import com.sentiance.sdk.trip.StopTripCallback;
import com.sentiance.sdk.trip.StopTripError;
import com.sentiance.sdk.trip.StopTripFailureReason;
import com.sentiance.sdk.trip.StopTripResult;

/* JADX INFO: loaded from: classes3.dex */
public final class renderUrlIntoViewTaskandroid_sdk_base_release implements StopTripCallback {
    final /* synthetic */ BrazeNotificationUtilsExternalSyntheticLambda14 IconCompatParcelizer;
    final /* synthetic */ Sentiance serializer;

    @Override // com.sentiance.sdk.trip.StopTripCallback
    public final void onFailure(SdkStatus sdkStatus) {
        SdkStatus sdkStatus2 = this.serializer.getSdkStatus();
        if (sdkStatus == null) {
            sdkStatus = sdkStatus2;
        }
        this.IconCompatParcelizer.serializer(new StopTripError(StopTripFailureReason.NO_ONGOING_TRIP, sdkStatus));
    }

    @Override // com.sentiance.sdk.trip.StopTripCallback
    public final void onSuccess() {
        this.IconCompatParcelizer.write(new StopTripResult());
    }

    public renderUrlIntoViewTaskandroid_sdk_base_release(Sentiance sentiance, BrazeNotificationUtilsExternalSyntheticLambda14 brazeNotificationUtilsExternalSyntheticLambda14) {
        this.serializer = sentiance;
        this.IconCompatParcelizer = brazeNotificationUtilsExternalSyntheticLambda14;
    }
}
