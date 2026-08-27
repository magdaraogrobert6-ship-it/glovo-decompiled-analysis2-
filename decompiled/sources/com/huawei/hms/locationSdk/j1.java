package com.huawei.hms.locationSdk;

import android.annotation.SuppressLint;
import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.location.HWLocation;
import com.huawei.hms.location.LocationResult;
import com.huawei.hms.support.api.location.common.HMSLocationLog;
import com.huawei.hms.ui.SafeBundle;
import com.huawei.location.vdr.VdrManager;
import com.huawei.location.vdr.control.VDRControl;
import com.huawei.location.vdr.listener.IVdrLocationListener;
import com.huawei.riemann.location.common.utils.Constant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import o.onCreateActionMode;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint
public class j1 extends i1 implements IVdrLocationListener {
    private AtomicBoolean h;
    private VdrManager i;
    private long j;
    private final String k;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HMSLocationLog.i(j1.this.a(), ((com.huawei.hms.locationSdk.b) j1.this).a, "new thread to judge vdr config");
            if (new VDRControl().isSupport(j1.this.k)) {
                j1.this.i = VdrManager.getInstance();
                j1.this.i.registerVdrLocationLis(j1.this);
            }
        }
    }

    public class b implements Runnable {
        final /* synthetic */ LocationResult a;

        public b(LocationResult locationResult) {
            this.a = locationResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((l1) j1.this).d.c().onLocationResult(this.a);
        }
    }

    @Override // com.huawei.hms.locationSdk.l1
    public void a(LocationResult locationResult) {
        if (locationResult == null || locationResult.getLastHWLocation() == null) {
            HMSLocationLog.e(a(), ((com.huawei.hms.locationSdk.b) this).a, "locationResult is null or locationResult.getLastHWLocation is null");
            return;
        }
        VdrManager vdrManager = this.i;
        if (vdrManager == null || !vdrManager.isVdrIntervalStart()) {
            ((l1) this).d.c().onLocationResult(locationResult);
            return;
        }
        HMSLocationLog.d(a(), ((com.huawei.hms.locationSdk.b) this).a, "vdr sync location");
        if (a(locationResult.getLastLocation())) {
            this.j = locationResult.getLastLocation().getElapsedRealtimeNanos();
            ((l1) this).d.c().onLocationResult(locationResult);
        }
        this.i.syncLocation(locationResult.getLastLocation());
    }

    @Override // com.huawei.location.vdr.listener.IVdrLocationListener
    public String getUuid() {
        return ((l1) this).d.h();
    }

    @Override // com.huawei.location.vdr.listener.IVdrLocationListener
    public void onVdrLocationChanged(Location location) {
        HMSLocationLog.i(a(), ((com.huawei.hms.locationSdk.b) this).a, "onVdrLocationChanged");
        if (location == null) {
            return;
        }
        if (location.getElapsedRealtimeNanos() - this.j < TimeUnit.MILLISECONDS.toNanos(((l1) this).d.d().getFastestInterval() + 100)) {
            return;
        }
        HWLocation hWLocationB = b(location);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(hWLocationB);
        this.g.post(new b(LocationResult.create(arrayList)));
    }

    public j1(String str, String str2, String str3, k1 k1Var, Looper looper, String str4, String str5) throws ApiException {
        super(str, str2, str3, k1Var, looper, str4);
        this.h = new AtomicBoolean(false);
        this.k = str5;
    }

    public static HWLocation b(Location location) {
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

    private boolean a(Location location) {
        if (location == null) {
            return false;
        }
        return a(new SafeBundle(location.getExtras()).getInt(Constant.LOCATION_SOURCE_TYPE, -1));
    }

    @Override // com.huawei.hms.locationSdk.i1, com.huawei.hms.locationSdk.l1
    public String a() {
        return "RequestLocationExVdrUpdatesTaskApiCall";
    }

    @Override // com.huawei.hms.locationSdk.l1
    public void b(boolean z) {
        super.b(z);
        if (z) {
            if (this.h.get()) {
                HMSLocationLog.i(a(), ((com.huawei.hms.locationSdk.b) this).a, "vdr has been judged, do not new thread here");
                return;
            } else {
                this.h.set(true);
                onCreateActionMode.write.IconCompatParcelizer(new a());
                return;
            }
        }
        VdrManager vdrManager = this.i;
        if (vdrManager != null) {
            vdrManager.unRegisterVdrLocationLis(((l1) this).d.h());
            this.i = null;
        }
    }
}
