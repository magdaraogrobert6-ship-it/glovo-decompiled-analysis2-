package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.Lambda;
import okio.Options;

/* JADX INFO: loaded from: classes2.dex */
public final class lockHardwareCanvas extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public static final lockHardwareCanvas serializer = new lockHardwareCanvas(0);

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        getCacheImplementationfwf_client_release getcacheimplementationfwf_client_release = Options.Companion.ParcelableVolumeInfo;
        if (getcacheimplementationfwf_client_release != null) {
            return (com.deliveryhero.customerchat.service.ChatService) getcacheimplementationfwf_client_release.read.IconCompatParcelizer.serializer.RemoteActionCompatParcelizer(null, displayInAppMessagelambda1.serializer(com.deliveryhero.customerchat.service.ChatService.class), null);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Koin is not initialized. Make sure to initialize first with a call to `init(application)`");
        return null;
    }

    public lockHardwareCanvas(int i) {
        super(i);
    }
}
