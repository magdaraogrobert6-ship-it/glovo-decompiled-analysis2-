package o;

import com.deliveryhero.selfServiceChat.data.chat.url.ChatUrlProviderImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class VectorComposeKtPath27 extends ContinuationImpl {
    public ChatUrlProviderImpl IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ ChatUrlProviderImpl read;
    public int serializer;
    public Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorComposeKtPath27(ChatUrlProviderImpl chatUrlProviderImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = chatUrlProviderImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        return this.read.fetchChatUrl(this);
    }
}
