package io.sentry.logger;

import com.sentiance.sdk.task.e$$ExternalSyntheticLambda0;
import io.grpc.internal.CallTracer;
import io.sentry.JsonObjectSerializer;
import io.sentry.SentryClient;
import io.sentry.SentryOptions;
import io.sentry.transport.ResultReceiver;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import o.UriActionExternalSyntheticLambda4;
import o.executelambda4;
import o.isAutomaticGeofenceRequestsEnabled;
import o.openUriWithActionViewFromPush;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaPr0ZOhNGrdffbcGPp9OwzbUm0I;
import o.r8lambdaWGrR1CtqcsOMIGuyJGvK752EZY;

/* JADX INFO: loaded from: classes4.dex */
public class IconCompatParcelizer implements write {
    public volatile Future MediaSessionCompatQueueItem;
    public final SentryClient RemoteActionCompatParcelizer;
    public final CallTracer serializer;
    public final SentryOptions write;
    public final io.sentry.util.RemoteActionCompatParcelizer MediaBrowserCompatMediaItem = new io.sentry.util.RemoteActionCompatParcelizer();
    public volatile boolean read = false;
    public volatile boolean IconCompatParcelizer = false;
    public final JsonObjectSerializer MediaMetadataCompat = new JsonObjectSerializer((byte) 0, 13);
    public final ConcurrentLinkedQueue MediaDescriptionCompat = new ConcurrentLinkedQueue();

    @Override // io.sentry.logger.write
    public final void IconCompatParcelizer(long j) {
        serializer(true, true);
        try {
            ((ResultReceiver) this.MediaMetadataCompat.jsonReflectionObjectSerializer).tryAcquireSharedNanos(1, TimeUnit.MILLISECONDS.toNanos(j));
        } catch (InterruptedException e) {
            this.write.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to flush log events", e);
            Thread.currentThread().interrupt();
        }
    }

    @Override // io.sentry.logger.write
    public void read(boolean z) {
        this.IconCompatParcelizer = true;
        if (z) {
            serializer(true, true);
            this.serializer.RemoteActionCompatParcelizer(new e$$ExternalSyntheticLambda0(25, this));
        } else {
            this.serializer.RemoteActionCompatParcelizer(this.write.getShutdownTimeoutMillis());
            while (!this.MediaDescriptionCompat.isEmpty()) {
                read();
            }
        }
    }

    public final void read() {
        ArrayList arrayList = new ArrayList(100);
        do {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.MediaDescriptionCompat;
            r8lambdaWGrR1CtqcsOMIGuyJGvK752EZY r8lambdawgrr1ctqcsomiguyjgvk752ezy = (r8lambdaWGrR1CtqcsOMIGuyJGvK752EZY) concurrentLinkedQueue.poll();
            if (r8lambdawgrr1ctqcsomiguyjgvk752ezy != null) {
                arrayList.add(r8lambdawgrr1ctqcsomiguyjgvk752ezy);
            }
            if (concurrentLinkedQueue.isEmpty()) {
                break;
            }
        } while (arrayList.size() < 100);
        if (arrayList.isEmpty()) {
            return;
        }
        r8lambdaPr0ZOhNGrdffbcGPp9OwzbUm0I r8lambdapr0zohngrdffbcgpp9owzbum0i = new r8lambdaPr0ZOhNGrdffbcGPp9OwzbUm0I(arrayList);
        SentryClient sentryClient = this.RemoteActionCompatParcelizer;
        sentryClient.getClass();
        try {
            sentryClient.IconCompatParcelizer(sentryClient.serializer(r8lambdapr0zohngrdffbcgpp9owzbum0i), (executelambda4) null);
        } catch (IOException e) {
            ((SentryOptions) sentryClient.RemoteActionCompatParcelizer).getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, e, "Capturing logs failed.", new Object[0]);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            ResultReceiver resultReceiver = (ResultReceiver) this.MediaMetadataCompat.jsonReflectionObjectSerializer;
            int i2 = ResultReceiver.read;
            resultReceiver.releaseShared(1);
        }
    }

    public IconCompatParcelizer(SentryOptions sentryOptions, SentryClient sentryClient) {
        this.write = sentryOptions;
        this.RemoteActionCompatParcelizer = sentryClient;
        this.serializer = new CallTracer(sentryOptions);
    }

    @Override // io.sentry.logger.write
    public final void RemoteActionCompatParcelizer(r8lambdaWGrR1CtqcsOMIGuyJGvK752EZY r8lambdawgrr1ctqcsomiguyjgvk752ezy) {
        if (this.IconCompatParcelizer) {
            return;
        }
        if (ResultReceiver.serializer((ResultReceiver) this.MediaMetadataCompat.jsonReflectionObjectSerializer) < 1000) {
            ResultReceiver.IconCompatParcelizer((ResultReceiver) this.MediaMetadataCompat.jsonReflectionObjectSerializer);
            this.MediaDescriptionCompat.offer(r8lambdawgrr1ctqcsomiguyjgvk752ezy);
            serializer(false, false);
        } else {
            io.sentry.clientreport.IconCompatParcelizer clientReportRecorder = this.write.getClientReportRecorder();
            io.sentry.clientreport.read readVar = io.sentry.clientreport.read.QUEUE_OVERFLOW;
            clientReportRecorder.IconCompatParcelizer(readVar, openUriWithActionViewFromPush.LogItem);
            this.write.getClientReportRecorder().read(readVar, openUriWithActionViewFromPush.LogByte, io.sentry.util.write.write(this.write.getSerializer(), this.write.getLogger(), r8lambdawgrr1ctqcsomiguyjgvk752ezy));
        }
    }

    public final void serializer(boolean z, boolean z2) {
        if (!this.read || z) {
            UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.MediaBrowserCompatMediaItem.serializer();
            try {
                Future future = this.MediaSessionCompatQueueItem;
                if (z || future == null || future.isDone() || future.isCancelled()) {
                    this.read = true;
                    try {
                        this.MediaSessionCompatQueueItem = this.serializer.IconCompatParcelizer(new isAutomaticGeofenceRequestsEnabled(28, this), z2 ? 0 : 5000);
                    } catch (RejectedExecutionException e) {
                        this.read = false;
                        this.write.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Logs batch processor flush task rejected", e);
                    }
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
    }
}
