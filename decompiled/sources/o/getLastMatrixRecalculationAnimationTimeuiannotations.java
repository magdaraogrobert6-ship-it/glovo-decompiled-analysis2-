package o;

import com.google.firebase.perf.v1.GaugeMetric;

/* JADX INFO: loaded from: classes2.dex */
public final class getLastMatrixRecalculationAnimationTimeuiannotations extends handleMotionEvent8iAsVTc {
    public final GaugeMetric serializer;

    @Override // o.handleMotionEvent8iAsVTc
    public final boolean read() {
        GaugeMetric gaugeMetric = this.serializer;
        if (!gaugeMetric.hasSessionId()) {
            return false;
        }
        if (gaugeMetric.getCpuMetricReadingsCount() > 0 || gaugeMetric.getAndroidMemoryReadingsCount() > 0) {
            return true;
        }
        return gaugeMetric.hasGaugeMetadata() && gaugeMetric.getGaugeMetadata().hasMaxAppJavaHeapMemoryKb();
    }

    public getLastMatrixRecalculationAnimationTimeuiannotations(GaugeMetric gaugeMetric) {
        this.serializer = gaugeMetric;
    }
}
