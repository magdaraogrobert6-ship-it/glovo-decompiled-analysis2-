package o;

import com.deliveryhero.selfServiceChat.data.repository.ChatRepositoryImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class PathData extends ContinuationImpl {
    public int IconCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ ChatRepositoryImpl serializer;
    public createInAppMessageEventSubscriber write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathData(ChatRepositoryImpl chatRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = chatRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.read = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        return this.serializer.fetchHelpCenterRegion(this);
    }
}
