package o;

import android.location.Location;
import android.location.LocationManager;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.support.api.entity.location.updates.RequestLocationUpdatesRequest;
import com.huawei.location.ut;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class createLifecycleAwareWindowRecomposerdefault {
    public static volatile createLifecycleAwareWindowRecomposerdefault RemoteActionCompatParcelizer;
    public static final byte[] serializer = new byte[0];
    public ArrayList IconCompatParcelizer;
    public LocationManager RatingCompat;
    public ut read;
    public HandlerThread write;

    public final void read(RequestLocationUpdatesRequest requestLocationUpdatesRequest, com.huawei.location.callback.d2 d2Var) {
        String str;
        String str2;
        Map<String, String> extras;
        synchronized (this) {
            if (!getTitleResource.read(placeAtf8xVGno.read(), "android.permission.ACCESS_FINE_LOCATION")) {
                WrappedCompositionsetContent1211.read("GnssClient", "checkSelfPermission fail");
                return;
            }
            LocationRequest locationRequest = requestLocationUpdatesRequest.getLocationRequest();
            if (!TextUtils.isEmpty(requestLocationUpdatesRequest.getTid()) && locationRequest != null) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("GnssClient", "requestLocationUpdates, priority is " + locationRequest.getPriority() + ", interval is " + locationRequest.getInterval() + ", smallestDisplacement is " + locationRequest.getSmallestDisplacement());
                int priority = locationRequest.getPriority();
                if (priority == 100 || priority == 200 || priority == 400) {
                    str = "gps";
                } else {
                    str = priority == 105 ? "passive" : "";
                }
                String str3 = str;
                if (TextUtils.isEmpty(str3)) {
                    WrappedCompositionsetContent1211.read("GnssClient", "priority is invalid");
                    return;
                }
                if (str3.equals("gps") && (extras = locationRequest.getExtras()) != null && "1".equals(extras.get("SuperGnssEnable"))) {
                    if (this.IconCompatParcelizer == null) {
                        this.IconCompatParcelizer = new ArrayList();
                    }
                    if (this.read == null) {
                        this.read = new ut(12);
                    }
                    if (this.read.RemoteActionCompatParcelizer(locationRequest.getInterval(), locationRequest.getSmallestDisplacement(), d2Var)) {
                        this.IconCompatParcelizer.remove(d2Var);
                        this.IconCompatParcelizer.add(d2Var);
                        return;
                    }
                }
                if (this.write == null) {
                    HandlerThread handlerThread = new HandlerThread("Loc-GNSS");
                    this.write = handlerThread;
                    handlerThread.start();
                }
                try {
                    this.RatingCompat.requestLocationUpdates(str3, locationRequest.getInterval(), locationRequest.getSmallestDisplacement(), d2Var, this.write.getLooper());
                } catch (IllegalArgumentException unused) {
                    str2 = "LocationManager requestLocationUpdates throw IllegalArgumentException";
                    WrappedCompositionsetContent1211.read("GnssClient", str2);
                } catch (SecurityException unused2) {
                    str2 = "LocationManager requestLocationUpdates throw SecurityException";
                    WrappedCompositionsetContent1211.read("GnssClient", str2);
                } catch (Exception unused3) {
                    str2 = "LocationManager requestLocationUpdates throw other exception";
                    WrappedCompositionsetContent1211.read("GnssClient", str2);
                }
                return;
            }
            WrappedCompositionsetContent1211.read("GnssClient", "requestLocationUpdatesRequest is invalid");
        }
    }

    public final Location serializer(String str) {
        Location lastKnownLocation;
        synchronized (this) {
            try {
                lastKnownLocation = this.RatingCompat.getLastKnownLocation(str);
            } catch (SecurityException unused) {
                WrappedCompositionsetContent1211.read("GnssClient", "getLastKnownLocation, security exception");
                lastKnownLocation = null;
            }
        }
        return lastKnownLocation;
    }

    public final void IconCompatParcelizer(com.huawei.location.callback.d2 d2Var) {
        synchronized (this) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("GnssClient", "removeLocationUpdates");
            if (!getTitleResource.read(placeAtf8xVGno.read(), "android.permission.ACCESS_FINE_LOCATION")) {
                WrappedCompositionsetContent1211.read("GnssClient", "checkSelfPermission fail");
                return;
            }
            ArrayList arrayList = this.IconCompatParcelizer;
            if (arrayList == null || !arrayList.remove(d2Var)) {
                this.RatingCompat.removeUpdates(d2Var);
            } else {
                this.read.serializer(d2Var);
            }
        }
    }

    public static createLifecycleAwareWindowRecomposerdefault read() {
        if (RemoteActionCompatParcelizer == null) {
            synchronized (serializer) {
                if (RemoteActionCompatParcelizer == null) {
                    createLifecycleAwareWindowRecomposerdefault createlifecycleawarewindowrecomposerdefault = new createLifecycleAwareWindowRecomposerdefault();
                    createlifecycleawarewindowrecomposerdefault.IconCompatParcelizer = null;
                    HandlerThread handlerThread = new HandlerThread("Loc-GNSS");
                    createlifecycleawarewindowrecomposerdefault.write = handlerThread;
                    handlerThread.start();
                    Object systemService = placeAtf8xVGno.read().getSystemService("location");
                    if (systemService instanceof LocationManager) {
                        createlifecycleawarewindowrecomposerdefault.RatingCompat = (LocationManager) systemService;
                    }
                    RemoteActionCompatParcelizer = createlifecycleawarewindowrecomposerdefault;
                }
            }
        }
        return RemoteActionCompatParcelizer;
    }
}
