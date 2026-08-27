package com.mapbox.maps.renderer;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.mapbox.maps.MapboxLogger;
import o.hideCurrentlyDisplayingInAppMessage;

/* JADX INFO: loaded from: classes2.dex */
public final class RenderHandlerThread {
    private final String TAG;
    private volatile Handler handler;
    private final HandlerThread handlerThread;
    private final String handlerThreadName;

    public static /* synthetic */ void getHandlerThread$maps_sdk_release$annotations() {
    }

    private static /* synthetic */ void getTAG$annotations() {
    }

    public final Handler getHandler$maps_sdk_release() {
        return this.handler;
    }

    public final HandlerThread getHandlerThread$maps_sdk_release() {
        return this.handlerThread;
    }

    public final void setHandler$maps_sdk_release(Handler handler) {
        this.handler = handler;
    }

    public final Handler start(Handler.Callback callback) {
        this.handlerThread.start();
        Handler handler = new Handler(this.handlerThread.getLooper(), callback);
        this.handler = handler;
        return handler;
    }

    public final void stop() {
        this.handlerThread.quit();
        this.handler = null;
    }

    public RenderHandlerThread(String str) {
        str.getClass();
        String strConcat = !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str) ? "MbxRender".concat(str) : "MapboxRenderThread";
        this.handlerThreadName = strConcat;
        this.handlerThread = new HandlerThread(strConcat, -4);
        StringBuilder sb = new StringBuilder("Mbgl-");
        sb.append(strConcat);
        sb.append(!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str) ? "\\".concat(str) : "");
        this.TAG = sb.toString();
    }

    public final void postDelayed(Runnable runnable, long j) {
        runnable.getClass();
        Handler handler = this.handler;
        if (handler != null) {
            handler.sendMessageDelayed(Message.obtain(handler, runnable), j);
            return;
        }
        MapboxLogger.logW(this.TAG, "Thread " + this.handlerThreadName + " was not started, ignoring event");
    }

    public final boolean isRunning$maps_sdk_release() {
        return this.handler != null && this.handlerThread.isAlive();
    }

    public static /* synthetic */ Handler start$default(RenderHandlerThread renderHandlerThread, Handler.Callback callback, int i, Object obj) {
        if ((i & 1) != 0) {
            callback = null;
        }
        return renderHandlerThread.start(callback);
    }

    public final void clearRenderEventQueue() {
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final void post(Runnable runnable) {
        runnable.getClass();
        postDelayed(runnable, 0L);
    }

    public final void sendMessageDelayed(int i, int i2, long j) {
        Handler handler = this.handler;
        if (handler != null) {
            Message messageObtainMessage = handler.obtainMessage(i, i2, 0);
            messageObtainMessage.getClass();
            handler.sendMessageDelayed(messageObtainMessage, j);
        } else {
            MapboxLogger.logW(this.TAG, "Thread " + this.handlerThreadName + " was not started, ignoring event");
        }
    }
}
