package o;

import io.sentry.metrics.MetricsBatchProcessor;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class CalculateMatrixToWindowApi29 implements getPlacementScope {
    public final /* synthetic */ int write;
    public static final /* synthetic */ CalculateMatrixToWindowApi29 RemoteActionCompatParcelizer = new CalculateMatrixToWindowApi29(0);
    public static final /* synthetic */ CalculateMatrixToWindowApi29 IconCompatParcelizer = new CalculateMatrixToWindowApi29(1);

    public /* synthetic */ CalculateMatrixToWindowApi29(int i) {
        this.write = i;
    }

    @Override // o.getPlacementScope
    public final Object create(MetricsBatchProcessor metricsBatchProcessor) {
        return this.write != 0 ? new preConcattUYjHk((accessgetInterceptor) metricsBatchProcessor.read(accessgetInterceptor.class), (AndroidViewConfiguration) metricsBatchProcessor.read(AndroidViewConfiguration.class)) : new accessgetInterceptor((AndroidUriHandler) metricsBatchProcessor.read(AndroidUriHandler.class));
    }
}
