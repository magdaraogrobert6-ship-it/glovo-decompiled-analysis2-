package com.sentiance.sdk.crashdetection.api;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.util.N;
import com.sentiance.sdk.util.Optional;
import o.BrazeCompanionExternalSyntheticLambda4;
import o.GooglePlayLocationUtilsretrieveRegisteredGeofencesFromLocalStorageinlinedreadList1;
import o.GooglePlayLocationUtilsretrieveRegisteredGeofencesFromLocalStorageinlinedreadList3;
import o.GooglePlayLocationUtilsstoreRegisteredGeofencesToLocalStorageinlinedwriteList1;
import o.GooglePlayLocationUtilsstoreRegisteredGeofencesToLocalStorageinlinedwriteList3;
import o.IBrazeGeofenceApi;
import o.IBrazeLocationApi;
import o.component4android_sdk_base_release;
import o.getAnalyticsEnabledEnterannotations;
import o.getCooldownEnterSeconds;
import o.getDiskCacheDir;
import o.getVerticalAccuracy;
import o.parseLonglambda0;
import o.populateNotificationBuilderlambda0;
import o.r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk;
import o.r8lambda7zvd1Q0zVs4colYANjFPBKq0PCw;
import o.r8lambdaE7oIx09KQauliA8paOfGanE2_e8;
import o.r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU;
import o.r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU;
import o.r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI;
import o.r8lambdabeyXiieoVXePlp1OH2wlzR3AbD0;
import o.readBoolean;
import o.removeGeofencesRegisteredWithGeofencingClientlambda20;
import o.requestSingleLocationUpdateFromGooglePlay;
import o.setPushUniqueId;
import o.toGeofence;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class CrashDetectionApi extends N implements ICrashDetectionApi {
    private static final long DUMMY_CRASH_LAST_LOCATION_WAIT_TIME_MILLIS = 5000;
    private static final String GUARD_TAG = "CrashDetectionApi";
    private static final String LOG_TAG = "CrashDetectionApi";

    @SuppressLint
    private static CrashDetectionApi sInstance;
    private final Context mContext;
    private parseLonglambda0 mLogger;
    private VehicleCrashListener mCrashListener = null;
    private VehicleCrashDiagnosticListener mCrashDiagnosticListener = null;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ VehicleCrashDiagnosticListener lambda$setVehicleCrashDiagnosticListener$1(VehicleCrashDiagnosticListener vehicleCrashDiagnosticListener) {
        this.mCrashDiagnosticListener = vehicleCrashDiagnosticListener;
        return vehicleCrashDiagnosticListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ VehicleCrashListener lambda$setVehicleCrashListener$0(VehicleCrashListener vehicleCrashListener) {
        this.mCrashListener = vehicleCrashListener;
        return vehicleCrashListener;
    }

    @Override // com.sentiance.sdk.crashdetection.api.ICrashDetectionApi
    public void setVehicleCrashDiagnosticListener(VehicleCrashDiagnosticListener vehicleCrashDiagnosticListener) {
        synchronized (this) {
            ifSdkIsInitialized(new GooglePlayLocationUtilsretrieveRegisteredGeofencesFromLocalStorageinlinedreadList1(this, vehicleCrashDiagnosticListener, 1));
            if (vehicleCrashDiagnosticListener != null) {
                log("Vehicle diagnostic listener has been set", new Object[0]);
            } else {
                log("Vehicle diagnostic listener has been unset", new Object[0]);
            }
        }
    }

    @Override // com.sentiance.sdk.crashdetection.api.ICrashDetectionApi
    public void setVehicleCrashListener(VehicleCrashListener vehicleCrashListener) {
        synchronized (this) {
            ifSdkIsInitialized(new GooglePlayLocationUtilsretrieveRegisteredGeofencesFromLocalStorageinlinedreadList1(this, vehicleCrashListener, 0));
            if (vehicleCrashListener != null) {
                log("Vehicle crash listener has been set", new Object[0]);
            } else {
                log("Vehicle crash listener has been unset", new Object[0]);
            }
        }
    }

    private void addOnBootstrapCompleteListener() {
        populateNotificationBuilderlambda0.RemoteActionCompatParcelizer(this.mContext).RemoteActionCompatParcelizer(new removeGeofencesRegisteredWithGeofencingClientlambda20() { // from class: o.GooglePlayLocationUtilsKt
            @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda20
            public final void write() {
                this.IconCompatParcelizer.onBootstrapComplete();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public VehicleCrashSeverity getCrashSeverity(r8lambdaE7oIx09KQauliA8paOfGanE2_e8 r8lambdae7oix09kqaulia8paofgane2_e8) {
        String str = r8lambdae7oix09kqaulia8paofgane2_e8.MediaDescriptionCompat;
        String str2 = r8lambdae7oix09kqaulia8paofgane2_e8.MediaDescriptionCompat;
        if (Constants.HIGH.equals(str)) {
            return VehicleCrashSeverity.HIGH;
        }
        if (Constants.MEDIUM.equals(str2)) {
            return VehicleCrashSeverity.MEDIUM;
        }
        return Constants.LOW.equals(str2) ? VehicleCrashSeverity.LOW : VehicleCrashSeverity.UNAVAILABLE;
    }

    public static CrashDetectionApi getInstance(Context context) {
        CrashDetectionApi crashDetectionApi;
        synchronized (CrashDetectionApi.class) {
            if (sInstance == null) {
                sInstance = new CrashDetectionApi(context.getApplicationContext());
            }
            crashDetectionApi = sInstance;
        }
        return crashDetectionApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Location getLastLocationFromEventStore() {
        r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer;
        r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU r8lambdaibd0azdffjr6m_pevs2l1iejku;
        getCooldownEnterSeconds getcooldownenterseconds = (getCooldownEnterSeconds) setPushUniqueId.read(getCooldownEnterSeconds.class);
        getVerticalAccuracy getverticalaccuracy = (getVerticalAccuracy) setPushUniqueId.read(getVerticalAccuracy.class);
        component4android_sdk_base_release component4android_sdk_base_releaseVar = (component4android_sdk_base_release) setPushUniqueId.read(component4android_sdk_base_release.class);
        Optional<getCooldownEnterSeconds.read> optionalIconCompatParcelizer = getcooldownenterseconds.IconCompatParcelizer(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, (Long) null);
        if (!optionalIconCompatParcelizer.IconCompatParcelizer() || (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = optionalIconCompatParcelizer.write().RemoteActionCompatParcelizer(component4android_sdk_base_releaseVar)) == null || (r8lambdaibd0azdffjr6m_pevs2l1iejku = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) == null) {
            return null;
        }
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = r8lambdaibd0azdffjr6m_pevs2l1iejku.RemoteActionCompatParcelizer;
        getverticalaccuracy.getClass();
        return getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$invokeDummyVehicleCrash$2(long j, Location location, VehicleCrashListener vehicleCrashListener) {
        VehicleCrashEvent.write writeVar = new VehicleCrashEvent.write(j);
        writeVar.read(location);
        writeVar.write(VehicleCrashSeverity.HIGH);
        writeVar.IconCompatParcelizer(VehicleCrashDetectorMode.TWO_WHEELER);
        vehicleCrashListener.onVehicleCrash(new VehicleCrashEvent(writeVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$isVehicleCrashDetectionSupported$6() {
        return Boolean.valueOf(((r8lambda7zvd1Q0zVs4colYANjFPBKq0PCw) setPushUniqueId.read(r8lambda7zvd1Q0zVs4colYANjFPBKq0PCw.class)).read());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$requestLastKnownLocation$5(GooglePlayLocationUtilsstoreRegisteredGeofencesToLocalStorageinlinedwriteList3 googlePlayLocationUtilsstoreRegisteredGeofencesToLocalStorageinlinedwriteList3, Location location) {
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = (getAnalyticsEnabledEnterannotations) setPushUniqueId.read(getAnalyticsEnabledEnterannotations.class);
        getanalyticsenabledenterannotations.read(ControlMessage.LAST_KNOWN_LOCATION_RESPONSE, new IBrazeGeofenceApi(this, getParallelExecutor(), getanalyticsenabledenterannotations, googlePlayLocationUtilsstoreRegisteredGeofencesToLocalStorageinlinedwriteList3, location));
        getanalyticsenabledenterannotations.IconCompatParcelizer(ControlMessage.GET_LAST_KNOWN_LOCATION, (Object) 5000L);
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onBootstrapComplete() {
        ((getAnalyticsEnabledEnterannotations) setPushUniqueId.read(getAnalyticsEnabledEnterannotations.class)).RemoteActionCompatParcelizer(r8lambdaE7oIx09KQauliA8paOfGanE2_e8.class, new toGeofence(this));
        ((getAnalyticsEnabledEnterannotations) setPushUniqueId.read(getAnalyticsEnabledEnterannotations.class)).read(ControlMessage.VEHICLE_CRASH_DIAGNOSTIC, new IBrazeLocationApi(this));
    }

    @Override // com.sentiance.sdk.crashdetection.api.ICrashDetectionApi
    public void invokeDummyVehicleCrash() {
        ifSdkIsInitialized(new GooglePlayLocationUtilsretrieveRegisteredGeofencesFromLocalStorageinlinedreadList3(this, 0));
    }

    public CrashDetectionApi(Context context) {
        this.mContext = context;
        addOnBootstrapCompleteListener();
    }

    private Location getDummyCrashLocation() {
        Location location = new Location("gps");
        location.setLatitude(0.0d);
        location.setLongitude(0.0d);
        location.setSpeed(0.0f);
        return location;
    }

    private void requestLastKnownLocation(final Location location, final GooglePlayLocationUtilsstoreRegisteredGeofencesToLocalStorageinlinedwriteList3 googlePlayLocationUtilsstoreRegisteredGeofencesToLocalStorageinlinedwriteList3) {
        if (((Boolean) ifSdkIsInitializedWithUser(Boolean.FALSE, (r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk<Boolean>) new r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk() { // from class: o.GooglePlayLocationUtilsstoreRegisteredGeofencesToLocalStorageinlinedwriteList2
            @Override // o.r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk
            public final Object IconCompatParcelizer() {
                return this.serializer.lambda$requestLastKnownLocation$5(googlePlayLocationUtilsstoreRegisteredGeofencesToLocalStorageinlinedwriteList3, location);
            }
        })).booleanValue()) {
            return;
        }
        GooglePlayLocationUtilsstoreRegisteredGeofencesToLocalStorageinlinedwriteList1 googlePlayLocationUtilsstoreRegisteredGeofencesToLocalStorageinlinedwriteList1 = (GooglePlayLocationUtilsstoreRegisteredGeofencesToLocalStorageinlinedwriteList1) googlePlayLocationUtilsstoreRegisteredGeofencesToLocalStorageinlinedwriteList3;
        lambda$invokeDummyVehicleCrash$3(googlePlayLocationUtilsstoreRegisteredGeofencesToLocalStorageinlinedwriteList1.RemoteActionCompatParcelizer, googlePlayLocationUtilsstoreRegisteredGeofencesToLocalStorageinlinedwriteList1.write, location);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$invokeDummyVehicleCrash$3(long j, VehicleCrashListener vehicleCrashListener, Location location) {
        location.setTime(j);
        readBoolean.serializer(new requestSingleLocationUpdateFromGooglePlay(j, location, vehicleCrashListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void log(String str, Object... objArr) {
        if (this.mLogger == null) {
            this.mLogger = new parseLonglambda0(this.mContext, "CrashDetectionApi", (r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI) setPushUniqueId.read(r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI.class), (r8lambdabeyXiieoVXePlp1OH2wlzR3AbD0) setPushUniqueId.read(r8lambdabeyXiieoVXePlp1OH2wlzR3AbD0.class));
        }
        this.mLogger.IconCompatParcelizer(str, objArr);
    }

    @Override // com.sentiance.sdk.crashdetection.api.ICrashDetectionApi
    public boolean isVehicleCrashDetectionSupported() {
        return ((Boolean) ifSdkIsInitializedWithUser(Boolean.FALSE, new getDiskCacheDir(12))).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$invokeDummyVehicleCrash$4() {
        VehicleCrashListener vehicleCrashListener = this.mCrashListener;
        if (vehicleCrashListener == null) {
            Log.e("Sentiance", "No crash callback set. Did you call CrashDetectionApi.setVehicleCrashListener(CrashListener) first?");
            return;
        }
        ((r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI) setPushUniqueId.read(r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI.class)).getClass();
        requestLastKnownLocation(getDummyCrashLocation(), new GooglePlayLocationUtilsstoreRegisteredGeofencesToLocalStorageinlinedwriteList1(System.currentTimeMillis(), vehicleCrashListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public VehicleCrashDetectorMode convertToPublicType(Byte b) {
        byte bByteValue = b.byteValue();
        if (bByteValue != 1) {
            return bByteValue != 2 ? VehicleCrashDetectorMode.UNKNOWN : VehicleCrashDetectorMode.TWO_WHEELER;
        }
        return VehicleCrashDetectorMode.CAR;
    }
}
