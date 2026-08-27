package o;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes2.dex */
public final class getMediaTopMenuEK5gGoQ implements FusedLocationProviderApi {
    public static ParentDataModifierDefaultImpls IconCompatParcelizer(getMediaRecordEK5gGoQ getmediarecordek5ggoq) {
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = new ParentDataModifierDefaultImpls();
        parentDataModifierDefaultImpls.RemoteActionCompatParcelizer.addOnCompleteListener(new getExponentimpl(27, getmediarecordek5ggoq));
        return parentDataModifierDefaultImpls;
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final accessgetNumPadDirectionDowncp flushLocations(accessgetNumPad6cp accessgetnumpad6cp) {
        getMediaPlayEK5gGoQ getmediaplayek5ggoq = new getMediaPlayEK5gGoQ(accessgetnumpad6cp);
        ((accessgetNumPadSubtractcp) accessgetnumpad6cp).IconCompatParcelizer.serializer(1, getmediaplayek5ggoq);
        return getmediaplayek5ggoq;
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final accessgetNumPadDirectionDowncp requestLocationUpdates(accessgetNumPad6cp accessgetnumpad6cp, LocationRequest locationRequest, LocationListener locationListener, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            accessgetSystemNavigationDowncp.serializer(looper, "invalid null looper");
        }
        getMediaSkipForwardEK5gGoQ getmediaskipforwardek5ggoq = new getMediaSkipForwardEK5gGoQ(accessgetnumpad6cp, MathKt.serializer(locationListener, looper, "LocationListener"), locationRequest, 0);
        ((accessgetNumPadSubtractcp) accessgetnumpad6cp).IconCompatParcelizer.serializer(1, getmediaskipforwardek5ggoq);
        return getmediaskipforwardek5ggoq;
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final accessgetNumPadDirectionDowncp setMockMode(accessgetNumPad6cp accessgetnumpad6cp, boolean z) {
        getMediaRewindEK5gGoQ getmediarewindek5ggoq = new getMediaRewindEK5gGoQ(accessgetnumpad6cp, z);
        ((accessgetNumPadSubtractcp) accessgetnumpad6cp).IconCompatParcelizer.serializer(1, getmediarewindek5ggoq);
        return getmediarewindek5ggoq;
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final accessgetNumPadDirectionDowncp removeLocationUpdates(accessgetNumPad6cp accessgetnumpad6cp, LocationCallback locationCallback) {
        getMediaSkipBackwardEK5gGoQ getmediaskipbackwardek5ggoq = new getMediaSkipBackwardEK5gGoQ(accessgetnumpad6cp, locationCallback, 2);
        ((accessgetNumPadSubtractcp) accessgetnumpad6cp).IconCompatParcelizer.serializer(1, getmediaskipbackwardek5ggoq);
        return getmediaskipbackwardek5ggoq;
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final accessgetNumPadDirectionDowncp setMockLocation(accessgetNumPad6cp accessgetnumpad6cp, Location location) {
        getMediaSkipBackwardEK5gGoQ getmediaskipbackwardek5ggoq = new getMediaSkipBackwardEK5gGoQ(accessgetnumpad6cp, location, 3);
        ((accessgetNumPadSubtractcp) accessgetnumpad6cp).IconCompatParcelizer.serializer(1, getmediaskipbackwardek5ggoq);
        return getmediaskipbackwardek5ggoq;
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final Location getLastLocation(accessgetNumPad6cp accessgetnumpad6cp) {
        accessgetSystemNavigationDowncp.write("GoogleApiClient parameter is required.", accessgetnumpad6cp != null);
        accessgetnumpad6cp.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final LocationAvailability getLocationAvailability(accessgetNumPad6cp accessgetnumpad6cp) {
        accessgetSystemNavigationDowncp.write("GoogleApiClient parameter is required.", accessgetnumpad6cp != null);
        accessgetnumpad6cp.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final accessgetNumPadDirectionDowncp removeLocationUpdates(accessgetNumPad6cp accessgetnumpad6cp, PendingIntent pendingIntent) {
        getMediaSkipBackwardEK5gGoQ getmediaskipbackwardek5ggoq = new getMediaSkipBackwardEK5gGoQ(accessgetnumpad6cp, pendingIntent, 1);
        ((accessgetNumPadSubtractcp) accessgetnumpad6cp).IconCompatParcelizer.serializer(1, getmediaskipbackwardek5ggoq);
        return getmediaskipbackwardek5ggoq;
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final accessgetNumPadDirectionDowncp removeLocationUpdates(accessgetNumPad6cp accessgetnumpad6cp, LocationListener locationListener) {
        getMediaSkipBackwardEK5gGoQ getmediaskipbackwardek5ggoq = new getMediaSkipBackwardEK5gGoQ(accessgetnumpad6cp, locationListener, 0);
        ((accessgetNumPadSubtractcp) accessgetnumpad6cp).IconCompatParcelizer.serializer(1, getmediaskipbackwardek5ggoq);
        return getmediaskipbackwardek5ggoq;
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final accessgetNumPadDirectionDowncp requestLocationUpdates(accessgetNumPad6cp accessgetnumpad6cp, LocationRequest locationRequest, LocationCallback locationCallback, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            accessgetSystemNavigationDowncp.serializer(looper, "invalid null looper");
        }
        getMediaSkipForwardEK5gGoQ getmediaskipforwardek5ggoq = new getMediaSkipForwardEK5gGoQ(accessgetnumpad6cp, MathKt.serializer(locationCallback, looper, "LocationCallback"), locationRequest, 1);
        ((accessgetNumPadSubtractcp) accessgetnumpad6cp).IconCompatParcelizer.serializer(1, getmediaskipforwardek5ggoq);
        return getmediaskipforwardek5ggoq;
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final accessgetNumPadDirectionDowncp requestLocationUpdates(accessgetNumPad6cp accessgetnumpad6cp, LocationRequest locationRequest, LocationListener locationListener) {
        Looper looperMyLooper = Looper.myLooper();
        accessgetSystemNavigationDowncp.serializer(looperMyLooper, "invalid null looper");
        getMediaSkipForwardEK5gGoQ getmediaskipforwardek5ggoq = new getMediaSkipForwardEK5gGoQ(accessgetnumpad6cp, MathKt.serializer(locationListener, looperMyLooper, "LocationListener"), locationRequest, 0);
        ((accessgetNumPadSubtractcp) accessgetnumpad6cp).IconCompatParcelizer.serializer(1, getmediaskipforwardek5ggoq);
        return getmediaskipforwardek5ggoq;
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final accessgetNumPadDirectionDowncp requestLocationUpdates(accessgetNumPad6cp accessgetnumpad6cp, LocationRequest locationRequest, PendingIntent pendingIntent) {
        getMediaSkipForwardEK5gGoQ getmediaskipforwardek5ggoq = new getMediaSkipForwardEK5gGoQ(accessgetnumpad6cp, pendingIntent, locationRequest, 2);
        ((accessgetNumPadSubtractcp) accessgetnumpad6cp).IconCompatParcelizer.serializer(1, getmediaskipforwardek5ggoq);
        return getmediaskipforwardek5ggoq;
    }
}
