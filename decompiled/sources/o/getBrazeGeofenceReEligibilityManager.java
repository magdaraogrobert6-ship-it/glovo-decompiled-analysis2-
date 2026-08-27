package o;

/* JADX INFO: loaded from: classes4.dex */
final class getBrazeGeofenceReEligibilityManager extends getLatitudeannotations<logLocationRecordedEvent> {
    final /* synthetic */ getBrazeGeofenceApi serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getBrazeGeofenceReEligibilityManager(getBrazeGeofenceApi getbrazegeofenceapi) {
        super(getbrazegeofenceapi.IconCompatParcelizer, "PhoneUsageDetector");
        this.serializer = getbrazegeofenceapi;
    }

    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<logLocationRecordedEvent> getlongitudeannotations) {
        byte bByteValue = getlongitudeannotations.read().serializer.byteValue();
        getBrazeGeofenceApi getbrazegeofenceapi = this.serializer;
        if (bByteValue == 1) {
            getBrazeGeofenceApi.write(getbrazegeofenceapi, getbrazegeofenceapi.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(getlongitudeannotations.read(), getlongitudeannotations.write()));
        } else if (getlongitudeannotations.read().serializer.byteValue() == 2) {
            getBrazeGeofenceApi.RemoteActionCompatParcelizer(getbrazegeofenceapi, getbrazegeofenceapi.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(getlongitudeannotations.read(), getlongitudeannotations.write()));
        }
    }
}
