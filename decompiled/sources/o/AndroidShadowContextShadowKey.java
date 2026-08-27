package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidShadowContextShadowKey extends ContinuationImpl {
    public com.deliveryhero.customerchat.service.ChatService IconCompatParcelizer;
    public final /* synthetic */ com.deliveryhero.customerchat.service.ChatService RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidShadowContextShadowKey(com.deliveryhero.customerchat.service.ChatService chatService, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = chatService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.read = obj;
        this.serializer |= Integer.MIN_VALUE;
        return com.deliveryhero.customerchat.service.ChatService.access$getHelpcenterRegionConfig(this.RemoteActionCompatParcelizer, null, this);
    }
}
