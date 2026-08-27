package io.sentry.android.core;

import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import com.sentiance.sdk.task.e$$ExternalSyntheticLambda0;
import io.sentry.SentryUUID;
import io.sentry.android.core.internal.util.SentryFrameMetricsCollector;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.BrazeActionUtilsWhenMappings;
import o.UriActionExternalSyntheticLambda4;
import o.getSrcJson;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidProfiler {
    public final int IconCompatParcelizer;
    public final BrazeActionParserExternalSyntheticLambda0 MediaDescriptionCompat;
    public final File PlaybackStateCompat;
    public final BrazeActionUtilsWhenMappings PlaybackStateCompatCustomAction;
    public final SentryFrameMetricsCollector RemoteActionCompatParcelizer;
    public String serializer;
    public long MediaSessionCompatQueueItem = 0;
    public Future MediaBrowserCompatMediaItem = null;
    public File MediaSessionCompatResultReceiverWrapper = null;
    public final ArrayDeque MediaSessionCompatToken = new ArrayDeque();
    public final ArrayDeque ParcelableVolumeInfo = new ArrayDeque();
    public final ArrayDeque write = new ArrayDeque();
    public final HashMap MediaMetadataCompat = new HashMap();
    public volatile boolean read = false;
    public final io.sentry.util.RemoteActionCompatParcelizer RatingCompat = new io.sentry.util.RemoteActionCompatParcelizer();

    public final MediaSessionCompatResultReceiverWrapper IconCompatParcelizer() {
        String strIconCompatParcelizer;
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.RatingCompat.serializer();
        try {
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                this.MediaDescriptionCompat.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Disabling profiling because intervaUs is set to %d", Integer.valueOf(i));
                uriActionExternalSyntheticLambda4Serializer.close();
                return null;
            }
            if (this.read) {
                this.MediaDescriptionCompat.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Profiling has already started...", new Object[0]);
                uriActionExternalSyntheticLambda4Serializer.close();
                return null;
            }
            this.MediaSessionCompatResultReceiverWrapper = new File(this.PlaybackStateCompat, SentryUUID.IconCompatParcelizer().concat(".trace"));
            this.MediaMetadataCompat.clear();
            this.MediaSessionCompatToken.clear();
            this.ParcelableVolumeInfo.clear();
            this.write.clear();
            SentryFrameMetricsCollector sentryFrameMetricsCollector = this.RemoteActionCompatParcelizer;
            PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(this);
            if (sentryFrameMetricsCollector.MediaBrowserCompatMediaItem) {
                strIconCompatParcelizer = SentryUUID.IconCompatParcelizer();
                sentryFrameMetricsCollector.MediaDescriptionCompat.put(strIconCompatParcelizer, playbackStateCompat);
                sentryFrameMetricsCollector.write();
            } else {
                strIconCompatParcelizer = null;
            }
            this.serializer = strIconCompatParcelizer;
            try {
                BrazeActionUtilsWhenMappings brazeActionUtilsWhenMappings = this.PlaybackStateCompatCustomAction;
                if (brazeActionUtilsWhenMappings != null) {
                    this.MediaBrowserCompatMediaItem = brazeActionUtilsWhenMappings.IconCompatParcelizer(new e$$ExternalSyntheticLambda0(18, this), 30000L);
                }
            } catch (RejectedExecutionException e) {
                this.MediaDescriptionCompat.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to call the executor. Profiling will not be automatically finished. Did you call Sentry.close()?", e);
            }
            this.MediaSessionCompatQueueItem = SystemClock.elapsedRealtimeNanos();
            Date dateSerializer = setNativeShader.serializer();
            long elapsedCpuTime = Process.getElapsedCpuTime();
            try {
                Debug.startMethodTracingSampling(this.MediaSessionCompatResultReceiverWrapper.getPath(), 3000000, this.IconCompatParcelizer);
                this.read = true;
                MediaSessionCompatResultReceiverWrapper mediaSessionCompatResultReceiverWrapper = new MediaSessionCompatResultReceiverWrapper(this.MediaSessionCompatQueueItem, elapsedCpuTime, dateSerializer);
                uriActionExternalSyntheticLambda4Serializer.close();
                return mediaSessionCompatResultReceiverWrapper;
            } catch (Throwable th) {
                serializer(null, false);
                this.MediaDescriptionCompat.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Unable to start a profile: ", th);
                this.read = false;
                uriActionExternalSyntheticLambda4Serializer.close();
                return null;
            }
        } catch (Throwable th2) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void RemoteActionCompatParcelizer(List list) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        long j = this.MediaSessionCompatQueueItem;
        long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        if (list != null) {
            ArrayDeque arrayDeque = new ArrayDeque(list.size());
            ArrayDeque arrayDeque2 = new ArrayDeque(list.size());
            ArrayDeque arrayDeque3 = new ArrayDeque(list.size());
            synchronized (list) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    getSrcJson getsrcjson = (getSrcJson) it.next();
                    long j2 = getsrcjson.read;
                    long j3 = ((jElapsedRealtimeNanos - j) - nanos) + j2;
                    Iterator it2 = it;
                    Double d = getsrcjson.serializer;
                    long j4 = jElapsedRealtimeNanos;
                    Long l = getsrcjson.RemoteActionCompatParcelizer;
                    Long l2 = getsrcjson.write;
                    if (d != null) {
                        arrayDeque3.add(new io.sentry.profilemeasurements.IconCompatParcelizer(Long.valueOf(j3), d, j2));
                    }
                    if (l != null) {
                        arrayDeque.add(new io.sentry.profilemeasurements.IconCompatParcelizer(Long.valueOf(j3), l, j2));
                    }
                    if (l2 != null) {
                        arrayDeque2.add(new io.sentry.profilemeasurements.IconCompatParcelizer(Long.valueOf(j3), l2, j2));
                    }
                    it = it2;
                    jElapsedRealtimeNanos = j4;
                    j = j;
                }
            }
            if (!arrayDeque3.isEmpty()) {
                this.MediaMetadataCompat.put("cpu_usage", new io.sentry.profilemeasurements.RemoteActionCompatParcelizer("percent", arrayDeque3));
            }
            if (!arrayDeque.isEmpty()) {
                this.MediaMetadataCompat.put("memory_footprint", new io.sentry.profilemeasurements.RemoteActionCompatParcelizer("byte", arrayDeque));
            }
            if (arrayDeque2.isEmpty()) {
                return;
            }
            this.MediaMetadataCompat.put("memory_native_footprint", new io.sentry.profilemeasurements.RemoteActionCompatParcelizer("byte", arrayDeque2));
        }
    }

    public final PlaybackStateCompatCustomAction serializer(List list, boolean z) {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.RatingCompat.serializer();
        try {
            if (!this.read) {
                this.MediaDescriptionCompat.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Profiler not running", new Object[0]);
                uriActionExternalSyntheticLambda4Serializer.close();
                return null;
            }
            try {
                Debug.stopMethodTracing();
            } catch (Throwable th) {
                try {
                    this.MediaDescriptionCompat.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error while stopping profiling: ", th);
                } catch (Throwable th2) {
                    this.read = false;
                    throw th2;
                }
            }
            this.read = false;
            this.RemoteActionCompatParcelizer.read(this.serializer);
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long elapsedCpuTime = Process.getElapsedCpuTime();
            if (this.MediaSessionCompatResultReceiverWrapper == null) {
                this.MediaDescriptionCompat.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Trace file does not exists", new Object[0]);
                uriActionExternalSyntheticLambda4Serializer.close();
                return null;
            }
            if (!this.ParcelableVolumeInfo.isEmpty()) {
                this.MediaMetadataCompat.put("slow_frame_renders", new io.sentry.profilemeasurements.RemoteActionCompatParcelizer("nanosecond", this.ParcelableVolumeInfo));
            }
            if (!this.write.isEmpty()) {
                this.MediaMetadataCompat.put("frozen_frame_renders", new io.sentry.profilemeasurements.RemoteActionCompatParcelizer("nanosecond", this.write));
            }
            if (!this.MediaSessionCompatToken.isEmpty()) {
                this.MediaMetadataCompat.put("screen_frame_rates", new io.sentry.profilemeasurements.RemoteActionCompatParcelizer("hz", this.MediaSessionCompatToken));
            }
            RemoteActionCompatParcelizer(list);
            Future future = this.MediaBrowserCompatMediaItem;
            if (future != null) {
                future.cancel(true);
                this.MediaBrowserCompatMediaItem = null;
            }
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = new PlaybackStateCompatCustomAction(jElapsedRealtimeNanos, elapsedCpuTime, z, this.MediaSessionCompatResultReceiverWrapper, this.MediaMetadataCompat);
            uriActionExternalSyntheticLambda4Serializer.close();
            return playbackStateCompatCustomAction;
        } catch (Throwable th3) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public AndroidProfiler(String str, int i, SentryFrameMetricsCollector sentryFrameMetricsCollector, BrazeActionUtilsWhenMappings brazeActionUtilsWhenMappings, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        setNativeShader.read(str, "TracesFilesDirPath is required");
        this.PlaybackStateCompat = new File(str);
        this.IconCompatParcelizer = i;
        setNativeShader.read(brazeActionParserExternalSyntheticLambda0, "Logger is required");
        this.MediaDescriptionCompat = brazeActionParserExternalSyntheticLambda0;
        this.PlaybackStateCompatCustomAction = brazeActionUtilsWhenMappings;
        setNativeShader.read(sentryFrameMetricsCollector, "SentryFrameMetricsCollector is required");
        this.RemoteActionCompatParcelizer = sentryFrameMetricsCollector;
    }
}
