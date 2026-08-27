package o;

import android.location.Location;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Message;
import com.huawei.location.lite.common.adapter.ILocationProxyAdapterCallback;
import com.huawei.location.lite.common.adapter.LocationProxyAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class setImportantForContentCapture implements ILocationProxyAdapterCallback {
    public static volatile setImportantForContentCapture RemoteActionCompatParcelizer;
    public static final byte[] write = new byte[0];
    public volatile boolean IconCompatParcelizer;
    public ContentCaptureSessionCompatApi34Impl read;
    public HandlerThread serializer;

    public static setImportantForContentCapture IconCompatParcelizer() {
        if (RemoteActionCompatParcelizer == null) {
            synchronized (write) {
                if (RemoteActionCompatParcelizer == null) {
                    setImportantForContentCapture setimportantforcontentcapture = new setImportantForContentCapture();
                    setimportantforcontentcapture.IconCompatParcelizer = false;
                    RemoteActionCompatParcelizer = setimportantforcontentcapture;
                }
            }
        }
        return RemoteActionCompatParcelizer;
    }

    public final void read() {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("LocationProxyManager", "initHandler.");
        if (this.read != null) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("LocationProxyManager", "handler has been init, return here.");
            return;
        }
        HandlerThread handlerThread = new HandlerThread("Loc-Proxy");
        this.serializer = handlerThread;
        handlerThread.start();
        this.read = new ContentCaptureSessionCompatApi34Impl(this.serializer.getLooper(), 0);
    }

    @Override // com.huawei.location.lite.common.adapter.ILocationProxyAdapterCallback
    public final void onProxyLocationCallback(Location location) {
        synchronized (this) {
            if (location == null) {
                return;
            }
            try {
                if (this.read == null) {
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("LocationProxyManager", "handler is null, try to request first, initFlag: " + this.IconCompatParcelizer);
                    return;
                }
                location.setProvider("gps");
                Bundle extras = location.getExtras();
                if (extras == null) {
                    extras = new Bundle();
                }
                try {
                    extras.putInt("LocationSource", 32);
                } catch (Throwable th) {
                    ComposeScrollCaptureCallbackonScrollCaptureImageRequest2.RemoteActionCompatParcelizer("SafeBundle", "putInt exception: " + th.getMessage());
                }
                location.setExtras(extras);
                Message messageObtain = Message.obtain();
                messageObtain.what = 1;
                messageObtain.obj = location;
                this.read.sendMessage(messageObtain);
            } catch (Exception e) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("LocationProxyManager", "dealProxyLocation exception: " + e.getMessage());
            }
        }
    }

    public final void write() {
        synchronized (this) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("LocationProxyManager", "initProxy");
            try {
                this.IconCompatParcelizer = true;
                read();
                LocationProxyAdapter.setLocationProxyCallback(this);
            } catch (Exception e) {
                WrappedCompositionsetContent1211.read("LocationProxyManager", "initProxy fail: " + e.getMessage());
            }
        }
    }

    public final void write(com.huawei.location.callback.d2 d2Var) {
        synchronized (this) {
            if (!this.IconCompatParcelizer) {
                write();
            }
            ViewCompatShimsApi30Impl.read().IconCompatParcelizer(d2Var);
        }
    }
}
