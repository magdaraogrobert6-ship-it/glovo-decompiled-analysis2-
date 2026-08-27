package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.processguard.Guard$Type;
import com.sentiance.sdk.tile.gis.store.ZippedGisTileStore;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "GisTileDownloader", guardType = Guard$Type.REFERENCE_COUNTED)
public class getDataStoreInstanceCacheandroid_sdk_base_release extends r8lambdaUdD4Yj05V3iuQbJEwTce3Mt1rIw {
    private final ConfigurationManager read;

    @Override // o.r8lambdaUdD4Yj05V3iuQbJEwTce3Mt1rIw
    public final boolean IconCompatParcelizer() {
        return this.read.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs();
    }

    public getDataStoreInstanceCacheandroid_sdk_base_release(r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4, parseLonglambda0 parselonglambda0, getLastKnownGpsLocationIfValidlambda0 getlastknowngpslocationifvalidlambda0, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, DataStoreProviderExternalSyntheticLambda1 dataStoreProviderExternalSyntheticLambda1, ZippedGisTileStore zippedGisTileStore, getTAG gettag, isGeofencesEnabledFromEnvironmentlambda1 isgeofencesenabledfromenvironmentlambda1, retrieveRegisteredGeofencesFromLocalStoragelambda0 retrieveregisteredgeofencesfromlocalstoragelambda0, ConfigurationManager configurationManager) {
        super(r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4, parselonglambda0, getlastknowngpslocationifvalidlambda0, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, dataStoreProviderExternalSyntheticLambda1, zippedGisTileStore, gettag, isgeofencesenabledfromenvironmentlambda1, retrieveregisteredgeofencesfromlocalstoragelambda0);
        this.read = configurationManager;
    }
}
