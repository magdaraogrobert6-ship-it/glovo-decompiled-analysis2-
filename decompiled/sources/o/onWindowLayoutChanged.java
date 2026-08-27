package o;

import android.location.Location;
import com.huawei.hms.location.LocationAvailability;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationResult;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class onWindowLayoutChanged extends LocationCallback {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int read;
    public final /* synthetic */ FrameworkServiceWorkerClient serializer;

    public /* synthetic */ onWindowLayoutChanged(FrameworkServiceWorkerClient frameworkServiceWorkerClient, int i) {
        this.read = i;
        this.serializer = frameworkServiceWorkerClient;
    }

    @Override // com.huawei.hms.location.LocationCallback
    public final void onLocationAvailability(LocationAvailability locationAvailability) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 9;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        FrameworkServiceWorkerClient frameworkServiceWorkerClient = this.serializer;
        locationAvailability.getClass();
        if (i4 == 0) {
            frameworkServiceWorkerClient.RemoteActionCompatParcelizer(locationAvailability.isLocationAvailable());
            return;
        }
        frameworkServiceWorkerClient.RemoteActionCompatParcelizer(locationAvailability.isLocationAvailable());
        int i5 = IconCompatParcelizer + 7;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    @Override // com.huawei.hms.location.LocationCallback
    public final void onLocationResult(LocationResult locationResult) {
        int i = 2 % 2;
        int i2 = write + 65;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        int i5 = this.read;
        FrameworkServiceWorkerClient frameworkServiceWorkerClient = this.serializer;
        if (i5 == 0) {
            if (locationResult == null) {
                return;
            }
            for (Location location : locationResult.getLocations()) {
                location.getClass();
                frameworkServiceWorkerClient.RemoteActionCompatParcelizer(location);
            }
            return;
        }
        if (locationResult == null) {
            int i6 = i3 + 41;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else {
            Iterator<Location> it = locationResult.getLocations().iterator();
            while (!(!it.hasNext())) {
                Location next = it.next();
                next.getClass();
                frameworkServiceWorkerClient.RemoteActionCompatParcelizer(next);
            }
        }
    }
}
