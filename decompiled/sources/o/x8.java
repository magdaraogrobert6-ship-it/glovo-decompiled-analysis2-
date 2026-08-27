package o;

import androidx.work.CoroutineWorker$startWork$1;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.roadrunner.opportunities.map.ShiftZoneMapLayerUiModelImpl$1;
import io.grpc.CallOptions$Builder;
import io.grpc.internal.CallTracer;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class x8 implements ec {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaSessionCompatQueueItem;
    public final /* synthetic */ int IconCompatParcelizer = 0;
    public final Object RemoteActionCompatParcelizer;
    public final StateFlow read;
    public final Object serializer;
    public final MutableStateFlow write;

    public x8(CallTracer callTracer, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        callTracer.getClass();
        getcontentviewgroupparentlayout.getClass();
        this.serializer = callTracer;
        this.RemoteActionCompatParcelizer = getcontentviewgroupparentlayout;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new f9(instance_delegatelambda0.write));
        this.write = mutableStateFlow;
        this.read = mutableStateFlow;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new ShiftZoneMapLayerUiModelImpl$1(this, null, 5), 3);
    }

    @Override // o.ec
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem;
        int i3 = i2 + 55;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.IconCompatParcelizer;
        if (i5 == 0) {
            return (MutableStateFlow) this.read;
        }
        if (i5 == 1) {
            return this.read;
        }
        MutableStateFlow mutableStateFlow = (MutableStateFlow) this.read;
        int i6 = i2 + 73;
        MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return mutableStateFlow;
    }

    public x8(CallOptions$Builder callOptions$Builder, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        callOptions$Builder.getClass();
        getcontentviewgroupparentlayout.getClass();
        this.serializer = callOptions$Builder;
        this.RemoteActionCompatParcelizer = getcontentviewgroupparentlayout;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new f9(instance_delegatelambda0.write));
        this.write = mutableStateFlow;
        this.read = mutableStateFlow;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new ShiftZoneMapLayerUiModelImpl$1(this, null, 0), 3);
    }

    public x8(VerticalPaddings verticalPaddings, ProtobufEncoder protobufEncoder, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        getcontentviewgroupparentlayout.getClass();
        this.serializer = verticalPaddings;
        this.RemoteActionCompatParcelizer = protobufEncoder;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new f9(instance_delegatelambda0.write));
        this.write = mutableStateFlow;
        this.read = mutableStateFlow;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new CoroutineWorker$startWork$1(this, null, 25), 3);
    }
}
