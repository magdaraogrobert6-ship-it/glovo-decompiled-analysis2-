package o;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class batchUpdatesandroid_sdk_base_release {
    private final readAllandroid_sdk_base_release read = new readAllandroid_sdk_base_release(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), new clearAllandroid_sdk_base_release());

    public final readAllandroid_sdk_base_release IconCompatParcelizer() {
        return this.read;
    }
}
