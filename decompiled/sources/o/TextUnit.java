package o;

import com.roadrunner.delivery.pickupdropoff.tasks.analytics.DeliveryConfirmationLoggerImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.GetDeliveryAnalyticsUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.ObserveTaskByTypeAndIdUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.UpdateTaskUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.TakePictureTaskUiModelImpl;
import com.roadrunner.rider.safety.report.domain.MapSafetyReportResponse;
import io.sentry.metrics.MetricsBatchProcessor;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class TextUnit {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final MetricsBatchProcessor serializer;

    public TextUnit(MetricsBatchProcessor metricsBatchProcessor) {
        this.serializer = metricsBatchProcessor;
    }

    public final TakePictureTaskUiModelImpl read(fastFilterNotNull fastfilternotnull, ContextScope contextScope, String str) {
        int i = 2 % 2;
        MetricsBatchProcessor metricsBatchProcessor = this.serializer;
        TakePictureTaskUiModelImpl takePictureTaskUiModelImpl = new TakePictureTaskUiModelImpl(fastfilternotnull, contextScope, str, (ObserveTaskByTypeAndIdUseCaseImpl) ((mergeJsonObjects) metricsBatchProcessor.RemoteActionCompatParcelizer).write(), (UpdateTaskUseCaseImpl) ((mergeJsonObjects) metricsBatchProcessor.serializer).write(), (millisToNanos) ((mergeJsonObjects) metricsBatchProcessor.write).write(), (MapSafetyReportResponse) ((SingleProcessDataStore) metricsBatchProcessor.read).write(), (GetDeliveryAnalyticsUseCaseImpl) ((mergeJsonObjects) metricsBatchProcessor.MediaSessionCompatQueueItem).write(), new getQueryContext(), (DeliveryConfirmationLoggerImpl) ((mergeJsonObjects) metricsBatchProcessor.IconCompatParcelizer).write());
        int i2 = IconCompatParcelizer + 59;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 82 / 0;
        }
        return takePictureTaskUiModelImpl;
    }
}
