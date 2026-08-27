package com.huawei.riemann.location.gwivdr.utils;

import com.huawei.riemann.location.gwivdr.GwiVdrClient;
import com.incognia.internal.ZM$$ExternalSyntheticLambda2;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o.IconCompatParcelizer;
import o.WindowInfoImplCompanion;
import o.WrappedCompositionsetContent1211;

/* JADX INFO: loaded from: classes2.dex */
public class KeepAliveManager {
    private static final int RESTART_DELAY_10_MIN = 600;
    private static final int RESTART_DELAY_10_SEC = 10;
    private static final int RESTART_DELAY_1_MIN = 60;
    private static final String TAG = "KeepAliveManager";
    private final GwiVdrClient gwiVdrClient;
    private volatile boolean isVdrStopped = false;
    private int restartDelay = 0;
    private final ScheduledExecutorService timer = Executors.newScheduledThreadPool(1);

    private boolean isNeedRestartVdr(int i) {
        return i == 77;
    }

    public boolean isVdrStopped() {
        return this.isVdrStopped;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setErrorCode$0() {
        this.gwiVdrClient.startVdr();
        this.isVdrStopped = false;
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "vdr started");
    }

    public KeepAliveManager(GwiVdrClient gwiVdrClient) {
        this.gwiVdrClient = gwiVdrClient;
    }

    public String toString() {
        return IconCompatParcelizer.IconCompatParcelizer(new StringBuilder("KeepAliveManager{isVdrStopped="), this.isVdrStopped, '}');
    }

    public void setErrorCode(int i) {
        if (!isNeedRestartVdr(i) || this.isVdrStopped) {
            return;
        }
        this.gwiVdrClient.stopVdr();
        this.isVdrStopped = true;
        int i2 = this.restartDelay;
        if (i2 >= 60) {
            this.restartDelay = RESTART_DELAY_10_MIN;
        } else {
            this.restartDelay = i2 < 10 ? 10 : 60;
        }
        WindowInfoImplCompanion.serializer(this.restartDelay, TAG, new StringBuilder("vdr stopped, restart delay: "));
        this.timer.schedule(new ZM$$ExternalSyntheticLambda2(3, this), this.restartDelay, TimeUnit.SECONDS);
    }
}
