package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.util.Optional;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(cacheName = "venuemap-updater", componentName = "VenueMapUpdater")
public class migrateTriggersStorageToJsonlambda21 extends r8lambdaQAShlesJf6NzG1CuBMO3e9m802I implements removeGeofencesRegisteredWithGeofencingClientlambda2, r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    private final requestSingleLocationUpdate IconCompatParcelizer;
    private final getVerticalAccuracy MediaBrowserCompatMediaItem;
    private final isGeofencesEnabledFromEnvironmentlambda1 MediaDescriptionCompat;
    private final r8lambdaw447glWJfoun4bg91upXnaDQEZs MediaMetadataCompat;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI MediaSessionCompatQueueItem;
    private final migrateTriggersStorageToJsonlambda4 MediaSessionCompatResultReceiverWrapper;
    private boolean MediaSessionCompatToken = false;
    private final ArrayList PlaybackStateCompat = new ArrayList();
    private final readandroid_sdk_base_release PlaybackStateCompatCustomAction;
    private final ConfigurationManager RatingCompat;
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private final r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 read;
    private final com.sentiance.sdk.util.c serializer;
    private final getAnalyticsEnabledEnterannotations write;

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return null;
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        return Collections.EMPTY_LIST;
    }

    private void serializer(boolean z) {
        synchronized (this) {
            this.MediaSessionCompatToken = false;
            for (migrateTriggersStorageToJsonlambda20 migratetriggersstoragetojsonlambda20 : this.PlaybackStateCompat) {
                if (z) {
                    migratetriggersstoragetojsonlambda20.serializer(false);
                } else {
                    migratetriggersstoragetojsonlambda20.serializer(false);
                }
            }
            this.PlaybackStateCompat.clear();
        }
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        this.serializer.read();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        this.read.IconCompatParcelizer();
        clearData();
        this.MediaSessionCompatToken = false;
    }

    public migrateTriggersStorageToJsonlambda21(com.sentiance.sdk.util.c cVar, r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4, requestSingleLocationUpdate requestsinglelocationupdate, parseLonglambda0 parselonglambda0, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, getVerticalAccuracy getverticalaccuracy, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambdaw447glwjfoun4bg91upxnadqezs, isGeofencesEnabledFromEnvironmentlambda1 isgeofencesenabledfromenvironmentlambda1, ConfigurationManager configurationManager, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, migrateTriggersStorageToJsonlambda4 migratetriggersstoragetojsonlambda4) {
        this.serializer = cVar;
        this.read = r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4;
        this.IconCompatParcelizer = requestsinglelocationupdate;
        this.RemoteActionCompatParcelizer = parselonglambda0;
        this.write = getanalyticsenabledenterannotations;
        this.PlaybackStateCompatCustomAction = readandroid_sdk_base_releaseVar;
        this.MediaBrowserCompatMediaItem = getverticalaccuracy;
        this.MediaDescriptionCompat = isgeofencesenabledfromenvironmentlambda1;
        this.MediaSessionCompatQueueItem = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.MediaMetadataCompat = r8lambdaw447glwjfoun4bg91upxnadqezs;
        this.RatingCompat = configurationManager;
        this.MediaSessionCompatResultReceiverWrapper = migratetriggersstoragetojsonlambda4;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0057 A[Catch: all -> 0x009d, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x0008, B:7:0x0011, B:10:0x0016, B:12:0x001b, B:15:0x0026, B:17:0x002a, B:19:0x0038, B:22:0x004a, B:23:0x0057, B:26:0x0065, B:28:0x007f, B:29:0x0091), top: B:35:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0065 A[Catch: all -> 0x009d, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x0008, B:7:0x0011, B:10:0x0016, B:12:0x001b, B:15:0x0026, B:17:0x002a, B:19:0x0038, B:22:0x004a, B:23:0x0057, B:26:0x0065, B:28:0x007f, B:29:0x0091), top: B:35:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x007f A[Catch: all -> 0x009d, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x0008, B:7:0x0011, B:10:0x0016, B:12:0x001b, B:15:0x0026, B:17:0x002a, B:19:0x0038, B:22:0x004a, B:23:0x0057, B:26:0x0065, B:28:0x007f, B:29:0x0091), top: B:35:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0091 A[Catch: all -> 0x009d, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x0008, B:7:0x0011, B:10:0x0016, B:12:0x001b, B:15:0x0026, B:17:0x002a, B:19:0x0038, B:22:0x004a, B:23:0x0057, B:26:0x0065, B:28:0x007f, B:29:0x0091), top: B:35:0x0003 }] */
    public final void write(migrateTriggersStorageToJsonlambda20 migratetriggersstoragetojsonlambda20, boolean z) {
        Optional<r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY> optionalWrite;
        boolean zIconCompatParcelizer;
        parseLonglambda0 parselonglambda0;
        synchronized (this) {
            if (migratetriggersstoragetojsonlambda20 != null) {
                this.PlaybackStateCompat.add(migratetriggersstoragetojsonlambda20);
            }
            if (!this.RatingCompat._init_lambda4()) {
                serializer(true);
                return;
            }
            if (this.MediaSessionCompatToken) {
                this.RemoteActionCompatParcelizer.IconCompatParcelizer("VenueMap config update is already in progress", new Object[0]);
                return;
            }
            this.MediaSessionCompatToken = true;
            if (z) {
                optionalWrite = this.MediaMetadataCompat.write();
                zIconCompatParcelizer = optionalWrite.IconCompatParcelizer();
                parselonglambda0 = this.RemoteActionCompatParcelizer;
                if (zIconCompatParcelizer) {
                    parselonglambda0.IconCompatParcelizer("Updating VenueMap config", new Object[0]);
                    this.read.read();
                    if (!this.IconCompatParcelizer.serializer(optionalWrite.write(), this)) {
                        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("Failed to start VenueMap config update", new Object[0]);
                        serializer(false);
                        this.read.IconCompatParcelizer();
                    }
                } else {
                    parselonglambda0.IconCompatParcelizer("Not updating VenueMap config: auth info not present", new Object[0]);
                    serializer(false);
                }
            } else {
                long jIconCompatParcelizer = this.serializer.IconCompatParcelizer("last_venuemap_update", -1L);
                if (jIconCompatParcelizer != -1) {
                    this.MediaSessionCompatQueueItem.getClass();
                    if (System.currentTimeMillis() - jIconCompatParcelizer > 43200000) {
                        optionalWrite = this.MediaMetadataCompat.write();
                        zIconCompatParcelizer = optionalWrite.IconCompatParcelizer();
                        parselonglambda0 = this.RemoteActionCompatParcelizer;
                        if (zIconCompatParcelizer) {
                            parselonglambda0.IconCompatParcelizer("Updating VenueMap config", new Object[0]);
                            this.read.read();
                            if (!this.IconCompatParcelizer.serializer(optionalWrite.write(), this)) {
                                this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("Failed to start VenueMap config update", new Object[0]);
                                serializer(false);
                                this.read.IconCompatParcelizer();
                            }
                        } else {
                            parselonglambda0.IconCompatParcelizer("Not updating VenueMap config: auth info not present", new Object[0]);
                            serializer(false);
                        }
                    } else {
                        this.RemoteActionCompatParcelizer.IconCompatParcelizer("Last VenueMap configuration update was not long enough ago yet, not updating now", new Object[0]);
                        serializer(false);
                    }
                } else {
                    optionalWrite = this.MediaMetadataCompat.write();
                    zIconCompatParcelizer = optionalWrite.IconCompatParcelizer();
                    parselonglambda0 = this.RemoteActionCompatParcelizer;
                    if (zIconCompatParcelizer) {
                        parselonglambda0.IconCompatParcelizer("Updating VenueMap config", new Object[0]);
                        this.read.read();
                        if (!this.IconCompatParcelizer.serializer(optionalWrite.write(), this)) {
                            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("Failed to start VenueMap config update", new Object[0]);
                            serializer(false);
                            this.read.IconCompatParcelizer();
                        }
                    } else {
                        parselonglambda0.IconCompatParcelizer("Not updating VenueMap config: auth info not present", new Object[0]);
                        serializer(false);
                    }
                }
            }
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        ControlMessage controlMessage = ControlMessage.VENUEMAP_UPDATE_REQUEST;
        readandroid_sdk_base_release readandroid_sdk_base_releaseVar = this.PlaybackStateCompatCustomAction;
        aExternalSyntheticLambda0 aexternalsyntheticlambda0 = new aExternalSyntheticLambda0(this, readandroid_sdk_base_releaseVar);
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.write;
        getanalyticsenabledenterannotations.read(controlMessage, aexternalsyntheticlambda0);
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(addBannerViewMonitor.class, new migrateTriggersStorageToJsonlambda30(this, readandroid_sdk_base_releaseVar));
    }

    @Override // o.r8lambda2qd0WTXYngtMHSpVeuMB06dloAQ
    public final void RemoteActionCompatParcelizer(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, IOException iOException) {
        synchronized (this) {
            serializer(false);
            this.read.IconCompatParcelizer();
        }
    }

    @Override // o.r8lambdaQAShlesJf6NzG1CuBMO3e9m802I
    public final void serializer(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingapp, setSmallNotificationIconNameandroid_sdk_base_release setsmallnotificationiconnameandroid_sdk_base_release) throws IOException {
        synchronized (this) {
            if (setshouldpersistwebviewwhenbackgroundingapp.write()) {
                Optional optionalMediaSessionCompatQueueItem = Optional.MediaSessionCompatQueueItem();
                if (setsmallnotificationiconnameandroid_sdk_base_release != null) {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new GZIPInputStream(setsmallnotificationiconnameandroid_sdk_base_release.write(), 8192));
                    Optional optional = this.MediaBrowserCompatMediaItem.read(bufferedInputStream, removeFromCustomAttributeArraylambda0.read, false);
                    bufferedInputStream.close();
                    optionalMediaSessionCompatQueueItem = optional;
                }
                if (optionalMediaSessionCompatQueueItem.read()) {
                    this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("Could not update VenueMap configuration: VenueMapConfiguration could not be deserialized", new Object[0]);
                    serializer(false);
                    this.read.IconCompatParcelizer();
                    return;
                } else {
                    com.sentiance.sdk.util.c cVar = this.serializer;
                    this.MediaSessionCompatQueueItem.getClass();
                    cVar.read(System.currentTimeMillis(), "last_venuemap_update");
                    this.MediaSessionCompatResultReceiverWrapper.serializer((removeFromCustomAttributeArraylambda0) optionalMediaSessionCompatQueueItem.write());
                    serializer(true);
                }
            } else {
                this.RemoteActionCompatParcelizer.write("Could not update VenueMap configuration: %d %s", Integer.valueOf(setshouldpersistwebviewwhenbackgroundingapp.serializer), setshouldpersistwebviewwhenbackgroundingapp.read);
                serializer(false);
            }
            this.read.IconCompatParcelizer();
        }
    }
}
