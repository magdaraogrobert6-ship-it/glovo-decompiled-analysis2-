package o;

import com.sentiance.sdk.eventtimeline.api.EventTimelineApi;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class getTrackingStringandroid_sdk_base_release implements r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk {
    public final /* synthetic */ Date IconCompatParcelizer;
    public final /* synthetic */ Date RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ getTrackingStringandroid_sdk_base_release(Date date, Date date2, int i) {
        this.read = i;
        this.IconCompatParcelizer = date;
        this.RemoteActionCompatParcelizer = date2;
    }

    @Override // o.r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk
    public final Object IconCompatParcelizer() {
        return this.read != 0 ? EventTimelineApi.lambda$getTimelineEvents$2(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer) : EventTimelineApi.lambda$getTimelineEventsIncludingProvisionalOnes$3(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer);
    }
}
