package kotlinx.coroutines.flow;

import o.ShortNewsContentCardView;

/* JADX INFO: loaded from: classes4.dex */
public final class ThrowingCollector implements FlowCollector<Object> {
    public final Throwable read;

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) throws Throwable {
        throw this.read;
    }

    public ThrowingCollector(Throwable th) {
        this.read = th;
    }
}
