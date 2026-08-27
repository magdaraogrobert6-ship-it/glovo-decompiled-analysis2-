package o;

import com.deliveryhero.perseus.di.HitsModule;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class getStroke extends ContinuationImpl {
    public final /* synthetic */ HitsModule IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getStroke(HitsModule hitsModule, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = hitsModule;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        return this.IconCompatParcelizer.getHitsUseCase(this);
    }
}
