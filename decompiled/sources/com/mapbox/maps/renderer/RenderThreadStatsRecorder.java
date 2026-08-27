package com.mapbox.maps.renderer;

import android.os.SystemClock;
import com.mapbox.maps.MapboxExperimental;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.util.ArrayList;
import java.util.List;
import o.onContentCardDismissed;

/* JADX INFO: loaded from: classes4.dex */
@MapboxExperimental
public final class RenderThreadStatsRecorder {
    private final List<Double> frameTimeList = new ArrayList();
    private long startTime;
    private long totalDroppedFrames;

    public final boolean isRecording() {
        return this.startTime != 0;
    }

    private final Double percentileOfSortedList(List<Double> list, double d) {
        return (Double) onContentCardDismissed.read(((int) Math.ceil((d / 100.0d) * ((double) list.size()))) - 1, list);
    }

    public final void addFrameStats$maps_sdk_release(double d, int i) {
        this.totalDroppedFrames += (long) i;
        this.frameTimeList.add(Double.valueOf(d));
    }

    public final RenderThreadStats end() {
        if (!isRecording()) {
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("RendererStatRecorder: start() was not called!");
            return null;
        }
        List<Double> listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(this.frameTimeList);
        List<Double> listPlaybackStateCompatCustomAction = onContentCardDismissed.PlaybackStateCompatCustomAction(this.frameTimeList);
        RenderThreadStats renderThreadStatsBuild = new RenderThreadStats.Builder().setTotalTime(SystemClock.elapsedRealtime() - this.startTime).setTotalFrames(((long) this.frameTimeList.size()) + this.totalDroppedFrames).setTotalDroppedFrames(this.totalDroppedFrames).setFrameTimeList(listPlaybackStateCompat).setPercentile50(percentileOfSortedList(listPlaybackStateCompatCustomAction, 50.0d)).setPercentile90(percentileOfSortedList(listPlaybackStateCompatCustomAction, 90.0d)).setPercentile95(percentileOfSortedList(listPlaybackStateCompatCustomAction, 95.0d)).setPercentile99(percentileOfSortedList(listPlaybackStateCompatCustomAction, 99.0d)).build();
        this.startTime = 0L;
        this.totalDroppedFrames = 0L;
        this.frameTimeList.clear();
        return renderThreadStatsBuild;
    }

    public final void start() {
        if (isRecording()) {
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("RendererStatRecorder: end() was not called after previous start()!");
        } else {
            this.startTime = SystemClock.elapsedRealtime();
        }
    }
}
