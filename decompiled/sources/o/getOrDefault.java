package o;

import com.deliveryhero.selfServiceChat.data.chat.url.datastore.ChatIdCacheHelper;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class getOrDefault extends ContinuationImpl {
    public String IconCompatParcelizer;
    public /* synthetic */ Object MediaDescriptionCompat;
    public final /* synthetic */ ChatIdCacheHelper RatingCompat;
    public int RemoteActionCompatParcelizer;
    public String read;
    public ChatIdCacheHelper serializer;
    public MutexImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getOrDefault(ChatIdCacheHelper chatIdCacheHelper, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RatingCompat = chatIdCacheHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.MediaDescriptionCompat = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return this.RatingCompat.put(null, null, this);
    }
}
