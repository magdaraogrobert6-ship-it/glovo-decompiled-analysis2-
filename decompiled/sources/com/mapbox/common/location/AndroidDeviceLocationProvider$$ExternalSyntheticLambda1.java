package com.mapbox.common.location;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class AndroidDeviceLocationProvider$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BaseDeviceLocationProvider.LocationCancelable f$0;
    public final /* synthetic */ GetLocationCallback f$1;

    public /* synthetic */ AndroidDeviceLocationProvider$$ExternalSyntheticLambda1(BaseDeviceLocationProvider.LocationCancelable locationCancelable, GetLocationCallback getLocationCallback, int i) {
        this.$r8$classId = i;
        this.f$0 = locationCancelable;
        this.f$1 = getLocationCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        GetLocationCallback getLocationCallback = this.f$1;
        BaseDeviceLocationProvider.LocationCancelable locationCancelable = this.f$0;
        if (i == 0) {
            AndroidDeviceLocationProvider.getLastLocation$lambda$5(locationCancelable, getLocationCallback);
        } else if (i != 1) {
            AndroidDeviceLocationProvider.getLastLocation$lambda$6(locationCancelable, getLocationCallback);
        } else {
            GoogleDeviceLocationProvider$getLastLocation$1$1.invoke$lambda$1(locationCancelable, getLocationCallback);
        }
    }
}
