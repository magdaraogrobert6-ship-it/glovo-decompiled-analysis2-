package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "SmartGeofencePayloadCreator")
public final class r8lambda2cjFFMAd_RWrPqWlBD9mzTs2j8c extends getStoryStyle {
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI IconCompatParcelizer;
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private final migrateFeatureFlagStorageToJsonlambda20 read;
    private final r8lambdaw447glWJfoun4bg91upXnaDQEZs serializer;

    @Override // o.getStoryStyle
    public final int IconCompatParcelizer() {
        return 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambda2cjFFMAd_RWrPqWlBD9mzTs2j8c(parseLonglambda0 parselonglambda0, migrateFeatureFlagStorageToJsonlambda20 migratefeatureflagstoragetojsonlambda20, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambdaw447glwjfoun4bg91upxnadqezs, ConfigurationManager configurationManager, storeRegisteredGeofencesToLocalStoragelambda0 storeregisteredgeofencestolocalstoragelambda0) {
        super(configurationManager, storeregisteredgeofencestolocalstoragelambda0);
        parselonglambda0.getClass();
        migratefeatureflagstoragetojsonlambda20.getClass();
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        r8lambdaw447glwjfoun4bg91upxnadqezs.getClass();
        configurationManager.getClass();
        storeregisteredgeofencestolocalstoragelambda0.getClass();
        this.RemoteActionCompatParcelizer = parselonglambda0;
        this.read = migratefeatureflagstoragetojsonlambda20;
        this.IconCompatParcelizer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.serializer = r8lambdaw447glwjfoun4bg91upxnadqezs;
    }

    @Override // o.getStoryStyle
    public final getNotificationStyle write(r8lambda9XibBb_UAwpsuoULwKlfVxtang r8lambda9xibbb_uawpsuoulwklfvxtang, long j) {
        r8lambda9xibbb_uawpsuoulwklfvxtang.getClass();
        if (!RemoteActionCompatParcelizer()) {
            getNotificationStyle.write.getClass();
            return getNotificationStyle.serializer.IconCompatParcelizer();
        }
        this.RemoteActionCompatParcelizer.serializer("Processing smart geofence event...", new Object[0]);
        return getStoryStyle.read(this, r8lambdaQMpB2ZjTzCqSwpx9l6hPdj8cu4s.read(r8lambda9xibbb_uawpsuoulwklfvxtang, this.read, this.IconCompatParcelizer, this.serializer, write(), j));
    }
}
