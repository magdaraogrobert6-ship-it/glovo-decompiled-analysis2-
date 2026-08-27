package o;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class getContentInsetRight implements Executor {
    public static final getCurrentContentInsetEnd IconCompatParcelizer = new getCurrentContentInsetEnd(0);
    public final Object RemoteActionCompatParcelizer = new Object();
    public ThreadPoolExecutor serializer;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.RemoteActionCompatParcelizer) {
            this.serializer.execute(runnable);
        }
    }

    public final void serializer(androidx.camera.camera2.internal.Camera2CameraFactory camera2CameraFactory) {
        ThreadPoolExecutor threadPoolExecutor;
        camera2CameraFactory.getClass();
        synchronized (this.RemoteActionCompatParcelizer) {
            if (this.serializer.isShutdown()) {
                ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), IconCompatParcelizer);
                threadPoolExecutor2.setRejectedExecutionHandler(new getContentInsetStartWithNavigation());
                this.serializer = threadPoolExecutor2;
            }
            threadPoolExecutor = this.serializer;
        }
        int iMax = Math.max(1, camera2CameraFactory.IconCompatParcelizer().size());
        threadPoolExecutor.setMaximumPoolSize(iMax);
        threadPoolExecutor.setCorePoolSize(iMax);
    }

    public getContentInsetRight() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), IconCompatParcelizer);
        threadPoolExecutor.setRejectedExecutionHandler(new getContentInsetStartWithNavigation());
        this.serializer = threadPoolExecutor;
    }
}
