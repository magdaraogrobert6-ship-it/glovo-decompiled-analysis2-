package com.huawei.hms.locationSdk;

import android.annotation.SuppressLint;
import android.location.GnssStatus;
import android.location.LocationManager;
import android.os.Handler;
import android.os.Looper;
import bo.app.wg$$ExternalSyntheticLambda0;
import com.huawei.hms.support.api.location.common.HMSLocationLog;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;
import o.placeAtf8xVGno;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint
public class r {
    private LinkedBlockingQueue<q> a;
    private final AtomicBoolean b = new AtomicBoolean(false);
    private int c;
    private Handler d;
    private GnssStatus.Callback e;
    private int f;
    private boolean g;

    public class a extends GnssStatus.Callback {
        public a() {
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            r.this.a(gnssStatus);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(GnssStatus gnssStatus) {
        synchronized (this) {
            int satelliteCount = gnssStatus.getSatelliteCount();
            long jCurrentTimeMillis = System.currentTimeMillis();
            PriorityQueue priorityQueue = new PriorityQueue(new wg$$ExternalSyntheticLambda0(16));
            for (int i = 0; i < satelliteCount; i++) {
                priorityQueue.add(new s().a(gnssStatus.getSvid(i)).b(gnssStatus.getCn0DbHz(i)).a(gnssStatus.usedInFix(i)).c(gnssStatus.getElevationDegrees(i)).a(gnssStatus.getAzimuthDegrees(i)));
            }
            q qVar = new q(satelliteCount, jCurrentTimeMillis, (List) priorityQueue.stream().sorted(new wg$$ExternalSyntheticLambda0(17)).limit(this.f).collect(Collectors.toList()));
            if (this.a.size() == this.c) {
                this.a.poll();
            }
            this.a.offer(qVar);
            if (this.g) {
                HMSLocationLog.i("GnssStatusCollector", "", "gnssStatusChanged:" + qVar);
            } else {
                HMSLocationLog.i("GnssStatusCollector", "", "gnssStatusChanged");
            }
        }
    }

    public r(p pVar) {
        this.f = pVar.g();
    }

    private LocationManager b() {
        Object systemService = placeAtf8xVGno.read().getSystemService("location");
        if (systemService instanceof LocationManager) {
            return (LocationManager) systemService;
        }
        return null;
    }

    public void c() {
        HMSLocationLog.d("GnssStatusCollector", "", "stop");
        this.b.set(false);
        this.a.clear();
        LocationManager locationManagerB = b();
        if (locationManagerB == null) {
            return;
        }
        locationManagerB.unregisterGnssStatusCallback(this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(s sVar, s sVar2) {
        return Float.compare(sVar2.a(), sVar.a());
    }

    public String a() {
        if (!this.b.get() || this.a.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<q> it = this.a.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        this.a.clear();
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(s sVar, s sVar2) {
        return Double.compare(sVar2.a(), sVar.a());
    }

    public boolean a(int i, Looper looper, boolean z) {
        if (this.b.get()) {
            return true;
        }
        this.g = z;
        this.b.set(true);
        if (this.a == null) {
            this.a = new LinkedBlockingQueue<>(i);
        }
        this.c = i;
        HMSLocationLog.i("GnssStatusCollector", "", "start gnss");
        return a(looper);
    }

    private boolean a(Looper looper) {
        LocationManager locationManagerB = b();
        if (locationManagerB == null) {
            return false;
        }
        if (this.d == null) {
            this.d = new Handler(looper);
        }
        if (this.e == null) {
            this.e = new a();
        }
        return locationManagerB.registerGnssStatusCallback(this.e, this.d);
    }
}
