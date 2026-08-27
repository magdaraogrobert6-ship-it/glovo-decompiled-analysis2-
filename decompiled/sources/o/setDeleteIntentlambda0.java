package o;

import android.location.Location;
import android.util.Pair;
import bo.app.af$$ExternalSyntheticOutline0;
import com.sentiance.core.model.thrift.DetectionTrigger;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.payload.creation.DetectionIdManager;
import com.sentiance.sdk.util.Optional;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "PayloadCreator")
public class setDeleteIntentlambda0 implements removeGeofencesRegisteredWithGeofencingClientlambda2, r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    private static final List<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>> write = Arrays.asList(setShouldPersistWebView.class, r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I.class);
    private final parseLonglambda0 ComponentActivity;
    private final getTrackingStringandroid_sdk_base_releaseannotations IconCompatParcelizer;
    private final sendPushActionIntentlambda0 MediaDescriptionCompat;
    private final setPublicVersionIfPresentAndSupportedlambda0 MediaMetadataCompat;
    private final getCooldownEnterSeconds MediaSessionCompatResultReceiverWrapper;
    private long MediaSessionCompatToken;
    private final getAnalyticsEnabledEnterannotations PlaybackStateCompatCustomAction;
    private final ConfigurationManager RemoteActionCompatParcelizer;
    private final getVerticalAccuracy ResultReceiver;
    private final setDeleteIntent r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    private final component4android_sdk_base_release r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    private final DetectionIdManager r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    private final setSummaryTextIfPresentAndSupportedlambda0 r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    private final populateNotificationBuilderlambda1 r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    private final readandroid_sdk_base_release r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    private final setSummaryTextIfPresentAndSupported r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    private final wakeScreenIfAppropriatelambda3 r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    private final setTitleIfPresent r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    private final retrieveRegisteredGeofencesFromLocalStorageandroid_sdk_location_release read;
    private final getValidNotificationChannellambda3 serializer;
    private Long ParcelableVolumeInfo = null;
    private final HashMap MediaSessionCompatQueueItem = new HashMap();
    private final HashMap PlaybackStateCompat = new HashMap();
    private final ArrayList MediaBrowserCompatMediaItem = new ArrayList();
    private final migrateTriggersReeligibilityToJsonlambda1<setLargeIconIfPresentAndSupportedlambda4> RatingCompat = new setContentIntentIfPresent(this);

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        return Collections.EMPTY_LIST;
    }

    public static void read(setDeleteIntentlambda0 setdeleteintentlambda0) {
        HashMap map = setdeleteintentlambda0.MediaSessionCompatQueueItem;
        map.clear();
        HashMap map2 = setdeleteintentlambda0.PlaybackStateCompat;
        map2.clear();
        setdeleteintentlambda0.RemoteActionCompatParcelizer(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, new setNotificationBadgeNumberIfPresentlambda0(setdeleteintentlambda0));
        setdeleteintentlambda0.RemoteActionCompatParcelizer(setSessionHandlingBlocklist.class, new setLargeIconIfPresentAndSupportedlambda5(setdeleteintentlambda0));
        setdeleteintentlambda0.RemoteActionCompatParcelizer(invokeSuspendlambda0.class, new setLargeIconIfPresentAndSupportedlambda6(setdeleteintentlambda0));
        setdeleteintentlambda0.RemoteActionCompatParcelizer(setShouldPersistWebView.class, new setPublicVersionIfPresentAndSupported(setdeleteintentlambda0));
        setdeleteintentlambda0.RemoteActionCompatParcelizer(r8lambdaQOq3wL0Ry1sJDGdfdXHrnvb36L4.class, new setSetShowWhenlambda0(setdeleteintentlambda0));
        setdeleteintentlambda0.RemoteActionCompatParcelizer(r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A.class, new setPriorityIfPresentAndSupported(setdeleteintentlambda0));
        setdeleteintentlambda0.RemoteActionCompatParcelizer(wipeDatalambda0.class, new setNotificationDurationAlarm(setdeleteintentlambda0));
        setdeleteintentlambda0.RemoteActionCompatParcelizer(r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg.class, new setSmallIconlambda1(setdeleteintentlambda0));
        setdeleteintentlambda0.RemoteActionCompatParcelizer(r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I.class, new setLargeIconIfPresentAndSupportedlambda3(setdeleteintentlambda0));
        setdeleteintentlambda0.RemoteActionCompatParcelizer(BrazeBootReceiver.class, new setSoundIfPresentAndSupported(setdeleteintentlambda0));
        setdeleteintentlambda0.RemoteActionCompatParcelizer(BrazeActivityLifecycleCallbackListeneronActivityCreated2.class, new setSmallIconlambda0(setdeleteintentlambda0));
        setdeleteintentlambda0.RemoteActionCompatParcelizer(r8lambdaFjiFiJxJXuf3VopUwRuT7TXivug.class, new setLargeIconIfPresentAndSupported(setdeleteintentlambda0));
        setdeleteintentlambda0.RemoteActionCompatParcelizer(shouldHandleLifecycleMethodsInActivitylambda0.class, new setNotificationBadgeNumberIfPresent(setdeleteintentlambda0));
        setdeleteintentlambda0.RemoteActionCompatParcelizer(r8lambdaE7oIx09KQauliA8paOfGanE2_e8.class, new setLargeIconIfPresentAndSupportedlambda1(setdeleteintentlambda0));
        setdeleteintentlambda0.RemoteActionCompatParcelizer(handleInAppMessageTestPush.class, new setContentIfPresentlambda0(setdeleteintentlambda0));
        setdeleteintentlambda0.RemoteActionCompatParcelizer(reenqueueInAppMessage.class, new setContentIntentIfPresentlambda0(setdeleteintentlambda0));
        setdeleteintentlambda0.RemoteActionCompatParcelizer(r8lambdaNpc69WZEQAEI66OXsnhLEbhuSqI.class, new setSetShowWhen(setdeleteintentlambda0));
        setdeleteintentlambda0.RemoteActionCompatParcelizer(r8lambdaK6IZILH9V8ErT5zK67D8Tg0VC8Q.class, new setSmallIcon(setdeleteintentlambda0));
        Iterator it = setCategoryIfPresentAndSupported.write().serializer().iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((IPropertiesObjectCompanion) ((getValidNotificationChannellambda0) setPushUniqueId.read((Class) it.next()))).write().entrySet()) {
                setdeleteintentlambda0.RemoteActionCompatParcelizer((Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>) entry.getKey(), (setSoundIfPresentAndSupportedlambda0<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>) entry.getValue());
            }
        }
        Iterator it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            map2.put((Class) it2.next(), new setLargeIconIfPresentAndSupportedlambda0(setdeleteintentlambda0, setdeleteintentlambda0.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4));
        }
        setdeleteintentlambda0.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer(setdeleteintentlambda0.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.write(0L), map2);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0216  */
    /* JADX WARN: Code duplicated, block: B:66:0x0245  */
    /* JADX WARN: Code duplicated, block: B:67:0x0248  */
    /* JADX WARN: Code duplicated, block: B:70:0x024e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0281  */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x0216, please report this as an issue */
    public static ArrayList serializer(setDeleteIntentlambda0 setdeleteintentlambda0, BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4, handleIncomingIntent handleincomingintent, long j, long j2) {
        long jSerializer;
        long jSerializer2;
        boolean z;
        DetectionTrigger detectionTrigger;
        boolean zBooleanValue;
        ArrayList arrayList;
        setDeleteIntent setdeleteintent = setdeleteintentlambda0.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        DetectionIdManager detectionIdManager = setdeleteintentlambda0.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        getVerticalAccuracy getverticalaccuracy = setdeleteintentlambda0.ResultReceiver;
        ArrayList arrayList2 = new ArrayList();
        migrateTriggersReeligibilityToJsonlambda1<setLargeIconIfPresentAndSupportedlambda4> migratetriggersreeligibilitytojsonlambda1 = setdeleteintentlambda0.RatingCompat;
        migratetriggersreeligibilitytojsonlambda1.read(new setLargeIconIfPresentAndSupportedlambda4(migratetriggersreeligibilitytojsonlambda1.read().write, true));
        parseLonglambda0 parselonglambda0 = setdeleteintentlambda0.ComponentActivity;
        parselonglambda0.IconCompatParcelizer("StationaryStateEvent arrived.", new Object[0]);
        Optional<getCooldownEnterSeconds.read> optional = setdeleteintentlambda0.read(j);
        Class clsIconCompatParcelizer = optional.IconCompatParcelizer() ? getBitmapFromCache.IconCompatParcelizer(optional.write(), getverticalaccuracy) : null;
        if (IconCompatParcelizer(clsIconCompatParcelizer)) {
            return arrayList2;
        }
        if (clsIconCompatParcelizer == r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg.class) {
            parselonglambda0.IconCompatParcelizer("Previous state was unconfirmed moving.", new Object[0]);
            Optional<getCooldownEnterSeconds.read> optional2 = setdeleteintentlambda0.read(optional.write().RemoteActionCompatParcelizer());
            Class clsIconCompatParcelizer2 = optional2.IconCompatParcelizer() ? getBitmapFromCache.IconCompatParcelizer(optional2.write(), getverticalaccuracy) : null;
            if (IconCompatParcelizer(clsIconCompatParcelizer2)) {
                parselonglambda0.IconCompatParcelizer("Prior to that, the state was stationary.", new Object[0]);
                getverticalaccuracy.getClass();
                Location locationWrite = getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda4);
                getCooldownEnterSeconds.read readVarWrite = optional.write();
                getCooldownEnterSeconds.read readVarWrite2 = optional2.write();
                ArrayList arrayList3 = new ArrayList();
                Location locationWrite2 = setdeleteintentlambda0.write(readVarWrite2.RemoteActionCompatParcelizer(setdeleteintentlambda0.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus), Long.valueOf(readVarWrite2.serializer()));
                if (locationWrite2 != null) {
                    parselonglambda0.IconCompatParcelizer("Distance between the two stationaries is %d meters.", Integer.valueOf((int) locationWrite.distanceTo(locationWrite2)));
                } else {
                    parselonglambda0.IconCompatParcelizer("Previous stationary has no location.", new Object[0]);
                }
                boolean z2 = locationWrite2 != null && locationWrite.distanceTo(locationWrite2) > 0.0f;
                long jSerializer3 = z2 ? readVarWrite.serializer() : j2;
                if (jSerializer3 - readVarWrite2.serializer() >= 172800000) {
                    Pair<Boolean, List<logBaiduNotificationClicklambda1>> pairSerializer = setdeleteintentlambda0.serializer(jSerializer3, readVarWrite2, (Byte) (byte) 1, false);
                    zBooleanValue = ((Boolean) pairSerializer.first).booleanValue();
                    arrayList3.addAll((Collection) pairSerializer.second);
                } else {
                    zBooleanValue = false;
                }
                if (z2) {
                    long jSerializer4 = readVarWrite.serializer();
                    if (!zBooleanValue) {
                        arrayList3.add(new refreshBannersIfAppropriate(setdeleteintent.read, detectionIdManager.IconCompatParcelizer(DetectionIdManager.Detection.STATIONARY), jSerializer4, (byte) 1));
                    }
                    parselonglambda0.IconCompatParcelizer("Injecting a trip.", new Object[0]);
                    arrayList3.addAll(setdeleteintentlambda0.read(jSerializer4, j2, locationWrite2, locationWrite, (Byte) (byte) 1));
                    DetectionIdManager.Detection detection = DetectionIdManager.Detection.STATIONARY;
                    detectionIdManager.serializer(detection);
                    arrayList3.add(new refreshBannersIfAppropriatelambda0(setdeleteintent.read, j2, detectionIdManager.IconCompatParcelizer(detection), handleincomingintent));
                    arrayList = arrayList3;
                    arrayList.add(new prefetchBitmapsIfNewlyReceivedStoryPushlambda10(setdeleteintent.read, locationWrite, detectionIdManager.IconCompatParcelizer(detection), j2, handleincomingintent));
                } else {
                    if (zBooleanValue) {
                        if (locationWrite2 != 0) {
                            locationWrite = locationWrite2;
                        }
                        locationWrite.setTime(jSerializer3);
                        arrayList3.addAll(setdeleteintentlambda0.IconCompatParcelizer(locationWrite, jSerializer3));
                    }
                    arrayList = arrayList3;
                }
                arrayList2.addAll(arrayList);
                return arrayList2;
            }
            if (clsIconCompatParcelizer2 == BrazeBootReceiver.class) {
                jSerializer = optional2.write().serializer();
            } else {
                jSerializer = j2;
            }
        } else if (Arrays.asList(setShouldPersistWebView.class, r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I.class, BrazeActivityLifecycleCallbackListeneronActivityCreated2.class).contains(clsIconCompatParcelizer)) {
            if (clsIconCompatParcelizer == BrazeActivityLifecycleCallbackListeneronActivityCreated2.class) {
                jSerializer2 = optional.write().serializer();
                Optional<getCooldownEnterSeconds.read> optional3 = setdeleteintentlambda0.read(optional.write().RemoteActionCompatParcelizer());
                if ((optional3.IconCompatParcelizer() ? getBitmapFromCache.IconCompatParcelizer(optional3.write(), getverticalaccuracy) : null) == BrazeBootReceiver.class) {
                    parselonglambda0.IconCompatParcelizer("Previous state was of type unconfirmed stationary, preceded by an unknown.", new Object[0]);
                    jSerializer2 = optional3.write().serializer();
                    z = false;
                } else {
                    parselonglambda0.IconCompatParcelizer("Previous state was of type unconfirmed stationary, preceded by a moving. Stopping the trip.", new Object[0]);
                }
                if (z) {
                    arrayList2.addAll(setdeleteintentlambda0.RemoteActionCompatParcelizer(jSerializer2, true));
                    String strIconCompatParcelizer = detectionIdManager.IconCompatParcelizer(DetectionIdManager.Detection.TRIP);
                    getverticalaccuracy.getClass();
                    Location location = new Location(getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda4));
                    location.setProvider("stationary");
                    arrayList2.add(setdeleteintent.serializer(location, strIconCompatParcelizer));
                    parselonglambda0.IconCompatParcelizer("Previous state was of type moving. Stopping the trip.", new Object[0]);
                    if (clsIconCompatParcelizer == r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I.class) {
                        detectionTrigger = DetectionTrigger.EXTERNAL;
                    } else {
                        detectionTrigger = DetectionTrigger.SDK;
                    }
                    byte b = clsIconCompatParcelizer == r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I.class ? (byte) 2 : (byte) 1;
                    setDeleteIntent setdeleteintent2 = setdeleteintentlambda0.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                    DetectionTrigger detectionTrigger2 = DetectionTrigger.SDK;
                    arrayList2.add(setdeleteintent2.write(jSerializer2, detectionTrigger2, b, strIconCompatParcelizer));
                    arrayList2.addAll(setdeleteintentlambda0.serializer(jSerializer2, detectionTrigger, detectionTrigger2, Byte.valueOf(b)));
                }
                jSerializer = jSerializer2;
            } else {
                parselonglambda0.IconCompatParcelizer("Previous state was of type moving. Stopping the trip.", new Object[0]);
                jSerializer2 = j2;
            }
            z = true;
            if (z) {
                arrayList2.addAll(setdeleteintentlambda0.RemoteActionCompatParcelizer(jSerializer2, true));
                String strIconCompatParcelizer2 = detectionIdManager.IconCompatParcelizer(DetectionIdManager.Detection.TRIP);
                getverticalaccuracy.getClass();
                Location location2 = new Location(getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda4));
                location2.setProvider("stationary");
                arrayList2.add(setdeleteintent.serializer(location2, strIconCompatParcelizer2));
                parselonglambda0.IconCompatParcelizer("Previous state was of type moving. Stopping the trip.", new Object[0]);
                if (clsIconCompatParcelizer == r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I.class) {
                    detectionTrigger = DetectionTrigger.EXTERNAL;
                } else {
                    detectionTrigger = DetectionTrigger.SDK;
                }
                if (clsIconCompatParcelizer == r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I.class) {
                }
                setDeleteIntent setdeleteintent3 = setdeleteintentlambda0.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                DetectionTrigger detectionTrigger3 = DetectionTrigger.SDK;
                arrayList2.add(setdeleteintent3.write(jSerializer2, detectionTrigger3, b, strIconCompatParcelizer2));
                arrayList2.addAll(setdeleteintentlambda0.serializer(jSerializer2, detectionTrigger, detectionTrigger3, Byte.valueOf(b)));
            }
            jSerializer = jSerializer2;
        } else if (clsIconCompatParcelizer == BrazeBootReceiver.class) {
            jSerializer = optional.write().serializer();
        } else {
            jSerializer = j2;
        }
        DetectionIdManager.Detection detection2 = DetectionIdManager.Detection.STATIONARY;
        detectionIdManager.serializer(detection2);
        parselonglambda0.IconCompatParcelizer("Creating stationary start payload.", new Object[0]);
        getverticalaccuracy.getClass();
        Location locationWrite3 = getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda4);
        arrayList2.add(new refreshBannersIfAppropriatelambda0(setdeleteintent.read, jSerializer, detectionIdManager.IconCompatParcelizer(detection2), handleincomingintent));
        arrayList2.add(new prefetchBitmapsIfNewlyReceivedStoryPushlambda10(setdeleteintent.read, locationWrite3, detectionIdManager.IconCompatParcelizer(detection2), jSerializer, handleincomingintent));
        return arrayList2;
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.write();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        reenqueueInAppMessage reenqueueinappmessage;
        Long lValueOf;
        long jRemoteActionCompatParcelizer;
        Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k> clsWrite;
        setSummaryTextIfPresentAndSupported setsummarytextifpresentandsupported = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        setsummarytextifpresentandsupported.RemoteActionCompatParcelizer();
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        setSummaryTextIfPresentAndSupportedlambda0 setsummarytextifpresentandsupportedlambda0 = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        Optional<getCooldownEnterSeconds.read> optional = read(setsummarytextifpresentandsupportedlambda0.write(jCurrentTimeMillis));
        boolean zIconCompatParcelizer = optional.IconCompatParcelizer();
        getVerticalAccuracy getverticalaccuracy = this.ResultReceiver;
        if (zIconCompatParcelizer) {
            setsummarytextifpresentandsupported.RemoteActionCompatParcelizer(setAccentColorIfPresentAndSupportedlambda10.class, getBitmapFromCache.IconCompatParcelizer(optional.write(), getverticalaccuracy), optional.write().RemoteActionCompatParcelizer());
        }
        Optional<getCooldownEnterSeconds.read> optional2 = read(setsummarytextifpresentandsupportedlambda0.write(System.currentTimeMillis()));
        boolean zIconCompatParcelizer2 = optional2.IconCompatParcelizer();
        getCooldownEnterSeconds getcooldownenterseconds = this.MediaSessionCompatResultReceiverWrapper;
        if (zIconCompatParcelizer2) {
            setsummarytextifpresentandsupported.RemoteActionCompatParcelizer(sendPushActionIntent.class, getBitmapFromCache.IconCompatParcelizer(optional2.write(), getverticalaccuracy), optional2.write().RemoteActionCompatParcelizer());
            Optional optionalWrite = getcooldownenterseconds.write(optional2.write().serializer(), invokeFallbackFirebaseServicelambda2.IconCompatParcelizer, true);
            if (optionalWrite.IconCompatParcelizer()) {
                Optional optionalWrite2 = getcooldownenterseconds.write(optional2.write().serializer(), Collections.singletonList(invokeSuspendlambda0.class), true);
                if (optionalWrite2.IconCompatParcelizer() && ((getCooldownEnterSeconds.read) optionalWrite2.write()).serializer() < ((getCooldownEnterSeconds.read) optionalWrite.write()).serializer()) {
                    setsummarytextifpresentandsupported.RemoteActionCompatParcelizer(sendPushActionIntent.class, invokeSuspendlambda0.class, ((getCooldownEnterSeconds.read) optionalWrite2.write()).serializer());
                }
            }
        }
        Optional<getCooldownEnterSeconds.read> optional3 = read(setsummarytextifpresentandsupportedlambda0.write(System.currentTimeMillis()));
        if (optional3.IconCompatParcelizer()) {
            setsummarytextifpresentandsupported.RemoteActionCompatParcelizer(refreshBannersIfAppropriatelambda0.class, getBitmapFromCache.IconCompatParcelizer(optional3.write(), getverticalaccuracy), optional3.write().RemoteActionCompatParcelizer());
            if (optional3.write().MediaSessionCompatQueueItem() == ((Integer) getVerticalAccuracy.IconCompatParcelizer(r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg.class).write()).intValue()) {
                Optional<getCooldownEnterSeconds.read> optional4 = read(optional3.write().RemoteActionCompatParcelizer());
                if (optional4.IconCompatParcelizer()) {
                    setsummarytextifpresentandsupported.RemoteActionCompatParcelizer(refreshBannersIfAppropriatelambda0.class, getVerticalAccuracy.write(optional4.write().MediaSessionCompatQueueItem()), optional4.write().RemoteActionCompatParcelizer());
                }
            }
        }
        Optional<getCooldownEnterSeconds.read> optional5 = read(setsummarytextifpresentandsupportedlambda0.write(System.currentTimeMillis()));
        if (optional5.IconCompatParcelizer()) {
            setsummarytextifpresentandsupported.RemoteActionCompatParcelizer(refreshBannersIfAppropriate.class, getBitmapFromCache.IconCompatParcelizer(optional5.write(), getverticalaccuracy), optional5.write().RemoteActionCompatParcelizer());
            if (optional5.write().MediaSessionCompatQueueItem() == ((Integer) getVerticalAccuracy.IconCompatParcelizer(r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg.class).write()).intValue()) {
                Optional<getCooldownEnterSeconds.read> optional6 = read(optional5.write().RemoteActionCompatParcelizer());
                if (optional6.IconCompatParcelizer()) {
                    setsummarytextifpresentandsupported.RemoteActionCompatParcelizer(refreshBannersIfAppropriate.class, getVerticalAccuracy.write(optional6.write().MediaSessionCompatQueueItem()), optional6.write().RemoteActionCompatParcelizer());
                }
            }
        }
        Optional<getCooldownEnterSeconds.read> optional7 = read(setsummarytextifpresentandsupportedlambda0.write(System.currentTimeMillis()));
        boolean z = false;
        if (optional7.IconCompatParcelizer() && getBitmapFromCache.IconCompatParcelizer(optional7.write(), getverticalaccuracy) == r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg.class) {
            Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer = getcooldownenterseconds.RemoteActionCompatParcelizer(invokeFallbackFirebaseServicelambda2.IconCompatParcelizer, Long.valueOf(optional7.write().serializer()), false);
            if (optionalRemoteActionCompatParcelizer.IconCompatParcelizer() && (clsWrite = getVerticalAccuracy.write(optionalRemoteActionCompatParcelizer.write().MediaSessionCompatQueueItem())) != null && IconCompatParcelizer(clsWrite)) {
                setsummarytextifpresentandsupported.RemoteActionCompatParcelizer(handleCancelNotificationActionlambda0.class, clsWrite, optionalRemoteActionCompatParcelizer.write().RemoteActionCompatParcelizer());
            }
        }
        Optional<getCooldownEnterSeconds.read> optional8 = read(setsummarytextifpresentandsupportedlambda0.write(System.currentTimeMillis()));
        if (optional8.IconCompatParcelizer()) {
            Class clsIconCompatParcelizer = getBitmapFromCache.IconCompatParcelizer(optional8.write(), getverticalaccuracy);
            if (clsIconCompatParcelizer != r8lambdaQOq3wL0Ry1sJDGdfdXHrnvb36L4.class && !IconCompatParcelizer(clsIconCompatParcelizer)) {
                long jRemoteActionCompatParcelizer2 = optional8.write().RemoteActionCompatParcelizer();
                if (clsIconCompatParcelizer == r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I.class) {
                    setsummarytextifpresentandsupported.RemoteActionCompatParcelizer(setAccentColorIfPresentAndSupportedlambda0.class, getShouldPersistWebView.class, jRemoteActionCompatParcelizer2);
                }
                if (clsIconCompatParcelizer == setShouldPersistWebView.class || clsIconCompatParcelizer == r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I.class) {
                    Optional<getCooldownEnterSeconds.read> optional9 = read(jRemoteActionCompatParcelizer2);
                    if (optional9.IconCompatParcelizer()) {
                        Class clsWrite2 = getVerticalAccuracy.write(optional9.write().MediaSessionCompatQueueItem());
                        if (clsWrite2 == BrazeBootReceiver.class || IconCompatParcelizer(clsWrite2)) {
                            jRemoteActionCompatParcelizer2 = optional9.write().RemoteActionCompatParcelizer();
                            if (IconCompatParcelizer(clsWrite2)) {
                                jRemoteActionCompatParcelizer = jRemoteActionCompatParcelizer2;
                                jRemoteActionCompatParcelizer2 = jRemoteActionCompatParcelizer;
                                z = true;
                            }
                        } else if (clsWrite2 == r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg.class) {
                            Optional<getCooldownEnterSeconds.read> optional10 = read(optional9.write().RemoteActionCompatParcelizer());
                            if (optional10.IconCompatParcelizer() && IconCompatParcelizer(getVerticalAccuracy.write(optional10.write().MediaSessionCompatQueueItem()))) {
                                jRemoteActionCompatParcelizer = optional10.write().RemoteActionCompatParcelizer();
                                jRemoteActionCompatParcelizer2 = jRemoteActionCompatParcelizer;
                                z = true;
                            }
                        }
                        if (z) {
                            setsummarytextifpresentandsupported.RemoteActionCompatParcelizer(setAccentColorIfPresentAndSupportedlambda0.class, r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU.class, jRemoteActionCompatParcelizer2);
                        }
                    }
                } else if (clsIconCompatParcelizer == r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg.class || clsIconCompatParcelizer == r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A.class) {
                    Optional<getCooldownEnterSeconds.read> optional11 = read(jRemoteActionCompatParcelizer2);
                    if (optional11.IconCompatParcelizer()) {
                        jRemoteActionCompatParcelizer2 = optional11.write().RemoteActionCompatParcelizer();
                        setsummarytextifpresentandsupported.RemoteActionCompatParcelizer(setAccentColorIfPresentAndSupportedlambda0.class, r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU.class, jRemoteActionCompatParcelizer2);
                    }
                }
                Iterator<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>> it = invokeFallbackFirebaseServicelambda2.IconCompatParcelizer.iterator();
                while (it.hasNext()) {
                    setsummarytextifpresentandsupported.RemoteActionCompatParcelizer(setAccentColorIfPresentAndSupportedlambda0.class, it.next(), jRemoteActionCompatParcelizer2);
                }
                setsummarytextifpresentandsupported.RemoteActionCompatParcelizer(setAccentColorIfPresentAndSupportedlambda0.class, r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, jRemoteActionCompatParcelizer2);
                setsummarytextifpresentandsupported.RemoteActionCompatParcelizer(setAccentColorIfPresentAndSupportedlambda0.class, r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU.class, jRemoteActionCompatParcelizer2);
                setsummarytextifpresentandsupported.RemoteActionCompatParcelizer(setAccentColorIfPresentAndSupportedlambda0.class, setSessionHandlingBlocklist.class, jRemoteActionCompatParcelizer2);
                setsummarytextifpresentandsupported.RemoteActionCompatParcelizer(setAccentColorIfPresentAndSupportedlambda0.class, BrazeUser.class, jRemoteActionCompatParcelizer2);
                setsummarytextifpresentandsupported.RemoteActionCompatParcelizer(setAccentColorIfPresentAndSupportedlambda0.class, retryInAppMessage.class, jRemoteActionCompatParcelizer2);
                setsummarytextifpresentandsupported.RemoteActionCompatParcelizer(setAccentColorIfPresentAndSupportedlambda0.class, r8lambda2L1vxSWbmFUTP9A4iejxpq7ZF7A.class, jRemoteActionCompatParcelizer2);
            } else if (IconCompatParcelizer(clsIconCompatParcelizer)) {
                setsummarytextifpresentandsupported.RemoteActionCompatParcelizer(setAccentColorIfPresentAndSupportedlambda0.class, r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU.class, optional8.write().RemoteActionCompatParcelizer());
            }
        }
        Optional optional12 = getcooldownenterseconds.read(r8lambdaFjiFiJxJXuf3VopUwRuT7TXivug.class, Long.valueOf(setsummarytextifpresentandsupportedlambda0.write(System.currentTimeMillis())));
        if (optional12.IconCompatParcelizer()) {
            setsummarytextifpresentandsupported.RemoteActionCompatParcelizer(handleNotificationDeletedlambda1.class, getBitmapFromCache.IconCompatParcelizer((getCooldownEnterSeconds.read) optional12.write(), getverticalaccuracy), ((getCooldownEnterSeconds.read) optional12.write()).RemoteActionCompatParcelizer());
        }
        if (this.RatingCompat.read().serializer) {
            Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer2 = getcooldownenterseconds.RemoteActionCompatParcelizer(Arrays.asList(r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A.class, wipeDatalambda0.class), Long.valueOf(setsummarytextifpresentandsupportedlambda0.write(System.currentTimeMillis())), true);
            if (optionalRemoteActionCompatParcelizer2.IconCompatParcelizer()) {
                lValueOf = getBitmapFromCache.IconCompatParcelizer(optionalRemoteActionCompatParcelizer2.write(), getverticalaccuracy) == r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A.class ? Long.valueOf(RemoteActionCompatParcelizer(optionalRemoteActionCompatParcelizer2.write()).RemoteActionCompatParcelizer()) : Long.valueOf(optionalRemoteActionCompatParcelizer2.write().RemoteActionCompatParcelizer());
            } else {
                lValueOf = null;
            }
            if (lValueOf != null) {
                setsummarytextifpresentandsupported.RemoteActionCompatParcelizer(refreshBannersIfAppropriate.class, r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, lValueOf.longValue());
            }
        }
        Optional<getCooldownEnterSeconds.read> optional13 = read(setsummarytextifpresentandsupportedlambda0.write(System.currentTimeMillis()));
        if (!optional13.read()) {
            long jRemoteActionCompatParcelizer3 = optional13.write().RemoteActionCompatParcelizer();
            if (getBitmapFromCache.IconCompatParcelizer(optional13.write(), getverticalaccuracy) == r8lambdaQOq3wL0Ry1sJDGdfdXHrnvb36L4.class) {
                Optional<getCooldownEnterSeconds.read> optional14 = read(optional13.write().RemoteActionCompatParcelizer());
                if (optional14.IconCompatParcelizer()) {
                    jRemoteActionCompatParcelizer3 = optional14.write().RemoteActionCompatParcelizer();
                }
            }
            setsummarytextifpresentandsupported.RemoteActionCompatParcelizer(r8lambdaQOq3wL0Ry1sJDGdfdXHrnvb36L4.class, invokeSuspendlambda0.class, jRemoteActionCompatParcelizer3);
        }
        long jWrite = setsummarytextifpresentandsupportedlambda0.write(System.currentTimeMillis());
        Iterator it2 = setCategoryIfPresentAndSupported.write().serializer().iterator();
        while (it2.hasNext()) {
            ((IPropertiesObjectCompanion) ((getValidNotificationChannellambda0) setPushUniqueId.read((Class) it2.next()))).read(jWrite, setsummarytextifpresentandsupported);
        }
        Optional optional15 = getcooldownenterseconds.read(reenqueueInAppMessage.class, Long.valueOf(setsummarytextifpresentandsupportedlambda0.write(System.currentTimeMillis())));
        if (optional15.IconCompatParcelizer()) {
            long jRemoteActionCompatParcelizer4 = ((getCooldownEnterSeconds.read) optional15.write()).RemoteActionCompatParcelizer();
            setsummarytextifpresentandsupported.RemoteActionCompatParcelizer(handleNotificationDeleted.class, reenqueueInAppMessage.class, jRemoteActionCompatParcelizer4);
            r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = ((getCooldownEnterSeconds.read) optional15.write()).RemoteActionCompatParcelizer(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
            if (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer != null && (reenqueueinappmessage = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ) != null && reenqueueinappmessage.write.byteValue() == 1) {
                setsummarytextifpresentandsupported.RemoteActionCompatParcelizer(handleNotificationDeleted.class, r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, jRemoteActionCompatParcelizer4);
                setsummarytextifpresentandsupported.RemoteActionCompatParcelizer(handleNotificationDeleted.class, BrazeUser.class, jRemoteActionCompatParcelizer4);
            }
        }
        Optional<getCooldownEnterSeconds.read> optionalIconCompatParcelizer = getcooldownenterseconds.IconCompatParcelizer(r8lambdaNpc69WZEQAEI66OXsnhLEbhuSqI.class, (Long) null);
        if (optionalIconCompatParcelizer.IconCompatParcelizer()) {
            setsummarytextifpresentandsupported.RemoteActionCompatParcelizer(refreshFeatureFlagsIfAppropriatelambda1.class, getBitmapFromCache.IconCompatParcelizer(optionalIconCompatParcelizer.write(), getverticalaccuracy), optionalIconCompatParcelizer.write().RemoteActionCompatParcelizer());
        }
        Optional<getCooldownEnterSeconds.read> optionalIconCompatParcelizer2 = getcooldownenterseconds.IconCompatParcelizer(r8lambdaK6IZILH9V8ErT5zK67D8Tg0VC8Q.class, (Long) null);
        if (optionalIconCompatParcelizer2.IconCompatParcelizer()) {
            setsummarytextifpresentandsupported.RemoteActionCompatParcelizer(routeUserWithNotificationOpenedIntent.class, getBitmapFromCache.IconCompatParcelizer(optionalIconCompatParcelizer2.write(), getverticalaccuracy), optionalIconCompatParcelizer2.write().RemoteActionCompatParcelizer());
        }
        long jWrite2 = setsummarytextifpresentandsupportedlambda0.write(System.currentTimeMillis());
        Iterator it3 = getverticalaccuracy.write().iterator();
        while (it3.hasNext()) {
            setsummarytextifpresentandsupported.RemoteActionCompatParcelizer(setDeleteIntentlambda0.class, (Class) it3.next(), jWrite2);
        }
        return setsummarytextifpresentandsupported.read();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        clearData();
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.clearData();
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.clearData();
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.clearData();
        this.RatingCompat.read(new setLargeIconIfPresentAndSupportedlambda4(null, false));
        this.serializer.serializer();
    }

    public setDeleteIntentlambda0(getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, getCooldownEnterSeconds getcooldownenterseconds, setDeleteIntent setdeleteintent, component4android_sdk_base_release component4android_sdk_base_releaseVar, getVerticalAccuracy getverticalaccuracy, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, parseLonglambda0 parselonglambda0, DetectionIdManager detectionIdManager, populateNotificationBuilderlambda1 populatenotificationbuilderlambda1, setSummaryTextIfPresentAndSupported setsummarytextifpresentandsupported, setTitleIfPresent settitleifpresent, wakeScreenIfAppropriatelambda3 wakescreenifappropriatelambda3, initializeGeofenceslambda0 initializegeofenceslambda0, ConfigurationManager configurationManager, getTrackingStringandroid_sdk_base_releaseannotations gettrackingstringandroid_sdk_base_releaseannotations, retrieveRegisteredGeofencesFromLocalStorageandroid_sdk_location_release retrieveregisteredgeofencesfromlocalstorageandroid_sdk_location_release, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, setSummaryTextIfPresentAndSupportedlambda0 setsummarytextifpresentandsupportedlambda0, sendPushActionIntentlambda0 sendpushactionintentlambda0) {
        this.PlaybackStateCompatCustomAction = getanalyticsenabledenterannotations;
        this.MediaSessionCompatResultReceiverWrapper = getcooldownenterseconds;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = setdeleteintent;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = component4android_sdk_base_releaseVar;
        this.ResultReceiver = getverticalaccuracy;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.ComponentActivity = parselonglambda0;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = detectionIdManager;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = populatenotificationbuilderlambda1;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = readandroid_sdk_base_releaseVar;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = setsummarytextifpresentandsupportedlambda0;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = setsummarytextifpresentandsupported;
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = settitleifpresent;
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = wakescreenifappropriatelambda3;
        this.RemoteActionCompatParcelizer = configurationManager;
        this.IconCompatParcelizer = gettrackingstringandroid_sdk_base_releaseannotations;
        this.read = retrieveregisteredgeofencesfromlocalstorageandroid_sdk_location_release;
        this.MediaDescriptionCompat = sendpushactionintentlambda0;
        this.serializer = new getValidNotificationChannellambda3(initializegeofenceslambda0, setdeleteintent, getcooldownenterseconds, component4android_sdk_base_releaseVar, setsummarytextifpresentandsupportedlambda0.write(0L));
        this.MediaMetadataCompat = new setPublicVersionIfPresentAndSupportedlambda0(this, readandroid_sdk_base_releaseVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean IconCompatParcelizer(Class cls) {
        return Arrays.asList(r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A.class, wipeDatalambda0.class).contains(cls);
    }

    private ArrayList serializer(long j) {
        this.ComponentActivity.IconCompatParcelizer("Injecting StationaryStop at:" + com.sentiance.sdk.util.x.c(j), new Object[0]);
        return com.sentiance.sdk.util.x.IconCompatParcelizer(new refreshBannersIfAppropriate(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read, this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.IconCompatParcelizer(DetectionIdManager.Detection.STATIONARY), j, (byte) 3));
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        this.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer(addBannerViewMonitor.class, this.MediaMetadataCompat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Optional<getCooldownEnterSeconds.read> read(long j) {
        return this.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer(invokeFallbackFirebaseServicelambda2.IconCompatParcelizer, Long.valueOf(j), true);
    }

    private void RemoteActionCompatParcelizer(Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k> cls, setSoundIfPresentAndSupportedlambda0<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k> setsoundifpresentandsupportedlambda0) {
        HashMap map = this.MediaSessionCompatQueueItem;
        List arrayList = (List) map.get(cls);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        arrayList.add(setsoundifpresentandsupportedlambda0);
        map.put(cls, arrayList);
    }

    public static boolean read(setDeleteIntentlambda0 setdeleteintentlambda0, List list, long j) {
        Optional<getCooldownEnterSeconds.read> optional = setdeleteintentlambda0.read(j);
        if (!optional.IconCompatParcelizer()) {
            return false;
        }
        Class clsIconCompatParcelizer = getBitmapFromCache.IconCompatParcelizer(optional.write(), setdeleteintentlambda0.ResultReceiver);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (clsIconCompatParcelizer == ((Class) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static void IconCompatParcelizer(setDeleteIntentlambda0 setdeleteintentlambda0, logBaiduNotificationClicklambda1 logbaidunotificationclicklambda1) {
        Pair<getCustomLocationProviderNamesandroid_sdk_base_release, isValidNotificationVisibility> next;
        parseLonglambda0 parselonglambda0 = setdeleteintentlambda0.ComponentActivity;
        Iterator<Pair<getCustomLocationProviderNamesandroid_sdk_base_release, isValidNotificationVisibility>> itWrite = logbaidunotificationclicklambda1.write();
        while (itWrite.hasNext() && (next = itWrite.next()) != null) {
            getCustomLocationProviderNamesandroid_sdk_base_release getcustomlocationprovidernamesandroid_sdk_base_release = (getCustomLocationProviderNamesandroid_sdk_base_release) next.first;
            isValidNotificationVisibility isvalidnotificationvisibility = (isValidNotificationVisibility) next.second;
            if (getcustomlocationprovidernamesandroid_sdk_base_release == null) {
                parselonglambda0.IconCompatParcelizer("%s returned a null payload", logbaidunotificationclicklambda1.getClass().getName());
                return;
            }
            List list = getcustomlocationprovidernamesandroid_sdk_base_release.IconCompatParcelizer;
            wakeScreenIfAppropriatelambda3.serializer serializerVarWrite = setdeleteintentlambda0.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.write(getcustomlocationprovidernamesandroid_sdk_base_release, isvalidnotificationvisibility, setdeleteintentlambda0.MediaSessionCompatToken);
            if (serializerVarWrite == null) {
                return;
            }
            if (logbaidunotificationclicklambda1 instanceof setAccentColorIfPresentAndSupportedlambda0) {
                if (((incrementCustomUserAttributedefault) list.get(0)).write.RemoteActionCompatParcelizer.read.read != null) {
                    setdeleteintentlambda0.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.write(((incrementCustomUserAttributedefault) list.get(0)).write.RemoteActionCompatParcelizer.read.read.IconCompatParcelizer);
                } else {
                    parselonglambda0.RemoteActionCompatParcelizer("Error removing trip from trip id tracker. Expected a trip payload but received %s", ((incrementCustomUserAttributedefault) list.get(0)).write.RemoteActionCompatParcelizer.read.toString());
                }
            }
            parselonglambda0.IconCompatParcelizer("Stored %s payload", serializerVarWrite.write);
            setdeleteintentlambda0.MediaBrowserCompatMediaItem.add(serializerVarWrite);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IconCompatParcelizer(long j) {
        DetectionIdManager.Detection detection = DetectionIdManager.Detection.TRIP;
        DetectionIdManager detectionIdManager = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        detectionIdManager.serializer(detection);
        String strIconCompatParcelizer = detectionIdManager.IconCompatParcelizer(detection);
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.IconCompatParcelizer(strIconCompatParcelizer, j);
        this.ComponentActivity.IconCompatParcelizer("Chunking the trip. New trip id is %s.", strIconCompatParcelizer);
    }

    public static List IconCompatParcelizer(setDeleteIntentlambda0 setdeleteintentlambda0, Class cls) {
        List list = (List) setdeleteintentlambda0.MediaSessionCompatQueueItem.get(cls);
        List list2 = Collections.EMPTY_LIST;
        if (list == null) {
            list = list2;
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList RemoteActionCompatParcelizer(long j, boolean z) {
        DetectionTrigger detectionTrigger;
        byte b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.RemoteActionCompatParcelizer().keySet());
        boolean zIsEmpty = arrayList2.isEmpty();
        parseLonglambda0 parselonglambda0 = this.ComponentActivity;
        if (zIsEmpty) {
            parselonglambda0.IconCompatParcelizer("No trips are currently being tracked.", new Object[0]);
            return arrayList;
        }
        byte b2 = 1;
        long jLongValue = ((Long) af$$ExternalSyntheticOutline0.m(1, arrayList2)).longValue();
        parselonglambda0.IconCompatParcelizer("chunkTripIfPossible, startTime: %s, stopTime: %s. It has been %d mins since trip start.", com.sentiance.sdk.util.x.c(jLongValue), com.sentiance.sdk.util.x.c(j), Long.valueOf((j - jLongValue) / 60000));
        long j2 = jLongValue + 14400000;
        while (j2 <= j && (!z || j2 != j)) {
            parselonglambda0.IconCompatParcelizer("Chunking trip at %s", com.sentiance.sdk.util.x.c(j2));
            ArrayList arrayList3 = new ArrayList();
            DetectionTrigger detectionTrigger2 = DetectionTrigger.SDK;
            if (this.RatingCompat.read().write == r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I.class) {
                detectionTrigger = DetectionTrigger.EXTERNAL;
                b = 2;
            } else {
                detectionTrigger = detectionTrigger2;
                b = b2;
            }
            DetectionIdManager.Detection detection = DetectionIdManager.Detection.TRIP;
            DetectionIdManager detectionIdManager = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
            arrayList3.add(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.write(j2, detectionTrigger, b, detectionIdManager.IconCompatParcelizer(detection)));
            IconCompatParcelizer(j2);
            String strIconCompatParcelizer = detectionIdManager.IconCompatParcelizer(detection);
            r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I r8lambdaxnkp5mxo9act549dmvgqnyhj0iIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer(j2);
            arrayList3.addAll(read(j2, detectionTrigger, strIconCompatParcelizer, r8lambdaxnkp5mxo9act549dmvgqnyhj0iIconCompatParcelizer == null ? null : r8lambdaxnkp5mxo9act549dmvgqnyhj0iIconCompatParcelizer.IconCompatParcelizer, r8lambdaxnkp5mxo9act549dmvgqnyhj0iIconCompatParcelizer == null ? null : r8lambdaxnkp5mxo9act549dmvgqnyhj0iIconCompatParcelizer.read, false));
            arrayList.addAll(arrayList3);
            j2 += 14400000;
            b2 = 1;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList serializer(long j, DetectionTrigger detectionTrigger, DetectionTrigger detectionTrigger2, Byte b) {
        setSummaryTextIfPresentAndSupportedlambda0 setsummarytextifpresentandsupportedlambda0 = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        boolean zIconCompatParcelizer = setsummarytextifpresentandsupportedlambda0.IconCompatParcelizer();
        setsummarytextifpresentandsupportedlambda0.RemoteActionCompatParcelizer(false);
        LinkedHashMap<Long, String> linkedHashMapRemoteActionCompatParcelizer = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.RemoteActionCompatParcelizer();
        setDeleteIntent setdeleteintent = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        return com.sentiance.sdk.util.x.IconCompatParcelizer(new setAccentColorIfPresentAndSupportedlambda0(setdeleteintent.read, this.MediaSessionCompatResultReceiverWrapper, this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, linkedHashMapRemoteActionCompatParcelizer, this.ResultReceiver, j, detectionTrigger, detectionTrigger2, b, this.ComponentActivity, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, zIconCompatParcelizer, setdeleteintent.serializer, this.MediaDescriptionCompat));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList read(long j, DetectionTrigger detectionTrigger, String str, Map map, Byte b, boolean z) {
        if (z) {
            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.RemoteActionCompatParcelizer(true);
        }
        return com.sentiance.sdk.util.x.IconCompatParcelizer(new setAccentColorIfPresentAndSupportedlambda10(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read, detectionTrigger, j, str, map, b));
    }

    public static ArrayList write(setDeleteIntentlambda0 setdeleteintentlambda0, invokeSuspendlambda0 invokesuspendlambda0, long j) {
        Byte b;
        DetectionIdManager detectionIdManager = setdeleteintentlambda0.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        DetectionIdManager.Detection detectionFromOtgReasonConstant = DetectionIdManager.Detection.fromOtgReasonConstant(invokesuspendlambda0.RemoteActionCompatParcelizer.byteValue());
        setDeleteIntent setdeleteintent = setdeleteintentlambda0.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        byte bByteValue = invokesuspendlambda0.RemoteActionCompatParcelizer.byteValue();
        setdeleteintent.getClass();
        logBaiduNotificationClicklambda1 handlepushstorypageclickedlambda1 = null;
        switch (bByteValue) {
            case 1:
                b = (byte) 1;
                break;
            case 2:
                b = (byte) 6;
                break;
            case 3:
                b = (byte) 7;
                break;
            case 4:
                b = (byte) 10;
                break;
            case 5:
                b = (byte) 11;
                break;
            case 6:
            default:
                b = null;
                break;
            case 7:
                b = (byte) 17;
                break;
            case 8:
                b = (byte) 14;
                break;
            case 9:
                b = (byte) 15;
                break;
            case 10:
                b = (byte) 8;
                break;
            case 11:
                b = (byte) 9;
                break;
            case 12:
                b = (byte) 18;
                break;
            case 13:
                b = (byte) 19;
                break;
            case 14:
                b = (byte) 20;
                break;
            case 15:
                b = (byte) 21;
                break;
            case 16:
                b = (byte) 22;
                break;
        }
        if (detectionFromOtgReasonConstant != null && b != null) {
            boolean zBooleanValue = invokesuspendlambda0.read.booleanValue();
            parseLonglambda0 parselonglambda0 = setdeleteintentlambda0.ComponentActivity;
            if (zBooleanValue) {
                parselonglambda0.IconCompatParcelizer("OTG %s enabled", detectionFromOtgReasonConstant.name());
                handlepushstorypageclickedlambda1 = new logBaiduNotificationClicklambda0(setdeleteintent.read, j, detectionIdManager.IconCompatParcelizer(detectionFromOtgReasonConstant), b.byteValue());
            } else {
                parselonglambda0.IconCompatParcelizer("OTG %s disabled", detectionFromOtgReasonConstant.name());
                handlepushstorypageclickedlambda1 = new handlePushStoryPageClickedlambda1(setdeleteintent.read, j, detectionIdManager.IconCompatParcelizer(detectionFromOtgReasonConstant));
                detectionIdManager.serializer(detectionFromOtgReasonConstant);
            }
        }
        return com.sentiance.sdk.util.x.IconCompatParcelizer(handlepushstorypageclickedlambda1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x0015  */
    public Location write(r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsu, Long l) {
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4;
        if (r8lambdaqtf70aj7a5o7b4yj33reyelsu != null) {
            r8lambdaTURWeRtF3oTEvz1WenZeX5TdwA r8lambdaturwertf3otevz1wenzex5tdwa = r8lambdaqtf70aj7a5o7b4yj33reyelsu.serializer;
            if (r8lambdaturwertf3otevz1wenzex5tdwa == null) {
                brazeCompanionExternalSyntheticLambda4 = null;
            } else {
                r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A r8lambdadtwa3yx1e9cvszaagaemidzvt8a = r8lambdaturwertf3otevz1wenzex5tdwa.addObserverForBackInvoker;
                if (r8lambdadtwa3yx1e9cvszaagaemidzvt8a != null) {
                    brazeCompanionExternalSyntheticLambda4 = r8lambdadtwa3yx1e9cvszaagaemidzvt8a.write;
                } else {
                    wipeDatalambda0 wipedatalambda0 = r8lambdaturwertf3otevz1wenzex5tdwa.MediaBrowserCompatMediaItem;
                    if (wipedatalambda0 != null) {
                        brazeCompanionExternalSyntheticLambda4 = wipedatalambda0.RemoteActionCompatParcelizer;
                    } else {
                        brazeCompanionExternalSyntheticLambda4 = null;
                    }
                }
            }
            if (brazeCompanionExternalSyntheticLambda4 != null) {
                this.ResultReceiver.getClass();
                Location locationWrite = getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda4);
                if (l != null) {
                    locationWrite.setTime(l.longValue());
                }
                return locationWrite;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x009e  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c2 A[LOOP:2: B:31:0x00bc->B:33:0x00c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x0113  */
    /* JADX WARN: Code duplicated, block: B:51:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0124 A[SYNTHETIC] */
    public static ArrayList read(setDeleteIntentlambda0 setdeleteintentlambda0, long j, long j2, long j3, Byte b) {
        byte bByteValue;
        byte b2;
        Iterator it;
        int i;
        Location locationWrite;
        double latitude;
        float accuracy;
        double longitude;
        Location location;
        Iterator it2;
        r8lambdaTURWeRtF3oTEvz1WenZeX5TdwA r8lambdaturwertf3otevz1wenzex5tdwa;
        r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU r8lambdaibd0azdffjr6m_pevs2l1iejku;
        setDeleteIntent setdeleteintent = setdeleteintentlambda0.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        component4android_sdk_base_release component4android_sdk_base_releaseVar = setdeleteintentlambda0.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        getVerticalAccuracy getverticalaccuracy = setdeleteintentlambda0.ResultReceiver;
        DetectionIdManager detectionIdManager = setdeleteintentlambda0.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        ArrayList arrayList = new ArrayList();
        List<getCooldownEnterSeconds.read> listRemoteActionCompatParcelizer = setdeleteintentlambda0.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, Long.valueOf(j), Long.valueOf(j2), false, false);
        ArrayList<Location> arrayList2 = new ArrayList();
        Iterator<getCooldownEnterSeconds.read> it3 = listRemoteActionCompatParcelizer.iterator();
        while (it3.hasNext()) {
            r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = it3.next().RemoteActionCompatParcelizer(component4android_sdk_base_releaseVar);
            if (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer != null && (r8lambdaibd0azdffjr6m_pevs2l1iejku = (r8lambdaturwertf3otevz1wenzex5tdwa = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer).r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) != null && r8lambdaibd0azdffjr6m_pevs2l1iejku.RemoteActionCompatParcelizer.serializer.shortValue() <= 75) {
                BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = r8lambdaturwertf3otevz1wenzex5tdwa.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.RemoteActionCompatParcelizer;
                getverticalaccuracy.getClass();
                arrayList2.add(getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda4));
            }
        }
        Optional<getCooldownEnterSeconds.read> optional = setdeleteintentlambda0.read(j3);
        if (b != null) {
            bByteValue = b.byteValue();
        } else {
            if (optional.IconCompatParcelizer() && setdeleteintentlambda0.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.read(optional.write().serializer(), j2).IconCompatParcelizer()) {
                b2 = 3;
            } else {
                bByteValue = 2;
            }
            it = arrayList2.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((Location) it.next()).getAccuracy() <= 75.0f) {
                    i++;
                }
            }
            if (i >= 3) {
                latitude = 0.0d;
                accuracy = 0.0f;
                longitude = 0.0d;
                for (Location location2 : arrayList2) {
                    latitude = location2.getLatitude() + latitude;
                    longitude = location2.getLongitude() + longitude;
                    accuracy = location2.getAccuracy() + accuracy;
                }
                location = new Location("");
                location.setLatitude(latitude / ((double) arrayList2.size()));
                location.setLongitude(longitude / ((double) arrayList2.size()));
                location.setAccuracy(accuracy / arrayList2.size());
                setdeleteintentlambda0.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.getClass();
                location.setTime(System.currentTimeMillis());
                it2 = arrayList2.iterator();
                do {
                    if (it2.hasNext()) {
                        location.setTime(j);
                        DetectionIdManager.Detection detection = DetectionIdManager.Detection.STATIONARY;
                        detectionIdManager.serializer(detection);
                        arrayList.add(new refreshBannersIfAppropriatelambda0(setdeleteintent.read, j, detectionIdManager.IconCompatParcelizer(detection), null));
                        arrayList.add(new prefetchBitmapsIfNewlyReceivedStoryPushlambda10(setdeleteintent.read, location, detectionIdManager.IconCompatParcelizer(detection), j, null));
                        arrayList.add(new refreshBannersIfAppropriate(setdeleteintent.read, detectionIdManager.IconCompatParcelizer(detection), j2, b2));
                        return arrayList;
                    }
                } while (((Location) it2.next()).distanceTo(location) <= 50.0f);
            }
            if (optional.IconCompatParcelizer() || getBitmapFromCache.IconCompatParcelizer(optional.write(), getverticalaccuracy) != r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg.class) {
                locationWrite = null;
            } else {
                Optional<getCooldownEnterSeconds.read> optional2 = setdeleteintentlambda0.read(optional.write().RemoteActionCompatParcelizer());
                if (optional2.IconCompatParcelizer() && IconCompatParcelizer(getVerticalAccuracy.write(optional2.write().MediaSessionCompatQueueItem()))) {
                    locationWrite = setdeleteintentlambda0.write(optional2.write().RemoteActionCompatParcelizer(component4android_sdk_base_releaseVar), (Long) null);
                } else {
                    locationWrite = null;
                }
            }
            arrayList.addAll(setdeleteintentlambda0.read(j, j2, locationWrite, (Location) null, Byte.valueOf(b2)));
            return arrayList;
        }
        b2 = bByteValue;
        it = arrayList2.iterator();
        i = 0;
        while (it.hasNext()) {
            if (((Location) it.next()).getAccuracy() <= 75.0f) {
                i++;
            }
        }
        if (i >= 3) {
            latitude = 0.0d;
            accuracy = 0.0f;
            longitude = 0.0d;
            while (r7.hasNext()) {
                latitude = location2.getLatitude() + latitude;
                longitude = location2.getLongitude() + longitude;
                accuracy = location2.getAccuracy() + accuracy;
            }
            location = new Location("");
            location.setLatitude(latitude / ((double) arrayList2.size()));
            location.setLongitude(longitude / ((double) arrayList2.size()));
            location.setAccuracy(accuracy / arrayList2.size());
            setdeleteintentlambda0.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.getClass();
            location.setTime(System.currentTimeMillis());
            it2 = arrayList2.iterator();
            do {
                if (it2.hasNext()) {
                    location.setTime(j);
                    DetectionIdManager.Detection detection2 = DetectionIdManager.Detection.STATIONARY;
                    detectionIdManager.serializer(detection2);
                    arrayList.add(new refreshBannersIfAppropriatelambda0(setdeleteintent.read, j, detectionIdManager.IconCompatParcelizer(detection2), null));
                    arrayList.add(new prefetchBitmapsIfNewlyReceivedStoryPushlambda10(setdeleteintent.read, location, detectionIdManager.IconCompatParcelizer(detection2), j, null));
                    arrayList.add(new refreshBannersIfAppropriate(setdeleteintent.read, detectionIdManager.IconCompatParcelizer(detection2), j2, b2));
                    return arrayList;
                }
            } while (((Location) it2.next()).distanceTo(location) <= 50.0f);
        }
        if (optional.IconCompatParcelizer()) {
            locationWrite = null;
        } else {
            locationWrite = null;
        }
        arrayList.addAll(setdeleteintentlambda0.read(j, j2, locationWrite, (Location) null, Byte.valueOf(b2)));
        return arrayList;
    }

    private ArrayList write(long j, long j2) {
        ArrayList arrayList = new ArrayList();
        DetectionIdManager.Detection detection = DetectionIdManager.Detection.OTG_OUTAGE;
        DetectionIdManager detectionIdManager = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        detectionIdManager.serializer(detection);
        String strIconCompatParcelizer = detectionIdManager.IconCompatParcelizer(detection);
        parseLonglambda0 parselonglambda0 = this.ComponentActivity;
        parselonglambda0.IconCompatParcelizer("Injecting OTG start at:" + com.sentiance.sdk.util.x.c(j), new Object[0]);
        setDeleteIntent setdeleteintent = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        arrayList.add(new logBaiduNotificationClicklambda0(setdeleteintent.read, j, strIconCompatParcelizer, (byte) 17));
        parselonglambda0.IconCompatParcelizer("Injecting OTG end at:" + com.sentiance.sdk.util.x.c(j2), new Object[0]);
        arrayList.add(new handlePushStoryPageClickedlambda1(setdeleteintent.read, j2, strIconCompatParcelizer));
        return arrayList;
    }

    private ArrayList IconCompatParcelizer(Location location, long j) {
        ArrayList arrayList = new ArrayList();
        DetectionIdManager.Detection detection = DetectionIdManager.Detection.STATIONARY;
        DetectionIdManager detectionIdManager = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        detectionIdManager.serializer(detection);
        this.ComponentActivity.IconCompatParcelizer("Injecting StationaryStart at:" + com.sentiance.sdk.util.x.c(j), new Object[0]);
        String strIconCompatParcelizer = detectionIdManager.IconCompatParcelizer(detection);
        setDeleteIntent setdeleteintent = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        arrayList.add(new refreshBannersIfAppropriatelambda0(setdeleteintent.read, j, strIconCompatParcelizer, null));
        arrayList.add(new prefetchBitmapsIfNewlyReceivedStoryPushlambda10(setdeleteintent.read, location, detectionIdManager.IconCompatParcelizer(detection), j, null));
        return arrayList;
    }

    private getCooldownEnterSeconds.read RemoteActionCompatParcelizer(getCooldownEnterSeconds.read readVar) {
        if (getBitmapFromCache.IconCompatParcelizer(readVar, this.ResultReceiver) != r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A.class) {
            return readVar;
        }
        Optional<getCooldownEnterSeconds.read> optional = read(readVar.RemoteActionCompatParcelizer());
        return (optional.IconCompatParcelizer() && getVerticalAccuracy.write(optional.write().MediaSessionCompatQueueItem()) == wipeDatalambda0.class) ? optional.write() : readVar;
    }

    public static Pair IconCompatParcelizer(setDeleteIntentlambda0 setdeleteintentlambda0, long j, getCooldownEnterSeconds.read readVar, byte b) {
        boolean zBooleanValue;
        migrateTriggersReeligibilityToJsonlambda1<setLargeIconIfPresentAndSupportedlambda4> migratetriggersreeligibilitytojsonlambda1 = setdeleteintentlambda0.RatingCompat;
        getCooldownEnterSeconds.read readVarRemoteActionCompatParcelizer = setdeleteintentlambda0.RemoteActionCompatParcelizer(readVar);
        long jSerializer = readVarRemoteActionCompatParcelizer.serializer();
        ArrayList arrayList = new ArrayList();
        boolean z = j - jSerializer >= 172800000;
        parseLonglambda0 parselonglambda0 = setdeleteintentlambda0.ComponentActivity;
        if (!z) {
            parselonglambda0.IconCompatParcelizer("Normal stationary creating stationary stop payload.", new Object[0]);
            arrayList.add(new refreshBannersIfAppropriate(setdeleteintentlambda0.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read, setdeleteintentlambda0.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.IconCompatParcelizer(DetectionIdManager.Detection.STATIONARY), j, b));
            zBooleanValue = false;
        } else {
            parselonglambda0.IconCompatParcelizer("processing long stationary.", new Object[0]);
            Pair<Boolean, List<logBaiduNotificationClicklambda1>> pairSerializer = setdeleteintentlambda0.serializer(j, readVarRemoteActionCompatParcelizer, Byte.valueOf(b), true);
            zBooleanValue = ((Boolean) pairSerializer.first).booleanValue();
            arrayList.addAll((Collection) pairSerializer.second);
        }
        migratetriggersreeligibilitytojsonlambda1.read(new setLargeIconIfPresentAndSupportedlambda4(migratetriggersreeligibilitytojsonlambda1.read().write, false));
        return new Pair(Boolean.valueOf(zBooleanValue), arrayList);
    }

    private Pair<Boolean, List<logBaiduNotificationClicklambda1>> serializer(long j, getCooldownEnterSeconds.read readVar, Byte b, boolean z) {
        Location locationWrite;
        r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU r8lambdaibd0azdffjr6m_pevs2l1iejku;
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4;
        component4android_sdk_base_release component4android_sdk_base_releaseVar = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        Location locationWrite2 = write(readVar.RemoteActionCompatParcelizer(component4android_sdk_base_releaseVar), (Long) null);
        if (locationWrite2 == null) {
            this.ComponentActivity.IconCompatParcelizer("Stationary location null", new Object[0]);
            return new Pair<>(Boolean.FALSE, Collections.EMPTY_LIST);
        }
        ArrayList arrayList = new ArrayList();
        long jSerializer = readVar.serializer();
        List<getCooldownEnterSeconds.read> listRemoteActionCompatParcelizer = this.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, Long.valueOf(jSerializer), Long.valueOf(j), false, false);
        ArrayList arrayList2 = new ArrayList();
        Iterator<getCooldownEnterSeconds.read> it = listRemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = it.next().RemoteActionCompatParcelizer(component4android_sdk_base_releaseVar);
            if (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer != null) {
                r8lambdaTURWeRtF3oTEvz1WenZeX5TdwA r8lambdaturwertf3otevz1wenzex5tdwa = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer;
                if (r8lambdaturwertf3otevz1wenzex5tdwa == null || (r8lambdaibd0azdffjr6m_pevs2l1iejku = r8lambdaturwertf3otevz1wenzex5tdwa.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) == null || (brazeCompanionExternalSyntheticLambda4 = r8lambdaibd0azdffjr6m_pevs2l1iejku.RemoteActionCompatParcelizer) == null) {
                    locationWrite = null;
                } else {
                    this.ResultReceiver.getClass();
                    locationWrite = getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda4);
                }
                if (locationWrite != null && locationWrite.distanceTo(locationWrite2) <= 100.0f && locationWrite.getAccuracy() <= 100.0f) {
                    arrayList2.add(r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer);
                }
            }
        }
        for (int i = 0; i < arrayList2.size(); i++) {
            if (((r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU) arrayList2.get(i)).RemoteActionCompatParcelizer.longValue() - jSerializer > 165600000) {
                long jLongValue = ((r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU) arrayList2.get(i)).RemoteActionCompatParcelizer.longValue();
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(serializer(jSerializer));
                arrayList3.addAll(write(jSerializer, jLongValue));
                arrayList3.addAll(IconCompatParcelizer(locationWrite2, jLongValue));
                arrayList.addAll(arrayList3);
                ((r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU) arrayList2.get(i)).RemoteActionCompatParcelizer.getClass();
            }
            jSerializer = ((r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU) arrayList2.get(i)).RemoteActionCompatParcelizer.longValue();
        }
        if (j - jSerializer > 165600000) {
            arrayList.addAll(serializer(jSerializer));
            arrayList.addAll(write(jSerializer, j));
            return new Pair<>(Boolean.TRUE, arrayList);
        }
        if (z) {
            arrayList.add(new refreshBannersIfAppropriate(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read, this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.IconCompatParcelizer(DetectionIdManager.Detection.STATIONARY), j, b.byteValue()));
        }
        return new Pair<>(Boolean.FALSE, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0055  */
    public static setLargeIconIfPresentAndSupportedlambda4 RemoteActionCompatParcelizer(setDeleteIntentlambda0 setdeleteintentlambda0) {
        Class clsIconCompatParcelizer;
        getVerticalAccuracy getverticalaccuracy = setdeleteintentlambda0.ResultReceiver;
        Optional<getCooldownEnterSeconds.read> optional = setdeleteintentlambda0.read(setdeleteintentlambda0.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.write(0L) + 1);
        boolean z = false;
        if (optional.IconCompatParcelizer()) {
            clsIconCompatParcelizer = getBitmapFromCache.IconCompatParcelizer(optional.write(), getverticalaccuracy);
            if (IconCompatParcelizer(clsIconCompatParcelizer)) {
                z = true;
            } else if (clsIconCompatParcelizer == r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg.class) {
                Optional<getCooldownEnterSeconds.read> optional2 = setdeleteintentlambda0.read(optional.write().RemoteActionCompatParcelizer());
                if (optional2.IconCompatParcelizer() && IconCompatParcelizer(getVerticalAccuracy.write(optional2.write().MediaSessionCompatQueueItem()))) {
                    z = true;
                }
            }
        } else {
            clsIconCompatParcelizer = null;
        }
        return new setLargeIconIfPresentAndSupportedlambda4(clsIconCompatParcelizer, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList read(long j, long j2, Location location, Location location2, Byte b) {
        ArrayList arrayList = new ArrayList();
        IconCompatParcelizer(j);
        DetectionIdManager.Detection detection = DetectionIdManager.Detection.TRIP;
        DetectionIdManager detectionIdManager = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        String strIconCompatParcelizer = detectionIdManager.IconCompatParcelizer(detection);
        DetectionTrigger detectionTrigger = DetectionTrigger.SDK;
        arrayList.addAll(read(j, detectionTrigger, strIconCompatParcelizer, null, null, false));
        setDeleteIntent setdeleteintent = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (location != null) {
            Location location3 = new Location(location);
            location3.setTime(j);
            location3.setProvider("stationary");
            arrayList.add(setdeleteintent.serializer(location3, strIconCompatParcelizer));
        }
        arrayList.addAll(RemoteActionCompatParcelizer(j2, true));
        String strIconCompatParcelizer2 = detectionIdManager.IconCompatParcelizer(detection);
        if (location2 != null) {
            new Location(location2).setProvider("stationary");
            arrayList.add(setdeleteintent.serializer(location2, strIconCompatParcelizer2));
        }
        DetectionTrigger detectionTrigger2 = b.byteValue() == 2 ? DetectionTrigger.EXTERNAL : detectionTrigger;
        arrayList.add(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.write(j2, detectionTrigger2, b.byteValue(), strIconCompatParcelizer2));
        arrayList.addAll(serializer(j2, detectionTrigger, detectionTrigger2, b));
        return arrayList;
    }
}
