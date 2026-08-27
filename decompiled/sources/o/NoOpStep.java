package o;

/* JADX INFO: loaded from: classes4.dex */
public final class NoOpStep implements containsAnyPushPermissionBrazeActions {
    public final Runtime RemoteActionCompatParcelizer = Runtime.getRuntime();

    @Override // o.containsAnyPushPermissionBrazeActions
    public final void read() {
    }

    @Override // o.containsAnyPushPermissionBrazeActions
    public final void serializer(getSrcJson getsrcjson) {
        Runtime runtime = this.RemoteActionCompatParcelizer;
        getsrcjson.RemoteActionCompatParcelizer = Long.valueOf(runtime.totalMemory() - runtime.freeMemory());
    }
}
