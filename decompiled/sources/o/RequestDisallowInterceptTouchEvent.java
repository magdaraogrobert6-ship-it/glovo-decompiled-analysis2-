package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import okio.Options;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RequestDisallowInterceptTouchEvent {
    public static getConfigfwf_client_release write() {
        getCacheImplementationfwf_client_release getcacheimplementationfwf_client_release = Options.Companion.ParcelableVolumeInfo;
        if (getcacheimplementationfwf_client_release != null) {
            return getcacheimplementationfwf_client_release.read;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Koin is not initialized. Make sure to initialize first with a call to `init(application)`");
        return null;
    }
}
