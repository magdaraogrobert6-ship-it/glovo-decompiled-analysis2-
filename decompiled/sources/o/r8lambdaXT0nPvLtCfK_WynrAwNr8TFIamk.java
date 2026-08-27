package o;

import android.content.IntentFilter;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.util.Optional;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "LocationProviderChangeManager")
public class r8lambdaXT0nPvLtCfK_WynrAwNr8TFIamk implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final getCooldownEnterSeconds IconCompatParcelizer;
    private final readandroid_sdk_base_release MediaBrowserCompatMediaItem;
    private setUseWebView MediaDescriptionCompat;
    private final ServerConfigDataStoreProviderCompanion MediaMetadataCompat;
    private r8lambdalEIfbdvOx5AiS6eOxkCHNl8OjhA MediaSessionCompatQueueItem;
    private final getVerticalAccuracy RatingCompat;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI RemoteActionCompatParcelizer;
    private final component4android_sdk_base_release read;
    private final isGeofencesEnabledFromEnvironmentlambda1 serializer;
    private final getAnalyticsEnabledEnterannotations write;

    /* JADX INFO: Access modifiers changed from: private */
    public void read() {
        synchronized (this) {
            r8lambdalEIfbdvOx5AiS6eOxkCHNl8OjhA r8lambdaleifbdvox5ais6eoxkchnl8ojhaWrite = write();
            if (r8lambdaleifbdvox5ais6eoxkchnl8ojhaWrite.equals(this.MediaSessionCompatQueueItem)) {
                return;
            }
            this.MediaSessionCompatQueueItem = r8lambdaleifbdvox5ais6eoxkchnl8ojhaWrite;
            serializer(r8lambdaleifbdvox5ais6eoxkchnl8ojhaWrite);
        }
    }

    public static void serializer(r8lambdaXT0nPvLtCfK_WynrAwNr8TFIamk r8lambdaxt0npvltcfk_wynrawnr8tfiamk) {
        r8lambdalEIfbdvOx5AiS6eOxkCHNl8OjhA r8lambdaleifbdvox5ais6eoxkchnl8ojha;
        r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer;
        getCooldownEnterSeconds getcooldownenterseconds = r8lambdaxt0npvltcfk_wynrawnr8tfiamk.IconCompatParcelizer;
        r8lambdaxt0npvltcfk_wynrawnr8tfiamk.RemoteActionCompatParcelizer.getClass();
        Optional<getCooldownEnterSeconds.read> optionalIconCompatParcelizer = getcooldownenterseconds.IconCompatParcelizer(r8lambdalEIfbdvOx5AiS6eOxkCHNl8OjhA.class, Long.valueOf(System.currentTimeMillis()));
        if (!optionalIconCompatParcelizer.IconCompatParcelizer() || (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = optionalIconCompatParcelizer.write().RemoteActionCompatParcelizer(r8lambdaxt0npvltcfk_wynrawnr8tfiamk.read)) == null || (r8lambdaleifbdvox5ais6eoxkchnl8ojha = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer.RatingCompat) == null) {
            r8lambdaleifbdvox5ais6eoxkchnl8ojha = null;
        }
        r8lambdaxt0npvltcfk_wynrawnr8tfiamk.MediaSessionCompatQueueItem = r8lambdaleifbdvox5ais6eoxkchnl8ojha;
        if (r8lambdaleifbdvox5ais6eoxkchnl8ojha != null) {
            r8lambdaxt0npvltcfk_wynrawnr8tfiamk.read();
            return;
        }
        r8lambdalEIfbdvOx5AiS6eOxkCHNl8OjhA r8lambdaleifbdvox5ais6eoxkchnl8ojhaWrite = r8lambdaxt0npvltcfk_wynrawnr8tfiamk.write();
        r8lambdaxt0npvltcfk_wynrawnr8tfiamk.MediaSessionCompatQueueItem = r8lambdaleifbdvox5ais6eoxkchnl8ojhaWrite;
        r8lambdaxt0npvltcfk_wynrawnr8tfiamk.serializer(r8lambdaleifbdvox5ais6eoxkchnl8ojhaWrite);
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        HashMap map = new HashMap();
        Optional<getCooldownEnterSeconds.read> optionalIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer(r8lambdalEIfbdvOx5AiS6eOxkCHNl8OjhA.class, (Long) null);
        if (optionalIconCompatParcelizer.IconCompatParcelizer()) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(optionalIconCompatParcelizer.write(), map, r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class);
        }
        return map;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        readandroid_sdk_base_release readandroid_sdk_base_releaseVar = this.MediaBrowserCompatMediaItem;
        r8lambdaJps2o3mnQeyeiBhveWu__6haOEY r8lambdajps2o3mnqeyeibhvewu__6haoey = new r8lambdaJps2o3mnQeyeiBhveWu__6haOEY(this, readandroid_sdk_base_releaseVar);
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.write;
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(addBannerViewMonitor.class, r8lambdajps2o3mnqeyeibhvewu__6haoey);
        getanalyticsenabledenterannotations.read(ControlMessage.LOCATION_MODE_CHANGED, new C0202setUseWebview(this, readandroid_sdk_base_releaseVar));
        setUseWebView setusewebview = new setUseWebView();
        this.MediaDescriptionCompat = setusewebview;
        this.MediaMetadataCompat.RemoteActionCompatParcelizer(setusewebview, new IntentFilter("android.location.PROVIDERS_CHANGED"));
    }

    public final r8lambdalEIfbdvOx5AiS6eOxkCHNl8OjhA write() {
        byte b;
        r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM r8lambdaxdc9yg9rrx23qvlbekkfzieitwm = new r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM();
        isGeofencesEnabledFromEnvironmentlambda1 isgeofencesenabledfromenvironmentlambda1 = this.serializer;
        boolean zIconCompatParcelizer = isgeofencesenabledfromenvironmentlambda1.IconCompatParcelizer().IconCompatParcelizer();
        boolean zWrite = isgeofencesenabledfromenvironmentlambda1.IconCompatParcelizer().write();
        this.RatingCompat.getClass();
        if (zIconCompatParcelizer && zWrite) {
            b = (byte) 1;
        } else if (zIconCompatParcelizer) {
            b = (byte) 2;
        } else {
            b = zWrite ? (byte) 3 : (byte) 4;
        }
        r8lambdaxdc9yg9rrx23qvlbekkfzieitwm.serializer = b;
        return new r8lambdalEIfbdvOx5AiS6eOxkCHNl8OjhA(r8lambdaxdc9yg9rrx23qvlbekkfzieitwm);
    }

    public r8lambdaXT0nPvLtCfK_WynrAwNr8TFIamk(getCooldownEnterSeconds getcooldownenterseconds, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, component4android_sdk_base_release component4android_sdk_base_releaseVar, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, getVerticalAccuracy getverticalaccuracy, isGeofencesEnabledFromEnvironmentlambda1 isgeofencesenabledfromenvironmentlambda1, ServerConfigDataStoreProviderCompanion serverConfigDataStoreProviderCompanion, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        this.IconCompatParcelizer = getcooldownenterseconds;
        this.RemoteActionCompatParcelizer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.read = component4android_sdk_base_releaseVar;
        this.write = getanalyticsenabledenterannotations;
        this.RatingCompat = getverticalaccuracy;
        this.serializer = isgeofencesenabledfromenvironmentlambda1;
        this.MediaMetadataCompat = serverConfigDataStoreProviderCompanion;
        this.MediaBrowserCompatMediaItem = readandroid_sdk_base_releaseVar;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        setUseWebView setusewebview = this.MediaDescriptionCompat;
        if (setusewebview != null) {
            this.MediaMetadataCompat.serializer(setusewebview);
            this.MediaDescriptionCompat = null;
        }
    }

    private void serializer(r8lambdalEIfbdvOx5AiS6eOxkCHNl8OjhA r8lambdaleifbdvox5ais6eoxkchnl8ojha) {
        this.RemoteActionCompatParcelizer.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.RatingCompat.getClass();
        r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = getVerticalAccuracy.read(jCurrentTimeMillis);
        r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
        r8lambdaromdixahini0blcevvl7ehebhj0.MediaMetadataCompat = r8lambdaleifbdvox5ais6eoxkchnl8ojha;
        r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
        this.write.serializer(r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm);
    }
}
