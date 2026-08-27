package o;

import com.deliveryhero.selfServiceChat.data.chat.url.ChatUrlProviderImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class VectorComposeKtPath29 extends ContinuationImpl {
    public ChatUrlProviderImpl IconCompatParcelizer;
    public final /* synthetic */ ChatUrlProviderImpl read;
    public /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorComposeKtPath29(ChatUrlProviderImpl chatUrlProviderImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = chatUrlProviderImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.serializer = obj;
        this.write |= Integer.MIN_VALUE;
        return this.read.fetchBaseChatUrl(this);
    }
}
