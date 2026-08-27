package o;

import android.content.Context;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.PowerManager;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.huawei.secure.android.common.intent.SafeIntent;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class getWindowRecomposer extends readAnimationScale {
    public static final CopyOnWriteArrayList read = new CopyOnWriteArrayList();
    public HandlerThread RemoteActionCompatParcelizer;
    public ContentCaptureSessionCompatApi34Impl write;

    @Override // o.readAnimationScale
    public final int RemoteActionCompatParcelizer() {
        return 120000;
    }

    @Override // o.readAnimationScale
    public final void IconCompatParcelizer(Intent intent) {
        SafeIntent safeIntent = new SafeIntent(intent);
        safeIntent.getAction();
        WrappedCompositionsetContent1211.read();
        boolean zEquals = "android.intent.action.SCREEN_OFF".equals(safeIntent.getAction());
        CopyOnWriteArrayList copyOnWriteArrayList = read;
        if (zEquals) {
            WrappedCompositionsetContent1211.read();
            try {
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                }
            } catch (Exception unused) {
                WrappedCompositionsetContent1211.serializer("ScreenStatusBroadcastReceiver", "exec callback onScreenOff exception");
            }
            if (this.RemoteActionCompatParcelizer == null || this.write == null) {
                WrappedCompositionsetContent1211.read();
                HandlerThread handlerThread = new HandlerThread("Location_Lite_Broadcast");
                this.RemoteActionCompatParcelizer = handlerThread;
                handlerThread.start();
                this.write = new ContentCaptureSessionCompatApi34Impl(this.RemoteActionCompatParcelizer.getLooper(), 3);
            } else {
                WrappedCompositionsetContent1211.read();
                this.write.removeMessages(1005);
            }
            this.write.sendEmptyMessageDelayed(1005, DeviceOrientationRequest.OUTPUT_PERIOD_FAST);
            WrappedCompositionsetContent1211.read();
        }
        if ("android.intent.action.SCREEN_ON".equals(safeIntent.getAction())) {
            WrappedCompositionsetContent1211.read();
            try {
                Iterator it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    if (it2.next() != null) {
                        throw new ClassCastException();
                    }
                }
            } catch (Exception unused2) {
                WrappedCompositionsetContent1211.serializer("ScreenStatusBroadcastReceiver", "exec callback onScreenOn exception");
            }
            ContentCaptureSessionCompatApi34Impl contentCaptureSessionCompatApi34Impl = this.write;
            if (contentCaptureSessionCompatApi34Impl == null || !contentCaptureSessionCompatApi34Impl.hasMessages(1005)) {
                return;
            }
            WrappedCompositionsetContent1211.read();
            this.write.removeMessages(1005);
        }
    }

    @Override // o.readAnimationScale
    public final String write() {
        return "Loc-Screen-Receive";
    }

    public static boolean serializer() {
        Object systemService = placeAtf8xVGno.read().getSystemService("power");
        boolean zIsScreenOn = systemService instanceof PowerManager ? ((PowerManager) systemService).isScreenOn() : false;
        WrappedCompositionsetContent1211.read();
        return zIsScreenOn;
    }

    @Override // o.readAnimationScale, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }
}
