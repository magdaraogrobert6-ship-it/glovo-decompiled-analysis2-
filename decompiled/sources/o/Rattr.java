package o;

/* JADX INFO: loaded from: classes4.dex */
public final class Rattr extends logCustomEventWithJSON {
    public final /* synthetic */ logPurchaseWithJSONlambda1 RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rattr(logPurchaseWithJSONlambda1 logpurchasewithjsonlambda1) {
        super(logpurchasewithjsonlambda1);
        this.RemoteActionCompatParcelizer = logpurchasewithjsonlambda1;
        executelambda2.write();
    }

    @Override // o.logCustomEventWithJSON
    public final void serializer() {
        logPurchaseWithJSONlambda1 logpurchasewithjsonlambda1;
        int i;
        RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
        executelambda2.serializer();
        try {
            executelambda1 executelambda1Var = executelambda2.serializer;
            executelambda1Var.getClass();
            synchronized (this.RemoteActionCompatParcelizer.RatingCompat) {
                RegistryMissingComponentException registryMissingComponentException2 = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
                registryMissingComponentException.write(registryMissingComponentException2, registryMissingComponentException2.IconCompatParcelizer());
                logpurchasewithjsonlambda1 = this.RemoteActionCompatParcelizer;
                logpurchasewithjsonlambda1.PlaybackStateCompatCustomAction = false;
                i = logpurchasewithjsonlambda1.MediaDescriptionCompat;
            }
            logpurchasewithjsonlambda1.MediaSessionCompatQueueItem.write(registryMissingComponentException, registryMissingComponentException.size);
            synchronized (this.RemoteActionCompatParcelizer.RatingCompat) {
                this.RemoteActionCompatParcelizer.MediaDescriptionCompat -= i;
            }
            executelambda1Var.getClass();
        } catch (Throwable th) {
            try {
                executelambda2.serializer.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
