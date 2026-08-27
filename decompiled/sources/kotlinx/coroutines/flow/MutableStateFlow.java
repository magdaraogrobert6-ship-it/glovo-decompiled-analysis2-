package kotlinx.coroutines.flow;

/* JADX INFO: loaded from: classes4.dex */
public interface MutableStateFlow<T> extends StateFlow<T>, MutableSharedFlow<T> {
    void IconCompatParcelizer(Object obj);

    boolean RemoteActionCompatParcelizer(Object obj, Object obj2);

    @Override // kotlinx.coroutines.flow.StateFlow
    Object read();
}
