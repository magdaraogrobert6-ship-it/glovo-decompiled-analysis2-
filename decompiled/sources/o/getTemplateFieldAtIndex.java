package o;

import com.sentiance.sdk.eventtimeline.transportsessionrecorder.api.TransportSessionApi;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class getTemplateFieldAtIndex implements r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk {
    public final /* synthetic */ TransportSessionApi serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ getTemplateFieldAtIndex(TransportSessionApi transportSessionApi, int i) {
        this.write = i;
        this.serializer = transportSessionApi;
    }

    @Override // o.r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk
    public final Object IconCompatParcelizer() {
        int i = this.write;
        TransportSessionApi transportSessionApi = this.serializer;
        return i != 0 ? transportSessionApi.lambda$isTransportSessionRecordingEnabled$0() : transportSessionApi.lambda$getAvailableTransportSessions$4();
    }
}
