package o;

import com.roadrunner.delivery.ontheway.crowdsourcing.floating.presentation.CrowdSourcingFloatingImageCameraOnlyUiModelImpl;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes3.dex */
public final class closeConnection implements FlowCollector {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ int read;
    public final /* synthetic */ CrowdSourcingFloatingImageCameraOnlyUiModelImpl write;

    public /* synthetic */ closeConnection(CrowdSourcingFloatingImageCameraOnlyUiModelImpl crowdSourcingFloatingImageCameraOnlyUiModelImpl, int i) {
        this.read = i;
        this.write = crowdSourcingFloatingImageCameraOnlyUiModelImpl;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        CrowdSourcingFloatingImageCameraOnlyUiModelImpl crowdSourcingFloatingImageCameraOnlyUiModelImpl = this.write;
        if (i2 == 0) {
            if (!(((onItemDismiss) obj).IconCompatParcelizer instanceof isItemDismissable)) {
                crowdSourcingFloatingImageCameraOnlyUiModelImpl.MediaBrowserCompatMediaItem.read(getUnspecifiedeUduSuo.BACKEND_SUCCESS);
            }
            int i3 = RemoteActionCompatParcelizer + 27;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return createfromparcel;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        float fFloatValue = ((Number) obj).floatValue();
        MutableStateFlow mutableStateFlow = crowdSourcingFloatingImageCameraOnlyUiModelImpl.RemoteActionCompatParcelizer;
        float fMax = Math.max(0.0f, fFloatValue);
        float fWrite = 1.0f;
        if (fMax <= 0.4f) {
            int i4 = serializer + 11;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            fWrite = i4 % 2 == 0 ? (RangesKt.write((0.4f % fMax) * 0.4f, 1.0f, 2.0f) % 0.26999998f) + 2.0f : (RangesKt.write((0.4f - fMax) / 0.4f, 0.0f, 1.0f) * 0.26999998f) + 1.0f;
            int i5 = RemoteActionCompatParcelizer + 81;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        mutableStateFlow.IconCompatParcelizer(new Float(fWrite));
        return createfromparcel;
    }
}
