package com.huawei.location.base.activity;

import android.content.Context;
import com.huawei.hms.location.entity.activity.ActivityRecognitionResult;
import com.huawei.hms.location.entity.activity.ActivityTransitionRequest;
import com.huawei.location.base.activity.callback.ARCallback;
import com.huawei.location.base.activity.callback.ATCallback;
import com.huawei.location.base.activity.entity.ClientInfo;
import com.huawei.location.base.activity.permission.ARLocationPermissionManager;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import o.WrappedCompositionsetContent1211;
import o.placeAtf8xVGno;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractARServiceManager {
    private static final String TAG = "AbstractARServiceManager";
    public long lastTimeByTimer = -1;
    public Context mContext = placeAtf8xVGno.read();
    public ActivityRecognitionMappingManager recognitionMappingManager;
    public ScheduledExecutorService scheduledExecutorService;
    public ScheduledFuture scheduledFuture;
    public ActivityTransitionMappingManager transitionMappingManager;

    public abstract boolean connectService();

    public abstract boolean disConnectService();

    public abstract ActivityRecognitionResult getDetectedActivity(int i, int i2);

    public ActivityRecognitionMappingManager getRecognitionRequestMapping() {
        return this.recognitionMappingManager;
    }

    public Runnable getTask() {
        return null;
    }

    public ActivityTransitionMappingManager getTransitionMappingManager() {
        return this.transitionMappingManager;
    }

    public abstract boolean isConnected();

    public abstract void removeActivityTransitionUpdates(ATCallback aTCallback, ClientInfo clientInfo);

    public abstract void removeActivityUpdates(ARCallback aRCallback, ClientInfo clientInfo);

    public abstract void requestActivityTransitionUpdates(ActivityTransitionRequest activityTransitionRequest, ATCallback aTCallback, ClientInfo clientInfo);

    public abstract void requestActivityUpdates(long j, ARCallback aRCallback, ClientInfo clientInfo);

    public void restartScheduled(long j) {
        stopScheduled();
        startScheduled(j);
    }

    public boolean checkActivityRecognitionPermission(ClientInfo clientInfo) {
        if (clientInfo == null) {
            return false;
        }
        return ARLocationPermissionManager.checkCPActivityRecognitionPermission(TAG, clientInfo.getClientPid(), clientInfo.getClientUid());
    }

    public void startScheduled(long j) {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "startScheduled enter");
        if (this.scheduledExecutorService == null) {
            this.scheduledExecutorService = Executors.newScheduledThreadPool(1);
        }
        this.scheduledFuture = this.scheduledExecutorService.scheduleWithFixedDelay(getTask(), 0L, j, TimeUnit.MILLISECONDS);
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "startScheduled exit");
    }

    public AbstractARServiceManager(ActivityTransitionMappingManager activityTransitionMappingManager, ActivityRecognitionMappingManager activityRecognitionMappingManager) {
        this.transitionMappingManager = activityTransitionMappingManager;
        this.recognitionMappingManager = activityRecognitionMappingManager;
    }

    public void stopScheduled() {
        String str;
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "stopScheduled enter");
        try {
            ScheduledFuture scheduledFuture = this.scheduledFuture;
            if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                str = "stopScheduled exit:" + this.scheduledFuture.cancel(true);
            } else {
                str = "scheduled not init or cancelled";
            }
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, str);
        } catch (Exception unused) {
            WrappedCompositionsetContent1211.serializer(TAG, "stopScheduled exit exception");
        }
    }

    public void scheduleTimer() {
        synchronized (this) {
            try {
                long minTime = this.recognitionMappingManager.getMinTime();
                if (-1 == minTime) {
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "scheduleTimer return time is " + minTime);
                    this.lastTimeByTimer = -1L;
                    stopScheduled();
                    return;
                }
                long j = this.lastTimeByTimer;
                if (j == -1) {
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "scheduleTimer begin time is " + minTime);
                    this.lastTimeByTimer = minTime;
                    startScheduled(minTime);
                } else if (minTime != j) {
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "scheduleTimer begin again time is " + minTime);
                    this.lastTimeByTimer = minTime;
                    restartScheduled(minTime);
                }
            } catch (Exception unused) {
                WrappedCompositionsetContent1211.serializer(TAG, "scheduleTimer exception");
            }
        }
    }
}
