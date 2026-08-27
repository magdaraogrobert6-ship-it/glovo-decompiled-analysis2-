package kotlinx.coroutines.flow;

import o.ShortNewsContentCardView;

/* JADX INFO: loaded from: classes4.dex */
public interface MutableSharedFlow<T> extends SharedFlow<T>, FlowCollector<T> {
    void IconCompatParcelizer();

    @Override // kotlinx.coroutines.flow.FlowCollector
    Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView);

    StateFlow serializer();

    boolean write(Object obj);
}
