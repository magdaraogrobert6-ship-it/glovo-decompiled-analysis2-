package io.sentry.transport;

import io.sentry.JsonObjectSerializer;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.BannerViewExternalSyntheticLambda3;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.createBannerWebViewClientListenerandroid_sdk_ui_release;
import o.getOnDismissCallback;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;

/* JADX INFO: loaded from: classes4.dex */
public final class PlaybackStateCompatCustomAction extends ThreadPoolExecutor implements AutoCloseable {
    public final BrazeActionParserExternalSyntheticLambda0 IconCompatParcelizer;
    public final JsonObjectSerializer RemoteActionCompatParcelizer;
    public final int read;
    public final getOnDismissCallback serializer;
    public createBannerWebViewClientListenerandroid_sdk_ui_release write;

    public PlaybackStateCompatCustomAction(int i, BannerViewExternalSyntheticLambda3 bannerViewExternalSyntheticLambda3, write writeVar, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, getOnDismissCallback getondismisscallback) {
        super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), bannerViewExternalSyntheticLambda3, writeVar);
        this.write = null;
        this.RemoteActionCompatParcelizer = new JsonObjectSerializer((byte) 0, 13);
        this.read = i;
        this.IconCompatParcelizer = brazeActionParserExternalSyntheticLambda0;
        this.serializer = getondismisscallback;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        JsonObjectSerializer jsonObjectSerializer = this.RemoteActionCompatParcelizer;
        ResultReceiver resultReceiver = (ResultReceiver) jsonObjectSerializer.jsonReflectionObjectSerializer;
        ResultReceiver resultReceiver2 = (ResultReceiver) jsonObjectSerializer.jsonReflectionObjectSerializer;
        int iSerializer = ResultReceiver.serializer(resultReceiver);
        int i = this.read;
        BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0 = this.IconCompatParcelizer;
        getOnDismissCallback getondismisscallback = this.serializer;
        if (iSerializer >= i) {
            this.write = getondismisscallback.RemoteActionCompatParcelizer();
            brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Submit cancelled", new Object[0]);
            return new MediaSessionCompatToken();
        }
        ResultReceiver.IconCompatParcelizer(resultReceiver2);
        try {
            return super.submit(runnable);
        } catch (RejectedExecutionException e) {
            resultReceiver2.releaseShared(1);
            this.write = getondismisscallback.RemoteActionCompatParcelizer();
            brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Submit rejected by thread pool executor", e);
            return new MediaSessionCompatToken();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
        JsonObjectSerializer jsonObjectSerializer = this.RemoteActionCompatParcelizer;
        try {
            super.afterExecute(runnable, th);
        } finally {
            ResultReceiver resultReceiver = (ResultReceiver) jsonObjectSerializer.jsonReflectionObjectSerializer;
            int i = ResultReceiver.read;
            resultReceiver.releaseShared(1);
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }
}
