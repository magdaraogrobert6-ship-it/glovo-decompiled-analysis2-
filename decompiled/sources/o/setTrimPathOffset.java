package o;

import com.deliveryhero.perseus.logger.PerseusLogger;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class setTrimPathOffset extends ContinuationImpl {
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ PerseusLogger read;
    public /* synthetic */ Object serializer;
    public r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setTrimPathOffset(PerseusLogger perseusLogger, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = perseusLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.serializer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return PerseusLogger.access$refreshMetadata(this.read, this);
    }
}
