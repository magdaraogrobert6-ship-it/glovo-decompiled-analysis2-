package o;

import com.sentiance.sdk.Sentiance;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.trip.StartTripCallback;

/* JADX INFO: loaded from: classes4.dex */
public final class getMemoryCache extends deepcopyandroid_sdk_base_release {
    final /* synthetic */ Sentiance read;
    final /* synthetic */ getAnalyticsEnabledEnterannotations serializer;
    final /* synthetic */ StartTripCallback write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getMemoryCache(Sentiance sentiance, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, StartTripCallback startTripCallback) {
        super(readandroid_sdk_base_releaseVar, "sentiance");
        this.read = sentiance;
        this.serializer = getanalyticsenabledenterannotations;
        this.write = startTripCallback;
    }

    @Override // o.deepcopyandroid_sdk_base_release
    public final void serializer(ControlMessage controlMessage, Object obj) {
        this.serializer.read(this);
        readBoolean.serializer(new isDiskCacheStarting(this, ((Boolean) obj).booleanValue()));
    }
}
