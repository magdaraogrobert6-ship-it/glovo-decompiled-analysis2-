package o;

import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.net.zza;
import com.google.android.gms.tasks.zzw;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class openUri {
    public static openUri RemoteActionCompatParcelizer;
    public static final Object read = new Object();
    public final ContentCaptureSessionCompatApi34Impl serializer;

    public static zzw IconCompatParcelizer(Callable callable) {
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = new ParentDataModifierDefaultImpls();
        getScaledHandwritingGestureLineMargin.INSTANCE.execute(new zza(callable, 27, parentDataModifierDefaultImpls));
        return parentDataModifierDefaultImpls.RemoteActionCompatParcelizer;
    }

    public static openUri read() {
        openUri openuri;
        synchronized (read) {
            if (RemoteActionCompatParcelizer == null) {
                HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                handlerThread.start();
                RemoteActionCompatParcelizer = new openUri(handlerThread.getLooper());
            }
            openuri = RemoteActionCompatParcelizer;
        }
        return openuri;
    }

    public openUri(Looper looper) {
        ContentCaptureSessionCompatApi34Impl contentCaptureSessionCompatApi34Impl = new ContentCaptureSessionCompatApi34Impl(looper, 2);
        Looper.getMainLooper();
        this.serializer = contentCaptureSessionCompatApi34Impl;
    }
}
