package com.mapbox.common.location;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.sqlite.SQLite;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5;
import com.incognia.internal.mn$$ExternalSyntheticLambda0;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.Cancelable;
import com.mapbox.common.FeatureTelemetryCounter;
import com.mapbox.common.MapboxCommonLogger;
import com.mapbox.maps.MapboxMap$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.accessgetInstancedelegatecp;
import o.createFromParcel;
import o.instance_delegatelambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class GoogleDeviceLocationProvider extends BaseDeviceLocationProvider {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "GoogleDeviceLocationProvider";
    private HandlerThread fusedLocationClientHandlerThread;
    private ProxyGoogleFusedLocationProviderClient fusedLocationProviderClient;
    private final GoogleDeviceLocationProvider$locationCallback$1 locationCallback;
    private final Looper looper;
    private final int persistentId;

    public static /* synthetic */ void getFusedLocationProviderClient$annotations() {
    }

    public final ProxyGoogleFusedLocationProviderClient getFusedLocationProviderClient() {
        return this.fusedLocationProviderClient;
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider
    public int getPersistentId() {
        return this.persistentId;
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider
    @SuppressLint
    public void doStart() {
        LocationRequest locationRequestCreate;
        Task taskRequestLocationUpdates;
        Task taskAddOnSuccessListener;
        PermissionStatus permissionStatus;
        Expected<LocationError, LocationRequest> locationRequest;
        synchronized (this) {
            LocationProviderRequest request = getRequest();
            if (request == null || (locationRequest = LocationProviderSettingsExtKt.toLocationRequest(request)) == null || (locationRequestCreate = locationRequest.getValue()) == null) {
                locationRequestCreate = LocationRequest.create();
            }
            PermissionStatus permissionStatus2 = LocationServiceUtils.getPermissionStatus(getContext());
            MapboxCommonLogger.INSTANCE.logD$common_release(TAG, "Permission status: " + permissionStatus2);
            if (SQLite.read(PermissionStatus.FOREGROUND, PermissionStatus.GRANTED).contains(permissionStatus2) || (permissionStatus2 == (permissionStatus = PermissionStatus.BACKGROUND) && this.looper != null)) {
                setCurrentMode(BaseDeviceLocationProvider.DeviceLocationProviderMode.CALLBACK);
                ProxyGoogleFusedLocationProviderClient proxyGoogleFusedLocationProviderClient = this.fusedLocationProviderClient;
                locationRequestCreate.getClass();
                taskRequestLocationUpdates = proxyGoogleFusedLocationProviderClient.requestLocationUpdates(locationRequestCreate, this.locationCallback, getCallbackLooper());
            } else if (permissionStatus2 == permissionStatus) {
                setCurrentMode(BaseDeviceLocationProvider.DeviceLocationProviderMode.PENDING_INTENT);
                ProxyGoogleFusedLocationProviderClient proxyGoogleFusedLocationProviderClient2 = this.fusedLocationProviderClient;
                locationRequestCreate.getClass();
                taskRequestLocationUpdates = proxyGoogleFusedLocationProviderClient2.requestLocationUpdates(locationRequestCreate, getLocationUpdatePendingIntent());
            } else {
                taskRequestLocationUpdates = new FailedTask(new Exception("Cannot start Google device location provider: permission denied"));
            }
            if (taskRequestLocationUpdates != null && (taskAddOnSuccessListener = taskRequestLocationUpdates.addOnSuccessListener(new mn$$ExternalSyntheticLambda0(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.common.location.GoogleDeviceLocationProvider.doStart.1
                public final void invoke(Void r5) {
                    FeatureTelemetryCounter.create("common/location/googleProviderStarted").increment();
                    MapboxCommonLogger mapboxCommonLogger = MapboxCommonLogger.INSTANCE;
                    mapboxCommonLogger.logD$common_release(GoogleDeviceLocationProvider.TAG, "Location request succeeded state=" + GoogleDeviceLocationProvider.this.state + " currentMode=" + GoogleDeviceLocationProvider.this.getCurrentMode());
                    GoogleDeviceLocationProvider googleDeviceLocationProvider = GoogleDeviceLocationProvider.this;
                    if (googleDeviceLocationProvider.state == BaseDeviceLocationProvider.DeviceLocationProviderState.STARTING) {
                        googleDeviceLocationProvider.state = BaseDeviceLocationProvider.DeviceLocationProviderState.STARTED;
                        mapboxCommonLogger.logD$common_release(GoogleDeviceLocationProvider.TAG, "Started location updates with mode " + GoogleDeviceLocationProvider.this.getCurrentMode());
                    } else {
                        mapboxCommonLogger.logW$common_release(GoogleDeviceLocationProvider.TAG, "Skipped start state change: current state is " + GoogleDeviceLocationProvider.this.state);
                    }
                    LocationUpdatesReceiver.Companion.addDeviceLocationProvider$common_release(GoogleDeviceLocationProvider.this.getPersistentId(), GoogleDeviceLocationProvider.this);
                }

                {
                    super(1);
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Void) obj);
                    return createFromParcel.INSTANCE;
                }
            }, 9))) != null) {
                taskAddOnSuccessListener.addOnFailureListener(new GoogleDeviceLocationProvider$$ExternalSyntheticLambda5(permissionStatus2, this));
            }
        }
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider, com.mapbox.common.location.DeviceLocationProvider
    public String getName() {
        return "mapbox-google";
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean isAvailable() throws IncompatibleGooglePlayServicesLocationVersion {
            return LocationServiceUtils.getGooglePlayServicesBundled() && ProxyGoogleFusedLocationProviderClient.Companion.getAvailable$common_release() && GoogleDeviceLocationProviderKt.getGooglePlayServicesHelper().isGooglePlayServicesReady();
        }
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BaseDeviceLocationProvider.DeviceLocationProviderMode.values().length];
            try {
                iArr[BaseDeviceLocationProvider.DeviceLocationProviderMode.CALLBACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BaseDeviceLocationProvider.DeviceLocationProviderMode.PENDING_INTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BaseDeviceLocationProvider.DeviceLocationProviderMode.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.mapbox.common.location.GoogleDeviceLocationProvider$locationCallback$1] */
    public GoogleDeviceLocationProvider(Context context, LocationProviderRequest locationProviderRequest, Looper looper) {
        super(context, locationProviderRequest);
        context.getClass();
        this.looper = looper;
        this.fusedLocationProviderClient = new ProxyGoogleFusedLocationProviderClient(context);
        this.locationCallback = new LocationCallback() { // from class: com.mapbox.common.location.GoogleDeviceLocationProvider$locationCallback$1
            @Override // com.google.android.gms.location.LocationCallback
            public void onLocationResult(LocationResult locationResult) {
                locationResult.getClass();
                GoogleDeviceLocationProvider googleDeviceLocationProvider = this.this$0;
                List<android.location.Location> locations = locationResult.getLocations();
                locations.getClass();
                List<android.location.Location> list = locations;
                ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
                for (android.location.Location location : list) {
                    location.getClass();
                    arrayList.add(LocationServiceUtils.toCommonLocation(location));
                }
                googleDeviceLocationProvider.notifyLocationUpdate(arrayList);
            }
        };
        this.persistentId = Objects.hash(DeviceLocationProviderType.GOOGLE_PLAY_SERVICES.name(), String.valueOf(locationProviderRequest));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doStart$lambda$2(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Object obj) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doStart$lambda$3(PermissionStatus permissionStatus, GoogleDeviceLocationProvider googleDeviceLocationProvider, Exception exc) {
        permissionStatus.getClass();
        googleDeviceLocationProvider.getClass();
        exc.getClass();
        MapboxCommonLogger.INSTANCE.logE$common_release(TAG, "Failed to start: " + exc);
        if (permissionStatus == PermissionStatus.DENIED) {
            FeatureTelemetryCounter.create("common/location/googleProviderNoPermissions").increment();
        } else {
            FeatureTelemetryCounter.create("common/location/googleProviderFailed").increment();
        }
        googleDeviceLocationProvider.state = BaseDeviceLocationProvider.DeviceLocationProviderState.STOPPED;
        if (googleDeviceLocationProvider.getCurrentMode() == BaseDeviceLocationProvider.DeviceLocationProviderMode.CALLBACK) {
            googleDeviceLocationProvider.quitFusedLocationClientHandler();
        }
        googleDeviceLocationProvider.setCurrentMode(BaseDeviceLocationProvider.DeviceLocationProviderMode.NONE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doStop$lambda$4(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Object obj) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doStop$lambda$5(GoogleDeviceLocationProvider googleDeviceLocationProvider, Exception exc) {
        googleDeviceLocationProvider.getClass();
        exc.getClass();
        MapboxCommonLogger.INSTANCE.logE$common_release(TAG, "Failed to stop: " + exc);
        googleDeviceLocationProvider.quitFusedLocationClientHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLastLocation$lambda$8(BaseDeviceLocationProvider.LocationCancelable locationCancelable, GetLocationCallback getLocationCallback, Task task) {
        locationCancelable.getClass();
        getLocationCallback.getClass();
        task.getClass();
        locationCancelable.invokeIfNotCanceled(new GoogleDeviceLocationProvider$getLastLocation$1$1(task, locationCancelable, getLocationCallback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeLocationUpdates$lambda$11(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Object obj) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeLocationUpdates$lambda$12(Exception exc) {
        exc.getClass();
        MapboxCommonLogger.INSTANCE.logE$common_release(TAG, "Failed to remove location updates: " + exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestLocationUpdates$lambda$10(Exception exc) {
        exc.getClass();
        MapboxCommonLogger.INSTANCE.logE$common_release(TAG, "Failed to request location updates: " + exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestLocationUpdates$lambda$9(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Object obj) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(obj);
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider
    public List<Location> extractResult(Intent intent) {
        intent.getClass();
        LocationResult locationResultExtractResult = LocationResult.extractResult(intent);
        if (locationResultExtractResult == null) {
            return instance_delegatelambda0.write;
        }
        List<android.location.Location> locations = locationResultExtractResult.getLocations();
        locations.getClass();
        List<android.location.Location> list = locations;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        for (android.location.Location location : list) {
            location.getClass();
            arrayList.add(LocationServiceUtils.toCommonLocation(location));
        }
        return arrayList;
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider, com.mapbox.common.location.DeviceLocationProvider
    public void removeLocationUpdates(PendingIntent pendingIntent) {
        Task taskAddOnSuccessListener;
        pendingIntent.getClass();
        Task taskRemoveLocationUpdates = this.fusedLocationProviderClient.removeLocationUpdates(pendingIntent);
        if (taskRemoveLocationUpdates == null || (taskAddOnSuccessListener = taskRemoveLocationUpdates.addOnSuccessListener(new mn$$ExternalSyntheticLambda0(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.common.location.GoogleDeviceLocationProvider.removeLocationUpdates.1
            public final void invoke(Void r3) {
                MapboxCommonLogger.INSTANCE.logD$common_release(GoogleDeviceLocationProvider.TAG, "Location update removed");
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Void) obj);
                return createFromParcel.INSTANCE;
            }
        }, 7))) == null) {
            return;
        }
        taskAddOnSuccessListener.addOnFailureListener(new MapboxMap$$ExternalSyntheticLambda0(16));
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider, com.mapbox.common.location.DeviceLocationProvider
    public void requestLocationUpdates(PendingIntent pendingIntent) {
        LocationRequest locationRequestCreate;
        Task taskAddOnSuccessListener;
        Expected<LocationError, LocationRequest> locationRequest;
        pendingIntent.getClass();
        LocationProviderRequest request = getRequest();
        if (request == null || (locationRequest = LocationProviderSettingsExtKt.toLocationRequest(request)) == null || (locationRequestCreate = locationRequest.getValue()) == null) {
            locationRequestCreate = LocationRequest.create();
        }
        ProxyGoogleFusedLocationProviderClient proxyGoogleFusedLocationProviderClient = this.fusedLocationProviderClient;
        locationRequestCreate.getClass();
        Task taskRequestLocationUpdates = proxyGoogleFusedLocationProviderClient.requestLocationUpdates(locationRequestCreate, pendingIntent);
        if (taskRequestLocationUpdates == null || (taskAddOnSuccessListener = taskRequestLocationUpdates.addOnSuccessListener(new mn$$ExternalSyntheticLambda0(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.common.location.GoogleDeviceLocationProvider.requestLocationUpdates.1
            public final void invoke(Void r3) {
                MapboxCommonLogger.INSTANCE.logD$common_release(GoogleDeviceLocationProvider.TAG, "Location update requested");
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Void) obj);
                return createFromParcel.INSTANCE;
            }
        }, 10))) == null) {
            return;
        }
        taskAddOnSuccessListener.addOnFailureListener(new MapboxMap$$ExternalSyntheticLambda0(17));
    }

    public final void setFusedLocationProviderClient(ProxyGoogleFusedLocationProviderClient proxyGoogleFusedLocationProviderClient) {
        proxyGoogleFusedLocationProviderClient.getClass();
        this.fusedLocationProviderClient = proxyGoogleFusedLocationProviderClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void quitFusedLocationClientHandler() {
        HandlerThread handlerThread = this.fusedLocationClientHandlerThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider
    public void doStop() {
        Task taskRemoveLocationUpdates;
        Task taskAddOnSuccessListener;
        synchronized (this) {
            MapboxCommonLogger.INSTANCE.logD$common_release(TAG, "doStop() called with currentMode=" + getCurrentMode() + " currentState=" + this.state);
            int i = WhenMappings.$EnumSwitchMapping$0[getCurrentMode().ordinal()];
            if (i == 1) {
                taskRemoveLocationUpdates = this.fusedLocationProviderClient.removeLocationUpdates(this.locationCallback);
            } else if (i == 2) {
                taskRemoveLocationUpdates = this.fusedLocationProviderClient.removeLocationUpdates(getLocationUpdatePendingIntent());
            } else if (i == 3) {
                taskRemoveLocationUpdates = new FailedTask(new Exception("Cannot stop Google device location provider. Invalid mode: " + getCurrentMode()));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (taskRemoveLocationUpdates != null && (taskAddOnSuccessListener = taskRemoveLocationUpdates.addOnSuccessListener(new mn$$ExternalSyntheticLambda0(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.common.location.GoogleDeviceLocationProvider.doStop.1
                {
                    super(1);
                }

                public final void invoke(Void r5) {
                    MapboxCommonLogger mapboxCommonLogger = MapboxCommonLogger.INSTANCE;
                    mapboxCommonLogger.logD$common_release(GoogleDeviceLocationProvider.TAG, "Location cancellation succeeded state=" + GoogleDeviceLocationProvider.this.state + " currentMode=" + GoogleDeviceLocationProvider.this.getCurrentMode());
                    GoogleDeviceLocationProvider googleDeviceLocationProvider = GoogleDeviceLocationProvider.this;
                    if (googleDeviceLocationProvider.state == BaseDeviceLocationProvider.DeviceLocationProviderState.STOPPING) {
                        googleDeviceLocationProvider.quitFusedLocationClientHandler();
                        GoogleDeviceLocationProvider.this.setCurrentMode(BaseDeviceLocationProvider.DeviceLocationProviderMode.NONE);
                        GoogleDeviceLocationProvider.this.state = BaseDeviceLocationProvider.DeviceLocationProviderState.STOPPED;
                    } else {
                        mapboxCommonLogger.logD$common_release(GoogleDeviceLocationProvider.TAG, "Skipped stop state change: current state is " + GoogleDeviceLocationProvider.this.state);
                    }
                    LocationUpdatesReceiver.Companion.removeDeviceLocationProvider$common_release(GoogleDeviceLocationProvider.this.getPersistentId());
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Void) obj);
                    return createFromParcel.INSTANCE;
                }
            }, 8))) != null) {
                taskAddOnSuccessListener.addOnFailureListener(new DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5(29, this));
            }
        }
    }

    public String toString() {
        return "GoogleDeviceLocationProvider(" + getPersistentId() + "): [request: " + getRequest() + ']';
    }

    @Override // com.mapbox.common.location.LocationProvider
    public Cancelable getLastLocation(GetLocationCallback getLocationCallback) {
        getLocationCallback.getClass();
        BaseDeviceLocationProvider.LocationCancelable locationCancelable = new BaseDeviceLocationProvider.LocationCancelable();
        Task lastLocation = this.fusedLocationProviderClient.getLastLocation();
        if (lastLocation != null) {
            lastLocation.addOnCompleteListener(new GoogleDeviceLocationProvider$$ExternalSyntheticLambda5(locationCancelable, getLocationCallback));
        }
        return locationCancelable;
    }

    private final Looper getCallbackLooper() {
        Looper looper = this.looper;
        if (looper != null) {
            return looper;
        }
        HandlerThread handlerThread = new HandlerThread("fusedLocationClientHandlerThread");
        handlerThread.start();
        this.fusedLocationClientHandlerThread = handlerThread;
        Looper looper2 = handlerThread.getLooper();
        looper2.getClass();
        return looper2;
    }
}
