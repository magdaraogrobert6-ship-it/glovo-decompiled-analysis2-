package com.braze.managers;

import com.braze.location.BrazeInternalLocationApi;
import com.braze.location.GooglePlayLocationUtils;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class BrazeGeofenceManager$$ExternalSyntheticLambda1 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ BrazeGeofenceManager$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return BrazeGeofenceManager.tearDownGeofences$lambda$0();
            case 1:
                return BrazeInternalLocationApi.requestSingleLocationUpdate$lambda$2();
            case 2:
                return BrazeInternalLocationApi.requestSingleLocationUpdate$lambda$5();
            case 3:
                return BrazeInternalLocationApi.requestSingleLocationUpdate$lambda$6();
            case 4:
                return GooglePlayLocationUtils.retrieveRegisteredGeofencesFromLocalStorage$lambda$0();
            case 5:
                return GooglePlayLocationUtils.requestSingleLocationUpdateFromGooglePlay$lambda$1$0();
            case 6:
                return GooglePlayLocationUtils.requestSingleLocationUpdateFromGooglePlay$lambda$0();
            case 7:
                return GooglePlayLocationUtils.requestSingleLocationUpdateFromGooglePlay$lambda$4();
            case 8:
                return GooglePlayLocationUtils.requestSingleLocationUpdateFromGooglePlay$lambda$3$0();
            case 9:
                return GooglePlayLocationUtils.deleteRegisteredGeofenceCache$lambda$0();
            case 10:
                return GooglePlayLocationUtils.registerGeofencesWithGooglePlayIfNecessary$lambda$8();
            case 11:
                return GooglePlayLocationUtils.registerGeofencesWithGooglePlayIfNecessary$lambda$10();
            case 12:
                return GooglePlayLocationUtils.registerGeofencesWithGooglePlayIfNecessary$lambda$11();
            case 13:
                return GooglePlayLocationUtils.registerGeofencesWithGeofencingClient$lambda$3$3();
            case 14:
                return GooglePlayLocationUtils.registerGeofencesWithGeofencingClient$lambda$3$5();
            case 15:
                return GooglePlayLocationUtils.removeGeofencesRegisteredWithGeofencingClient$lambda$0$0();
            case 16:
                return GooglePlayLocationUtils.removeGeofencesRegisteredWithGeofencingClient$lambda$2$3();
            case 17:
                return GooglePlayLocationUtils.removeGeofencesRegisteredWithGeofencingClient$lambda$2$5();
            case 18:
                return GooglePlayLocationUtils.registerGeofencesWithGeofencingClient$lambda$1$0();
            case 19:
                return BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$0();
            case 20:
                return BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$1();
            case 21:
                return BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$2();
            case 22:
                return BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$3();
            case 23:
                return BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$6();
            case 24:
                return BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$5();
            case 25:
                return BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$4();
            case 26:
                return BrazeGeofenceManager.registerGeofences$lambda$0();
            case 27:
                return BrazeGeofenceManager.requestGeofenceRefresh$lambda$2();
            case 28:
                return BrazeGeofenceManager.tearDownGeofences$lambda$1();
            default:
                return BrazeGeofenceManager.onLocationRequestComplete$lambda$1();
        }
    }
}
