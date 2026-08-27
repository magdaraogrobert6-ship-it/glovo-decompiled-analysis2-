package o;

import android.content.Context;
import com.incognia.internal.ZM$$ExternalSyntheticLambda2;
import com.incognia.internal.pNP$$ExternalSyntheticLambda5;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.events.controlmessageextras.LogUploadResult;
import com.sentiance.sdk.processguard.Guard$Type;
import com.sentiance.sdk.tile.j$$ExternalSyntheticLambda1;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "LogUploader", guardType = Guard$Type.REFERENCE_COUNTED)
public class parseNonBlankStringlambda0 extends r8lambdaWFZs9fZBV91sXuExLJ2TMbetIVE implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    getStableKey IconCompatParcelizer;
    private final retrieveRegisteredGeofencesFromLocalStoragelambda0 MediaBrowserCompatMediaItem;
    private final getLocationManagerandroid_sdk_location_release MediaDescriptionCompat;
    private final accessstringAndKey MediaMetadataCompat;
    private final isGeofencesEnabledFromEnvironmentlambda1 MediaSessionCompatQueueItem;
    private LinkedList MediaSessionCompatToken;
    private getTemplateFieldAtIndexlambda1 ParcelableVolumeInfo;
    private final LinkedList PlaybackStateCompat;
    private final r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 RatingCompat;
    private final Context RemoteActionCompatParcelizer;
    private final getPersonId read;
    private final readandroid_sdk_base_release serializer;
    private final parseLonglambda0 write;

    public static void RemoteActionCompatParcelizer(parseNonBlankStringlambda0 parsenonblankstringlambda0) {
        boolean z;
        List list;
        synchronized (parsenonblankstringlambda0) {
            if (parsenonblankstringlambda0.IconCompatParcelizer == null) {
                parsenonblankstringlambda0.IconCompatParcelizer = (getStableKey) parsenonblankstringlambda0.PlaybackStateCompat.peek();
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            synchronized (parsenonblankstringlambda0) {
                getStableKey getstablekey = (getStableKey) parsenonblankstringlambda0.PlaybackStateCompat.poll();
                parsenonblankstringlambda0.IconCompatParcelizer = getstablekey;
                if (getstablekey != null) {
                    isGeofencesEnabledFromEnvironmentlambda1 isgeofencesenabledfromenvironmentlambda1 = parsenonblankstringlambda0.MediaSessionCompatQueueItem;
                    boolean zMediaDescriptionCompat = isgeofencesenabledfromenvironmentlambda1.MediaDescriptionCompat();
                    boolean zRatingCompat = isgeofencesenabledfromenvironmentlambda1.RatingCompat();
                    boolean zRemoteActionCompatParcelizer = parsenonblankstringlambda0.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer();
                    parsenonblankstringlambda0.write.IconCompatParcelizer("%s; %s; %s", zMediaDescriptionCompat ? "Connected to WiFi" : "Not connected to WiFi", zRatingCompat ? "has network connection" : "has no network connection", zRemoteActionCompatParcelizer ? "allowed to upload logs over mobile data" : "not allowed to upload logs over mobile data");
                    if (zMediaDescriptionCompat || (zRatingCompat && zRemoteActionCompatParcelizer)) {
                        getStableKey getstablekey2 = parsenonblankstringlambda0.IconCompatParcelizer;
                        if (getstablekey2 == null) {
                            list = Collections.EMPTY_LIST;
                        } else {
                            Integer numWrite = getstablekey2.write();
                            Integer numRemoteActionCompatParcelizer = getstablekey2.RemoteActionCompatParcelizer();
                            boolean z2 = numWrite == null || numRemoteActionCompatParcelizer == null;
                            boolean zMediaDescriptionCompat2 = getstablekey2.MediaDescriptionCompat();
                            ArrayList arrayList = new ArrayList();
                            File[] fileArrListFiles = parseStringlambda0.IconCompatParcelizer(parsenonblankstringlambda0.RemoteActionCompatParcelizer).listFiles();
                            if (fileArrListFiles != null) {
                                for (File file : migrateSealedSessionsMapToJsonlambda0.serializer(fileArrListFiles)) {
                                    String name = file.getName();
                                    if (name.endsWith(".gz") || zMediaDescriptionCompat2) {
                                        parsenonblankstringlambda0.MediaMetadataCompat.getClass();
                                        Integer numSerializer = accessstringAndKey.serializer(name);
                                        if (z2 || (numSerializer != null && numSerializer.intValue() >= numWrite.intValue() && numSerializer.intValue() <= numRemoteActionCompatParcelizer.intValue())) {
                                            arrayList.add(file);
                                        }
                                    }
                                }
                            }
                            list = arrayList;
                        }
                        LinkedList linkedList = new LinkedList(list);
                        parsenonblankstringlambda0.MediaSessionCompatToken = linkedList;
                        if (linkedList.isEmpty()) {
                            parsenonblankstringlambda0.write.IconCompatParcelizer("Nothing to do", new Object[0]);
                            parsenonblankstringlambda0.RemoteActionCompatParcelizer(true);
                        } else {
                            parsenonblankstringlambda0.IconCompatParcelizer();
                        }
                    } else {
                        parsenonblankstringlambda0.write.IconCompatParcelizer("Network condition not suitable. Aborting upload.", new Object[0]);
                        parsenonblankstringlambda0.RemoteActionCompatParcelizer(false);
                    }
                }
            }
        }
        parsenonblankstringlambda0.RatingCompat.IconCompatParcelizer();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return null;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        synchronized (this) {
            this.PlaybackStateCompat.clear();
            getTemplateFieldAtIndexlambda1 gettemplatefieldatindexlambda1 = this.ParcelableVolumeInfo;
            if (gettemplatefieldatindexlambda1 != null && gettemplatefieldatindexlambda1.serializer != null) {
                this.ParcelableVolumeInfo.serializer.serializer();
            }
            this.IconCompatParcelizer = null;
            this.ParcelableVolumeInfo = null;
        }
        this.RatingCompat.write();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
    }

    private void IconCompatParcelizer() {
        if (this.MediaSessionCompatToken.isEmpty()) {
            this.write.IconCompatParcelizer("No more files to upload.", new Object[0]);
            RemoteActionCompatParcelizer(true);
            return;
        }
        File file = (File) this.MediaSessionCompatToken.poll();
        if (file == null) {
            this.write.IconCompatParcelizer("null file in the list", new Object[0]);
            write(true);
            return;
        }
        String name = file.getName();
        java.util.Locale locale = java.util.Locale.ENGLISH;
        String str = new SimpleDateFormat("yyyyMMdd", locale).format(com.sentiance.sdk.util.x.RemoteActionCompatParcelizer());
        File file2 = name.endsWith(".gz") ? file : migrateSealedSessionsMapToJsonlambda0.read(file, RemoteActionCompatParcelizer(name, str) ? new SimpleDateFormat("HHmmss", locale).format(com.sentiance.sdk.util.x.RemoteActionCompatParcelizer()) : "", this.write);
        if (file2 == null) {
            this.write.write(name.concat(" :: Could not gzip file, won't attempt to upload"), new Object[0]);
            this.write.RemoteActionCompatParcelizer("Failed to upload file " + file, new Object[0]);
            write(false);
            return;
        }
        if (file2 != file && !RemoteActionCompatParcelizer(name, str)) {
            this.write.IconCompatParcelizer(name.concat(" :: deleting file"), new Object[0]);
            file.delete();
        }
        synchronized (this) {
            this.ParcelableVolumeInfo = new getTemplateFieldAtIndexlambda1(file2, name, str);
            this.RatingCompat.read();
            this.read.RemoteActionCompatParcelizer(file2.getName(), this);
        }
    }

    private void write(boolean z) {
        this.RatingCompat.read();
        this.serializer.RemoteActionCompatParcelizer(new pNP$$ExternalSyntheticLambda5(this, z, 3));
    }

    @Override // o.r8lambdaWFZs9fZBV91sXuExLJ2TMbetIVE
    public final void IconCompatParcelizer(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, IOException iOException) {
        String name;
        synchronized (this) {
            getTemplateFieldAtIndexlambda1 gettemplatefieldatindexlambda1 = this.ParcelableVolumeInfo;
            name = gettemplatefieldatindexlambda1 != null ? gettemplatefieldatindexlambda1.IconCompatParcelizer.getName() : "?";
        }
        this.write.IconCompatParcelizer(false, iOException, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(name, " :: Could not upload file"), new Object[0]);
        write(false);
        this.RatingCompat.IconCompatParcelizer();
    }

    @Override // o.r8lambdaWFZs9fZBV91sXuExLJ2TMbetIVE
    public final void write(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingapp, setSmallNotificationIconNameandroid_sdk_base_release setsmallnotificationiconnameandroid_sdk_base_release) {
        String name;
        synchronized (this) {
            getTemplateFieldAtIndexlambda1 gettemplatefieldatindexlambda1 = this.ParcelableVolumeInfo;
            name = gettemplatefieldatindexlambda1 != null ? gettemplatefieldatindexlambda1.IconCompatParcelizer.getName() : "?";
        }
        boolean z = true;
        if (setshouldpersistwebviewwhenbackgroundingapp.serializer == 200) {
            String str = setshouldpersistwebviewwhenbackgroundingapp.read("x-amz-request-id", null);
            parseLonglambda0 parselonglambda0 = this.write;
            if (str == null) {
                parselonglambda0.RemoteActionCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(name, " :: upload failed: x-amz-request-id header not present, assuming failure"), new Object[0]);
            } else {
                parselonglambda0.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(name, " :: upload successful"), new Object[0]);
            }
            write(z);
            this.RatingCompat.IconCompatParcelizer();
        }
        try {
            this.write.RemoteActionCompatParcelizer(name + " :: upload failed: %s %s\n%s", Integer.valueOf(setshouldpersistwebviewwhenbackgroundingapp.serializer), setshouldpersistwebviewwhenbackgroundingapp.read, setsmallnotificationiconnameandroid_sdk_base_release != null ? setsmallnotificationiconnameandroid_sdk_base_release.serializer() : "(no body)");
        } catch (IOException e) {
            this.write.IconCompatParcelizer(false, e, "Failed to get response body string", new Object[0]);
        }
        z = false;
        write(z);
        this.RatingCompat.IconCompatParcelizer();
    }

    public parseNonBlankStringlambda0(Context context, parseLonglambda0 parselonglambda0, getLocationManagerandroid_sdk_location_release getlocationmanagerandroid_sdk_location_release, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, isGeofencesEnabledFromEnvironmentlambda1 isgeofencesenabledfromenvironmentlambda1, getPersonId getpersonid, r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4, accessstringAndKey accessstringandkey, retrieveRegisteredGeofencesFromLocalStoragelambda0 retrieveregisteredgeofencesfromlocalstoragelambda0) {
        super(readandroid_sdk_base_releaseVar);
        this.ParcelableVolumeInfo = null;
        this.IconCompatParcelizer = null;
        this.RemoteActionCompatParcelizer = context;
        this.write = parselonglambda0;
        this.MediaSessionCompatQueueItem = isgeofencesenabledfromenvironmentlambda1;
        this.MediaDescriptionCompat = getlocationmanagerandroid_sdk_location_release;
        this.serializer = readandroid_sdk_base_releaseVar;
        this.read = getpersonid;
        this.RatingCompat = r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4;
        this.MediaMetadataCompat = accessstringandkey;
        this.MediaBrowserCompatMediaItem = retrieveregisteredgeofencesfromlocalstoragelambda0;
        this.MediaSessionCompatToken = new LinkedList();
        this.PlaybackStateCompat = new LinkedList();
    }

    public static void serializer(parseNonBlankStringlambda0 parsenonblankstringlambda0, Exception exc, String str) {
        getTemplateFieldAtIndexlambda1 gettemplatefieldatindexlambda1 = parsenonblankstringlambda0.ParcelableVolumeInfo;
        if (gettemplatefieldatindexlambda1 == null) {
            parsenonblankstringlambda0.write.RemoteActionCompatParcelizer("No ongoing upload", new Object[0]);
            parsenonblankstringlambda0.write(false);
            parsenonblankstringlambda0.RatingCompat.IconCompatParcelizer();
            return;
        }
        if (exc != null) {
            parsenonblankstringlambda0.write.IconCompatParcelizer(false, exc, "Could not retrieve signed log upload url for file %s", gettemplatefieldatindexlambda1.read);
            parsenonblankstringlambda0.write(false);
            parsenonblankstringlambda0.RatingCompat.IconCompatParcelizer();
            return;
        }
        if (str == null) {
            parsenonblankstringlambda0.write.RemoteActionCompatParcelizer("Could not retrieve signed log upload url for file %s", gettemplatefieldatindexlambda1.read);
            parsenonblankstringlambda0.write(false);
            parsenonblankstringlambda0.RatingCompat.IconCompatParcelizer();
            return;
        }
        r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38 = parsenonblankstringlambda0.MediaDescriptionCompat.read(gettemplatefieldatindexlambda1.IconCompatParcelizer, str);
        synchronized (parsenonblankstringlambda0) {
            getTemplateFieldAtIndexlambda1 gettemplatefieldatindexlambda2 = parsenonblankstringlambda0.ParcelableVolumeInfo;
            if (gettemplatefieldatindexlambda2 != null) {
                gettemplatefieldatindexlambda2.serializer = r8lambda4gsaww0uf5fhes0li0lym_jwy38;
            } else {
                r8lambda4gsaww0uf5fhes0li0lym_jwy38 = null;
            }
            if (r8lambda4gsaww0uf5fhes0li0lym_jwy38 != null) {
                parsenonblankstringlambda0.RatingCompat.read();
                r8lambda4gsaww0uf5fhes0li0lym_jwy38.serializer(parsenonblankstringlambda0);
            }
        }
        if (r8lambda4gsaww0uf5fhes0li0lym_jwy38 == null) {
            parsenonblankstringlambda0.write(false);
        }
        parsenonblankstringlambda0.RatingCompat.IconCompatParcelizer();
    }

    private void RemoteActionCompatParcelizer(boolean z) {
        getStableKey getstablekey = this.IconCompatParcelizer;
        if (getstablekey != null) {
            new LogUploadResult(getstablekey.IconCompatParcelizer(), LogUploadResult.ResultType.fromBoolean(z));
            getstablekey.serializer().read(new LogUploadResult(getstablekey.IconCompatParcelizer(), LogUploadResult.ResultType.fromBoolean(z)));
        }
        synchronized (this) {
            this.ParcelableVolumeInfo = null;
            this.IconCompatParcelizer = null;
        }
        this.RatingCompat.read();
        this.serializer.RemoteActionCompatParcelizer(new ZM$$ExternalSyntheticLambda2(25, this));
    }

    public static /* synthetic */ void write(parseNonBlankStringlambda0 parsenonblankstringlambda0, boolean z) {
        getTemplateFieldAtIndexlambda1 gettemplatefieldatindexlambda1 = parsenonblankstringlambda0.ParcelableVolumeInfo;
        if (gettemplatefieldatindexlambda1 != null && (z || RemoteActionCompatParcelizer(gettemplatefieldatindexlambda1.read, gettemplatefieldatindexlambda1.RemoteActionCompatParcelizer))) {
            gettemplatefieldatindexlambda1.IconCompatParcelizer.delete();
        }
        if (z) {
            parsenonblankstringlambda0.IconCompatParcelizer();
        } else {
            parsenonblankstringlambda0.RemoteActionCompatParcelizer(false);
        }
        parsenonblankstringlambda0.RatingCompat.IconCompatParcelizer();
    }

    public final void serializer(getStableKey getstablekey) {
        this.write.IconCompatParcelizer("Upload request came in from %s", getstablekey.read());
        synchronized (this) {
            this.PlaybackStateCompat.add(getstablekey);
        }
        this.RatingCompat.read();
        this.serializer.RemoteActionCompatParcelizer(new ZM$$ExternalSyntheticLambda2(25, this));
    }

    public final void serializer(String str, Exception exc) {
        this.serializer.RemoteActionCompatParcelizer(new j$$ExternalSyntheticLambda1(10, this, exc, str));
    }

    public final void IconCompatParcelizer(String str) {
        synchronized (this) {
            getStableKey getstablekey = this.IconCompatParcelizer;
            if (getstablekey != null && str.equals(getstablekey.IconCompatParcelizer())) {
                this.write.IconCompatParcelizer("Cancelling request from %s", getstablekey.read());
                getTemplateFieldAtIndexlambda1 gettemplatefieldatindexlambda1 = this.ParcelableVolumeInfo;
                if (gettemplatefieldatindexlambda1 != null && gettemplatefieldatindexlambda1.serializer != null) {
                    this.ParcelableVolumeInfo.serializer.serializer();
                }
                this.ParcelableVolumeInfo = null;
            }
            for (getStableKey getstablekey2 : new ArrayList(this.PlaybackStateCompat)) {
                if (getstablekey2.IconCompatParcelizer().equals(str)) {
                    this.PlaybackStateCompat.remove(getstablekey2);
                    break;
                }
            }
        }
    }

    @Override // o.r8lambdaWFZs9fZBV91sXuExLJ2TMbetIVE
    public final void IconCompatParcelizer(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingapp, IOException iOException) {
        this.write.IconCompatParcelizer(false, iOException, "Unexpected IOException while handling upload response", new Object[0]);
        write(false);
        this.RatingCompat.IconCompatParcelizer();
    }

    private static boolean RemoteActionCompatParcelizer(String str, String str2) {
        return !str.endsWith(".gz") && str.contains(str2);
    }
}
