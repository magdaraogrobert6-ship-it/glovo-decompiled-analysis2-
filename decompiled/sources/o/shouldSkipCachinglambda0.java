package o;

import com.sentiance.sdk.OnStartFinishedHandler;
import com.sentiance.sdk.SdkStatus;
import com.sentiance.sdk.Sentiance;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class shouldSkipCachinglambda0 implements setBitmapUrl, OnStartFinishedHandler {
    public final /* synthetic */ BrazeNotificationUtilsExternalSyntheticLambda14 RemoteActionCompatParcelizer;

    public /* synthetic */ shouldSkipCachinglambda0(BrazeNotificationUtilsExternalSyntheticLambda14 brazeNotificationUtilsExternalSyntheticLambda14) {
        this.RemoteActionCompatParcelizer = brazeNotificationUtilsExternalSyntheticLambda14;
    }

    @Override // com.sentiance.sdk.OnStartFinishedHandler
    public void onStartFinished(SdkStatus sdkStatus) {
        Sentiance.lambda$enableDetections$9(this.RemoteActionCompatParcelizer, sdkStatus);
    }
}
