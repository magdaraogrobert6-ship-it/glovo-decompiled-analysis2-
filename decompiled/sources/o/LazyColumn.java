package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class LazyColumn extends ContinuationImpl {
    public final /* synthetic */ androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public long serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyColumn(androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = androidEdgeEffectOverscrollEffect;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.read = obj;
        this.write |= Integer.MIN_VALUE;
        return this.RemoteActionCompatParcelizer.m13applyToFlingBMRW4eQ(0L, null, this);
    }
}
