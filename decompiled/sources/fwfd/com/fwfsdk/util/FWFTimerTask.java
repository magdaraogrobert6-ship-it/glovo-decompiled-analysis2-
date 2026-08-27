package fwfd.com.fwfsdk.util;

import android.os.SystemClock;
import fwfd.com.fwfsdk.FunWithFlags;
import fwfd.com.fwfsdk.manager.FWFDataManager;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes5.dex */
public class FWFTimerTask {
    private static FWFTimerTask _instance;
    private Timer timer = new Timer();
    private long startTime = 0;
    private boolean isActive = true;

    public long getStartTime() {
        return this.startTime;
    }

    public Timer getTimer() {
        return this.timer;
    }

    public void setActive(boolean z) {
        this.isActive = z;
    }

    public static FWFTimerTask getInstance() {
        FWFTimerTask fWFTimerTask;
        synchronized (FWFTimerTask.class) {
            if (_instance == null) {
                _instance = new FWFTimerTask();
            }
            fWFTimerTask = _instance;
        }
        return fWFTimerTask;
    }

    public void restartTimerOnFeatureExpirationTimeChanged() {
        this.timer.cancel();
        this.timer = new Timer();
        startTimer();
    }

    public void startTimer() {
        this.timer.cancel();
        Timer timer = new Timer();
        this.timer = timer;
        timer.scheduleAtFixedRate(new TimerTask() { // from class: fwfd.com.fwfsdk.util.FWFTimerTask.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                if (FWFTimerTask.this.isActive) {
                    FWFTimerTask.this.startTime = SystemClock.elapsedRealtime();
                    FWFTimerTask.this.updateFeatures();
                }
            }
        }, 0L, 1000 * FunWithFlags.getInstance().getFeatureExpirationTime().longValue());
    }

    public void stopTimer() {
        this.timer.cancel();
    }

    private int getElapsedTime() {
        return Math.round(SystemClock.elapsedRealtime() - this.startTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateFeatures() {
        FWFDataManager.getInstance().updateSubscribedFeatures();
    }

    public void restartTimer() {
        if (getElapsedTime() >= FunWithFlags.getInstance().getFeatureExpirationTime().longValue() * 1000) {
            this.timer.cancel();
            this.timer = new Timer();
            startTimer();
        }
    }
}
