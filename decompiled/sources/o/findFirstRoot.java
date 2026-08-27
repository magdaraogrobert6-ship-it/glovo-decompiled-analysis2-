package o;

import android.view.Window;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes4.dex */
public abstract class findFirstRoot {
    public static void read(Window window) {
        window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
    }
}
