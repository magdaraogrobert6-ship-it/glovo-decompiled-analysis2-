package o;

import com.sentiance.core.model.datasync.GeofenceEventType;
import com.sentiance.core.model.datasync.HarshDrivingEventType;
import com.sentiance.core.model.datasync.OS;
import com.sentiance.core.model.datasync.TransportMode;
import com.sentiance.core.model.datasync.TransportOccupantRole;
import com.sentiance.core.model.datasync.VehicleCrashEventSeverity;

/* JADX INFO: loaded from: classes5.dex */
public final class clearSharedPreferencesDatalambda10 implements FeatureFlagsUpdatedEventCompanion {
    public final /* synthetic */ int MediaDescriptionCompat;
    public static final clearSharedPreferencesDatalambda10 serializer = new clearSharedPreferencesDatalambda10(1);
    public static final clearSharedPreferencesDatalambda10 write = new clearSharedPreferencesDatalambda10(2);
    public static final clearSharedPreferencesDatalambda10 read = new clearSharedPreferencesDatalambda10(0);
    public static final clearSharedPreferencesDatalambda10 RemoteActionCompatParcelizer = new clearSharedPreferencesDatalambda10(3);
    public static final clearSharedPreferencesDatalambda10 IconCompatParcelizer = new clearSharedPreferencesDatalambda10(4);
    public static final clearSharedPreferencesDatalambda10 RatingCompat = new clearSharedPreferencesDatalambda10(5);

    public /* synthetic */ clearSharedPreferencesDatalambda10(int i) {
        this.MediaDescriptionCompat = i;
    }

    @Override // o.FeatureFlagsUpdatedEventCompanion
    public final boolean write(int i) {
        int i2 = this.MediaDescriptionCompat;
        if (i2 == 0) {
            return OS.forNumber(i) != null;
        }
        if (i2 == 1) {
            return GeofenceEventType.forNumber(i) != null;
        }
        if (i2 == 2) {
            return HarshDrivingEventType.forNumber(i) != null;
        }
        if (i2 == 3) {
            return TransportMode.forNumber(i) != null;
        }
        if (i2 != 4) {
            return VehicleCrashEventSeverity.forNumber(i) != null;
        }
        return TransportOccupantRole.forNumber(i) != null;
    }
}
