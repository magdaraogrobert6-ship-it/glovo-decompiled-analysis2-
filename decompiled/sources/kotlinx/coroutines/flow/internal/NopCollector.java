package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.flow.FlowCollector;
import o.ShortNewsContentCardView;
import o.createFromParcel;

/* JADX INFO: loaded from: classes4.dex */
public final class NopCollector implements FlowCollector<Object> {
    public static final NopCollector write = new NopCollector();

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        return createFromParcel.INSTANCE;
    }
}
