package o;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class performHapticFeedbackCdsT49E implements accessgetPositiveInfinitycp {
    private static int read = 1;
    private static int serializer;
    public final androidx.coordinatorlayout.widget.CoordinatorLayout IconCompatParcelizer;
    public final DrawerLayout RemoteActionCompatParcelizer;
    public final DrawerLayout write;

    @Override // o.accessgetPositiveInfinitycp
    public final View getRoot() {
        int i = 2 % 2;
        int i2 = serializer + 15;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        DrawerLayout drawerLayout = this.write;
        int i5 = i3 + 35;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return drawerLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public performHapticFeedbackCdsT49E(DrawerLayout drawerLayout, androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, DrawerLayout drawerLayout2) {
        this.write = drawerLayout;
        this.IconCompatParcelizer = coordinatorLayout;
        this.RemoteActionCompatParcelizer = drawerLayout2;
    }
}
