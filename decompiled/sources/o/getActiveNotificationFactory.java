package o;

import android.annotation.SuppressLint;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.payload.batching.PayloadBatcher;

/* JADX INFO: loaded from: classes3.dex */
public final class getActiveNotificationFactory extends deepcopyandroid_sdk_base_release {
    final /* synthetic */ PayloadBatcher write;

    @Override // o.deepcopyandroid_sdk_base_release
    @SuppressLint
    public final void serializer(ControlMessage controlMessage, Object obj) {
        ControlMessage controlMessage2 = ControlMessage.PAYLOAD_BATCHER_TRIGGERED;
        PayloadBatcher payloadBatcher = this.write;
        if (controlMessage == controlMessage2) {
            payloadBatcher.MediaSessionCompatToken.run();
        } else if (controlMessage == ControlMessage.PAYLOAD_SUBMISSION_RESULT) {
            PayloadBatcher.serializer(payloadBatcher);
            PayloadBatcher.write(payloadBatcher);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getActiveNotificationFactory(PayloadBatcher payloadBatcher, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        super(readandroid_sdk_base_releaseVar, "PayloadBatcher");
        this.write = payloadBatcher;
    }
}
