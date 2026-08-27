package o;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.events.controlmessageextras.StartLocationFixRequest$Purpose;
import com.sentiance.sdk.processguard.Guard$Type;
import com.sentiance.sdk.services.ServiceForegroundMode;
import com.sentiance.sdk.services.ServiceManager;
import com.sentiance.sdk.util.Optional;
import io.sentry.Scopes$$ExternalSyntheticLambda0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "LocationManager", componentName = "LocationManager", guardType = Guard$Type.REFERENCE_COUNTED, memCacheName = "LocationManager")
public class setActionId implements removeGeofencesRegisteredWithGeofencingClientlambda2, r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    private final ServiceManager ComponentActivity;
    private final parseLonglambda0 MediaSessionCompatResultReceiverWrapper;
    private final Context MediaSessionCompatToken;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI ParcelableVolumeInfo;
    private final getAnalyticsEnabledEnterannotations PlaybackStateCompat;
    private final readandroid_sdk_base_release PlaybackStateCompatCustomAction;
    private boolean RatingCompat;
    private final getDismissalTimeMs ResultReceiver;
    private final migratePushDeliveryEventsToJsonlambda10 r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    private final r8lambdaLvr3MS6iW1pdnAwN92rvcuKzrSY r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    private final getVerticalAccuracy r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    private final ServerConfigDataStoreProviderCompanion r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    private final ConfigurationManager r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    private final setActionIndex r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    private final r8lambdaDBJWSFHsw7gXkH7KhW96aQd16aU r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    private final r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    private final isGeofencesEnabledFromEnvironmentlambda1 r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    private final clearAllData r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    private final com.sentiance.sdk.util.c r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    private boolean read;
    private Integer serializer = null;
    private long IconCompatParcelizer = -1;
    private ServiceForegroundMode RemoteActionCompatParcelizer = ServiceForegroundMode.O_ONLY;
    private long MediaMetadataCompat = -1;
    private boolean MediaSessionCompatQueueItem = false;
    private final Runnable MediaDescriptionCompat = new putIntoBundle(this, 0);
    private final Runnable MediaBrowserCompatMediaItem = new putIntoBundle(this, 1);
    private final HashMap<String, r8lambdaQhqZpxPfyF_Skw25Fw_j7F1Lxn0> write = new HashMap<>();

    private boolean MediaBrowserCompatMediaItem() {
        synchronized (this) {
            Iterator<r8lambdaQhqZpxPfyF_Skw25Fw_j7F1Lxn0> it = this.write.values().iterator();
            while (it.hasNext()) {
                if (it.next().MediaDescriptionCompat()) {
                    return true;
                }
            }
            return false;
        }
    }

    private boolean MediaDescriptionCompat() {
        return (IconCompatParcelizer(false) == this.IconCompatParcelizer && RemoteActionCompatParcelizer() == this.RemoteActionCompatParcelizer && this.RatingCompat == MediaBrowserCompatMediaItem()) ? false : true;
    }

    private void MediaSessionCompatQueueItem() {
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            for (r8lambdaQhqZpxPfyF_Skw25Fw_j7F1Lxn0 r8lambdaqhqzpxpfyf_skw25fw_j7f1lxn0 : this.write.values()) {
                if (r8lambdaqhqzpxpfyf_skw25fw_j7f1lxn0.write() == 2) {
                    arrayList.add(r8lambdaqhqzpxpfyf_skw25fw_j7f1lxn0.read());
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                serializer((String) it.next());
            }
        }
    }

    private ServiceForegroundMode RemoteActionCompatParcelizer() {
        synchronized (this) {
            ServiceForegroundMode serviceForegroundMode = ServiceForegroundMode.O_ONLY;
            Iterator<r8lambdaQhqZpxPfyF_Skw25Fw_j7F1Lxn0> it = this.write.values().iterator();
            while (it.hasNext()) {
                ServiceForegroundMode serviceForegroundModeRemoteActionCompatParcelizer = it.next().RemoteActionCompatParcelizer();
                ServiceForegroundMode serviceForegroundMode2 = ServiceForegroundMode.ENABLED;
                if (serviceForegroundModeRemoteActionCompatParcelizer == serviceForegroundMode2) {
                    return serviceForegroundMode2;
                }
            }
            return serviceForegroundMode;
        }
    }

    public static void read(setActionId setactionid) {
        synchronized (setactionid) {
            if (setactionid.IconCompatParcelizer > 0 && setactionid.read) {
                setactionid.RatingCompat();
            }
            if (setactionid.serializer != null) {
                setactionid.PlaybackStateCompatCustomAction.IconCompatParcelizer(setactionid.MediaBrowserCompatMediaItem);
                setactionid.PlaybackStateCompatCustomAction.IconCompatParcelizer("LocationRequestExpiry", setactionid.serializer(), setactionid.MediaBrowserCompatMediaItem);
                setactionid.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer("Request %d is already underway", setactionid.serializer);
                setactionid.ParcelableVolumeInfo.getClass();
                if (System.currentTimeMillis() - setactionid.MediaMetadataCompat < DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) {
                    return;
                }
                setactionid.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer("Existing request took too long. Forcing a new request.", new Object[0]);
                synchronized (setactionid) {
                    setactionid.read();
                }
            }
            setactionid.MediaMetadataCompat();
        }
    }

    private void serializer(String str) {
        synchronized (this) {
            r8lambdaQhqZpxPfyF_Skw25Fw_j7F1Lxn0 r8lambdaqhqzpxpfyf_skw25fw_j7f1lxn0Remove = this.write.remove(str);
            if (r8lambdaqhqzpxpfyf_skw25fw_j7f1lxn0Remove == null) {
                return;
            }
            if (r8lambdaqhqzpxpfyf_skw25fw_j7f1lxn0Remove.MediaDescriptionCompat()) {
                this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.IconCompatParcelizer();
                this.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer("Guard stopped", new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void write(Location location) {
        synchronized (this) {
            if (!getDEFAULT_PUSH_DELIVERY_MIN_FLUSHandroid_sdk_base_releaseannotations.IconCompatParcelizer(location)) {
                this.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer("Invalid location with lat %f and lon %f", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                return;
            }
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read("inaccurateLocation", location);
            if (this.MediaSessionCompatQueueItem) {
                read();
            } else {
                this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.getClass();
                if (location.getAccuracy() < 75.0f) {
                    this.PlaybackStateCompatCustomAction.IconCompatParcelizer(this.MediaBrowserCompatMediaItem);
                    read();
                }
            }
        }
    }

    private void write(boolean z) {
        synchronized (this) {
            if (this.read) {
                if (this.write.isEmpty() || z) {
                    if (this.serializer != null) {
                        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.IconCompatParcelizer();
                    }
                    this.serializer = null;
                    this.read = false;
                    this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write(write());
                    this.IconCompatParcelizer = -1L;
                    this.MediaMetadataCompat = -1L;
                    this.MediaSessionCompatQueueItem = false;
                    this.PlaybackStateCompatCustomAction.IconCompatParcelizer(this.MediaBrowserCompatMediaItem);
                    this.PlaybackStateCompatCustomAction.IconCompatParcelizer(this.MediaDescriptionCompat);
                    this.PlaybackStateCompat.IconCompatParcelizer(ControlMessage.ALARM_CANCEL, IconCompatParcelizer());
                    this.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer("Stopping service, current foreground mode = %s", this.RemoteActionCompatParcelizer.name());
                    synchronized (this) {
                        ServiceForegroundMode serviceForegroundMode = ServiceForegroundMode.ENABLED;
                        this.ComponentActivity.write("LocationManager");
                    }
                } else if (this.MediaSessionCompatQueueItem && (!MediaSessionCompatToken() || this.IconCompatParcelizer != IconCompatParcelizer(false))) {
                    write(true);
                    serializer(false);
                }
            }
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return null;
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        return Collections.EMPTY_LIST;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        synchronized (this) {
            synchronized (this) {
                Iterator it = new ArrayList(this.write.keySet()).iterator();
                while (it.hasNext()) {
                    serializer((String) it.next());
                }
            }
        }
        write(true);
    }

    public setActionId(Context context, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, parseLonglambda0 parselonglambda0, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, getVerticalAccuracy getverticalaccuracy, migratePushDeliveryEventsToJsonlambda10 migratepushdeliveryeventstojsonlambda10, getDismissalTimeMs getdismissaltimems, ServiceManager serviceManager, r8lambdaLvr3MS6iW1pdnAwN92rvcuKzrSY r8lambdalvr3ms6iw1pdnawn92rvcukzrsy, setActionIndex setactionindex, ConfigurationManager configurationManager, ServerConfigDataStoreProviderCompanion serverConfigDataStoreProviderCompanion, r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4, isGeofencesEnabledFromEnvironmentlambda1 isgeofencesenabledfromenvironmentlambda1, clearAllData clearalldata, com.sentiance.sdk.util.c cVar) {
        this.MediaSessionCompatToken = context;
        this.PlaybackStateCompat = getanalyticsenabledenterannotations;
        this.PlaybackStateCompatCustomAction = readandroid_sdk_base_releaseVar;
        this.MediaSessionCompatResultReceiverWrapper = parselonglambda0;
        this.ParcelableVolumeInfo = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = getverticalaccuracy;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = migratepushdeliveryeventstojsonlambda10;
        this.ResultReceiver = getdismissaltimems;
        this.ComponentActivity = serviceManager;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = r8lambdalvr3ms6iw1pdnawn92rvcukzrsy;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = setactionindex;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = configurationManager;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = serverConfigDataStoreProviderCompanion;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new r8lambdaDBJWSFHsw7gXkH7KhW96aQd16aU(this, r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4);
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = isgeofencesenabledfromenvironmentlambda1;
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = clearalldata;
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = cVar;
    }

    private getGeofenceTransitionPendingIntent IconCompatParcelizer() {
        getGeofenceTransitionPendingIntent.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new getGeofenceTransitionPendingIntent.RemoteActionCompatParcelizer("LocationUpdates", this.MediaSessionCompatToken);
        remoteActionCompatParcelizer.IconCompatParcelizer(this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4);
        remoteActionCompatParcelizer.read(this.IconCompatParcelizer);
        remoteActionCompatParcelizer.RemoteActionCompatParcelizer(true);
        return remoteActionCompatParcelizer.write();
    }

    private boolean MediaSessionCompatToken() {
        if (this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.onBackPressedDispatcher_delegatelambda0() != null) {
            return false;
        }
        for (r8lambdaQhqZpxPfyF_Skw25Fw_j7F1Lxn0 r8lambdaqhqzpxpfyf_skw25fw_j7f1lxn0 : this.write.values()) {
            if (r8lambdaqhqzpxpfyf_skw25fw_j7f1lxn0.serializer() <= DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM && r8lambdaqhqzpxpfyf_skw25fw_j7f1lxn0.write() == 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00ad A[Catch: all -> 0x0124, TryCatch #0 {, blocks: (B:5:0x0004, B:6:0x000d, B:8:0x0035, B:31:0x00d5, B:33:0x00f4, B:37:0x00ff, B:39:0x0105, B:41:0x0109, B:42:0x0111, B:43:0x011f, B:9:0x0048, B:11:0x0050, B:12:0x006a, B:14:0x0070, B:16:0x0076, B:18:0x008d, B:19:0x00ad, B:21:0x00b3, B:23:0x00b9, B:26:0x00c4, B:28:0x00c8), top: B:49:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00c8 A[Catch: all -> 0x0124, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0004, B:6:0x000d, B:8:0x0035, B:31:0x00d5, B:33:0x00f4, B:37:0x00ff, B:39:0x0105, B:41:0x0109, B:42:0x0111, B:43:0x011f, B:9:0x0048, B:11:0x0050, B:12:0x006a, B:14:0x0070, B:16:0x0076, B:18:0x008d, B:19:0x00ad, B:21:0x00b3, B:23:0x00b9, B:26:0x00c4, B:28:0x00c8), top: B:49:0x0004 }] */
    private void serializer(boolean z) {
        Integer num;
        synchronized (this) {
            if (z) {
                this.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer("Request is immediate", new Object[0]);
            }
            this.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer("Current config is: interval %s, fgMode %s, stayAwake %s", Long.valueOf(this.IconCompatParcelizer), this.RemoteActionCompatParcelizer.name(), Boolean.valueOf(this.RatingCompat));
            if (!this.read) {
                this.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer("Starting with interval %d ms", Long.valueOf(this.IconCompatParcelizer));
            } else if (this.MediaSessionCompatQueueItem != MediaSessionCompatToken()) {
                this.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer("Changing continuous location mode=" + MediaSessionCompatToken(), new Object[0]);
            } else if (!this.MediaSessionCompatQueueItem) {
                if (this.MediaMetadataCompat != -1) {
                    this.ParcelableVolumeInfo.getClass();
                    if (System.currentTimeMillis() - this.MediaMetadataCompat <= this.IconCompatParcelizer + serializer()) {
                        if (this.IconCompatParcelizer == -1) {
                        }
                        num = this.serializer;
                        if (num != null) {
                            this.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer("A request (%d) is already underway.", num);
                            return;
                        }
                    }
                }
                this.ParcelableVolumeInfo.getClass();
                this.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer("It's been too long (%d secs) since the last request.", Long.valueOf((System.currentTimeMillis() / 1000) - (this.MediaMetadataCompat / 1000)));
            } else {
                if (this.IconCompatParcelizer == -1 && !MediaDescriptionCompat()) {
                    this.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer("New request does not require restarting the manager", new Object[0]);
                    return;
                }
                num = this.serializer;
                if (num != null) {
                    this.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer("A request (%d) is already underway.", num);
                    return;
                }
            }
            write(true);
            this.IconCompatParcelizer = IconCompatParcelizer(false);
            this.RemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            this.RatingCompat = MediaBrowserCompatMediaItem();
            boolean zMediaSessionCompatToken = MediaSessionCompatToken();
            this.MediaSessionCompatQueueItem = zMediaSessionCompatToken;
            this.read = true;
            boolean z2 = z || this.IconCompatParcelizer == 0;
            if (zMediaSessionCompatToken) {
                MediaMetadataCompat();
            } else if (!z2) {
                RatingCompat();
            } else if (this.RatingCompat) {
                ((putIntoBundle) this.MediaDescriptionCompat).run();
            } else {
                r8lambdaDBJWSFHsw7gXkH7KhW96aQd16aU r8lambdadbjwsfhsw7gxkh7khw96aqd16au = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                this.ParcelableVolumeInfo.getClass();
                System.currentTimeMillis();
                r8lambdadbjwsfhsw7gxkh7khw96aqd16au.write();
            }
        }
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.read();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        readandroid_sdk_base_release readandroid_sdk_base_releaseVar = this.PlaybackStateCompatCustomAction;
        C0202setUseWebview c0202setUseWebview = new C0202setUseWebview(this, readandroid_sdk_base_releaseVar, 1);
        ControlMessage controlMessage = ControlMessage.LOCATION_FIX_START;
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.PlaybackStateCompat;
        getanalyticsenabledenterannotations.read(controlMessage, c0202setUseWebview);
        getanalyticsenabledenterannotations.read(ControlMessage.LOCATION_FIX_STOP, c0202setUseWebview);
        getanalyticsenabledenterannotations.read(ControlMessage.GET_LAST_KNOWN_LOCATION, new C0202setUseWebview(this, readandroid_sdk_base_releaseVar, 0));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0103  */
    /* JADX WARN: Code duplicated, block: B:24:0x010c  */
    /* JADX WARN: Code duplicated, block: B:25:0x010e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0128  */
    /* JADX WARN: Code duplicated, block: B:32:0x0134  */
    private void MediaMetadataCompat() {
        boolean z;
        parseLonglambda0 parselonglambda0;
        long jIconCompatParcelizer;
        if (!this.read) {
            this.MediaSessionCompatResultReceiverWrapper.write("Not started: not requesting location update", new Object[0]);
            return;
        }
        this.ParcelableVolumeInfo.getClass();
        this.MediaMetadataCompat = System.currentTimeMillis();
        Integer numValueOf = Integer.valueOf(this.ResultReceiver.serializer());
        this.serializer = numValueOf;
        this.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer("Requesting location update with request code %d", numValueOf);
        if (!this.MediaSessionCompatQueueItem) {
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.read();
        }
        if (this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.onBackPressedDispatcher_delegatelambda0() != null) {
            setHomeCitylambda1 sethomecitylambda1OnBackPressedDispatcher_delegatelambda0 = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.onBackPressedDispatcher_delegatelambda0();
            Location location = new Location("gps");
            location.setLatitude(((double) sethomecitylambda1OnBackPressedDispatcher_delegatelambda0.RemoteActionCompatParcelizer.intValue()) / 100000.0d);
            location.setLongitude(((double) sethomecitylambda1OnBackPressedDispatcher_delegatelambda0.write.intValue()) / 100000.0d);
            double dMin = Math.min(Math.max((((double) (new Random().nextInt(19) - 9)) * 1.0E-5d) + location.getLatitude(), -90.0d), 90.0d);
            double dMin2 = Math.min(Math.max((((double) (new Random().nextInt(19) - 9)) * 1.0E-5d) + location.getLongitude(), -180.0d), 180.0d);
            location.setLatitude(dMin);
            location.setLongitude(dMin2);
            this.ParcelableVolumeInfo.getClass();
            location.setTime(System.currentTimeMillis());
            location.setAccuracy(1.0f);
            this.PlaybackStateCompatCustomAction.IconCompatParcelizer("LocationRequestExpiry", 1000L, this.MediaBrowserCompatMediaItem);
            write(location);
            return;
        }
        synchronized (this) {
            this.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer("Starting service, current foreground mode = %s", this.RemoteActionCompatParcelizer.name());
            synchronized (this) {
                ServiceForegroundMode serviceForegroundMode = ServiceForegroundMode.ENABLED;
            }
            z = this.MediaSessionCompatQueueItem;
            parselonglambda0 = this.MediaSessionCompatResultReceiverWrapper;
            if (z) {
                parselonglambda0.IconCompatParcelizer("Request will expire in %d ms", Long.valueOf(serializer()));
                this.PlaybackStateCompatCustomAction.IconCompatParcelizer("LocationRequestExpiry", serializer(), this.MediaBrowserCompatMediaItem);
                this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.read(serializer(), write());
            } else {
                if (this.IconCompatParcelizer == 0) {
                    jIconCompatParcelizer = 1000;
                } else {
                    jIconCompatParcelizer = IconCompatParcelizer(true);
                }
                parselonglambda0.IconCompatParcelizer("Continuous location mode with interval %d ms", Long.valueOf(jIconCompatParcelizer));
                this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write(this.IconCompatParcelizer != 0 ? IconCompatParcelizer(true) : 1000L, write());
            }
        }
        this.ComponentActivity.read("LocationManager");
        z = this.MediaSessionCompatQueueItem;
        parselonglambda0 = this.MediaSessionCompatResultReceiverWrapper;
        if (z) {
            parselonglambda0.IconCompatParcelizer("Request will expire in %d ms", Long.valueOf(serializer()));
            this.PlaybackStateCompatCustomAction.IconCompatParcelizer("LocationRequestExpiry", serializer(), this.MediaBrowserCompatMediaItem);
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.read(serializer(), write());
        } else {
            if (this.IconCompatParcelizer == 0) {
                jIconCompatParcelizer = 1000;
            } else {
                jIconCompatParcelizer = IconCompatParcelizer(true);
            }
            parselonglambda0.IconCompatParcelizer("Continuous location mode with interval %d ms", Long.valueOf(jIconCompatParcelizer));
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write(this.IconCompatParcelizer != 0 ? IconCompatParcelizer(true) : 1000L, write());
        }
    }

    private void RatingCompat() {
        if (!this.RatingCompat) {
            this.PlaybackStateCompat.IconCompatParcelizer(ControlMessage.ALARM_SCHEDULE, IconCompatParcelizer());
        } else {
            readandroid_sdk_base_release readandroid_sdk_base_releaseVar = this.PlaybackStateCompatCustomAction;
            Runnable runnable = this.MediaDescriptionCompat;
            readandroid_sdk_base_releaseVar.IconCompatParcelizer(runnable);
            readandroid_sdk_base_releaseVar.IconCompatParcelizer("LocationRequest", this.IconCompatParcelizer, runnable);
        }
    }

    private PendingIntent write() {
        Context context = this.MediaSessionCompatToken;
        Intent intent = new Intent(context, (Class<?>) setUri.class);
        intent.setAction(this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.read());
        return PendingIntent.getBroadcast(context, 0, intent, r8lambdaFCWpTejCW5kVaf7ggoc6ZelEIk.IconCompatParcelizer(0));
    }

    public static void read(setActionId setactionid, Long l) {
        Location location = setactionid.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.read(l == null ? 60000L : l.longValue());
        if (location != null && !getDEFAULT_PUSH_DELIVERY_MIN_FLUSHandroid_sdk_base_releaseannotations.IconCompatParcelizer(location)) {
            location = null;
        }
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = setactionid.PlaybackStateCompat;
        if (location != null) {
            getanalyticsenabledenterannotations.IconCompatParcelizer(ControlMessage.LAST_KNOWN_LOCATION_RESPONSE, location);
        } else {
            getanalyticsenabledenterannotations.IconCompatParcelizer(ControlMessage.LAST_KNOWN_LOCATION_RESPONSE, (Object) null);
        }
        setactionid.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.IconCompatParcelizer();
    }

    private long serializer() {
        long j = this.IconCompatParcelizer;
        return j > 0 ? Math.min(j + 1000, DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) : DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM;
    }

    public static Long RemoteActionCompatParcelizer(setActionId setactionid) {
        long jIconCompatParcelizer = setactionid.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.IconCompatParcelizer("last_location_timestamp", -1L);
        if (jIconCompatParcelizer == -1) {
            return null;
        }
        return Long.valueOf(jIconCompatParcelizer);
    }

    public static void write(setActionId setactionid) {
        synchronized (setactionid) {
            setactionid.read();
        }
    }

    public static void RemoteActionCompatParcelizer(setActionId setactionid, r8lambdaQhqZpxPfyF_Skw25Fw_j7F1Lxn0 r8lambdaqhqzpxpfyf_skw25fw_j7f1lxn0) {
        synchronized (setactionid) {
            isGeofencesEnabledFromEnvironmentlambda1 isgeofencesenabledfromenvironmentlambda1 = setactionid.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
            boolean zMediaBrowserCompatMediaItem = isgeofencesenabledfromenvironmentlambda1.MediaBrowserCompatMediaItem();
            boolean zMediaMetadataCompat = isgeofencesenabledfromenvironmentlambda1.MediaMetadataCompat();
            if ((r8lambdaqhqzpxpfyf_skw25fw_j7f1lxn0.IconCompatParcelizer() == StartLocationFixRequest$Purpose.DETECTIONS && zMediaBrowserCompatMediaItem) || zMediaMetadataCompat) {
                setactionid.RemoteActionCompatParcelizer(r8lambdaqhqzpxpfyf_skw25fw_j7f1lxn0);
                setactionid.serializer(r8lambdaqhqzpxpfyf_skw25fw_j7f1lxn0.RatingCompat());
            } else {
                setactionid.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer("Request from %s denied because the device location is not accessible", r8lambdaqhqzpxpfyf_skw25fw_j7f1lxn0.read());
            }
        }
    }

    public static void RemoteActionCompatParcelizer(setActionId setactionid, getDismissalTimeMsannotations getdismissaltimemsannotations) {
        synchronized (setactionid) {
            setactionid.serializer(getdismissaltimemsannotations.write());
            setactionid.write(false);
        }
    }

    public final void IconCompatParcelizer(Location location, Boolean bool) {
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.read();
        this.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer(new RunnableC0171getUseWebview(this, location, bool), "LocationReceived");
    }

    public static void serializer(setActionId setactionid, long j) {
        setactionid.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.read(j, "last_location_timestamp");
    }

    public static boolean IconCompatParcelizer(setActionId setactionid, long j, Long l) {
        parseLonglambda0 parselonglambda0 = setactionid.MediaSessionCompatResultReceiverWrapper;
        setactionid.ParcelableVolumeInfo.getClass();
        if (System.currentTimeMillis() - j > 180000) {
            parselonglambda0.RemoteActionCompatParcelizer("Location arrived with very old timestamp: %s", com.sentiance.sdk.util.x.c(j));
            return true;
        }
        if (l == null || j != l.longValue()) {
            return false;
        }
        parselonglambda0.RemoteActionCompatParcelizer("Location arrived same timestamp: %s", com.sentiance.sdk.util.x.c(j));
        return true;
    }

    public static void serializer(setActionId setactionid, Location location) {
        parseLonglambda0 parselonglambda0 = setactionid.MediaSessionCompatResultReceiverWrapper;
        long time = location.getTime();
        setactionid.ParcelableVolumeInfo.getClass();
        if (time > System.currentTimeMillis()) {
            parselonglambda0.write("Location is in the future (%s)", com.sentiance.sdk.util.x.c(location.getTime()));
            location.setTime(System.currentTimeMillis());
        } else if (location.getTime() < System.currentTimeMillis() - DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) {
            parselonglambda0.write("Location is in the past (%s)", com.sentiance.sdk.util.x.c(location.getTime()));
            location.setTime(System.currentTimeMillis());
        }
    }

    public static void read(setActionId setactionid, Boolean bool) {
        if (bool == null || bool.booleanValue()) {
            return;
        }
        setactionid.PlaybackStateCompat.IconCompatParcelizer(ControlMessage.OTG_CHECK, (Object) null);
    }

    private long IconCompatParcelizer(boolean z) {
        long jSerializer;
        synchronized (this) {
            jSerializer = -1;
            for (r8lambdaQhqZpxPfyF_Skw25Fw_j7F1Lxn0 r8lambdaqhqzpxpfyf_skw25fw_j7f1lxn0 : this.write.values()) {
                if (!z && r8lambdaqhqzpxpfyf_skw25fw_j7f1lxn0.write() == 2) {
                    jSerializer = 0;
                    break;
                }
                if (jSerializer < 0 || r8lambdaqhqzpxpfyf_skw25fw_j7f1lxn0.serializer() < jSerializer) {
                    jSerializer = r8lambdaqhqzpxpfyf_skw25fw_j7f1lxn0.serializer();
                }
            }
        }
        return jSerializer;
    }

    private void RemoteActionCompatParcelizer(r8lambdaQhqZpxPfyF_Skw25Fw_j7F1Lxn0 r8lambdaqhqzpxpfyf_skw25fw_j7f1lxn0) {
        synchronized (this) {
            if (this.write.put(r8lambdaqhqzpxpfyf_skw25fw_j7f1lxn0.read(), r8lambdaqhqzpxpfyf_skw25fw_j7f1lxn0) == null && r8lambdaqhqzpxpfyf_skw25fw_j7f1lxn0.MediaDescriptionCompat()) {
                this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.read();
            }
            this.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer("Added request: %s", r8lambdaqhqzpxpfyf_skw25fw_j7f1lxn0.toString());
        }
    }

    public static void serializer(setActionId setactionid, Long l) {
        setactionid.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.read();
        setactionid.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.RemoteActionCompatParcelizer(new Scopes$$ExternalSyntheticLambda0(setactionid, 9, l));
    }

    private void read() {
        synchronized (this) {
            if (this.serializer == null) {
                return;
            }
            MediaSessionCompatQueueItem();
            Location location = (Location) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.RemoteActionCompatParcelizer("inaccurateLocation");
            getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.PlaybackStateCompat;
            if (location != null) {
                getVerticalAccuracy getverticalaccuracy = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                long time = location.getTime();
                Optional optionalRemoteActionCompatParcelizer = Optional.RemoteActionCompatParcelizer(this.serializer);
                getverticalaccuracy.getClass();
                getanalyticsenabledenterannotations.serializer(getVerticalAccuracy.IconCompatParcelizer(location, time, optionalRemoteActionCompatParcelizer));
            } else {
                getanalyticsenabledenterannotations.IconCompatParcelizer(ControlMessage.LOCATION_FIX_TIMEDOUT, (Object) null);
            }
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read("inaccurateLocation", null);
            if (!this.MediaSessionCompatQueueItem) {
                this.serializer = null;
                this.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer("Stopping service, current foreground mode = %s", this.RemoteActionCompatParcelizer.name());
                synchronized (this) {
                    ServiceForegroundMode serviceForegroundMode = ServiceForegroundMode.ENABLED;
                    this.ComponentActivity.write("LocationManager");
                    this.PlaybackStateCompatCustomAction.IconCompatParcelizer(this.MediaBrowserCompatMediaItem);
                    this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write(write());
                    this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.IconCompatParcelizer();
                }
            }
            if (this.write.isEmpty()) {
                write(false);
                return;
            }
            if (MediaDescriptionCompat()) {
                write(true);
                serializer(false);
            }
        }
    }
}
