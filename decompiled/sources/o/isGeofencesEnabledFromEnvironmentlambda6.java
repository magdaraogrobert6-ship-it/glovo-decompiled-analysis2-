package o;

import android.app.Service;
import com.sentiance.sdk.diagnostics.ServiceLifecycleObserver;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class isGeofencesEnabledFromEnvironmentlambda6 implements Runnable {
    public final /* synthetic */ ServiceLifecycleObserver IconCompatParcelizer;
    public final /* synthetic */ Class RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ isGeofencesEnabledFromEnvironmentlambda6(ServiceLifecycleObserver serviceLifecycleObserver, Class cls, int i) {
        this.write = i;
        this.IconCompatParcelizer = serviceLifecycleObserver;
        this.RemoteActionCompatParcelizer = cls;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.write;
        Class<? extends Service> cls = this.RemoteActionCompatParcelizer;
        ServiceLifecycleObserver serviceLifecycleObserver = this.IconCompatParcelizer;
        if (i == 0) {
            serviceLifecycleObserver.onForegroundStopped(cls);
            return;
        }
        if (i == 1) {
            serviceLifecycleObserver.onServiceDestroyed(cls);
        } else if (i != 2) {
            serviceLifecycleObserver.onForegroundStarted(cls);
        } else {
            serviceLifecycleObserver.onServiceCreated(cls);
        }
    }
}
