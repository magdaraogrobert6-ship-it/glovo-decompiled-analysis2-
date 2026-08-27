package o;

import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes.dex */
public abstract class setPopupBackgroundResource {
    public static void write(CancellationSignal cancellationSignal) {
        cancellationSignal.cancel();
    }

    public static CancellationSignal write() {
        return new CancellationSignal();
    }
}
