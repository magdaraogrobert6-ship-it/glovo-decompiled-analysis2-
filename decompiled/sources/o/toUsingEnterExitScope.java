package o;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes.dex */
public final class toUsingEnterExitScope implements getFunctionDelegate {
    public final ScrollFeedbackProvider read;

    @Override // o.getFunctionDelegate
    public final void RemoteActionCompatParcelizer(int i, int i2, int i3, boolean z) {
        this.read.onScrollLimit(i, i2, i3, z);
    }

    @Override // o.getFunctionDelegate
    public final void write(int i, int i2, int i3, int i4) {
        this.read.onScrollProgress(i, i2, i3, i4);
    }

    public toUsingEnterExitScope(NestedScrollView nestedScrollView) {
        this.read = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }
}
