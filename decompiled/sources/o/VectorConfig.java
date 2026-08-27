package o;

import com.deliveryhero.selfServiceChat.data.chat.url.datastore.ChatIdCacheHelper;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class VectorConfig extends ContinuationImpl {
    public MutexImpl IconCompatParcelizer;
    public final /* synthetic */ ChatIdCacheHelper RatingCompat;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public String read;
    public int serializer;
    public ChatIdCacheHelper write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorConfig(ChatIdCacheHelper chatIdCacheHelper, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RatingCompat = chatIdCacheHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        return this.RatingCompat.get(null, this);
    }
}
