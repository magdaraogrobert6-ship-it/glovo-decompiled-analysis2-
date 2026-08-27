package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.AndroidMemoryReading;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.ranges.RangesKt;
import o.BackspaceCommand;
import o.addAndroidView;
import o.getWindowInfoannotations;
import o.moveFocusInChildrenBypassUnfocusableComposeView3ESFkO8;
import o.setAttached;

/* JADX INFO: loaded from: classes2.dex */
public final class MemoryGaugeCollector {
    public static final getWindowInfoannotations write = getWindowInfoannotations.write();
    public final ScheduledExecutorService IconCompatParcelizer;
    public final Runtime MediaBrowserCompatMediaItem;
    public long RemoteActionCompatParcelizer;
    public final ConcurrentLinkedQueue read;
    public ScheduledFuture serializer;

    public static boolean RemoteActionCompatParcelizer(long j) {
        return j <= 0;
    }

    public final void IconCompatParcelizer(long j, Timer timer) {
        synchronized (this) {
            this.RemoteActionCompatParcelizer = j;
            try {
                this.serializer = this.IconCompatParcelizer.scheduleAtFixedRate(new moveFocusInChildrenBypassUnfocusableComposeView3ESFkO8(this, timer, 0), 0L, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                write.read("Unable to start collecting Memory Metrics: " + e.getMessage());
            }
        }
    }

    public final void read(Timer timer) {
        synchronized (this) {
            try {
                this.IconCompatParcelizer.schedule(new moveFocusInChildrenBypassUnfocusableComposeView3ESFkO8(this, timer, 1), 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                write.read("Unable to collect Memory Metric: " + e.getMessage());
            }
        }
    }

    public MemoryGaugeCollector() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Runtime runtime = Runtime.getRuntime();
        this.serializer = null;
        this.RemoteActionCompatParcelizer = -1L;
        this.IconCompatParcelizer = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.read = new ConcurrentLinkedQueue();
        this.MediaBrowserCompatMediaItem = runtime;
    }

    public final AndroidMemoryReading write(Timer timer) {
        if (timer == null) {
            return null;
        }
        long j = timer.read;
        long j2 = timer.read();
        addAndroidView addandroidviewNewBuilder = AndroidMemoryReading.newBuilder();
        addandroidviewNewBuilder.RemoteActionCompatParcelizer();
        ((AndroidMemoryReading) addandroidviewNewBuilder.RemoteActionCompatParcelizer).setClientTimeUs(j2 + j);
        setAttached setattached = setAttached.BYTES;
        Runtime runtime = this.MediaBrowserCompatMediaItem;
        Object[] objArr = {Long.valueOf(setattached.toKilobytes(runtime.totalMemory() - runtime.freeMemory()))};
        int iWrite = BackspaceCommand.write();
        int iIntValue = ((Integer) RangesKt.read(340022501, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -340022497, iWrite)).intValue();
        addandroidviewNewBuilder.RemoteActionCompatParcelizer();
        ((AndroidMemoryReading) addandroidviewNewBuilder.RemoteActionCompatParcelizer).setUsedAppJavaHeapMemoryKb(iIntValue);
        return (AndroidMemoryReading) addandroidviewNewBuilder.serializer();
    }

    public final void read() {
        ScheduledFuture scheduledFuture = this.serializer;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.serializer = null;
        this.RemoteActionCompatParcelizer = -1L;
    }

    public final void serializer(long j, Timer timer) {
        if (RemoteActionCompatParcelizer(j)) {
            return;
        }
        if (this.serializer == null) {
            IconCompatParcelizer(j, timer);
        } else if (this.RemoteActionCompatParcelizer != j) {
            read();
            IconCompatParcelizer(j, timer);
        }
    }
}
