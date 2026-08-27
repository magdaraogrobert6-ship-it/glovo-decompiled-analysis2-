package o;

import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ContentCaptureSessionCompatApi34Impl extends Handler {
    public final /* synthetic */ int IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContentCaptureSessionCompatApi34Impl(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.IconCompatParcelizer = 1;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i = this.IconCompatParcelizer;
        if (i != 0) {
            if (i != 3) {
                super.handleMessage(message);
                return;
            } else if (message == null || message.what != 1005) {
                WrappedCompositionsetContent1211.read("ScreenStatusBroadcastReceiver", "message error");
                return;
            } else {
                getWindowRecomposer.serializer();
                WrappedCompositionsetContent1211.read();
                return;
            }
        }
        WindowInfoImplCompanion.serializer(message.what, "LocationProxyManager", new StringBuilder("msg.what="));
        if (message.what != 1) {
            return;
        }
        Object obj = message.obj;
        if (obj instanceof Location) {
            Location location = (Location) obj;
            ViewCompatShimsApi30Impl viewCompatShimsApi30Impl = ViewCompatShimsApi30Impl.read();
            viewCompatShimsApi30Impl.getClass();
            synchronized (ViewCompatShimsApi30Impl.serializer) {
                try {
                    ArrayList arrayList = viewCompatShimsApi30Impl.RemoteActionCompatParcelizer;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        for (int i2 = 0; i2 < viewCompatShimsApi30Impl.RemoteActionCompatParcelizer.size(); i2++) {
                            ((com.huawei.location.callback.d2) viewCompatShimsApi30Impl.RemoteActionCompatParcelizer.get(i2)).read(new Location(location));
                        }
                    }
                } catch (Exception e) {
                    WrappedCompositionsetContent1211.read("LocationProxyListenerManager", "onProxyLocationChanged exception, error: " + e.getMessage());
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContentCaptureSessionCompatApi34Impl(Looper looper, int i) {
        super(looper);
        this.IconCompatParcelizer = i;
    }
}
