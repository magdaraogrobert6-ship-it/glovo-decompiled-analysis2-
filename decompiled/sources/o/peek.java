package o;

import com.deliveryhero.perseus.data.local.SharedPreferenceToDataStoreBridge;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class peek extends ContinuationImpl {
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ SharedPreferenceToDataStoreBridge read;
    public int serializer;
    public String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public peek(SharedPreferenceToDataStoreBridge sharedPreferenceToDataStoreBridge, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = sharedPreferenceToDataStoreBridge;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        return this.read.getString(null, this);
    }
}
