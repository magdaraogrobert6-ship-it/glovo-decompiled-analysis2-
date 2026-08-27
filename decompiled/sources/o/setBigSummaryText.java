package o;

import android.location.Location;
import com.sentiance.sdk.geofence.states.Type;
import com.sentiance.sdk.util.Optional;

/* JADX INFO: loaded from: classes3.dex */
final class setBigSummaryText extends getLatitudeannotations<r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU> {
    final /* synthetic */ getUseWebView write;

    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU> getlongitudeannotations) {
        Type type = Type.STOPPED;
        getUseWebView getusewebview = this.write;
        if (getusewebview.RemoteActionCompatParcelizer(type) || getusewebview.RemoteActionCompatParcelizer(Type.LOST)) {
            return;
        }
        r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU r8lambdaibd0azdffjr6m_pevs2l1iejku = getlongitudeannotations.read();
        long jWrite = getlongitudeannotations.write();
        getVerticalAccuracy getverticalaccuracy = getusewebview.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = r8lambdaibd0azdffjr6m_pevs2l1iejku.RemoteActionCompatParcelizer;
        getverticalaccuracy.getClass();
        Location locationWrite = getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda4);
        Optional<setConfigurationProvider> optionalSerializer = getusewebview.MediaMetadataCompat.serializer("geofence");
        if (getUseWebView.write(getusewebview, optionalSerializer, locationWrite)) {
            Integer numValueOf = optionalSerializer.IconCompatParcelizer() ? Integer.valueOf(optionalSerializer.write().serializer) : null;
            getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = getusewebview.ResultReceiver;
            getVerticalAccuracy getverticalaccuracy2 = getusewebview.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            setConfigurationProvider setconfigurationproviderRemoteActionCompatParcelizer = optionalSerializer.RemoteActionCompatParcelizer();
            Optional optionalWrite = Optional.write(numValueOf);
            getverticalaccuracy2.getClass();
            getanalyticsenabledenterannotations.serializer(getVerticalAccuracy.write(setconfigurationproviderRemoteActionCompatParcelizer, optionalWrite, locationWrite, 9, jWrite));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setBigSummaryText(getUseWebView getusewebview, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        super(readandroid_sdk_base_releaseVar, "GeofenceStateManager");
        this.write = getusewebview;
    }
}
