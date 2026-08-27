package o;

import android.app.PendingIntent;
import android.content.Intent;
import android.location.Location;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class setActionButtons implements setCampaignId {
    final /* synthetic */ getUseWebView RemoteActionCompatParcelizer;

    @Override // o.setCampaignId
    public final Integer write(Location location, boolean z) {
        getUseWebView getusewebview = this.RemoteActionCompatParcelizer;
        if (z) {
            getusewebview.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.IconCompatParcelizer("Expanding geofence", new Object[0]);
        }
        int iIconCompatParcelizer = getusewebview.IconCompatParcelizer(location, z);
        int iMax = (int) Math.max(1000.0f, iIconCompatParcelizer * 2.0f);
        ParcelableVolumeInfo();
        setConfigurationProvider setconfigurationprovider = getusewebview.read.read(location, iIconCompatParcelizer, 180);
        setConfigurationProvider setconfigurationprovider2 = getusewebview.read.read(location, iMax, 120);
        getusewebview.MediaMetadataCompat.read("geofence", setconfigurationprovider);
        getusewebview.MediaMetadataCompat.read("backup_geofence", setconfigurationprovider2);
        getusewebview.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        getShouldFetchTestTriggers getshouldfetchtesttriggers = getusewebview.read;
        List<setConfigurationProvider> listAsList = Arrays.asList(setconfigurationprovider, setconfigurationprovider2);
        Intent intent = new Intent(getusewebview.ParcelableVolumeInfo, (Class<?>) getPushDuration.class);
        intent.setAction(getusewebview.IconCompatParcelizer.read());
        if (!getshouldfetchtesttriggers.serializer(listAsList, PendingIntent.getBroadcast(getusewebview.ParcelableVolumeInfo, 0, intent, r8lambdaFCWpTejCW5kVaf7ggoc6ZelEIk.IconCompatParcelizer(134217728)))) {
            getusewebview.MediaMetadataCompat.write("geofence");
            getusewebview.MediaMetadataCompat.write("backup_geofence");
            return null;
        }
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = getusewebview.ResultReceiver;
        getVerticalAccuracy getverticalaccuracy = getusewebview.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        Optional optionalRemoteActionCompatParcelizer = Optional.RemoteActionCompatParcelizer(Integer.valueOf(setconfigurationprovider.serializer));
        getverticalaccuracy.getClass();
        getanalyticsenabledenterannotations.serializer(getVerticalAccuracy.write(setconfigurationprovider, optionalRemoteActionCompatParcelizer, location, 4, jCurrentTimeMillis));
        return Integer.valueOf(setconfigurationprovider.serializer);
    }

    @Override // o.setCampaignId
    public final isGeofencesEnabledFromEnvironmentlambda1 IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
    }

    @Override // o.setCampaignId
    public final void MediaDescriptionCompat() {
        getUseWebView getusewebview = this.RemoteActionCompatParcelizer;
        Optional<setConfigurationProvider> optionalSerializer = getusewebview.MediaMetadataCompat.serializer("backup_geofence");
        if (optionalSerializer.IconCompatParcelizer()) {
            getusewebview.read.RemoteActionCompatParcelizer(Collections.singletonList(optionalSerializer.write().write));
            getusewebview.MediaMetadataCompat.write("backup_geofence");
        }
    }

    @Override // o.setCampaignId
    public final parseLonglambda0 MediaMetadataCompat() {
        return this.RemoteActionCompatParcelizer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    }

    @Override // o.setCampaignId
    public final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI MediaSessionCompatQueueItem() {
        return this.RemoteActionCompatParcelizer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    }

    @Override // o.setCampaignId
    public final Optional<setConfigurationProvider> MediaSessionCompatResultReceiverWrapper() {
        return this.RemoteActionCompatParcelizer.MediaMetadataCompat.serializer("geofence");
    }

    @Override // o.setCampaignId
    public final setContext MediaSessionCompatToken() {
        return getUseWebView.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(this.RemoteActionCompatParcelizer);
    }

    @Override // o.setCampaignId
    public final boolean ParcelableVolumeInfo() {
        getUseWebView getusewebview = this.RemoteActionCompatParcelizer;
        Optional<setConfigurationProvider> optionalSerializer = getusewebview.MediaMetadataCompat.serializer("geofence");
        Optional<setConfigurationProvider> optionalSerializer2 = getusewebview.MediaMetadataCompat.serializer("backup_geofence");
        if (!optionalSerializer.IconCompatParcelizer()) {
            return true;
        }
        getusewebview.MediaMetadataCompat.write("geofence");
        getusewebview.MediaMetadataCompat.write("backup_geofence");
        getusewebview.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        arrayList.add(optionalSerializer.write().write);
        if (optionalSerializer2.IconCompatParcelizer()) {
            arrayList.add(optionalSerializer2.write().write);
        }
        if (getusewebview.read.RemoteActionCompatParcelizer(arrayList).contains(Boolean.FALSE)) {
            getusewebview.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.RemoteActionCompatParcelizer("Failed to remove geofences", new Object[0]);
            return false;
        }
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = getusewebview.ResultReceiver;
        getVerticalAccuracy getverticalaccuracy = getusewebview.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        setConfigurationProvider setconfigurationproviderWrite = optionalSerializer.write();
        Optional optionalRemoteActionCompatParcelizer = Optional.RemoteActionCompatParcelizer(Integer.valueOf(optionalSerializer.write().serializer));
        getverticalaccuracy.getClass();
        getanalyticsenabledenterannotations.serializer(getVerticalAccuracy.write(setconfigurationproviderWrite, optionalRemoteActionCompatParcelizer, null, 5, jCurrentTimeMillis));
        return true;
    }

    @Override // o.setCampaignId
    public final void PlaybackStateCompat() {
        getUseWebView getusewebview = this.RemoteActionCompatParcelizer;
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = getusewebview.ResultReceiver;
        getVerticalAccuracy getverticalaccuracy = getusewebview.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        Optional optionalMediaSessionCompatQueueItem = Optional.MediaSessionCompatQueueItem();
        getusewebview.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        getverticalaccuracy.getClass();
        getanalyticsenabledenterannotations.serializer(getVerticalAccuracy.write(null, optionalMediaSessionCompatQueueItem, null, 7, jCurrentTimeMillis));
    }

    @Override // o.setCampaignId
    public final component4android_sdk_base_release PlaybackStateCompatCustomAction() {
        return this.RemoteActionCompatParcelizer.ComponentActivity;
    }

    @Override // o.setCampaignId
    public final getAnalyticsEnabledEnterannotations RatingCompat() {
        return this.RemoteActionCompatParcelizer.ResultReceiver;
    }

    @Override // o.setCampaignId
    public final getVerticalAccuracy serializer() {
        return this.RemoteActionCompatParcelizer.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    }

    @Override // o.setCampaignId
    public final ConfigurationManager write() {
        return this.RemoteActionCompatParcelizer.write;
    }

    @Override // o.setCampaignId
    public final boolean write(Location location) {
        return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(location);
    }

    public setActionButtons(getUseWebView getusewebview) {
        this.RemoteActionCompatParcelizer = getusewebview;
    }

    @Override // o.setCampaignId
    public final void MediaBrowserCompatMediaItem() {
        Optional<setConfigurationProvider> optionalMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper();
        Integer numValueOf = optionalMediaSessionCompatResultReceiverWrapper.read() ? null : Integer.valueOf(optionalMediaSessionCompatResultReceiverWrapper.write().serializer);
        getUseWebView getusewebview = this.RemoteActionCompatParcelizer;
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = getusewebview.ResultReceiver;
        getVerticalAccuracy getverticalaccuracy = getusewebview.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        setConfigurationProvider setconfigurationproviderRemoteActionCompatParcelizer = optionalMediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer();
        Optional optionalWrite = Optional.write(numValueOf);
        getusewebview.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        getverticalaccuracy.getClass();
        getanalyticsenabledenterannotations.serializer(getVerticalAccuracy.write(setconfigurationproviderRemoteActionCompatParcelizer, optionalWrite, null, 7, jCurrentTimeMillis));
    }

    @Override // o.setCampaignId
    public final getCooldownEnterSeconds read() {
        return this.RemoteActionCompatParcelizer.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    }

    @Override // o.setCampaignId
    public final boolean read(Location location) {
        return this.RemoteActionCompatParcelizer.write(location);
    }

    @Override // o.setCampaignId
    public final void write(setConversationShortcutId setconversationshortcutid) {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(setconversationshortcutid);
    }

    @Override // o.setCampaignId
    public final readandroid_sdk_base_release RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    }

    @Override // o.setCampaignId
    public final void serializer(Location location) {
        Optional<setConfigurationProvider> optionalMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper();
        if (optionalMediaSessionCompatResultReceiverWrapper.read()) {
            return;
        }
        getUseWebView getusewebview = this.RemoteActionCompatParcelizer;
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = getusewebview.ResultReceiver;
        getVerticalAccuracy getverticalaccuracy = getusewebview.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        setConfigurationProvider setconfigurationproviderWrite = optionalMediaSessionCompatResultReceiverWrapper.write();
        Optional optionalWrite = Optional.write(Integer.valueOf(optionalMediaSessionCompatResultReceiverWrapper.write().serializer));
        getusewebview.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        getverticalaccuracy.getClass();
        getanalyticsenabledenterannotations.serializer(getVerticalAccuracy.write(setconfigurationproviderWrite, optionalWrite, location, 10, jCurrentTimeMillis));
    }
}
