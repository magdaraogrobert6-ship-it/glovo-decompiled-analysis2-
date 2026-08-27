package o;

/* JADX INFO: loaded from: classes2.dex */
public final class approachLayoutdefault implements Thread.UncaughtExceptionHandler {
    public final String read;
    public final /* synthetic */ LookaheadScopeKtLookaheadScope4 write;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        synchronized (this) {
            getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.write.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.serializer(th, this.read);
        }
    }

    public approachLayoutdefault(LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4, String str) {
        this.write = lookaheadScopeKtLookaheadScope4;
        this.read = str;
    }
}
