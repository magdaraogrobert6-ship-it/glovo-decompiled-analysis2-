package o;

import android.location.Location;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.processguard.Guard$Type;
import com.sentiance.sdk.tile.j$$ExternalSyntheticLambda1;
import com.sentiance.sdk.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "VenueProvider", guardType = Guard$Type.REFERENCE_COUNTED)
public class r8lambdalmSvIZk2OaypKCEb55V0vnTE72k extends DataStoreProviderba implements removeGeofencesRegisteredWithGeofencingClientlambda2, DataStoreProviderCompanion, r8lambdaXoyqh04SsG9obd1HHrbYn1pJ7U {
    private final getVerticalAccuracy IconCompatParcelizer;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI MediaBrowserCompatMediaItem;
    private final deleteFileWithRetry MediaDescriptionCompat;
    private final readandroid_sdk_base_release MediaMetadataCompat;
    private final DataStoreProviderm MediaSessionCompatQueueItem;
    private boolean MediaSessionCompatToken;
    private long ParcelableVolumeInfo;
    private String PlaybackStateCompatCustomAction;
    private final DustDataStoreProviderCompanion RatingCompat;
    private final getAnalyticsEnabledEnterannotations RemoteActionCompatParcelizer;
    private final getCooldownEnterSeconds read;
    private final r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 serializer;
    private final parseLonglambda0 write;
    private final LinkedHashMap MediaSessionCompatResultReceiverWrapper = new LinkedHashMap();
    private int PlaybackStateCompat = 1;

    /* JADX INFO: Access modifiers changed from: private */
    public void IconCompatParcelizer() {
        synchronized (this) {
            if (!this.MediaSessionCompatToken && !this.MediaSessionCompatResultReceiverWrapper.isEmpty()) {
                this.MediaSessionCompatToken = true;
                int i = 0;
                String str = (String) this.MediaSessionCompatResultReceiverWrapper.keySet().toArray()[0];
                String strSerializer = shutdownAllDataStoresdefault.serializer(str, DataStoreProviderm.write);
                this.serializer.read();
                boolean z = this.MediaSessionCompatQueueItem.read(strSerializer);
                parseLonglambda0 parselonglambda0 = this.write;
                if (z) {
                    parselonglambda0.IconCompatParcelizer("Request to load tile %s (parent: %s)", str, strSerializer);
                    this.MediaMetadataCompat.RemoteActionCompatParcelizer(new j$$ExternalSyntheticLambda1(this, str, strSerializer, i));
                } else {
                    parselonglambda0.IconCompatParcelizer("Request to download tile %s (parent: %s)", str, strSerializer);
                    this.MediaDescriptionCompat.serializer(new r8lambdaUdD4Yj05V3iuQbJEwTce3Mt1rIw.serializer(strSerializer, str, this, this.MediaMetadataCompat));
                }
            }
        }
    }

    @Override // o.r8lambdaXoyqh04SsG9obd1HHrbYn1pJ7U
    public final void RemoteActionCompatParcelizer(String str) {
        read(str, true);
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(ControlMessage.TILE_PROVIDER_NEW_TILE_LOADED, str);
        this.serializer.IconCompatParcelizer();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        this.PlaybackStateCompatCustomAction = null;
        this.PlaybackStateCompat = 1;
        this.MediaDescriptionCompat.RemoteActionCompatParcelizer();
        synchronized (this) {
            this.MediaSessionCompatResultReceiverWrapper.clear();
            this.MediaSessionCompatToken = false;
        }
    }

    public static void IconCompatParcelizer(r8lambdalmSvIZk2OaypKCEb55V0vnTE72k r8lambdalmsvizk2oaypkceb55v0vnte72k, Location location, int i, r8lambdad6Kv_zcyXwF_MBclQy2CZKzTblI r8lambdad6kv_zcyxwf_mbclqy2czkztbli) {
        String strRemoteActionCompatParcelizer = shutdownAllDataStoresdefault.RemoteActionCompatParcelizer(shutdownAllDataStoresdefault.IconCompatParcelizer(location, 14));
        DataStoreProvidercExternalSyntheticLambda0 dataStoreProvidercExternalSyntheticLambda0 = new DataStoreProvidercExternalSyntheticLambda0(r8lambdalmsvizk2oaypkceb55v0vnte72k, location, i, r8lambdad6kv_zcyxwf_mbclqy2czkztbli);
        if (r8lambdalmsvizk2oaypkceb55v0vnte72k.RatingCompat.serializer(strRemoteActionCompatParcelizer)) {
            dataStoreProvidercExternalSyntheticLambda0.RemoteActionCompatParcelizer();
        } else {
            r8lambdalmsvizk2oaypkceb55v0vnte72k.serializer(strRemoteActionCompatParcelizer, dataStoreProvidercExternalSyntheticLambda0);
            r8lambdalmsvizk2oaypkceb55v0vnte72k.IconCompatParcelizer();
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        HashMap map = new HashMap();
        Optional<getCooldownEnterSeconds.read> optionalIconCompatParcelizer = this.read.IconCompatParcelizer(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, (Long) null);
        if (optionalIconCompatParcelizer.IconCompatParcelizer()) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(optionalIconCompatParcelizer.write(), map, r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class);
        }
        return map;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, new DataStoreProviderda(this, this.MediaMetadataCompat));
    }

    public r8lambdalmSvIZk2OaypKCEb55V0vnTE72k(r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4, parseLonglambda0 parselonglambda0, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, DustDataStoreProviderCompanion dustDataStoreProviderCompanion, getVerticalAccuracy getverticalaccuracy, getCooldownEnterSeconds getcooldownenterseconds, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, deleteFileWithRetry deletefilewithretry, DataStoreProviderm dataStoreProviderm, ConfigurationManager configurationManager, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni) {
        this.serializer = r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4;
        this.write = parselonglambda0;
        this.RemoteActionCompatParcelizer = getanalyticsenabledenterannotations;
        this.IconCompatParcelizer = getverticalaccuracy;
        this.read = getcooldownenterseconds;
        this.MediaBrowserCompatMediaItem = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.RatingCompat = dustDataStoreProviderCompanion;
        this.MediaMetadataCompat = readandroid_sdk_base_releaseVar;
        this.MediaDescriptionCompat = deletefilewithretry;
        this.MediaSessionCompatQueueItem = dataStoreProviderm;
    }

    @Override // o.DataStoreProviderba
    public final void read(Location location, r8lambdasOoFVAVrS_IfmvnUsbXqKnKCa0 r8lambdasoofvavrs_ifmvnusbxqknkca0) {
        ArrayList arrayList = new ArrayList(shutdownAllDataStoresdefault.read(location, 14));
        AtomicInteger atomicInteger = new AtomicInteger();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (this.RatingCompat.serializer((String) it.next())) {
                it.remove();
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            r8lambdasoofvavrs_ifmvnusbxqknkca0.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(new r8lambdaAdNMoUKA2dYkpy5uQLS8giqo(r8lambdasoofvavrs_ifmvnusbxqknkca0, 1));
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            serializer((String) it2.next(), new DataStoreProviderbaExternalSyntheticLambda1(atomicInteger, size, atomicBoolean, r8lambdasoofvavrs_ifmvnusbxqknkca0));
        }
        IconCompatParcelizer();
    }

    public static boolean serializer(r8lambdalmSvIZk2OaypKCEb55V0vnTE72k r8lambdalmsvizk2oaypkceb55v0vnte72k, String str) {
        boolean zContainsKey;
        synchronized (r8lambdalmsvizk2oaypkceb55v0vnte72k) {
            zContainsKey = r8lambdalmsvizk2oaypkceb55v0vnte72k.MediaSessionCompatResultReceiverWrapper.containsKey(str);
        }
        return zContainsKey;
    }

    @Override // o.DataStoreProviderCompanion
    public final void serializer(String str, String str2) {
        IconCompatParcelizer(str2);
    }

    @Override // o.DataStoreProviderba
    public final void RemoteActionCompatParcelizer(Location location, int i, r8lambdad6Kv_zcyXwF_MBclQy2CZKzTblI r8lambdad6kv_zcyxwf_mbclqy2czkztbli) {
        this.MediaMetadataCompat.RemoteActionCompatParcelizer(new DataStoreProviderc(i, 0, this, location, r8lambdad6kv_zcyxwf_mbclqy2czkztbli));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serializer(String str, r8lambdaxlGZ37PBa_omfizFrRo1k0nbvE r8lambdaxlgz37pba_omfizfrro1k0nbve) {
        synchronized (this) {
            List arrayList = (List) this.MediaSessionCompatResultReceiverWrapper.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(r8lambdaxlgz37pba_omfizfrro1k0nbve);
            this.MediaSessionCompatResultReceiverWrapper.put(str, arrayList);
        }
    }

    @Override // o.r8lambdaXoyqh04SsG9obd1HHrbYn1pJ7U
    public final void IconCompatParcelizer(String str) {
        read(str, false);
        this.serializer.IconCompatParcelizer();
    }

    private void read(String str, boolean z) {
        ArrayList<r8lambdaxlGZ37PBa_omfizFrRo1k0nbvE> arrayList = new ArrayList();
        synchronized (this) {
            List list = (List) this.MediaSessionCompatResultReceiverWrapper.remove(str);
            if (list != null) {
                arrayList.addAll(list);
            }
            this.MediaSessionCompatToken = false;
        }
        for (r8lambdaxlGZ37PBa_omfizFrRo1k0nbvE r8lambdaxlgz37pba_omfizfrro1k0nbve : arrayList) {
            if (z) {
                r8lambdaxlgz37pba_omfizfrro1k0nbve.RemoteActionCompatParcelizer();
            } else {
                r8lambdaxlgz37pba_omfizfrro1k0nbve.read();
            }
        }
        IconCompatParcelizer();
    }

    @Override // o.DataStoreProviderCompanion
    public final void write(String str, String str2) {
        this.RatingCompat.IconCompatParcelizer(str2, shutdownAllDataStoresdefault.serializer(str2, DataStoreProviderm.write), this);
    }
}
