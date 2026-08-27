package o;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import com.huawei.location.gwi.config.CarGwiSoFileConstant;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class getOnBackPressedDispatcherannotations {
    public final Object IconCompatParcelizer;
    public final /* synthetic */ startActivityForResult RemoteActionCompatParcelizer;
    public final /* synthetic */ startActivityForResult read;
    public final /* synthetic */ int serializer;
    public getButtonXEK5gGoQ write;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public getOnBackPressedDispatcherannotations(startActivityForResult startactivityforresult, Context context) {
        this(startactivityforresult);
        this.serializer = 1;
        this.read = startactivityforresult;
        this.IconCompatParcelizer = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    public final int serializer() {
        Location lastKnownLocation;
        long j;
        boolean z;
        int i = this.serializer;
        Object obj = this.IconCompatParcelizer;
        if (i != 0) {
            return setContentView.read((PowerManager) obj) ? 2 : 1;
        }
        androidx.navigation.NavArgsLazy navArgsLazy = (androidx.navigation.NavArgsLazy) obj;
        getBundleFromUrl getbundlefromurl = (getBundleFromUrl) navArgsLazy.RatingCompat;
        LocationManager locationManager = (LocationManager) navArgsLazy.read;
        if (getbundlefromurl.IconCompatParcelizer <= System.currentTimeMillis()) {
            Context context = (Context) navArgsLazy.MediaSessionCompatQueueItem;
            Location lastKnownLocation2 = null;
            if (BrazeSdkAuthenticationErrorEvent.serializer(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                try {
                    if (locationManager.isProviderEnabled("network")) {
                        lastKnownLocation = locationManager.getLastKnownLocation("network");
                    } else {
                        lastKnownLocation = null;
                    }
                } catch (Exception unused) {
                }
            } else {
                lastKnownLocation = null;
            }
            if (BrazeSdkAuthenticationErrorEvent.serializer(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                try {
                    if (locationManager.isProviderEnabled("gps")) {
                        lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                    }
                } catch (Exception unused2) {
                }
            }
            if (lastKnownLocation2 == null || lastKnownLocation == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > lastKnownLocation.getTime()) {
                lastKnownLocation = lastKnownLocation2;
            }
            if (lastKnownLocation != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (createNavigationEventHandleractivity.serializer == null) {
                    createNavigationEventHandleractivity.serializer = new createNavigationEventHandleractivity();
                }
                createNavigationEventHandleractivity createnavigationeventhandleractivity = createNavigationEventHandleractivity.serializer;
                createnavigationeventhandleractivity.write(jCurrentTimeMillis - CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL, lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude());
                createnavigationeventhandleractivity.write(jCurrentTimeMillis, lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude());
                boolean z2 = createnavigationeventhandleractivity.read == 1;
                long j2 = createnavigationeventhandleractivity.IconCompatParcelizer;
                long j3 = createnavigationeventhandleractivity.write;
                createnavigationeventhandleractivity.write(jCurrentTimeMillis + CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL, lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude());
                long j4 = createnavigationeventhandleractivity.IconCompatParcelizer;
                if (j2 == -1 || j3 == -1) {
                    j = jCurrentTimeMillis + 43200000;
                } else {
                    if (jCurrentTimeMillis <= j3) {
                        j4 = jCurrentTimeMillis > j2 ? j3 : j2;
                    }
                    j = j4 + 60000;
                }
                getbundlefromurl.serializer = z2;
                getbundlefromurl.IconCompatParcelizer = j;
                z = z2;
            } else {
                int i2 = Calendar.getInstance().get(11);
                if (i2 < 6 || i2 >= 22) {
                    return 2;
                }
            }
            return 1;
        }
        z = getbundlefromurl.serializer;
        if (z) {
            return 2;
        }
        return 1;
    }

    public final void RemoteActionCompatParcelizer() {
        IntentFilter intentFilter;
        write();
        if (this.serializer != 0) {
            intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        } else {
            intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
        }
        if (intentFilter.countActions() == 0) {
            return;
        }
        if (this.write == null) {
            this.write = new getButtonXEK5gGoQ(1, this);
        }
        this.RemoteActionCompatParcelizer.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.registerReceiver(this.write, intentFilter);
    }

    public final void write() {
        getButtonXEK5gGoQ getbuttonxek5ggoq = this.write;
        if (getbuttonxek5ggoq != null) {
            try {
                this.RemoteActionCompatParcelizer.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.unregisterReceiver(getbuttonxek5ggoq);
            } catch (IllegalArgumentException unused) {
            }
            this.write = null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public getOnBackPressedDispatcherannotations(startActivityForResult startactivityforresult, androidx.navigation.NavArgsLazy navArgsLazy) {
        this(startactivityforresult);
        this.serializer = 0;
        this.read = startactivityforresult;
        this.IconCompatParcelizer = navArgsLazy;
    }

    public getOnBackPressedDispatcherannotations(startActivityForResult startactivityforresult) {
        this.RemoteActionCompatParcelizer = startactivityforresult;
    }
}
