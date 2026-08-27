package o;

import java.util.logging.Logger;
import org.tensorflow.lite.TensorFlowLite;

/* JADX INFO: loaded from: classes3.dex */
public final class getGeofencesEnabledFromServerConfig {
    private final isAdapterPositionOnScreen serializer = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(0) { // from class: com.sentiance.sdk.deviceinfo.TensorFlowLiteInfoProvider$version$2
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final Object invoke() {
            try {
                Logger logger = TensorFlowLite.RemoteActionCompatParcelizer;
                Object objInvoke = TensorFlowLite.class.getDeclaredMethod("runtimeVersion", null).invoke(null, null);
                if (objInvoke instanceof String) {
                    return (String) objInvoke;
                }
            } catch (Exception unused) {
            }
            return null;
        }
    });

    public final String serializer() {
        return (String) this.serializer.MediaSessionCompatResultReceiverWrapper();
    }
}
