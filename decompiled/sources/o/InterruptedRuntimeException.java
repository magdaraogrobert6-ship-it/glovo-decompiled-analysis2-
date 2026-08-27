package o;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class InterruptedRuntimeException implements awaitNavigationRoutes {
    public final AtomicBoolean RemoteActionCompatParcelizer = new AtomicBoolean(false);
    public final awaitNavigationRoutes read;

    @Override // o.awaitNavigationRoutes
    public final void IconCompatParcelizer(mapToBase maptobase, CameraUseCaseAdapter cameraUseCaseAdapter) {
        if (this.RemoteActionCompatParcelizer.get()) {
            return;
        }
        this.read.IconCompatParcelizer(maptobase, cameraUseCaseAdapter);
    }

    public final void write() {
        this.RemoteActionCompatParcelizer.set(true);
    }

    public InterruptedRuntimeException(awaitNavigationRoutes awaitnavigationroutes) {
        this.read = awaitnavigationroutes;
    }
}
