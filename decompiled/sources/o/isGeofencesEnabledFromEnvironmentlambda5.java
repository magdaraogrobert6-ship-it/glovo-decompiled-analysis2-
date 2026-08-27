package o;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import com.sentiance.sdk.InjectUsing;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "NetworkState")
public class isGeofencesEnabledFromEnvironmentlambda5 extends isGeofencesEnabledFromEnvironmentlambda4 {
    private final parseLonglambda0 read;

    @Override // o.isGeofencesEnabledFromEnvironmentlambda4
    public final boolean read() {
        NetworkInfo activeNetworkInfo = this.IconCompatParcelizer.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // o.isGeofencesEnabledFromEnvironmentlambda4
    public final boolean serializer() {
        ConnectivityManager connectivityManager = this.IconCompatParcelizer;
        Network[] allNetworks = connectivityManager.getAllNetworks();
        if (allNetworks == null) {
            return false;
        }
        int length = allNetworks.length;
        int i = 0;
        while (true) {
            parseLonglambda0 parselonglambda0 = this.read;
            if (i >= length) {
                parselonglambda0.IconCompatParcelizer("None of the %d networks reported by ConnectivityManager were suitable", Integer.valueOf(allNetworks.length));
                return false;
            }
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(allNetworks[i]);
            if (networkInfo == null) {
                parselonglambda0.IconCompatParcelizer("Network info is null", new Object[0]);
            } else if (networkInfo.getType() == 1) {
                parselonglambda0.IconCompatParcelizer("Network of type %s is %s", read(networkInfo.getType()), networkInfo.isConnected() ? "connected" : "not connected");
                if (networkInfo.isConnected()) {
                    return true;
                }
            } else {
                parselonglambda0.IconCompatParcelizer("Network of type %s, ignoring", read(networkInfo.getType()));
            }
            i++;
        }
    }

    public isGeofencesEnabledFromEnvironmentlambda5(ConnectivityManager connectivityManager, WifiManager wifiManager, parseLonglambda0 parselonglambda0) {
        super(connectivityManager, wifiManager);
        this.read = parselonglambda0;
    }

    private static String read(int i) {
        String str;
        if (i == 0) {
            str = "Mobile";
        } else if (i != 1) {
            str = "Other";
        } else {
            str = "Wi-Fi";
        }
        return i + " (" + str + ")";
    }

    @Override // o.isGeofencesEnabledFromEnvironmentlambda4
    public final int IconCompatParcelizer() {
        ConnectivityManager connectivityManager = this.IconCompatParcelizer;
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
        NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(1);
        if (networkInfo == null || !networkInfo.isConnected()) {
            return (networkInfo2 == null || !networkInfo2.isConnected()) ? -1 : 1;
        }
        return 2;
    }
}
