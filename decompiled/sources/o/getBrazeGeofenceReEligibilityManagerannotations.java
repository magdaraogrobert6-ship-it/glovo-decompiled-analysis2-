package o;

import android.location.Location;

/* JADX INFO: loaded from: classes3.dex */
final class getBrazeGeofenceReEligibilityManagerannotations extends getLatitudeannotations<wipeDatalambda0> {
    final /* synthetic */ configureFromServerConfiglambda2 IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getBrazeGeofenceReEligibilityManagerannotations(configureFromServerConfiglambda2 configurefromserverconfiglambda2, clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar) {
        super(clearandroid_sdk_base_releaseVar, "UserActivityMonitor");
        this.IconCompatParcelizer = configurefromserverconfiglambda2;
    }

    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<wipeDatalambda0> getlongitudeannotations) {
        wipeDatalambda0 wipedatalambda0 = getlongitudeannotations.read();
        configureFromServerConfiglambda2 configurefromserverconfiglambda2 = this.IconCompatParcelizer;
        getVerticalAccuracy getverticalaccuracy = configurefromserverconfiglambda2.IconCompatParcelizer;
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = wipedatalambda0.RemoteActionCompatParcelizer;
        getverticalaccuracy.getClass();
        Location locationWrite = getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda4);
        configureFromServerConfiglambda2.serializer(configurefromserverconfiglambda2, locationWrite);
        configureFromServerConfiglambda2.write(configurefromserverconfiglambda2, wipeDatalambda0.class, locationWrite);
    }
}
