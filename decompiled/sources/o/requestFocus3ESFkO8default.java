package o;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class requestFocus3ESFkO8default implements View.OnApplyWindowInsetsListener {
    public FocusRequesterModifierKt IconCompatParcelizer = null;
    public final /* synthetic */ View read;
    public final /* synthetic */ FocusPropertiesImpl write;

    public requestFocus3ESFkO8default(View view, FocusPropertiesImpl focusPropertiesImpl) {
        this.read = view;
        this.write = focusPropertiesImpl;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        FocusRequesterModifierKt focusRequesterModifierKtWrite = FocusRequesterModifierKt.write(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        FocusPropertiesImpl focusPropertiesImpl = this.write;
        if (i < 30) {
            accessgetCancelcp.serializer(windowInsets, this.read);
            if (focusRequesterModifierKtWrite.equals(this.IconCompatParcelizer)) {
                return focusPropertiesImpl.onApplyWindowInsets(view, focusRequesterModifierKtWrite).IconCompatParcelizer();
            }
        }
        this.IconCompatParcelizer = focusRequesterModifierKtWrite;
        FocusRequesterModifierKt focusRequesterModifierKtOnApplyWindowInsets = focusPropertiesImpl.onApplyWindowInsets(view, focusRequesterModifierKtWrite);
        if (i >= 30) {
            return focusRequesterModifierKtOnApplyWindowInsets.IconCompatParcelizer();
        }
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        view.requestApplyInsets();
        return focusRequesterModifierKtOnApplyWindowInsets.IconCompatParcelizer();
    }
}
