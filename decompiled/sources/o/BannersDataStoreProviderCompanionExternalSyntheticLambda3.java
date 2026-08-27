package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.sentiance.core.model.events.N$b;
import com.sentiance.core.model.events.ThriftBool;
import com.sentiance.sdk.DetectionStatus;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.OnSdkStatusUpdateHandler;
import com.sentiance.sdk.SdkStatus;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.devicestate.LocationSetting;
import com.sentiance.sdk.devicestate.Permission;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.offthegrid.OffTheGridLocationSettingStateProvider;
import com.sentiance.sdk.quota.BandwidthQuotaMonitor;
import com.sentiance.sdk.task.e$$ExternalSyntheticLambda0;
import com.sentiance.sdk.util.Optional;
import io.sentry.util.network.NetworkBody;
import io.socket.parser.IOParser$Decoder;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "SdkStatusManager", componentName = "SdkStatusManager")
public class BannersDataStoreProviderCompanionExternalSyntheticLambda3 implements removeGeofencesRegisteredWithGeofencingClientlambda2, r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    private final r8lambdaH1qlE4ZDsxnFJ2uM0yQ5JRmvaYk ComponentActivity;
    private final readandroid_sdk_base_release IconCompatParcelizer;
    private final initializeGeofenceslambda1 MediaBrowserCompatMediaItem;
    private final isGeofencesEnabledFromEnvironmentlambda1 MediaDescriptionCompat;
    private final ConfigurationManager MediaMetadataCompat;
    private final getCooldownEnterSeconds MediaSessionCompatQueueItem;
    private final r8lambdaLvr3MS6iW1pdnAwN92rvcuKzrSY MediaSessionCompatResultReceiverWrapper;
    private final r8lambdaI90we4_tg_9aaM1nBxPMKmLPck MediaSessionCompatToken;
    private final accesshandlePush ParcelableVolumeInfo;
    private final getVerticalAccuracy PlaybackStateCompat;
    private final BandwidthQuotaMonitor PlaybackStateCompatCustomAction;
    private final getAnalyticsEnabledEnterannotations RatingCompat;
    private final populateNotificationBuilderlambda1 RemoteActionCompatParcelizer;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI ResultReceiver;
    private final r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    private final migrateTriggersReeligibilityToJsonlambda1<SdkStatus> r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    private final onLocationRequestCompletelambda1 r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    private final OffTheGridLocationSettingStateProvider r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    private final getBigTextNotificationStyle r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    private final removeGeofencesRegisteredWithGeofencingClientlambda00 r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    private final component4android_sdk_base_release r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    private final retrieveRegisteredGeofencesFromLocalStoragelambda0 r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    private final migrateTriggersReeligibilityToJsonlambda4<r8lambdaK6IZILH9V8ErT5zK67D8Tg0VC8Q> r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    private OnSdkStatusUpdateHandler r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    private final parseLonglambda0 read;
    private final e$$ExternalSyntheticLambda0 serializer = new e$$ExternalSyntheticLambda0(5, this);
    private final com.sentiance.sdk.util.c write;

    public static void write(BannersDataStoreProviderCompanionExternalSyntheticLambda3 bannersDataStoreProviderCompanionExternalSyntheticLambda3) {
        bannersDataStoreProviderCompanionExternalSyntheticLambda3.RemoteActionCompatParcelizer(false, false);
        bannersDataStoreProviderCompanionExternalSyntheticLambda3.IconCompatParcelizer.IconCompatParcelizer("SdkStatusManager", DeviceOrientationRequest.OUTPUT_PERIOD_FAST, bannersDataStoreProviderCompanionExternalSyntheticLambda3.serializer);
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        return Collections.EMPTY_LIST;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        synchronized (this) {
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.read(write((Long) null));
            this.IconCompatParcelizer.IconCompatParcelizer(this.serializer);
            this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.IconCompatParcelizer(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void MediaSessionCompatQueueItem() {
        synchronized (this) {
            SdkStatus sdkStatusWrite = write((Long) null);
            if (!this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.serializer() || !sdkStatusWrite.equals(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.read())) {
                this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.read(sdkStatusWrite);
                RatingCompat();
            }
        }
    }

    private void RatingCompat() {
        SdkStatus sdkStatusM5084clone = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.read().m5084clone();
        this.read.IconCompatParcelizer("Sdk status updated: %s", sdkStatusM5084clone.toString());
        OnSdkStatusUpdateHandler onSdkStatusUpdateHandler = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        if (onSdkStatusUpdateHandler != null) {
            readBoolean.read(new r8lambdaIUthN2YaT0s_KuSUXAkLC1c4dk(onSdkStatusUpdateHandler, sdkStatusM5084clone));
        }
    }

    private boolean RemoteActionCompatParcelizer() {
        for (Byte b : this.RemoteActionCompatParcelizer.read()) {
            if (b.byteValue() == 12 || b.byteValue() == 9 || b.byteValue() == 10 || b.byteValue() == 11 || b.byteValue() == 5 || b.byteValue() == 4 || b.byteValue() == 1 || b.byteValue() == 16) {
                return false;
            }
        }
        return this.MediaDescriptionCompat.MediaBrowserCompatMediaItem() && this.MediaSessionCompatResultReceiverWrapper.write();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x00f9  */
    public SdkStatus write(Long l) {
        SdkStatus.LocationSetting locationSetting;
        SdkStatus.QuotaStatus quotaStatus;
        SdkStatus.LocationPermission locationPermission;
        boolean z;
        r8lambdaFjiFiJxJXuf3VopUwRuT7TXivug r8lambdafjifijxjxuf3vopuwrut7txivugWrite = this.MediaBrowserCompatMediaItem.write();
        deleteRegisteredGeofenceCache deleteregisteredgeofencecacheRemoteActionCompatParcelizer = this.ComponentActivity.RemoteActionCompatParcelizer();
        SdkStatus.StartStatus startStatusRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(l);
        boolean zR8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = this.MediaMetadataCompat.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw();
        onLocationRequestCompletelambda1 onlocationrequestcompletelambda1 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        onlocationrequestcompletelambda1.getClass();
        boolean zWrite = onlocationrequestcompletelambda1.write(Permission.FINE_LOCATION);
        boolean zSerializer = onlocationrequestcompletelambda1.serializer();
        int i = r8lambdaXW0ch65c0ovp6MIs5jryjUa2cbA.RemoteActionCompatParcelizer[this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.read().ordinal()];
        if (i == 1) {
            locationSetting = SdkStatus.LocationSetting.DISABLED;
        } else if (i != 2) {
            locationSetting = i != 3 ? SdkStatus.LocationSetting.OK : SdkStatus.LocationSetting.DEVICE_ONLY;
        } else {
            locationSetting = SdkStatus.LocationSetting.BATTERY_SAVING;
        }
        SdkStatus.LocationSetting locationSetting2 = locationSetting;
        boolean zMediaSessionCompatQueueItem = this.MediaDescriptionCompat.MediaSessionCompatQueueItem();
        boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        boolean zBooleanValue = r8lambdafjifijxjxuf3vopuwrut7txivugWrite.MediaSessionCompatToken.booleanValue();
        boolean zBooleanValue2 = r8lambdafjifijxjxuf3vopuwrut7txivugWrite.ParcelableVolumeInfo.booleanValue();
        boolean zBooleanValue3 = r8lambdafjifijxjxuf3vopuwrut7txivugWrite.MediaSessionCompatResultReceiverWrapper.booleanValue();
        boolean zWrite2 = this.MediaSessionCompatResultReceiverWrapper.write();
        SdkStatus.QuotaStatus quotaStatusWrite = write(BandwidthQuotaMonitor.NetworkType.WIFI);
        SdkStatus.QuotaStatus quotaStatusWrite2 = write(BandwidthQuotaMonitor.NetworkType.MOBILE);
        int i2 = this.ParcelableVolumeInfo.read();
        if (i2 != 2) {
            quotaStatus = (i2 == 3 || i2 == 4) ? SdkStatus.QuotaStatus.EXCEEDED : SdkStatus.QuotaStatus.OK;
        } else {
            quotaStatus = SdkStatus.QuotaStatus.WARNING;
        }
        SdkStatus.QuotaStatus quotaStatus2 = quotaStatus;
        int i3 = r8lambdaXW0ch65c0ovp6MIs5jryjUa2cbA.write[onlocationrequestcompletelambda1.write().ordinal()];
        if (i3 != 1) {
            locationPermission = i3 != 2 ? SdkStatus.LocationPermission.NEVER : SdkStatus.LocationPermission.ONLY_WHILE_IN_USE;
        } else {
            locationPermission = SdkStatus.LocationPermission.ALWAYS;
        }
        SdkStatus sdkStatus = new SdkStatus(startStatusRemoteActionCompatParcelizer, false, !zR8lambdavCwjfXDiSGcirCy4I008VOiJ_lw, zWrite, zSerializer, locationSetting2, zMediaSessionCompatQueueItem, zRemoteActionCompatParcelizer, zBooleanValue, zBooleanValue2, zBooleanValue3, !zWrite2, quotaStatusWrite, quotaStatusWrite2, quotaStatus2, locationPermission, deleteregisteredgeofencecacheRemoteActionCompatParcelizer.IconCompatParcelizer.booleanValue(), this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.MediaDescriptionCompat());
        if (sdkStatus.isRemoteEnabled && sdkStatus.isGpsPresent && !sdkStatus.isGooglePlayServicesMissing) {
            HashSet hashSet = new HashSet(this.RemoteActionCompatParcelizer.read());
            hashSet.remove((byte) 3);
            if (hashSet.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        sdkStatus.canDetect = z;
        BrazeInternal brazeInternalWrite = this.MediaSessionCompatToken.write();
        Boolean bool = brazeInternalWrite.RemoteActionCompatParcelizer;
        if (bool != null) {
            sdkStatus.isBatteryOptimizationEnabled = bool.booleanValue();
        }
        Boolean bool2 = brazeInternalWrite.IconCompatParcelizer;
        if (bool2 != null) {
            sdkStatus.isBatterySavingEnabled = bool2.booleanValue();
        }
        Boolean bool3 = brazeInternalWrite.read;
        if (bool3 != null) {
            sdkStatus.isBackgroundProcessingRestricted = bool3.booleanValue();
        }
        return sdkStatus;
    }

    public final publishBrazePushAction IconCompatParcelizer() {
        SdkStatus.QuotaStatus quotaStatus;
        getBigTextNotificationStyle getbigtextnotificationstyle = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        int i = getbigtextnotificationstyle.write().read();
        Long lSerializer = getbigtextnotificationstyle.write().serializer();
        boolean zRemoteActionCompatParcelizer = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.RemoteActionCompatParcelizer();
        DetectionStatus detectionStatusFromSdkStatus = DetectionStatus.fromSdkStatus(RemoteActionCompatParcelizer((Long) null));
        int i2 = this.ParcelableVolumeInfo.read();
        if (i2 != 2) {
            quotaStatus = (i2 == 3 || i2 == 4) ? SdkStatus.QuotaStatus.EXCEEDED : SdkStatus.QuotaStatus.OK;
        } else {
            quotaStatus = SdkStatus.QuotaStatus.WARNING;
        }
        SdkStatus.QuotaStatus quotaStatus2 = quotaStatus;
        SdkStatus.QuotaStatus quotaStatusWrite = write(BandwidthQuotaMonitor.NetworkType.WIFI);
        SdkStatus.QuotaStatus quotaStatusWrite2 = write(BandwidthQuotaMonitor.NetworkType.MOBILE);
        boolean zRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer();
        this.PlaybackStateCompat.getClass();
        return getVerticalAccuracy.IconCompatParcelizer(detectionStatusFromSdkStatus, quotaStatus2, quotaStatusWrite, quotaStatusWrite2, zRemoteActionCompatParcelizer2, i, lSerializer, zRemoteActionCompatParcelizer);
    }

    public final void RemoteActionCompatParcelizer(boolean z, boolean z2) {
        SdkStatus.LocationPermission locationPermission;
        Byte bValueOf;
        synchronized (this) {
            r8lambdaK6IZILH9V8ErT5zK67D8Tg0VC8Q r8lambdak6izilh9v8ert5zk67d8tg0vc8q = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.read();
            BrazeInternal brazeInternalWrite = this.MediaSessionCompatToken.write();
            deleteRegisteredGeofenceCache deleteregisteredgeofencecacheRemoteActionCompatParcelizer = this.ComponentActivity.RemoteActionCompatParcelizer();
            getVerticalAccuracy getverticalaccuracy = this.PlaybackStateCompat;
            int i = r8lambdaXW0ch65c0ovp6MIs5jryjUa2cbA.write[this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.write().ordinal()];
            if (i != 1) {
                locationPermission = i != 2 ? SdkStatus.LocationPermission.NEVER : SdkStatus.LocationPermission.ONLY_WHILE_IN_USE;
            } else {
                locationPermission = SdkStatus.LocationPermission.ALWAYS;
            }
            SdkStatus.LocationPermission locationPermission2 = locationPermission;
            onLocationRequestCompletelambda1 onlocationrequestcompletelambda1 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            onlocationrequestcompletelambda1.getClass();
            boolean zWrite = onlocationrequestcompletelambda1.write(Permission.FINE_LOCATION);
            boolean zSerializer = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.serializer();
            Boolean bool = brazeInternalWrite.RemoteActionCompatParcelizer;
            Boolean bool2 = brazeInternalWrite.read;
            Boolean bool3 = deleteregisteredgeofencecacheRemoteActionCompatParcelizer.IconCompatParcelizer;
            Byte b = brazeInternalWrite.serializer;
            getverticalaccuracy.getClass();
            logPushCampaign logpushcampaignRemoteActionCompatParcelizer = getVerticalAccuracy.RemoteActionCompatParcelizer(locationPermission2, zWrite, zSerializer, bool, bool2, bool3, b);
            r8lambdaM7UaNzSECvCoNHXoN4wkPSK8w_I r8lambdam7uanzsecvconhxon4wkpsk8w_iWrite = write();
            publishBrazePushAction publishbrazepushactionIconCompatParcelizer = IconCompatParcelizer();
            boolean z3 = (r8lambdak6izilh9v8ert5zk67d8tg0vc8q != null && r8lambdak6izilh9v8ert5zk67d8tg0vc8q.write.equals(logpushcampaignRemoteActionCompatParcelizer) && r8lambdak6izilh9v8ert5zk67d8tg0vc8q.serializer.equals(r8lambdam7uanzsecvconhxon4wkpsk8w_iWrite) && new migrateBannerStorageToJson(r8lambdak6izilh9v8ert5zk67d8tg0vc8q.IconCompatParcelizer).equals(new migrateBannerStorageToJson(publishbrazepushactionIconCompatParcelizer))) ? false : true;
            this.ResultReceiver.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jSerializer = serializer();
            if (z3) {
                bValueOf = Byte.valueOf(z2 ? (byte) 1 : (byte) 2);
            } else if (!z2 || jCurrentTimeMillis - jSerializer <= TimeUnit.MINUTES.toMillis(this.MediaMetadataCompat.MediaDescriptionCompat())) {
                bValueOf = z ? (byte) 3 : null;
            } else {
                bValueOf = (byte) 1;
            }
            Byte b2 = bValueOf;
            serializer(b2, publishbrazepushactionIconCompatParcelizer, logpushcampaignRemoteActionCompatParcelizer, r8lambdam7uanzsecvconhxon4wkpsk8w_iWrite, r8lambdak6izilh9v8ert5zk67d8tg0vc8q);
            if (b2 != null) {
                this.ResultReceiver.getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                write(jCurrentTimeMillis2, b2, publishbrazepushactionIconCompatParcelizer, logpushcampaignRemoteActionCompatParcelizer, r8lambdam7uanzsecvconhxon4wkpsk8w_iWrite);
                if (b2.byteValue() == 1) {
                    this.write.read(jCurrentTimeMillis2, "last_status_update_key_due_to_app_foregrounding");
                }
            }
        }
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        this.write.read();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        HashMap map = new HashMap();
        List<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>> listAsList = Arrays.asList(requestGeofenceRefresh.class, unsubscribeFromBannersDismissedEvent.class);
        getCooldownEnterSeconds getcooldownenterseconds = this.MediaSessionCompatQueueItem;
        Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer = getcooldownenterseconds.RemoteActionCompatParcelizer(listAsList, (Long) null, false);
        boolean zIconCompatParcelizer = optionalRemoteActionCompatParcelizer.IconCompatParcelizer();
        getVerticalAccuracy getverticalaccuracy = this.PlaybackStateCompat;
        if (zIconCompatParcelizer) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(optionalRemoteActionCompatParcelizer.write(), map, getBitmapFromCache.IconCompatParcelizer(optionalRemoteActionCompatParcelizer.write(), getverticalaccuracy));
        }
        Optional<getCooldownEnterSeconds.read> optionalIconCompatParcelizer = getcooldownenterseconds.IconCompatParcelizer(r8lambdaK6IZILH9V8ErT5zK67D8Tg0VC8Q.class, (Long) null);
        if (optionalIconCompatParcelizer.IconCompatParcelizer()) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(optionalIconCompatParcelizer.write(), map, getBitmapFromCache.IconCompatParcelizer(optionalIconCompatParcelizer.write(), getverticalaccuracy));
        }
        return map;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        readandroid_sdk_base_release readandroid_sdk_base_releaseVar = this.IconCompatParcelizer;
        migrateContentCardsMetadataToJsonlambda2 migratecontentcardsmetadatatojsonlambda2 = new migrateContentCardsMetadataToJsonlambda2(this, readandroid_sdk_base_releaseVar);
        migrateContentCardsStorageToJsonlambda11 migratecontentcardsstoragetojsonlambda11 = new migrateContentCardsStorageToJsonlambda11(this, readandroid_sdk_base_releaseVar);
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.RatingCompat;
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(requestGeofenceRefresh.class, migratecontentcardsstoragetojsonlambda11);
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(unsubscribeFromBannersDismissedEvent.class, new migrateContentCardsStorageToJsonlambda0(this, readandroid_sdk_base_releaseVar));
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(invokeSuspendlambda0.class, new migrateContentCardsMetadataToJsonlambda0(this, readandroid_sdk_base_releaseVar, this.RemoteActionCompatParcelizer));
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(BrazeInternal.class, new migrateContentCardsStorageToJsonlambda10(this, readandroid_sdk_base_releaseVar));
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(addSerializedContentCardToStorage.class, new r8lambdaHFcCi9BysOqeqzkd27ObgFjs(this, readandroid_sdk_base_releaseVar));
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(deleteRegisteredGeofenceCache.class, new r8lambdaD7CaSpEWt0FxiirbdMuUbP1UYc(this, readandroid_sdk_base_releaseVar));
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(addBannerViewMonitor.class, new migrateContentCardsStorageToJsonlambda20(this, readandroid_sdk_base_releaseVar));
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(r8lambdaVny7Iop5thIfAArp93JFD1zIPGQ.class, new migrateContentCardsMetadataToJsonlambda1(this, readandroid_sdk_base_releaseVar));
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(r8lambdalEIfbdvOx5AiS6eOxkCHNl8OjhA.class, new r8lambdan27ReVS2nRhSTKXn0f1atgZfQdg(this, readandroid_sdk_base_releaseVar));
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(r8lambdaF8wSYtxO3nnbAjq7V_HFBLwn80.class, new r8lambdakZdSL2v42EV1632Ndclqe8iTXg(this, readandroid_sdk_base_releaseVar));
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(r8lambdaX8O0CQVGYSvyuZ1ZQ9WvuF9jtM.class, new r8lambdapNTufSYJO3jD9Vb79dUFYMqitgM(this, readandroid_sdk_base_releaseVar));
        getanalyticsenabledenterannotations.read(ControlMessage.CONFIGURATION_UPDATED, migratecontentcardsmetadatatojsonlambda2);
        getanalyticsenabledenterannotations.read(ControlMessage.DISK_QUOTA_STATUS_UPDATED, migratecontentcardsmetadatatojsonlambda2);
        getanalyticsenabledenterannotations.read(ControlMessage.BANDWIDTH_QUOTA_STATUS_UPDATED, migratecontentcardsmetadatatojsonlambda2);
    }

    public final r8lambdaM7UaNzSECvCoNHXoN4wkPSK8w_I write() {
        BrazeInternal brazeInternalWrite = this.MediaSessionCompatToken.write();
        r8lambdaFjiFiJxJXuf3VopUwRuT7TXivug r8lambdafjifijxjxuf3vopuwrut7txivugWrite = this.MediaBrowserCompatMediaItem.write();
        boolean zBooleanValue = r8lambdafjifijxjxuf3vopuwrut7txivugWrite.MediaSessionCompatToken.booleanValue();
        boolean zBooleanValue2 = r8lambdafjifijxjxuf3vopuwrut7txivugWrite.ParcelableVolumeInfo.booleanValue();
        boolean zBooleanValue3 = brazeInternalWrite.IconCompatParcelizer.booleanValue();
        ConfigurationManager configurationManager = this.MediaMetadataCompat;
        byte bIconCompatParcelizer = configurationManager.IconCompatParcelizer();
        byte bSerializer = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.serializer();
        IOParser$Decoder iOParser$Decoder = new IOParser$Decoder();
        ThriftBool thriftBool = bSerializer < bIconCompatParcelizer ? ThriftBool.TRUE : ThriftBool.FALSE;
        if (thriftBool == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'is_low' cannot be null");
            return null;
        }
        iOParser$Decoder.RemoteActionCompatParcelizer = thriftBool;
        iOParser$Decoder.read = Byte.valueOf(bIconCompatParcelizer);
        onActivityPausedlambda0 onactivitypausedlambda0RemoteActionCompatParcelizer = iOParser$Decoder.RemoteActionCompatParcelizer();
        byte bSerializer2 = configurationManager.serializer();
        accesshandlePush accesshandlepush = this.ParcelableVolumeInfo;
        long jSerializer = accesshandlepush.serializer();
        double dRemoteActionCompatParcelizer = (jSerializer - accesshandlepush.RemoteActionCompatParcelizer()) / jSerializer;
        NetworkBody networkBody = new NetworkBody(11);
        ThriftBool thriftBool2 = dRemoteActionCompatParcelizer * 100.0d < ((double) bSerializer2) ? ThriftBool.TRUE : ThriftBool.FALSE;
        if (thriftBool2 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'is_low' cannot be null");
            return null;
        }
        networkBody.IconCompatParcelizer = thriftBool2;
        networkBody.RemoteActionCompatParcelizer = Byte.valueOf(bSerializer2);
        registerOnApplicationlambda0 registeronapplicationlambda0Serializer = networkBody.serializer();
        ArrayList arrayList = new ArrayList();
        isGeofencesEnabledFromEnvironmentlambda1 isgeofencesenabledfromenvironmentlambda1 = this.MediaDescriptionCompat;
        LocationSetting locationSettingIconCompatParcelizer = isgeofencesenabledfromenvironmentlambda1.IconCompatParcelizer();
        if (locationSettingIconCompatParcelizer.IconCompatParcelizer()) {
            arrayList.add((byte) 1);
        }
        if (locationSettingIconCompatParcelizer.write()) {
            arrayList.add((byte) 2);
        }
        boolean zMediaSessionCompatQueueItem = isgeofencesenabledfromenvironmentlambda1.MediaSessionCompatQueueItem();
        boolean zWrite = this.MediaSessionCompatResultReceiverWrapper.write();
        boolean zWrite2 = isgeofencesenabledfromenvironmentlambda1.write();
        this.PlaybackStateCompat.getClass();
        return getVerticalAccuracy.RemoteActionCompatParcelizer(zBooleanValue, zBooleanValue2, zBooleanValue3, onactivitypausedlambda0RemoteActionCompatParcelizer, registeronapplicationlambda0Serializer, arrayList, zMediaSessionCompatQueueItem, zWrite, zWrite2);
    }

    public final SdkStatus read() {
        MediaSessionCompatQueueItem();
        return this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.read().m5084clone();
    }

    private long serializer() {
        return this.write.IconCompatParcelizer("last_status_update_key_due_to_app_foregrounding", 0L);
    }

    public BannersDataStoreProviderCompanionExternalSyntheticLambda3(com.sentiance.sdk.util.c cVar, parseLonglambda0 parselonglambda0, populateNotificationBuilderlambda1 populatenotificationbuilderlambda1, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, getCooldownEnterSeconds getcooldownenterseconds, isGeofencesEnabledFromEnvironmentlambda1 isgeofencesenabledfromenvironmentlambda1, ConfigurationManager configurationManager, initializeGeofenceslambda1 initializegeofenceslambda1, BandwidthQuotaMonitor bandwidthQuotaMonitor, accesshandlePush accesshandlepush, getVerticalAccuracy getverticalaccuracy, r8lambdaLvr3MS6iW1pdnAwN92rvcuKzrSY r8lambdalvr3ms6iw1pdnawn92rvcukzrsy, r8lambdaI90we4_tg_9aaM1nBxPMKmLPck r8lambdai90we4_tg_9aam1nbxpmkmlpck, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, r8lambdaH1qlE4ZDsxnFJ2uM0yQ5JRmvaYk r8lambdah1qle4zdsxnfj2um0yq5jrmvayk, onLocationRequestCompletelambda1 onlocationrequestcompletelambda1, r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambdaw447glwjfoun4bg91upxnadqezs, component4android_sdk_base_release component4android_sdk_base_releaseVar, removeGeofencesRegisteredWithGeofencingClientlambda00 removegeofencesregisteredwithgeofencingclientlambda00, getBigTextNotificationStyle getbigtextnotificationstyle, OffTheGridLocationSettingStateProvider offTheGridLocationSettingStateProvider, retrieveRegisteredGeofencesFromLocalStoragelambda0 retrieveregisteredgeofencesfromlocalstoragelambda0) {
        this.write = cVar;
        this.read = parselonglambda0;
        this.RemoteActionCompatParcelizer = populatenotificationbuilderlambda1;
        this.IconCompatParcelizer = readandroid_sdk_base_releaseVar;
        this.RatingCompat = getanalyticsenabledenterannotations;
        this.MediaSessionCompatQueueItem = getcooldownenterseconds;
        this.MediaDescriptionCompat = isgeofencesenabledfromenvironmentlambda1;
        this.MediaMetadataCompat = configurationManager;
        this.MediaBrowserCompatMediaItem = initializegeofenceslambda1;
        this.PlaybackStateCompatCustomAction = bandwidthQuotaMonitor;
        this.ParcelableVolumeInfo = accesshandlepush;
        this.PlaybackStateCompat = getverticalaccuracy;
        this.MediaSessionCompatResultReceiverWrapper = r8lambdalvr3ms6iw1pdnawn92rvcukzrsy;
        this.MediaSessionCompatToken = r8lambdai90we4_tg_9aam1nbxpmkmlpck;
        this.ComponentActivity = r8lambdah1qle4zdsxnfj2um0yq5jrmvayk;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = onlocationrequestcompletelambda1;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = r8lambdaw447glwjfoun4bg91upxnadqezs;
        this.ResultReceiver = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = component4android_sdk_base_releaseVar;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = removegeofencesregisteredwithgeofencingclientlambda00;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = getbigtextnotificationstyle;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = offTheGridLocationSettingStateProvider;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = retrieveregisteredgeofencesfromlocalstoragelambda0;
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new ContentCardsDataStoreProviderCompanion(this, System.currentTimeMillis());
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = new r8lambdasSn4K0BlmnVS6S0kFZ79yMs1Tw(this);
    }

    public static void serializer(BannersDataStoreProviderCompanionExternalSyntheticLambda3 bannersDataStoreProviderCompanionExternalSyntheticLambda3) {
        bannersDataStoreProviderCompanionExternalSyntheticLambda3.IconCompatParcelizer.IconCompatParcelizer("SdkStatusManager", DeviceOrientationRequest.OUTPUT_PERIOD_FAST, bannersDataStoreProviderCompanionExternalSyntheticLambda3.serializer);
    }

    private SdkStatus.StartStatus RemoteActionCompatParcelizer(Long l) {
        getCooldownEnterSeconds getcooldownenterseconds = this.MediaSessionCompatQueueItem;
        if (!getcooldownenterseconds.serializer(l)) {
            if (getcooldownenterseconds.RemoteActionCompatParcelizer() != null) {
                return SdkStatus.StartStatus.START_EXPIRED;
            }
            return SdkStatus.StartStatus.NOT_STARTED;
        }
        HashSet hashSet = this.RemoteActionCompatParcelizer.read();
        if (!hashSet.isEmpty() && (hashSet.size() != 1 || !hashSet.contains((byte) 3))) {
            return SdkStatus.StartStatus.PENDING;
        }
        return SdkStatus.StartStatus.STARTED;
    }

    public final void read(OnSdkStatusUpdateHandler onSdkStatusUpdateHandler) {
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = onSdkStatusUpdateHandler;
    }

    private SdkStatus.QuotaStatus write(BandwidthQuotaMonitor.NetworkType networkType) {
        int iIconCompatParcelizer = this.PlaybackStateCompatCustomAction.IconCompatParcelizer(networkType);
        if (iIconCompatParcelizer == 1) {
            return SdkStatus.QuotaStatus.WARNING;
        }
        if (iIconCompatParcelizer != 2) {
            return SdkStatus.QuotaStatus.OK;
        }
        return SdkStatus.QuotaStatus.EXCEEDED;
    }

    public static void IconCompatParcelizer(BannersDataStoreProviderCompanionExternalSyntheticLambda3 bannersDataStoreProviderCompanionExternalSyntheticLambda3, BrazeInternal brazeInternal) {
        boolean z;
        synchronized (bannersDataStoreProviderCompanionExternalSyntheticLambda3) {
            SdkStatus sdkStatusM5084clone = bannersDataStoreProviderCompanionExternalSyntheticLambda3.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.read().m5084clone();
            Boolean bool = brazeInternal.RemoteActionCompatParcelizer;
            boolean z2 = true;
            if (bool == null || sdkStatusM5084clone.isBatteryOptimizationEnabled == bool.booleanValue()) {
                z = false;
            } else {
                sdkStatusM5084clone.isBatteryOptimizationEnabled = brazeInternal.RemoteActionCompatParcelizer.booleanValue();
                z = true;
            }
            Boolean bool2 = brazeInternal.IconCompatParcelizer;
            if (bool2 == null || sdkStatusM5084clone.isBatterySavingEnabled == bool2.booleanValue()) {
                z2 = z;
            } else {
                sdkStatusM5084clone.isBatterySavingEnabled = brazeInternal.IconCompatParcelizer.booleanValue();
            }
            Boolean bool3 = brazeInternal.read;
            if (bool3 != null && sdkStatusM5084clone.isBackgroundProcessingRestricted != bool3.booleanValue()) {
                sdkStatusM5084clone.isBackgroundProcessingRestricted = brazeInternal.read.booleanValue();
            } else if (z2) {
            }
            bannersDataStoreProviderCompanionExternalSyntheticLambda3.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.read(sdkStatusM5084clone);
            bannersDataStoreProviderCompanionExternalSyntheticLambda3.RatingCompat();
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0023  */
    private void serializer(Byte b, publishBrazePushAction publishbrazepushaction, logPushCampaign logpushcampaign, r8lambdaM7UaNzSECvCoNHXoN4wkPSK8w_I r8lambdam7uanzsecvconhxon4wkpsk8w_i, r8lambdaK6IZILH9V8ErT5zK67D8Tg0VC8Q r8lambdak6izilh9v8ert5zk67d8tg0vc8q) {
        String str;
        String str2 = "null";
        if (b == null) {
            str = "null";
        } else if (b.byteValue() == 2) {
            str = "Status Changed";
        } else if (b.byteValue() == 1) {
            str = "App Foregrounding";
        } else if (b.byteValue() != 3) {
            str = "null";
        } else {
            str = "Forced";
        }
        this.ResultReceiver.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jSerializer = serializer();
        if (r8lambdak6izilh9v8ert5zk67d8tg0vc8q != null) {
            str2 = r8lambdak6izilh9v8ert5zk67d8tg0vc8q.IconCompatParcelizer + ", " + r8lambdak6izilh9v8ert5zk67d8tg0vc8q.write + ", " + r8lambdak6izilh9v8ert5zk67d8tg0vc8q.serializer;
        }
        if (b != null) {
            Object[] objArr = {Long.valueOf(jCurrentTimeMillis - jSerializer)};
            parseLonglambda0 parselonglambda0 = this.read;
            parselonglambda0.IconCompatParcelizer("Time since last StatusUpdateEvent due to app foreground trigger: %d", objArr);
            parselonglambda0.IconCompatParcelizer("New trigger: %s", str);
            parselonglambda0.IconCompatParcelizer("Previous status: %s", str2);
            parselonglambda0.IconCompatParcelizer("Current status:  %s, %s, %s", publishbrazepushaction, logpushcampaign, r8lambdam7uanzsecvconhxon4wkpsk8w_i);
        }
    }

    public final void write(long j, Byte b, publishBrazePushAction publishbrazepushaction, logPushCampaign logpushcampaign, r8lambdaM7UaNzSECvCoNHXoN4wkPSK8w_I r8lambdam7uanzsecvconhxon4wkpsk8w_i) {
        this.PlaybackStateCompat.getClass();
        N$b n$b = new N$b();
        n$b.IconCompatParcelizer = b;
        n$b.read = publishbrazepushaction;
        n$b.write = logpushcampaign;
        n$b.serializer = r8lambdam7uanzsecvconhxon4wkpsk8w_i;
        r8lambdaK6IZILH9V8ErT5zK67D8Tg0VC8Q r8lambdak6izilh9v8ert5zk67d8tg0vc8qIconCompatParcelizer = n$b.IconCompatParcelizer();
        r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
        r8lambdaromdixahini0blcevvl7ehebhj0.addObserverForBackInvokerlambda0 = r8lambdak6izilh9v8ert5zk67d8tg0vc8qIconCompatParcelizer;
        r8lambdaTURWeRtF3oTEvz1WenZeX5TdwA r8lambdaturwertf3otevz1wenzex5tdwaIconCompatParcelizer = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
        r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = getVerticalAccuracy.read(j);
        r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaturwertf3otevz1wenzex5tdwaIconCompatParcelizer;
        this.RatingCompat.serializer(r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm);
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.IconCompatParcelizer(r8lambdak6izilh9v8ert5zk67d8tg0vc8qIconCompatParcelizer);
    }

    public static r8lambdaK6IZILH9V8ErT5zK67D8Tg0VC8Q IconCompatParcelizer(BannersDataStoreProviderCompanionExternalSyntheticLambda3 bannersDataStoreProviderCompanionExternalSyntheticLambda3) {
        r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer;
        r8lambdaK6IZILH9V8ErT5zK67D8Tg0VC8Q r8lambdak6izilh9v8ert5zk67d8tg0vc8q;
        Optional<getCooldownEnterSeconds.read> optionalIconCompatParcelizer = bannersDataStoreProviderCompanionExternalSyntheticLambda3.MediaSessionCompatQueueItem.IconCompatParcelizer(r8lambdaK6IZILH9V8ErT5zK67D8Tg0VC8Q.class, (Long) null);
        if (!optionalIconCompatParcelizer.IconCompatParcelizer() || (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = optionalIconCompatParcelizer.write().RemoteActionCompatParcelizer(bannersDataStoreProviderCompanionExternalSyntheticLambda3.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4)) == null || (r8lambdak6izilh9v8ert5zk67d8tg0vc8q = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer.addObserverForBackInvokerlambda0) == null) {
            return null;
        }
        return r8lambdak6izilh9v8ert5zk67d8tg0vc8q;
    }
}
