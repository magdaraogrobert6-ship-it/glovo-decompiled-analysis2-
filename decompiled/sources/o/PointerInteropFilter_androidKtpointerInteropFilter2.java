package o;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import bo.app.n$$ExternalSyntheticLambda3;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PointerInteropFilter_androidKtpointerInteropFilter2 {
    public static n$$ExternalSyntheticLambda3 serializer(ConnectivityManager connectivityManager, NetworkRequest networkRequest, Recomposer$$ExternalSyntheticLambda4 recomposer$$ExternalSyntheticLambda4) {
        findOverlaps findoverlaps = new findOverlaps(recomposer$$ExternalSyntheticLambda4);
        cancelPendingWebViewPause cancelpendingwebviewpause = new cancelPendingWebViewPause();
        try {
            setRotationX setrotationx = setRotationX.read();
            int i = forEachui_graphics.IconCompatParcelizer;
            setrotationx.getClass();
            connectivityManager.registerNetworkCallback(networkRequest, findoverlaps);
            cancelpendingwebviewpause.IconCompatParcelizer = true;
        } catch (RuntimeException e) {
            if (!setCarryoverInAppMessage.read(e.getClass().getName(), "TooManyRequestsException", false)) {
                throw e;
            }
            setRotationX setrotationx2 = setRotationX.read();
            int i2 = forEachui_graphics.IconCompatParcelizer;
            setrotationx2.getClass();
            recomposer$$ExternalSyntheticLambda4.invoke(new rebalance(7));
        }
        return new n$$ExternalSyntheticLambda3(cancelpendingwebviewpause, connectivityManager, findoverlaps, 9);
    }
}
