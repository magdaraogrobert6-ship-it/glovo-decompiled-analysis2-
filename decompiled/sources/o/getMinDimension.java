package o;

import android.view.View;
import android.view.WindowInsets;
import androidx.drawerlayout.widget.DrawerLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class getMinDimension implements View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        DrawerLayout drawerLayout = (DrawerLayout) view;
        boolean z = windowInsets.getSystemWindowInsetTop() > 0;
        drawerLayout.ParcelableVolumeInfo = windowInsets;
        drawerLayout.MediaSessionCompatQueueItem = z;
        drawerLayout.setWillNotDraw(!z && drawerLayout.getBackground() == null);
        drawerLayout.requestLayout();
        return windowInsets.consumeSystemWindowInsets();
    }
}
