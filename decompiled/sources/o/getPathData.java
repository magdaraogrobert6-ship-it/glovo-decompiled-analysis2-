package o;

import com.deliveryhero.perseus.di.HitsModule;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class getPathData extends ContinuationImpl {
    public int IconCompatParcelizer;
    public final /* synthetic */ HitsModule RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getPathData(HitsModule hitsModule, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = hitsModule;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.read = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        return this.RemoteActionCompatParcelizer.perseusWorkFinishedCallback(this);
    }
}
