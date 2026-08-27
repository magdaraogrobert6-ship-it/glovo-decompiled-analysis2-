package o;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetNumPad3cp implements ServiceConnection {
    public boolean write = false;
    public final LinkedBlockingQueue serializer = new LinkedBlockingQueue();

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }

    public final IBinder IconCompatParcelizer() throws TimeoutException {
        accessgetSystemNavigationDowncp.IconCompatParcelizer("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.write) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Cannot call get on this connection more than once");
            return null;
        }
        this.write = true;
        IBinder iBinder = (IBinder) this.serializer.poll(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, TimeUnit.MILLISECONDS);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.serializer.add(iBinder);
    }
}
