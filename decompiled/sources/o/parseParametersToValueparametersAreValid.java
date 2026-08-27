package o;

import com.roadrunner.delivery.pickupdropoff.tasks.analytics.DeliveryConfirmationLoggerImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.datepicker.presentation.DatePickerTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.GetDeliveryAnalyticsUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.ObserveTaskByTypeAndIdUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.UpdateTaskUseCaseImpl;
import com.roadrunner.domain.util.IsFixableByRetry;
import io.grpc.internal.CallTracer;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class parseParametersToValueparametersAreValid {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final CallTracer serializer;

    public parseParametersToValueparametersAreValid(CallTracer callTracer) {
        callTracer.getClass();
        this.serializer = callTracer;
    }

    public final DatePickerTaskUiModelImpl RemoteActionCompatParcelizer(fastFilterNotNull fastfilternotnull, ContextScope contextScope, String str) {
        int i = 2 % 2;
        str.getClass();
        CallTracer callTracer = this.serializer;
        callTracer.getClass();
        Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callTracer.RemoteActionCompatParcelizer).write();
        objWrite.getClass();
        ObserveTaskByTypeAndIdUseCaseImpl observeTaskByTypeAndIdUseCaseImpl = (ObserveTaskByTypeAndIdUseCaseImpl) objWrite;
        Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callTracer.write).write();
        objWrite2.getClass();
        UpdateTaskUseCaseImpl updateTaskUseCaseImpl = (UpdateTaskUseCaseImpl) objWrite2;
        Object objWrite3 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callTracer.serializer).write();
        objWrite3.getClass();
        Object objWrite4 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callTracer.IconCompatParcelizer).write();
        objWrite4.getClass();
        DatePickerTaskUiModelImpl datePickerTaskUiModelImpl = new DatePickerTaskUiModelImpl(fastfilternotnull, contextScope, str, observeTaskByTypeAndIdUseCaseImpl, updateTaskUseCaseImpl, (GetDeliveryAnalyticsUseCaseImpl) objWrite3, (DeliveryConfirmationLoggerImpl) objWrite4, new stopInstancelambda11(10), new IsFixableByRetry(23), new com.huawei.wisesecurity.ucs_credential.p0(), new getQueryContext());
        int i2 = read + 125;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return datePickerTaskUiModelImpl;
    }
}
