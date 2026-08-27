package o;

import com.deliveryhero.perseus.core.session.ClientIdProviderImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class getRotate extends ContinuationImpl {
    public int IconCompatParcelizer;
    public final /* synthetic */ ClientIdProviderImpl read;
    public /* synthetic */ Object serializer;
    public String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getRotate(ClientIdProviderImpl clientIdProviderImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = clientIdProviderImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.serializer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        return this.read.getClientId(this);
    }
}
