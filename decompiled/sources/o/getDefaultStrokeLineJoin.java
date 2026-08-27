package o;

import com.deliveryhero.selfServiceChat.data.chat.url.datastore.ChatUrlDataStoreHelperImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class getDefaultStrokeLineJoin extends ContinuationImpl {
    public long IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public ChatUrlDataStoreHelperImpl read;
    public int serializer;
    public final /* synthetic */ ChatUrlDataStoreHelperImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getDefaultStrokeLineJoin(ChatUrlDataStoreHelperImpl chatUrlDataStoreHelperImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = chatUrlDataStoreHelperImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        return this.write.getCachedChatURLConfig(0L, this);
    }
}
