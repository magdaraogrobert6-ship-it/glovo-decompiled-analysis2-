package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "OccupantRoleFeedbackPayloadCreator")
public final class r8lambda2Z24byTAeHxLu8lP73Dh4AcjHhM extends getStoryStyle {
    private final migrateFeatureFlagStorageToJsonlambda20 IconCompatParcelizer;
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private final r8lambdaw447glWJfoun4bg91upXnaDQEZs read;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI serializer;

    @Override // o.getStoryStyle
    public final int IconCompatParcelizer() {
        return 3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambda2Z24byTAeHxLu8lP73Dh4AcjHhM(parseLonglambda0 parselonglambda0, migrateFeatureFlagStorageToJsonlambda20 migratefeatureflagstoragetojsonlambda20, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambdaw447glwjfoun4bg91upxnadqezs, ConfigurationManager configurationManager, storeRegisteredGeofencesToLocalStoragelambda0 storeregisteredgeofencestolocalstoragelambda0) {
        super(configurationManager, storeregisteredgeofencestolocalstoragelambda0);
        parselonglambda0.getClass();
        migratefeatureflagstoragetojsonlambda20.getClass();
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        r8lambdaw447glwjfoun4bg91upxnadqezs.getClass();
        configurationManager.getClass();
        storeregisteredgeofencestolocalstoragelambda0.getClass();
        this.RemoteActionCompatParcelizer = parselonglambda0;
        this.IconCompatParcelizer = migratefeatureflagstoragetojsonlambda20;
        this.serializer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.read = r8lambdaw447glwjfoun4bg91upxnadqezs;
    }

    @Override // o.getStoryStyle
    public final getNotificationStyle write(getFlushMaxMinutes getflushmaxminutes) {
        getflushmaxminutes.getClass();
        if (!RemoteActionCompatParcelizer()) {
            getNotificationStyle.write.getClass();
            return getNotificationStyle.serializer.IconCompatParcelizer();
        }
        this.RemoteActionCompatParcelizer.serializer("Processing occupant role feedback event...", new Object[0]);
        return getStoryStyle.read(this, r8lambdaQMpB2ZjTzCqSwpx9l6hPdj8cu4s.serializer(getflushmaxminutes, this.IconCompatParcelizer, this.serializer, this.read));
    }
}
