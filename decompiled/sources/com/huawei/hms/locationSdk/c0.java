package com.huawei.hms.locationSdk;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.HWLocation;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.support.api.location.common.HMSLocationLog;
import com.huawei.hms.support.api.location.common.LocationRequestHelper;
import com.huawei.hms.support.api.location.common.PermissionUtil;
import com.huawei.location.lite.common.report.ReportBuilder;
import com.incognia.internal.ZM$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o.CollectionInfo_androidKttoAccessibilityCollectionItemInfo1;
import o.LayoutNodeSubcompositionsStateScope;
import o.WindowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer2onStateChanged1;
import o.WrappedCompositionsetContent1211;
import o.onActionItemClicked;
import o.onPrepareActionMode;
import o.placeAtf8xVGno;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class c0 implements Handler.Callback {
    private r a;
    private u0 b;
    private HandlerThread c;
    private final AtomicBoolean d;
    private long e;
    private int f;
    private p g;
    private Handler h;
    private AtomicInteger i;
    private String j;
    private String k;

    public static class b {
        private static final c0 a = new c0();
    }

    private void i() {
        synchronized (this) {
            if (this.d.get()) {
                if (this.g.c() != 0 && this.g.c() != 2) {
                    if (this.f == this.g.e()) {
                        HMSLocationLog.i("LocationCallbackStatusAnalyzer", "", "report reach max count");
                        return;
                    }
                    if (System.currentTimeMillis() - (((long) this.g.a()) * 1000) < this.e) {
                        HMSLocationLog.i("LocationCallbackStatusAnalyzer", "", "report not reach time");
                        return;
                    }
                    this.f++;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("GnssFrameStatus", this.a.a());
                        jSONObject.put("LocationInfo", this.b.a());
                        if (!TextUtils.isEmpty(this.k)) {
                            jSONObject.put(LocationRequestHelper.CP_TRANS_ID, this.k);
                        }
                    } catch (JSONException unused) {
                        HMSLocationLog.e("LocationCallbackStatusAnalyzer", "", "buildBody exception");
                    }
                    this.e = System.currentTimeMillis();
                    ReportBuilder reportBuilder = new ReportBuilder();
                    reportBuilder.setApiName("Location_GnssException_SDK");
                    reportBuilder.setWLANScan();
                    reportBuilder.setLocationEnable(onPrepareActionMode.RemoteActionCompatParcelizer(placeAtf8xVGno.read()));
                    reportBuilder.setTransactionID(this.j);
                    reportBuilder.setExt(jSONObject.toString());
                    CollectionInfo_androidKttoAccessibilityCollectionItemInfo1.write().RemoteActionCompatParcelizer(1, reportBuilder.getEventId(), reportBuilder.build());
                    a(jSONObject);
                    g();
                }
            }
        }
    }

    public void b(HWLocation hWLocation) {
        Handler handler;
        synchronized (this) {
            if (this.d.get() && (handler = this.h) != null) {
                handler.post(new ZM$$ExternalSyntheticLambda0(this, 1, hWLocation));
            }
        }
    }

    public void j() {
        synchronized (this) {
            if (!this.d.get()) {
                HMSLocationLog.w("LocationCallbackStatusAnalyzer", "", "is stopped,do nothing");
                return;
            }
            if (this.i.decrementAndGet() > 0) {
                HMSLocationLog.w("LocationCallbackStatusAnalyzer", "", "also have gnss request,not stop");
                return;
            }
            this.d.set(false);
            HMSLocationLog.w("LocationCallbackStatusAnalyzer", "", "stop analyzer");
            r rVar = this.a;
            if (rVar != null) {
                rVar.c();
                this.a = null;
            }
            u0 u0Var = this.b;
            if (u0Var != null) {
                u0Var.b();
                this.b = null;
            }
            this.f = 0;
            Handler handler = this.h;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        }
    }

    private void d() {
        String str;
        if (f()) {
            LayoutNodeSubcompositionsStateScope layoutNodeSubcompositionsStateScope = WindowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer2onStateChanged1.serializer;
            synchronized (layoutNodeSubcompositionsStateScope) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("ConfigManager", Thread.currentThread().getName() + ",request itemName:gnssException");
                layoutNodeSubcompositionsStateScope.MediaDescriptionCompat();
                HashMap map = (HashMap) layoutNodeSubcompositionsStateScope.serializer;
                if (map == null) {
                    str = null;
                } else {
                    str = (String) map.get("gnssException");
                }
            }
            try {
                this.g = (p) new Gson().fromJson(str, p.class);
            } catch (JsonSyntaxException unused) {
                HMSLocationLog.e("LocationCallbackStatusAnalyzer", "", "config to json failed");
            }
            if (this.g == null) {
                p pVar = new p();
                this.g = pVar;
                pVar.h();
            }
            HMSLocationLog.i("LocationCallbackStatusAnalyzer", "", this.g.toString());
        }
    }

    private boolean f() {
        int iWrite = onActionItemClicked.write(placeAtf8xVGno.read());
        return iWrite == 8 || iWrite == 0 || iWrite == 1;
    }

    public void a(String str, String str2) {
        synchronized (this) {
            if (f() && e()) {
                this.j = str;
                this.k = str2;
                this.i.incrementAndGet();
                if (this.d.get()) {
                    HMSLocationLog.w("LocationCallbackStatusAnalyzer", "", "analyzer is started");
                    return;
                }
                if (this.h == null) {
                    this.h = new Handler(a(), this);
                }
                c();
                boolean z = this.g.c() == 1 || this.g.c() == 2;
                HMSLocationLog.i("LocationCallbackStatusAnalyzer", "", "start gnss:" + this.a.a(this.g.f(), a(), z) + ",statLocation:" + this.b.a(this.g.f(), a(), z));
                this.d.set(true);
                Handler handler = this.h;
                if (handler != null) {
                    handler.removeMessages(1);
                    Handler handler2 = this.h;
                    handler2.sendMessageDelayed(handler2.obtainMessage(1), DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM);
                }
                return;
            }
            HMSLocationLog.w("LocationCallbackStatusAnalyzer", "", "not support analyzer:" + Build.VERSION.SDK_INT);
        }
    }

    private void h() {
        Handler handler = this.h;
        if (handler != null) {
            handler.removeMessages(1);
            Handler handler2 = this.h;
            handler2.sendMessageDelayed(handler2.obtainMessage(1), ((long) this.g.d()) * 1000);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        i();
        h();
        return false;
    }

    private c0() {
        this.d = new AtomicBoolean(false);
        this.i = new AtomicInteger(0);
        d();
    }

    private void c() {
        if (this.a == null) {
            this.a = new r(this.g);
        }
        if (this.b == null) {
            this.b = new u0();
        }
    }

    private boolean e() {
        if (PermissionUtil.isPermissionAvailable(placeAtf8xVGno.read(), "android.permission.ACCESS_FINE_LOCATION") && this.g.c() != 0) {
            return this.g.b() == null || this.g.b().contains(placeAtf8xVGno.read().getApplicationContext().getPackageName());
        }
        return false;
    }

    private void g() {
        HMSLocationLog.i("LocationCallbackStatusAnalyzer", "", "post network request");
        FusedLocationProviderClient fusedLocationProviderClient = new FusedLocationProviderClient(placeAtf8xVGno.read());
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.setPriority(102);
        locationRequest.setNumUpdates(1);
        locationRequest.setExpirationDuration(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM);
        locationRequest.putExtras(LocationRequestHelper.CP_TRANS_ID, this.k);
        fusedLocationProviderClient.requestLocationUpdates(locationRequest, new LocationCallback(), a());
    }

    public static c0 b() {
        return b.a;
    }

    private List<String> a(String str, int i) {
        String strSubstring;
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i2 = 0;
        int i3 = i;
        while (true) {
            if (i3 >= length) {
                try {
                    strSubstring = str.substring(i2, length);
                } catch (Exception unused) {
                    return arrayList;
                }
            } else {
                strSubstring = str.substring(i2, i3);
            }
            arrayList.add(strSubstring);
            i2 = i3;
            i3 += i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(HWLocation hWLocation) {
        h();
        u0 u0Var = this.b;
        if (u0Var != null) {
            u0Var.b(hWLocation);
        }
    }

    private void a(JSONObject jSONObject) {
        String strConcat;
        String strReplace = jSONObject.toString().replace("\\", "");
        if (strReplace.length() > 4000) {
            List<String> listA = a(strReplace, 4000);
            HMSLocationLog.i("LocationCallbackStatusAnalyzer", "", "reportBody log start");
            Iterator<String> it = listA.iterator();
            while (it.hasNext()) {
                HMSLocationLog.i("LocationCallbackStatusAnalyzer", "", it.next());
            }
            strConcat = "reportBody log end";
        } else {
            strConcat = "reportBody:".concat(strReplace);
        }
        HMSLocationLog.i("LocationCallbackStatusAnalyzer", "", strConcat);
    }

    private Looper a() {
        Looper looper;
        synchronized (this) {
            if (this.c == null) {
                HandlerThread handlerThread = new HandlerThread("Loc_AnalyzerHandler");
                this.c = handlerThread;
                handlerThread.start();
            }
            looper = this.c.getLooper();
        }
        return looper;
    }
}
