package o;

import com.roadrunner.delivery.ontheway.crowdsourcing.floating.presentation.CrowdSourcingFloatingImageButtonUiModelImpl;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes3.dex */
public final class getUnspecifiedPjHm6EE implements FlowCollector {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ CrowdSourcingFloatingImageButtonUiModelImpl write;

    public /* synthetic */ getUnspecifiedPjHm6EE(CrowdSourcingFloatingImageButtonUiModelImpl crowdSourcingFloatingImageButtonUiModelImpl, int i) {
        this.IconCompatParcelizer = i;
        this.write = crowdSourcingFloatingImageButtonUiModelImpl;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        Object obj2;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 97;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj3 = null;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        CrowdSourcingFloatingImageButtonUiModelImpl crowdSourcingFloatingImageButtonUiModelImpl = this.write;
        if (i3 != 0) {
            float fFloatValue = ((Number) obj).floatValue();
            MutableStateFlow mutableStateFlow = crowdSourcingFloatingImageButtonUiModelImpl.RemoteActionCompatParcelizer;
            float fMax = Math.max(0.0f, fFloatValue);
            mutableStateFlow.IconCompatParcelizer(new Float(fMax <= 0.4f ? 1.0f + (RangesKt.write((0.4f - fMax) / 0.4f, 0.0f, 1.0f) * 0.26999998f) : 1.0f));
            return createfromparcel2;
        }
        Object obj4 = ((onItemDismiss) obj).IconCompatParcelizer;
        MutableStateFlow mutableStateFlow2 = crowdSourcingFloatingImageButtonUiModelImpl.write;
        if (!(obj4 instanceof isItemDismissable)) {
            int i4 = serializer + 13;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                crowdSourcingFloatingImageButtonUiModelImpl.MediaSessionCompatQueueItem.read(getUnspecifiedeUduSuo.BACKEND_SUCCESS);
                UpdateStateUseCaseImpl.write(crowdSourcingFloatingImageButtonUiModelImpl.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
                disposeDelegate disposedelegate = disposeDelegate.read;
                obj3.hashCode();
                throw null;
            }
            crowdSourcingFloatingImageButtonUiModelImpl.MediaSessionCompatQueueItem.read(getUnspecifiedeUduSuo.BACKEND_SUCCESS);
            UpdateStateUseCaseImpl.write(crowdSourcingFloatingImageButtonUiModelImpl.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
            obj2 = disposeDelegate.read;
        } else {
            obj2 = getAmount.write;
        }
        mutableStateFlow2.IconCompatParcelizer(obj2);
        return createfromparcel2;
    }
}
