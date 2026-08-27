package o;

import com.sentiance.sdk.events.ControlMessage;

/* JADX INFO: loaded from: classes3.dex */
final class r8lambdaQas8BY90k4E_z5u1zlP_eSaUi9U extends deepcopyandroid_sdk_base_release {
    final /* synthetic */ r8lambdaMiz9IrkK7Q7UB6htOHoIqxpE3WQ read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdaQas8BY90k4E_z5u1zlP_eSaUi9U(r8lambdaMiz9IrkK7Q7UB6htOHoIqxpE3WQ r8lambdamiz9irkk7q7ub6htohoiqxpe3wq, clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar) {
        super(clearandroid_sdk_base_releaseVar, "AppForegroundSessionManager");
        this.read = r8lambdamiz9irkk7q7ub6htohoiqxpe3wq;
    }

    @Override // o.deepcopyandroid_sdk_base_release
    public final void serializer(ControlMessage controlMessage, Object obj) {
        if (controlMessage == ControlMessage.CONFIGURATION_UPDATED) {
            r8lambdaMiz9IrkK7Q7UB6htOHoIqxpE3WQ.write(this.read);
        }
    }
}
