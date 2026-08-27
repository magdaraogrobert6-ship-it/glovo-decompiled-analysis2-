package androidx.lifecycle;

import androidx.lifecycle.viewmodel.internal.ViewModelImpl;
import java.io.Closeable;
import java.util.Iterator;
import kotlinx.coroutines.internal.ContextScope;
import o.onItemDismisslambda0;

/* JADX INFO: loaded from: classes.dex */
public abstract class ViewModel {
    private final ViewModelImpl IconCompatParcelizer;

    public void onCleared() {
    }

    public final void addCloseable(String str, AutoCloseable autoCloseable) {
        str.getClass();
        autoCloseable.getClass();
        ViewModelImpl viewModelImpl = this.IconCompatParcelizer;
        if (viewModelImpl != null) {
            viewModelImpl.read(str, autoCloseable);
        }
    }

    public final <T extends AutoCloseable> T getCloseable(String str) {
        T t;
        str.getClass();
        ViewModelImpl viewModelImpl = this.IconCompatParcelizer;
        if (viewModelImpl == null) {
            return null;
        }
        synchronized (viewModelImpl.RemoteActionCompatParcelizer) {
            t = (T) viewModelImpl.write.get(str);
        }
        return t;
    }

    public final void clear$lifecycle_viewmodel() {
        ViewModelImpl viewModelImpl = this.IconCompatParcelizer;
        if (viewModelImpl != null && !viewModelImpl.read) {
            viewModelImpl.read = true;
            synchronized (viewModelImpl.RemoteActionCompatParcelizer) {
                Iterator it = viewModelImpl.write.values().iterator();
                while (it.hasNext()) {
                    ViewModelImpl.write((AutoCloseable) it.next());
                }
                Iterator it2 = viewModelImpl.serializer.iterator();
                while (it2.hasNext()) {
                    ViewModelImpl.write((AutoCloseable) it2.next());
                }
                viewModelImpl.serializer.clear();
            }
        }
        onCleared();
    }

    public ViewModel() {
        this.IconCompatParcelizer = new ViewModelImpl();
    }

    public ViewModel(ContextScope contextScope) {
        this.IconCompatParcelizer = new ViewModelImpl(contextScope);
    }

    public void addCloseable(AutoCloseable autoCloseable) {
        autoCloseable.getClass();
        ViewModelImpl viewModelImpl = this.IconCompatParcelizer;
        if (viewModelImpl != null) {
            viewModelImpl.IconCompatParcelizer(autoCloseable);
        }
    }

    @onItemDismisslambda0
    public /* synthetic */ void addCloseable(Closeable closeable) {
        closeable.getClass();
        ViewModelImpl viewModelImpl = this.IconCompatParcelizer;
        if (viewModelImpl != null) {
            viewModelImpl.IconCompatParcelizer(closeable);
        }
    }
}
