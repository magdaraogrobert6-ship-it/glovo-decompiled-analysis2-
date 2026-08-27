package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes4.dex */
public final class getViewAccessibilityFlagMap extends ContinuationImpl {
    public int IconCompatParcelizer;
    public /* synthetic */ Object write;

    public getViewAccessibilityFlagMap(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        return DelayKt.awaitCancellation(this);
    }
}
