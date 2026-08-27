package o;

import android.location.Location;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class WindowStrictModeException extends LocationCallback {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ FrameworkServiceWorkerClient write;

    public WindowStrictModeException(FrameworkServiceWorkerClient frameworkServiceWorkerClient) {
        this.write = frameworkServiceWorkerClient;
    }

    @Override // com.google.android.gms.location.LocationCallback
    public final void onLocationAvailability(LocationAvailability locationAvailability) {
        int i = 2 % 2;
        int i2 = read + 37;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        locationAvailability.getClass();
        this.write.RemoteActionCompatParcelizer(locationAvailability.isLocationAvailable());
        int i4 = read + 57;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.location.LocationCallback
    public final void onLocationResult(LocationResult locationResult) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 17;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            locationResult.getClass();
            locationResult.getLocations().iterator();
            throw null;
        }
        locationResult.getClass();
        Iterator<Location> it = locationResult.getLocations().iterator();
        while (!(!it.hasNext())) {
            int i3 = RemoteActionCompatParcelizer + 73;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            Location next = it.next();
            next.getClass();
            this.write.RemoteActionCompatParcelizer(next);
        }
        int i5 = read + 103;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }
}
