package com.mapbox.common;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.FocusListener;

/* JADX INFO: loaded from: classes5.dex */
public class Reachability implements ReachabilityInterface {
    private ConnectionChangeCallback callback;
    private final ConnectivityManager connectivityManager;
    private final Context context;
    public int peer;
    public final String TAG = "MapboxReachability";
    public int timeoutInMs = 200;
    private final Map<Long, ReachabilityChanged> listeners = new ConcurrentHashMap();
    private NetworkStatus currentStatus = NetworkStatus.NOT_REACHABLE;
    private boolean publish = false;

    @Override // com.mapbox.common.ReachabilityInterface
    public long addListener(ReachabilityChanged reachabilityChanged) {
        long newId;
        synchronized (this) {
            newId = IdGenerator.getNewId();
            this.listeners.put(Long.valueOf(newId), reachabilityChanged);
            reachabilityChanged.run(this.currentStatus);
            this.publish = true;
        }
        return newId;
    }

    @Override // com.mapbox.common.ReachabilityInterface
    public NetworkStatus currentNetworkStatus() {
        NetworkStatus networkStatus;
        synchronized (this) {
            networkStatus = this.currentStatus;
        }
        return networkStatus;
    }

    @Override // com.mapbox.common.ReachabilityInterface
    public boolean isReachable() {
        synchronized (this) {
            boolean z = false;
            if (FocusListener.write(this.context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                try {
                    ConnectivityManager connectivityManager = this.connectivityManager;
                    NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                    if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                        z = true;
                    }
                    return z;
                } catch (RuntimeException e) {
                    Log.error("ConnectivityManager interaction failed with exception: " + e.getMessage(), "MapboxReachability");
                    return false;
                }
            }
            return false;
        }
    }

    public void onNetworkChanged() {
        synchronized (this) {
            NetworkStatus networkStatus = this.currentStatus;
            this.currentStatus = NetworkStatus.NOT_REACHABLE;
            if (FocusListener.write(this.context, "android.permission.ACCESS_NETWORK_STATE") == -1) {
                Log.warning("Unable to get application permission for ACCESS_NETWORK_STATE", "MapboxReachability");
                return;
            }
            try {
                ConnectivityManager connectivityManager = this.connectivityManager;
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasTransport(1)) {
                        this.currentStatus = NetworkStatus.REACHABLE_VIA_WI_FI;
                    } else if (networkCapabilities.hasTransport(0)) {
                        this.currentStatus = NetworkStatus.REACHABLE_VIA_WWAN;
                    } else if (networkCapabilities.hasTransport(3)) {
                        this.currentStatus = NetworkStatus.REACHABLE_VIA_ETHERNET;
                    }
                }
                if (this.publish && networkStatus != this.currentStatus) {
                    Iterator<ReachabilityChanged> it = this.listeners.values().iterator();
                    while (it.hasNext()) {
                        it.next().run(this.currentStatus);
                    }
                }
            } catch (RuntimeException e) {
                Log.error("ConnectivityManager interaction failed with exception: " + e.getMessage(), "MapboxReachability");
            }
        }
    }

    @Override // com.mapbox.common.ReachabilityInterface
    public boolean removeListener(long j) {
        synchronized (this) {
            try {
                this.listeners.remove(Long.valueOf(j));
                if (this.listeners.isEmpty()) {
                    this.publish = false;
                }
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }

    public static ReachabilityInterface createPlatformReachability() {
        return new Reachability(null);
    }

    public void finalize() {
        try {
            ConnectionChangeCallback connectionChangeCallback = this.callback;
            if (connectionChangeCallback != null) {
                this.connectivityManager.unregisterNetworkCallback(connectionChangeCallback);
            }
            super.finalize();
        } catch (Throwable th) {
            Log.error(th.toString(), "MapboxReachability");
        }
    }

    public Reachability(String str) {
        Context context = MapboxSDKCommon.INSTANCE.getContext();
        this.context = context;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.connectivityManager = connectivityManager;
        this.callback = null;
        if (connectivityManager == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write((Object) "This Android platform doesn't have Connectivity Service");
            throw null;
        }
        if (FocusListener.write(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).addCapability(16).build();
            Log.info("Application permission for ACCESS_NETWORK_STATE granted", "MapboxReachability");
            ConnectionChangeCallback connectionChangeCallback = new ConnectionChangeCallback(this);
            try {
                connectivityManager.registerNetworkCallback(networkRequestBuild, connectionChangeCallback);
                this.callback = connectionChangeCallback;
            } catch (RuntimeException e) {
                Log.error("Failed to subscribe to network connectivity changes: " + e.getMessage(), "MapboxReachability");
            }
        } else {
            Log.warning("Couldn't get application permission for ACCESS_NETWORK_STATE", "MapboxReachability");
        }
        onNetworkChanged();
    }
}
