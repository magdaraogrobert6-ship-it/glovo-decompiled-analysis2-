package o;

import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class removeSingleSubscriptionlambda1 {
    private static int read = 1;
    private static int write;
    public final androidx.work.impl.WorkerWrapper.Builder serializer;

    public removeSingleSubscriptionlambda1(androidx.work.impl.WorkerWrapper.Builder builder) {
        this.serializer = builder;
    }

    public final refreshFeatureFlagslambda0 read(ContextScope contextScope) {
        int i = 2 % 2;
        getQueryContext getquerycontext = new getQueryContext();
        androidx.work.impl.WorkerWrapper.Builder builder = this.serializer;
        Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.write).write();
        objWrite.getClass();
        requestBannersRefreshlambda1unsubscribeLocalListeners requestbannersrefreshlambda1unsubscribelocallisteners = (requestBannersRefreshlambda1unsubscribeLocalListeners) objWrite;
        Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.MediaSessionCompatQueueItem).write();
        objWrite2.getClass();
        requestBannersRefreshlambda120 requestbannersrefreshlambda120 = (requestBannersRefreshlambda120) objWrite2;
        Object objWrite3 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.read).write();
        objWrite3.getClass();
        transferSessionPackageI transfersessionpackagei = (transferSessionPackageI) objWrite3;
        Object objWrite4 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.MediaBrowserCompatMediaItem).write();
        objWrite4.getClass();
        r8lambda52ctlEduwkfz3l8UwwWKdau6wdM r8lambda52ctleduwkfz3l8uwwwkdau6wdm = (r8lambda52ctlEduwkfz3l8UwwWKdau6wdM) objWrite4;
        Object objWrite5 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.MediaMetadataCompat).write();
        objWrite5.getClass();
        removeSingleSubscriptionlambda101 removesinglesubscriptionlambda101 = (removeSingleSubscriptionlambda101) ((requestBannersRefreshlambda1) builder.IconCompatParcelizer).write();
        Object objWrite6 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) builder.RemoteActionCompatParcelizer).write();
        objWrite6.getClass();
        refreshFeatureFlagslambda0 refreshfeatureflagslambda0 = new refreshFeatureFlagslambda0(getquerycontext, requestbannersrefreshlambda1unsubscribelocallisteners, requestbannersrefreshlambda120, transfersessionpackagei, r8lambda52ctleduwkfz3l8uwwwkdau6wdm, (setRegisteredPushToken) objWrite5, removesinglesubscriptionlambda101, (dispatchChildDetached) objWrite6, contextScope);
        int i2 = read + 83;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return refreshfeatureflagslambda0;
    }
}
