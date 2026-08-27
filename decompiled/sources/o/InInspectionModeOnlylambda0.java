package o;

import com.roadrunner.delivery.pickupdropoff.tasks.acknowledgement.presentation.AcknowledgementTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.analytics.DeliveryConfirmationLoggerImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.GetDeliveryAnalyticsUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.ObserveTaskByTypeAndIdUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.UpdateTaskUseCaseImpl;
import io.grpc.internal.CallTracer;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class InInspectionModeOnlylambda0 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final CallTracer write;

    public InInspectionModeOnlylambda0(CallTracer callTracer) {
        this.write = callTracer;
    }

    public final AcknowledgementTaskUiModelImpl write(fastFilterNotNull fastfilternotnull, ContextScope contextScope, String str) {
        int i = 2 % 2;
        str.getClass();
        CallTracer callTracer = this.write;
        ObserveTaskByTypeAndIdUseCaseImpl observeTaskByTypeAndIdUseCaseImpl = (ObserveTaskByTypeAndIdUseCaseImpl) ((getIterationDuration) callTracer.RemoteActionCompatParcelizer).write();
        UpdateTaskUseCaseImpl updateTaskUseCaseImpl = (UpdateTaskUseCaseImpl) ((getIterationDuration) callTracer.write).write();
        Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callTracer.serializer).write();
        objWrite.getClass();
        Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callTracer.IconCompatParcelizer).write();
        objWrite2.getClass();
        AcknowledgementTaskUiModelImpl acknowledgementTaskUiModelImpl = new AcknowledgementTaskUiModelImpl(fastfilternotnull, contextScope, str, observeTaskByTypeAndIdUseCaseImpl, updateTaskUseCaseImpl, (GetDeliveryAnalyticsUseCaseImpl) objWrite, (DeliveryConfirmationLoggerImpl) objWrite2);
        int i2 = IconCompatParcelizer + 67;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return acknowledgementTaskUiModelImpl;
    }
}
