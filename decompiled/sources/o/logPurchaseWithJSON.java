package o;

/* JADX INFO: loaded from: classes4.dex */
public final class logPurchaseWithJSON extends logCustomEventWithJSON {
    public final /* synthetic */ logPurchaseWithJSONlambda1 IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public logPurchaseWithJSON(logPurchaseWithJSONlambda1 logpurchasewithjsonlambda1) {
        super(logpurchasewithjsonlambda1);
        this.IconCompatParcelizer = logpurchasewithjsonlambda1;
        executelambda2.write();
    }

    @Override // o.logCustomEventWithJSON
    public final void serializer() {
        logPurchaseWithJSONlambda1 logpurchasewithjsonlambda1;
        RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
        executelambda2.serializer();
        try {
            executelambda1 executelambda1Var = executelambda2.serializer;
            executelambda1Var.getClass();
            synchronized (this.IconCompatParcelizer.RatingCompat) {
                RegistryMissingComponentException registryMissingComponentException2 = this.IconCompatParcelizer.RemoteActionCompatParcelizer;
                registryMissingComponentException.write(registryMissingComponentException2, registryMissingComponentException2.size);
                logpurchasewithjsonlambda1 = this.IconCompatParcelizer;
                logpurchasewithjsonlambda1.IconCompatParcelizer = false;
            }
            logpurchasewithjsonlambda1.MediaSessionCompatQueueItem.write(registryMissingComponentException, registryMissingComponentException.size);
            this.IconCompatParcelizer.MediaSessionCompatQueueItem.flush();
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
