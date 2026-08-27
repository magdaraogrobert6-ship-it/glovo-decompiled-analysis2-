package o;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public class getBackEK5gGoQ extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getBackEK5gGoQ(Looper looper, int i) {
        super(looper);
        if (i == 2) {
            super(looper);
            Looper.getMainLooper();
        } else if (i == 3) {
            super(looper);
            Looper.getMainLooper();
        } else if (i != 4) {
            Looper.getMainLooper();
        } else {
            super(looper);
            Looper.getMainLooper();
        }
    }

    public getBackEK5gGoQ(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }
}
