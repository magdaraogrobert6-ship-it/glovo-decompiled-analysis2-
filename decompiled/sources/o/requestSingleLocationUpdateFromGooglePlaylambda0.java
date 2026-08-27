package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.sentiance.sdk.services.ServiceManager;
import com.sentiance.sdk.threading.executors.Executors;

/* JADX INFO: loaded from: classes3.dex */
final class requestSingleLocationUpdateFromGooglePlaylambda0 {
    private final Context IconCompatParcelizer;
    private final long MediaSessionCompatResultReceiverWrapper;
    private String MediaSessionCompatToken;
    private Intent ParcelableVolumeInfo;
    private final removeGeofencesRegisteredWithGeofencingClientlambda22 RemoteActionCompatParcelizer;
    private requestSingleLocationUpdateFromGooglePlaylambda2 r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    private final BroadcastReceiver.PendingResult r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    private final parseLonglambda0 write;
    private final clearAllData read = ((Executors) setPushUniqueId.read(Executors.class)).IconCompatParcelizer();
    private final containsandroid_sdk_base_release serializer = ((readList) setPushUniqueId.read(readList.class)).read();
    private final getVerticalAccuracy MediaDescriptionCompat = (getVerticalAccuracy) setPushUniqueId.read(getVerticalAccuracy.class);
    private final getCooldownEnterSeconds MediaMetadataCompat = (getCooldownEnterSeconds) setPushUniqueId.read(getCooldownEnterSeconds.class);
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI MediaBrowserCompatMediaItem = (r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI) setPushUniqueId.read(r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI.class);
    private final migrateSealedSessionsMapToJsonlambda20 RatingCompat = (migrateSealedSessionsMapToJsonlambda20) setPushUniqueId.read(migrateSealedSessionsMapToJsonlambda20.class);
    private final ServiceManager MediaSessionCompatQueueItem = (ServiceManager) setPushUniqueId.read(ServiceManager.class);
    private final getGeofenceRequestLocationannotations PlaybackStateCompatCustomAction = (getGeofenceRequestLocationannotations) setPushUniqueId.read(getGeofenceRequestLocationannotations.class);
    private final configureFromServerConfiglambda1 PlaybackStateCompat = (configureFromServerConfiglambda1) setPushUniqueId.read(configureFromServerConfiglambda1.class);

    public static void IconCompatParcelizer(requestSingleLocationUpdateFromGooglePlaylambda0 requestsinglelocationupdatefromgoogleplaylambda0, Intent intent) {
        removeGeofencesRegisteredWithGeofencingClientlambda22 removegeofencesregisteredwithgeofencingclientlambda22 = requestsinglelocationupdatefromgoogleplaylambda0.RemoteActionCompatParcelizer;
        requestsinglelocationupdatefromgoogleplaylambda0.ParcelableVolumeInfo = intent;
        requestsinglelocationupdatefromgoogleplaylambda0.write.serializer("Received intent %s", intent);
        Intent intent2 = requestsinglelocationupdatefromgoogleplaylambda0.ParcelableVolumeInfo;
        String stringExtra = intent2 != null ? intent2.getStringExtra("acquired-wakelock-tag") : null;
        requestsinglelocationupdatefromgoogleplaylambda0.MediaSessionCompatToken = stringExtra;
        if (stringExtra == null) {
            requestsinglelocationupdatefromgoogleplaylambda0.MediaSessionCompatToken = "BaseReceiver";
            requestsinglelocationupdatefromgoogleplaylambda0.RatingCompat.read(requestsinglelocationupdatefromgoogleplaylambda0.write(), "BaseReceiver");
        }
        BroadcastReceiver.PendingResult pendingResult = requestsinglelocationupdatefromgoogleplaylambda0.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (pendingResult != null) {
            requestSingleLocationUpdateFromGooglePlaylambda2 requestsinglelocationupdatefromgoogleplaylambda2 = new requestSingleLocationUpdateFromGooglePlaylambda2(requestsinglelocationupdatefromgoogleplaylambda0.MediaBrowserCompatMediaItem, requestsinglelocationupdatefromgoogleplaylambda0.MediaDescriptionCompat, requestsinglelocationupdatefromgoogleplaylambda0.MediaMetadataCompat, removegeofencesregisteredwithgeofencingclientlambda22, pendingResult, requestsinglelocationupdatefromgoogleplaylambda0.PlaybackStateCompat, requestsinglelocationupdatefromgoogleplaylambda0.MediaSessionCompatResultReceiverWrapper, requestsinglelocationupdatefromgoogleplaylambda0.serializer);
            requestsinglelocationupdatefromgoogleplaylambda0.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = requestsinglelocationupdatefromgoogleplaylambda2;
            requestSingleLocationUpdateFromGooglePlaylambda2.read(requestsinglelocationupdatefromgoogleplaylambda2, requestsinglelocationupdatefromgoogleplaylambda0.write());
        }
        String name = removegeofencesregisteredwithgeofencingclientlambda22.getClass().getName();
        clearandroid_sdk_base_release clearandroid_sdk_base_releaseVarSerializer = removegeofencesregisteredwithgeofencingclientlambda22.serializer();
        if (clearandroid_sdk_base_releaseVarSerializer == null) {
            clearandroid_sdk_base_releaseVarSerializer = requestsinglelocationupdatefromgoogleplaylambda0.read;
        }
        clearandroid_sdk_base_releaseVarSerializer.RemoteActionCompatParcelizer(new removeGeofencesRegisteredWithGeofencingClientlambda25(0, requestsinglelocationupdatefromgoogleplaylambda0), name);
    }

    public static void RemoteActionCompatParcelizer(requestSingleLocationUpdateFromGooglePlaylambda0 requestsinglelocationupdatefromgoogleplaylambda0) {
        Intent intent;
        parseLonglambda0 parselonglambda0 = requestsinglelocationupdatefromgoogleplaylambda0.write;
        removeGeofencesRegisteredWithGeofencingClientlambda22 removegeofencesregisteredwithgeofencingclientlambda22 = requestsinglelocationupdatefromgoogleplaylambda0.RemoteActionCompatParcelizer;
        requestsinglelocationupdatefromgoogleplaylambda0.PlaybackStateCompatCustomAction.getClass();
        if (Build.VERSION.SDK_INT >= 31 && (intent = requestsinglelocationupdatefromgoogleplaylambda0.ParcelableVolumeInfo) != null && removegeofencesregisteredwithgeofencingclientlambda22.read(intent)) {
            parselonglambda0.IconCompatParcelizer("ForegroundServiceStartPermittingEvent: ".concat(removegeofencesregisteredwithgeofencingclientlambda22.read()), new Object[0]);
            requestsinglelocationupdatefromgoogleplaylambda0.MediaSessionCompatQueueItem.write();
        }
        Intent intent2 = requestsinglelocationupdatefromgoogleplaylambda0.ParcelableVolumeInfo;
        if (intent2 != null) {
            removegeofencesregisteredwithgeofencingclientlambda22.write(requestsinglelocationupdatefromgoogleplaylambda0.IconCompatParcelizer, intent2);
        }
        if (requestsinglelocationupdatefromgoogleplaylambda0.write() <= 0) {
            requestsinglelocationupdatefromgoogleplaylambda0.MediaBrowserCompatMediaItem.getClass();
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m(SystemClock.elapsedRealtime() - requestsinglelocationupdatefromgoogleplaylambda0.MediaSessionCompatResultReceiverWrapper, "Processing the broadcast intent took ", " ms (");
            sbM.append(removegeofencesregisteredwithgeofencingclientlambda22.read());
            sbM.append(")");
            parselonglambda0.RemoteActionCompatParcelizer(sbM.toString(), new Object[0]);
        }
        requestSingleLocationUpdateFromGooglePlaylambda2 requestsinglelocationupdatefromgoogleplaylambda2 = requestsinglelocationupdatefromgoogleplaylambda0.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (requestsinglelocationupdatefromgoogleplaylambda2 != null) {
            requestSingleLocationUpdateFromGooglePlaylambda2.read(requestsinglelocationupdatefromgoogleplaylambda2);
        }
        BroadcastReceiver.PendingResult pendingResult = requestsinglelocationupdatefromgoogleplaylambda0.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (pendingResult != null) {
            removeGeofencesRegisteredWithGeofencingClientlambda22.read(pendingResult);
        }
        String str = requestsinglelocationupdatefromgoogleplaylambda0.MediaSessionCompatToken;
        if (str != null) {
            requestsinglelocationupdatefromgoogleplaylambda0.RatingCompat.write(str);
        }
    }

    private long write() {
        long jRemoteActionCompatParcelizer = removeGeofencesRegisteredWithGeofencingClientlambda22.RemoteActionCompatParcelizer(this.ParcelableVolumeInfo);
        ((r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI) setPushUniqueId.read(r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI.class)).getClass();
        return Math.max(0L, jRemoteActionCompatParcelizer - (SystemClock.elapsedRealtime() - this.MediaSessionCompatResultReceiverWrapper));
    }

    public requestSingleLocationUpdateFromGooglePlaylambda0(long j, Context context, removeGeofencesRegisteredWithGeofencingClientlambda22 removegeofencesregisteredwithgeofencingclientlambda22) {
        this.RemoteActionCompatParcelizer = removegeofencesregisteredwithgeofencingclientlambda22;
        this.write = removegeofencesregisteredwithgeofencingclientlambda22.RemoteActionCompatParcelizer(context);
        this.IconCompatParcelizer = context.getApplicationContext();
        this.MediaSessionCompatResultReceiverWrapper = j;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = removegeofencesregisteredwithgeofencingclientlambda22.write;
    }
}
