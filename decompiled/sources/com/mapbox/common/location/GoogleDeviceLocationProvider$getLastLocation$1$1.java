package com.mapbox.common.location;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.mapbox.common.MapboxCommonLogger;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class GoogleDeviceLocationProvider$getLastLocation$1$1 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    final /* synthetic */ GetLocationCallback $callback;
    final /* synthetic */ BaseDeviceLocationProvider.LocationCancelable $cancelable;
    final /* synthetic */ Task $it;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleDeviceLocationProvider$getLastLocation$1$1(Task task, BaseDeviceLocationProvider.LocationCancelable locationCancelable, GetLocationCallback getLocationCallback) {
        super(0);
        this.$it = task;
        this.$cancelable = locationCancelable;
        this.$callback = getLocationCallback;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m4567invoke() {
        android.location.Location location;
        if (this.$it.isCanceled()) {
            MapboxCommonLogger.INSTANCE.logW$common_release("GoogleDeviceLocationProvider", "The operation to get last location from GoogleFusedLocationProvider was cancelled.");
            return;
        }
        int i = 1;
        if (!this.$it.isSuccessful() || (location = (android.location.Location) this.$it.getResult()) == null) {
            new Handler(Looper.getMainLooper()).post(new AndroidDeviceLocationProvider$$ExternalSyntheticLambda1(this.$cancelable, this.$callback, i));
        } else {
            new Handler(Looper.getMainLooper()).post(new AndroidDeviceLocationProvider$$ExternalSyntheticLambda0(this.$cancelable, this.$callback, location, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(BaseDeviceLocationProvider.LocationCancelable locationCancelable, final GetLocationCallback getLocationCallback, final android.location.Location location) {
        locationCancelable.getClass();
        getLocationCallback.getClass();
        locationCancelable.invokeIfNotCanceled(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.common.location.GoogleDeviceLocationProvider$getLastLocation$1$1$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m4568invoke() {
                GetLocationCallback getLocationCallback2 = getLocationCallback;
                android.location.Location location2 = location;
                location2.getClass();
                getLocationCallback2.run(LocationServiceUtils.toCommonLocation(location2));
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m4568invoke();
                return createFromParcel.INSTANCE;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1(BaseDeviceLocationProvider.LocationCancelable locationCancelable, final GetLocationCallback getLocationCallback) {
        locationCancelable.getClass();
        getLocationCallback.getClass();
        locationCancelable.invokeIfNotCanceled(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.common.location.GoogleDeviceLocationProvider$getLastLocation$1$1$2$1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m4569invoke() {
                getLocationCallback.run(null);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m4569invoke();
                return createFromParcel.INSTANCE;
            }
        });
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public /* bridge */ /* synthetic */ Object invoke() {
        m4567invoke();
        return createFromParcel.INSTANCE;
    }
}
