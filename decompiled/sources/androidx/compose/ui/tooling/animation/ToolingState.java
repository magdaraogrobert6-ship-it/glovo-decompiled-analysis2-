package androidx.compose.ui.tooling.animation;

import androidx.compose.runtime.CompositionKt;
import o.PopulateViewStructure_androidKtpopulate7;
import o.onViewAttachedToWindow;

/* JADX INFO: loaded from: classes.dex */
public final class ToolingState<T> implements onViewAttachedToWindow {
    public static final int $stable = 0;
    private final PopulateViewStructure_androidKtpopulate7 value$delegate;

    @Override // o.onViewAttachedToWindow
    public T getValue() {
        return (T) this.value$delegate.getValue();
    }

    public void setValue(T t) {
        this.value$delegate.setValue(t);
    }

    public ToolingState(T t) {
        this.value$delegate = CompositionKt.RemoteActionCompatParcelizer(t);
    }
}
