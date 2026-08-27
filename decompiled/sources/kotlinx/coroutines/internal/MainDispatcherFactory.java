package kotlinx.coroutines.internal;

import java.util.List;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: loaded from: classes4.dex */
public interface MainDispatcherFactory {

    public static final class DefaultImpls {
    }

    MainCoroutineDispatcher createDispatcher(List list);

    int getLoadPriority();
}
