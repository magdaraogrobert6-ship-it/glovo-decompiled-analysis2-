package o;

import com.roadrunner.delivery.pickupdropoff.tasks.analytics.DeliveryConfirmationLoggerImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.CashPaymentTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.GetDeliveryAnalyticsUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.ObserveTaskByTypeAndIdUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.UpdateTaskUseCaseImpl;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;
import io.grpc.CallOptions$Builder;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaVHSID8XYAK9qohA91T4_vt60qNY {
    private static int read = 0;
    private static int serializer = 1;
    public final CallOptions$Builder write;

    public r8lambdaVHSID8XYAK9qohA91T4_vt60qNY(CallOptions$Builder callOptions$Builder) {
        this.write = callOptions$Builder;
    }

    public final CashPaymentTaskUiModelImpl IconCompatParcelizer(fastFilterNotNull fastfilternotnull, ContextScope contextScope, String str) {
        int i = 2 % 2;
        CallOptions$Builder callOptions$Builder = this.write;
        CashPaymentTaskUiModelImpl cashPaymentTaskUiModelImpl = new CashPaymentTaskUiModelImpl(fastfilternotnull, contextScope, str, (ObserveTaskByTypeAndIdUseCaseImpl) ((mergeJsonObjects) callOptions$Builder.serializer).write(), (UpdateTaskUseCaseImpl) ((mergeJsonObjects) callOptions$Builder.RemoteActionCompatParcelizer).write(), (UpdateStateUseCaseImpl) ((mergeJsonObjects) callOptions$Builder.read).write(), (openSessionlambda1) ((mergeJsonObjects) callOptions$Builder.write).write(), (DeliveryConfirmationLoggerImpl) ((mergeJsonObjects) callOptions$Builder.MediaMetadataCompat).write(), (parseAnimatedVisibility) ((getIterationDuration) callOptions$Builder.RatingCompat).write(), (GetDeliveryAnalyticsUseCaseImpl) ((mergeJsonObjects) callOptions$Builder.IconCompatParcelizer).write(), (getTransition) ((mergeJsonObjects) callOptions$Builder.MediaSessionCompatQueueItem).write(), new getQueryContext());
        int i2 = serializer + 45;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return cashPaymentTaskUiModelImpl;
    }
}
