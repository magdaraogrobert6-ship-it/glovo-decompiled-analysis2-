package o;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.transition.Transition$1;
import java.util.concurrent.ThreadPoolExecutor;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final class toContentCaptureSessionCompat {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final Context IconCompatParcelizer;
    public Object write;

    public toContentCaptureSessionCompat() {
        Context context = placeAtf8xVGno.read();
        this.IconCompatParcelizer = context;
        Object systemService = context.getSystemService("phone");
        if (systemService instanceof TelephonyManager) {
            this.write = (TelephonyManager) systemService;
            int i = read + 59;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 3 % 5;
            } else {
                int i3 = 2 % 2;
            }
        }
        int i4 = RemoteActionCompatParcelizer + 73;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
    }

    public toContentCaptureSessionCompat(Application application, Transition$1 transition$1) {
        application.getClass();
        transition$1.getClass();
        this.IconCompatParcelizer = application;
        this.write = transition$1;
    }

    public void serializer(ContentCaptureSessionCompatApi29Impl contentCaptureSessionCompatApi29Impl) {
        int i = 2 % 2;
        int i2 = read + 43;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        TelephonyManager telephonyManager = (TelephonyManager) this.write;
        Context context = this.IconCompatParcelizer;
        if (telephonyManager == null) {
            Object systemService = context.getSystemService("phone");
            if (!(systemService instanceof TelephonyManager)) {
                WrappedCompositionsetContent1211.read("CellScanManager", "telephonyManager is null");
                return;
            }
            this.write = (TelephonyManager) systemService;
        }
        if (Build.VERSION.SDK_INT < 29) {
            contentCaptureSessionCompatApi29Impl.RemoteActionCompatParcelizer(((TelephonyManager) this.write).getAllCellInfo());
            return;
        }
        int i4 = read + 29;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        if (!getTitleResource.read(context, "android.permission.ACCESS_FINE_LOCATION")) {
            WrappedCompositionsetContent1211.read("CellScanManager", "do not ACCESS_FINE_LOCATION");
            return;
        }
        try {
            ((TelephonyManager) this.write).requestCellInfoUpdate((ThreadPoolExecutor) onCreateActionMode.write.RemoteActionCompatParcelizer, new getExtras(contentCaptureSessionCompatApi29Impl));
        } catch (Exception unused) {
            WrappedCompositionsetContent1211.read("CellScanManager", "requestCellInfoUpdate exception");
            contentCaptureSessionCompatApi29Impl.RemoteActionCompatParcelizer(((TelephonyManager) this.write).getAllCellInfo());
        }
    }

    public requestiuPiT84 serializer() {
        getChanges getchanges;
        String strValueOf;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 97;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Application application = (Application) this.IconCompatParcelizer;
        try {
            Object systemService = application.getSystemService("phone");
            if (systemService == null) {
                int i4 = read + 33;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                systemService = null;
            }
            TelephonyManager telephonyManager = (TelephonyManager) systemService;
            Object systemService2 = application.getSystemService("connectivity");
            if (systemService2 == null) {
                int i6 = read + 71;
                RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                systemService2 = null;
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService2;
            if (telephonyManager == null || connectivityManager == null) {
                getchanges = getChanges.NO_SERVICES_FOUND;
            } else {
                connectivityManager.getClass();
                Network activeNetwork = connectivityManager.getActiveNetwork();
                if (activeNetwork == null) {
                    getchanges = getChanges.INACTIVE;
                } else {
                    NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                    if (networkCapabilities == null) {
                        int i8 = read + 117;
                        RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i8 % 2 == 0) {
                            getChanges getchanges2 = getChanges.INACTIVE;
                            throw null;
                        }
                        getchanges = getChanges.INACTIVE;
                    } else if (networkCapabilities.hasTransport(1)) {
                        getchanges = getChanges.WIFI;
                    } else {
                        getchanges = networkCapabilities.hasTransport(0) ? getChanges.CELLULAR : getChanges.OTHERS;
                    }
                }
            }
            if (InputModeManagerImpl.RemoteActionCompatParcelizer[getchanges.ordinal()] == 1) {
                telephonyManager.getClass();
                ((Transition$1) this.write).getClass();
                strValueOf = Build.VERSION.SDK_INT >= 29 ? String.valueOf(telephonyManager.getSimSpecificCarrierIdName()) : String.valueOf(telephonyManager.getSimCarrierIdName());
            } else {
                int i9 = RemoteActionCompatParcelizer + 55;
                read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                strValueOf = "";
            }
            return new requestiuPiT84(getchanges.getTypeName(), strValueOf);
        } catch (Exception e) {
            Timber.RemoteActionCompatParcelizer.write(e);
            return new requestiuPiT84(getChanges.NO_SERVICES_FOUND.getTypeName(), "");
        }
    }
}
