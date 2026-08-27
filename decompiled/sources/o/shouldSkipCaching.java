package o;

import com.sentiance.sdk.Sentiance;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.trip.StopTripCallback;

/* JADX INFO: loaded from: classes3.dex */
public final class shouldSkipCaching extends deepcopyandroid_sdk_base_release {
    final /* synthetic */ Sentiance read;
    final /* synthetic */ StopTripCallback serializer;
    final /* synthetic */ getAnalyticsEnabledEnterannotations write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public shouldSkipCaching(Sentiance sentiance, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, StopTripCallback stopTripCallback) {
        super(readandroid_sdk_base_releaseVar, "sentiance");
        this.read = sentiance;
        this.write = getanalyticsenabledenterannotations;
        this.serializer = stopTripCallback;
    }

    @Override // o.deepcopyandroid_sdk_base_release
    public final void serializer(ControlMessage controlMessage, Object obj) {
        this.write.read(this);
        if (obj instanceof getTrackingId) {
            readBoolean.serializer(new setOffline(this, (getTrackingId) obj));
        }
    }
}
