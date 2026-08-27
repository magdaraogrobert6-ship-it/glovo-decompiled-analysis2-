package o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes3.dex */
final class getDataStoreScopeandroid_sdk_base_release extends Handler {
    private final containsandroid_sdk_base_release IconCompatParcelizer;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        synchronized (this) {
            this.IconCompatParcelizer.handleMessage(message);
        }
    }

    public getDataStoreScopeandroid_sdk_base_release(containsandroid_sdk_base_release containsandroid_sdk_base_releaseVar) {
        this.IconCompatParcelizer = containsandroid_sdk_base_releaseVar;
    }

    public getDataStoreScopeandroid_sdk_base_release(Looper looper, containsandroid_sdk_base_release containsandroid_sdk_base_releaseVar) {
        super(looper);
        this.IconCompatParcelizer = containsandroid_sdk_base_releaseVar;
    }
}
