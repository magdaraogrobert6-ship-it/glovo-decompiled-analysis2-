package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.quota.BandwidthQuotaMonitor;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "BandwidthQuotaInterceptor")
public class r8lambdazCHEfJSH3y6SNJawS_xr1wg5i08 extends migrateMetadataToJsonlambda2 {
    private final BandwidthQuotaMonitor IconCompatParcelizer;
    private final parseLonglambda0 write;

    @Override // o.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled
    public final setShouldPersistWebViewWhenBackgroundingApp serializer(_get_brazeApiKey_lambda1 _get_brazeapikey_lambda1) throws IOException {
        setSessionTimeout setsessiontimeout = _get_brazeapikey_lambda1.RatingCompat;
        setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingappSerializer = _get_brazeapikey_lambda1.serializer(setsessiontimeout);
        Object objCast = Object.class.cast(setsessiontimeout.IconCompatParcelizer.get(Object.class));
        isHtmlInAppMessageApplyWindowInsetsEnabled ishtmlinappmessageapplywindowinsetsenabled = setsessiontimeout.write;
        parseLonglambda0 parselonglambda0 = this.write;
        if (objCast != null && (Object.class.cast(setsessiontimeout.IconCompatParcelizer.get(Object.class)) instanceof requestSingleLocationUpdatelambda4.write)) {
            parselonglambda0.IconCompatParcelizer("Ignoring quota, tag was set", new Object[0]);
            return setshouldpersistwebviewwhenbackgroundingappSerializer;
        }
        if (IconCompatParcelizer(setsessiontimeout) && (ishtmlinappmessageapplywindowinsetsenabled.IconCompatParcelizer().equals("/data/payloads") || ishtmlinappmessageapplywindowinsetsenabled.IconCompatParcelizer().equals("/logs"))) {
            String str = setshouldpersistwebviewwhenbackgroundingappSerializer.read("_rs", null);
            if (str != null) {
                try {
                    this.IconCompatParcelizer.read(Long.parseLong(str));
                    return setshouldpersistwebviewwhenbackgroundingappSerializer;
                } catch (NumberFormatException e) {
                    parselonglambda0.IconCompatParcelizer(e, "Couldn't parse request size header: %s", str);
                    return setshouldpersistwebviewwhenbackgroundingappSerializer;
                }
            }
            parselonglambda0.write("Response of request to %s did not contain _rs header", ishtmlinappmessageapplywindowinsetsenabled.IconCompatParcelizer());
        }
        return setshouldpersistwebviewwhenbackgroundingappSerializer;
    }

    public r8lambdazCHEfJSH3y6SNJawS_xr1wg5i08(parseLonglambda0 parselonglambda0, BandwidthQuotaMonitor bandwidthQuotaMonitor, registerGeofencesWithGooglePlayIfNecessarylambda10 registergeofenceswithgoogleplayifnecessarylambda10) {
        super(registergeofenceswithgoogleplayifnecessarylambda10);
        this.write = parselonglambda0;
        this.IconCompatParcelizer = bandwidthQuotaMonitor;
    }
}
