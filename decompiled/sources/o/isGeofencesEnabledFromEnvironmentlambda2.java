package o;

import android.annotation.TargetApi;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.wifi.WifiManager;
import com.sentiance.sdk.InjectUsing;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "NetworkState")
@TargetApi
public class isGeofencesEnabledFromEnvironmentlambda2 extends isGeofencesEnabledFromEnvironmentlambda4 {
    private final parseLonglambda0 read;

    @Override // o.isGeofencesEnabledFromEnvironmentlambda4
    public final boolean read() {
        return serializer(0);
    }

    @Override // o.isGeofencesEnabledFromEnvironmentlambda4
    public final boolean serializer() {
        return serializer(1);
    }

    public isGeofencesEnabledFromEnvironmentlambda2(ConnectivityManager connectivityManager, WifiManager wifiManager, parseLonglambda0 parselonglambda0) {
        super(connectivityManager, wifiManager);
        this.read = parselonglambda0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3 */
    private boolean serializer(int i) {
        int i2;
        String str;
        String str2;
        ConnectivityManager connectivityManager = this.IconCompatParcelizer;
        parseLonglambda0 parselonglambda0 = this.read;
        try {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            try {
                if (activeNetwork == null) {
                    parselonglambda0.IconCompatParcelizer("Active network is null", new Object[0]);
                    return false;
                }
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities == null) {
                    parselonglambda0.IconCompatParcelizer("Network capabilities are null", new Object[0]);
                    return false;
                }
                boolean zHasTransport = networkCapabilities.hasTransport(1);
                boolean zHasTransport2 = networkCapabilities.hasTransport(0);
                boolean zHasCapability = networkCapabilities.hasCapability(11);
                boolean zHasCapability2 = networkCapabilities.hasCapability(19);
                boolean zHasCapability3 = networkCapabilities.hasCapability(12);
                boolean zHasCapability4 = networkCapabilities.hasCapability(13);
                if (zHasTransport) {
                    str = "wifi";
                } else {
                    str = "other";
                }
                if (zHasTransport2) {
                    str = "mobile";
                }
                if (zHasCapability) {
                    str2 = "not metered";
                } else {
                    str2 = "metered";
                }
                parselonglambda0.IconCompatParcelizer("Network is of type %s and is %s. Capabilities: fgUsage %s, internet %s, restricted %s.", str, str2, zHasCapability2 ? "yes" : "no", zHasCapability3 ? "yes" : "no", zHasCapability4 ? "no" : "yes");
                if ((zHasTransport && i == 1) || ((zHasTransport2 && i == 2) || ((zHasTransport || zHasTransport2) && i == 0))) {
                    return (i == 0 || i == 2 || zHasCapability) && zHasCapability2 && zHasCapability3 && zHasCapability4;
                }
                return false;
            } catch (SecurityException e) {
                e = e;
                i2 = 0;
            }
        } catch (SecurityException e2) {
            e = e2;
            i2 = 0;
        }
        parselonglambda0.IconCompatParcelizer(i2, e, "Received SecurityException while accessing ConnectivityManager", new Object[i2]);
        return i2;
    }

    @Override // o.isGeofencesEnabledFromEnvironmentlambda4
    public final int IconCompatParcelizer() {
        ConnectivityManager connectivityManager = this.IconCompatParcelizer;
        parseLonglambda0 parselonglambda0 = this.read;
        try {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasTransport(1)) {
                        return 1;
                    }
                    if (networkCapabilities.hasTransport(0)) {
                        return 2;
                    }
                } else {
                    parselonglambda0.IconCompatParcelizer("Network capabilities are null", new Object[0]);
                }
            } else {
                parselonglambda0.IconCompatParcelizer("Active network is null", new Object[0]);
            }
            return -1;
        } catch (SecurityException e) {
            parselonglambda0.IconCompatParcelizer(false, e, "Received SecurityException while accessing ConnectivityManager", new Object[0]);
            return -1;
        }
    }
}
