package o;

import android.content.BroadcastReceiver;
import android.os.Debug;
import android.os.SystemClock;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
final class requestSingleLocationUpdateFromGooglePlaylambda2 implements Runnable {
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI IconCompatParcelizer;
    private final getVerticalAccuracy MediaBrowserCompatMediaItem;
    private final getCooldownEnterSeconds MediaMetadataCompat;
    private final containsandroid_sdk_base_release MediaSessionCompatQueueItem;
    private final BroadcastReceiver.PendingResult RemoteActionCompatParcelizer;
    private final long read;
    private final configureFromServerConfiglambda1 serializer;
    private final removeGeofencesRegisteredWithGeofencingClientlambda22 write;

    public static void read(requestSingleLocationUpdateFromGooglePlaylambda2 requestsinglelocationupdatefromgoogleplaylambda2, long j) {
        requestsinglelocationupdatefromgoogleplaylambda2.MediaSessionCompatQueueItem.IconCompatParcelizer(requestsinglelocationupdatefromgoogleplaylambda2, j);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = removeGeofencesRegisteredWithGeofencingClientlambda22.read(this.RemoteActionCompatParcelizer);
        this.serializer.getClass();
        if (Debug.isDebuggerConnected() || !z) {
            return;
        }
        this.IconCompatParcelizer.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.read;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = this.write.read();
        this.MediaBrowserCompatMediaItem.getClass();
        HashMap map = new HashMap();
        map.put("receiver_name", str);
        map.put("wait_duration_ms", String.valueOf(jElapsedRealtime - j));
        this.MediaMetadataCompat.IconCompatParcelizer(getVerticalAccuracy.RemoteActionCompatParcelizer("receiver_timeout", (byte) 2, map, null, jCurrentTimeMillis));
    }

    public requestSingleLocationUpdateFromGooglePlaylambda2(r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, getVerticalAccuracy getverticalaccuracy, getCooldownEnterSeconds getcooldownenterseconds, removeGeofencesRegisteredWithGeofencingClientlambda22 removegeofencesregisteredwithgeofencingclientlambda22, BroadcastReceiver.PendingResult pendingResult, configureFromServerConfiglambda1 configurefromserverconfiglambda1, long j, containsandroid_sdk_base_release containsandroid_sdk_base_releaseVar) {
        this.MediaMetadataCompat = getcooldownenterseconds;
        this.MediaBrowserCompatMediaItem = getverticalaccuracy;
        this.IconCompatParcelizer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.write = removegeofencesregisteredwithgeofencingclientlambda22;
        this.RemoteActionCompatParcelizer = pendingResult;
        this.serializer = configurefromserverconfiglambda1;
        this.read = j;
        this.MediaSessionCompatQueueItem = containsandroid_sdk_base_releaseVar;
    }

    public static void read(requestSingleLocationUpdateFromGooglePlaylambda2 requestsinglelocationupdatefromgoogleplaylambda2) {
        requestsinglelocationupdatefromgoogleplaylambda2.MediaSessionCompatQueueItem.serializer(requestsinglelocationupdatefromgoogleplaylambda2);
    }
}
