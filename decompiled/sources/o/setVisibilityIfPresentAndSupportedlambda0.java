package o;

import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.payload.submission.PayloadSubmitter;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class setVisibilityIfPresentAndSupportedlambda0 extends deepcopyandroid_sdk_base_release {
    final /* synthetic */ PayloadSubmitter RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ setVisibilityIfPresentAndSupportedlambda0(PayloadSubmitter payloadSubmitter, clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar, int i) {
        super(clearandroid_sdk_base_releaseVar, "PayloadSubmitter");
        this.read = i;
        this.RemoteActionCompatParcelizer = payloadSubmitter;
    }

    @Override // o.deepcopyandroid_sdk_base_release
    public final void serializer(ControlMessage controlMessage, Object obj) {
        int i = this.read;
        PayloadSubmitter payloadSubmitter = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            String str = (String) obj;
            Objects.requireNonNull(str);
            payloadSubmitter.read(new wakeScreenIfAppropriatelambda0(str, "PayloadSubmitter", true, null));
        } else {
            if (i == 1) {
                isControl iscontrol = (isControl) obj;
                if (iscontrol != null) {
                    PayloadSubmitter.RemoteActionCompatParcelizer(payloadSubmitter, iscontrol.read());
                    return;
                }
                return;
            }
            payloadSubmitter.write.IconCompatParcelizer("Control Message:" + controlMessage.name(), "sending batched payloads");
            payloadSubmitter.read(new wakeScreenIfAppropriatelambda0("PayloadSubmitter", null));
        }
    }
}
