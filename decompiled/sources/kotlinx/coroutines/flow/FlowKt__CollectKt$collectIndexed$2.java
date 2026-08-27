package kotlinx.coroutines.flow;

import o.ShortNewsContentCardView;

/* JADX INFO: loaded from: classes5.dex */
public final class FlowKt__CollectKt$collectIndexed$2 implements FlowCollector<Object> {
    public int RemoteActionCompatParcelizer;

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = i + 1;
        if (i < 0) {
            throw new ArithmeticException("Index overflow has happened");
        }
        new Integer(i);
        throw null;
    }
}
