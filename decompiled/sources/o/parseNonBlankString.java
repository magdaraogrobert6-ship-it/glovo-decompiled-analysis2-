package o;

import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.eventtimeline.transportsessionrecorder.api.TransportSession;
import com.sentiance.sdk.eventtimeline.transportsessionrecorder.api.TransportSessionApi;
import com.sentiance.sdk.eventtimeline.transportsessionrecorder.api.TransportSessionListener;
import io.sentry.Scopes$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes5.dex */
public final class parseNonBlankString extends deepcopyandroid_sdk_base_release {
    final /* synthetic */ TransportSessionApi IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public parseNonBlankString(TransportSessionApi transportSessionApi) {
        super(transportSessionApi.getParallelExecutor(), "EventTimelineApi");
        this.IconCompatParcelizer = transportSessionApi;
    }

    @Override // o.deepcopyandroid_sdk_base_release
    public final void serializer(ControlMessage controlMessage, Object obj) {
        if (controlMessage == ControlMessage.TRANSPORT_SESSION_COMPLETED && (obj instanceof TransportSession)) {
            TransportSession transportSession = (TransportSession) obj;
            TransportSessionListener transportSessionListener = this.IconCompatParcelizer.mTransportSessionListener;
            if (transportSessionListener != null) {
                readBoolean.serializer(new Scopes$$ExternalSyntheticLambda0(transportSessionListener, 8, transportSession));
            }
        }
    }
}
