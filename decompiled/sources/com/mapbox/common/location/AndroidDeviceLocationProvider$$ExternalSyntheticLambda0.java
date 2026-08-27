package com.mapbox.common.location;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class AndroidDeviceLocationProvider$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BaseDeviceLocationProvider.LocationCancelable f$0;
    public final /* synthetic */ GetLocationCallback f$1;
    public final /* synthetic */ android.location.Location f$2;

    public /* synthetic */ AndroidDeviceLocationProvider$$ExternalSyntheticLambda0(BaseDeviceLocationProvider.LocationCancelable locationCancelable, GetLocationCallback getLocationCallback, android.location.Location location, int i) {
        this.$r8$classId = i;
        this.f$0 = locationCancelable;
        this.f$1 = getLocationCallback;
        this.f$2 = location;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        android.location.Location location = this.f$2;
        GetLocationCallback getLocationCallback = this.f$1;
        BaseDeviceLocationProvider.LocationCancelable locationCancelable = this.f$0;
        if (i != 0) {
            GoogleDeviceLocationProvider$getLastLocation$1$1.invoke$lambda$0(locationCancelable, getLocationCallback, location);
        } else {
            AndroidDeviceLocationProvider.getLastLocation$lambda$4(locationCancelable, getLocationCallback, location);
        }
    }
}
