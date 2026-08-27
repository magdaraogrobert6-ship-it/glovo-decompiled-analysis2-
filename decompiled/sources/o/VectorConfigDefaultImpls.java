package o;

import com.deliveryhero.selfServiceChat.data.chat.url.datastore.ChatIdCacheHelper;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class VectorConfigDefaultImpls extends ContinuationImpl {
    public final /* synthetic */ ChatIdCacheHelper IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public ChatIdCacheHelper read;
    public MutexImpl serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorConfigDefaultImpls(ChatIdCacheHelper chatIdCacheHelper, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = chatIdCacheHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        return this.IconCompatParcelizer.clear(this);
    }
}
