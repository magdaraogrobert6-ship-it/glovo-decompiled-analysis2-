package com.huawei.hms.locationSdk;

import android.annotation.SuppressLint;
import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.location.HWLocation;
import com.huawei.hms.location.LocationResult;
import com.huawei.hms.support.api.location.common.HMSLocationLog;
import com.huawei.location.mdc.AdsLocationControl;
import com.huawei.location.mdc.AdsLocationHelper;
import com.huawei.location.mdc.AdsLocationManager;
import com.huawei.location.mdc.IMdcLocationListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import o.SweepGradientShader9KIMszodefault;
import o.WrappedCompositionsetContent1211;
import o.onCreateActionMode;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint
public class h1 extends i1 implements IMdcLocationListener {
    private long h;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HMSLocationLog.i(h1.this.a(), ((com.huawei.hms.locationSdk.b) h1.this).a, "new thread to start mdc location");
            if (h1.this.b()) {
                AdsLocationManager.getInstance().requestLocationUpdates(h1.this);
            }
        }
    }

    public class b implements Runnable {
        final /* synthetic */ Location a;

        public b(Location location) {
            this.a = location;
        }

        @Override // java.lang.Runnable
        public void run() {
            LocationResult locationResultB = h1.this.b(this.a);
            h1 h1Var = h1.this;
            if (locationResultB == null) {
                HMSLocationLog.e(h1Var.a(), ((com.huawei.hms.locationSdk.b) h1.this).a, "locationResult is null, return here.");
                return;
            }
            h1Var.h = SystemClock.elapsedRealtimeNanos();
            h1.this.c(locationResultB);
            ((l1) h1.this).d.c().onLocationResult(locationResultB);
        }
    }

    @Override // com.huawei.location.mdc.IMdcLocationListener
    public void onMdcStatusChanged(boolean z) {
    }

    public LocationResult b(Location location) {
        if (location == null) {
            HMSLocationLog.e(a(), ((com.huawei.hms.locationSdk.b) this).a, "location is null");
            return null;
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        int i = -1;
        try {
            i = extras.getInt(AdsLocationHelper.MDC_COORDINATE_TYPE, -1);
        } catch (Throwable th) {
            SweepGradientShader9KIMszodefault.write("SafeBundle", new StringBuilder("getInt exception: "), th);
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(a(), "locationCoordinateType: " + i);
        return a(location, i);
    }

    public h1(String str, String str2, String str3, k1 k1Var, Looper looper, String str4, String str5) throws ApiException {
        super(str, str2, str3, k1Var, looper, str4);
        c();
    }

    private void c() {
        onCreateActionMode.write.IconCompatParcelizer(new a());
    }

    @Override // com.huawei.location.mdc.IMdcLocationListener
    public String getUuid() {
        k1 k1Var = ((l1) this).d;
        return (k1Var == null || k1Var.c() == null || ((l1) this).d.c().getUuid() == null) ? "" : ((l1) this).d.c().getUuid();
    }

    @Override // com.huawei.location.mdc.IMdcLocationListener
    public void onMdcLocationChanged(Location location) {
        HMSLocationLog.d(a(), ((com.huawei.hms.locationSdk.b) this).a, "onMdcLocationChanged");
        if (location == null) {
            HMSLocationLog.e(a(), ((com.huawei.hms.locationSdk.b) this).a, "mdcLocation is null, return here.");
        } else {
            this.g.post(new b(new Location(location)));
        }
    }

    public static HWLocation a(Location location) {
        if (location == null) {
            return null;
        }
        HWLocation hWLocation = new HWLocation();
        hWLocation.setTime(location.getTime());
        hWLocation.setElapsedRealtimeNanos(location.getElapsedRealtimeNanos());
        hWLocation.setLatitude(location.getLatitude());
        hWLocation.setLongitude(location.getLongitude());
        hWLocation.setAltitude(location.getAltitude());
        hWLocation.setProvider(location.getProvider());
        hWLocation.setSpeed(location.getSpeed());
        hWLocation.setBearing(location.getBearing());
        hWLocation.setAccuracy(location.getAccuracy());
        hWLocation.setVerticalAccuracyMeters(location.getVerticalAccuracyMeters());
        hWLocation.setSpeedAccuracyMetersPerSecond(location.getSpeedAccuracyMetersPerSecond());
        hWLocation.setBearingAccuracyDegrees(location.getBearingAccuracyDegrees());
        HashMap map = new HashMap();
        Bundle extras = location.getExtras();
        if (extras != null && extras.containsKey("LocationSource")) {
            map.put("LocationSource", extras.get("LocationSource"));
        }
        hWLocation.setExtraInfo(map);
        return hWLocation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        return AdsLocationControl.isMdcControlEnable();
    }

    private LocationResult a(Location location, int i) {
        if (location == null) {
            return null;
        }
        HWLocation hWLocationA = a(location);
        hWLocationA.setCoordinateType(i);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(hWLocationA);
        return LocationResult.create(arrayList);
    }

    @Override // com.huawei.hms.locationSdk.i1, com.huawei.hms.locationSdk.l1
    public String a() {
        return "RequestLocationExMdcUpdatesTaskApiCall";
    }

    @Override // com.huawei.hms.locationSdk.l1
    public void a(LocationResult locationResult) {
        if (locationResult == null || locationResult.getLastHWLocation() == null) {
            HMSLocationLog.e(a(), ((com.huawei.hms.locationSdk.b) this).a, "locationResult is null or locationResult.getLastHWLocation is null");
            return;
        }
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (a(jElapsedRealtimeNanos)) {
            ((l1) this).d.c().onLocationResult(locationResult);
            return;
        }
        HMSLocationLog.d(a(), ((com.huawei.hms.locationSdk.b) this).a, "do not report native location,lastReportTime: " + this.h + ", currentTimeNanos: " + jElapsedRealtimeNanos);
    }

    private boolean a(long j) {
        return j - this.h > TimeUnit.MILLISECONDS.toNanos(((l1) this).d.d().getFastestInterval() + 1000);
    }
}
