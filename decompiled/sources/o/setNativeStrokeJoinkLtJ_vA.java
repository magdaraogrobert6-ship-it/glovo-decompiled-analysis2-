package o;

import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import io.sentry.metrics.MetricsBatchProcessor;

/* JADX INFO: loaded from: classes.dex */
public final class setNativeStrokeJoinkLtJ_vA extends setNativeShader {
    public final setNativeAntiAlias ParcelableVolumeInfo;

    @Override // o.setNativeShader
    public final long serializer(FrameMetrics frameMetrics) {
        return frameMetrics.getMetric(13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setNativeStrokeJoinkLtJ_vA(setNativeColor4WTKRHQ setnativecolor4wtkrhq, View view, Window window) {
        super(setnativecolor4wtkrhq, view, window);
        window.getClass();
        this.ParcelableVolumeInfo = new setNativeAntiAlias(0L, 0L, 0L, 0L, 0L, false, this.PlaybackStateCompat);
    }

    @Override // o.setNativeShader
    public final setNativeBlendModeGB0RdKg write(long j, long j2, FrameMetrics frameMetrics) {
        long metric = frameMetrics.getMetric(0);
        long metric2 = frameMetrics.getMetric(1);
        long metric3 = frameMetrics.getMetric(2);
        long metric4 = frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + metric3 + metric2 + metric;
        long j3 = j + metric4;
        this.MediaDescriptionCompat = j3;
        MetricsBatchProcessor metricsBatchProcessor = this.MediaBrowserCompatMediaItem.serializer;
        if (metricsBatchProcessor != null) {
            metricsBatchProcessor.read(j, j3, this.PlaybackStateCompat);
        }
        boolean z = metric4 > j2;
        long metric5 = frameMetrics.getMetric(8);
        long metric6 = frameMetrics.getMetric(12);
        long metric7 = frameMetrics.getMetric(7);
        long metric8 = frameMetrics.getMetric(13);
        setNativeAntiAlias setnativeantialias = this.ParcelableVolumeInfo;
        setnativeantialias.IconCompatParcelizer = j;
        setnativeantialias.serializer = metric4;
        setnativeantialias.RemoteActionCompatParcelizer = z;
        setnativeantialias.write = metric7 + (metric5 - metric6);
        setnativeantialias.RatingCompat = metric5;
        setnativeantialias.MediaDescriptionCompat = metric5 - metric8;
        return setnativeantialias;
    }
}
