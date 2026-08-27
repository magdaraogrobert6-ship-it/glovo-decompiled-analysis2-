package com.mapbox.common.location;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.Task;
import com.mapbox.common.FeatureTelemetryCounter;
import com.mapbox.common.MapboxCommonLogger;
import com.mapbox.common.movement.GoogleActivityRecognition;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.lang.reflect.Method;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.isAdapterPositionOnScreen;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class ProxyGoogleFusedLocationProviderClient {
    public static final Companion Companion = new Companion(null);
    private static final String GOOGLE_FUSED_LOCATION_PROVIDER_CLIENT = "com.google.android.gms.location.FusedLocationProviderClient";
    private static final onViewDetachedFromWindowlambda1 available$delegate = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.common.location.ProxyGoogleFusedLocationProviderClient$Companion$available$2
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final Boolean invoke() {
            return Boolean.valueOf(GoogleDeviceLocationProviderKt.getGooglePlayServicesHelper().isGooglePlayServicesLocationAvailable());
        }
    }});
    private static Method getLastLocation;
    public static Method removeLocationUpdatesCallback;
    public static Method removeLocationUpdatesPendingIntent;
    public static Method requestLocationUpdatesCallback;
    public static Method requestLocationUpdatesPendingIntent;
    private Object googleFusedLocationProviderClient;

    public static /* synthetic */ void getGoogleFusedLocationProviderClient$annotations() {
    }

    public final Object getGoogleFusedLocationProviderClient() {
        return this.googleFusedLocationProviderClient;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getRemoveLocationUpdatesCallback$annotations() {
        }

        public static /* synthetic */ void getRemoveLocationUpdatesPendingIntent$annotations() {
        }

        public static /* synthetic */ void getRequestLocationUpdatesCallback$annotations() {
        }

        public static /* synthetic */ void getRequestLocationUpdatesPendingIntent$annotations() {
        }

        public final void setRemoveLocationUpdatesCallback(Method method) {
            method.getClass();
            ProxyGoogleFusedLocationProviderClient.removeLocationUpdatesCallback = method;
        }

        public final void setRemoveLocationUpdatesPendingIntent(Method method) {
            method.getClass();
            ProxyGoogleFusedLocationProviderClient.removeLocationUpdatesPendingIntent = method;
        }

        public final void setRequestLocationUpdatesCallback(Method method) {
            method.getClass();
            ProxyGoogleFusedLocationProviderClient.requestLocationUpdatesCallback = method;
        }

        public final void setRequestLocationUpdatesPendingIntent(Method method) {
            method.getClass();
            ProxyGoogleFusedLocationProviderClient.requestLocationUpdatesPendingIntent = method;
        }

        private Companion() {
        }

        public final boolean getAvailable$common_release() {
            return ((Boolean) ProxyGoogleFusedLocationProviderClient.available$delegate.MediaSessionCompatResultReceiverWrapper()).booleanValue();
        }

        public final Method getRemoveLocationUpdatesCallback() {
            Method method = ProxyGoogleFusedLocationProviderClient.removeLocationUpdatesCallback;
            if (method != null) {
                return method;
            }
            removeNodeAtDepth.serializer("removeLocationUpdatesCallback");
            throw null;
        }

        public final Method getRemoveLocationUpdatesPendingIntent() {
            Method method = ProxyGoogleFusedLocationProviderClient.removeLocationUpdatesPendingIntent;
            if (method != null) {
                return method;
            }
            removeNodeAtDepth.serializer("removeLocationUpdatesPendingIntent");
            throw null;
        }

        public final Method getRequestLocationUpdatesCallback() {
            Method method = ProxyGoogleFusedLocationProviderClient.requestLocationUpdatesCallback;
            if (method != null) {
                return method;
            }
            removeNodeAtDepth.serializer("requestLocationUpdatesCallback");
            throw null;
        }

        public final Method getRequestLocationUpdatesPendingIntent() {
            Method method = ProxyGoogleFusedLocationProviderClient.requestLocationUpdatesPendingIntent;
            if (method != null) {
                return method;
            }
            removeNodeAtDepth.serializer("requestLocationUpdatesPendingIntent");
            throw null;
        }

        public final boolean verifyAndCacheMethods$common_release() throws IncompatibleGooglePlayServicesLocationVersion {
            try {
                if (FusedLocationProviderClient.class.isInterface()) {
                    FeatureTelemetryCounter.create("common/location/googlePlay21").increment();
                } else {
                    FeatureTelemetryCounter.create("common/location/googlePlay18to20").increment();
                }
                Companion companion = ProxyGoogleFusedLocationProviderClient.Companion;
                Method method = FusedLocationProviderClient.class.getMethod("requestLocationUpdates", LocationRequest.class, LocationCallback.class, Looper.class);
                method.getClass();
                companion.setRequestLocationUpdatesCallback(method);
                Method method2 = FusedLocationProviderClient.class.getMethod("requestLocationUpdates", LocationRequest.class, PendingIntent.class);
                method2.getClass();
                companion.setRequestLocationUpdatesPendingIntent(method2);
                Method method3 = FusedLocationProviderClient.class.getMethod("removeLocationUpdates", LocationCallback.class);
                method3.getClass();
                companion.setRemoveLocationUpdatesCallback(method3);
                Method method4 = FusedLocationProviderClient.class.getMethod("removeLocationUpdates", PendingIntent.class);
                method4.getClass();
                companion.setRemoveLocationUpdatesPendingIntent(method4);
                Method method5 = FusedLocationProviderClient.class.getMethod("getLastLocation", null);
                method5.getClass();
                ProxyGoogleFusedLocationProviderClient.getLastLocation = method5;
                return true;
            } catch (ClassNotFoundException e) {
                MapboxCommonLogger.INSTANCE.logW$common_release(GoogleActivityRecognition.TAG, "Required class not found: " + e.getMessage());
                return false;
            } catch (NoSuchMethodException e2) {
                MapboxCommonLogger.INSTANCE.logW$common_release(GoogleActivityRecognition.TAG, "Required method not found: " + e2.getMessage());
                throw new IncompatibleGooglePlayServicesLocationVersion();
            } catch (SecurityException e3) {
                MapboxCommonLogger.INSTANCE.logW$common_release(GoogleActivityRecognition.TAG, "Required method not accessible: " + e3.getMessage());
                throw new IncompatibleGooglePlayServicesLocationVersion();
            }
        }
    }

    public ProxyGoogleFusedLocationProviderClient(Context context) {
        context.getClass();
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
        fusedLocationProviderClient.getClass();
        this.googleFusedLocationProviderClient = fusedLocationProviderClient;
    }

    public final Task removeLocationUpdates(LocationCallback locationCallback) {
        locationCallback.getClass();
        try {
            return (Task) Companion.getRemoveLocationUpdatesCallback().invoke(this.googleFusedLocationProviderClient, locationCallback);
        } catch (Exception e) {
            return new FailedTask(e);
        }
    }

    public final Task requestLocationUpdates(LocationRequest locationRequest, LocationCallback locationCallback, Looper looper) throws IllegalStateException {
        locationRequest.getClass();
        locationCallback.getClass();
        try {
            return (Task) Companion.getRequestLocationUpdatesCallback().invoke(this.googleFusedLocationProviderClient, locationRequest, locationCallback, looper);
        } catch (Exception e) {
            return new FailedTask(e);
        }
    }

    public final void setGoogleFusedLocationProviderClient(Object obj) {
        obj.getClass();
        this.googleFusedLocationProviderClient = obj;
    }

    public final Task getLastLocation() {
        try {
            Method method = getLastLocation;
            if (method != null) {
                return (Task) method.invoke(this.googleFusedLocationProviderClient, null);
            }
            removeNodeAtDepth.serializer("getLastLocation");
            throw null;
        } catch (Exception e) {
            return new FailedTask(e);
        }
    }

    public final Task removeLocationUpdates(PendingIntent pendingIntent) {
        pendingIntent.getClass();
        try {
            return (Task) Companion.getRemoveLocationUpdatesPendingIntent().invoke(this.googleFusedLocationProviderClient, pendingIntent);
        } catch (Exception e) {
            return new FailedTask(e);
        }
    }

    public final Task requestLocationUpdates(LocationRequest locationRequest, PendingIntent pendingIntent) {
        locationRequest.getClass();
        pendingIntent.getClass();
        try {
            return (Task) Companion.getRequestLocationUpdatesPendingIntent().invoke(this.googleFusedLocationProviderClient, locationRequest, pendingIntent);
        } catch (Exception e) {
            return new FailedTask(e);
        }
    }
}
