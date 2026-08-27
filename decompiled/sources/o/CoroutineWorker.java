package o;

import android.location.Location;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class CoroutineWorker extends LocationCallback {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ FrameworkServiceWorkerClient IconCompatParcelizer;

    public CoroutineWorker(FrameworkServiceWorkerClient frameworkServiceWorkerClient) {
        this.IconCompatParcelizer = frameworkServiceWorkerClient;
    }

    @Override // com.google.android.gms.location.LocationCallback
    public final void onLocationAvailability(LocationAvailability locationAvailability) {
        int i = 2 % 2;
        int i2 = read + 85;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            locationAvailability.getClass();
            this.IconCompatParcelizer.RemoteActionCompatParcelizer(locationAvailability.isLocationAvailable());
        } else {
            locationAvailability.getClass();
            this.IconCompatParcelizer.RemoteActionCompatParcelizer(locationAvailability.isLocationAvailable());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.google.android.gms.location.LocationCallback
    public final void onLocationResult(LocationResult locationResult) {
        int i = 2 % 2;
        int i2 = read + 3;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        locationResult.getClass();
        Iterator<Location> it = locationResult.getLocations().iterator();
        while (!(!it.hasNext())) {
            int i4 = write + 65;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                Location next = it.next();
                next.getClass();
                this.IconCompatParcelizer.RemoteActionCompatParcelizer(next);
                int i5 = 51 / 0;
            } else {
                Location next2 = it.next();
                next2.getClass();
                this.IconCompatParcelizer.RemoteActionCompatParcelizer(next2);
            }
        }
    }
}
