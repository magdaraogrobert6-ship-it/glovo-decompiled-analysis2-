package o;

import com.deliveryhero.perseus.hits.usecase.PerseusSaveHitUseCase;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class getTrimPathOffset extends ContinuationImpl {
    public List IconCompatParcelizer;
    public /* synthetic */ Object MediaDescriptionCompat;
    public final /* synthetic */ PerseusSaveHitUseCase RatingCompat;
    public List RemoteActionCompatParcelizer;
    public Map read;
    public coil3.memory.MemoryCacheService serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getTrimPathOffset(PerseusSaveHitUseCase perseusSaveHitUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RatingCompat = perseusSaveHitUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.MediaDescriptionCompat = obj;
        this.write |= Integer.MIN_VALUE;
        return this.RatingCompat.runWithBatchDispatch(null, null, null, this);
    }
}
