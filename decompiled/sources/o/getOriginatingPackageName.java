package o;

import io.grpc.internal.SharedResourcePool;
import io.sentry.util.network.NetworkBody;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.rx2.RxConvertKt$asSingle$1;

/* JADX INFO: loaded from: classes3.dex */
public final class getOriginatingPackageName extends androidx.lifecycle.ViewModel {
    public final MutableStateFlow IconCompatParcelizer;
    public final NetworkBody RemoteActionCompatParcelizer;
    public final SharedResourcePool read;
    public final MutableStateFlow serializer;
    public final BrazeExternalSyntheticLambda28 write;

    public getOriginatingPackageName(NetworkBody networkBody, BrazeExternalSyntheticLambda28 brazeExternalSyntheticLambda28, SharedResourcePool sharedResourcePool) {
        networkBody.getClass();
        brazeExternalSyntheticLambda28.getClass();
        sharedResourcePool.getClass();
        this.RemoteActionCompatParcelizer = networkBody;
        this.write = brazeExternalSyntheticLambda28;
        this.read = sharedResourcePool;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new StoreInfoUtil("", "", instance_delegatelambda0.write));
        this.serializer = mutableStateFlow;
        this.IconCompatParcelizer = mutableStateFlow;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new RxConvertKt$asSingle$1(this, null, 1), 3);
    }
}
