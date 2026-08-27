package com.mapbox.common;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
class ConnectionChangeCallback extends ConnectivityManager.NetworkCallback {
    private final WeakReference<Reachability> reachability;

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        notifyReachability();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        notifyReachability();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        notifyReachability();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        notifyReachability();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyReachability$0() {
        Reachability reachability = this.reachability.get();
        if (reachability != null) {
            reachability.onNetworkChanged();
        }
    }

    private void notifyReachability() {
        boolean z = Looper.myLooper() == Looper.getMainLooper();
        LifecycleUtils$$ExternalSyntheticLambda5 lifecycleUtils$$ExternalSyntheticLambda5 = new LifecycleUtils$$ExternalSyntheticLambda5(4, this);
        if (z) {
            lifecycleUtils$$ExternalSyntheticLambda5.run();
        } else {
            new Handler(Looper.getMainLooper()).post(lifecycleUtils$$ExternalSyntheticLambda5);
        }
    }

    public ConnectionChangeCallback(Reachability reachability) {
        this.reachability = new WeakReference<>(reachability);
    }
}
