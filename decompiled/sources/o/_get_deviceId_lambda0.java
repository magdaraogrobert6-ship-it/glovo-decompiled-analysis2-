package o;

import io.socket.parser.IOParser$Decoder;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.rx2.RxConvertKt$asSingle$1;

/* JADX INFO: loaded from: classes3.dex */
public final class _get_deviceId_lambda0 {
    public final getContentViewGroupParentLayout IconCompatParcelizer;
    public final StateFlow RemoteActionCompatParcelizer;
    public final getQueryContext read;
    public final MutableStateFlow serializer;
    public final IOParser$Decoder write;

    public _get_deviceId_lambda0(getQueryContext getquerycontext, getContentViewGroupParentLayout getcontentviewgroupparentlayout, IOParser$Decoder iOParser$Decoder) {
        getquerycontext.getClass();
        getcontentviewgroupparentlayout.getClass();
        iOParser$Decoder.getClass();
        this.read = getquerycontext;
        this.IconCompatParcelizer = getcontentviewgroupparentlayout;
        this.write = iOParser$Decoder;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(_set_registeredPushToken_lambda0.RemoteActionCompatParcelizer);
        this.serializer = mutableStateFlow;
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new RxConvertKt$asSingle$1(this, null, 5), 3);
    }
}
