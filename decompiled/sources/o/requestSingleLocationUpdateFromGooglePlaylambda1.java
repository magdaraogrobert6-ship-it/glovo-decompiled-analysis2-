package o;

import android.content.Context;
import android.os.Debug;
import android.os.SystemClock;
import com.sentiance.sdk.Sentiance;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
final class requestSingleLocationUpdateFromGooglePlaylambda1 implements Runnable {
    final /* synthetic */ removeGeofencesRegisteredWithGeofencingClientlambda24 IconCompatParcelizer;
    final /* synthetic */ removeGeofencesRegisteredWithGeofencingClientlambda22 MediaSessionCompatQueueItem;
    final /* synthetic */ Context RemoteActionCompatParcelizer;
    final /* synthetic */ long read;
    final /* synthetic */ requestSingleLocationUpdateFromGooglePlay serializer;
    final /* synthetic */ long write;

    public requestSingleLocationUpdateFromGooglePlaylambda1(removeGeofencesRegisteredWithGeofencingClientlambda22 removegeofencesregisteredwithgeofencingclientlambda22, requestSingleLocationUpdateFromGooglePlay requestsinglelocationupdatefromgoogleplay, Context context, long j, long j2, removeGeofencesRegisteredWithGeofencingClientlambda24 removegeofencesregisteredwithgeofencingclientlambda24) {
        this.MediaSessionCompatQueueItem = removegeofencesregisteredwithgeofencingclientlambda22;
        this.serializer = requestsinglelocationupdatefromgoogleplay;
        this.RemoteActionCompatParcelizer = context;
        this.write = j;
        this.read = j2;
        this.IconCompatParcelizer = removegeofencesregisteredwithgeofencingclientlambda24;
    }

    @Override // java.lang.Runnable
    public final void run() {
        setNewlyReceivedPushStory setnewlyreceivedpushstory = setNotificationBadgeNumber.read();
        boolean zMediaSessionCompatQueueItem = setnewlyreceivedpushstory.MediaSessionCompatQueueItem();
        requestSingleLocationUpdateFromGooglePlay requestsinglelocationupdatefromgoogleplay = this.serializer;
        removeGeofencesRegisteredWithGeofencingClientlambda22 removegeofencesregisteredwithgeofencingclientlambda22 = this.MediaSessionCompatQueueItem;
        if (zMediaSessionCompatQueueItem) {
            removeGeofencesRegisteredWithGeofencingClientlambda22.write(removegeofencesregisteredwithgeofencingclientlambda22, requestsinglelocationupdatefromgoogleplay);
            if (removegeofencesregisteredwithgeofencingclientlambda22.write != null) {
                removeGeofencesRegisteredWithGeofencingClientlambda22.read(removegeofencesregisteredwithgeofencingclientlambda22.write);
                return;
            }
            return;
        }
        if (!Sentiance.getInstance(this.RemoteActionCompatParcelizer).userExists()) {
            if (removegeofencesregisteredwithgeofencingclientlambda22.write != null) {
                removeGeofencesRegisteredWithGeofencingClientlambda22.read(removegeofencesregisteredwithgeofencingclientlambda22.write);
            }
        } else {
            if (SystemClock.elapsedRealtime() <= this.write) {
                if (!setnewlyreceivedpushstory.write()) {
                    removeGeofencesRegisteredWithGeofencingClientlambda22.IconCompatParcelizer.IconCompatParcelizer(this, 100L);
                    return;
                } else {
                    this.IconCompatParcelizer.run();
                    removeGeofencesRegisteredWithGeofencingClientlambda22.write(removegeofencesregisteredwithgeofencingclientlambda22, requestsinglelocationupdatefromgoogleplay);
                    return;
                }
            }
            int i = removeGeofencesRegisteredWithGeofencingClientlambda22.serializer;
            Context context = this.RemoteActionCompatParcelizer;
            new configureFromServerConfiglambda1(context);
            if (Debug.isDebuggerConnected()) {
                return;
            }
            setPublicNotificationExtras.serializer(context, new Date().getTime(), removegeofencesregisteredwithgeofencingclientlambda22.read(), SystemClock.elapsedRealtime() - this.read);
        }
    }
}
