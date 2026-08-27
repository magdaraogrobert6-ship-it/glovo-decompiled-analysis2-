package o;

/* JADX INFO: loaded from: classes4.dex */
final class unregisterGeofenceslambda1 extends getLatitudeannotations<logLocationRecordedEvent> {
    final /* synthetic */ analyticsEnabledForGeofenceId read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public unregisterGeofenceslambda1(analyticsEnabledForGeofenceId analyticsenabledforgeofenceid) {
        super(analyticsenabledforgeofenceid.serializer, "HarshEventDetector");
        this.read = analyticsenabledforgeofenceid;
    }

    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<logLocationRecordedEvent> getlongitudeannotations) {
        analyticsEnabledForGeofenceId analyticsenabledforgeofenceid = this.read;
        cancelNotificationlambda0 cancelnotificationlambda0RemoteActionCompatParcelizer = analyticsenabledforgeofenceid.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(getlongitudeannotations.read(), getlongitudeannotations.write());
        if (getlongitudeannotations.read().serializer.byteValue() == 1) {
            analyticsEnabledForGeofenceId.IconCompatParcelizer(analyticsenabledforgeofenceid, cancelnotificationlambda0RemoteActionCompatParcelizer);
        } else if (getlongitudeannotations.read().serializer.byteValue() == 2) {
            analyticsEnabledForGeofenceId.read(analyticsenabledforgeofenceid, cancelnotificationlambda0RemoteActionCompatParcelizer);
        }
    }
}
