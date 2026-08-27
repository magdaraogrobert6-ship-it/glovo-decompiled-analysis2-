package o;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class setTextAppearance {
    public static OnBackInvokedDispatcher W_(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    public static void IconCompatParcelizer(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }

    public static void RemoteActionCompatParcelizer(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    public static OnBackInvokedCallback X_(Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new getAutoSizeTextAvailableSizes(0, runnable);
    }
}
