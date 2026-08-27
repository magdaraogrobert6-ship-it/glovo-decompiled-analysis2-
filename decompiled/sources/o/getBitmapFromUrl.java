package o;

import com.sentiance.sdk.Sentiance;
import com.sentiance.sdk.detectionupdates.UserActivity;
import com.sentiance.sdk.detectionupdates.UserActivityListener;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.trip.TripTimeoutListener;

/* JADX INFO: loaded from: classes3.dex */
public final class getBitmapFromUrl extends deepcopyandroid_sdk_base_release {
    final /* synthetic */ Sentiance IconCompatParcelizer;
    public final /* synthetic */ int serializer = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getBitmapFromUrl(Sentiance sentiance) {
        super(sentiance.getSerialExecutor(), "sentiance");
        this.IconCompatParcelizer = sentiance;
    }

    @Override // o.deepcopyandroid_sdk_base_release
    public final void serializer(ControlMessage controlMessage, Object obj) {
        int i = this.serializer;
        Sentiance sentiance = this.IconCompatParcelizer;
        if (i != 0) {
            UserActivityListener userActivityListener = sentiance.mUserActivityListener;
            if (userActivityListener == null) {
                return;
            }
            UserActivity userActivity = sentiance.getUserActivity();
            sentiance.log("Sending UserActivity to enclosing app, %s", userActivity);
            readBoolean.serializer(new getBitmapFromDiskCachelambda00(userActivityListener, 4, userActivity));
            return;
        }
        if (obj instanceof getTrackingId) {
            getTrackingId gettrackingid = (getTrackingId) obj;
            TripTimeoutListener tripTimeoutListener = sentiance.mTripTimeoutListener;
            if (gettrackingid.RemoteActionCompatParcelizer() && gettrackingid.read() && tripTimeoutListener != null) {
                sentiance.log("Trip timed out", new Object[0]);
                readBoolean.serializer(new removeGeofencesRegisteredWithGeofencingClientlambda25(4, tripTimeoutListener));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getBitmapFromUrl(Sentiance sentiance, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        super(readandroid_sdk_base_releaseVar, "sentiance");
        this.IconCompatParcelizer = sentiance;
    }
}
