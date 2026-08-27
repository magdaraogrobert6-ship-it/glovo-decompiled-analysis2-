package o;

import io.sentry.metrics.MetricsBatchProcessor;

/* JADX INFO: loaded from: classes4.dex */
public final class convertActionToIndirectPointerEventType implements IndirectPointerEvent {
    public final MetricsBatchProcessor serializer;

    public convertActionToIndirectPointerEventType(MetricsBatchProcessor metricsBatchProcessor) {
        this.serializer = metricsBatchProcessor;
    }
}
