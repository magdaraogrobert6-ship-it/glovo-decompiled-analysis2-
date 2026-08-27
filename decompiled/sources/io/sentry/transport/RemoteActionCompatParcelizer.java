package io.sentry.transport;

import io.sentry.SentryEnvelopeItem;
import io.sentry.SentryOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.BannerViewExternalSyntheticLambda3;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.createBannerWebViewClientListenerandroid_sdk_ui_release;
import o.executelambda4;
import o.getOnDismissCallback;
import o.getUriActionForCard;
import o.openUriWithActionViewFromPush;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambdaAHg7GxSREelZY1m8VqK5C6Qd4;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.setNativeShader;
import o.setOnDismissCallback;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class RemoteActionCompatParcelizer implements MediaDescriptionCompat {
    public final PlaybackStateCompatCustomAction IconCompatParcelizer;
    public final PlaybackStateCompat MediaDescriptionCompat;
    public final MediaMetadataCompat MediaMetadataCompat;
    public final read RemoteActionCompatParcelizer;
    public volatile serializer read;
    public final SentryOptions serializer;
    public final io.sentry.cache.serializer write;

    @Override // io.sentry.transport.MediaDescriptionCompat
    public final PlaybackStateCompat write() {
        return this.MediaDescriptionCompat;
    }

    @Override // io.sentry.transport.MediaDescriptionCompat
    public final void IconCompatParcelizer(long j) {
        PlaybackStateCompatCustomAction playbackStateCompatCustomAction = this.IconCompatParcelizer;
        playbackStateCompatCustomAction.getClass();
        try {
            ((ResultReceiver) playbackStateCompatCustomAction.RemoteActionCompatParcelizer.jsonReflectionObjectSerializer).tryAcquireSharedNanos(1, TimeUnit.MILLISECONDS.toNanos(j));
        } catch (InterruptedException e) {
            playbackStateCompatCustomAction.IconCompatParcelizer.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to wait till idle", e);
            Thread.currentThread().interrupt();
        }
    }

    @Override // io.sentry.transport.MediaDescriptionCompat
    public final void RemoteActionCompatParcelizer(boolean z) {
        this.MediaDescriptionCompat.close();
        this.IconCompatParcelizer.shutdown();
        this.serializer.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Shutting down", new Object[0]);
        if (z) {
            return;
        }
        try {
            long flushTimeoutMillis = this.serializer.getFlushTimeoutMillis();
            if (this.IconCompatParcelizer.awaitTermination(flushTimeoutMillis, TimeUnit.MILLISECONDS)) {
                return;
            }
            this.serializer.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Failed to shutdown the async connection async sender  within " + flushTimeoutMillis + " ms. Trying to force it now.", new Object[0]);
            this.IconCompatParcelizer.shutdownNow();
            if (this.read != null) {
                this.IconCompatParcelizer.getRejectedExecutionHandler().rejectedExecution(this.read, this.IconCompatParcelizer);
            }
        } catch (InterruptedException unused) {
            this.serializer.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
            Thread.currentThread().interrupt();
        }
    }

    @Override // io.sentry.transport.MediaDescriptionCompat
    public final boolean read() {
        boolean z;
        PlaybackStateCompat playbackStateCompat = this.MediaDescriptionCompat;
        playbackStateCompat.getClass();
        ((IconCompatParcelizer) playbackStateCompat.read).getClass();
        Date date = new Date(System.currentTimeMillis());
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) playbackStateCompat.write;
        Iterator it = concurrentHashMap.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Date date2 = (Date) concurrentHashMap.get((openUriWithActionViewFromPush) it.next());
            if (date2 != null && !date.after(date2)) {
                z = true;
                break;
            }
        }
        PlaybackStateCompatCustomAction playbackStateCompatCustomAction = this.IconCompatParcelizer;
        createBannerWebViewClientListenerandroid_sdk_ui_release createbannerwebviewclientlistenerandroid_sdk_ui_release = playbackStateCompatCustomAction.write;
        return (z || (createbannerwebviewclientlistenerandroid_sdk_ui_release != null && (playbackStateCompatCustomAction.serializer.RemoteActionCompatParcelizer().read(createbannerwebviewclientlistenerandroid_sdk_ui_release) > 2000000000L ? 1 : (playbackStateCompatCustomAction.serializer.RemoteActionCompatParcelizer().read(createbannerwebviewclientlistenerandroid_sdk_ui_release) == 2000000000L ? 0 : -1)) < 0)) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [io.sentry.transport.write] */
    public RemoteActionCompatParcelizer(SentryOptions sentryOptions, PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat, OkHttpCall$1 okHttpCall$1) {
        int maxQueueSize = sentryOptions.getMaxQueueSize();
        final io.sentry.cache.serializer envelopeDiskCache = sentryOptions.getEnvelopeDiskCache();
        final BrazeActionParserExternalSyntheticLambda0 logger = sentryOptions.getLogger();
        getOnDismissCallback dateProvider = sentryOptions.getDateProvider();
        PlaybackStateCompatCustomAction playbackStateCompatCustomAction = new PlaybackStateCompatCustomAction(maxQueueSize, new BannerViewExternalSyntheticLambda3(1), new RejectedExecutionHandler() { // from class: io.sentry.transport.write
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                if (runnable instanceof serializer) {
                    serializer serializerVar = (serializer) runnable;
                    executelambda4 executelambda4Var = serializerVar.write;
                    if (!pauseWebviewIfNecessarylambda10.RemoteActionCompatParcelizer(executelambda4Var, io.sentry.hints.serializer.class)) {
                        envelopeDiskCache.write(serializerVar.RemoteActionCompatParcelizer, executelambda4Var);
                    }
                    Object obj = executelambda4Var.read("sentry:typeCheckHint");
                    if (io.sentry.hints.MediaSessionCompatToken.class.isInstance(executelambda4Var.read("sentry:typeCheckHint")) && obj != null) {
                        ((io.sentry.hints.MediaSessionCompatToken) obj).write(false);
                    }
                    Object obj2 = executelambda4Var.read("sentry:typeCheckHint");
                    if (io.sentry.hints.MediaDescriptionCompat.class.isInstance(executelambda4Var.read("sentry:typeCheckHint")) && obj2 != null) {
                        ((io.sentry.hints.MediaDescriptionCompat) obj2).read(true);
                    }
                    logger.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Envelope rejected", new Object[0]);
                }
            }
        }, logger, dateProvider);
        read readVar = new read(sentryOptions, okHttpCall$1, playbackStateCompat);
        this.read = null;
        this.IconCompatParcelizer = playbackStateCompatCustomAction;
        io.sentry.cache.serializer envelopeDiskCache2 = sentryOptions.getEnvelopeDiskCache();
        setNativeShader.read(envelopeDiskCache2, "envelopeCache is required");
        this.write = envelopeDiskCache2;
        this.serializer = sentryOptions;
        this.MediaDescriptionCompat = playbackStateCompat;
        setNativeShader.read(mediaMetadataCompat, "transportGate is required");
        this.MediaMetadataCompat = mediaMetadataCompat;
        this.RemoteActionCompatParcelizer = readVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:60:0x00e5  */
    @Override // io.sentry.transport.MediaDescriptionCompat
    public final void IconCompatParcelizer(OkHttpCall$1 okHttpCall$1, executelambda4 executelambda4Var) {
        io.sentry.cache.serializer serializerVar;
        boolean z;
        OkHttpCall$1 okHttpCall$1Write;
        List listSingletonList;
        Iterable<SentryEnvelopeItem> iterable = (Iterable) okHttpCall$1.serializer;
        boolean zRemoteActionCompatParcelizer = pauseWebviewIfNecessarylambda10.RemoteActionCompatParcelizer(executelambda4Var, io.sentry.hints.serializer.class);
        SentryOptions sentryOptions = this.serializer;
        io.sentry.cache.serializer serializerVar2 = this.write;
        if (zRemoteActionCompatParcelizer) {
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Captured Envelope is already cached", new Object[0]);
            serializerVar = RatingCompat.RemoteActionCompatParcelizer;
            z = true;
        } else {
            serializerVar = serializerVar2;
            z = false;
        }
        PlaybackStateCompat playbackStateCompat = this.MediaDescriptionCompat;
        SentryOptions sentryOptions2 = (SentryOptions) playbackStateCompat.RemoteActionCompatParcelizer;
        ArrayList arrayList = null;
        for (SentryEnvelopeItem sentryEnvelopeItem : iterable) {
            String itemType = sentryEnvelopeItem.RemoteActionCompatParcelizer.MediaMetadataCompat.getItemType();
            itemType.getClass();
            switch (itemType) {
                case "attachment":
                    listSingletonList = Collections.singletonList(openUriWithActionViewFromPush.Attachment);
                    break;
                case "replay_video":
                    listSingletonList = Collections.singletonList(openUriWithActionViewFromPush.Replay);
                    break;
                case "profile_chunk":
                    listSingletonList = Arrays.asList(openUriWithActionViewFromPush.ProfileChunkUi, openUriWithActionViewFromPush.ProfileChunk);
                    break;
                case "profile":
                    listSingletonList = Collections.singletonList(openUriWithActionViewFromPush.Profile);
                    break;
                case "feedback":
                    listSingletonList = Collections.singletonList(openUriWithActionViewFromPush.Feedback);
                    break;
                case "log":
                    listSingletonList = Collections.singletonList(openUriWithActionViewFromPush.LogItem);
                    break;
                case "span":
                    listSingletonList = Collections.singletonList(openUriWithActionViewFromPush.Span);
                    break;
                case "event":
                    listSingletonList = Collections.singletonList(openUriWithActionViewFromPush.Error);
                    break;
                case "trace_metric":
                    listSingletonList = Collections.singletonList(openUriWithActionViewFromPush.TraceMetric);
                    break;
                case "check_in":
                    listSingletonList = Collections.singletonList(openUriWithActionViewFromPush.Monitor);
                    break;
                case "session":
                    listSingletonList = Collections.singletonList(openUriWithActionViewFromPush.Session);
                    break;
                case "transaction":
                    listSingletonList = Collections.singletonList(openUriWithActionViewFromPush.Transaction);
                    break;
                default:
                    listSingletonList = Collections.singletonList(openUriWithActionViewFromPush.Unknown);
                    break;
            }
            Iterator it = listSingletonList.iterator();
            while (it.hasNext()) {
                if (playbackStateCompat.serializer((openUriWithActionViewFromPush) it.next())) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(sentryEnvelopeItem);
                    sentryOptions2.getClientReportRecorder().RemoteActionCompatParcelizer(io.sentry.clientreport.read.RATELIMIT_BACKOFF, sentryEnvelopeItem);
                    break;
                }
            }
        }
        if (arrayList != null) {
            sentryOptions2.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "%d envelope items will be dropped due rate limiting.", Integer.valueOf(arrayList.size()));
            ArrayList arrayList2 = new ArrayList();
            for (SentryEnvelopeItem sentryEnvelopeItem2 : iterable) {
                if (!arrayList.contains(sentryEnvelopeItem2)) {
                    arrayList2.add(sentryEnvelopeItem2);
                }
            }
            if (arrayList2.isEmpty()) {
                sentryOptions2.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Envelope discarded due all items rate limited.", new Object[0]);
                Object obj = executelambda4Var.read("sentry:typeCheckHint");
                if (io.sentry.hints.MediaSessionCompatToken.class.isInstance(executelambda4Var.read("sentry:typeCheckHint")) && obj != null) {
                    ((io.sentry.hints.MediaSessionCompatToken) obj).write(false);
                }
                Object obj2 = executelambda4Var.read("sentry:typeCheckHint");
                if (io.sentry.hints.MediaDescriptionCompat.class.isInstance(executelambda4Var.read("sentry:typeCheckHint")) && obj2 != null) {
                    ((io.sentry.hints.MediaDescriptionCompat) obj2).read(false);
                }
                Object obj3 = executelambda4Var.read("sentry:typeCheckHint");
                if (io.sentry.hints.read.class.isInstance(executelambda4Var.read("sentry:typeCheckHint")) && obj3 != null) {
                    ((io.sentry.hints.read) obj3).RatingCompat.countDown();
                    sentryOptions2.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Disk flush envelope fired due to rate limit", new Object[0]);
                }
                okHttpCall$1Write = null;
            } else {
                okHttpCall$1Write = new OkHttpCall$1((setOnDismissCallback) okHttpCall$1.write, (List) arrayList2);
            }
        } else {
            okHttpCall$1Write = okHttpCall$1;
        }
        if (okHttpCall$1Write == null) {
            if (z) {
                serializerVar2.IconCompatParcelizer(okHttpCall$1);
                return;
            }
            return;
        }
        if (getUriActionForCard.class.isInstance(executelambda4Var.read("sentry:typeCheckHint"))) {
            okHttpCall$1Write = sentryOptions.getClientReportRecorder().write(okHttpCall$1Write);
        }
        Future futureSubmit = this.IconCompatParcelizer.submit(new serializer(this, okHttpCall$1Write, executelambda4Var, serializerVar));
        if (futureSubmit != null && futureSubmit.isCancelled()) {
            sentryOptions.getClientReportRecorder().IconCompatParcelizer(io.sentry.clientreport.read.QUEUE_OVERFLOW, okHttpCall$1Write);
            return;
        }
        Object obj4 = executelambda4Var.read("sentry:typeCheckHint");
        if (!r8lambdaAHg7GxSREelZY1m8VqK5C6Qd4.class.isInstance(executelambda4Var.read("sentry:typeCheckHint")) || obj4 == null) {
            return;
        }
        r8lambdaAHg7GxSREelZY1m8VqK5C6Qd4 r8lambdaahg7gxsreelzy1m8vqk5c6qd4 = (r8lambdaAHg7GxSREelZY1m8VqK5C6Qd4) obj4;
        r8lambdaahg7gxsreelzy1m8vqk5c6qd4.read.add(r8lambdaahg7gxsreelzy1m8vqk5c6qd4.RemoteActionCompatParcelizer);
        sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Envelope enqueued", new Object[0]);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        RemoteActionCompatParcelizer(false);
    }
}
