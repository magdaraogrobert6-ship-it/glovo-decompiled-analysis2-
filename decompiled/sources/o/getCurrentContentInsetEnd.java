package o;

import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class getCurrentContentInsetEnd implements ThreadFactory {
    public final AtomicInteger IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.RemoteActionCompatParcelizer;
        AtomicInteger atomicInteger = this.IconCompatParcelizer;
        if (i == 0) {
            Thread thread = new Thread(new Preview$$ExternalSyntheticLambda0(11, runnable));
            thread.setPriority(7);
            java.util.Locale locale = java.util.Locale.US;
            thread.setName("CameraX-core_camera_" + atomicInteger.getAndIncrement());
            return thread;
        }
        if (i != 1) {
            return new Thread(runnable, "Location_Location_DispatchTaskManager_" + atomicInteger.getAndIncrement());
        }
        Thread thread2 = new Thread(runnable);
        java.util.Locale locale2 = java.util.Locale.US;
        thread2.setName("CameraX-camerax_io_" + atomicInteger.getAndIncrement());
        return thread2;
    }

    public getCurrentContentInsetEnd(int i) {
        this.RemoteActionCompatParcelizer = i;
        if (i == 1) {
            this.IconCompatParcelizer = new AtomicInteger(0);
        } else if (i != 2) {
            this.IconCompatParcelizer = new AtomicInteger(0);
        } else {
            this.IconCompatParcelizer = new AtomicInteger(0);
        }
    }
}
