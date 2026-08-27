package o;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class FocusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0 {
    public final coil3.memory.MemoryCacheService RemoteActionCompatParcelizer;

    public FocusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            this.RemoteActionCompatParcelizer = new coil3.memory.MemoryCacheService(view);
            return;
        }
        applyFocusProperties applyfocusproperties = new applyFocusProperties(view);
        applyfocusproperties.serializer = view;
        this.RemoteActionCompatParcelizer = applyfocusproperties;
    }
}
