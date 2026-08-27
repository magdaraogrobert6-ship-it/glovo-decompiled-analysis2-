package bo.app;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.createInAppMessageEventSubscriber;
import o.getContentViewGroupParentLayout;
import o.onBackCancelledlambda3;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class p6 extends ContinuationImpl {
    public getContentViewGroupParentLayout a;
    public onBackCancelledlambda3 b;
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM c;
    public createInAppMessageEventSubscriber d;
    public createInAppMessageEventSubscriber e;
    public /* synthetic */ Object f;
    public final /* synthetic */ w6 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(w6 w6Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g = w6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(null, null, null, this);
    }
}
