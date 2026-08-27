package o;

import com.deliveryhero.selfServiceChat.data.repository.ChatRepositoryImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class getDefaultStrokeLineCap extends ContinuationImpl {
    public final /* synthetic */ ChatRepositoryImpl RemoteActionCompatParcelizer;
    public createInAppMessageEventSubscriber read;
    public int serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getDefaultStrokeLineCap(ChatRepositoryImpl chatRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = chatRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.serializer |= Integer.MIN_VALUE;
        return this.RemoteActionCompatParcelizer.sendMessage(null, this);
    }
}
