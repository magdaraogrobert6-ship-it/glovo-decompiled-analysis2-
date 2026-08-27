package o;

/* JADX INFO: loaded from: classes3.dex */
public final class CachedConfigurationProvider extends Thread {
    public final /* synthetic */ int read = 1;

    public /* synthetic */ CachedConfigurationProvider(String str) {
        super(str);
    }

    public CachedConfigurationProvider(Runnable runnable) {
        super(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0022, code lost:
    
        r1.MediaSessionCompatQueueItem();
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r3 = this;
            int r0 = r3.read
            if (r0 == 0) goto Ld
            r0 = 9
            android.os.Process.setThreadPriority(r0)
            super.run()
            return
        Ld:
            java.lang.Class<o.isInAppMessageTestPushEagerDisplayEnabled> r0 = o.isInAppMessageTestPushEagerDisplayEnabled.class
            monitor-enter(r0)     // Catch: java.lang.InterruptedException -> Ld
            o.isInAppMessageTestPushEagerDisplayEnabled r1 = o.isInAppMessageTestPushEagerDisplayEnabled.MediaDescriptionCompat()     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            goto Ld
        L18:
            o.isInAppMessageTestPushEagerDisplayEnabled r2 = o.isInAppMessageTestPushEagerDisplayEnabled.RemoteActionCompatParcelizer     // Catch: java.lang.Throwable -> L26
            if (r1 != r2) goto L21
            r1 = 0
            o.isInAppMessageTestPushEagerDisplayEnabled.RemoteActionCompatParcelizer = r1     // Catch: java.lang.Throwable -> L26
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            return
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            r1.MediaSessionCompatQueueItem()     // Catch: java.lang.InterruptedException -> Ld
            goto Ld
        L26:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.CachedConfigurationProvider.run():void");
    }
}
