package o;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class getFocusRequesterNodesui {
    public static void IconCompatParcelizer(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }

    public static WindowInsets RemoteActionCompatParcelizer(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static CharSequence read(View view) {
        return view.getStateDescription();
    }
}
