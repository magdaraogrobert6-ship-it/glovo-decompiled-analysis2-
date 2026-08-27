package io.sentry.android.core;

import io.sentry.SentryTracer$$ExternalSyntheticLambda1;
import io.socket.client.Manager$7;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicLong;
import o.UriActionExternalSyntheticLambda4;
import o.accessgetDismissSubscriberp;
import o.getIntentArrayWithConfiguredBackStacklambda1;
import o.internalHeightCallbacklambda0;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;

/* JADX INFO: loaded from: classes4.dex */
public final class addObserverForBackInvokerlambda0 implements r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 {
    public final long MediaDescriptionCompat;
    public Manager$7 MediaMetadataCompat;
    public final boolean RemoteActionCompatParcelizer;
    public final boolean read;
    public final AtomicLong IconCompatParcelizer = new AtomicLong(0);
    public final io.sentry.util.MediaMetadataCompat MediaSessionCompatQueueItem = new io.sentry.util.MediaMetadataCompat(new ActivityLifecycleIntegration$$ExternalSyntheticLambda1(21));
    public final io.sentry.util.RemoteActionCompatParcelizer RatingCompat = new io.sentry.util.RemoteActionCompatParcelizer();
    public final accessgetDismissSubscriberp write = accessgetDismissSubscriberp.IconCompatParcelizer;
    public final io.sentry.transport.IconCompatParcelizer serializer = io.sentry.transport.IconCompatParcelizer.write;

    @Override // io.sentry.android.core.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8
    public final void D_() {
        this.serializer.getClass();
        this.IconCompatParcelizer.set(System.currentTimeMillis());
        this.write.RemoteActionCompatParcelizer().getReplayController().MediaDescriptionCompat();
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.RatingCompat.serializer();
        try {
            write();
            this.MediaMetadataCompat = new Manager$7(3, this);
            ((Timer) this.MediaSessionCompatQueueItem.IconCompatParcelizer()).schedule(this.MediaMetadataCompat, this.MediaDescriptionCompat);
            uriActionExternalSyntheticLambda4Serializer.close();
            write("background");
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void write() {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.RatingCompat.serializer();
        try {
            Manager$7 manager$7 = this.MediaMetadataCompat;
            if (manager$7 != null) {
                manager$7.cancel();
                this.MediaMetadataCompat = null;
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

    @Override // io.sentry.android.core.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8
    public final void RemoteActionCompatParcelizer() {
        write();
        this.serializer.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SentryTracer$$ExternalSyntheticLambda1 sentryTracer$$ExternalSyntheticLambda1 = new SentryTracer$$ExternalSyntheticLambda1(9, this);
        accessgetDismissSubscriberp accessgetdismisssubscriberp = this.write;
        accessgetdismisssubscriberp.getClass();
        internalHeightCallbacklambda0.read(sentryTracer$$ExternalSyntheticLambda1);
        AtomicLong atomicLong = this.IconCompatParcelizer;
        long j = atomicLong.get();
        if (j == 0 || j + this.MediaDescriptionCompat <= jCurrentTimeMillis) {
            if (this.read) {
                accessgetdismisssubscriberp.MediaSessionCompatQueueItem();
            }
            accessgetdismisssubscriberp.RemoteActionCompatParcelizer().getReplayController().RatingCompat();
        }
        accessgetdismisssubscriberp.RemoteActionCompatParcelizer().getReplayController().MediaBrowserCompatMediaItem();
        atomicLong.set(jCurrentTimeMillis);
        write("foreground");
    }

    public final void write(String str) {
        if (this.RemoteActionCompatParcelizer) {
            getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda1 = new getIntentArrayWithConfiguredBackStacklambda1();
            getintentarraywithconfiguredbackstacklambda1.MediaSessionCompatQueueItem = "navigation";
            getintentarraywithconfiguredbackstacklambda1.read(str, "state");
            getintentarraywithconfiguredbackstacklambda1.write = "app.lifecycle";
            getintentarraywithconfiguredbackstacklambda1.read = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO;
            this.write.read(getintentarraywithconfiguredbackstacklambda1);
        }
    }

    public addObserverForBackInvokerlambda0(long j, boolean z, boolean z2) {
        this.MediaDescriptionCompat = j;
        this.read = z;
        this.RemoteActionCompatParcelizer = z2;
    }
}
