package o;

import com.roadrunner.delivery.pickupdropoff.tasks.analytics.DeliveryConfirmationLoggerImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.GetDeliveryAnalyticsUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;
import io.grpc.CallOptions$Builder;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class lerpMdfbLM {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final CallOptions$Builder RemoteActionCompatParcelizer;

    public lerpMdfbLM(CallOptions$Builder callOptions$Builder) {
        this.RemoteActionCompatParcelizer = callOptions$Builder;
    }

    public final PickUpDropOffTasksUiModelV2Impl IconCompatParcelizer(fastFilterNotNull fastfilternotnull, ContextScope contextScope) {
        int i = 2 % 2;
        CallOptions$Builder callOptions$Builder = this.RemoteActionCompatParcelizer;
        PickUpDropOffTasksUiModelV2Impl pickUpDropOffTasksUiModelV2Impl = new PickUpDropOffTasksUiModelV2Impl(fastfilternotnull, contextScope, (DeliveryConfirmationLoggerImpl) ((mergeJsonObjects) callOptions$Builder.serializer).write(), (r8lambda3h6Pkf89VgF8wNC8rAZRByrC7KU) ((mergeJsonObjects) callOptions$Builder.RemoteActionCompatParcelizer).write(), (UpdateStateUseCaseImpl) ((mergeJsonObjects) callOptions$Builder.read).write(), (GetDeliveryAnalyticsUseCaseImpl) ((mergeJsonObjects) callOptions$Builder.write).write(), (getAnimatable) ((mergeJsonObjects) callOptions$Builder.MediaMetadataCompat).write(), new getQueryContext(), (interceptFontWeight) ((mergeJsonObjects) callOptions$Builder.RatingCompat).write(), (detach) ((mergeJsonObjects) callOptions$Builder.IconCompatParcelizer).write(), (createAnimation) ((mergeJsonObjects) callOptions$Builder.MediaSessionCompatQueueItem).write());
        int i2 = IconCompatParcelizer + 33;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return pickUpDropOffTasksUiModelV2Impl;
    }
}
