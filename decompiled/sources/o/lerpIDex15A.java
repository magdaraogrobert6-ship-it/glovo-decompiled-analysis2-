package o;

import com.roadrunner.delivery.pickupdropoff.tasks.analytics.DeliveryConfirmationLoggerImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.GetDeliveryAnalyticsUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.ObserveTaskByTypeAndIdUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.UpdateTaskUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.logger.PinValidationEventLoggerImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.presentation.PinValidationTaskUiModelImpl;
import io.grpc.CallOptions$Builder;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class lerpIDex15A {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final CallOptions$Builder write;

    public lerpIDex15A(CallOptions$Builder callOptions$Builder) {
        this.write = callOptions$Builder;
    }

    public final PinValidationTaskUiModelImpl serializer(fastFilterNotNull fastfilternotnull, ContextScope contextScope, String str) {
        int i = 2 % 2;
        str.getClass();
        CallOptions$Builder callOptions$Builder = this.write;
        Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callOptions$Builder.serializer).write();
        objWrite.getClass();
        ObserveTaskByTypeAndIdUseCaseImpl observeTaskByTypeAndIdUseCaseImpl = (ObserveTaskByTypeAndIdUseCaseImpl) objWrite;
        Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callOptions$Builder.RemoteActionCompatParcelizer).write();
        objWrite2.getClass();
        UpdateTaskUseCaseImpl updateTaskUseCaseImpl = (UpdateTaskUseCaseImpl) objWrite2;
        Object objWrite3 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callOptions$Builder.read).write();
        objWrite3.getClass();
        GetDeliveryAnalyticsUseCaseImpl getDeliveryAnalyticsUseCaseImpl = (GetDeliveryAnalyticsUseCaseImpl) objWrite3;
        Object objWrite4 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callOptions$Builder.write).write();
        objWrite4.getClass();
        DeliveryConfirmationLoggerImpl deliveryConfirmationLoggerImpl = (DeliveryConfirmationLoggerImpl) objWrite4;
        Object objWrite5 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callOptions$Builder.MediaMetadataCompat).write();
        objWrite5.getClass();
        isUnspecifiedEaSLcWc isunspecifiedeaslcwc = (isUnspecifiedEaSLcWc) objWrite5;
        Object objWrite6 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callOptions$Builder.RatingCompat).write();
        objWrite6.getClass();
        createAnimation createanimation = (createAnimation) objWrite6;
        Object objWrite7 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callOptions$Builder.IconCompatParcelizer).write();
        objWrite7.getClass();
        PinValidationTaskUiModelImpl pinValidationTaskUiModelImpl = new PinValidationTaskUiModelImpl(fastfilternotnull, contextScope, str, observeTaskByTypeAndIdUseCaseImpl, updateTaskUseCaseImpl, getDeliveryAnalyticsUseCaseImpl, deliveryConfirmationLoggerImpl, isunspecifiedeaslcwc, createanimation, (PinValidationEventLoggerImpl) objWrite7, (setUdmandroid_sdk_base_release) ((getScrollRange) callOptions$Builder.MediaSessionCompatQueueItem).write(), new com.huawei.wisesecurity.ucs_credential.g0());
        int i2 = IconCompatParcelizer + 41;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return pinValidationTaskUiModelImpl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
