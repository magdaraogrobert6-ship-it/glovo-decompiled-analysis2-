package o;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.HandlerThread;
import com.huawei.location.sdm.Sdm;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewStructureCompat implements LocationListener {
    public final /* synthetic */ Sdm write;

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        WrappedCompositionsetContent1211.read();
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
        WrappedCompositionsetContent1211.read();
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
        WrappedCompositionsetContent1211.read();
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        HandlerThread handlerThread;
        if (location == null) {
            WrappedCompositionsetContent1211.read("Sdm", "location null");
            return;
        }
        Sdm sdm = this.write;
        if (sdm.RemoteActionCompatParcelizer == null || (handlerThread = sdm.MediaSessionCompatResultReceiverWrapper) == null || !handlerThread.isAlive()) {
            HandlerThread handlerThread2 = new HandlerThread("Sdm");
            sdm.MediaSessionCompatResultReceiverWrapper = handlerThread2;
            handlerThread2.start();
            sdm.RemoteActionCompatParcelizer = new ViewCompatShimsApi29Impl(sdm, sdm.MediaSessionCompatResultReceiverWrapper.getLooper());
        }
        sdm.RemoteActionCompatParcelizer.obtainMessage(1, location).sendToTarget();
    }

    public ViewStructureCompat(Sdm sdm) {
        this.write = sdm;
    }
}
