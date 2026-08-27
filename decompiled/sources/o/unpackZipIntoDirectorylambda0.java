package o;

import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public final class unpackZipIntoDirectorylambda0 implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ hasTooManyZipEntrieslambda0 RemoteActionCompatParcelizer;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        java.util.logging.Logger logger = hasTooManyZipEntrieslambda0.MediaMetadataCompat;
        Level level = Level.SEVERE;
        StringBuilder sb = new StringBuilder("[");
        hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda0 = this.RemoteActionCompatParcelizer;
        sb.append(hastoomanyzipentrieslambda0._init_lambda2);
        sb.append("] Uncaught exception in the SynchronizationContext. Panic!");
        logger.log(level, sb.toString(), th);
        if (hastoomanyzipentrieslambda0.defaultViewModelProviderFactory_delegatelambda0) {
            return;
        }
        hastoomanyzipentrieslambda0.defaultViewModelProviderFactory_delegatelambda0 = true;
        hastoomanyzipentrieslambda0.RemoteActionCompatParcelizer(true);
        hastoomanyzipentrieslambda0.read(false);
        wouldPushPermissionPromptDisplay wouldpushpermissionpromptdisplay = new wouldPushPermissionPromptDisplay(th);
        hastoomanyzipentrieslambda0.addOnConfigurationChangedListener = wouldpushpermissionpromptdisplay;
        hastoomanyzipentrieslambda0.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.write(wouldpushpermissionpromptdisplay);
        hastoomanyzipentrieslambda0.fullyDrawnReporter_delegatelambda0.serializer(null);
        hastoomanyzipentrieslambda0.MediaSessionCompatResultReceiverWrapper.serializer(optEnum.ERROR, "PANIC! Entering TRANSIENT_FAILURE");
        hastoomanyzipentrieslambda0.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.RemoteActionCompatParcelizer(setResourcePackageNamelambda0.TRANSIENT_FAILURE);
    }

    public unpackZipIntoDirectorylambda0(hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda0) {
        this.RemoteActionCompatParcelizer = hastoomanyzipentrieslambda0;
    }
}
