package o;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.hardware.display.DisplayManager;
import android.view.Display;
import com.sentiance.sdk.InjectUsing;
import java.util.Map;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "ScreenStatusDetector")
public class handlePushNotificationPayloadlambda14 implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    public static final IntentFilter read;
    private final Context IconCompatParcelizer;
    private final ServerConfigDataStoreProviderCompanion MediaBrowserCompatMediaItem;
    private final KeyguardManager MediaDescriptionCompat;
    private final getAnalyticsEnabledEnterannotations MediaMetadataCompat;
    private final readandroid_sdk_base_release MediaSessionCompatQueueItem;
    private final removeGeofencesRegisteredWithGeofencingClientlambda22 RatingCompat = new handlePushNotificationPayloadlambda12(this);
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI RemoteActionCompatParcelizer;
    private final getVerticalAccuracy serializer;
    private final parseLonglambda0 write;

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return null;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        synchronized (this) {
            this.write.IconCompatParcelizer("Stopping ScreenStatusDetector", new Object[0]);
            this.MediaBrowserCompatMediaItem.serializer(this.RatingCompat);
        }
    }

    public final void write() {
        synchronized (this) {
            this.write.IconCompatParcelizer("Starting ScreenStatusDetector", new Object[0]);
            this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(this.RatingCompat, read);
            boolean z = false;
            for (Display display : ((DisplayManager) this.IconCompatParcelizer.getSystemService("display")).getDisplays()) {
                if (display.getState() == 2 || display.getState() == 0) {
                    z = true;
                }
            }
            if (z) {
                read();
            } else {
                serializer();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read() {
        this.RemoteActionCompatParcelizer.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zIsKeyguardLocked = this.MediaDescriptionCompat.isKeyguardLocked();
        this.serializer.getClass();
        FormBody.Builder builder = new FormBody.Builder();
        builder.serializer = (byte) 1;
        builder.RemoteActionCompatParcelizer = Boolean.valueOf(zIsKeyguardLocked);
        retryInAppMessage retryinappmessage = builder.read();
        r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = getVerticalAccuracy.read(jCurrentTimeMillis);
        r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
        r8lambdaromdixahini0blcevvl7ehebhj0.addOnNewIntentListener = retryinappmessage;
        r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
        this.MediaMetadataCompat.serializer(r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serializer() {
        this.RemoteActionCompatParcelizer.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.serializer.getClass();
        FormBody.Builder builder = new FormBody.Builder();
        builder.serializer = (byte) 2;
        retryInAppMessage retryinappmessage = builder.read();
        r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = getVerticalAccuracy.read(jCurrentTimeMillis);
        r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
        r8lambdaromdixahini0blcevvl7ehebhj0.addOnNewIntentListener = retryinappmessage;
        r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
        this.MediaMetadataCompat.serializer(r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm);
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        this.MediaMetadataCompat.RemoteActionCompatParcelizer(addBannerViewMonitor.class, new handlePushNotificationPayloadlambda3(this, this.MediaSessionCompatQueueItem));
    }

    static {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
        read = intentFilter;
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
    }

    public handlePushNotificationPayloadlambda14(Context context, parseLonglambda0 parselonglambda0, getVerticalAccuracy getverticalaccuracy, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, ServerConfigDataStoreProviderCompanion serverConfigDataStoreProviderCompanion, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, KeyguardManager keyguardManager) {
        this.IconCompatParcelizer = context;
        this.write = parselonglambda0;
        this.serializer = getverticalaccuracy;
        this.MediaMetadataCompat = getanalyticsenabledenterannotations;
        this.RemoteActionCompatParcelizer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.MediaBrowserCompatMediaItem = serverConfigDataStoreProviderCompanion;
        this.MediaSessionCompatQueueItem = readandroid_sdk_base_releaseVar;
        this.MediaDescriptionCompat = keyguardManager;
    }
}
