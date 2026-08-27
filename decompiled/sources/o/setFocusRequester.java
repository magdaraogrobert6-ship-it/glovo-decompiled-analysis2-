package o;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class setFocusRequester extends coil3.util.ContextsKt {
    public final Window RemoteActionCompatParcelizer;

    public final void RemoteActionCompatParcelizer(int i) {
        View decorView = this.RemoteActionCompatParcelizer.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    @Override // coil3.util.ContextsKt
    public final boolean RemoteActionCompatParcelizer() {
        return (this.RemoteActionCompatParcelizer.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }

    public final void write(int i) {
        View decorView = this.RemoteActionCompatParcelizer.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    public setFocusRequester(Window window, FocusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0 focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0) {
        this.RemoteActionCompatParcelizer = window;
    }

    @Override // coil3.util.ContextsKt
    public final void read(boolean z) {
        if (z) {
            Window window = this.RemoteActionCompatParcelizer;
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            RemoteActionCompatParcelizer(16);
            return;
        }
        write(16);
    }

    @Override // coil3.util.ContextsKt
    public final void write(boolean z) {
        if (z) {
            Window window = this.RemoteActionCompatParcelizer;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            RemoteActionCompatParcelizer(8192);
            return;
        }
        write(8192);
    }
}
