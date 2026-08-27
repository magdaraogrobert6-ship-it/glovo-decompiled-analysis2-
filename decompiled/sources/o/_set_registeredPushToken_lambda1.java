package o;

import io.socket.parser.IOParser$Decoder;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.rx2.RxConvertKt$asSingle$1;

/* JADX INFO: loaded from: classes3.dex */
public final class _set_registeredPushToken_lambda1 extends androidx.lifecycle.ViewModel {
    public final StateFlow IconCompatParcelizer;
    public final MutableStateFlow serializer;
    public final IOParser$Decoder write;

    public _set_registeredPushToken_lambda1(IOParser$Decoder iOParser$Decoder) {
        iOParser$Decoder.getClass();
        this.write = iOParser$Decoder;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(_set_registeredPushToken_lambda0.RemoteActionCompatParcelizer);
        this.serializer = mutableStateFlow;
        this.IconCompatParcelizer = mutableStateFlow;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new RxConvertKt$asSingle$1(this, null, 6), 3);
    }
}
