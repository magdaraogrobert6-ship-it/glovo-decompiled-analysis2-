package o;

import com.sentiance.sdk.Sentiance;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaVASNITF2JtWbJ3L6rKMthGjKews extends getLatitudeannotations<unsubscribeFromBannersDismissedEvent> {
    final /* synthetic */ Sentiance RemoteActionCompatParcelizer;

    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<unsubscribeFromBannersDismissedEvent> getlongitudeannotations) {
        setBitmapUrl setbitmapurlSerializer;
        Sentiance sentiance = this.RemoteActionCompatParcelizer;
        sentiance.log("SDK stopped", new Object[0]);
        ((getAnalyticsEnabledEnterannotations) setPushUniqueId.read(getAnalyticsEnabledEnterannotations.class)).RemoteActionCompatParcelizer(this);
        performWork performworkRemoteActionCompatParcelizer = sentiance.mSdkStartStopQueue.RemoteActionCompatParcelizer();
        if (performworkRemoteActionCompatParcelizer != null && (setbitmapurlSerializer = performworkRemoteActionCompatParcelizer.serializer()) != null) {
            Sentiance.lambda$disableDetections$12(((shouldSkipCachinglambda0) setbitmapurlSerializer).RemoteActionCompatParcelizer, sentiance.getSdkStatus());
        }
        sentiance.mIsSdkStartingOrStopping = false;
        sentiance.runQueueIfPossible();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdaVASNITF2JtWbJ3L6rKMthGjKews(Sentiance sentiance, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        super(readandroid_sdk_base_releaseVar, "sentiance");
        this.RemoteActionCompatParcelizer = sentiance;
    }
}
