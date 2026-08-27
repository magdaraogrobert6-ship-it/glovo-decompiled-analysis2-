package androidx.compose.ui.node;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public interface ViewAdapter {
    void didInsert(View view, ViewGroup viewGroup);

    void didUpdate(View view, ViewGroup viewGroup);

    int getId();

    void willInsert(View view, ViewGroup viewGroup);
}
