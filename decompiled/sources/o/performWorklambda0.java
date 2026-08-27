package o;

import com.sentiance.sdk.OnStartFinishedHandler;
import com.sentiance.sdk.Sentiance;

/* JADX INFO: loaded from: classes3.dex */
public final class performWorklambda0 extends getLatitudeannotations<requestGeofenceRefresh> {
    final /* synthetic */ Sentiance RemoteActionCompatParcelizer;

    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<requestGeofenceRefresh> getlongitudeannotations) {
        OnStartFinishedHandler onStartFinishedHandlerIconCompatParcelizer;
        Sentiance sentiance = this.RemoteActionCompatParcelizer;
        sentiance.log("SDK started", new Object[0]);
        ((getAnalyticsEnabledEnterannotations) setPushUniqueId.read(getAnalyticsEnabledEnterannotations.class)).RemoteActionCompatParcelizer(this);
        performWork performworkRemoteActionCompatParcelizer = sentiance.mSdkStartStopQueue.RemoteActionCompatParcelizer();
        if (performworkRemoteActionCompatParcelizer != null && (onStartFinishedHandlerIconCompatParcelizer = performworkRemoteActionCompatParcelizer.IconCompatParcelizer()) != null) {
            onStartFinishedHandlerIconCompatParcelizer.onStartFinished(sentiance.getSdkStatus());
        }
        sentiance.mIsSdkStartingOrStopping = false;
        sentiance.runQueueIfPossible();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public performWorklambda0(Sentiance sentiance, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        super(readandroid_sdk_base_releaseVar, "sentiance");
        this.RemoteActionCompatParcelizer = sentiance;
    }
}
