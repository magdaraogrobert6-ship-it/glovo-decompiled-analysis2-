package kotlinx.coroutines.flow;

import o.ShortNewsContentCardView;
import o.createFromParcel;

/* JADX INFO: loaded from: classes4.dex */
final class EmptyFlow implements Flow {
    public static final EmptyFlow write = new EmptyFlow();

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        return createFromParcel.INSTANCE;
    }
}
