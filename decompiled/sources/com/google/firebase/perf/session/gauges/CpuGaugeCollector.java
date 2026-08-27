package com.google.firebase.perf.session.gauges;

import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.CpuMetricReading;
import io.sentry.instrumentation.file.IconCompatParcelizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import o.boundsUpdatesAccessibilityEventLoop;
import o.getWindowInfoannotations;
import o.isPositionChanged;

/* JADX INFO: loaded from: classes2.dex */
public final class CpuGaugeCollector {
    public static final getWindowInfoannotations RemoteActionCompatParcelizer = getWindowInfoannotations.write();
    public static final long write = 1000000;
    public ScheduledFuture MediaBrowserCompatMediaItem = null;
    public long serializer = -1;
    public final ConcurrentLinkedQueue RatingCompat = new ConcurrentLinkedQueue();
    public final ScheduledExecutorService IconCompatParcelizer = Executors.newSingleThreadScheduledExecutor();
    public final String MediaMetadataCompat = "/proc/" + Integer.toString(Process.myPid()) + "/stat";
    public final long read = Os.sysconf(OsConstants._SC_CLK_TCK);

    public static boolean RemoteActionCompatParcelizer(long j) {
        return j <= 0;
    }

    public final void IconCompatParcelizer(long j, Timer timer) {
        synchronized (this) {
            this.serializer = j;
            try {
                this.MediaBrowserCompatMediaItem = this.IconCompatParcelizer.scheduleAtFixedRate(new isPositionChanged(this, timer, 0), 0L, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                RemoteActionCompatParcelizer.read("Unable to start collecting Cpu Metrics: " + e.getMessage());
            }
        }
    }

    public final CpuMetricReading serializer(Timer timer) {
        long j = this.read;
        getWindowInfoannotations getwindowinfoannotations = RemoteActionCompatParcelizer;
        if (timer == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new IconCompatParcelizer(this.MediaMetadataCompat));
            try {
                long j2 = timer.read;
                long j3 = timer.read();
                String[] strArrSplit = bufferedReader.readLine().split(" ");
                long j4 = Long.parseLong(strArrSplit[13]);
                long j5 = Long.parseLong(strArrSplit[15]);
                long j6 = Long.parseLong(strArrSplit[14]);
                long j7 = Long.parseLong(strArrSplit[16]);
                boundsUpdatesAccessibilityEventLoop boundsupdatesaccessibilityeventloopNewBuilder = CpuMetricReading.newBuilder();
                boundsupdatesaccessibilityeventloopNewBuilder.RemoteActionCompatParcelizer();
                ((CpuMetricReading) boundsupdatesaccessibilityeventloopNewBuilder.RemoteActionCompatParcelizer).setClientTimeUs(j3 + j2);
                double d = j;
                double d2 = write;
                long jRound = Math.round(((j6 + j7) / d) * d2);
                boundsupdatesaccessibilityeventloopNewBuilder.RemoteActionCompatParcelizer();
                ((CpuMetricReading) boundsupdatesaccessibilityeventloopNewBuilder.RemoteActionCompatParcelizer).setSystemTimeUs(jRound);
                long jRound2 = Math.round(((j4 + j5) / d) * d2);
                boundsupdatesaccessibilityeventloopNewBuilder.RemoteActionCompatParcelizer();
                ((CpuMetricReading) boundsupdatesaccessibilityeventloopNewBuilder.RemoteActionCompatParcelizer).setUserTimeUs(jRound2);
                CpuMetricReading cpuMetricReading = (CpuMetricReading) boundsupdatesaccessibilityeventloopNewBuilder.serializer();
                bufferedReader.close();
                return cpuMetricReading;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (IOException e) {
            getwindowinfoannotations.read("Unable to read 'proc/[pid]/stat' file: " + e.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException e2) {
            e = e2;
            getwindowinfoannotations.read("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            getwindowinfoannotations.read("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NumberFormatException e4) {
            e = e4;
            getwindowinfoannotations.read("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        }
    }

    public final void serializer(long j, Timer timer) {
        long j2 = this.read;
        if (j2 == -1 || j2 == 0 || RemoteActionCompatParcelizer(j)) {
            return;
        }
        if (this.MediaBrowserCompatMediaItem == null) {
            IconCompatParcelizer(j, timer);
        } else if (this.serializer != j) {
            RemoteActionCompatParcelizer();
            IconCompatParcelizer(j, timer);
        }
    }

    public final void write(Timer timer) {
        synchronized (this) {
            try {
                this.IconCompatParcelizer.schedule(new isPositionChanged(this, timer, 1), 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                RemoteActionCompatParcelizer.read("Unable to collect Cpu Metric: " + e.getMessage());
            }
        }
    }

    public final void RemoteActionCompatParcelizer() {
        ScheduledFuture scheduledFuture = this.MediaBrowserCompatMediaItem;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.MediaBrowserCompatMediaItem = null;
        this.serializer = -1L;
    }
}
