package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetLayerOutlineProvidercp extends ContinuationImpl {
    public /* synthetic */ Object IconCompatParcelizer;
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM RemoteActionCompatParcelizer;
    public final /* synthetic */ com.deliveryhero.customerchat.CustomerChatModule serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessgetLayerOutlineProvidercp(com.deliveryhero.customerchat.CustomerChatModule customerChatModule, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = customerChatModule;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.IconCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        return this.serializer.m4465sendMessage_XzSiO8(null, null, null, this);
    }
}
