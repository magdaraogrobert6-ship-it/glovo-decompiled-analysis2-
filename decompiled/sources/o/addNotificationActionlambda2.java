package o;

import android.location.Location;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.events.ControlMessage;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "MovingStateGeofencer")
public class addNotificationActionlambda2 extends BrazeFirebaseMessagingServiceCompanion implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    @Override // o.BrazeFirebaseMessagingServiceCompanion
    public final void IconCompatParcelizer() {
        this.write.IconCompatParcelizer(ControlMessage.GEOFENCE_STATE_STOP, (Object) null);
    }

    public addNotificationActionlambda2(getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, getCooldownEnterSeconds getcooldownenterseconds, getVerticalAccuracy getverticalaccuracy, parseLonglambda0 parselonglambda0, ConfigurationManager configurationManager, populateNotificationBuilderlambda1 populatenotificationbuilderlambda1, component4android_sdk_base_release component4android_sdk_base_releaseVar, retrieveRegisteredGeofencesFromLocalStorageandroid_sdk_location_release retrieveregisteredgeofencesfromlocalstorageandroid_sdk_location_release, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, getShouldFetchTestTriggers getshouldfetchtesttriggers) {
        super(getanalyticsenabledenterannotations, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, getcooldownenterseconds, getverticalaccuracy, parselonglambda0, component4android_sdk_base_releaseVar, configurationManager, populatenotificationbuilderlambda1, retrieveregisteredgeofencesfromlocalstorageandroid_sdk_location_release, readandroid_sdk_base_releaseVar, getshouldfetchtesttriggers);
    }

    @Override // o.BrazeFirebaseMessagingServiceCompanion
    public final boolean RemoteActionCompatParcelizer(r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k r8lambdanclnumohj3w_eprkcj4qjg7b2k) {
        if (serializer()) {
            return false;
        }
        boolean z = this.serializer.IconCompatParcelizer().read();
        if (r8lambdanclnumohj3w_eprkcj4qjg7b2k == null || z || BrazeFirebaseMessagingServiceCompanion.RemoteActionCompatParcelizer.contains(r8lambdanclnumohj3w_eprkcj4qjg7b2k.getClass())) {
            return false;
        }
        if (r8lambdanclnumohj3w_eprkcj4qjg7b2k.getClass() == r8lambdaQOq3wL0Ry1sJDGdfdXHrnvb36L4.class || !this.read.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8()) {
            if (r8lambdanclnumohj3w_eprkcj4qjg7b2k.getClass() != r8lambdaQOq3wL0Ry1sJDGdfdXHrnvb36L4.class) {
                return false;
            }
            HashSet hashSet = this.IconCompatParcelizer.read();
            Iterator it = Arrays.asList((byte) 1, (byte) 4, (byte) 5, (byte) 3).iterator();
            while (it.hasNext()) {
                if (hashSet.contains((Byte) it.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // o.BrazeFirebaseMessagingServiceCompanion
    public final void read(Location location) {
        this.write.IconCompatParcelizer(ControlMessage.GEOFENCE_STATE_RESET, location);
    }
}
