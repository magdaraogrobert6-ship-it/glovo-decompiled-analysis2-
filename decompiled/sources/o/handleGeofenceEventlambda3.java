package o;

import android.app.AlarmManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.events.ControlMessage;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "alarm-manager", componentName = "AlarmManager")
public class handleGeofenceEventlambda3 implements removeGeofencesRegisteredWithGeofencingClientlambda2, r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    private final parseLonglambda0 IconCompatParcelizer;
    private final ServerConfigDataStoreProviderCompanion MediaBrowserCompatMediaItem;
    private final clearAllData MediaDescriptionCompat;
    private final getAnalyticsEnabledEnterannotations MediaMetadataCompat;
    private final r8lambdafxbJOrD4Rv7HbEvEIn3jpfsEg MediaSessionCompatQueueItem;
    private final r8lambdaJocufskx1EHAbLVY_Ok6AVQG08A MediaSessionCompatResultReceiverWrapper;
    private final getVerticalAccuracy PlaybackStateCompatCustomAction;
    private final PowerManager RatingCompat;
    private final readandroid_sdk_base_release RemoteActionCompatParcelizer;
    private final Context read;
    private final AlarmManager serializer;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI write;
    private final removeGeofencesRegisteredWithGeofencingClientlambda22 PlaybackStateCompat = new handleGeofenceEventlambda0(this);
    private final Runnable MediaSessionCompatToken = new BrazeInternalGeofenceApi(this);
    private final HashSet ParcelableVolumeInfo = new HashSet();

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return null;
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        return Collections.EMPTY_LIST;
    }

    public static void IconCompatParcelizer(handleGeofenceEventlambda3 handlegeofenceeventlambda3, getGeofenceTransitionPendingIntent getgeofencetransitionpendingintent) {
        getgeofencetransitionpendingintent.RemoteActionCompatParcelizer(handlegeofenceeventlambda3.read, handlegeofenceeventlambda3.serializer, handlegeofenceeventlambda3.IconCompatParcelizer);
        handlegeofenceeventlambda3.MediaSessionCompatResultReceiverWrapper.read(getgeofencetransitionpendingintent);
        handlegeofenceeventlambda3.write();
    }

    public static void MediaSessionCompatQueueItem(handleGeofenceEventlambda3 handlegeofenceeventlambda3) {
        handlegeofenceeventlambda3.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(handlegeofenceeventlambda3.PlaybackStateCompat, new IntentFilter("android.os.action.DEVICE_IDLE_MODE_CHANGED"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void write() {
        if (!this.ParcelableVolumeInfo.isEmpty()) {
            return;
        }
        Iterator it = this.MediaSessionCompatResultReceiverWrapper.write().iterator();
        long j = -1;
        while (true) {
            boolean zHasNext = it.hasNext();
            Runnable runnable = this.MediaSessionCompatToken;
            readandroid_sdk_base_release readandroid_sdk_base_releaseVar = this.RemoteActionCompatParcelizer;
            if (!zHasNext) {
                readandroid_sdk_base_releaseVar.IconCompatParcelizer(runnable);
                if (j > 0) {
                    readandroid_sdk_base_releaseVar.IconCompatParcelizer("AlarmManager", j, runnable);
                    return;
                }
                return;
            }
            getGeofenceTransitionPendingIntent getgeofencetransitionpendingintent = (getGeofenceTransitionPendingIntent) it.next();
            if (getgeofencetransitionpendingintent.IconCompatParcelizer() != null) {
                long j2 = getgeofencetransitionpendingintent.read(this.write);
                if (j2 <= 0) {
                    readandroid_sdk_base_releaseVar.IconCompatParcelizer(runnable);
                    readandroid_sdk_base_releaseVar.RemoteActionCompatParcelizer(runnable, "AlarmManager");
                    return;
                } else if (j == -1 || j2 < j) {
                    j = j2;
                }
            }
        }
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        this.MediaSessionCompatResultReceiverWrapper.read();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        this.MediaBrowserCompatMediaItem.serializer(this.PlaybackStateCompat);
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(this.MediaSessionCompatToken);
        r8lambdaJocufskx1EHAbLVY_Ok6AVQG08A r8lambdajocufskx1ehablvy_ok6avqg08a = this.MediaSessionCompatResultReceiverWrapper;
        for (getGeofenceTransitionPendingIntent getgeofencetransitionpendingintent : r8lambdajocufskx1ehablvy_ok6avqg08a.write()) {
            getgeofencetransitionpendingintent.RemoteActionCompatParcelizer(this.read, this.serializer, this.IconCompatParcelizer);
            r8lambdajocufskx1ehablvy_ok6avqg08a.read(getgeofencetransitionpendingintent);
        }
    }

    public final void serializer(byte b, long j) {
        HashSet hashSet;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.MediaSessionCompatResultReceiverWrapper.write().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            hashSet = this.ParcelableVolumeInfo;
            if (!zHasNext) {
                break;
            }
            getGeofenceTransitionPendingIntent getgeofencetransitionpendingintent = (getGeofenceTransitionPendingIntent) it.next();
            if (getgeofencetransitionpendingintent.read(this.write) <= 100 && !hashSet.contains(getgeofencetransitionpendingintent.IconCompatParcelizer())) {
                arrayList.add(getgeofencetransitionpendingintent.IconCompatParcelizer());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        hashSet.addAll(arrayList);
        this.PlaybackStateCompatCustomAction.getClass();
        r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws = new r8lambda1MNczrzuv4oWduWgKg6cjtSWs();
        r8lambda1mnczrzuv4owduwgkg6cjtsws.write = arrayList;
        r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer = Byte.valueOf(b);
        recordGeofenceTransition recordgeofencetransitionWrite = r8lambda1mnczrzuv4owduwgkg6cjtsws.write();
        r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
        r8lambdaromdixahini0blcevvl7ehebhj0.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = recordgeofencetransitionWrite;
        r8lambdaTURWeRtF3oTEvz1WenZeX5TdwA r8lambdaturwertf3otevz1wenzex5tdwaIconCompatParcelizer = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
        r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = getVerticalAccuracy.read(j);
        r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaturwertf3otevz1wenzex5tdwaIconCompatParcelizer;
        this.MediaMetadataCompat.serializer(r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm);
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        readandroid_sdk_base_release readandroid_sdk_base_releaseVar = this.RemoteActionCompatParcelizer;
        BrazeActionReceiveronReceive3 brazeActionReceiveronReceive3 = new BrazeActionReceiveronReceive3(this, readandroid_sdk_base_releaseVar);
        ControlMessage controlMessage = ControlMessage.ALARM_SCHEDULE;
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.MediaMetadataCompat;
        getanalyticsenabledenterannotations.read(controlMessage, brazeActionReceiveronReceive3);
        getanalyticsenabledenterannotations.read(ControlMessage.ALARM_CANCEL, brazeActionReceiveronReceive3);
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(addBannerViewMonitor.class, new C0207teardownGeofences(this, readandroid_sdk_base_releaseVar));
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(recordGeofenceTransition.class, new registerGeofences(this, readandroid_sdk_base_releaseVar));
    }

    public handleGeofenceEventlambda3(Context context, parseLonglambda0 parselonglambda0, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, AlarmManager alarmManager, PowerManager powerManager, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, com.sentiance.sdk.util.c cVar, ServerConfigDataStoreProviderCompanion serverConfigDataStoreProviderCompanion, clearAllData clearalldata, getVerticalAccuracy getverticalaccuracy, r8lambdafxbJOrD4Rv7HbEvEIn3jpfsEg r8lambdafxbjord4rv7hbevein3jpfseg) {
        this.read = context;
        this.IconCompatParcelizer = parselonglambda0;
        this.write = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.serializer = alarmManager;
        this.RemoteActionCompatParcelizer = readandroid_sdk_base_releaseVar;
        this.MediaBrowserCompatMediaItem = serverConfigDataStoreProviderCompanion;
        this.RatingCompat = powerManager;
        this.MediaMetadataCompat = getanalyticsenabledenterannotations;
        this.MediaDescriptionCompat = clearalldata;
        this.PlaybackStateCompatCustomAction = getverticalaccuracy;
        this.MediaSessionCompatQueueItem = r8lambdafxbjord4rv7hbevein3jpfseg;
        this.MediaSessionCompatResultReceiverWrapper = new r8lambdaJocufskx1EHAbLVY_Ok6AVQG08A(cVar, parselonglambda0, context);
        if (powerManager.isDeviceIdleMode()) {
            parselonglambda0.IconCompatParcelizer("Idle mode is active", new Object[0]);
        }
    }

    public final readandroid_sdk_base_release IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public static void write(handleGeofenceEventlambda3 handlegeofenceeventlambda3, getGeofenceTransitionPendingIntent getgeofencetransitionpendingintent) {
        getgeofencetransitionpendingintent.IconCompatParcelizer(handlegeofenceeventlambda3.read, handlegeofenceeventlambda3.serializer, handlegeofenceeventlambda3.write, handlegeofenceeventlambda3.MediaSessionCompatQueueItem, handlegeofenceeventlambda3.IconCompatParcelizer);
        handlegeofenceeventlambda3.MediaSessionCompatResultReceiverWrapper.write(getgeofencetransitionpendingintent);
        handlegeofenceeventlambda3.write();
    }

    public static void serializer(handleGeofenceEventlambda3 handlegeofenceeventlambda3, List list, long j) {
        parseLonglambda0 parselonglambda0 = handlegeofenceeventlambda3.IconCompatParcelizer;
        r8lambdaJocufskx1EHAbLVY_Ok6AVQG08A r8lambdajocufskx1ehablvy_ok6avqg08a = handlegeofenceeventlambda3.MediaSessionCompatResultReceiverWrapper;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            getGeofenceTransitionPendingIntent getgeofencetransitionpendingintentRemoteActionCompatParcelizer = r8lambdajocufskx1ehablvy_ok6avqg08a.RemoteActionCompatParcelizer(str);
            if (getgeofencetransitionpendingintentRemoteActionCompatParcelizer == null) {
                parselonglambda0.IconCompatParcelizer(ff$$ExternalSyntheticOutline0.m("Alarm with id: ", str, " not found"), new Object[0]);
            } else {
                parselonglambda0.IconCompatParcelizer("Triggering alarm: " + getgeofencetransitionpendingintentRemoteActionCompatParcelizer.IconCompatParcelizer() + " overdue by " + (-getgeofencetransitionpendingintentRemoteActionCompatParcelizer.read(handlegeofenceeventlambda3.write)) + " millis", new Object[0]);
                if (getgeofencetransitionpendingintentRemoteActionCompatParcelizer.read(handlegeofenceeventlambda3.read, handlegeofenceeventlambda3.IconCompatParcelizer, handlegeofenceeventlambda3.serializer, handlegeofenceeventlambda3.write, handlegeofenceeventlambda3.MediaDescriptionCompat, j, handlegeofenceeventlambda3.MediaSessionCompatQueueItem)) {
                    r8lambdajocufskx1ehablvy_ok6avqg08a.read(getgeofencetransitionpendingintentRemoteActionCompatParcelizer);
                }
            }
        }
        handlegeofenceeventlambda3.ParcelableVolumeInfo.removeAll(list);
    }
}
