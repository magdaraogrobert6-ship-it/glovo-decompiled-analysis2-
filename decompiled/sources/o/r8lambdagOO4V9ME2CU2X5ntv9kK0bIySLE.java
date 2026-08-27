package o;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.DetectedActivity;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.processguard.Guard$Type;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "ActivityTransitionDetector", guardType = Guard$Type.REFERENCE_COUNTED)
public class r8lambdagOO4V9ME2CU2X5ntv9kK0bIySLE implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final getAnalyticsEnabledEnterannotations IconCompatParcelizer;
    private final r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 MediaBrowserCompatMediaItem;
    private final HashSet MediaDescriptionCompat = new HashSet();
    private final r8lambdaTIeZSVb60PaFqh0pucDJrUvm2QE MediaMetadataCompat;
    private final ServerConfigDataStoreProviderCompanion MediaSessionCompatQueueItem;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI RatingCompat;
    private final getVerticalAccuracy RemoteActionCompatParcelizer;
    private final parseLonglambda0 read;
    private final readandroid_sdk_base_release serializer;
    private final Context write;

    public static void IconCompatParcelizer(r8lambdagOO4V9ME2CU2X5ntv9kK0bIySLE r8lambdagoo4v9me2cu2x5ntv9kk0biysle, String str) {
        synchronized (r8lambdagoo4v9me2cu2x5ntv9kk0biysle) {
            r8lambdagoo4v9me2cu2x5ntv9kk0biysle.MediaDescriptionCompat.remove(str);
            if (r8lambdagoo4v9me2cu2x5ntv9kk0biysle.MediaDescriptionCompat.isEmpty()) {
                r8lambdagoo4v9me2cu2x5ntv9kk0biysle.MediaMetadataCompat.serializer(r8lambdagoo4v9me2cu2x5ntv9kk0biysle.read());
            }
            r8lambdagoo4v9me2cu2x5ntv9kk0biysle.MediaBrowserCompatMediaItem.write();
        }
    }

    public static void serializer(r8lambdagOO4V9ME2CU2X5ntv9kK0bIySLE r8lambdagoo4v9me2cu2x5ntv9kk0biysle, String str) {
        synchronized (r8lambdagoo4v9me2cu2x5ntv9kk0biysle) {
            boolean zIsEmpty = r8lambdagoo4v9me2cu2x5ntv9kk0biysle.MediaDescriptionCompat.isEmpty();
            if (str != null) {
                r8lambdagoo4v9me2cu2x5ntv9kk0biysle.MediaDescriptionCompat.add(str);
            }
            if (zIsEmpty && !r8lambdagoo4v9me2cu2x5ntv9kk0biysle.MediaDescriptionCompat.isEmpty()) {
                r8lambdagoo4v9me2cu2x5ntv9kk0biysle.read.IconCompatParcelizer("requestActivityTransitionUpdates", new Object[0]);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new ActivityTransition.Builder().setActivityType(7).setActivityTransition(0).build());
                arrayList.add(new ActivityTransition.Builder().setActivityType(8).setActivityTransition(0).build());
                arrayList.add(new ActivityTransition.Builder().setActivityType(0).setActivityTransition(0).build());
                arrayList.add(new ActivityTransition.Builder().setActivityType(1).setActivityTransition(0).build());
                arrayList.add(new ActivityTransition.Builder().setActivityType(3).setActivityTransition(0).build());
                arrayList.add(new ActivityTransition.Builder().setActivityType(2).setActivityTransition(0).build());
                r8lambdagoo4v9me2cu2x5ntv9kk0biysle.MediaMetadataCompat.serializer(new ActivityTransitionRequest(arrayList), r8lambdagoo4v9me2cu2x5ntv9kk0biysle.read());
            }
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return null;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        synchronized (this) {
            this.MediaDescriptionCompat.clear();
            this.MediaMetadataCompat.serializer(read());
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        handleGeofenceEvent handlegeofenceevent = new handleGeofenceEvent(this, this.serializer);
        ControlMessage controlMessage = ControlMessage.ACTIVITY_TRANSITION_START;
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.IconCompatParcelizer;
        getanalyticsenabledenterannotations.read(controlMessage, handlegeofenceevent);
        getanalyticsenabledenterannotations.read(ControlMessage.ACTIVITY_TRANSITION_STOP, handlegeofenceevent);
    }

    public r8lambdagOO4V9ME2CU2X5ntv9kK0bIySLE(parseLonglambda0 parselonglambda0, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, Context context, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, getVerticalAccuracy getverticalaccuracy, ServerConfigDataStoreProviderCompanion serverConfigDataStoreProviderCompanion, r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4, r8lambdaTIeZSVb60PaFqh0pucDJrUvm2QE r8lambdatiezsvb60pafqh0pucdjruvm2qe, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni) {
        this.read = parselonglambda0;
        this.serializer = readandroid_sdk_base_releaseVar;
        this.write = context;
        this.IconCompatParcelizer = getanalyticsenabledenterannotations;
        this.RemoteActionCompatParcelizer = getverticalaccuracy;
        this.MediaSessionCompatQueueItem = serverConfigDataStoreProviderCompanion;
        this.MediaMetadataCompat = r8lambdatiezsvb60pafqh0pucdjruvm2qe;
        this.RatingCompat = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.MediaBrowserCompatMediaItem = r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4;
    }

    private PendingIntent read() {
        String str = this.MediaSessionCompatQueueItem.read();
        Context context = this.write;
        return PendingIntent.getBroadcast(context, 123, new Intent(str, null, context, accesshandleSingleLocationUpdate.class), r8lambdaFCWpTejCW5kVaf7ggoc6ZelEIk.IconCompatParcelizer(134217728));
    }

    public final void IconCompatParcelizer(Intent intent) {
        this.MediaBrowserCompatMediaItem.read();
        this.serializer.RemoteActionCompatParcelizer(new handleSingleLocationUpdatelambda0(this, intent), "ActivityTransitionDetector");
    }

    public static r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM serializer(r8lambdagOO4V9ME2CU2X5ntv9kK0bIySLE r8lambdagoo4v9me2cu2x5ntv9kk0biysle, ActivityTransitionEvent activityTransitionEvent) {
        byte b;
        DetectedActivity detectedActivity = new DetectedActivity(activityTransitionEvent.getActivityType(), 100);
        long elapsedRealTimeNanos = activityTransitionEvent.getElapsedRealTimeNanos();
        switch (detectedActivity.getType()) {
            case 0:
                b = 1;
                break;
            case 1:
                b = 2;
                break;
            case 2:
                b = 3;
                break;
            case 3:
                b = 5;
                break;
            case 4:
                b = 7;
                break;
            case 5:
                b = 6;
                break;
            case 6:
            default:
                return null;
            case 7:
                b = 8;
                break;
            case 8:
                b = 4;
                break;
        }
        int iElapsedRealtime = (int) ((elapsedRealTimeNanos / 1000000) - SystemClock.elapsedRealtime());
        Date dateRemoteActionCompatParcelizer = com.sentiance.sdk.util.x.RemoteActionCompatParcelizer();
        Calendar calendar = Calendar.getInstance(java.util.Locale.US);
        calendar.setTime(dateRemoteActionCompatParcelizer);
        calendar.add(14, iElapsedRealtime);
        long time = calendar.getTime().getTime();
        r8lambdagoo4v9me2cu2x5ntv9kk0biysle.RatingCompat.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (time > jCurrentTimeMillis || time < jCurrentTimeMillis - 60000) {
            time = jCurrentTimeMillis;
        }
        r8lambdagoo4v9me2cu2x5ntv9kk0biysle.RemoteActionCompatParcelizer.getClass();
        r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM r8lambdaxdc9yg9rrx23qvlbekkfzieitwm = new r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM();
        r8lambdaxdc9yg9rrx23qvlbekkfzieitwm.serializer = Byte.valueOf(b);
        handleInAppMessageTestPush handleinappmessagetestpush = new handleInAppMessageTestPush(r8lambdaxdc9yg9rrx23qvlbekkfzieitwm);
        r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = getVerticalAccuracy.read(time);
        r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
        r8lambdaromdixahini0blcevvl7ehebhj0.MediaSessionCompatQueueItem = handleinappmessagetestpush;
        r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
        return r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm;
    }
}
