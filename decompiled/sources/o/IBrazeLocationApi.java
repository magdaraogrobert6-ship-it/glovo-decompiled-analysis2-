package o;

import com.incognia.internal.ZM$$ExternalSyntheticLambda0;
import com.sentiance.sdk.crashdetection.api.CrashDetectionApi;
import com.sentiance.sdk.crashdetection.api.VehicleCrashDiagnostic;
import com.sentiance.sdk.crashdetection.api.VehicleCrashDiagnosticListener;
import com.sentiance.sdk.events.ControlMessage;

/* JADX INFO: loaded from: classes4.dex */
public final class IBrazeLocationApi extends deepcopyandroid_sdk_base_release {
    final /* synthetic */ CrashDetectionApi serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IBrazeLocationApi(CrashDetectionApi crashDetectionApi) {
        super(crashDetectionApi.getParallelExecutor(), "CrashDetectionApi");
        this.serializer = crashDetectionApi;
    }

    @Override // o.deepcopyandroid_sdk_base_release
    public final void serializer(ControlMessage controlMessage, Object obj) {
        if (obj instanceof VehicleCrashDiagnostic) {
            VehicleCrashDiagnostic vehicleCrashDiagnostic = (VehicleCrashDiagnostic) obj;
            CrashDetectionApi crashDetectionApi = this.serializer;
            crashDetectionApi.log("Sending diagnostic data to the enclosing app: %s", vehicleCrashDiagnostic);
            VehicleCrashDiagnosticListener vehicleCrashDiagnosticListener = crashDetectionApi.mCrashDiagnosticListener;
            if (vehicleCrashDiagnosticListener != null) {
                readBoolean.serializer(new ZM$$ExternalSyntheticLambda0(vehicleCrashDiagnosticListener, 25, vehicleCrashDiagnostic));
            }
        }
    }
}
