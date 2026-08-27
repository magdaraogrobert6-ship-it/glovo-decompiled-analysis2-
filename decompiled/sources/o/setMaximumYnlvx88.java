package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class setMaximumYnlvx88 extends ContinuationImpl {
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        return RangesKt.requestAppUpdateInfo(null, this);
    }

    public setMaximumYnlvx88(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
