package com.mapbox.maps.threading;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.MapboxLogger;
import o.getCieXyz;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
@MapboxExperimental
public final class AnimationThreadController {
    private static final String BACKGROUND_ANIMATION_THREAD_NAME = "MapboxAnimThread";
    private static final String TAG = "AnimThreadController";
    private static Handler backgroundAnimationHandler;
    private static HandlerThread backgroundAnimationThread;
    private static volatile boolean usingBackgroundThread;
    public static final AnimationThreadController INSTANCE = new AnimationThreadController();
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());

    private AnimationThreadController() {
    }

    public final boolean getUsingBackgroundThread() {
        return usingBackgroundThread;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postOnAnimatorThread$lambda$3$lambda$2(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postOnMainThread$lambda$1(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
    }

    public final void postOnAnimatorThread(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        if (!usingBackgroundThread) {
            postOnMainThread(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
            return;
        }
        Looper looperMyLooper = Looper.myLooper();
        HandlerThread handlerThread = backgroundAnimationThread;
        Looper looper = handlerThread != null ? handlerThread.getLooper() : null;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{looperMyLooper, looper}, getCieXyz.write())).booleanValue()) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            return;
        }
        Handler handler = backgroundAnimationHandler;
        if (handler != null) {
            handler.post(new AnimationThreadController$$ExternalSyntheticLambda0(0, r8lambdardpfsr94j4iebcwx_kpqzpm8k0));
        } else {
            MapboxLogger.logW(TAG, "useBackgroundThread was called but handler is null, animator event is skipped!");
        }
    }

    public final void postOnMainThread(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        Object[] objArr = {Looper.myLooper(), Looper.getMainLooper()};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        } else {
            mainHandler.post(new AnimationThreadController$$ExternalSyntheticLambda0(1, r8lambdardpfsr94j4iebcwx_kpqzpm8k0));
        }
    }

    public final void useMainThread() {
        if (usingBackgroundThread) {
            Handler handler = backgroundAnimationHandler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            HandlerThread handlerThread = backgroundAnimationThread;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            usingBackgroundThread = false;
            backgroundAnimationThread = null;
            backgroundAnimationHandler = null;
        }
    }

    public final void useBackgroundThread() {
        if (usingBackgroundThread) {
            return;
        }
        usingBackgroundThread = true;
        HandlerThread handlerThread = backgroundAnimationThread;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        HandlerThread handlerThread2 = new HandlerThread(BACKGROUND_ANIMATION_THREAD_NAME);
        handlerThread2.start();
        backgroundAnimationHandler = new Handler(handlerThread2.getLooper());
        backgroundAnimationThread = handlerThread2;
    }
}
