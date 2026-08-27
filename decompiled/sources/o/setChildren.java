package o;

import com.deliveryhero.perseus.core.session.ClientIdProviderImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class setChildren extends ContinuationImpl {
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ ClientIdProviderImpl read;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setChildren(ClientIdProviderImpl clientIdProviderImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = clientIdProviderImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.serializer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return this.read.warmUpClientId(this);
    }
}
