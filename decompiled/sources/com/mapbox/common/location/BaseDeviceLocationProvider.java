package com.mapbox.common.location;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Looper;
import com.mapbox.common.Cancelable;
import com.mapbox.common.MapboxCommonLogger;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.createFromParcel;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onItemDismiss;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseDeviceLocationProvider extends BaseLocationProvider implements DeviceLocationProvider {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final String TAG = "DeviceLocationProvider";
    private final Context context;
    private DeviceLocationProviderMode currentMode;
    private final onViewDetachedFromWindowlambda1 locationUpdatePendingIntent$delegate;
    private final LocationProviderRequest request;
    public DeviceLocationProviderState state;

    public enum DeviceLocationProviderMode {
        NONE,
        CALLBACK,
        PENDING_INTENT
    }

    public enum DeviceLocationProviderState {
        STOPPED,
        STOPPING,
        STARTED,
        STARTING
    }

    public final class LocationCancelable implements Cancelable {
        private final AtomicBoolean isCanceled = new AtomicBoolean(false);

        public LocationCancelable() {
        }

        @Override // com.mapbox.common.Cancelable
        public void cancel() {
            this.isCanceled.set(true);
        }

        public final void invokeIfNotCanceled(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            if (this.isCanceled.get()) {
                MapboxCommonLogger.INSTANCE.logW$common_release(LocationServiceImpl.TAG, "Operation to get last location was canceled");
            } else {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            }
        }
    }

    public static /* synthetic */ void getPersistentId$annotations() {
    }

    public static /* synthetic */ void getState$annotations() {
    }

    @Override // com.mapbox.common.location.BaseLocationProvider, com.mapbox.common.location.LocationProvider
    public void addLocationObserver(LocationObserver locationObserver, Looper looper) {
        synchronized (this) {
            locationObserver.getClass();
            looper.getClass();
            super.addLocationObserver(locationObserver, looper);
            start();
        }
    }

    public abstract void doStart();

    public abstract void doStop();

    public abstract List<Location> extractResult(Intent intent);

    public final Context getContext() {
        return this.context;
    }

    public final DeviceLocationProviderMode getCurrentMode() {
        return this.currentMode;
    }

    public String getName() {
        return DeviceLocationProvider.DefaultImpls.getName(this);
    }

    public abstract int getPersistentId();

    public final LocationProviderRequest getRequest() {
        return this.request;
    }

    @Override // com.mapbox.common.location.BaseLocationProvider
    public void notifyLocationUpdate(List<? extends Location> list) {
        synchronized (this) {
            list.getClass();
            if (this.state == DeviceLocationProviderState.STARTED) {
                super.notifyLocationUpdate(list);
            }
        }
    }

    @Override // com.mapbox.common.location.BaseLocationProvider, com.mapbox.common.location.LocationProvider
    public void removeLocationObserver(LocationObserver locationObserver) {
        synchronized (this) {
            locationObserver.getClass();
            super.removeLocationObserver(locationObserver);
            if (getObservers().isEmpty()) {
                stop();
            }
        }
    }

    public abstract void removeLocationUpdates(PendingIntent pendingIntent);

    public abstract void requestLocationUpdates(PendingIntent pendingIntent);

    public final PendingIntent getLocationUpdatePendingIntent() {
        Object objMediaSessionCompatResultReceiverWrapper = this.locationUpdatePendingIntent$delegate.MediaSessionCompatResultReceiverWrapper();
        objMediaSessionCompatResultReceiverWrapper.getClass();
        return (PendingIntent) objMediaSessionCompatResultReceiverWrapper;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeviceLocationProviderState.values().length];
            try {
                iArr[DeviceLocationProviderState.STARTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeviceLocationProviderState.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeviceLocationProviderState.STOPPED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DeviceLocationProviderState.STOPPING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BaseDeviceLocationProvider(Context context, LocationProviderRequest locationProviderRequest) {
        context.getClass();
        this.context = context;
        this.request = locationProviderRequest;
        this.state = DeviceLocationProviderState.STOPPED;
        this.locationUpdatePendingIntent$delegate = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.common.location.BaseDeviceLocationProvider$locationUpdatePendingIntent$2
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final PendingIntent invoke() {
                Intent intent = new Intent(this.this$0.getContext(), (Class<?>) LocationUpdatesReceiver.class);
                intent.setAction(LocationUpdatesReceiver.ACTION_PROCESS_LOCATION_UPDATES);
                int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
                intent.putExtra(LocationUpdatesReceiver.LOCATION_PROVIDER_ID_KEY, this.this$0.getPersistentId());
                return PendingIntent.getBroadcast(this.this$0.getContext(), this.this$0.getPersistentId(), intent, i);
            }

            {
                super(0);
            }
        });
        this.currentMode = DeviceLocationProviderMode.NONE;
    }

    public final void setCurrentMode(DeviceLocationProviderMode deviceLocationProviderMode) {
        deviceLocationProviderMode.getClass();
        this.currentMode = deviceLocationProviderMode;
    }

    public final void start() {
        Object isitemdismissable;
        try {
            MapboxCommonLogger mapboxCommonLogger = MapboxCommonLogger.INSTANCE;
            mapboxCommonLogger.logD$common_release(TAG, "Start called for " + this + ", state=" + this.state);
            int i = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
            if (i == 1 || i == 2) {
                mapboxCommonLogger.logW$common_release(TAG, "Skipping request to start: state == " + this.state);
            } else if (i == 3 || i == 4) {
                this.state = DeviceLocationProviderState.STARTING;
                doStart();
            }
            isitemdismissable = createFromParcel.INSTANCE;
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        Throwable thSerializer = onItemDismiss.serializer(isitemdismissable);
        if (thSerializer != null) {
            MapboxCommonLogger.INSTANCE.logE$common_release(TAG, "Failed to start: state=" + this.state + ' ' + thSerializer);
            this.state = DeviceLocationProviderState.STOPPED;
        }
    }

    public final void stop() {
        Object isitemdismissable;
        synchronized (this) {
            try {
                MapboxCommonLogger mapboxCommonLogger = MapboxCommonLogger.INSTANCE;
                mapboxCommonLogger.logD$common_release(TAG, "Stop called for " + this + " state=" + this.state);
                int i = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
                if (i == 1 || i == 2) {
                    this.state = DeviceLocationProviderState.STOPPING;
                    doStop();
                } else if (i == 3 || i == 4) {
                    mapboxCommonLogger.logW$common_release(TAG, "Skipping request to stop: state == " + this.state);
                }
                isitemdismissable = createFromParcel.INSTANCE;
            } catch (Throwable th) {
                isitemdismissable = new isItemDismissable(th);
            }
            Throwable thSerializer = onItemDismiss.serializer(isitemdismissable);
            if (thSerializer != null) {
                MapboxCommonLogger.INSTANCE.logE$common_release(TAG, "Failed to stop: state=" + this.state + ' ' + thSerializer);
            }
        }
    }

    @Override // com.mapbox.common.location.BaseLocationProvider, com.mapbox.common.location.LocationProvider
    public void addLocationObserver(LocationObserver locationObserver) {
        synchronized (this) {
            locationObserver.getClass();
            super.addLocationObserver(locationObserver);
            start();
        }
    }
}
