package o;

import io.sentry.metrics.MetricsBatchProcessor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class findRulerValue implements getPlacementScope {
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ findRulerValue(int i, Object obj) {
        this.serializer = i;
        this.write = obj;
    }

    @Override // o.getPlacementScope
    public final Object create(MetricsBatchProcessor metricsBatchProcessor) {
        return this.write;
    }
}
