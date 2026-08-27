package io.sentry.android.core;

import android.os.SystemClock;
import java.util.Date;
import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
public final class PlaybackStateCompat implements io.sentry.android.core.internal.util.PlaybackStateCompat {
    public final /* synthetic */ AndroidProfiler IconCompatParcelizer;
    public float read = 0.0f;

    public PlaybackStateCompat(AndroidProfiler androidProfiler) {
        this.IconCompatParcelizer = androidProfiler;
    }

    @Override // io.sentry.android.core.internal.util.PlaybackStateCompat
    public final void read(long j, long j2, long j3, long j4, boolean z, boolean z2, float f) {
        Date dateSerializer = setNativeShader.serializer();
        System.nanoTime();
        long time = dateSerializer.getTime() * 1000000;
        long jNanoTime = System.nanoTime();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        AndroidProfiler androidProfiler = this.IconCompatParcelizer;
        long j5 = (jElapsedRealtimeNanos + (j2 - jNanoTime)) - androidProfiler.MediaSessionCompatQueueItem;
        if (j5 < 0) {
            return;
        }
        if (z2) {
            androidProfiler.write.addLast(new io.sentry.profilemeasurements.IconCompatParcelizer(Long.valueOf(j5), Long.valueOf(j3), time));
        } else if (z) {
            androidProfiler.ParcelableVolumeInfo.addLast(new io.sentry.profilemeasurements.IconCompatParcelizer(Long.valueOf(j5), Long.valueOf(j3), time));
        }
        if (f != this.read) {
            this.read = f;
            androidProfiler.MediaSessionCompatToken.addLast(new io.sentry.profilemeasurements.IconCompatParcelizer(Long.valueOf(j5), Float.valueOf(f), time));
        }
    }
}
