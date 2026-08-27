package o;

import com.sentiance.core.model.datasync.GeofenceEventType;
import com.sentiance.core.model.datasync.HarshDrivingEventType;
import com.sentiance.core.model.datasync.OS;
import com.sentiance.core.model.datasync.TransportMode;
import com.sentiance.core.model.datasync.TransportOccupantRole;
import com.sentiance.core.model.datasync.VehicleCrashEventSeverity;

/* JADX INFO: loaded from: classes5.dex */
public final class clearSharedPreferencesDatalambda0 implements getFeatureFlags {
    public final /* synthetic */ int IconCompatParcelizer;

    @Override // o.getFeatureFlags
    public final IEventSubscriber read(int i) {
        int i2 = this.IconCompatParcelizer;
        if (i2 == 0) {
            return OS.forNumber(i);
        }
        if (i2 == 1) {
            return GeofenceEventType.forNumber(i);
        }
        if (i2 == 2) {
            return HarshDrivingEventType.forNumber(i);
        }
        if (i2 != 3) {
            return i2 != 4 ? VehicleCrashEventSeverity.forNumber(i) : TransportOccupantRole.forNumber(i);
        }
        return TransportMode.forNumber(i);
    }
}
