package o;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;

/* JADX INFO: loaded from: classes4.dex */
public final class createAnimationListener extends ContinuationImpl {
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;
    public Iterator write;

    public createAnimationListener(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        return JobKt.joinAll(null, this);
    }
}
