package io.sentry.backpressure;

import com.huawei.riemann.location.common.utils.Constant;
import io.sentry.SentryOptions;
import io.sentry.util.RemoteActionCompatParcelizer;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import o.BrazeActionUtilsWhenMappings;
import o.UriActionExternalSyntheticLambda4;
import o.accessgetDismissSubscriberp;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;

/* JADX INFO: loaded from: classes4.dex */
public final class IconCompatParcelizer implements serializer, Runnable {
    public final SentryOptions IconCompatParcelizer;
    public volatile Future RemoteActionCompatParcelizer;
    public final RemoteActionCompatParcelizer read;
    public int serializer;
    public final accessgetDismissSubscriberp write;

    @Override // io.sentry.backpressure.serializer
    public final int serializer() {
        return this.serializer;
    }

    public IconCompatParcelizer(SentryOptions sentryOptions) {
        accessgetDismissSubscriberp accessgetdismisssubscriberp = accessgetDismissSubscriberp.IconCompatParcelizer;
        this.serializer = 0;
        this.RemoteActionCompatParcelizer = null;
        this.read = new RemoteActionCompatParcelizer();
        this.IconCompatParcelizer = sentryOptions;
        this.write = accessgetdismisssubscriberp;
    }

    @Override // io.sentry.backpressure.serializer
    public final void read() {
        serializer(Constant.ERROR_UNKNOWN);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zRatingCompat = this.write.RatingCompat();
        int i = this.serializer;
        SentryOptions sentryOptions = this.IconCompatParcelizer;
        if (zRatingCompat) {
            if (i > 0) {
                sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Health check positive, reverting to normal sampling.", new Object[0]);
            }
            this.serializer = 0;
        } else if (i < 10) {
            this.serializer = i + 1;
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Health check negative, downsampling with a factor of %d", Integer.valueOf(this.serializer));
        }
        serializer(10000);
    }

    public final void serializer(int i) {
        BrazeActionUtilsWhenMappings executorService = this.IconCompatParcelizer.getExecutorService();
        if (executorService.RemoteActionCompatParcelizer()) {
            return;
        }
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.read.serializer();
        try {
            try {
                this.RemoteActionCompatParcelizer = executorService.IconCompatParcelizer(this, i);
            } catch (RejectedExecutionException e) {
                this.IconCompatParcelizer.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Backpressure monitor reschedule task rejected", e);
            }
            uriActionExternalSyntheticLambda4Serializer.close();
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.backpressure.serializer
    public final void write() {
        Future future = this.RemoteActionCompatParcelizer;
        if (future != null) {
            UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.read.serializer();
            try {
                future.cancel(true);
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th) {
                try {
                    uriActionExternalSyntheticLambda4Serializer.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }
}
