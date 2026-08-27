package o;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes.dex */
public final class RectangleShapeKtRectangleShape1 implements RenderEffect {
    public final ConnectivityManager read;

    @Override // o.RenderEffect
    public final boolean write() {
        ConnectivityManager connectivityManager = this.read;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    public RectangleShapeKtRectangleShape1(ConnectivityManager connectivityManager) {
        this.read = connectivityManager;
    }
}
