package com.braze.location;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.b2$$ExternalSyntheticLambda3;
import coil3.util.IntPair;
import com.braze.BrazeUser$$ExternalSyntheticLambda3;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.LocationProviderName;
import com.braze.managers.BrazeGeofenceManager$$ExternalSyntheticLambda1;
import com.braze.models.outgoing.BrazeLocation;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.IntentUtils;
import com.braze.support.PermissionUtils;
import com.braze.support.b$$ExternalSyntheticLambda1;
import java.util.EnumSet;
import java.util.function.Consumer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class BrazeInternalLocationApi implements IBrazeLocationApi {
    public static final Companion Companion = new Companion(null);
    public static final int LAST_KNOWN_GPS_LOCATION_MAX_AGE_MS = 600000;
    private EnumSet<LocationProviderName> allowedLocationProviders;
    private BrazeConfigurationProvider appConfigurationProvider;
    private Context context;
    public LocationManager locationManager;

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLastKnownGpsLocationIfValid$lambda$0(long j) {
        return af$$ExternalSyntheticOutline0.m(j, "Last known GPS location is too old and will not be used. Age ms: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestSingleLocationUpdate$lambda$0() {
        return "Did not request single location update. Neither fine nor coarse location permissions found.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestSingleLocationUpdate$lambda$2() {
        return "Could not request single location update. Could not find suitable location provider.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestSingleLocationUpdate$lambda$3(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Requesting single location update with provider: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestSingleLocationUpdate$lambda$5() {
        return "Failed to request single location update due to security exception from insufficient permissions.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestSingleLocationUpdate$lambda$6() {
        return "Failed to request single location update due to exception.";
    }

    public final Location getLastKnownGpsLocationIfValid(LocationManager locationManager) {
        Location lastKnownLocation;
        locationManager.getClass();
        if (!locationManager.isProviderEnabled("gps") || (lastKnownLocation = locationManager.getLastKnownLocation("gps")) == null) {
            return null;
        }
        long jNowInMilliseconds = DateTimeUtils.nowInMilliseconds() - lastKnownLocation.getTime();
        if (jNowInMilliseconds > 600000) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b2$$ExternalSyntheticLambda3(jNowInMilliseconds, 10), 6, (Object) null);
            return null;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInternalLocationApi$$ExternalSyntheticLambda1(lastKnownLocation, 1), 7, (Object) null);
        return lastKnownLocation;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final String getSuitableLocationProvider(LocationManager locationManager, EnumSet<LocationProviderName> enumSet, boolean z, boolean z2) {
        locationManager.getClass();
        enumSet.getClass();
        if (z && enumSet.contains(LocationProviderName.GPS) && locationManager.isProviderEnabled("gps")) {
            return "gps";
        }
        if ((z2 || z) && enumSet.contains(LocationProviderName.NETWORK) && locationManager.isProviderEnabled("network")) {
            return "network";
        }
        if (z && enumSet.contains(LocationProviderName.PASSIVE) && locationManager.isProviderEnabled("passive")) {
            return "passive";
        }
        return null;
    }

    @Override // com.braze.location.IBrazeLocationApi
    public void initWithContext(Context context, EnumSet<LocationProviderName> enumSet, BrazeConfigurationProvider brazeConfigurationProvider) {
        context.getClass();
        enumSet.getClass();
        brazeConfigurationProvider.getClass();
        this.context = context;
        this.appConfigurationProvider = brazeConfigurationProvider;
        this.allowedLocationProviders = enumSet;
        Object systemService = context.getSystemService("location");
        systemService.getClass();
        setLocationManager$android_sdk_location_release((LocationManager) systemService);
    }

    @Override // com.braze.location.IBrazeLocationApi
    public boolean requestSingleLocationUpdate(final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        Location lastKnownGpsLocationIfValid;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        Context context = this.context;
        if (context == null) {
            removeNodeAtDepth.serializer("context");
            throw null;
        }
        boolean zHasPermission = PermissionUtils.hasPermission(context, "android.permission.ACCESS_FINE_LOCATION");
        Context context2 = this.context;
        if (context2 == null) {
            removeNodeAtDepth.serializer("context");
            throw null;
        }
        boolean zHasPermission2 = PermissionUtils.hasPermission(context2, "android.permission.ACCESS_COARSE_LOCATION");
        int i = 0;
        if (!zHasPermission2 && !zHasPermission) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda3(29), 6, (Object) null);
            return false;
        }
        int i2 = 1;
        if (zHasPermission && (lastKnownGpsLocationIfValid = getLastKnownGpsLocationIfValid(getLocationManager$android_sdk_location_release())) != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInternalLocationApi$$ExternalSyntheticLambda1(lastKnownGpsLocationIfValid, i), 7, (Object) null);
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new BrazeLocation(lastKnownGpsLocationIfValid));
            return true;
        }
        LocationManager locationManager$android_sdk_location_release = getLocationManager$android_sdk_location_release();
        EnumSet<LocationProviderName> enumSet = this.allowedLocationProviders;
        if (enumSet == null) {
            removeNodeAtDepth.serializer("allowedLocationProviders");
            throw null;
        }
        String suitableLocationProvider = getSuitableLocationProvider(locationManager$android_sdk_location_release, enumSet, zHasPermission, zHasPermission2);
        if (suitableLocationProvider == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeGeofenceManager$$ExternalSyntheticLambda1(i2), 7, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda1(suitableLocationProvider, 6), 7, (Object) null);
        try {
            if (Build.VERSION.SDK_INT < 30) {
                requestSingleUpdateFromLocationManager(suitableLocationProvider);
                return true;
            }
            LocationManager locationManager$android_sdk_location_release2 = getLocationManager$android_sdk_location_release();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            locationManager$android_sdk_location_release2.getCurrentLocation(suitableLocationProvider, null, IntPair.write(DefaultIoScheduler.RemoteActionCompatParcelizer), new Consumer() { // from class: com.braze.location.BrazeInternalLocationApi$$ExternalSyntheticLambda4
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    BrazeInternalLocationApi.requestSingleLocationUpdate$lambda$4(this.f$0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, (Location) obj);
                }
            });
            return true;
        } catch (SecurityException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeGeofenceManager$$ExternalSyntheticLambda1(2), 4, (Object) null);
            return false;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeGeofenceManager$$ExternalSyntheticLambda1(3), 4, (Object) null);
            return false;
        }
    }

    public final void setLocationManager$android_sdk_location_release(LocationManager locationManager) {
        locationManager.getClass();
        this.locationManager = locationManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLastKnownGpsLocationIfValid$lambda$1(Location location) {
        return "Using last known GPS location: " + location;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestSingleLocationUpdate$lambda$1(Location location) {
        return "Setting user location to last known GPS location: " + location;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestSingleLocationUpdate$lambda$4$0(Location location) {
        return "Location manager getCurrentLocation got location: " + location;
    }

    private final void requestSingleUpdateFromLocationManager(String str) {
        Intent intent = new Intent(Constants.BRAZE_ACTION_RECEIVER_SINGLE_LOCATION_UPDATE_INTENT_ACTION);
        Context context = this.context;
        if (context != null) {
            Intent intent2 = intent.setClass(context, BrazeActionReceiver.class);
            intent2.getClass();
            int mutablePendingIntentFlags = IntentUtils.getMutablePendingIntentFlags();
            Context context2 = this.context;
            if (context2 != null) {
                getLocationManager$android_sdk_location_release().requestSingleUpdate(str, PendingIntent.getBroadcast(context2, 0, intent2, mutablePendingIntentFlags | 134217728));
                return;
            } else {
                removeNodeAtDepth.serializer("context");
                throw null;
            }
        }
        removeNodeAtDepth.serializer("context");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestSingleLocationUpdate$lambda$4(BrazeInternalLocationApi brazeInternalLocationApi, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Location location) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInternalLocationApi, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInternalLocationApi$$ExternalSyntheticLambda1(location, 2), 7, (Object) null);
        if (location != null) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new BrazeLocation(location));
        }
    }

    public final LocationManager getLocationManager$android_sdk_location_release() {
        LocationManager locationManager = this.locationManager;
        if (locationManager != null) {
            return locationManager;
        }
        removeNodeAtDepth.serializer("locationManager");
        throw null;
    }
}
