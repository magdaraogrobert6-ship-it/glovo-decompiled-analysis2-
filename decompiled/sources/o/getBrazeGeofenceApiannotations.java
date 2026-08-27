package o;

/* JADX INFO: loaded from: classes3.dex */
final class getBrazeGeofenceApiannotations extends getLatitudeannotations<setShouldPersistWebView> {
    final /* synthetic */ configureFromServerConfiglambda2 IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getBrazeGeofenceApiannotations(configureFromServerConfiglambda2 configurefromserverconfiglambda2, clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar) {
        super(clearandroid_sdk_base_releaseVar, "UserActivityMonitor");
        this.IconCompatParcelizer = configurefromserverconfiglambda2;
    }

    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<setShouldPersistWebView> getlongitudeannotations) {
        configureFromServerConfiglambda2.write(this.IconCompatParcelizer, getlongitudeannotations.read().getClass(), null);
    }
}
