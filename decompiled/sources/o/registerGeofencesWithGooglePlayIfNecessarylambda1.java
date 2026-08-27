package o;

import com.sentiance.sdk.InjectUsing;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "TokenExpiryInterceptor")
public class registerGeofencesWithGooglePlayIfNecessarylambda1 extends migrateMetadataToJsonlambda2 {
    private final r8lambdaw447glWJfoun4bg91upXnaDQEZs IconCompatParcelizer;
    private final parseLonglambda0 write;

    @Override // o.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled
    public final setShouldPersistWebViewWhenBackgroundingApp serializer(_get_brazeApiKey_lambda1 _get_brazeapikey_lambda1) throws IOException {
        setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingappSerializer = _get_brazeapikey_lambda1.serializer(_get_brazeapikey_lambda1.RatingCompat);
        if (IconCompatParcelizer(setshouldpersistwebviewwhenbackgroundingappSerializer.write) && setshouldpersistwebviewwhenbackgroundingappSerializer.serializer == 401 && !setshouldpersistwebviewwhenbackgroundingappSerializer.write.write.MediaBrowserCompatMediaItem.contains("auth/token")) {
            r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambdaw447glwjfoun4bg91upxnadqezs = this.IconCompatParcelizer;
            if (!r8lambdaw447glwjfoun4bg91upxnadqezs.write().read()) {
                this.write.write("401 received, assuming token expiry", new Object[0]);
                r8lambdaw447glwjfoun4bg91upxnadqezs.read(true);
                ((registerGeofencesWithGooglePlayIfNecessarylambda0) setPushUniqueId.read(registerGeofencesWithGooglePlayIfNecessarylambda0.class)).serializer(null);
            }
        }
        return setshouldpersistwebviewwhenbackgroundingappSerializer;
    }

    public registerGeofencesWithGooglePlayIfNecessarylambda1(r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambdaw447glwjfoun4bg91upxnadqezs, parseLonglambda0 parselonglambda0, registerGeofencesWithGooglePlayIfNecessarylambda10 registergeofenceswithgoogleplayifnecessarylambda10) {
        super(registergeofenceswithgoogleplayifnecessarylambda10);
        this.IconCompatParcelizer = r8lambdaw447glwjfoun4bg91upxnadqezs;
        this.write = parselonglambda0;
    }
}
