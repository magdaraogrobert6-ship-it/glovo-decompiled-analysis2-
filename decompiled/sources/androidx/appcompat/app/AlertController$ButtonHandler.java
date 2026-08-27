package androidx.appcompat.app;

import android.content.DialogInterface;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.mapbox.maps.plugin.scalebar.ScaleBarImpl;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class AlertController$ButtonHandler extends Handler {
    public final /* synthetic */ int serializer = 0;
    public WeakReference write;

    public /* synthetic */ AlertController$ButtonHandler() {
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.serializer == 0) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.write.get(), message.what);
                return;
            } else {
                if (i != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
                return;
            }
        }
        message.getClass();
        ScaleBarImpl scaleBarImpl = (ScaleBarImpl) this.write.get();
        if (scaleBarImpl != null) {
            int i2 = message.what;
            if (i2 == 0) {
                scaleBarImpl.invalidate();
                return;
            }
            if (i2 != 1) {
                return;
            }
            Canvas canvas = scaleBarImpl.reusableCanvas;
            if (canvas == null) {
                scaleBarImpl.invalidate();
            } else {
                scaleBarImpl.draw(canvas);
            }
            sendEmptyMessageDelayed(1, scaleBarImpl.getSettings().refreshInterval);
        }
    }

    public /* synthetic */ AlertController$ButtonHandler(Looper looper) {
        super(looper);
    }
}
