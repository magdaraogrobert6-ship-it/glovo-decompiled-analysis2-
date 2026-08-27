package o;

/* JADX INFO: loaded from: classes3.dex */
final class getBrazeLocationApiannotations extends getLatitudeannotations<BrazeBootReceiver> {
    final /* synthetic */ configureFromServerConfiglambda2 RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getBrazeLocationApiannotations(configureFromServerConfiglambda2 configurefromserverconfiglambda2, clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar) {
        super(clearandroid_sdk_base_releaseVar, "UserActivityMonitor");
        this.RemoteActionCompatParcelizer = configurefromserverconfiglambda2;
    }

    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<BrazeBootReceiver> getlongitudeannotations) {
        configureFromServerConfiglambda2.write(this.RemoteActionCompatParcelizer, getlongitudeannotations.read().getClass(), null);
    }
}
