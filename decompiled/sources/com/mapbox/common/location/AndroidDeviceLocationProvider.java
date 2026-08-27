package com.mapbox.common.location;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Criteria;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import androidx.sqlite.SQLite;
import bo.app.d$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.Cancelable;
import com.mapbox.common.MapboxCommonLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.MediaSessionCompatQueueItem;
import o.createFromParcel;
import o.getCieXyz;
import o.getQueryParameterslambda2;
import o.instance_delegatelambda0;
import o.isAdapterPositionOnScreen;
import o.onItemDismisslambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidDeviceLocationProvider extends BaseDeviceLocationProvider {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final String TAG = "AndroidDeviceLocationProvider";
    private final AndroidDeviceLocationProvider$locationListener$1 locationListener;
    private final onViewDetachedFromWindowlambda1 locationManager$delegate;
    private HandlerThread locationManagerHandlerThread;
    private final String locationProviderName;
    private final Looper looper;
    private final int persistentId;
    private final String providerName;

    public static final class LocationRequestAttributes {
        private final Criteria criteria;
        private final float minDisplacement;
        private final long minInterval;

        public final Criteria component1() {
            return this.criteria;
        }

        public final long component2() {
            return this.minInterval;
        }

        public final float component3() {
            return this.minDisplacement;
        }

        public final Criteria getCriteria() {
            return this.criteria;
        }

        public final float getMinDisplacement() {
            return this.minDisplacement;
        }

        public final long getMinInterval() {
            return this.minInterval;
        }

        public int hashCode() {
            return Float.hashCode(this.minDisplacement) + d$$ExternalSyntheticOutline0.m(this.criteria.hashCode() * 31, 31, this.minInterval);
        }

        public LocationRequestAttributes(Criteria criteria, long j, float f) {
            criteria.getClass();
            this.criteria = criteria;
            this.minInterval = j;
            this.minDisplacement = f;
        }

        public static /* synthetic */ LocationRequestAttributes copy$default(LocationRequestAttributes locationRequestAttributes, Criteria criteria, long j, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                criteria = locationRequestAttributes.criteria;
            }
            if ((i & 2) != 0) {
                j = locationRequestAttributes.minInterval;
            }
            if ((i & 4) != 0) {
                f = locationRequestAttributes.minDisplacement;
            }
            return locationRequestAttributes.copy(criteria, j, f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocationRequestAttributes)) {
                return false;
            }
            LocationRequestAttributes locationRequestAttributes = (LocationRequestAttributes) obj;
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.criteria, locationRequestAttributes.criteria}, getCieXyz.write())).booleanValue() && this.minInterval == locationRequestAttributes.minInterval && Float.compare(this.minDisplacement, locationRequestAttributes.minDisplacement) == 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("LocationRequestAttributes(criteria=");
            sb.append(this.criteria);
            sb.append(", minInterval=");
            sb.append(this.minInterval);
            sb.append(", minDisplacement=");
            return MediaSessionCompatQueueItem.serializer(sb, this.minDisplacement, ')');
        }

        public final LocationRequestAttributes copy(Criteria criteria, long j, float f) {
            criteria.getClass();
            return new LocationRequestAttributes(criteria, j, f);
        }
    }

    public static /* synthetic */ void getPersistentId$annotations() {
    }

    public final String getLocationProviderName() {
        return this.locationProviderName;
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider
    public int getPersistentId() {
        return this.persistentId;
    }

    private final LocationManager getLocationManager() {
        return (LocationManager) this.locationManager$delegate.MediaSessionCompatResultReceiverWrapper();
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider
    @SuppressLint
    public void doStop() {
        synchronized (this) {
            int i = WhenMappings.$EnumSwitchMapping$0[getCurrentMode().ordinal()];
            if (i == 1) {
                getLocationManager().removeUpdates(this.locationListener);
                HandlerThread handlerThread = this.locationManagerHandlerThread;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                }
            } else if (i == 2) {
                getLocationManager().removeUpdates(getLocationUpdatePendingIntent());
                LocationUpdatesReceiver.Companion.removeDeviceLocationProvider$common_release(getPersistentId());
            } else if (i == 3) {
                MapboxCommonLogger.INSTANCE.logE$common_release(TAG, "Failed to stop: Cannot stop Android device location provider. Invalid mode: " + getCurrentMode());
            }
            this.state = BaseDeviceLocationProvider.DeviceLocationProviderState.STOPPED;
        }
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider, com.mapbox.common.location.DeviceLocationProvider
    public String getName() {
        return "mapbox-android";
    }

    public static final class Companion {
        public static int IconCompatParcelizer;
        public static int serializer;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static int RemoteActionCompatParcelizer() {
            int i = IconCompatParcelizer;
            int i2 = i % 9564161;
            IconCompatParcelizer = i + 1;
            if (i2 != 0) {
                return serializer;
            }
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            serializer = startUptimeMillis;
            return startUptimeMillis;
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
    /* JADX WARN: Type inference failed for: r2v2, types: [com.mapbox.common.location.AndroidDeviceLocationProvider$locationListener$1] */
    public AndroidDeviceLocationProvider(final Context context, LocationProviderRequest locationProviderRequest, String str, Looper looper) {
        super(context, locationProviderRequest);
        context.getClass();
        this.locationProviderName = str;
        this.looper = looper;
        if (str == null) {
            str = null;
            if ((locationProviderRequest != null ? locationProviderRequest.getAccuracy() : null) == AccuracyLevel.PASSIVE) {
                str = "passive";
            }
        }
        this.providerName = str;
        this.locationManager$delegate = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.common.location.AndroidDeviceLocationProvider$locationManager$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final LocationManager invoke() {
                Object systemService = context.getSystemService("location");
                systemService.getClass();
                return (LocationManager) systemService;
            }
        });
        this.locationListener = new LocationListener() { // from class: com.mapbox.common.location.AndroidDeviceLocationProvider$locationListener$1
            @Override // android.location.LocationListener
            public void onProviderDisabled(String str2) {
                str2.getClass();
            }

            @Override // android.location.LocationListener
            public void onProviderEnabled(String str2) {
                str2.getClass();
            }

            @Override // android.location.LocationListener
            @onItemDismisslambda0
            public void onStatusChanged(String str2, int i, Bundle bundle) {
            }

            @Override // android.location.LocationListener
            public void onLocationChanged(android.location.Location location) {
                location.getClass();
                this.this$0.notifyLocationUpdate(SQLite.write(LocationServiceUtils.toCommonLocation(location)));
            }
        };
        this.persistentId = Objects.hash(DeviceLocationProviderType.ANDROID.name(), str, String.valueOf(locationProviderRequest));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLastLocation$lambda$4(BaseDeviceLocationProvider.LocationCancelable locationCancelable, final GetLocationCallback getLocationCallback, final android.location.Location location) {
        locationCancelable.getClass();
        getLocationCallback.getClass();
        locationCancelable.invokeIfNotCanceled(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.common.location.AndroidDeviceLocationProvider$getLastLocation$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m4558invoke() {
                getLocationCallback.run(LocationServiceUtils.toCommonLocation(location));
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m4558invoke();
                return createFromParcel.INSTANCE;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLastLocation$lambda$5(BaseDeviceLocationProvider.LocationCancelable locationCancelable, final GetLocationCallback getLocationCallback) {
        locationCancelable.getClass();
        getLocationCallback.getClass();
        locationCancelable.invokeIfNotCanceled(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.common.location.AndroidDeviceLocationProvider$getLastLocation$2$1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m4559invoke() {
                getLocationCallback.run(null);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m4559invoke();
                return createFromParcel.INSTANCE;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLastLocation$lambda$6(BaseDeviceLocationProvider.LocationCancelable locationCancelable, final GetLocationCallback getLocationCallback) {
        locationCancelable.getClass();
        getLocationCallback.getClass();
        locationCancelable.invokeIfNotCanceled(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.common.location.AndroidDeviceLocationProvider$getLastLocation$3$1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m4560invoke() {
                getLocationCallback.run(null);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m4560invoke();
                return createFromParcel.INSTANCE;
            }
        });
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider, com.mapbox.common.location.DeviceLocationProvider
    public void removeLocationUpdates(PendingIntent pendingIntent) {
        pendingIntent.getClass();
        getLocationManager().removeUpdates(pendingIntent);
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider, com.mapbox.common.location.DeviceLocationProvider
    @SuppressLint
    public void requestLocationUpdates(PendingIntent pendingIntent) {
        String bestProvider;
        pendingIntent.getClass();
        LocationRequestAttributes locationRequestAttributesExtractAttributesFromRequest = extractAttributesFromRequest();
        Criteria criteriaComponent1 = locationRequestAttributesExtractAttributesFromRequest.component1();
        long jComponent2 = locationRequestAttributesExtractAttributesFromRequest.component2();
        float fComponent3 = locationRequestAttributesExtractAttributesFromRequest.component3();
        if (criteriaComponent1 != null) {
            bestProvider = getLocationManager().getBestProvider(criteriaComponent1, true);
            if (bestProvider == null) {
                MapboxCommonLogger.INSTANCE.logW$common_release(TAG, "Provider not found for criteria [" + criteriaComponent1 + "]. Using PASSIVE_PROVIDER");
                bestProvider = "passive";
            }
        } else {
            bestProvider = "passive";
        }
        getLocationManager().requestLocationUpdates(bestProvider, jComponent2, fComponent3, pendingIntent);
    }

    @Override // com.mapbox.common.location.LocationProvider
    @SuppressLint
    public Cancelable getLastLocation(GetLocationCallback getLocationCallback) {
        Object obj;
        getLocationCallback.getClass();
        Handler handler = new Handler(Looper.getMainLooper());
        BaseDeviceLocationProvider.LocationCancelable locationCancelable = new BaseDeviceLocationProvider.LocationCancelable();
        try {
            List<String> allProviders = getLocationManager().getAllProviders();
            allProviders.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = allProviders.iterator();
            while (it.hasNext()) {
                android.location.Location lastKnownLocation = getLocationManager().getLastKnownLocation((String) it.next());
                if (lastKnownLocation != null) {
                    arrayList.add(lastKnownLocation);
                }
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                if (it2.hasNext()) {
                    long elapsedRealtimeNanos = ((android.location.Location) next).getElapsedRealtimeNanos() / 1000000;
                    do {
                        Object next2 = it2.next();
                        long elapsedRealtimeNanos2 = ((android.location.Location) next2).getElapsedRealtimeNanos() / 1000000;
                        if (elapsedRealtimeNanos < elapsedRealtimeNanos2) {
                            next = next2;
                            elapsedRealtimeNanos = elapsedRealtimeNanos2;
                        }
                    } while (it2.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            android.location.Location location = (android.location.Location) obj;
            int i = 0;
            if (location != null) {
                handler.post(new AndroidDeviceLocationProvider$$ExternalSyntheticLambda0(locationCancelable, getLocationCallback, location, i));
                return locationCancelable;
            }
            LocationError locationError = new LocationError(LocationErrorCode.NOT_AVAILABLE, LocationServiceImpl.ERROR_MESSAGE_LAST_LOCATION_NOT_AVAILABLE);
            MapboxCommonLogger.INSTANCE.logW$common_release(TAG, "failed to get last known location: " + locationError.getMessage());
            handler.post(new AndroidDeviceLocationProvider$$ExternalSyntheticLambda1(locationCancelable, getLocationCallback, i));
            return locationCancelable;
        } catch (Exception e) {
            MapboxCommonLogger.INSTANCE.logW$common_release(TAG, "failed to get last known location: " + e.getMessage());
            handler.post(new AndroidDeviceLocationProvider$$ExternalSyntheticLambda1(locationCancelable, getLocationCallback, 2));
            return locationCancelable;
        }
    }

    public String toString() {
        return "AndroidDeviceLocationProvider(" + getPersistentId() + "): [providerName: " + this.locationProviderName + ", request: " + getRequest() + ']';
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider
    public List<Location> extractResult(Intent intent) {
        Bundle extras;
        intent.getClass();
        if (!intent.hasExtra("location") || (extras = intent.getExtras()) == null) {
            return instance_delegatelambda0.write;
        }
        Object obj = extras.get("location");
        obj.getClass();
        return (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{LocationServiceUtils.toCommonLocation((android.location.Location) obj)}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
    }

    private final LocationRequestAttributes extractAttributesFromRequest() {
        Criteria criteria;
        Long minimumInterval;
        Float fValueOf;
        IntervalSettings interval;
        Expected<LocationError, Criteria> criteria2;
        LocationProviderRequest request = getRequest();
        if (request == null || (criteria2 = LocationProviderSettingsExtKt.toCriteria(request)) == null || (criteria = criteria2.getValue()) == null) {
            criteria = new Criteria();
        }
        LocationProviderRequest request2 = getRequest();
        if (request2 == null || (interval = request2.getInterval()) == null || (minimumInterval = interval.getMinimumInterval()) == null) {
            minimumInterval = 1000L;
        }
        long jLongValue = minimumInterval.longValue();
        LocationProviderRequest request3 = getRequest();
        if (request3 == null || (fValueOf = request3.getDisplacement()) == null) {
            fValueOf = Float.valueOf(0.0f);
        }
        return new LocationRequestAttributes(criteria, jLongValue, fValueOf.floatValue());
    }

    @Override // com.mapbox.common.location.BaseDeviceLocationProvider
    @SuppressLint
    public void doStart() {
        PermissionStatus permissionStatus;
        synchronized (this) {
            LocationRequestAttributes locationRequestAttributesExtractAttributesFromRequest = extractAttributesFromRequest();
            Criteria criteriaComponent1 = locationRequestAttributesExtractAttributesFromRequest.component1();
            long jComponent2 = locationRequestAttributesExtractAttributesFromRequest.component2();
            float fComponent3 = locationRequestAttributesExtractAttributesFromRequest.component3();
            PermissionStatus permissionStatus2 = LocationServiceUtils.getPermissionStatus(getContext());
            MapboxCommonLogger mapboxCommonLogger = MapboxCommonLogger.INSTANCE;
            mapboxCommonLogger.logD$common_release(TAG, "Permission status: " + permissionStatus2);
            if (SQLite.read(PermissionStatus.FOREGROUND, PermissionStatus.GRANTED).contains(permissionStatus2) || (permissionStatus2 == (permissionStatus = PermissionStatus.BACKGROUND) && this.looper != null)) {
                setCurrentMode(BaseDeviceLocationProvider.DeviceLocationProviderMode.CALLBACK);
                if (this.providerName != null) {
                    getLocationManager().requestLocationUpdates(this.providerName, jComponent2, fComponent3, this.locationListener, getCallbackLooper());
                } else {
                    getLocationManager().requestLocationUpdates(jComponent2, fComponent3, criteriaComponent1, this.locationListener, getCallbackLooper());
                }
            } else if (permissionStatus2 == permissionStatus) {
                setCurrentMode(BaseDeviceLocationProvider.DeviceLocationProviderMode.PENDING_INTENT);
                if (this.providerName != null) {
                    getLocationManager().requestLocationUpdates(this.providerName, jComponent2, fComponent3, getLocationUpdatePendingIntent());
                } else {
                    getLocationManager().requestLocationUpdates(jComponent2, fComponent3, criteriaComponent1, getLocationUpdatePendingIntent());
                }
            } else {
                this.state = BaseDeviceLocationProvider.DeviceLocationProviderState.STOPPED;
                return;
            }
            this.state = BaseDeviceLocationProvider.DeviceLocationProviderState.STARTED;
            mapboxCommonLogger.logD$common_release(TAG, "Started location updates with mode " + getCurrentMode());
            if (permissionStatus2 == PermissionStatus.BACKGROUND && this.looper == null) {
                LocationUpdatesReceiver.Companion.addDeviceLocationProvider$common_release(getPersistentId(), this);
            }
        }
    }

    private final Looper getCallbackLooper() {
        Looper looper = this.looper;
        if (looper != null) {
            return looper;
        }
        HandlerThread handlerThread = new HandlerThread("locationManagerHandlerThread");
        handlerThread.start();
        this.locationManagerHandlerThread = handlerThread;
        Looper looper2 = handlerThread.getLooper();
        looper2.getClass();
        return looper2;
    }
}
