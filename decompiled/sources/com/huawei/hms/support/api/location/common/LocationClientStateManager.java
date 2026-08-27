package com.huawei.hms.support.api.location.common;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationAvailability;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationServices;
import com.huawei.hms.locationSdk.k1;
import com.huawei.hms.locationSdk.w0;
import com.huawei.hms.support.log.HMSLog;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import o.getContainer;
import o.getOutlineProvider;
import o.placeAtf8xVGno;
import o.setShouldUseDispatchDrawui;

/* JADX INFO: loaded from: classes2.dex */
public class LocationClientStateManager {
    private static final int CP_PERMISSION_DENIED = 10803;
    private static final int DELAY_MSG_CHECK_TIME = 12000;
    private static final int DELAY_TIME = 300;
    private static final int INTERNAL_ERROR = 10000;
    public static final String IS_RE_REQUEST = "isReRequest";
    private static final String LOCATIONAVAILABILITY_EXTRA_KEY = "com.huawei.hms.location.EXTRA_LOCATION_AVAILABILITY";
    private static final long MAX_INTERVAL_TIME = 300000;
    private static final int MAX_RECONNECT_COUNT = 3;
    private static final int MSG_RESTART = 1001;
    private static final int MSG_RESTART_DELAY_CHECK = 1002;
    private static final int PERMISSION_DENIED = 10102;
    private static final long REPEAT_REQUEST_INTERVAL_TIME = 500;
    public static final int RE_START_STATE_DOING = 1;
    public static final int RE_START_STATE_FAILED = 2;
    public static final int RE_START_STATE_INITIAL = 0;
    private static final String TAG = "LocationClientStateManager";
    private Handler handler;
    private volatile AtomicLong lastDisConnectTime;
    private volatile AtomicInteger reConnectCount;
    private volatile AtomicInteger resendState;

    public class a implements getContainer {
        final /* synthetic */ LocationCallback a;
        final /* synthetic */ PendingIntent b;

        public a(LocationCallback locationCallback, PendingIntent pendingIntent) {
            this.a = locationCallback;
            this.b = pendingIntent;
        }

        @Override // o.getContainer
        public void onFailure(Exception exc) {
            HMSLog.e(LocationClientStateManager.TAG, "task request onFailure");
            LocationClientStateManager.this.handler.removeMessages(1002);
            LocationClientStateManager.this.handlerOnFailureMsg(exc, this.a, this.b);
            LocationClientStateManager.getInstance().setResendState(2);
        }
    }

    public class b implements getOutlineProvider {
        public b() {
        }

        @Override // o.getOutlineProvider, com.google.android.gms.tasks.OnSuccessListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r2) {
            HMSLog.i(LocationClientStateManager.TAG, "task request onSuccess");
            LocationClientStateManager.this.handler.removeMessages(1002);
            LocationClientStateManager.getInstance().setResendState(0);
        }
    }

    public class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i != 1001) {
                if (i != 1002) {
                    return false;
                }
                LocationClientStateManager.this.checkReSendState();
                return false;
            }
            LocationClientStateManager.this.handler.removeMessages(1002);
            LocationClientStateManager.this.handler.sendEmptyMessageDelayed(1002, 12000L);
            LocationClientStateManager.this.reSendRequest();
            return false;
        }
    }

    public static class d {
        private static final LocationClientStateManager a = new LocationClientStateManager(null);
    }

    public static LocationClientStateManager getInstance() {
        return d.a;
    }

    public int getResendState() {
        int i;
        synchronized (this) {
            i = this.resendState.get();
        }
        return i;
    }

    public void resetCache() {
        synchronized (this) {
            if (this.reConnectCount.get() == 0 && this.lastDisConnectTime.get() == 0) {
                HMSLog.i(TAG, "not need resetCache");
                return;
            }
            HMSLog.i(TAG, "resetCache");
            this.lastDisConnectTime.set(0L);
            this.reConnectCount.set(0);
        }
    }

    private void addListener(setShouldUseDispatchDrawui setshouldusedispatchdrawui, LocationCallback locationCallback, PendingIntent pendingIntent) {
        setshouldusedispatchdrawui.read(new b());
        setshouldusedispatchdrawui.write(new a(locationCallback, pendingIntent));
    }

    private boolean canResendRequest() {
        return this.resendState.get() == 2 || this.resendState.get() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResendState(int i) {
        this.resendState.set(i);
    }

    public void checkCanResend() {
        synchronized (this) {
            boolean zCheckCanResendRequest = getInstance().checkCanResendRequest();
            if (zCheckCanResendRequest) {
                reStartHmsLocation();
            }
            HMSLog.i(TAG, "checkCanResend:" + zCheckCanResendRequest + ",reStartHmsLocation restartState：" + getInstance().getResendState());
        }
    }

    public void reStartHmsLocation() {
        synchronized (this) {
            HMSLog.i(TAG, "reStartHmsLocation restartState：" + getInstance().getResendState());
            getInstance().setResendState(1);
            initHandler();
            this.handler.sendEmptyMessageDelayed(1001, 300L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkReSendState() {
        if (getInstance().getResendState() == 1) {
            getInstance().setResendState(2);
            HMSLog.e(TAG, "reSend request time out ,reset state to RE_START_STATE_FAILED");
        }
    }

    private boolean checkReconnectStrategy() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.lastDisConnectTime.get() < REPEAT_REQUEST_INTERVAL_TIME) {
            HMSLog.e(TAG, "can not reconnect , not satisfied interval");
            return false;
        }
        int i = this.reConnectCount.get();
        AtomicLong atomicLong = this.lastDisConnectTime;
        if (i == 0) {
            atomicLong.set(jElapsedRealtime);
            this.reConnectCount.incrementAndGet();
            HMSLog.i(TAG, "first reconnect");
            return true;
        }
        long j = atomicLong.get();
        AtomicInteger atomicInteger = this.reConnectCount;
        if (jElapsedRealtime - j > MAX_INTERVAL_TIME) {
            atomicInteger.set(1);
            this.lastDisConnectTime.set(jElapsedRealtime);
            HMSLog.i(TAG, "over MAX_INTERVAL_TIME , restart first reconnect");
            return true;
        }
        if (atomicInteger.get() >= 3) {
            this.lastDisConnectTime.set(jElapsedRealtime);
            HMSLog.i(TAG, "can not reconnect , cause count > MAX_RECONNECT_COUNT");
            return false;
        }
        HMSLog.i(TAG, "can reconnect");
        this.lastDisConnectTime.set(jElapsedRealtime);
        this.reConnectCount.incrementAndGet();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reSendRequest() {
        try {
            List<k1> listA = w0.b().a();
            if (CollectionsUtil.isEmpty(listA)) {
                HMSLog.i(TAG, "onConnected, requests cache list is empty remove delay check msg");
                this.handler.removeMessages(1002);
                getInstance().setResendState(0);
                return;
            }
            HMSLog.i(TAG, "request cache list size:" + listA.size());
            FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(placeAtf8xVGno.read());
            for (k1 k1Var : listA) {
                HMSLocationLog.i(TAG, k1Var.a(), "onConnected, request in cache list prepare to send");
                realRequest(fusedLocationProviderClient, k1Var);
            }
        } catch (Exception unused) {
            getInstance().setResendState(2);
            HMSLog.e(TAG, "onConnected exception");
        }
    }

    private void realRequest(FusedLocationProviderClient fusedLocationProviderClient, k1 k1Var) {
        LocationCallback locationCallbackC = k1Var.c();
        LocationRequest locationRequestD = k1Var.d();
        PendingIntent pendingIntentB = k1Var.b();
        if (locationRequestD == null) {
            getInstance().setResendState(0);
            HMSLocationLog.w(TAG, k1Var.a(), "onConnected, requests cache list param is error,need remove");
            w0.b().c(k1Var);
            this.handler.removeMessages(1002);
            getInstance().setResendState(0);
            return;
        }
        if (locationRequestD.getExpirationTime() - SystemClock.elapsedRealtime() < 100) {
            HMSLocationLog.w(TAG, k1Var.a(), "onConnected, requests cache list is expire,need remove");
            w0.b().c(k1Var);
            this.handler.removeMessages(1002);
            getInstance().setResendState(0);
            return;
        }
        locationRequestD.putExtras(IS_RE_REQUEST, "1");
        if (locationCallbackC != null) {
            if (TextUtils.equals(k1Var.f(), "ExCallback")) {
                HMSLocationLog.i(TAG, k1Var.a(), "send ex location request");
                addListener(fusedLocationProviderClient.requestLocationUpdatesEx(locationRequestD, locationCallbackC, k1Var.e()), locationCallbackC, null);
                return;
            } else {
                HMSLocationLog.i(TAG, k1Var.a(), "send location request");
                addListener(fusedLocationProviderClient.requestLocationUpdates(locationRequestD, locationCallbackC, k1Var.e()), locationCallbackC, null);
                return;
            }
        }
        if (pendingIntentB != null) {
            addListener(fusedLocationProviderClient.requestLocationUpdates(locationRequestD, pendingIntentB), null, pendingIntentB);
            return;
        }
        getInstance().setResendState(0);
        HMSLocationLog.w(TAG, k1Var.a(), "onConnected, requests cache list param is error");
        w0.b().c(k1Var);
        this.handler.removeMessages(1002);
        getInstance().setResendState(0);
    }

    private boolean checkCanResendRequest() {
        return checkReconnectStrategy() && canResendRequest();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerOnFailureMsg(Exception exc, LocationCallback locationCallback, PendingIntent pendingIntent) {
        String str;
        try {
            if (exc instanceof ApiException) {
                ApiException apiException = (ApiException) exc;
                int statusCode = apiException.getStatusCode();
                if (statusCode != 10000 && statusCode != 10102 && statusCode != 10803) {
                    if (statusCode != 907135004) {
                        return;
                    }
                    HMSLog.e(TAG, "task request onFailure from HMS and checkRestart");
                    checkCanResend();
                    return;
                }
                if (locationCallback != null) {
                    LocationAvailability locationAvailability = new LocationAvailability();
                    locationAvailability.setLocationStatus(1001);
                    locationCallback.onLocationAvailability(locationAvailability);
                    HMSLog.e(TAG, "task request onFailure from Location and callback to cp ,errorCode " + apiException.getStatusCode());
                }
                if (pendingIntent == null) {
                    return;
                }
                Intent intent = new Intent();
                LocationAvailability locationAvailability2 = new LocationAvailability();
                locationAvailability2.setLocationStatus(1001);
                intent.putExtra(LOCATIONAVAILABILITY_EXTRA_KEY, locationAvailability2);
                pendingIntent.send(placeAtf8xVGno.read(), 0, intent);
                str = "task request onFailure from Location and pendingIntent to cp ,errorCode " + apiException.getStatusCode();
            } else {
                str = "handlerOnFailureMsg failed by instanceof failed";
            }
            HMSLog.e(TAG, str);
        } catch (Exception unused) {
            HMSLog.e(TAG, "handlerOnFailureMsg failed by exception");
        }
    }

    private LocationClientStateManager() {
        this.lastDisConnectTime = new AtomicLong(0L);
        this.reConnectCount = new AtomicInteger(0);
        this.resendState = new AtomicInteger(0);
    }

    private void initHandler() {
        if (this.handler == null) {
            HandlerThread handlerThread = new HandlerThread(TAG);
            handlerThread.start();
            this.handler = new Handler(handlerThread.getLooper(), new c());
        }
    }

    public /* synthetic */ LocationClientStateManager(a aVar) {
        this();
    }
}
