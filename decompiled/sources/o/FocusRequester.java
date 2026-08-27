package o;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class FocusRequester {
    public static WindowInsets write(View view, WindowInsets windowInsets) {
        int i = requestFocus3ESFkO8.IconCompatParcelizer;
        return view.dispatchApplyWindowInsets(windowInsets);
    }
}
