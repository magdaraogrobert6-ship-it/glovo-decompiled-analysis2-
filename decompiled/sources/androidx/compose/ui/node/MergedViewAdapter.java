package androidx.compose.ui.node;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes4.dex */
public final class MergedViewAdapter implements ViewAdapter {
    public static final int $stable = 8;
    private final List<ViewAdapter> adapters = new ArrayList();
    private final int id;

    public final List<ViewAdapter> getAdapters() {
        return this.adapters;
    }

    @Override // androidx.compose.ui.node.ViewAdapter
    public int getId() {
        return this.id;
    }

    @Override // androidx.compose.ui.node.ViewAdapter
    public void didInsert(View view, ViewGroup viewGroup) {
        List<ViewAdapter> list = this.adapters;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).didInsert(view, viewGroup);
        }
    }

    @Override // androidx.compose.ui.node.ViewAdapter
    public void didUpdate(View view, ViewGroup viewGroup) {
        List<ViewAdapter> list = this.adapters;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).didUpdate(view, viewGroup);
        }
    }

    @Override // androidx.compose.ui.node.ViewAdapter
    public void willInsert(View view, ViewGroup viewGroup) {
        List<ViewAdapter> list = this.adapters;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).willInsert(view, viewGroup);
        }
    }

    public final <T extends ViewAdapter> T get(int i, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        ViewAdapter viewAdapter;
        List<ViewAdapter> adapters = getAdapters();
        int size = adapters.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                viewAdapter = null;
                break;
            }
            viewAdapter = adapters.get(i2);
            if (viewAdapter.getId() == i) {
                break;
            }
            i2++;
        }
        T t = viewAdapter instanceof ViewAdapter ? (T) viewAdapter : null;
        if (t != null) {
            return t;
        }
        T t2 = (T) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        getAdapters().add(t2);
        return t2;
    }
}
