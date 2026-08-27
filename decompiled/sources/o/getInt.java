package o;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class getInt implements View.OnApplyWindowInsetsListener {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ int IconCompatParcelizer;

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int i = 2 % 2;
        int i2 = serializer + 63;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this.IconCompatParcelizer == 0) {
            view.getClass();
            windowInsets.getClass();
            WindowInsets windowInsetsConsumeSystemWindowInsets = windowInsets.consumeSystemWindowInsets();
            int i4 = read + 19;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return windowInsetsConsumeSystemWindowInsets;
        }
        view.getClass();
        windowInsets.getClass();
        WindowInsets windowInsetsConsumeSystemWindowInsets2 = windowInsets.consumeSystemWindowInsets();
        int i6 = read + 29;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return windowInsetsConsumeSystemWindowInsets2;
        }
        throw null;
    }
}
