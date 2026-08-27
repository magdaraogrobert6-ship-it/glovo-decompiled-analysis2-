package o;

import com.sentiance.sdk.events.ControlMessage;

/* JADX INFO: loaded from: classes3.dex */
final class BrazeNotificationStyleFactory extends deepcopyandroid_sdk_base_release {
    final /* synthetic */ Object read;
    public final /* synthetic */ int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazeNotificationStyleFactory(getInstanceannotations getinstanceannotations, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        super(readandroid_sdk_base_releaseVar, "LocationFixRequestTask");
        this.serializer = 5;
        this.read = getinstanceannotations;
    }

    @Override // o.deepcopyandroid_sdk_base_release
    public final void serializer(ControlMessage controlMessage, Object obj) {
        long jCurrentTimeMillis;
        int i = this.serializer;
        Object obj2 = this.read;
        if (i == 0) {
            populateNotificationBuilderlambda1.write((populateNotificationBuilderlambda1) obj2);
            return;
        }
        if (i == 1) {
            populateNotificationBuilderlambda1.write((populateNotificationBuilderlambda1) obj2);
            return;
        }
        if (i == 2) {
            populateNotificationBuilderlambda1 populatenotificationbuilderlambda1 = (populateNotificationBuilderlambda1) obj2;
            if (obj instanceof Long) {
                jCurrentTimeMillis = ((Long) obj).longValue();
            } else {
                populatenotificationbuilderlambda1.MediaSessionCompatQueueItem.getClass();
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            if (controlMessage == ControlMessage.GEOFENCE_TIMEOUT_OTG) {
                populatenotificationbuilderlambda1.RemoteActionCompatParcelizer((Byte) (byte) 12, true, jCurrentTimeMillis);
                return;
            } else {
                if (controlMessage == ControlMessage.GEOFENCE_TIMEOUT_OTG_RESOLVED) {
                    populatenotificationbuilderlambda1.RemoteActionCompatParcelizer((Byte) (byte) 12, false, jCurrentTimeMillis);
                    return;
                }
                return;
            }
        }
        if (i != 3) {
            if (i == 4) {
                populateNotificationBuilderlambda1.write((populateNotificationBuilderlambda1) obj2);
                return;
            }
            getInstanceannotations getinstanceannotations = (getInstanceannotations) obj2;
            getInstanceannotations.write(getinstanceannotations);
            getinstanceannotations.serializer(false);
            return;
        }
        populateNotificationBuilderlambda1 populatenotificationbuilderlambda2 = (populateNotificationBuilderlambda1) obj2;
        if (controlMessage == ControlMessage.NO_ACCURATE_LOCATIONS_OTG) {
            populateNotificationBuilderlambda1.RemoteActionCompatParcelizer(populatenotificationbuilderlambda2, (Byte) (byte) 9, true);
        } else if (controlMessage == ControlMessage.NO_ACCURATE_LOCATIONS_OTG_RESOLVED) {
            populateNotificationBuilderlambda1.RemoteActionCompatParcelizer(populatenotificationbuilderlambda2, (Byte) (byte) 9, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BrazeNotificationStyleFactory(populateNotificationBuilderlambda1 populatenotificationbuilderlambda1, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, int i) {
        super(readandroid_sdk_base_releaseVar, "OffTheGridManager");
        this.serializer = i;
        this.read = populatenotificationbuilderlambda1;
    }
}
