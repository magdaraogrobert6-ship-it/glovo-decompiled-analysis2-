package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.events.f$$ExternalSyntheticLambda1;
import com.sentiance.sdk.processguard.Guard$Type;
import com.sentiance.sdk.util.Optional;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "configuration-updater", componentName = "ConfigurationUpdater", guardType = Guard$Type.REFERENCE_COUNTED)
public class requestSingleLocationUpdateFromGooglePlaylambda30 extends r8lambdaQAShlesJf6NzG1CuBMO3e9m802I implements removeGeofencesRegisteredWithGeofencingClientlambda2, r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    private final r8lambdaw447glWJfoun4bg91upXnaDQEZs IconCompatParcelizer;
    private final getAnalyticsEnabledEnterannotations MediaBrowserCompatMediaItem;
    private final readandroid_sdk_base_release MediaDescriptionCompat;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI MediaMetadataCompat;
    private final ConfigurationManager MediaSessionCompatQueueItem;
    private final r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 RatingCompat;
    private final com.sentiance.sdk.util.c RemoteActionCompatParcelizer;
    private final getVerticalAccuracy read;
    private final parseLonglambda0 serializer;
    private final requestSingleLocationUpdate write;
    private final ArrayList ParcelableVolumeInfo = new ArrayList();
    private boolean MediaSessionCompatToken = false;

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
            this.RatingCompat.write();
            this.MediaSessionCompatToken = false;
            this.ParcelableVolumeInfo.clear();
        }
    }

    private void read(setEmaillambda0 setemaillambda0) {
        synchronized (this) {
            this.MediaSessionCompatToken = false;
            for (requestSingleLocationUpdateFromGooglePlaylambda10 requestsinglelocationupdatefromgoogleplaylambda10 : this.ParcelableVolumeInfo) {
                if (setemaillambda0 == null) {
                    requestsinglelocationupdatefromgoogleplaylambda10.serializer();
                } else {
                    requestsinglelocationupdatefromgoogleplaylambda10.RemoteActionCompatParcelizer(setemaillambda0);
                }
            }
            this.ParcelableVolumeInfo.clear();
        }
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        this.RemoteActionCompatParcelizer.read();
    }

    public final void write() {
        write(null, false);
    }

    public requestSingleLocationUpdateFromGooglePlaylambda30(parseLonglambda0 parselonglambda0, requestSingleLocationUpdate requestsinglelocationupdate, getVerticalAccuracy getverticalaccuracy, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, ConfigurationManager configurationManager, r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambdaw447glwjfoun4bg91upxnadqezs, com.sentiance.sdk.util.c cVar, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        this.serializer = parselonglambda0;
        this.write = requestsinglelocationupdate;
        this.IconCompatParcelizer = r8lambdaw447glwjfoun4bg91upxnadqezs;
        this.RemoteActionCompatParcelizer = cVar;
        this.read = getverticalaccuracy;
        this.MediaSessionCompatQueueItem = configurationManager;
        this.MediaBrowserCompatMediaItem = getanalyticsenabledenterannotations;
        this.MediaMetadataCompat = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.RatingCompat = r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4;
        this.MediaDescriptionCompat = readandroid_sdk_base_releaseVar;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0050 A[Catch: all -> 0x009b, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x0008, B:7:0x000d, B:8:0x001b, B:10:0x001d, B:12:0x0023, B:14:0x0031, B:17:0x0043, B:25:0x0094, B:26:0x0099, B:18:0x0050, B:21:0x005e, B:23:0x0078, B:24:0x008a), top: B:31:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x005e A[Catch: all -> 0x009b, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x0008, B:7:0x000d, B:8:0x001b, B:10:0x001d, B:12:0x0023, B:14:0x0031, B:17:0x0043, B:25:0x0094, B:26:0x0099, B:18:0x0050, B:21:0x005e, B:23:0x0078, B:24:0x008a), top: B:31:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0078 A[Catch: all -> 0x009b, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x0008, B:7:0x000d, B:8:0x001b, B:10:0x001d, B:12:0x0023, B:14:0x0031, B:17:0x0043, B:25:0x0094, B:26:0x0099, B:18:0x0050, B:21:0x005e, B:23:0x0078, B:24:0x008a), top: B:31:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x008a A[Catch: all -> 0x009b, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x0008, B:7:0x000d, B:8:0x001b, B:10:0x001d, B:12:0x0023, B:14:0x0031, B:17:0x0043, B:25:0x0094, B:26:0x0099, B:18:0x0050, B:21:0x005e, B:23:0x0078, B:24:0x008a), top: B:31:0x0003 }] */
    public static void write(requestSingleLocationUpdateFromGooglePlaylambda30 requestsinglelocationupdatefromgoogleplaylambda30, requestSingleLocationUpdateFromGooglePlaylambda10 requestsinglelocationupdatefromgoogleplaylambda10, boolean z) {
        Optional<r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY> optionalWrite;
        boolean zIconCompatParcelizer;
        parseLonglambda0 parselonglambda0;
        synchronized (requestsinglelocationupdatefromgoogleplaylambda30) {
            if (requestsinglelocationupdatefromgoogleplaylambda10 != null) {
                requestsinglelocationupdatefromgoogleplaylambda30.ParcelableVolumeInfo.add(requestsinglelocationupdatefromgoogleplaylambda10);
            }
            if (requestsinglelocationupdatefromgoogleplaylambda30.MediaSessionCompatToken) {
                requestsinglelocationupdatefromgoogleplaylambda30.serializer.IconCompatParcelizer("Configuration update is already in progress", new Object[0]);
                requestsinglelocationupdatefromgoogleplaylambda30.RatingCompat.IconCompatParcelizer();
                return;
            }
            requestsinglelocationupdatefromgoogleplaylambda30.MediaSessionCompatToken = true;
            if (z) {
                optionalWrite = requestsinglelocationupdatefromgoogleplaylambda30.IconCompatParcelizer.write();
                zIconCompatParcelizer = optionalWrite.IconCompatParcelizer();
                parselonglambda0 = requestsinglelocationupdatefromgoogleplaylambda30.serializer;
                if (zIconCompatParcelizer) {
                    parselonglambda0.IconCompatParcelizer("Updating SDK configuration", new Object[0]);
                    requestsinglelocationupdatefromgoogleplaylambda30.RatingCompat.read();
                    if (!requestsinglelocationupdatefromgoogleplaylambda30.write.RemoteActionCompatParcelizer(optionalWrite.write(), requestsinglelocationupdatefromgoogleplaylambda30)) {
                        requestsinglelocationupdatefromgoogleplaylambda30.serializer.RemoteActionCompatParcelizer("Failed to create call to update SDK configuration", new Object[0]);
                        requestsinglelocationupdatefromgoogleplaylambda30.read(null);
                        requestsinglelocationupdatefromgoogleplaylambda30.RatingCompat.IconCompatParcelizer();
                    }
                } else {
                    parselonglambda0.IconCompatParcelizer("Not updating SDK configuration: auth info not present", new Object[0]);
                    requestsinglelocationupdatefromgoogleplaylambda30.read(null);
                }
            } else {
                long jIconCompatParcelizer = requestsinglelocationupdatefromgoogleplaylambda30.RemoteActionCompatParcelizer.IconCompatParcelizer("last_update", -1L);
                if (jIconCompatParcelizer != -1) {
                    requestsinglelocationupdatefromgoogleplaylambda30.MediaMetadataCompat.getClass();
                    if (System.currentTimeMillis() - jIconCompatParcelizer > 28800000) {
                        optionalWrite = requestsinglelocationupdatefromgoogleplaylambda30.IconCompatParcelizer.write();
                        zIconCompatParcelizer = optionalWrite.IconCompatParcelizer();
                        parselonglambda0 = requestsinglelocationupdatefromgoogleplaylambda30.serializer;
                        if (zIconCompatParcelizer) {
                            parselonglambda0.IconCompatParcelizer("Updating SDK configuration", new Object[0]);
                            requestsinglelocationupdatefromgoogleplaylambda30.RatingCompat.read();
                            if (!requestsinglelocationupdatefromgoogleplaylambda30.write.RemoteActionCompatParcelizer(optionalWrite.write(), requestsinglelocationupdatefromgoogleplaylambda30)) {
                                requestsinglelocationupdatefromgoogleplaylambda30.serializer.RemoteActionCompatParcelizer("Failed to create call to update SDK configuration", new Object[0]);
                                requestsinglelocationupdatefromgoogleplaylambda30.read(null);
                                requestsinglelocationupdatefromgoogleplaylambda30.RatingCompat.IconCompatParcelizer();
                            }
                        } else {
                            parselonglambda0.IconCompatParcelizer("Not updating SDK configuration: auth info not present", new Object[0]);
                            requestsinglelocationupdatefromgoogleplaylambda30.read(null);
                        }
                    } else {
                        requestsinglelocationupdatefromgoogleplaylambda30.serializer.IconCompatParcelizer("Last configuration update was not long enough ago yet, not updating now", new Object[0]);
                        requestsinglelocationupdatefromgoogleplaylambda30.read(null);
                    }
                } else {
                    optionalWrite = requestsinglelocationupdatefromgoogleplaylambda30.IconCompatParcelizer.write();
                    zIconCompatParcelizer = optionalWrite.IconCompatParcelizer();
                    parselonglambda0 = requestsinglelocationupdatefromgoogleplaylambda30.serializer;
                    if (zIconCompatParcelizer) {
                        parselonglambda0.IconCompatParcelizer("Updating SDK configuration", new Object[0]);
                        requestsinglelocationupdatefromgoogleplaylambda30.RatingCompat.read();
                        if (!requestsinglelocationupdatefromgoogleplaylambda30.write.RemoteActionCompatParcelizer(optionalWrite.write(), requestsinglelocationupdatefromgoogleplaylambda30)) {
                            requestsinglelocationupdatefromgoogleplaylambda30.serializer.RemoteActionCompatParcelizer("Failed to create call to update SDK configuration", new Object[0]);
                            requestsinglelocationupdatefromgoogleplaylambda30.read(null);
                            requestsinglelocationupdatefromgoogleplaylambda30.RatingCompat.IconCompatParcelizer();
                        }
                    } else {
                        parselonglambda0.IconCompatParcelizer("Not updating SDK configuration: auth info not present", new Object[0]);
                        requestsinglelocationupdatefromgoogleplaylambda30.read(null);
                    }
                }
            }
            requestsinglelocationupdatefromgoogleplaylambda30.RatingCompat.IconCompatParcelizer();
        }
    }

    @Override // o.r8lambdaQAShlesJf6NzG1CuBMO3e9m802I
    public final void serializer(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingapp, setSmallNotificationIconNameandroid_sdk_base_release setsmallnotificationiconnameandroid_sdk_base_release) throws IOException {
        boolean zWrite = setshouldpersistwebviewwhenbackgroundingapp.write();
        r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4 = this.RatingCompat;
        parseLonglambda0 parselonglambda0 = this.serializer;
        Long lValueOf = null;
        if (zWrite) {
            Optional optionalMediaSessionCompatQueueItem = Optional.MediaSessionCompatQueueItem();
            if (setsmallnotificationiconnameandroid_sdk_base_release != null) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new GZIPInputStream(setsmallnotificationiconnameandroid_sdk_base_release.write(), 8192));
                Optional optional = this.read.read(bufferedInputStream, setEmaillambda0.read, false);
                bufferedInputStream.close();
                optionalMediaSessionCompatQueueItem = optional;
            }
            if (optionalMediaSessionCompatQueueItem.read()) {
                parselonglambda0.RemoteActionCompatParcelizer("Could not update SDK configuration: SdkConfiguration could not be deserialized", new Object[0]);
                read(null);
                r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4.IconCompatParcelizer();
                return;
            }
            String str = setshouldpersistwebviewwhenbackgroundingapp.read("Last-Modified", null);
            if (str != null) {
                try {
                    lValueOf = Long.valueOf(Long.parseLong(str));
                } catch (NumberFormatException e) {
                    parselonglambda0.IconCompatParcelizer(false, e, "Invalid Last-Modified header value: %s", str);
                }
            }
            this.MediaMetadataCompat.getClass();
            this.RemoteActionCompatParcelizer.read(System.currentTimeMillis(), "last_update");
            this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer((setEmaillambda0) optionalMediaSessionCompatQueueItem.write(), lValueOf);
            read((setEmaillambda0) optionalMediaSessionCompatQueueItem.write());
        } else {
            int i = setshouldpersistwebviewwhenbackgroundingapp.serializer;
            parselonglambda0.write("Could not update SDK configuration: %d %s", Integer.valueOf(i), setshouldpersistwebviewwhenbackgroundingapp.read);
            read(null);
        }
        r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4.IconCompatParcelizer();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        this.MediaBrowserCompatMediaItem.read(ControlMessage.CONFIG_UPDATE_REQUEST, new storeRegisteredGeofencesToLocalStorageandroid_sdk_location_release(this, this.MediaDescriptionCompat));
    }

    private void write(requestSingleLocationUpdateFromGooglePlaylambda10 requestsinglelocationupdatefromgoogleplaylambda10, boolean z) {
        this.RatingCompat.read();
        this.MediaDescriptionCompat.RemoteActionCompatParcelizer(new f$$ExternalSyntheticLambda1(this, requestsinglelocationupdatefromgoogleplaylambda10, z, 4));
    }

    public final void IconCompatParcelizer(requestSingleLocationUpdateFromGooglePlaylambda10 requestsinglelocationupdatefromgoogleplaylambda10) {
        write(requestsinglelocationupdatefromgoogleplaylambda10, false);
    }

    public final void RemoteActionCompatParcelizer(r8lambda_j_I8cEOzijBFPHvG1z87DEoYF4 r8lambda_j_i8ceozijbfphvg1z87deoyf4) {
        write(r8lambda_j_i8ceozijbfphvg1z87deoyf4, true);
    }

    public final void write(setEmaillambda0 setemaillambda0) {
        this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(setemaillambda0, null);
        read(setemaillambda0);
        this.MediaMetadataCompat.getClass();
        this.RemoteActionCompatParcelizer.read(System.currentTimeMillis(), "last_update");
    }

    @Override // o.r8lambda2qd0WTXYngtMHSpVeuMB06dloAQ
    public final void RemoteActionCompatParcelizer(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, IOException iOException) {
        this.serializer.IconCompatParcelizer(iOException, "Error updating SDK configuration", new Object[0]);
        read(null);
        this.RatingCompat.IconCompatParcelizer();
    }

    public final void RemoteActionCompatParcelizer() {
        write(null, true);
    }
}
