package o;

import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class G implements accessgetPositiveInfinitycp {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final FrameLayout read;
    public final FrameLayout serializer;

    @Override // o.accessgetPositiveInfinitycp
    public final View getRoot() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 99;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        FrameLayout frameLayout = this.serializer;
        int i5 = i3 + 1;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return frameLayout;
    }

    public G(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.serializer = frameLayout;
        this.read = frameLayout2;
    }
}
