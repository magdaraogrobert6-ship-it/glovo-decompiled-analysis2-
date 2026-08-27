package o;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public class FocusRestorerElement extends coil3.util.ContextsKt {
    public final Window RemoteActionCompatParcelizer;
    public final WindowInsetsController read;

    @Override // coil3.util.ContextsKt
    public boolean RemoteActionCompatParcelizer() {
        Window window = this.RemoteActionCompatParcelizer;
        if (window == null) {
            this.read.setSystemBarsAppearance(0, 0);
            if ((this.read.getSystemBarsAppearance() & 8) != 0) {
                return true;
            }
        } else if ((window.getDecorView().getSystemUiVisibility() & 8192) != 0) {
            return true;
        }
        return false;
    }

    @Override // coil3.util.ContextsKt
    public void read(boolean z) {
        read(16, 16, z);
    }

    public FocusRestorerElement(Window window, FocusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0 focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0) {
        this.read = window.getInsetsController();
        this.RemoteActionCompatParcelizer = window;
    }

    @Override // coil3.util.ContextsKt
    public void write(boolean z) {
        read(8192, 8, z);
    }

    public final void read(int i, int i2, boolean z) {
        Window window = this.RemoteActionCompatParcelizer;
        if (window == null) {
            WindowInsetsController windowInsetsController = this.read;
            if (z) {
                windowInsetsController.setSystemBarsAppearance(i2, i2);
                return;
            } else {
                windowInsetsController.setSystemBarsAppearance(0, i2);
                return;
            }
        }
        if (z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility((~i) & decorView2.getSystemUiVisibility());
        }
    }
}
