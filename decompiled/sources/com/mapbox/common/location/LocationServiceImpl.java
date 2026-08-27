package com.mapbox.common.location;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.LocationManager;
import android.os.Build;
import android.os.Looper;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.bindgen.Value;
import com.mapbox.common.MapboxCommonLogger;
import com.mapbox.common.MapboxSDKCommon;
import com.mapbox.common.SettingsService;
import com.mapbox.common.SettingsServiceFactory;
import com.mapbox.common.SettingsServiceStorageType;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.IconCompatParcelizer;
import o.focusSearchULY8qGw;
import o.getCieXyz;
import o.onViewAttachedToWindowlambda0;
import o.removeNodeAtDepth;
import o.setCarryoverInAppMessage;

/* JADX INFO: loaded from: classes2.dex */
public final class LocationServiceImpl implements LocationService {
    public static final String ERROR_MESSAGE_FAILED_TO_GET_LAST_LOCATION = "failed to get last known location";
    public static final String ERROR_MESSAGE_GOOGLE_PLAY_NOT_AVAILABLE = "Google Play Location Services are not available on this device";
    public static final String ERROR_MESSAGE_LAST_LOCATION_NOT_AVAILABLE = "no last known location available";
    public static final String TAG = "LocationService";
    private final Context context;
    private final LocationManager locationManager;
    private LocationModeChangedBroadcastReceiver locationModeChangedReceiver;
    private CopyOnWriteArrayList<onViewAttachedToWindowlambda0> locationProviders;
    private final HashSet<LocationServiceObserver> observers;
    private DeviceLocationProviderFactory userDefinedFactory;
    public static final Companion Companion = new Companion(null);

    @SuppressLint
    private static final LocationServiceImpl INSTANCE = new LocationServiceImpl(MapboxSDKCommon.INSTANCE.getContext());

    public final class LocationModeChangedBroadcastReceiver extends BroadcastReceiver {
        public LocationModeChangedBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (this) {
                if (intent != null) {
                    String action = intent.getAction();
                    if (action != null) {
                        LocationServiceImpl locationServiceImpl = LocationServiceImpl.this;
                        if (action.hashCode() == -511271086 && action.equals("android.location.MODE_CHANGED")) {
                            Iterator it = locationServiceImpl.observers.iterator();
                            while (it.hasNext()) {
                                ((LocationServiceObserver) it.next()).onAvailabilityChanged(locationServiceImpl.isAvailable());
                            }
                        }
                    }
                }
            }
        }
    }

    public final CopyOnWriteArrayList<onViewAttachedToWindowlambda0> getLocationProviders$common_release() {
        return this.locationProviders;
    }

    @Override // com.mapbox.common.location.LocationService
    public void registerObserver(LocationServiceObserver locationServiceObserver) {
        synchronized (this) {
            locationServiceObserver.getClass();
            this.observers.add(locationServiceObserver);
        }
    }

    @Override // com.mapbox.common.location.LocationService
    public void setUserDefinedDeviceLocationProviderFactory(DeviceLocationProviderFactory deviceLocationProviderFactory) {
        synchronized (this) {
            this.userDefinedFactory = deviceLocationProviderFactory;
            SettingsService settingsServiceFactory = SettingsServiceFactory.getInstance(SettingsServiceStorageType.NON_PERSISTENT);
            Long lParcelableVolumeInfo = setCarryoverInAppMessage.ParcelableVolumeInfo(String.valueOf(settingsServiceFactory.get("com.mapbox.common.internal.location_service.userdefinedfactory_changed", Value.valueOf(0L)).getValue()));
            settingsServiceFactory.set("com.mapbox.common.internal.location_service.userdefinedfactory_changed", Value.valueOf((lParcelableVolumeInfo != null ? lParcelableVolumeInfo.longValue() : 0L) + 1));
        }
    }

    @Override // com.mapbox.common.location.LocationService
    public void unregisterObserver(LocationServiceObserver locationServiceObserver) {
        synchronized (this) {
            locationServiceObserver.getClass();
            this.observers.remove(locationServiceObserver);
        }
    }

    public static final LocationService createPlatformLocationService() {
        return Companion.createPlatformLocationService();
    }

    private final void registerModeChangedReceiver(Context context) {
        this.locationModeChangedReceiver = new LocationModeChangedBroadcastReceiver();
        IntentFilter intentFilter = new IntentFilter("android.location.MODE_CHANGED");
        int i = Build.VERSION.SDK_INT;
        LocationModeChangedBroadcastReceiver locationModeChangedBroadcastReceiver = this.locationModeChangedReceiver;
        if (i >= 31) {
            if (locationModeChangedBroadcastReceiver != null) {
                context.registerReceiver(locationModeChangedBroadcastReceiver, intentFilter, 2);
                return;
            } else {
                removeNodeAtDepth.serializer("locationModeChangedReceiver");
                throw null;
            }
        }
        if (locationModeChangedBroadcastReceiver != null) {
            context.registerReceiver(locationModeChangedBroadcastReceiver, intentFilter);
        } else {
            removeNodeAtDepth.serializer("locationModeChangedReceiver");
            throw null;
        }
    }

    @Override // com.mapbox.common.location.LocationService
    public AccuracyAuthorization getAccuracyAuthorization() {
        Context context = this.context;
        context.getClass();
        return LocationServiceUtils.getAccuracyAuthorization(context);
    }

    @Override // com.mapbox.common.location.LocationService
    public PermissionStatus getPermissionStatus() {
        Context context = this.context;
        context.getClass();
        return LocationServiceUtils.getPermissionStatus(context);
    }

    @Override // com.mapbox.common.location.LocationService
    public boolean isAvailable() {
        LocationManager locationManager = this.locationManager;
        int i = focusSearchULY8qGw.read;
        return locationManager.isLocationEnabled();
    }

    public final void resetLocationServices$common_release() {
        this.locationProviders.clear();
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LocationService createPlatformLocationService() {
            return LocationServiceImpl.INSTANCE;
        }

        private Companion() {
        }
    }

    public static abstract class DeviceLocationProviderParams {

        public static final class Custom extends DeviceLocationProviderParams {
            private final WeakReference<DeviceLocationProviderFactory> factory;
            private final LocationProviderRequest request;

            public final WeakReference<DeviceLocationProviderFactory> component1() {
                return this.factory;
            }

            public final LocationProviderRequest component2() {
                return this.request;
            }

            public final WeakReference<DeviceLocationProviderFactory> getFactory() {
                return this.factory;
            }

            public final LocationProviderRequest getRequest() {
                return this.request;
            }

            public int hashCode() {
                int iHashCode = this.factory.hashCode();
                LocationProviderRequest locationProviderRequest = this.request;
                return (iHashCode * 31) + (locationProviderRequest == null ? 0 : locationProviderRequest.hashCode());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Custom(WeakReference<DeviceLocationProviderFactory> weakReference, LocationProviderRequest locationProviderRequest) {
                super(null);
                weakReference.getClass();
                this.factory = weakReference;
                this.request = locationProviderRequest;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Custom copy$default(Custom custom, WeakReference weakReference, LocationProviderRequest locationProviderRequest, int i, Object obj) {
                if ((i & 1) != 0) {
                    weakReference = custom.factory;
                }
                if ((i & 2) != 0) {
                    locationProviderRequest = custom.request;
                }
                return custom.copy(weakReference, locationProviderRequest);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Custom)) {
                    return false;
                }
                Custom custom = (Custom) obj;
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.factory, custom.factory}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.request, custom.request}, getCieXyz.write())).booleanValue();
            }

            public String toString() {
                return "Custom(factory=" + this.factory + ", request=" + this.request + ')';
            }

            public final Custom copy(WeakReference<DeviceLocationProviderFactory> weakReference, LocationProviderRequest locationProviderRequest) {
                weakReference.getClass();
                return new Custom(weakReference, locationProviderRequest);
            }
        }

        public static final class Default extends DeviceLocationProviderParams {
            private final boolean customLooper;
            private final String name;
            private final LocationProviderRequest request;
            private final DeviceLocationProviderType type;

            public final DeviceLocationProviderType component1() {
                return this.type;
            }

            public final LocationProviderRequest component2() {
                return this.request;
            }

            public final String component3() {
                return this.name;
            }

            public final boolean component4() {
                return this.customLooper;
            }

            public final boolean getCustomLooper() {
                return this.customLooper;
            }

            public final String getName() {
                return this.name;
            }

            public final LocationProviderRequest getRequest() {
                return this.request;
            }

            public final DeviceLocationProviderType getType() {
                return this.type;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v7, types: [int] */
            /* JADX WARN: Type inference failed for: r3v2, types: [int] */
            /* JADX WARN: Type inference failed for: r3v3 */
            /* JADX WARN: Type inference failed for: r3v4 */
            public int hashCode() {
                int iHashCode = this.type.hashCode();
                LocationProviderRequest locationProviderRequest = this.request;
                int iHashCode2 = locationProviderRequest == null ? 0 : locationProviderRequest.hashCode();
                String str = this.name;
                int iHashCode3 = str != null ? str.hashCode() : 0;
                boolean z = this.customLooper;
                ?? r3 = z;
                if (z) {
                    r3 = 1;
                }
                return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + r3;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Default(DeviceLocationProviderType deviceLocationProviderType, LocationProviderRequest locationProviderRequest, String str, boolean z) {
                super(null);
                deviceLocationProviderType.getClass();
                this.type = deviceLocationProviderType;
                this.request = locationProviderRequest;
                this.name = str;
                this.customLooper = z;
            }

            public static /* synthetic */ Default copy$default(Default r0, DeviceLocationProviderType deviceLocationProviderType, LocationProviderRequest locationProviderRequest, String str, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    deviceLocationProviderType = r0.type;
                }
                if ((i & 2) != 0) {
                    locationProviderRequest = r0.request;
                }
                if ((i & 4) != 0) {
                    str = r0.name;
                }
                if ((i & 8) != 0) {
                    z = r0.customLooper;
                }
                return r0.copy(deviceLocationProviderType, locationProviderRequest, str, z);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Default)) {
                    return false;
                }
                Default r1 = (Default) obj;
                if (this.type != r1.type) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.request, r1.request}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, r1.name}, getCieXyz.write())).booleanValue() && this.customLooper == r1.customLooper;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Default(type=");
                sb.append(this.type);
                sb.append(", request=");
                sb.append(this.request);
                sb.append(", name=");
                sb.append(this.name);
                sb.append(", customLooper=");
                return IconCompatParcelizer.IconCompatParcelizer(sb, this.customLooper, ')');
            }

            public final Default copy(DeviceLocationProviderType deviceLocationProviderType, LocationProviderRequest locationProviderRequest, String str, boolean z) {
                deviceLocationProviderType.getClass();
                return new Default(deviceLocationProviderType, locationProviderRequest, str, z);
            }
        }

        public /* synthetic */ DeviceLocationProviderParams(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private DeviceLocationProviderParams() {
        }
    }

    private LocationServiceImpl(Context context) {
        this.context = context.getApplicationContext();
        Object systemService = context.getSystemService("location");
        systemService.getClass();
        this.locationManager = (LocationManager) systemService;
        this.observers = new HashSet<>();
        this.locationProviders = new CopyOnWriteArrayList<>();
        registerModeChangedReceiver(context);
    }

    public final void setLocationProviders$common_release(CopyOnWriteArrayList<onViewAttachedToWindowlambda0> copyOnWriteArrayList) {
        copyOnWriteArrayList.getClass();
        this.locationProviders = copyOnWriteArrayList;
    }

    @Override // com.mapbox.common.location.LocationService
    public Expected<LocationError, DeviceLocationProvider> getDeviceLocationProvider(ExtendedLocationProviderParameters extendedLocationProviderParameters, LocationProviderRequest locationProviderRequest) throws IncompatibleGooglePlayServicesLocationVersion {
        boolean zIsAvailable;
        extendedLocationProviderParameters.getClass();
        try {
            zIsAvailable = GoogleDeviceLocationProvider.Companion.isAvailable();
        } catch (IncompatibleGooglePlayServicesLocationVersion unused) {
            zIsAvailable = false;
        }
        DeviceLocationProviderType deviceLocationProviderType = extendedLocationProviderParameters.getDeviceLocationProviderType();
        if (deviceLocationProviderType == null) {
            deviceLocationProviderType = DeviceLocationProviderType.BEST;
        }
        DeviceLocationProviderType deviceLocationProviderType2 = deviceLocationProviderType;
        deviceLocationProviderType2.getClass();
        Boolean allowUserDefined = extendedLocationProviderParameters.getAllowUserDefined();
        if (allowUserDefined == null) {
            allowUserDefined = Boolean.TRUE;
        }
        boolean zBooleanValue = allowUserDefined.booleanValue();
        String locationProviderName = deviceLocationProviderType2 == DeviceLocationProviderType.ANDROID ? extendedLocationProviderParameters.getLocationProviderName() : null;
        Looper looper = extendedLocationProviderParameters.getLooper();
        CopyOnWriteArrayList<onViewAttachedToWindowlambda0> copyOnWriteArrayList = this.locationProviders;
        ArrayList arrayList = new ArrayList();
        for (Object obj : copyOnWriteArrayList) {
            if (((WeakReference) ((onViewAttachedToWindowlambda0) obj).write).get() != null) {
                arrayList.add(obj);
            }
        }
        CopyOnWriteArrayList<onViewAttachedToWindowlambda0> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>(arrayList);
        this.locationProviders = copyOnWriteArrayList2;
        for (onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 : copyOnWriteArrayList2) {
            DeviceLocationProvider deviceLocationProvider = (DeviceLocationProvider) ((WeakReference) onviewattachedtowindowlambda0.write).get();
            if (deviceLocationProvider != null) {
                if (isLocationProviderRequestCompatible((DeviceLocationProviderParams) onviewattachedtowindowlambda0.serializer, deviceLocationProviderType2, locationProviderRequest, zIsAvailable, zBooleanValue, locationProviderName, looper != null)) {
                    Expected<LocationError, DeviceLocationProvider> expectedCreateValue = ExpectedFactory.createValue(deviceLocationProvider);
                    expectedCreateValue.getClass();
                    return expectedCreateValue;
                }
            }
        }
        DeviceLocationProviderFactory deviceLocationProviderFactory = this.userDefinedFactory;
        if (deviceLocationProviderFactory != null && zBooleanValue) {
            Expected<LocationError, DeviceLocationProvider> expectedBuild = deviceLocationProviderFactory.build(locationProviderRequest);
            expectedBuild.getClass();
            if (expectedBuild.isValue()) {
                this.locationProviders.add(new onViewAttachedToWindowlambda0(new DeviceLocationProviderParams.Custom(new WeakReference(deviceLocationProviderFactory), locationProviderRequest), new WeakReference(expectedBuild.getValue())));
            }
            return expectedBuild;
        }
        Context context = this.context;
        context.getClass();
        Expected<LocationError, DeviceLocationProvider> deviceLocationProvider2 = getDeviceLocationProvider(context, deviceLocationProviderType2, locationProviderRequest, locationProviderName, looper);
        if (deviceLocationProvider2.isValue()) {
            this.locationProviders.add(new onViewAttachedToWindowlambda0(new DeviceLocationProviderParams.Default(deviceLocationProvider2.getValue() instanceof GoogleDeviceLocationProvider ? DeviceLocationProviderType.GOOGLE_PLAY_SERVICES : DeviceLocationProviderType.ANDROID, locationProviderRequest, locationProviderName, looper != null), new WeakReference(deviceLocationProvider2.getValue())));
        }
        return deviceLocationProvider2;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00a8  */
    private final boolean isLocationProviderRequestCompatible(DeviceLocationProviderParams deviceLocationProviderParams, DeviceLocationProviderType deviceLocationProviderType, LocationProviderRequest locationProviderRequest, boolean z, boolean z2, String str, boolean z3) {
        boolean z4;
        if (deviceLocationProviderParams instanceof DeviceLocationProviderParams.Custom) {
            if (!z2) {
                return false;
            }
            DeviceLocationProviderParams.Custom custom = (DeviceLocationProviderParams.Custom) deviceLocationProviderParams;
            DeviceLocationProviderFactory deviceLocationProviderFactory = custom.getFactory().get();
            DeviceLocationProviderFactory deviceLocationProviderFactory2 = this.userDefinedFactory;
            if (deviceLocationProviderFactory2 == null || deviceLocationProviderFactory == null || !deviceLocationProviderFactory.equals(deviceLocationProviderFactory2)) {
                return false;
            }
            if (locationProviderRequest == null) {
                return true;
            }
            return locationProviderRequest.equals(custom.getRequest());
        }
        if (!(deviceLocationProviderParams instanceof DeviceLocationProviderParams.Default)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return false;
        }
        if (z2 && this.userDefinedFactory != null) {
            return false;
        }
        DeviceLocationProviderParams.Default r1 = (DeviceLocationProviderParams.Default) deviceLocationProviderParams;
        if (deviceLocationProviderType != r1.getType()) {
            DeviceLocationProviderType type = r1.getType();
            DeviceLocationProviderType deviceLocationProviderType2 = DeviceLocationProviderType.GOOGLE_PLAY_SERVICES;
            if (type == deviceLocationProviderType2 && deviceLocationProviderType == DeviceLocationProviderType.ANDROID) {
                return false;
            }
            DeviceLocationProviderType type2 = r1.getType();
            DeviceLocationProviderType deviceLocationProviderType3 = DeviceLocationProviderType.ANDROID;
            if (type2 == deviceLocationProviderType3 && deviceLocationProviderType == deviceLocationProviderType2) {
                return false;
            }
            if (r1.getType() == deviceLocationProviderType3 && deviceLocationProviderType == DeviceLocationProviderType.BEST && z) {
                return false;
            }
        }
        if (!z3 && !r1.getCustomLooper()) {
            if (str != null) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{r1.getName(), str}, getCieXyz.write())).booleanValue()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            } else {
                z4 = true;
            }
            if (locationProviderRequest == null && z4) {
                return true;
            }
            if (Objects.equals(locationProviderRequest, r1.getRequest()) && z4) {
                return true;
            }
        }
        return false;
    }

    @Override // com.mapbox.common.location.LocationService
    public Expected<LocationError, DeviceLocationProvider> getDeviceLocationProvider(DeviceLocationProviderType deviceLocationProviderType, LocationProviderRequest locationProviderRequest, boolean z) {
        deviceLocationProviderType.getClass();
        ExtendedLocationProviderParameters extendedLocationProviderParametersBuild = new ExtendedLocationProviderParameters.Builder().deviceLocationProviderType(deviceLocationProviderType).allowUserDefined(Boolean.valueOf(z)).build();
        extendedLocationProviderParametersBuild.getClass();
        return getDeviceLocationProvider(extendedLocationProviderParametersBuild, locationProviderRequest);
    }

    @Override // com.mapbox.common.location.LocationService
    public Expected<LocationError, DeviceLocationProvider> getDeviceLocationProvider(LocationProviderRequest locationProviderRequest) {
        return LocationService.DefaultImpls.getDeviceLocationProvider$default(this, DeviceLocationProviderType.BEST, locationProviderRequest, false, 4, null);
    }

    private final Expected<LocationError, DeviceLocationProvider> getDeviceLocationProvider(Context context, DeviceLocationProviderType deviceLocationProviderType, LocationProviderRequest locationProviderRequest, String str, Looper looper) {
        boolean zIsAvailable;
        try {
            zIsAvailable = GoogleDeviceLocationProvider.Companion.isAvailable();
        } catch (IncompatibleGooglePlayServicesLocationVersion unused) {
            MapboxCommonLogger.INSTANCE.logW$common_release(TAG, "Skipping incompatible Google Play Services location version");
            zIsAvailable = false;
        }
        if (deviceLocationProviderType == null) {
            deviceLocationProviderType = DeviceLocationProviderType.BEST;
        }
        DeviceLocationProviderType deviceLocationProviderType2 = DeviceLocationProviderType.BEST;
        if ((deviceLocationProviderType == deviceLocationProviderType2 || deviceLocationProviderType == DeviceLocationProviderType.GOOGLE_PLAY_SERVICES) && zIsAvailable) {
            Expected<LocationError, DeviceLocationProvider> expectedCreateValue = ExpectedFactory.createValue(new GoogleDeviceLocationProvider(context, locationProviderRequest, looper));
            expectedCreateValue.getClass();
            return expectedCreateValue;
        }
        if (deviceLocationProviderType != deviceLocationProviderType2 && deviceLocationProviderType != DeviceLocationProviderType.ANDROID) {
            LocationError locationError = new LocationError(LocationErrorCode.NOT_AVAILABLE, ERROR_MESSAGE_GOOGLE_PLAY_NOT_AVAILABLE);
            MapboxCommonLogger.INSTANCE.logE$common_release(TAG, "Failed to get device location provider: " + locationError.getMessage());
            Expected<LocationError, DeviceLocationProvider> expectedCreateError = ExpectedFactory.createError(locationError);
            expectedCreateError.getClass();
            return expectedCreateError;
        }
        Expected<LocationError, DeviceLocationProvider> expectedCreateValue2 = ExpectedFactory.createValue(new AndroidDeviceLocationProvider(context, locationProviderRequest, str, looper));
        expectedCreateValue2.getClass();
        return expectedCreateValue2;
    }
}
