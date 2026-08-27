package bo.app;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class q6 extends ContinuationImpl {
    public Object a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ w6 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(w6 w6Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = w6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
