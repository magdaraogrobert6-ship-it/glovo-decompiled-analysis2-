package o;

import com.sentiance.sdk.eventtimeline.api.EventTimelineApi;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class IPropertiesObject implements r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk {
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Date write;

    public /* synthetic */ IPropertiesObject(int i, Date date) {
        this.serializer = i;
        this.write = date;
    }

    @Override // o.r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk
    public final Object IconCompatParcelizer() {
        int i = this.serializer;
        Date date = this.write;
        return i != 0 ? EventTimelineApi.lambda$getTimelineUpdates$0(date) : EventTimelineApi.lambda$getTimelineUpdatesIncludingProvisionalEvents$1(date);
    }
}
