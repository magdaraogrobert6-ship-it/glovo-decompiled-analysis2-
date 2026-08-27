package o;

import android.content.Context;
import android.location.Location;
import com.huawei.hms.location.LocationRequest;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.geofence.states.Type;
import com.sentiance.sdk.processguard.Guard$Type;
import com.sentiance.sdk.util.Optional;
import fwfd.com.fwfsdk.constant.FWFConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "GeofenceStateManager", guardType = Guard$Type.REFERENCE_COUNTED)
public class getUseWebView implements removeGeofencesRegisteredWithGeofencingClientlambda2, r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    private final component4android_sdk_base_release ComponentActivity;
    private final ServerConfigDataStoreProviderCompanion IconCompatParcelizer;
    private final isConversationalPush MediaBrowserCompatMediaItem;
    private final getShouldRefreshFeatureFlags MediaDescriptionCompat;
    private final getPushUniqueId MediaMetadataCompat;
    private final retrieveRegisteredGeofencesFromLocalStorageandroid_sdk_location_release MediaSessionCompatQueueItem;
    private final Context ParcelableVolumeInfo;
    private setConversationShortcutId PlaybackStateCompat;
    private final setActionButtons PlaybackStateCompatCustomAction;
    private final migrateTriggersReeligibilityToJsonlambda1<Boolean> RatingCompat;
    private final isGeofencesEnabledFromEnvironmentlambda1 RemoteActionCompatParcelizer;
    private final getAnalyticsEnabledEnterannotations ResultReceiver;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    private final parseLonglambda0 r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    private final getCooldownEnterSeconds r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    private final readandroid_sdk_base_release r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    private final getVerticalAccuracy r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    private final getShouldFetchTestTriggers read;
    private final r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 serializer;
    private final ConfigurationManager write;
    private final PushMaxDataStoreProviderCompanion<r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU> MediaSessionCompatToken = new isInlineImagePush();
    private boolean MediaSessionCompatResultReceiverWrapper = false;

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read(String str, Object... objArr) {
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.IconCompatParcelizer(this.PlaybackStateCompat.serializer().getName() + ": " + str, objArr);
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        this.MediaMetadataCompat.RemoteActionCompatParcelizer();
        this.MediaBrowserCompatMediaItem.read();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        HashMap map = new HashMap();
        getCooldownEnterSeconds getcooldownenterseconds = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        Optional<getCooldownEnterSeconds.read> optionalIconCompatParcelizer = getcooldownenterseconds.IconCompatParcelizer(r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU.class, (Long) null);
        if (optionalIconCompatParcelizer.IconCompatParcelizer()) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(optionalIconCompatParcelizer.write(), map, r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU.class);
        }
        Optional<r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU> optionalRemoteActionCompatParcelizer = getcooldownenterseconds.RemoteActionCompatParcelizer(r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU.class, (Long) null, this.MediaSessionCompatToken);
        Long l = (Long) map.get(r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU.class);
        if (l != null && optionalRemoteActionCompatParcelizer.IconCompatParcelizer() && l.longValue() > optionalRemoteActionCompatParcelizer.write().write.longValue()) {
            map.put(r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU.class, optionalRemoteActionCompatParcelizer.write().write);
        }
        Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer2 = getcooldownenterseconds.RemoteActionCompatParcelizer(invokeFallbackFirebaseServicelambda2.IconCompatParcelizer, (Long) null, false);
        boolean zIconCompatParcelizer = optionalRemoteActionCompatParcelizer2.IconCompatParcelizer();
        getVerticalAccuracy getverticalaccuracy = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (zIconCompatParcelizer) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(optionalRemoteActionCompatParcelizer2.write(), map, getBitmapFromCache.IconCompatParcelizer(optionalRemoteActionCompatParcelizer2.write(), getverticalaccuracy));
        }
        Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer3 = getcooldownenterseconds.RemoteActionCompatParcelizer(Arrays.asList(requestGeofenceRefresh.class, unsubscribeFromBannersDismissedEvent.class), (Long) null, false);
        if (optionalRemoteActionCompatParcelizer3.IconCompatParcelizer()) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(optionalRemoteActionCompatParcelizer3.write(), map, getBitmapFromCache.IconCompatParcelizer(optionalRemoteActionCompatParcelizer3.write(), getverticalaccuracy));
        }
        return map;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        this.serializer.IconCompatParcelizer();
        IconCompatParcelizer(new setDeeplink(this.PlaybackStateCompatCustomAction, this.PlaybackStateCompat.serializer()));
        this.RatingCompat.read(Boolean.FALSE);
        this.MediaSessionCompatResultReceiverWrapper = false;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        readandroid_sdk_base_release readandroid_sdk_base_releaseVar = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        isPushStory ispushstory = new isPushStory(this, readandroid_sdk_base_releaseVar);
        setBigTitleText setbigtitletext = new setBigTitleText(this, readandroid_sdk_base_releaseVar);
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.ResultReceiver;
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU.class, setbigtitletext);
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(r8lambda7hSNgpBpNnHwzu2sYrBtefYqHlQ.class, new isPushDeliveryEnabled(this, readandroid_sdk_base_releaseVar));
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(requestGeofenceRefresh.class, new isSilentPush(this, readandroid_sdk_base_releaseVar, this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus));
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(unsubscribeFromBannersDismissedEvent.class, new setBigImageUrl(this, readandroid_sdk_base_releaseVar));
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(addBannerViewMonitor.class, new setBrazeExtras(this, readandroid_sdk_base_releaseVar));
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, new setBigSummaryText(this, readandroid_sdk_base_releaseVar));
        getanalyticsenabledenterannotations.read(ControlMessage.GEOFENCE_TRANSITION_TIMEOUT, ispushstory);
        getanalyticsenabledenterannotations.read(ControlMessage.GEOFENCE_STATE_RESET, ispushstory);
        getanalyticsenabledenterannotations.read(ControlMessage.GEOFENCE_STATE_STOP, ispushstory);
        getanalyticsenabledenterannotations.read(ControlMessage.ENSURE_STATIONARY_GEOFENCE, ispushstory);
    }

    public static setContext r8lambda54BeH8ZsBru0CXI2CCSP2syNys(getUseWebView getusewebview) {
        Optional<setConfigurationProvider> optionalSerializer = getusewebview.MediaMetadataCompat.serializer("geofence");
        if (!optionalSerializer.IconCompatParcelizer()) {
            return null;
        }
        Location locationSerializer = optionalSerializer.write().serializer();
        locationSerializer.setAccuracy(0.0f);
        return new setContext(getusewebview.PlaybackStateCompatCustomAction, null, locationSerializer, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean write(Location location) {
        float f;
        Optional<setConfigurationProvider> optionalSerializer = this.MediaMetadataCompat.serializer("geofence");
        read("Checking if downsizing is possible", new Object[0]);
        if (optionalSerializer.IconCompatParcelizer()) {
            read("Current geofence radius is %d", Integer.valueOf((int) optionalSerializer.write().RemoteActionCompatParcelizer));
            f = optionalSerializer.write().RemoteActionCompatParcelizer != 100.0f ? optionalSerializer.write().RemoteActionCompatParcelizer : 0.0f;
        }
        int iIconCompatParcelizer = IconCompatParcelizer(location, false);
        read("New geofence radius could be %d", Integer.valueOf(iIconCompatParcelizer));
        return location.hasAccuracy() && ((float) iIconCompatParcelizer) < f;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x01af  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v26 */
    public static boolean write(getUseWebView getusewebview, Optional optional, Location location) {
        boolean z;
        int i;
        r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU r8lambdaibd0azdffjr6m_pevs2l1iejku;
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4;
        parseLonglambda0 parselonglambda0 = getusewebview.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (!optional.IconCompatParcelizer()) {
            return false;
        }
        int iDistanceTo = (int) location.distanceTo(((setConfigurationProvider) optional.write()).serializer());
        int i2 = 1;
        if (iDistanceTo > location.getAccuracy() + ((setConfigurationProvider) optional.write()).RemoteActionCompatParcelizer) {
            parselonglambda0.IconCompatParcelizer("Location event is %d m away from geofence, switching to WaitingEnterState", Integer.valueOf(iDistanceTo));
            return true;
        }
        if (getusewebview.RemoteActionCompatParcelizer(Type.WAITING_ENTER) || getusewebview.RemoteActionCompatParcelizer(Type.WAITING_DWELL)) {
            setConfigurationProvider setconfigurationprovider = (setConfigurationProvider) optional.write();
            getCooldownEnterSeconds getcooldownenterseconds = getusewebview.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            getusewebview.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
            Optional<r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU> optionalRemoteActionCompatParcelizer = getcooldownenterseconds.RemoteActionCompatParcelizer(r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU.class, Long.valueOf(System.currentTimeMillis()), getusewebview.MediaSessionCompatToken);
            if (optionalRemoteActionCompatParcelizer.read()) {
                z = true;
            } else {
                List<getCooldownEnterSeconds.read> listRemoteActionCompatParcelizer = getusewebview.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RemoteActionCompatParcelizer(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, optionalRemoteActionCompatParcelizer.write().RemoteActionCompatParcelizer, Long.valueOf(System.currentTimeMillis()), false, false);
                ArrayList<Location> arrayList = new ArrayList();
                Iterator<getCooldownEnterSeconds.read> it = listRemoteActionCompatParcelizer.iterator();
                while (it.hasNext()) {
                    r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = it.next().RemoteActionCompatParcelizer(getusewebview.ComponentActivity);
                    if (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer != null && (r8lambdaibd0azdffjr6m_pevs2l1iejku = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) != null && (brazeCompanionExternalSyntheticLambda4 = r8lambdaibd0azdffjr6m_pevs2l1iejku.RemoteActionCompatParcelizer) != null) {
                        getusewebview.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.getClass();
                        Location locationWrite = getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda4);
                        float[] fArr = new float[i2];
                        Location.distanceBetween(locationWrite.getLatitude(), locationWrite.getLongitude(), setconfigurationprovider.read, setconfigurationprovider.IconCompatParcelizer, fArr);
                        if (Math.abs(fArr[0] - setconfigurationprovider.RemoteActionCompatParcelizer) < ((double) setconfigurationprovider.RemoteActionCompatParcelizer) * 0.2d) {
                            arrayList.add(locationWrite);
                        }
                        i2 = 1;
                    }
                }
                Location location2 = null;
                Location location3 = null;
                for (Location location4 : arrayList) {
                    if (location2 == null || location4.getTime() < location2.getTime()) {
                        location2 = location4;
                    }
                    if (location3 == null || location4.getTime() > location3.getTime()) {
                        location3 = location4;
                    }
                }
                z = (location2 == null || location3 == null || location3.getTime() - location2.getTime() <= 45000) ? false : true;
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(String.format(java.util.Locale.US, "%d fixes are near the edge of the geofence (%f, %f): ", Integer.valueOf(arrayList.size()), Double.valueOf(setconfigurationprovider.read), Double.valueOf(setconfigurationprovider.IconCompatParcelizer)));
                    for (Location location5 : arrayList) {
                        sb.append(String.format(java.util.Locale.US, "(%f, %f), ", Double.valueOf(location5.getLatitude()), Double.valueOf(location5.getLongitude())));
                    }
                    i = 0;
                    parselonglambda0.IconCompatParcelizer(sb.toString().substring(0, sb.length() - 2), new Object[0]);
                }
                if (z) {
                    parselonglambda0.IconCompatParcelizer("Too many fixes near the edge of the geofence, switching to WaitingEnterState", new Object[i]);
                    return true;
                }
            }
            i = 0;
            if (z) {
                parselonglambda0.IconCompatParcelizer("Too many fixes near the edge of the geofence, switching to WaitingEnterState", new Object[i]);
                return true;
            }
        } else {
            i = 0;
        }
        if (getusewebview.RemoteActionCompatParcelizer(Type.WAITING_DWELL) && getusewebview.RemoteActionCompatParcelizer((Location) null)) {
            parselonglambda0.IconCompatParcelizer("Location fix triggered a forced dwell", new Object[i]);
            return i;
        }
        if (!getusewebview.RemoteActionCompatParcelizer(Type.WAITING_EXIT) || !getusewebview.write(location)) {
            return i;
        }
        parselonglambda0.IconCompatParcelizer("Location fix is accurate enough to downsize the current geofence", new Object[i]);
        return true;
    }

    public getUseWebView(Context context, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, getCooldownEnterSeconds getcooldownenterseconds, parseLonglambda0 parselonglambda0, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, component4android_sdk_base_release component4android_sdk_base_releaseVar, getVerticalAccuracy getverticalaccuracy, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, getShouldFetchTestTriggers getshouldfetchtesttriggers, isGeofencesEnabledFromEnvironmentlambda1 isgeofencesenabledfromenvironmentlambda1, r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4, getPushUniqueId getpushuniqueid, isConversationalPush isconversationalpush, ConfigurationManager configurationManager, ServerConfigDataStoreProviderCompanion serverConfigDataStoreProviderCompanion, retrieveRegisteredGeofencesFromLocalStorageandroid_sdk_location_release retrieveregisteredgeofencesfromlocalstorageandroid_sdk_location_release, getShouldRefreshFeatureFlags getshouldrefreshfeatureflags) {
        this.ParcelableVolumeInfo = context;
        this.ResultReceiver = getanalyticsenabledenterannotations;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = getcooldownenterseconds;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = parselonglambda0;
        this.MediaMetadataCompat = getpushuniqueid;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.ComponentActivity = component4android_sdk_base_releaseVar;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = getverticalaccuracy;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = readandroid_sdk_base_releaseVar;
        this.read = getshouldfetchtesttriggers;
        this.MediaBrowserCompatMediaItem = isconversationalpush;
        this.RemoteActionCompatParcelizer = isgeofencesenabledfromenvironmentlambda1;
        this.serializer = r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4;
        this.write = configurationManager;
        this.IconCompatParcelizer = serverConfigDataStoreProviderCompanion;
        this.MediaSessionCompatQueueItem = retrieveregisteredgeofencesfromlocalstorageandroid_sdk_location_release;
        this.MediaDescriptionCompat = getshouldrefreshfeatureflags;
        setActionButtons setactionbuttons = new setActionButtons(this);
        this.PlaybackStateCompatCustomAction = setactionbuttons;
        setConversationShortcutId setconversationshortcutidSerializer = isconversationalpush.serializer(setactionbuttons);
        this.PlaybackStateCompat = setconversationshortcutidSerializer;
        setconversationshortcutidSerializer.read();
        parselonglambda0.IconCompatParcelizer("Loaded state %s", this.PlaybackStateCompat.serializer().getName());
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        this.RatingCompat = new getTitleText(this, System.currentTimeMillis());
    }

    public static void MediaSessionCompatQueueItem(getUseWebView getusewebview) {
        if (getusewebview.MediaSessionCompatResultReceiverWrapper) {
            return;
        }
        boolean z = getusewebview.MediaSessionCompatQueueItem.IconCompatParcelizer().read();
        getusewebview.MediaSessionCompatResultReceiverWrapper = true;
        if (!z || getusewebview.PlaybackStateCompat.serializer() == Type.STOPPED) {
            getusewebview.PlaybackStateCompat.serializer(getusewebview.ParcelableVolumeInfo);
        } else {
            getusewebview.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.IconCompatParcelizer("Triggered trips is enabled. Switching to stopped state.", new Object[0]);
            getusewebview.IconCompatParcelizer(new setDeeplink(getusewebview.PlaybackStateCompatCustomAction, getusewebview.PlaybackStateCompat.serializer()));
        }
    }

    public final void RemoteActionCompatParcelizer(r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm) {
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.IconCompatParcelizer("Publishing geofence event", new Object[0]);
        this.serializer.read();
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.RemoteActionCompatParcelizer(new setAccentColor(this, r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm), "GSM-PublishEvent");
    }

    public final void read(ControlMessage controlMessage) {
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.IconCompatParcelizer("Publishing control msg", new Object[0]);
        this.serializer.read();
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.RemoteActionCompatParcelizer(new isUninstallTrackingPush(this, controlMessage), "GSM-PublishCtrlMsg");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IconCompatParcelizer(setConversationShortcutId setconversationshortcutid) {
        synchronized (this) {
            if (!this.RatingCompat.read().booleanValue()) {
                this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.IconCompatParcelizer("Sdk is not started. Not switching to %s state.", setconversationshortcutid.serializer().getName());
                return;
            }
            read("Switching to %s", setconversationshortcutid.serializer().getName());
            setConversationShortcutId setconversationshortcutid2 = this.PlaybackStateCompat;
            Context context = this.ParcelableVolumeInfo;
            setActionButtons setactionbuttons = this.PlaybackStateCompatCustomAction;
            setconversationshortcutid2.getClass();
            getShouldRefreshBanners.serializer(context, setactionbuttons.RemoteActionCompatParcelizer.ResultReceiver);
            setconversationshortcutid2.serializer(setactionbuttons);
            setconversationshortcutid.serializer(this.ParcelableVolumeInfo);
            this.MediaBrowserCompatMediaItem.write(setconversationshortcutid);
            this.PlaybackStateCompat = setconversationshortcutid;
        }
    }

    public static String read(int i) {
        switch (i) {
            case 1:
                return "enter";
            case 2:
                return "exit";
            case 3:
                return "dwell";
            case 4:
                return "create";
            case 5:
                return "destroy";
            case 6:
                return FWFConstants.EXPLANATION_TYPE_ERROR;
            case 7:
                return "timeout";
            case 8:
                return "dwell_forced";
            case 9:
                return "exit_forced";
            case 10:
                return "dwell_satisfied";
            default:
                return String.valueOf(i) + " (unknown)";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean RemoteActionCompatParcelizer(Type type) {
        return this.PlaybackStateCompat.serializer() == type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean RemoteActionCompatParcelizer(Location location) {
        Location location2;
        if (RemoteActionCompatParcelizer(Type.WAITING_EXIT)) {
            return true;
        }
        Optional<setConfigurationProvider> optionalSerializer = this.MediaMetadataCompat.serializer("geofence");
        if (optionalSerializer.read()) {
            return false;
        }
        Location location3 = this.MediaDescriptionCompat.read(optionalSerializer.write());
        if (location3 == null) {
            return false;
        }
        parseLonglambda0 parselonglambda0 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (location != null && location.hasAccuracy() && location.getAccuracy() < 50.0f && location.getTime() > location3.getTime()) {
            parselonglambda0.IconCompatParcelizer("Force dwelling with suggested location %s", getDEFAULT_PUSH_DELIVERY_MIN_FLUSHandroid_sdk_base_releaseannotations.RemoteActionCompatParcelizer(location));
            location2 = location;
        } else {
            parselonglambda0.IconCompatParcelizer("Force dwelling with location %s", getDEFAULT_PUSH_DELIVERY_MIN_FLUSHandroid_sdk_base_releaseannotations.RemoteActionCompatParcelizer(location3));
            location2 = location3;
        }
        setConfigurationProvider setconfigurationproviderWrite = optionalSerializer.write();
        Optional optionalRemoteActionCompatParcelizer = Optional.RemoteActionCompatParcelizer(Integer.valueOf(optionalSerializer.write().serializer));
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.getClass();
        this.ResultReceiver.serializer(getVerticalAccuracy.write(setconfigurationproviderWrite, optionalRemoteActionCompatParcelizer, location2, 8, jCurrentTimeMillis));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int IconCompatParcelizer(Location location, boolean z) {
        int iMin = 100;
        if (location.getProvider().equals("stationary") && !this.write.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg()) {
            return 100;
        }
        float fMax = 100.0f;
        if (location.hasAccuracy()) {
            fMax = Math.max(100.0f, !location.hasAccuracy() ? 100 : (int) (location.getAccuracy() * 1.5f));
        }
        if (location.hasSpeed()) {
            if (location.hasSpeed() && location.getSpeed() >= 10.0f) {
                iMin = ((int) (((Math.min(33.0f, location.getSpeed()) - 10.0f) / 23.0f) * 700.0f)) + LocationRequest.PRIORITY_INDOOR;
            }
            fMax = Math.max(fMax, iMin);
        }
        Optional<setConfigurationProvider> optionalSerializer = this.MediaMetadataCompat.serializer("geofence");
        if (z && optionalSerializer.IconCompatParcelizer()) {
            fMax = Math.max(fMax, (int) (optionalSerializer.write().RemoteActionCompatParcelizer * 1.5f));
        }
        return (int) Math.min(fMax, 5000.0f);
    }
}
