package o;

/* JADX INFO: loaded from: classes4.dex */
public final class hasTooManyZipEntries implements Runnable {
    public final /* synthetic */ hasTooManyZipEntrieslambda0 RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ hasTooManyZipEntries(hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda0, int i) {
        this.read = i;
        this.RemoteActionCompatParcelizer = hastoomanyzipentrieslambda0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.read;
        if (i == 0) {
            hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda0 = this.RemoteActionCompatParcelizer;
            hastoomanyzipentrieslambda0.MediaSessionCompatResultReceiverWrapper.serializer(optEnum.INFO, "Entering SHUTDOWN state");
            hastoomanyzipentrieslambda0.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.RemoteActionCompatParcelizer(setResourcePackageNamelambda0.SHUTDOWN);
            return;
        }
        if (i == 1) {
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(true);
            return;
        }
        if (i == 2) {
            hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda1 = this.RemoteActionCompatParcelizer;
            if (hastoomanyzipentrieslambda1.addContentView.get() || hastoomanyzipentrieslambda1.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 == null) {
                return;
            }
            hastoomanyzipentrieslambda1.RemoteActionCompatParcelizer(false);
            hasTooManyZipEntrieslambda0.IconCompatParcelizer(hastoomanyzipentrieslambda1);
            return;
        }
        if (i != 3) {
            hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda2 = this.RemoteActionCompatParcelizer;
            if (hastoomanyzipentrieslambda2.onBackPressedDispatcher_delegatelambda010) {
                return;
            }
            hastoomanyzipentrieslambda2.onBackPressedDispatcher_delegatelambda010 = true;
            hasTooManyZipEntrieslambda0.write(hastoomanyzipentrieslambda2);
            return;
        }
        this.RemoteActionCompatParcelizer.RatingCompat();
        if (this.RemoteActionCompatParcelizer.addOnConfigurationChangedListener != null) {
            this.RemoteActionCompatParcelizer.addOnConfigurationChangedListener.getClass();
        }
        unpackZipIntoDirectory unpackzipintodirectory = this.RemoteActionCompatParcelizer.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        if (unpackzipintodirectory != null) {
            ((hasPermissionlambda0) unpackzipintodirectory.RemoteActionCompatParcelizer.write).RemoteActionCompatParcelizer();
        }
    }
}
