package o;

import com.roadrunner.delivery.pickupdropoff.tasks.analytics.DeliveryConfirmationLoggerImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.GetDeliveryAnalyticsUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.ObserveTaskByTypeAndIdUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.UpdateTaskUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.signature.presentation.SignatureTaskUiModelImpl;
import com.sentiance.core.model.events.H$b;
import io.sentry.metrics.MetricsBatchProcessor;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class IntRectE1MhUcY {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final MetricsBatchProcessor read;

    public IntRectE1MhUcY(MetricsBatchProcessor metricsBatchProcessor) {
        this.read = metricsBatchProcessor;
    }

    public final SignatureTaskUiModelImpl IconCompatParcelizer(fastFilterNotNull fastfilternotnull, ContextScope contextScope, String str) {
        int i = 2 % 2;
        str.getClass();
        MetricsBatchProcessor metricsBatchProcessor = this.read;
        Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) metricsBatchProcessor.RemoteActionCompatParcelizer).write();
        objWrite.getClass();
        ObserveTaskByTypeAndIdUseCaseImpl observeTaskByTypeAndIdUseCaseImpl = (ObserveTaskByTypeAndIdUseCaseImpl) objWrite;
        Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) metricsBatchProcessor.serializer).write();
        objWrite2.getClass();
        UpdateTaskUseCaseImpl updateTaskUseCaseImpl = (UpdateTaskUseCaseImpl) objWrite2;
        Object objWrite3 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) metricsBatchProcessor.write).write();
        objWrite3.getClass();
        millisToNanos millistonanos = (millisToNanos) objWrite3;
        H$b h$b = (H$b) ((accessgetTextBottomcp) metricsBatchProcessor.read).write();
        Object objWrite4 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) metricsBatchProcessor.MediaSessionCompatQueueItem).write();
        objWrite4.getClass();
        Object objWrite5 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) metricsBatchProcessor.IconCompatParcelizer).write();
        objWrite5.getClass();
        SignatureTaskUiModelImpl signatureTaskUiModelImpl = new SignatureTaskUiModelImpl(fastfilternotnull, contextScope, str, observeTaskByTypeAndIdUseCaseImpl, updateTaskUseCaseImpl, millistonanos, h$b, (GetDeliveryAnalyticsUseCaseImpl) objWrite4, (DeliveryConfirmationLoggerImpl) objWrite5, new getQueryContext());
        int i2 = RemoteActionCompatParcelizer + 13;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return signatureTaskUiModelImpl;
    }
}
