package o;

import android.content.Intent;
import android.content.IntentFilter;
import android.util.SparseIntArray;
import com.sentiance.sdk.InjectUsing;
import io.sentry.Scopes$$ExternalSyntheticLambda0;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "BatteryMonitor", componentName = "BatteryMonitor")
public class removeGeofencesRegisteredWithGeofencingClientlambda00 implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private static final SparseIntArray IconCompatParcelizer;
    private static final SparseIntArray serializer;
    private final readandroid_sdk_base_release MediaBrowserCompatMediaItem;
    private final getAnalyticsEnabledEnterannotations MediaDescriptionCompat;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI MediaMetadataCompat;
    private final ServerConfigDataStoreProviderCompanion MediaSessionCompatQueueItem;
    private final removeGeofencesRegisteredWithGeofencingClientlambda22 MediaSessionCompatToken = new removeGeofencesRegisteredWithGeofencingClientlambda1(this);
    private final removeGeofencesRegisteredWithGeofencingClientlambda22 ParcelableVolumeInfo = new removeGeofencesFromLocalStorage(this);
    private removeGeofencesRegisteredWithGeofencingClientlambda21 RatingCompat;
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private final com.sentiance.sdk.util.c read;
    private final getVerticalAccuracy write;

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return null;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        serializer = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        IconCompatParcelizer = sparseIntArray2;
        sparseIntArray.append(1, 0);
        sparseIntArray.append(2, 1);
        sparseIntArray.append(3, 2);
        sparseIntArray.append(4, 3);
        sparseIntArray.append(5, 4);
        sparseIntArray2.append(1, 1);
        sparseIntArray2.append(2, 2);
        sparseIntArray2.append(4, 3);
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        removeGeofencesRegisteredWithGeofencingClientlambda22 removegeofencesregisteredwithgeofencingclientlambda22 = this.MediaSessionCompatToken;
        ServerConfigDataStoreProviderCompanion serverConfigDataStoreProviderCompanion = this.MediaSessionCompatQueueItem;
        serverConfigDataStoreProviderCompanion.serializer(removegeofencesregisteredwithgeofencingclientlambda22);
        serverConfigDataStoreProviderCompanion.serializer(this.ParcelableVolumeInfo);
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        this.MediaDescriptionCompat.RemoteActionCompatParcelizer(addBannerViewMonitor.class, new removeGeofencesRegisteredWithGeofencingClientlambda0(this, this.MediaBrowserCompatMediaItem));
    }

    public static Intent serializer(removeGeofencesRegisteredWithGeofencingClientlambda00 removegeofencesregisteredwithgeofencingclientlambda00) {
        return removegeofencesregisteredwithgeofencingclientlambda00.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    public final byte serializer() {
        removeGeofencesRegisteredWithGeofencingClientlambda21 removegeofencesregisteredwithgeofencingclientlambda21 = this.RatingCompat;
        if (removegeofencesregisteredwithgeofencingclientlambda21 != null) {
            return removegeofencesregisteredwithgeofencingclientlambda21.serializer;
        }
        return (byte) 100;
    }

    public removeGeofencesRegisteredWithGeofencingClientlambda00(com.sentiance.sdk.util.c cVar, parseLonglambda0 parselonglambda0, getVerticalAccuracy getverticalaccuracy, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, ServerConfigDataStoreProviderCompanion serverConfigDataStoreProviderCompanion, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        this.read = cVar;
        this.RemoteActionCompatParcelizer = parselonglambda0;
        this.write = getverticalaccuracy;
        this.MediaMetadataCompat = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.MediaDescriptionCompat = getanalyticsenabledenterannotations;
        this.MediaSessionCompatQueueItem = serverConfigDataStoreProviderCompanion;
        this.MediaBrowserCompatMediaItem = readandroid_sdk_base_releaseVar;
        String strWrite = cVar.write("battery-event", (String) null);
        this.RatingCompat = strWrite != null ? new removeGeofencesRegisteredWithGeofencingClientlambda21(this, strWrite) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void RemoteActionCompatParcelizer(Intent intent) {
        if (intent == null) {
            return;
        }
        byte intExtra = (byte) ((intent.getIntExtra("level", -1) / intent.getIntExtra("scale", -1)) * 100.0f);
        int i = serializer.get(intent.getIntExtra("status", -1), -1);
        Byte bValueOf = i >= 0 ? Byte.valueOf((byte) i) : null;
        int i2 = IconCompatParcelizer.get(intent.getIntExtra("plugged", -1), -1);
        Byte bValueOf2 = i2 >= 0 ? Byte.valueOf((byte) i2) : null;
        removeGeofencesRegisteredWithGeofencingClientlambda21 removegeofencesregisteredwithgeofencingclientlambda21 = this.RatingCompat;
        if (removegeofencesregisteredwithgeofencingclientlambda21 == null || removegeofencesregisteredwithgeofencingclientlambda21.serializer != intExtra || ((this.RatingCompat.RemoteActionCompatParcelizer == null && bValueOf != null) || ((bValueOf == null && this.RatingCompat.RemoteActionCompatParcelizer != null) || (!(bValueOf == null || bValueOf.byteValue() == this.RatingCompat.RemoteActionCompatParcelizer.byteValue()) || ((this.RatingCompat.write == null && bValueOf2 != null) || ((bValueOf2 == null && this.RatingCompat.write != null) || !(bValueOf2 == null || bValueOf2.byteValue() == this.RatingCompat.write.byteValue()))))))) {
            this.MediaMetadataCompat.getClass();
            this.MediaDescriptionCompat.serializer(this.write.write(bValueOf, bValueOf2, intExtra, System.currentTimeMillis()), (Object) null, false, (Scopes$$ExternalSyntheticLambda0) null);
            removeGeofencesRegisteredWithGeofencingClientlambda21 removegeofencesregisteredwithgeofencingclientlambda22 = new removeGeofencesRegisteredWithGeofencingClientlambda21(this, intExtra, bValueOf, bValueOf2);
            this.RatingCompat = removegeofencesregisteredwithgeofencingclientlambda22;
            this.read.RemoteActionCompatParcelizer("battery-event", removegeofencesregisteredwithgeofencingclientlambda22.write());
        }
    }

    public static void RemoteActionCompatParcelizer(removeGeofencesRegisteredWithGeofencingClientlambda00 removegeofencesregisteredwithgeofencingclientlambda00) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        ServerConfigDataStoreProviderCompanion serverConfigDataStoreProviderCompanion = removegeofencesregisteredwithgeofencingclientlambda00.MediaSessionCompatQueueItem;
        serverConfigDataStoreProviderCompanion.RemoteActionCompatParcelizer(removegeofencesregisteredwithgeofencingclientlambda00.MediaSessionCompatToken, intentFilter);
        serverConfigDataStoreProviderCompanion.RemoteActionCompatParcelizer(removegeofencesregisteredwithgeofencingclientlambda00.ParcelableVolumeInfo, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        removegeofencesregisteredwithgeofencingclientlambda00.RemoteActionCompatParcelizer(serverConfigDataStoreProviderCompanion.RemoteActionCompatParcelizer(new IntentFilter("android.intent.action.BATTERY_CHANGED")));
    }
}
