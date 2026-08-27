package com.mapbox.maps.renderer;

import android.os.Handler;
import bo.app.af$$ExternalSyntheticOutline0;
import com.mapbox.maps.MapboxLogger;
import io.sentry.Sentry$$ExternalSyntheticLambda5;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import o.hideCurrentlyDisplayingInAppMessage;

/* JADX INFO: loaded from: classes2.dex */
public final class FpsManager {
    private static final boolean LOG_STATISTICS = false;
    private static final int SCREEN_METRICS_NOT_DEFINED = -1;
    public static final int USER_DEFINED_REFRESH_RATE_NOT_SET = -1;
    public static final int VSYNC_COUNT_TILL_IDLE = 3;
    private final String TAG;
    private int choreographerPacingSkips;
    private int choreographerSkips;
    private int choreographerTicks;
    private OnFpsChangedListener fpsChangedListener;
    private long frameRenderTimeAccumulatedNs;
    private final Handler handler;
    private int missedMapRenderFrames;
    private final Runnable onRenderingPausedRunnable;
    private long preRenderTimeNs;
    private int previousDrawnFrameIndex;
    private long previousFrameTimeNs;
    private long screenRefreshPeriodNs;
    private int screenRefreshRate;
    private int skippedNow;
    private int userRefreshRate;
    private Double userToScreenRefreshRateRatio;
    public static final Companion Companion = new Companion(null);
    private static final Object fpsManagerToken = new Object();
    private static final long ONE_SECOND_NS = (long) Math.pow(10.0d, 9.0d);
    private static final long ONE_MILLISECOND_NS = (long) Math.pow(10.0d, 6.0d);

    private static /* synthetic */ void getTAG$annotations() {
    }

    public final OnFpsChangedListener getFpsChangedListener$maps_sdk_release() {
        return this.fpsChangedListener;
    }

    public final int getSkippedNow() {
        return this.skippedNow;
    }

    public final void onSurfaceDestroyed() {
        onRenderingPaused();
    }

    public final void setFpsChangedListener$maps_sdk_release(OnFpsChangedListener onFpsChangedListener) {
        this.fpsChangedListener = onFpsChangedListener;
    }

    private final void onRenderingPaused() {
        this.handler.removeCallbacksAndMessages(fpsManagerToken);
        calculateFpsAndReset();
        this.previousFrameTimeNs = -1L;
    }

    public final void destroy() {
        this.handler.removeCallbacksAndMessages(fpsManagerToken);
        this.fpsChangedListener = null;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public FpsManager(Handler handler, String str) {
        handler.getClass();
        str.getClass();
        this.handler = handler;
        this.userRefreshRate = -1;
        this.screenRefreshRate = -1;
        this.screenRefreshPeriodNs = -1L;
        this.previousFrameTimeNs = -1L;
        this.preRenderTimeNs = -1L;
        this.TAG = "Mbgl-FpsManager".concat(!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str) ? "\\".concat(str) : "");
        this.onRenderingPausedRunnable = new Sentry$$ExternalSyntheticLambda5(12, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onRenderingPausedRunnable$lambda$1(FpsManager fpsManager) {
        fpsManager.getClass();
        fpsManager.onRenderingPaused();
    }

    private final void updateFrameStats(long j) {
        this.preRenderTimeNs = System.nanoTime();
        this.skippedNow = 0;
        long j2 = this.previousFrameTimeNs;
        if (j2 != -1) {
            long j3 = j - j2;
            long j4 = this.screenRefreshPeriodNs;
            long j5 = ONE_MILLISECOND_NS;
            long j6 = j4 + j5;
            if (j3 > j6) {
                int i = (int) (j3 / j6);
                this.skippedNow = i;
                this.choreographerSkips += i;
            }
            Double d = this.userToScreenRefreshRateRatio;
            int iDoubleValue = (int) (j3 / ((this.screenRefreshPeriodNs / (d != null ? d.doubleValue() : 1.0d)) + j5));
            if (iDoubleValue > 0) {
                this.missedMapRenderFrames += iDoubleValue;
            }
        }
        this.previousFrameTimeNs = j;
        this.choreographerTicks = this.skippedNow + 1 + this.choreographerTicks;
    }

    public final void postRender() {
        this.frameRenderTimeAccumulatedNs += System.nanoTime() - this.preRenderTimeNs;
        if (this.choreographerTicks >= this.screenRefreshRate) {
            calculateFpsAndReset();
        } else {
            this.handler.postDelayed(this.onRenderingPausedRunnable, fpsManagerToken, (this.screenRefreshPeriodNs / ONE_MILLISECOND_NS) * 3);
        }
        this.preRenderTimeNs = -1L;
    }

    public final void setUserRefreshRate(int i) {
        if (this.userRefreshRate != i) {
            this.userRefreshRate = i;
            MapboxLogger.logI(this.TAG, "User set max FPS to " + this.userRefreshRate);
            updateUserToScreenRefreshRatio();
        }
    }

    private final void calculateFpsAndReset() {
        int i = this.choreographerTicks;
        if (i == 0) {
            return;
        }
        OnFpsChangedListener onFpsChangedListener = this.fpsChangedListener;
        if (onFpsChangedListener != null) {
            double d = (1.0d - (((double) this.choreographerSkips) / ((double) i))) * ((double) this.screenRefreshRate);
            onFpsChangedListener.onFpsChanged(d);
            int i2 = this.choreographerTicks;
            int i3 = this.choreographerSkips;
            if (i2 == i3) {
                String str = this.TAG;
                StringBuilder sbM = af$$ExternalSyntheticOutline0.m(d, "VSYNC based FPS is ", ", skipped ");
                sbM.append(this.choreographerSkips);
                sbM.append(" (");
                sbM.append(this.choreographerPacingSkips);
                sbM.append(" due to pacing) out of ");
                sbM.append(this.choreographerTicks);
                sbM.append(" VSYNC pulses");
                MapboxLogger.logI(str, sbM.toString());
            } else {
                double d2 = this.frameRenderTimeAccumulatedNs / ((double) (i2 - i3));
                String str2 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf((this.screenRefreshPeriodNs / d2) * ((double) this.screenRefreshRate))}, 1));
                MapboxLogger.logI(this.TAG, "Average map core rendering time is " + (d2 / ONE_MILLISECOND_NS) + " ms (or " + str2 + " FPS), missed " + this.missedMapRenderFrames + " map render frames, skipped " + this.choreographerSkips + " (" + this.choreographerPacingSkips + " due to render pacing) out of " + this.choreographerTicks + " VSYNC pulses");
            }
        }
        this.previousDrawnFrameIndex = 0;
        this.frameRenderTimeAccumulatedNs = 0L;
        this.choreographerTicks = 0;
        this.choreographerSkips = 0;
        this.choreographerPacingSkips = 0;
        this.missedMapRenderFrames = 0;
    }

    private final boolean performPacing(double d) {
        int i = (int) (((double) this.choreographerTicks) * d);
        if (i > this.previousDrawnFrameIndex) {
            this.previousDrawnFrameIndex = i;
            return true;
        }
        this.choreographerPacingSkips++;
        this.choreographerSkips++;
        return false;
    }

    public static /* synthetic */ boolean preRender$default(FpsManager fpsManager, long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return fpsManager.preRender(j, z);
    }

    private final void updateUserToScreenRefreshRatio() {
        int i;
        int i2 = this.userRefreshRate;
        if (i2 != -1 && (i = this.screenRefreshRate) != -1) {
            this.userToScreenRefreshRateRatio = Double.valueOf(RangesKt.read(((double) i2) / ((double) i), 0.0d, 1.0d));
            MapboxLogger.logI(this.TAG, "User defined ratio is " + this.userToScreenRefreshRateRatio);
            calculateFpsAndReset();
            return;
        }
        this.userToScreenRefreshRateRatio = null;
        MapboxLogger.logI(this.TAG, "userToScreenRefreshRateRatio is not set (userRefreshRate=" + this.userRefreshRate + ", screenRefreshRate=" + this.screenRefreshRate + ')');
    }

    public final boolean preRender(long j, boolean z) {
        if (this.userToScreenRefreshRateRatio == null && this.fpsChangedListener == null && !z) {
            return true;
        }
        this.handler.removeCallbacksAndMessages(fpsManagerToken);
        updateFrameStats(j);
        Double d = this.userToScreenRefreshRateRatio;
        if (d != null) {
            return performPacing(d.doubleValue());
        }
        return true;
    }

    public final void setScreenRefreshRate(int i) {
        if (this.screenRefreshRate == i) {
            return;
        }
        this.screenRefreshRate = i;
        this.screenRefreshPeriodNs = ONE_SECOND_NS / ((long) i);
        updateUserToScreenRefreshRatio();
    }
}
