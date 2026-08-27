package o;

import com.deliveryhero.perseus.di.HitsModule;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class getFill extends ContinuationImpl {
    public /* synthetic */ Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ HitsModule serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getFill(HitsModule hitsModule, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = hitsModule;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return this.serializer.getPerseusSaveHitUseCase(this);
    }
}
