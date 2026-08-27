package o;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes2.dex */
public final class GraphicsLayerV23Companion extends updateLayerProperties {
    @Override // o.updateLayerProperties
    public final boolean RemoteActionCompatParcelizer() {
        ConnectivityManager connectivityManager = this.serializer;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
    }

    public GraphicsLayerV23Companion(ConnectivityManager connectivityManager) {
        super(connectivityManager);
    }
}
