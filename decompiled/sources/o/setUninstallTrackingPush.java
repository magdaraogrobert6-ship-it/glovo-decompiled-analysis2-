package o;

import com.huawei.hms.location.LocationRequest;
import com.huawei.location.base.activity.constant.ActivityRecognitionConstants;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.events.ControlMessage;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "KillswitchInterceptor")
public class setUninstallTrackingPush extends migrateMetadataToJsonlambda2 implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final parseLonglambda0 IconCompatParcelizer;
    private final readandroid_sdk_base_release RemoteActionCompatParcelizer;
    private final ConfigurationManager serializer;
    private final getAnalyticsEnabledEnterannotations write;

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return null;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    @Override // o.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled
    public final setShouldPersistWebViewWhenBackgroundingApp serializer(_get_brazeApiKey_lambda1 _get_brazeapikey_lambda1) throws IOException {
        String str;
        setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingappSerializer = _get_brazeapikey_lambda1.serializer(_get_brazeapikey_lambda1.RatingCompat);
        if (IconCompatParcelizer(setshouldpersistwebviewwhenbackgroundingappSerializer.write)) {
            int i = setshouldpersistwebviewwhenbackgroundingappSerializer.serializer;
            if (i == 307 || i == 308) {
                str = setshouldpersistwebviewwhenbackgroundingappSerializer.read(ActivityRecognitionConstants.LOCATION_MODULE, setshouldpersistwebviewwhenbackgroundingappSerializer.read("location", null));
                if (str != null && str.toLowerCase().contains("killswitch")) {
                    this.IconCompatParcelizer.write("Killswitch redirect received", new Object[0]);
                    this.write.IconCompatParcelizer(ControlMessage.CONFIG_UPDATE_REQUEST, (Object) null);
                }
            } else {
                switch (i) {
                    case LocationRequest.PRIORITY_INDOOR /* 300 */:
                    case LocationRequest.PRIORITY_MAG_POSITION /* 301 */:
                    case 302:
                    case 303:
                        str = setshouldpersistwebviewwhenbackgroundingappSerializer.read(ActivityRecognitionConstants.LOCATION_MODULE, setshouldpersistwebviewwhenbackgroundingappSerializer.read("location", null));
                        if (str != null) {
                            this.IconCompatParcelizer.write("Killswitch redirect received", new Object[0]);
                            this.write.IconCompatParcelizer(ControlMessage.CONFIG_UPDATE_REQUEST, (Object) null);
                            break;
                        }
                    default:
                        return setshouldpersistwebviewwhenbackgroundingappSerializer;
                }
            }
        }
        return setshouldpersistwebviewwhenbackgroundingappSerializer;
    }

    public setUninstallTrackingPush(getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, parseLonglambda0 parselonglambda0, ConfigurationManager configurationManager, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, registerGeofencesWithGooglePlayIfNecessarylambda10 registergeofenceswithgoogleplayifnecessarylambda10) {
        super(registergeofenceswithgoogleplayifnecessarylambda10);
        this.write = getanalyticsenabledenterannotations;
        this.IconCompatParcelizer = parselonglambda0;
        this.serializer = configurationManager;
        this.RemoteActionCompatParcelizer = readandroid_sdk_base_releaseVar;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        this.write.read(ControlMessage.CONFIGURATION_UPDATED, new getActionIndex(this, this.RemoteActionCompatParcelizer));
    }
}
