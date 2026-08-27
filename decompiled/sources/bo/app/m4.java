package bo.app;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes.dex */
public final class m4 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ q4 a;

    public m4(q4 q4Var) {
        this.a = q4Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        super.onCapabilitiesChanged(network, networkCapabilities);
        this.a.a(networkCapabilities);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        super.onLost(network);
        Network activeNetwork = this.a.i.getActiveNetwork();
        q4 q4Var = this.a;
        q4Var.a(q4Var.i.getNetworkCapabilities(activeNetwork));
    }
}
