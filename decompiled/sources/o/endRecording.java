package o;

import curtains.internal.RootViewsSpy$Companion$install$1$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class endRecording extends ContinuationImpl {
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ com.deliveryhero.contract.datastore.ChatConfigurationDataStoreHelperImpl read;
    public int serializer;
    public RootViewsSpy$Companion$install$1$1 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public endRecording(com.deliveryhero.contract.datastore.ChatConfigurationDataStoreHelperImpl chatConfigurationDataStoreHelperImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = chatConfigurationDataStoreHelperImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.IconCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        return this.read.updateChatConfigurationToDataStore(null, null, this);
    }
}
