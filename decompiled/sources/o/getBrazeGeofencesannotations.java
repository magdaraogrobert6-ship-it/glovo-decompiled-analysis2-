package o;

/* JADX INFO: loaded from: classes3.dex */
final class getBrazeGeofencesannotations extends getLatitudeannotations<r8lambdaQOq3wL0Ry1sJDGdfdXHrnvb36L4> {
    final /* synthetic */ configureFromServerConfiglambda2 serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getBrazeGeofencesannotations(configureFromServerConfiglambda2 configurefromserverconfiglambda2, clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar) {
        super(clearandroid_sdk_base_releaseVar, "UserActivityMonitor");
        this.serializer = configurefromserverconfiglambda2;
    }

    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<r8lambdaQOq3wL0Ry1sJDGdfdXHrnvb36L4> getlongitudeannotations) {
        configureFromServerConfiglambda2.write(this.serializer, getlongitudeannotations.read().getClass(), null);
    }
}
