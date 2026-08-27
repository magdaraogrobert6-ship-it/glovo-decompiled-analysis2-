package o;

import com.deliveryhero.selfServiceChat.data.HelpcenterRemoteDataSourceImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class getX3 extends ContinuationImpl {
    public /* synthetic */ Object read;
    public final /* synthetic */ HelpcenterRemoteDataSourceImpl serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getX3(HelpcenterRemoteDataSourceImpl helpcenterRemoteDataSourceImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = helpcenterRemoteDataSourceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.read = obj;
        this.write |= Integer.MIN_VALUE;
        return this.serializer.getUnreadCount(this);
    }
}
