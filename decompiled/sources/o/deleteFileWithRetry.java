package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.processguard.Guard$Type;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "VenueTileDownloader", guardType = Guard$Type.REFERENCE_COUNTED)
public class deleteFileWithRetry extends r8lambdaUdD4Yj05V3iuQbJEwTce3Mt1rIw {
    private final ConfigurationManager write;

    @Override // o.r8lambdaUdD4Yj05V3iuQbJEwTce3Mt1rIw
    public final boolean IconCompatParcelizer() {
        return this.write.menuHostHelperlambda0();
    }

    public deleteFileWithRetry(r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4, parseLonglambda0 parselonglambda0, getLastKnownGpsLocationIfValidlambda0 getlastknowngpslocationifvalidlambda0, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, r8lambdayJ2VRx0EIP3IZpXctufYPAKur_0 r8lambdayj2vrx0eip3izpxctufypakur_0, DataStoreProviderm dataStoreProviderm, deleteDataStoreFileslambda1 deletedatastorefileslambda1, ConfigurationManager configurationManager, isGeofencesEnabledFromEnvironmentlambda1 isgeofencesenabledfromenvironmentlambda1, retrieveRegisteredGeofencesFromLocalStoragelambda0 retrieveregisteredgeofencesfromlocalstoragelambda0) {
        super(r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4, parselonglambda0, getlastknowngpslocationifvalidlambda0, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, r8lambdayj2vrx0eip3izpxctufypakur_0, dataStoreProviderm, deletedatastorefileslambda1, isgeofencesenabledfromenvironmentlambda1, retrieveregisteredgeofencesfromlocalstoragelambda0);
        this.write = configurationManager;
    }
}
