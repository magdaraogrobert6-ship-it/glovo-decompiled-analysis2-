package o;

import android.os.Build;
import android.view.View;
import android.view.Window;
import io.sentry.SentryUUID;

/* JADX INFO: loaded from: classes.dex */
public abstract class _init_lambda1 {
    public abstract void write(Window window);

    public void read(addContentView addcontentview, addContentView addcontentview2, Window window, View view, boolean z, boolean z2) {
        coil3.util.ContextsKt focusRestorerElement;
        addcontentview.getClass();
        addcontentview2.getClass();
        window.getClass();
        view.getClass();
        SentryUUID.read(window, false);
        window.setStatusBarColor(z ? addcontentview.IconCompatParcelizer : addcontentview.serializer);
        window.setNavigationBarColor(z2 ? addcontentview2.IconCompatParcelizer : addcontentview2.serializer);
        FocusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0 focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0 = new FocusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            focusRestorerElement = new getOnExitannotations(window, focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0);
        } else {
            focusRestorerElement = i >= 30 ? new FocusRestorerElement(window, focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0) : new setFocusRequester(window, focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0);
        }
        focusRestorerElement.write(!z);
        focusRestorerElement.read(!z2);
    }
}
