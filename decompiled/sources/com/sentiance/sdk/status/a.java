package com.sentiance.sdk.status;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.devicestate.LocationPermissionLevel;
import com.sentiance.sdk.devicestate.Permission;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.processguard.Guard$Type;
import com.sentiance.sdk.services.ServiceManager;
import com.sentiance.sdk.task.e$$ExternalSyntheticLambda0;
import com.sentiance.sdk.util.Optional;
import com.sentiance.sdk.util.c;
import io.sentry.Scopes$$ExternalSyntheticLambda0;
import java.util.HashMap;
import java.util.Map;
import o.BannersDataStoreProviderCompanionExternalSyntheticLambda2;
import o.addBannerViewMonitor;
import o.addSerializedContentCardToStorage;
import o.applyPendingRuntimeConfiguration;
import o.component4android_sdk_base_release;
import o.getAnalyticsEnabledEnterannotations;
import o.getCooldownEnterSeconds;
import o.getVerticalAccuracy;
import o.migrateBannerImpressionMapToJson;
import o.migrateBannerStorageToJsonlambda11;
import o.migrateBannerStorageToJsonlambda20;
import o.onLocationRequestCompletelambda1;
import o.parseLonglambda0;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k;
import o.r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM;
import o.r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU;
import o.r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI;
import o.r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0;
import o.r8lambdaVny7Iop5thIfAArp93JFD1zIPGQ;
import o.r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4;
import o.readandroid_sdk_base_release;
import o.removeGeofencesRegisteredWithGeofencingClientlambda2;
import o.subscribeToBannersDismissedEvent;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "ActivityLifecycle", componentName = "ActivityLifecycleCallback", guardType = Guard$Type.REFERENCE_COUNTED)
public class a implements removeGeofencesRegisteredWithGeofencingClientlambda2, Application.ActivityLifecycleCallbacks {
    private final c IconCompatParcelizer;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI MediaBrowserCompatMediaItem;
    private final onLocationRequestCompletelambda1 MediaDescriptionCompat;
    private final readandroid_sdk_base_release MediaMetadataCompat;
    private final getCooldownEnterSeconds MediaSessionCompatQueueItem;
    private final BannersDataStoreProviderCompanionExternalSyntheticLambda2 MediaSessionCompatResultReceiverWrapper;
    private LocationPermissionLevel MediaSessionCompatToken;
    private final ServiceManager ParcelableVolumeInfo;
    private final component4android_sdk_base_release PlaybackStateCompat;
    private final PowerManager PlaybackStateCompatCustomAction;
    private final getVerticalAccuracy RatingCompat;
    private final getAnalyticsEnabledEnterannotations RemoteActionCompatParcelizer;
    private boolean ResultReceiver;
    private boolean r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    private boolean r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    private final Context read;
    private final r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 serializer;
    private final parseLonglambda0 write;

    private void IconCompatParcelizer() {
        r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer;
        addSerializedContentCardToStorage addserializedcontentcardtostorage;
        synchronized (this) {
            boolean zSerializer = this.MediaDescriptionCompat.serializer();
            Optional<getCooldownEnterSeconds.read> optionalIconCompatParcelizer = this.MediaSessionCompatQueueItem.IconCompatParcelizer(addSerializedContentCardToStorage.class, (Long) null);
            if (!optionalIconCompatParcelizer.IconCompatParcelizer() || (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = optionalIconCompatParcelizer.write().RemoteActionCompatParcelizer(this.PlaybackStateCompat)) == null || (addserializedcontentcardtostorage = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer.MediaSessionCompatResultReceiverWrapper) == null || zSerializer != addserializedcontentcardtostorage.write.booleanValue()) {
                getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.RemoteActionCompatParcelizer;
                getVerticalAccuracy getverticalaccuracy = this.RatingCompat;
                this.MediaBrowserCompatMediaItem.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                getverticalaccuracy.getClass();
                applyPendingRuntimeConfiguration applypendingruntimeconfiguration = new applyPendingRuntimeConfiguration();
                applypendingruntimeconfiguration.read = Boolean.valueOf(zSerializer);
                addSerializedContentCardToStorage addserializedcontentcardtostorage2 = new addSerializedContentCardToStorage(applypendingruntimeconfiguration);
                r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = getVerticalAccuracy.read(jCurrentTimeMillis);
                r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
                r8lambdaromdixahini0blcevvl7ehebhj0.MediaSessionCompatToken = addserializedcontentcardtostorage2;
                r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
                getanalyticsenabledenterannotations.serializer(r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        synchronized (this) {
            Context context = this.read;
            if (context instanceof Application) {
                ((Application) context).unregisterActivityLifecycleCallbacks(this);
            }
        }
        this.IconCompatParcelizer.read();
    }

    private void RemoteActionCompatParcelizer(long j) {
        if (this.PlaybackStateCompatCustomAction.isInteractive()) {
            this.MediaBrowserCompatMediaItem.getClass();
            this.MediaMetadataCompat.serializer(new migrateBannerImpressionMapToJson(this, j, System.currentTimeMillis()), 10L);
        } else if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = false;
            IconCompatParcelizer(j);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0035  */
    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX WARN: Code duplicated, block: B:18:? A[RETURN, SYNTHETIC] */
    public static void read(a aVar, long j) {
        boolean z;
        onLocationRequestCompletelambda1 onlocationrequestcompletelambda1 = aVar.MediaDescriptionCompat;
        boolean z2 = aVar.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        onlocationrequestcompletelambda1.getClass();
        if (z2 != onlocationrequestcompletelambda1.write(Permission.FINE_LOCATION)) {
            aVar.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = !aVar.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            z = true;
        } else {
            z = false;
        }
        LocationPermissionLevel locationPermissionLevelWrite = onlocationrequestcompletelambda1.write();
        if (aVar.MediaSessionCompatToken == locationPermissionLevelWrite) {
            if (z) {
            }
            if (aVar.ResultReceiver != onlocationrequestcompletelambda1.serializer()) {
                aVar.ResultReceiver = !aVar.ResultReceiver;
                aVar.IconCompatParcelizer();
            }
            if (!aVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
                aVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = true;
                aVar.MediaMetadataCompat.RemoteActionCompatParcelizer(new e$$ExternalSyntheticLambda0(4, aVar));
                aVar.IconCompatParcelizer(j);
            }
        }
        aVar.MediaSessionCompatToken = locationPermissionLevelWrite;
        aVar.RemoteActionCompatParcelizer.IconCompatParcelizer(ControlMessage.OTG_CHECK, (Object) null);
        if (aVar.ResultReceiver != onlocationrequestcompletelambda1.serializer()) {
            aVar.ResultReceiver = !aVar.ResultReceiver;
            aVar.IconCompatParcelizer();
        }
        if (!aVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
            aVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = true;
            aVar.MediaMetadataCompat.RemoteActionCompatParcelizer(new e$$ExternalSyntheticLambda0(4, aVar));
            aVar.IconCompatParcelizer(j);
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        HashMap map = new HashMap();
        getCooldownEnterSeconds getcooldownenterseconds = this.MediaSessionCompatQueueItem;
        Optional<getCooldownEnterSeconds.read> optionalIconCompatParcelizer = getcooldownenterseconds.IconCompatParcelizer(addSerializedContentCardToStorage.class, (Long) null);
        if (optionalIconCompatParcelizer.IconCompatParcelizer()) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(optionalIconCompatParcelizer.write(), map, addSerializedContentCardToStorage.class);
        }
        Optional<getCooldownEnterSeconds.read> optionalIconCompatParcelizer2 = getcooldownenterseconds.IconCompatParcelizer(subscribeToBannersDismissedEvent.class, (Long) null);
        if (optionalIconCompatParcelizer2.IconCompatParcelizer()) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(optionalIconCompatParcelizer2.write(), map, subscribeToBannersDismissedEvent.class);
        }
        return map;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.MediaBrowserCompatMediaItem.getClass();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        this.IconCompatParcelizer.IconCompatParcelizer().read(jCurrentTimeMillis, "last_activity_pause_time");
        boolean zIsInteractive = this.PlaybackStateCompatCustomAction.isInteractive();
        if (!zIsInteractive) {
            this.serializer.read();
        }
        final boolean z = !zIsInteractive;
        this.MediaMetadataCompat.RemoteActionCompatParcelizer(new Runnable() { // from class: o.migrateBannerStorageToJsonlambda10
            @Override // java.lang.Runnable
            public final void run() {
                com.sentiance.sdk.status.a.serializer(this.write, jCurrentTimeMillis, z);
            }
        }, "ActivityLifecycleCallback");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.MediaBrowserCompatMediaItem.getClass();
        this.MediaMetadataCompat.RemoteActionCompatParcelizer(new migrateBannerStorageToJsonlambda20(this, System.currentTimeMillis()), "ActivityLifecycleCallback");
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(addBannerViewMonitor.class, new migrateBannerStorageToJsonlambda11(this, this.MediaMetadataCompat));
    }

    public a(Context context, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, getCooldownEnterSeconds getcooldownenterseconds, c cVar, onLocationRequestCompletelambda1 onlocationrequestcompletelambda1, getVerticalAccuracy getverticalaccuracy, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, component4android_sdk_base_release component4android_sdk_base_releaseVar, r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4, PowerManager powerManager, BannersDataStoreProviderCompanionExternalSyntheticLambda2 bannersDataStoreProviderCompanionExternalSyntheticLambda2, ServiceManager serviceManager, parseLonglambda0 parselonglambda0, ActivityManager activityManager) {
        this.IconCompatParcelizer = cVar;
        this.serializer = r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4;
        this.write = parselonglambda0;
        this.read = context;
        this.RemoteActionCompatParcelizer = getanalyticsenabledenterannotations;
        this.MediaMetadataCompat = readandroid_sdk_base_releaseVar;
        this.MediaSessionCompatQueueItem = getcooldownenterseconds;
        this.MediaDescriptionCompat = onlocationrequestcompletelambda1;
        this.RatingCompat = getverticalaccuracy;
        this.MediaBrowserCompatMediaItem = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.PlaybackStateCompat = component4android_sdk_base_releaseVar;
        this.PlaybackStateCompatCustomAction = powerManager;
        this.ParcelableVolumeInfo = serviceManager;
        this.MediaSessionCompatResultReceiverWrapper = bannersDataStoreProviderCompanionExternalSyntheticLambda2;
        long jIconCompatParcelizer = cVar.IconCompatParcelizer("last_activity_pause_time", -1L);
        if (jIconCompatParcelizer == -1) {
            return;
        }
        getCooldownEnterSeconds.read readVarRemoteActionCompatParcelizer = getcooldownenterseconds.IconCompatParcelizer(subscribeToBannersDismissedEvent.class, (Long) null).RemoteActionCompatParcelizer();
        if (readVarRemoteActionCompatParcelizer == null || readVarRemoteActionCompatParcelizer.serializer() != jIconCompatParcelizer) {
            getverticalaccuracy.getClass();
            subscribeToBannersDismissedEvent subscribetobannersdismissedevent = new subscribeToBannersDismissedEvent();
            r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = getVerticalAccuracy.read(jIconCompatParcelizer);
            r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
            r8lambdaromdixahini0blcevvl7ehebhj0.addContentView = subscribetobannersdismissedevent;
            r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
            getcooldownenterseconds.IconCompatParcelizer(r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IconCompatParcelizer(long j) {
        boolean z = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        getVerticalAccuracy getverticalaccuracy = this.RatingCompat;
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.RemoteActionCompatParcelizer;
        if (z) {
            r8lambdaVny7Iop5thIfAArp93JFD1zIPGQ r8lambdavny7iop5thifaarp93jfd1zipgq = new r8lambdaVny7Iop5thIfAArp93JFD1zIPGQ();
            getverticalaccuracy.getClass();
            r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = getVerticalAccuracy.read(j);
            r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
            r8lambdaromdixahini0blcevvl7ehebhj0.menuHostHelperlambda0 = r8lambdavny7iop5thifaarp93jfd1zipgq;
            r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
            getanalyticsenabledenterannotations.serializer(r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm, (Object) null, false, (Scopes$$ExternalSyntheticLambda0) null);
            return;
        }
        getverticalaccuracy.getClass();
        subscribeToBannersDismissedEvent subscribetobannersdismissedevent = new subscribeToBannersDismissedEvent();
        r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm2 = getVerticalAccuracy.read(j);
        r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj1 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
        r8lambdaromdixahini0blcevvl7ehebhj1.addContentView = subscribetobannersdismissedevent;
        r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm2.write = r8lambdaromdixahini0blcevvl7ehebhj1.IconCompatParcelizer();
        getanalyticsenabledenterannotations.serializer(r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm2, (Object) null, false, (Scopes$$ExternalSyntheticLambda0) null);
    }

    public static /* synthetic */ void read(a aVar) {
        aVar.write.IconCompatParcelizer("ForegroundServiceStartPermittingEvent: ActivityLifecycleCallback", new Object[0]);
        aVar.ParcelableVolumeInfo.write();
    }

    public static void serializer(a aVar, long j, boolean z) {
        aVar.RemoteActionCompatParcelizer(j);
        if (z) {
            aVar.serializer.IconCompatParcelizer();
        }
    }

    public static void RemoteActionCompatParcelizer(a aVar) {
        aVar.MediaSessionCompatToken = aVar.MediaDescriptionCompat.write();
        onLocationRequestCompletelambda1 onlocationrequestcompletelambda1 = aVar.MediaDescriptionCompat;
        onlocationrequestcompletelambda1.getClass();
        aVar.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = onlocationrequestcompletelambda1.write(Permission.FINE_LOCATION);
        aVar.ResultReceiver = aVar.MediaDescriptionCompat.serializer();
        aVar.IconCompatParcelizer();
        synchronized (aVar) {
            Context context = aVar.read;
            if (context instanceof Application) {
                ((Application) context).registerActivityLifecycleCallbacks(aVar);
            }
        }
        aVar.MediaBrowserCompatMediaItem.getClass();
        aVar.RemoteActionCompatParcelizer(System.currentTimeMillis());
    }

    public static boolean read(a aVar, boolean z) {
        if (aVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY == z) {
            return false;
        }
        aVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = z;
        return true;
    }
}
