package o;

import android.content.IntentFilter;
import android.util.Pair;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.devicestate.LocationPermissionLevel;
import com.sentiance.sdk.devicestate.LocationSetting;
import com.sentiance.sdk.devicestate.Permission;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.offthegrid.OffTheGridLocationSettingStateProvider;
import com.sentiance.sdk.processguard.Guard$Type;
import com.sentiance.sdk.util.Optional;
import com.uber.h3core.H3Core$$ExternalSyntheticLambda2;
import io.sentry.Scopes$$ExternalSyntheticLambda0;
import io.sentry.util.network.NetworkBody;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "OffTheGridManager", componentName = "OffTheGridManager", guardType = Guard$Type.REFERENCE_COUNTED)
public class populateNotificationBuilderlambda1 implements removeGeofencesRegisteredWithGeofencingClientlambda2, r8lambdablVN5nNNlkpbL0jtfBN_gCBPM8M, r8lambdaZQ8uyXmhlaXDpUbPCryPXeoi9E {
    private final r8lambdaHet8Jz7IcZoyFo4UnUY9jKvDVY ComponentActivity;
    private final r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 IconCompatParcelizer;
    private final isGeofencesEnabledFromEnvironmentlambda1 MediaBrowserCompatMediaItem;
    private final getVerticalAccuracy MediaDescriptionCompat;
    private final component4android_sdk_base_release MediaMetadataCompat;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI MediaSessionCompatQueueItem;
    private final accesshandlePush MediaSessionCompatResultReceiverWrapper;
    private final r8lambdaI90we4_tg_9aaM1nBxPMKmLPck MediaSessionCompatToken;
    private final ConfigurationManager ParcelableVolumeInfo;
    private final Set<Byte> PlaybackStateCompat;
    private final ServerConfigDataStoreProviderCompanion PlaybackStateCompatCustomAction;
    private final parseLonglambda0 RatingCompat;
    private final readandroid_sdk_base_release RemoteActionCompatParcelizer;
    private final migrateTriggersReeligibilityToJsonlambda4<r8lambdaF8wSYtxO3nnbAjq7V_HFBLwn80> r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    private final BannersDataStoreProviderCompanionExternalSyntheticLambda2 r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    private final onLocationRequestCompletelambda1 r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    private final r8lambda7xdj8Hz3fhe1sOrYgyl0CHrOnM r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    private final OffTheGridLocationSettingStateProvider r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    private final getAnalyticsEnabledEnterannotations read;
    private final com.sentiance.sdk.util.c serializer;
    private final getCooldownEnterSeconds write;
    private int r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = 0;
    private final removeGeofencesRegisteredWithGeofencingClientlambda22 r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = new BrazeNotificationStyleFactoryCompanion(this);
    private boolean r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = false;
    private final ArrayList ResultReceiver = new ArrayList();
    private LocationSetting.LocationMode r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = LocationSetting.LocationMode.UNKNOWN;

    private void IconCompatParcelizer(List<r8lambda3Yr8ggNEHRP0MT0Ne8d9cEJ1duw> list) {
        synchronized (this) {
            if (list.isEmpty()) {
                return;
            }
            read((Set<Byte>) null);
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss += list.size();
            for (r8lambda3Yr8ggNEHRP0MT0Ne8d9cEJ1duw r8lambda3yr8ggnehrp0mt0ne8d9cej1duw : list) {
                byte bRemoteActionCompatParcelizer = r8lambda3yr8ggnehrp0mt0ne8d9cej1duw.RemoteActionCompatParcelizer();
                boolean z = r8lambda3yr8ggnehrp0mt0ne8d9cej1duw.read();
                long jSerializer = r8lambda3yr8ggnehrp0mt0ne8d9cej1duw.serializer();
                this.ComponentActivity.serializer(bRemoteActionCompatParcelizer);
                if (this.PlaybackStateCompat.contains(Byte.valueOf(bRemoteActionCompatParcelizer)) == z) {
                    Set<Byte> set = this.PlaybackStateCompat;
                    synchronized (this) {
                        int i = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss - 1;
                        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i;
                        if (i == 0) {
                            read(set);
                        }
                    }
                } else {
                    parseLonglambda0 parselonglambda0 = this.RatingCompat;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Publishing ");
                    sb.append(serializer(Byte.valueOf(bRemoteActionCompatParcelizer)));
                    sb.append(" (");
                    sb.append(z ? com.braze.models.FeatureFlag.ENABLED : "disabled");
                    sb.append(") at ");
                    sb.append(com.sentiance.sdk.util.x.c(jSerializer));
                    parselonglambda0.IconCompatParcelizer(sb.toString(), new Object[0]);
                    Set<Byte> set2 = this.PlaybackStateCompat;
                    if (z) {
                        set2.add(Byte.valueOf(bRemoteActionCompatParcelizer));
                    } else {
                        set2.remove(Byte.valueOf(bRemoteActionCompatParcelizer));
                    }
                    HashSet hashSet = new HashSet(this.PlaybackStateCompat);
                    getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.read;
                    this.MediaDescriptionCompat.getClass();
                    int i2 = 12;
                    NetworkBody networkBody = new NetworkBody(i2);
                    networkBody.IconCompatParcelizer = Byte.valueOf(bRemoteActionCompatParcelizer);
                    networkBody.RemoteActionCompatParcelizer = Boolean.valueOf(z);
                    invokeSuspendlambda0 invokesuspendlambda0Write = networkBody.write();
                    r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = getVerticalAccuracy.read(jSerializer);
                    r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
                    r8lambdaromdixahini0blcevvl7ehebhj0.getDefaultViewModelCreationExtras = invokesuspendlambda0Write;
                    r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
                    getanalyticsenabledenterannotations.serializer(r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm, (Object) null, true, new Scopes$$ExternalSyntheticLambda0(this, i2, hashSet));
                }
            }
        }
    }

    private void IconCompatParcelizer(boolean z) {
        this.RatingCompat.IconCompatParcelizer("checkBackgroundDetectionRestriction", new Object[0]);
        this.MediaSessionCompatQueueItem.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.ParcelableVolumeInfo.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ() && this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.write() != LocationPermissionLevel.ALWAYS && (z || !this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.IconCompatParcelizer());
        if (z && z2) {
            Long lValueOf = null;
            getCooldownEnterSeconds.read readVarRemoteActionCompatParcelizer = this.write.RemoteActionCompatParcelizer(Arrays.asList(subscribeToBannersDismissedEvent.class, r8lambdaVny7Iop5thIfAArp93JFD1zIPGQ.class), (Long) null, false).RemoteActionCompatParcelizer();
            if (readVarRemoteActionCompatParcelizer != null) {
                int iMediaSessionCompatQueueItem = readVarRemoteActionCompatParcelizer.MediaSessionCompatQueueItem();
                this.MediaDescriptionCompat.getClass();
                if (subscribeToBannersDismissedEvent.class.equals(getVerticalAccuracy.write(iMediaSessionCompatQueueItem))) {
                    lValueOf = Long.valueOf(readVarRemoteActionCompatParcelizer.serializer());
                }
            }
            if (lValueOf == null) {
                lValueOf = Long.valueOf(jCurrentTimeMillis);
            }
            jCurrentTimeMillis = lValueOf.longValue();
        }
        serializer((Byte) (byte) 15, z2, jCurrentTimeMillis);
    }

    private void MediaSessionCompatQueueItem() {
        synchronized (this) {
            Collections.sort(this.ResultReceiver, new Comparator() { // from class: o.setStyleIfSupported
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Long.compare(((r8lambda3Yr8ggNEHRP0MT0Ne8d9cEJ1duw) obj).serializer(), ((r8lambda3Yr8ggNEHRP0MT0Ne8d9cEJ1duw) obj2).serializer());
                }
            });
            IconCompatParcelizer(this.ResultReceiver);
            this.ResultReceiver.clear();
        }
    }

    public static void write(populateNotificationBuilderlambda1 populatenotificationbuilderlambda1, HashSet hashSet) {
        synchronized (populatenotificationbuilderlambda1) {
            int i = populatenotificationbuilderlambda1.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss - 1;
            populatenotificationbuilderlambda1.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = i;
            if (i == 0) {
                populatenotificationbuilderlambda1.read(hashSet);
            }
        }
    }

    public final void RemoteActionCompatParcelizer() {
        write(true);
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        synchronized (this) {
            if (this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM) {
                this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = false;
                this.PlaybackStateCompatCustomAction.serializer(this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
            }
            this.PlaybackStateCompat.clear();
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.write();
            this.ResultReceiver.clear();
            this.ComponentActivity.RemoteActionCompatParcelizer();
            this.serializer.read();
            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = LocationSetting.LocationMode.UNKNOWN;
            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.read(this);
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = 0;
        }
    }

    private void IconCompatParcelizer() {
        byte b;
        onLocationRequestCompletelambda1 onlocationrequestcompletelambda1 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        LocationPermissionLevel locationPermissionLevelWrite = onlocationrequestcompletelambda1.write();
        byte b2 = 3;
        if (locationPermissionLevelWrite == LocationPermissionLevel.ALWAYS) {
            b = 4;
        } else {
            b = locationPermissionLevelWrite == LocationPermissionLevel.ONLY_WHILE_IN_USE ? (byte) 5 : (byte) 3;
        }
        if (onlocationrequestcompletelambda1.write(Permission.FINE_LOCATION)) {
            b2 = 1;
        } else if (onlocationrequestcompletelambda1.write() != LocationPermissionLevel.NEVER) {
            b2 = 2;
        }
        this.MediaDescriptionCompat.getClass();
        r8lambdaRBUg8qiONCPYgCSL25Td35Mcmxs r8lambdarbug8qioncpygcsl25td35mcmxs = new r8lambdaRBUg8qiONCPYgCSL25Td35Mcmxs();
        r8lambdarbug8qioncpygcsl25td35mcmxs.IconCompatParcelizer = Byte.valueOf(b);
        r8lambdarbug8qioncpygcsl25td35mcmxs.serializer = Byte.valueOf(b2);
        if (r8lambdarbug8qioncpygcsl25td35mcmxs.IconCompatParcelizer == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'authorizationStatus' is missing");
            return;
        }
        r8lambdaF8wSYtxO3nnbAjq7V_HFBLwn80 r8lambdaf8wsytxo3nnbajq7v_hfblwn80 = new r8lambdaF8wSYtxO3nnbAjq7V_HFBLwn80(r8lambdarbug8qioncpygcsl25td35mcmxs);
        migrateTriggersReeligibilityToJsonlambda4<r8lambdaF8wSYtxO3nnbAjq7V_HFBLwn80> migratetriggersreeligibilitytojsonlambda4 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (r8lambdaf8wsytxo3nnbajq7v_hfblwn80.equals(migratetriggersreeligibilitytojsonlambda4.read())) {
            return;
        }
        this.MediaSessionCompatQueueItem.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
        r8lambdaromdixahini0blcevvl7ehebhj0.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = r8lambdaf8wsytxo3nnbajq7v_hfblwn80;
        r8lambdaTURWeRtF3oTEvz1WenZeX5TdwA r8lambdaturwertf3otevz1wenzex5tdwaIconCompatParcelizer = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
        r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = getVerticalAccuracy.read(jCurrentTimeMillis);
        r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaturwertf3otevz1wenzex5tdwaIconCompatParcelizer;
        this.read.serializer(r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm);
        migratetriggersreeligibilitytojsonlambda4.IconCompatParcelizer(r8lambdaf8wsytxo3nnbajq7v_hfblwn80);
    }

    private Long read(byte b, long j) {
        parseLonglambda0 parselonglambda0 = this.RatingCompat;
        r8lambdaHet8Jz7IcZoyFo4UnUY9jKvDVY r8lambdahet8jz7iczoyfo4unuy9jkvdvy = this.ComponentActivity;
        r8lambdaTLpfYipSHyWk_bsSf3N2g7hRo2c r8lambdatlpfyipshywk_bssf3n2g7hro2cRemoteActionCompatParcelizer = r8lambdahet8jz7iczoyfo4unuy9jkvdvy.RemoteActionCompatParcelizer(b);
        boolean z = r8lambdatlpfyipshywk_bssf3n2g7hro2cRemoteActionCompatParcelizer != null && r8lambdatlpfyipshywk_bssf3n2g7hro2cRemoteActionCompatParcelizer.IconCompatParcelizer();
        boolean z2 = (r8lambdatlpfyipshywk_bssf3n2g7hro2cRemoteActionCompatParcelizer == null || r8lambdatlpfyipshywk_bssf3n2g7hro2cRemoteActionCompatParcelizer.IconCompatParcelizer()) ? false : true;
        boolean zContains = this.PlaybackStateCompat.contains((byte) 3);
        String strSerializer = serializer(Byte.valueOf(b));
        if (zContains) {
            return Long.valueOf(j);
        }
        Long lValueOf = null;
        if (z) {
            parselonglambda0.IconCompatParcelizer(strSerializer.concat(" enabled event was snoozed. Removing the snoozed entry only."), new Object[0]);
            r8lambdahet8jz7iczoyfo4unuy9jkvdvy.serializer(b);
            return null;
        }
        if (!this.PlaybackStateCompat.contains(Byte.valueOf(b))) {
            Iterator it = this.ResultReceiver.iterator();
            do {
                if (!it.hasNext()) {
                    parselonglambda0.IconCompatParcelizer(strSerializer.concat(" is neither snoozed nor enabled."), new Object[0]);
                    return null;
                }
            } while (((r8lambda3Yr8ggNEHRP0MT0Ne8d9cEJ1duw) it.next()).RemoteActionCompatParcelizer() != b);
        }
        boolean zIconCompatParcelizer = r8lambdahet8jz7iczoyfo4unuy9jkvdvy.IconCompatParcelizer(b);
        boolean zWrite = r8lambdahet8jz7iczoyfo4unuy9jkvdvy.write(b, j);
        if (!zIconCompatParcelizer && zWrite) {
            parselonglambda0.IconCompatParcelizer(strSerializer.concat(" disabled event can be snoozed"), new Object[0]);
            if (!z2) {
                parselonglambda0.IconCompatParcelizer(ff$$ExternalSyntheticOutline0.m("Snoozing ", strSerializer, " disabled event"), new Object[0]);
                r8lambdahet8jz7iczoyfo4unuy9jkvdvy.read(b, j, false);
            }
            return null;
        }
        if (!z2) {
            return Long.valueOf(j);
        }
        synchronized (r8lambdahet8jz7iczoyfo4unuy9jkvdvy) {
            r8lambdaTLpfYipSHyWk_bsSf3N2g7hRo2c r8lambdatlpfyipshywk_bssf3n2g7hro2cRemoteActionCompatParcelizer2 = r8lambdahet8jz7iczoyfo4unuy9jkvdvy.RemoteActionCompatParcelizer(b);
            if (r8lambdatlpfyipshywk_bssf3n2g7hro2cRemoteActionCompatParcelizer2 != null) {
                lValueOf = Long.valueOf(r8lambdatlpfyipshywk_bssf3n2g7hro2cRemoteActionCompatParcelizer2.serializer());
            }
        }
        if (lValueOf != null) {
            j = Math.min(lValueOf.longValue(), j);
        }
        return Long.valueOf(j);
    }

    private void write() {
        this.MediaSessionCompatQueueItem.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        LocationSetting locationSettingIconCompatParcelizer = this.MediaBrowserCompatMediaItem.IconCompatParcelizer();
        OffTheGridLocationSettingStateProvider.State state = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.read();
        boolean z = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg != locationSettingIconCompatParcelizer.serializer();
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = locationSettingIconCompatParcelizer.serializer();
        List listAsList = Arrays.asList((byte) 5, (byte) 10, (byte) 11);
        boolean zDisjoint = Collections.disjoint(listAsList, this.PlaybackStateCompat);
        if (this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.RemoteActionCompatParcelizer() || !z || zDisjoint) {
            serializer((Byte) (byte) 5, state == OffTheGridLocationSettingStateProvider.State.OFF, jCurrentTimeMillis);
            serializer((Byte) (byte) 10, state == OffTheGridLocationSettingStateProvider.State.BATTERY_SAVING, jCurrentTimeMillis);
            serializer((Byte) (byte) 11, state == OffTheGridLocationSettingStateProvider.State.DEVICE_ONLY, jCurrentTimeMillis);
            return;
        }
        this.RatingCompat.IconCompatParcelizer("The SDK is remaining off the grid due to invalid location mode. Ignoring recent mode changes due to unreliability. " + locationSettingIconCompatParcelizer, new Object[0]);
        r8lambdaHet8Jz7IcZoyFo4UnUY9jKvDVY r8lambdahet8jz7iczoyfo4unuy9jkvdvy = this.ComponentActivity;
        for (r8lambdaTLpfYipSHyWk_bsSf3N2g7hRo2c r8lambdatlpfyipshywk_bssf3n2g7hro2c : r8lambdahet8jz7iczoyfo4unuy9jkvdvy.IconCompatParcelizer()) {
            if (listAsList.contains(Byte.valueOf(r8lambdatlpfyipshywk_bssf3n2g7hro2c.read())) && !r8lambdatlpfyipshywk_bssf3n2g7hro2c.IconCompatParcelizer()) {
                r8lambdahet8jz7iczoyfo4unuy9jkvdvy.serializer(r8lambdatlpfyipshywk_bssf3n2g7hro2c.read());
            }
        }
    }

    private void write(boolean z) {
        Pair<Long, Long> pair;
        synchronized (this) {
            getCooldownEnterSeconds getcooldownenterseconds = this.write;
            if (getcooldownenterseconds.serializer((Long) null)) {
                IconCompatParcelizer((byte) 3, false);
            } else {
                Long lRemoteActionCompatParcelizer = getcooldownenterseconds.RemoteActionCompatParcelizer();
                if (lRemoteActionCompatParcelizer == null) {
                    IconCompatParcelizer((byte) 3, true);
                } else {
                    serializer((Byte) (byte) 3, true, lRemoteActionCompatParcelizer.longValue());
                }
            }
            if (z && (pair = ((addNotificationActionslambda1) setPushUniqueId.read(addNotificationActionslambda1.class)).read()) != null) {
                serializer((Byte) (byte) 7, true, ((Long) pair.first).longValue());
                serializer((Byte) (byte) 7, false, ((Long) pair.second).longValue());
            }
            Boolean bool = this.MediaSessionCompatToken.write().read;
            IconCompatParcelizer((byte) 14, bool != null && bool.booleanValue());
            LocationPermissionLevel locationPermissionLevelWrite = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.write();
            if (locationPermissionLevelWrite == LocationPermissionLevel.NEVER) {
                IconCompatParcelizer((byte) 4, false);
                IconCompatParcelizer((byte) 1, true);
            } else if (locationPermissionLevelWrite != LocationPermissionLevel.ONLY_WHILE_IN_USE || (this.ParcelableVolumeInfo.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ() && this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.write() != LocationPermissionLevel.ALWAYS)) {
                IconCompatParcelizer((byte) 1, false);
                IconCompatParcelizer((byte) 4, false);
            } else {
                IconCompatParcelizer((byte) 1, false);
                IconCompatParcelizer((byte) 4, true);
            }
            IconCompatParcelizer();
            onLocationRequestCompletelambda1 onlocationrequestcompletelambda1 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            onlocationrequestcompletelambda1.getClass();
            IconCompatParcelizer((byte) 16, !onlocationrequestcompletelambda1.write(Permission.FINE_LOCATION));
            IconCompatParcelizer();
            write();
            IconCompatParcelizer((byte) 2, this.MediaBrowserCompatMediaItem.MediaSessionCompatQueueItem());
            int i = this.MediaSessionCompatResultReceiverWrapper.read();
            if (i == 3 || i == 4) {
                IconCompatParcelizer((byte) 13, true);
            } else {
                IconCompatParcelizer((byte) 13, false);
            }
            IconCompatParcelizer(z);
            MediaDescriptionCompat();
            MediaSessionCompatQueueItem();
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        invokeSuspendlambda0 invokesuspendlambda0;
        HashMap map = new HashMap();
        List<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>> list = invokeFallbackFirebaseServicelambda2.IconCompatParcelizer;
        getCooldownEnterSeconds getcooldownenterseconds = this.write;
        Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer = getcooldownenterseconds.RemoteActionCompatParcelizer(list, (Long) null, false);
        boolean zIconCompatParcelizer = optionalRemoteActionCompatParcelizer.IconCompatParcelizer();
        getVerticalAccuracy getverticalaccuracy = this.MediaDescriptionCompat;
        if (zIconCompatParcelizer) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(optionalRemoteActionCompatParcelizer.write(), map, getBitmapFromCache.IconCompatParcelizer(optionalRemoteActionCompatParcelizer.write(), getverticalaccuracy));
        }
        Optional<getCooldownEnterSeconds.read> optionalIconCompatParcelizer = getcooldownenterseconds.IconCompatParcelizer(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, (Long) null);
        if (optionalIconCompatParcelizer.IconCompatParcelizer()) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(optionalIconCompatParcelizer.write(), map, r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class);
        }
        Optional<getCooldownEnterSeconds.read> optionalIconCompatParcelizer2 = getcooldownenterseconds.IconCompatParcelizer(r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU.class, (Long) null);
        if (optionalIconCompatParcelizer2.IconCompatParcelizer()) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(optionalIconCompatParcelizer2.write(), map, r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU.class);
        }
        HashSet hashSet = read();
        ArrayList arrayList = new ArrayList();
        Iterator<getCooldownEnterSeconds.read> it = this.write.RemoteActionCompatParcelizer(invokeSuspendlambda0.class, null, null, true, true).iterator();
        Long l = null;
        while (it.hasNext()) {
            r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = it.next().RemoteActionCompatParcelizer(this.MediaMetadataCompat);
            if (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer != null && (invokesuspendlambda0 = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer.getFullyDrawnReporter) != null) {
                Byte b = invokesuspendlambda0.RemoteActionCompatParcelizer;
                if (hashSet.contains(b) && !arrayList.contains(b)) {
                    arrayList.add(b);
                    l = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.write;
                }
                if (arrayList.size() == hashSet.size()) {
                    break;
                }
            }
        }
        if (l != null) {
            map.put(invokeSuspendlambda0.class, l);
        }
        Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer2 = getcooldownenterseconds.RemoteActionCompatParcelizer(Arrays.asList(requestGeofenceRefresh.class, unsubscribeFromBannersDismissedEvent.class), (Long) null, false);
        if (optionalRemoteActionCompatParcelizer2.IconCompatParcelizer()) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(optionalRemoteActionCompatParcelizer2.write(), map, getBitmapFromCache.IconCompatParcelizer(optionalRemoteActionCompatParcelizer2.write(), getverticalaccuracy));
        }
        Optional<getCooldownEnterSeconds.read> optionalIconCompatParcelizer3 = getcooldownenterseconds.IconCompatParcelizer(r8lambdaVny7Iop5thIfAArp93JFD1zIPGQ.class, (Long) null);
        if (optionalIconCompatParcelizer3.IconCompatParcelizer()) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(optionalIconCompatParcelizer3.write(), map, r8lambdaVny7Iop5thIfAArp93JFD1zIPGQ.class);
        }
        Optional<getCooldownEnterSeconds.read> optionalIconCompatParcelizer4 = getcooldownenterseconds.IconCompatParcelizer(subscribeToBannersDismissedEvent.class, (Long) null);
        if (optionalIconCompatParcelizer4.IconCompatParcelizer()) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(optionalIconCompatParcelizer4.write(), map, subscribeToBannersDismissedEvent.class);
        }
        Optional<getCooldownEnterSeconds.read> optionalIconCompatParcelizer5 = getcooldownenterseconds.IconCompatParcelizer(r8lambdaF8wSYtxO3nnbAjq7V_HFBLwn80.class, (Long) null);
        if (optionalIconCompatParcelizer5.IconCompatParcelizer()) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(optionalIconCompatParcelizer5.write(), map, r8lambdaF8wSYtxO3nnbAjq7V_HFBLwn80.class);
        }
        return map;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        readandroid_sdk_base_release readandroid_sdk_base_releaseVar = this.RemoteActionCompatParcelizer;
        BrazeNotificationStyleFactory brazeNotificationStyleFactory = new BrazeNotificationStyleFactory(this, readandroid_sdk_base_releaseVar, 3);
        BrazeNotificationStyleFactory brazeNotificationStyleFactory2 = new BrazeNotificationStyleFactory(this, readandroid_sdk_base_releaseVar, 2);
        r8lambdaBwu0eAsW_c2I5nepduBlBhhsSGs r8lambdabwu0easw_c2i5nepdublbhhssgs = new r8lambdaBwu0eAsW_c2I5nepduBlBhhsSGs(this, readandroid_sdk_base_releaseVar);
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.read;
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU.class, r8lambdabwu0easw_c2i5nepdublbhhssgs);
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(unsubscribeFromBannersDismissedEvent.class, new r8lambdaI7cUxL8yKgOECZdkSyh4R8lXpco(this, readandroid_sdk_base_releaseVar));
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(requestGeofenceRefresh.class, new r8lambdaBVC3FJA1Mdp4iNRneU32ySyw1ZI(this, readandroid_sdk_base_releaseVar, this.write));
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(addBannerViewMonitor.class, new r8lambdaLTFP60mfMuriDVPyL7XLAn7hgrk(this, readandroid_sdk_base_releaseVar));
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(r8lambdalEIfbdvOx5AiS6eOxkCHNl8OjhA.class, new r8lambdaBpUQdpd2NDKNc6IEykBVRMF4IY(this, readandroid_sdk_base_releaseVar));
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(BrazeInternal.class, new r8lambdaMbwhFC_ZAam6ZVsGvUBUxh5qoWA(this, readandroid_sdk_base_releaseVar));
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(r8lambdaVny7Iop5thIfAArp93JFD1zIPGQ.class, new r8lambda9tu72BZ3BsoMvuXbE1aL_oRF9M(this, readandroid_sdk_base_releaseVar));
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(subscribeToBannersDismissedEvent.class, new r8lambda2tdN21rBy5GYdYxzo0cO1vmgwj4(this, readandroid_sdk_base_releaseVar));
        getanalyticsenabledenterannotations.read(ControlMessage.OTG_CHECK, new BrazeNotificationStyleFactory(this, readandroid_sdk_base_releaseVar, 4));
        getanalyticsenabledenterannotations.read(ControlMessage.GEOFENCE_TIMEOUT_OTG, brazeNotificationStyleFactory2);
        getanalyticsenabledenterannotations.read(ControlMessage.GEOFENCE_TIMEOUT_OTG_RESOLVED, brazeNotificationStyleFactory2);
        getanalyticsenabledenterannotations.read(ControlMessage.DISK_QUOTA_STATUS_UPDATED, new BrazeNotificationStyleFactory(this, readandroid_sdk_base_releaseVar, 1));
        getanalyticsenabledenterannotations.read(ControlMessage.NO_ACCURATE_LOCATIONS_OTG, brazeNotificationStyleFactory);
        getanalyticsenabledenterannotations.read(ControlMessage.NO_ACCURATE_LOCATIONS_OTG_RESOLVED, brazeNotificationStyleFactory);
        getanalyticsenabledenterannotations.read(ControlMessage.CONFIGURATION_UPDATED, new BrazeNotificationStyleFactory(this, readandroid_sdk_base_releaseVar, 0));
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.IconCompatParcelizer(this, readandroid_sdk_base_releaseVar);
    }

    public populateNotificationBuilderlambda1(readandroid_sdk_base_release readandroid_sdk_base_releaseVar, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, isGeofencesEnabledFromEnvironmentlambda1 isgeofencesenabledfromenvironmentlambda1, parseLonglambda0 parselonglambda0, getVerticalAccuracy getverticalaccuracy, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, getCooldownEnterSeconds getcooldownenterseconds, component4android_sdk_base_release component4android_sdk_base_releaseVar, accesshandlePush accesshandlepush, com.sentiance.sdk.util.c cVar, ConfigurationManager configurationManager, ServerConfigDataStoreProviderCompanion serverConfigDataStoreProviderCompanion, r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4, r8lambdaI90we4_tg_9aaM1nBxPMKmLPck r8lambdai90we4_tg_9aam1nbxpmkmlpck, BannersDataStoreProviderCompanionExternalSyntheticLambda2 bannersDataStoreProviderCompanionExternalSyntheticLambda2, onLocationRequestCompletelambda1 onlocationrequestcompletelambda1, r8lambda7xdj8Hz3fhe1sOrYgyl0CHrOnM r8lambda7xdj8hz3fhe1sorygyl0chronm, OffTheGridLocationSettingStateProvider offTheGridLocationSettingStateProvider) {
        Set<Byte> setSerializer;
        this.serializer = cVar;
        this.IconCompatParcelizer = r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4;
        this.RemoteActionCompatParcelizer = readandroid_sdk_base_releaseVar;
        this.read = getanalyticsenabledenterannotations;
        this.write = getcooldownenterseconds;
        this.MediaBrowserCompatMediaItem = isgeofencesenabledfromenvironmentlambda1;
        this.RatingCompat = parselonglambda0;
        this.MediaDescriptionCompat = getverticalaccuracy;
        this.MediaMetadataCompat = component4android_sdk_base_releaseVar;
        this.MediaSessionCompatQueueItem = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.ParcelableVolumeInfo = configurationManager;
        this.PlaybackStateCompatCustomAction = serverConfigDataStoreProviderCompanion;
        this.MediaSessionCompatToken = r8lambdai90we4_tg_9aam1nbxpmkmlpck;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = bannersDataStoreProviderCompanionExternalSyntheticLambda2;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = onlocationrequestcompletelambda1;
        this.MediaSessionCompatResultReceiverWrapper = accesshandlepush;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = r8lambda7xdj8hz3fhe1sorygyl0chronm;
        this.ComponentActivity = new r8lambdaHet8Jz7IcZoyFo4UnUY9jKvDVY(cVar, parselonglambda0, readandroid_sdk_base_releaseVar, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4, this);
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = offTheGridLocationSettingStateProvider;
        synchronized (this) {
            setSerializer = cVar.serializer();
            parselonglambda0.IconCompatParcelizer("Enabled OTG reasons retrieved from cache: " + setSerializer, new Object[0]);
        }
        if (setSerializer == null) {
            r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
            setSerializer = read(Long.valueOf(System.currentTimeMillis()));
        }
        this.PlaybackStateCompat = setSerializer;
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new setBigPictureSummaryAndTitle(this, System.currentTimeMillis());
    }

    private void read(Set<Byte> set) {
        com.sentiance.sdk.util.c cVar = this.serializer;
        synchronized (cVar) {
            try {
                if (set == null) {
                    cVar.read("open_otg_reasons");
                } else {
                    cVar.serializer("open_otg_reasons", (Set) set.stream().map(new H3Core$$ExternalSyntheticLambda2(11)).collect(Collectors.toSet()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean MediaDescriptionCompat() {
        Set<Byte> set = this.PlaybackStateCompat;
        boolean zContains = set.contains((byte) 3);
        r8lambdaHet8Jz7IcZoyFo4UnUY9jKvDVY r8lambdahet8jz7iczoyfo4unuy9jkvdvy = this.ComponentActivity;
        if (!zContains) {
            HashSet hashSet = new HashSet(set);
            for (r8lambda3Yr8ggNEHRP0MT0Ne8d9cEJ1duw r8lambda3yr8ggnehrp0mt0ne8d9cej1duw : this.ResultReceiver) {
                if (r8lambda3yr8ggnehrp0mt0ne8d9cej1duw.read()) {
                    hashSet.add(Byte.valueOf(r8lambda3yr8ggnehrp0mt0ne8d9cej1duw.RemoteActionCompatParcelizer()));
                } else {
                    hashSet.remove(Byte.valueOf(r8lambda3yr8ggnehrp0mt0ne8d9cej1duw.RemoteActionCompatParcelizer()));
                }
            }
            for (r8lambdaTLpfYipSHyWk_bsSf3N2g7hRo2c r8lambdatlpfyipshywk_bssf3n2g7hro2c : r8lambdahet8jz7iczoyfo4unuy9jkvdvy.IconCompatParcelizer()) {
                if (!r8lambdatlpfyipshywk_bssf3n2g7hro2c.IconCompatParcelizer()) {
                    hashSet.remove(Byte.valueOf(r8lambdatlpfyipshywk_bssf3n2g7hro2c.read()));
                }
            }
            if (hashSet.isEmpty()) {
                return false;
            }
        }
        ArrayList<r8lambdaTLpfYipSHyWk_bsSf3N2g7hRo2c> arrayListIconCompatParcelizer = r8lambdahet8jz7iczoyfo4unuy9jkvdvy.IconCompatParcelizer();
        for (r8lambdaTLpfYipSHyWk_bsSf3N2g7hRo2c r8lambdatlpfyipshywk_bssf3n2g7hro2c2 : arrayListIconCompatParcelizer) {
            write(Byte.valueOf(r8lambdatlpfyipshywk_bssf3n2g7hro2c2.read()), r8lambdatlpfyipshywk_bssf3n2g7hro2c2.IconCompatParcelizer(), r8lambdatlpfyipshywk_bssf3n2g7hro2c2.serializer());
        }
        return !arrayListIconCompatParcelizer.isEmpty();
    }

    public static void serializer(populateNotificationBuilderlambda1 populatenotificationbuilderlambda1) {
        if (populatenotificationbuilderlambda1.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM) {
            return;
        }
        populatenotificationbuilderlambda1.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = true;
        populatenotificationbuilderlambda1.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer(populatenotificationbuilderlambda1.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs, new IntentFilter("android.intent.action.AIRPLANE_MODE"));
    }

    public final boolean serializer() {
        return new ArrayList(read()).contains((byte) 9);
    }

    private void write(Byte b, boolean z, long j) {
        this.ComponentActivity.serializer(b.byteValue());
        this.ResultReceiver.add(new r8lambda3Yr8ggNEHRP0MT0Ne8d9cEJ1duw(b.byteValue(), j, z));
    }

    public final void read(boolean z) {
        write(false);
    }

    public static r8lambdaF8wSYtxO3nnbAjq7V_HFBLwn80 read(populateNotificationBuilderlambda1 populatenotificationbuilderlambda1, long j) {
        r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer;
        r8lambdaF8wSYtxO3nnbAjq7V_HFBLwn80 r8lambdaf8wsytxo3nnbajq7v_hfblwn80;
        getCooldownEnterSeconds.read readVarRemoteActionCompatParcelizer = populatenotificationbuilderlambda1.write.IconCompatParcelizer(r8lambdaF8wSYtxO3nnbAjq7V_HFBLwn80.class, Long.valueOf(j)).RemoteActionCompatParcelizer();
        if (readVarRemoteActionCompatParcelizer == null || (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = readVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(populatenotificationbuilderlambda1.MediaMetadataCompat)) == null || (r8lambdaf8wsytxo3nnbajq7v_hfblwn80 = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) == null) {
            return null;
        }
        return r8lambdaf8wsytxo3nnbajq7v_hfblwn80;
    }

    public final boolean read(Byte b, long j) {
        return new ArrayList(read(Long.valueOf(j))).contains(b);
    }

    public final HashSet read() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.PlaybackStateCompat);
        }
        return hashSet;
    }

    public final Optional<getCooldownEnterSeconds.read> read(long j, long j2) {
        invokeSuspendlambda0 invokesuspendlambda0;
        getCooldownEnterSeconds getcooldownenterseconds = this.write;
        getcooldownenterseconds.getClass();
        for (Optional<getCooldownEnterSeconds.read> optionalWrite = getcooldownenterseconds.write(j, Collections.singletonList(invokeSuspendlambda0.class), true); optionalWrite.IconCompatParcelizer() && optionalWrite.write().serializer() <= j2; optionalWrite = getcooldownenterseconds.write(optionalWrite.write().serializer(), Collections.singletonList(invokeSuspendlambda0.class), true)) {
            r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = optionalWrite.write().RemoteActionCompatParcelizer(this.MediaMetadataCompat);
            if (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer != null && (invokesuspendlambda0 = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer.getFullyDrawnReporter) != null && invokesuspendlambda0.read.booleanValue()) {
                return optionalWrite;
            }
        }
        return Optional.MediaSessionCompatQueueItem();
    }

    public static void RemoteActionCompatParcelizer(populateNotificationBuilderlambda1 populatenotificationbuilderlambda1, Byte b, boolean z) {
        populatenotificationbuilderlambda1.MediaSessionCompatQueueItem.getClass();
        populatenotificationbuilderlambda1.RemoteActionCompatParcelizer(b, z, System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void RemoteActionCompatParcelizer(Byte b, boolean z, long j) {
        Long lRemoteActionCompatParcelizer = z ? RemoteActionCompatParcelizer(b.byteValue(), j) : read(b.byteValue(), j);
        if (lRemoteActionCompatParcelizer != null) {
            IconCompatParcelizer(Collections.singletonList(new r8lambda3Yr8ggNEHRP0MT0Ne8d9cEJ1duw(b.byteValue(), lRemoteActionCompatParcelizer.longValue(), z)));
        }
        if (MediaDescriptionCompat()) {
            MediaSessionCompatQueueItem();
        }
    }

    private HashSet read(Long l) {
        r8lambdaTURWeRtF3oTEvz1WenZeX5TdwA r8lambdaturwertf3otevz1wenzex5tdwa;
        invokeSuspendlambda0 invokesuspendlambda0;
        HashMap map = new HashMap();
        try {
            Iterator<getCooldownEnterSeconds.read> it = this.write.RemoteActionCompatParcelizer(invokeSuspendlambda0.class, null, l, true, false).iterator();
            while (it.hasNext()) {
                r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = it.next().RemoteActionCompatParcelizer(this.MediaMetadataCompat);
                if (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer != null && (invokesuspendlambda0 = (r8lambdaturwertf3otevz1wenzex5tdwa = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer).getFullyDrawnReporter) != null) {
                    Byte b = invokesuspendlambda0.RemoteActionCompatParcelizer;
                    b.getClass();
                    Boolean bool = r8lambdaturwertf3otevz1wenzex5tdwa.getFullyDrawnReporter.read;
                    bool.getClass();
                    map.put(b, bool);
                }
            }
        } catch (NullPointerException e) {
            this.RatingCompat.IconCompatParcelizer(false, e, "Could not deserialize OTG event", new Object[0]);
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : map.entrySet()) {
            if (((Boolean) entry.getValue()).booleanValue()) {
                hashSet.add((Byte) entry.getKey());
            }
        }
        return hashSet;
    }

    public final void read(List<r8lambdaTLpfYipSHyWk_bsSf3N2g7hRo2c> list) {
        boolean z;
        synchronized (this) {
            try {
                boolean z2 = false;
                for (r8lambdaTLpfYipSHyWk_bsSf3N2g7hRo2c r8lambdatlpfyipshywk_bssf3n2g7hro2c : (ArrayList) list) {
                    r8lambdaHet8Jz7IcZoyFo4UnUY9jKvDVY r8lambdahet8jz7iczoyfo4unuy9jkvdvy = this.ComponentActivity;
                    synchronized (r8lambdahet8jz7iczoyfo4unuy9jkvdvy) {
                        r8lambdaTLpfYipSHyWk_bsSf3N2g7hRo2c r8lambdatlpfyipshywk_bssf3n2g7hro2cRemoteActionCompatParcelizer = r8lambdahet8jz7iczoyfo4unuy9jkvdvy.RemoteActionCompatParcelizer(r8lambdatlpfyipshywk_bssf3n2g7hro2c.read());
                        z = r8lambdatlpfyipshywk_bssf3n2g7hro2cRemoteActionCompatParcelizer != null && r8lambdatlpfyipshywk_bssf3n2g7hro2cRemoteActionCompatParcelizer.serializer() == r8lambdatlpfyipshywk_bssf3n2g7hro2c.serializer() && r8lambdatlpfyipshywk_bssf3n2g7hro2cRemoteActionCompatParcelizer.IconCompatParcelizer() == r8lambdatlpfyipshywk_bssf3n2g7hro2c.IconCompatParcelizer();
                    }
                    if (z) {
                        write(Byte.valueOf(r8lambdatlpfyipshywk_bssf3n2g7hro2c.read()), r8lambdatlpfyipshywk_bssf3n2g7hro2c.IconCompatParcelizer(), r8lambdatlpfyipshywk_bssf3n2g7hro2c.serializer());
                        z2 = true;
                    }
                }
                if (z2) {
                    MediaDescriptionCompat();
                }
                MediaSessionCompatQueueItem();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String serializer(Byte b) {
        switch (b.byteValue()) {
            case 1:
                return "LOCATION_PERMISSION";
            case 2:
                return "AIRPLANE_MODE";
            case 3:
                return "EXTERNAL_EVENT";
            case 4:
                return "LOCATION_ACCESS_ALWAYS";
            case 5:
                return "LOCATION_MODE_OFF";
            case 6:
                return "KILLSWITCH";
            case 7:
                return "OUTAGE";
            case 8:
                return "PLAY_SErVICES";
            case 9:
                return "NO_ACCURATE_LOCATION_FIXES";
            case 10:
                return "LOCATION_MODE_BATTERY_SAVING";
            case 11:
                return "LOCATION_MODE_DEVICE_ONLY";
            case 12:
                return "GEOFENCE_TRANSITION_TIMEOUT";
            case 13:
                return "DISK_QUOTA_EXCEEDED";
            case 14:
                return "BG_EXECUTION_RESTRICTED";
            case 15:
                return "BG_DETECTIONS_NOT_ALLOWED";
            case 16:
                return "LOCATION_ACCURACY_REDUCED";
            default:
                java.util.Locale locale = java.util.Locale.ENGLISH;
                byte bByteValue = b.byteValue();
                StringBuilder sb = new StringBuilder();
                sb.append((int) bByteValue);
                return sb.toString();
        }
    }

    private void IconCompatParcelizer(Byte b, boolean z) {
        this.MediaSessionCompatQueueItem.getClass();
        serializer(b, z, System.currentTimeMillis());
    }

    private void serializer(Byte b, boolean z, long j) {
        Long lRemoteActionCompatParcelizer = z ? RemoteActionCompatParcelizer(b.byteValue(), j) : read(b.byteValue(), j);
        if (lRemoteActionCompatParcelizer != null) {
            write(b, z, lRemoteActionCompatParcelizer.longValue());
        }
    }

    private Long RemoteActionCompatParcelizer(byte b, long j) {
        parseLonglambda0 parselonglambda0 = this.RatingCompat;
        r8lambdaHet8Jz7IcZoyFo4UnUY9jKvDVY r8lambdahet8jz7iczoyfo4unuy9jkvdvy = this.ComponentActivity;
        r8lambdaTLpfYipSHyWk_bsSf3N2g7hRo2c r8lambdatlpfyipshywk_bssf3n2g7hro2cRemoteActionCompatParcelizer = r8lambdahet8jz7iczoyfo4unuy9jkvdvy.RemoteActionCompatParcelizer(b);
        boolean z = r8lambdatlpfyipshywk_bssf3n2g7hro2cRemoteActionCompatParcelizer != null && r8lambdatlpfyipshywk_bssf3n2g7hro2cRemoteActionCompatParcelizer.IconCompatParcelizer();
        boolean z2 = (r8lambdatlpfyipshywk_bssf3n2g7hro2cRemoteActionCompatParcelizer == null || r8lambdatlpfyipshywk_bssf3n2g7hro2cRemoteActionCompatParcelizer.IconCompatParcelizer()) ? false : true;
        boolean zContains = this.PlaybackStateCompat.contains((byte) 3);
        String strSerializer = serializer(Byte.valueOf(b));
        if (zContains) {
            return Long.valueOf(j);
        }
        Long lValueOf = null;
        if (z2) {
            parselonglambda0.IconCompatParcelizer(strSerializer.concat(" disabled event was snoozed. Removing the snoozed entry only."), new Object[0]);
            r8lambdahet8jz7iczoyfo4unuy9jkvdvy.serializer(b);
            return null;
        }
        if (this.PlaybackStateCompat.contains(Byte.valueOf(b))) {
            Iterator it = this.ResultReceiver.iterator();
            do {
                if (!it.hasNext()) {
                    parselonglambda0.IconCompatParcelizer(strSerializer.concat(" is already enabled"), new Object[0]);
                    return null;
                }
            } while (((r8lambda3Yr8ggNEHRP0MT0Ne8d9cEJ1duw) it.next()).RemoteActionCompatParcelizer() != b);
        }
        boolean zIconCompatParcelizer = r8lambdahet8jz7iczoyfo4unuy9jkvdvy.IconCompatParcelizer(b);
        boolean zWrite = r8lambdahet8jz7iczoyfo4unuy9jkvdvy.write(b, j);
        if (!zIconCompatParcelizer && zWrite) {
            parselonglambda0.IconCompatParcelizer(strSerializer.concat(" enabled event can be snoozed"), new Object[0]);
            if (!z) {
                parselonglambda0.IconCompatParcelizer(ff$$ExternalSyntheticOutline0.m("Snoozing ", strSerializer, " enabled event"), new Object[0]);
                r8lambdahet8jz7iczoyfo4unuy9jkvdvy.read(b, j, true);
            }
            return null;
        }
        if (z) {
            synchronized (r8lambdahet8jz7iczoyfo4unuy9jkvdvy) {
                r8lambdaTLpfYipSHyWk_bsSf3N2g7hRo2c r8lambdatlpfyipshywk_bssf3n2g7hro2cRemoteActionCompatParcelizer2 = r8lambdahet8jz7iczoyfo4unuy9jkvdvy.RemoteActionCompatParcelizer(b);
                if (r8lambdatlpfyipshywk_bssf3n2g7hro2cRemoteActionCompatParcelizer2 != null) {
                    lValueOf = Long.valueOf(r8lambdatlpfyipshywk_bssf3n2g7hro2cRemoteActionCompatParcelizer2.serializer());
                }
            }
            if (lValueOf != null) {
                j = Math.min(lValueOf.longValue(), j);
            }
            return Long.valueOf(j);
        }
        return Long.valueOf(j);
    }

    public static void write(populateNotificationBuilderlambda1 populatenotificationbuilderlambda1) {
        populatenotificationbuilderlambda1.write(false);
    }
}
