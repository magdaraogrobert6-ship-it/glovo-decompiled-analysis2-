package o;

import android.annotation.SuppressLint;
import com.sentiance.sdk.events.ControlMessage;

/* JADX INFO: loaded from: classes3.dex */
final class BrazeNotificationUtilsBrazeNotificationBroadcastType extends deepcopyandroid_sdk_base_release {
    final /* synthetic */ getBrazePushEventType IconCompatParcelizer;

    @Override // o.deepcopyandroid_sdk_base_release
    @SuppressLint
    public final void serializer(ControlMessage controlMessage, Object obj) {
        ControlMessage controlMessage2 = ControlMessage.CALL_DETECTOR_START;
        getBrazePushEventType getbrazepusheventtype = this.IconCompatParcelizer;
        if (controlMessage == controlMessage2) {
            getBrazePushEventType.read(getbrazepusheventtype, (obj instanceof Boolean) && ((Boolean) obj).booleanValue());
        } else if (controlMessage == ControlMessage.CALL_DETECTOR_STOP) {
            getBrazePushEventType.serializer(getbrazepusheventtype);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazeNotificationUtilsBrazeNotificationBroadcastType(getBrazePushEventType getbrazepusheventtype, clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar) {
        super(clearandroid_sdk_base_releaseVar, "CallStateDetector");
        this.IconCompatParcelizer = getbrazepusheventtype;
    }
}
