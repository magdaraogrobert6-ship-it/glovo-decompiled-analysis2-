package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class getLinesr_lszbg extends ContinuationImpl {
    public final /* synthetic */ coil3.intercept.RealInterceptorChain IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public coil3.intercept.EngineInterceptor read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getLinesr_lszbg(coil3.intercept.RealInterceptorChain realInterceptorChain, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = realInterceptorChain;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        return this.IconCompatParcelizer.proceed(this);
    }
}
