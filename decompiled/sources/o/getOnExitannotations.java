package o;

import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class getOnExitannotations extends focusRestorer {
    @Override // o.FocusRestorerElement, coil3.util.ContextsKt
    public final boolean RemoteActionCompatParcelizer() {
        return (this.read.getSystemBarsAppearance() & 8) != 0;
    }

    @Override // o.FocusRestorerElement, coil3.util.ContextsKt
    public final void read(boolean z) {
        this.read.setSystemBarsAppearance(z ? 16 : 0, 16);
    }

    @Override // o.FocusRestorerElement, coil3.util.ContextsKt
    public final void write(boolean z) {
        this.read.setSystemBarsAppearance(z ? 8 : 0, 8);
    }

    public getOnExitannotations(Window window, FocusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0 focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0) {
        super(window, focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0);
    }
}
